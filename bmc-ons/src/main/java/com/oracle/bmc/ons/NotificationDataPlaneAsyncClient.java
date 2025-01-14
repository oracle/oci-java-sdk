/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ons.requests.*;
import com.oracle.bmc.ons.responses.*;

import java.util.Objects;

/**
 * Async client implementation for NotificationDataPlane service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class NotificationDataPlaneAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements NotificationDataPlaneAsync {
    /** Service instance for NotificationDataPlane. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NOTIFICATIONDATAPLANE")
                    .serviceEndpointPrefix("notification")
                    .serviceEndpointTemplate("https://notification.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NotificationDataPlaneAsyncClient.class);

    NotificationDataPlaneAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
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
                    Builder, NotificationDataPlaneAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ons";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public NotificationDataPlaneAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new NotificationDataPlaneAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeSubscriptionCompartmentResponse>
            changeSubscriptionCompartment(
                    ChangeSubscriptionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSubscriptionCompartmentRequest,
                                    ChangeSubscriptionCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionResponse> createSubscription(
            CreateSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSubscriptionRequest, CreateSubscriptionResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionResponse> deleteSubscription(
            DeleteSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSubscriptionRequest, DeleteSubscriptionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfirmSubscriptionResponse> getConfirmSubscription(
            GetConfirmSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfirmSubscriptionRequest, GetConfirmSubscriptionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionResponse> getSubscription(
            GetSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSubscriptionRequest, GetSubscriptionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUnsubscriptionResponse> getUnsubscription(
            GetUnsubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUnsubscriptionRequest, GetUnsubscriptionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsResponse> listSubscriptions(
            ListSubscriptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSubscriptionsRequest, ListSubscriptionsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PublishMessageResponse> publishMessage(
            PublishMessageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PublishMessageRequest, PublishMessageResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResendSubscriptionConfirmationResponse>
            resendSubscriptionConfirmation(
                    ResendSubscriptionConfirmationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ResendSubscriptionConfirmationRequest,
                                    ResendSubscriptionConfirmationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionResponse> updateSubscription(
            UpdateSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSubscriptionRequest, UpdateSubscriptionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NotificationDataPlaneAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NotificationDataPlaneAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
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
    public NotificationDataPlaneAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
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
    public NotificationDataPlaneAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
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
    public NotificationDataPlaneAsyncClient(
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
                authenticationDetailsProvider);
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
    public NotificationDataPlaneAsyncClient(
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
                authenticationDetailsProvider);
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
    public NotificationDataPlaneAsyncClient(
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
                authenticationDetailsProvider);
    }
}
