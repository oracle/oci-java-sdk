/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.queue.requests.*;
import com.oracle.bmc.queue.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class QueueClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Queue {
    /** Service instance for Queue. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("QUEUE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://messaging.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(QueueClient.class);

    private QueueClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, QueueClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public QueueClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new QueueClient(this, authenticationDetailsProvider);
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
    public DeleteMessageResponse deleteMessage(DeleteMessageRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");

        Validate.notBlank(request.getMessageReceipt(), "messageReceipt must not be blank");

        return clientCall(request, DeleteMessageResponse::builder)
                .logger(LOG, "deleteMessage")
                .serviceDetails(
                        "Queue",
                        "DeleteMessage",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/GetMessage/DeleteMessage")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMessageRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .appendPathParam("messages")
                .appendPathParam(request.getMessageReceipt())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMessageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMessagesResponse deleteMessages(DeleteMessagesRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");
        Objects.requireNonNull(
                request.getDeleteMessagesDetails(), "deleteMessagesDetails is required");

        return clientCall(request, DeleteMessagesResponse::builder)
                .logger(LOG, "deleteMessages")
                .serviceDetails(
                        "Queue",
                        "DeleteMessages",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/GetMessage/DeleteMessages")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeleteMessagesRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .appendPathParam("messages")
                .appendPathParam("actions")
                .appendPathParam("deleteMessages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.queue.model.DeleteMessagesResult.class,
                        DeleteMessagesResponse.Builder::deleteMessagesResult)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMessagesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMessagesResponse getMessages(GetMessagesRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");

        return clientCall(request, GetMessagesResponse::builder)
                .logger(LOG, "getMessages")
                .serviceDetails(
                        "Queue",
                        "GetMessages",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/GetMessage/GetMessages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMessagesRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .appendPathParam("messages")
                .appendQueryParam("visibilityInSeconds", request.getVisibilityInSeconds())
                .appendQueryParam("timeoutInSeconds", request.getTimeoutInSeconds())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.queue.model.GetMessages.class,
                        GetMessagesResponse.Builder::getMessages)
                .handleResponseHeaderString(
                        "opc-request-id", GetMessagesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetStatsResponse getStats(GetStatsRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");

        return clientCall(request, GetStatsResponse::builder)
                .logger(LOG, "getStats")
                .serviceDetails(
                        "Queue",
                        "GetStats",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/QueueStats/GetStats")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStatsRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .appendPathParam("stats")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.queue.model.QueueStats.class,
                        GetStatsResponse.Builder::queueStats)
                .handleResponseHeaderString(
                        "opc-request-id", GetStatsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PutMessagesResponse putMessages(PutMessagesRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");
        Objects.requireNonNull(request.getPutMessagesDetails(), "putMessagesDetails is required");

        return clientCall(request, PutMessagesResponse::builder)
                .logger(LOG, "putMessages")
                .serviceDetails(
                        "Queue",
                        "PutMessages",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/PutMessage/PutMessages")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PutMessagesRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .appendPathParam("messages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.queue.model.PutMessages.class,
                        PutMessagesResponse.Builder::putMessages)
                .handleResponseHeaderString(
                        "opc-request-id", PutMessagesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMessageResponse updateMessage(UpdateMessageRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");

        Validate.notBlank(request.getMessageReceipt(), "messageReceipt must not be blank");
        Objects.requireNonNull(
                request.getUpdateMessageDetails(), "updateMessageDetails is required");

        return clientCall(request, UpdateMessageResponse::builder)
                .logger(LOG, "updateMessage")
                .serviceDetails(
                        "Queue",
                        "UpdateMessage",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/UpdatedMessage/UpdateMessage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMessageRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .appendPathParam("messages")
                .appendPathParam(request.getMessageReceipt())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.queue.model.UpdatedMessage.class,
                        UpdateMessageResponse.Builder::updatedMessage)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMessageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMessagesResponse updateMessages(UpdateMessagesRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMessagesDetails(), "updateMessagesDetails is required");

        return clientCall(request, UpdateMessagesResponse::builder)
                .logger(LOG, "updateMessages")
                .serviceDetails(
                        "Queue",
                        "UpdateMessages",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/GetMessage/UpdateMessages")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateMessagesRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .appendPathParam("messages")
                .appendPathParam("actions")
                .appendPathParam("updateMessages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.queue.model.UpdateMessagesResult.class,
                        UpdateMessagesResponse.Builder::updateMessagesResult)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMessagesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QueueClient(
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
    public QueueClient(
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
    public QueueClient(
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
    public QueueClient(
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
    public QueueClient(
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
    public QueueClient(
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
    public QueueClient(
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
