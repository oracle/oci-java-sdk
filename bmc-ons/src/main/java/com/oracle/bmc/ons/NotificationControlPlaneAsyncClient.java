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
 * Async client implementation for NotificationControlPlane service. <br>
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
public class NotificationControlPlaneAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements NotificationControlPlaneAsync {
    /** Service instance for NotificationControlPlane. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NOTIFICATIONCONTROLPLANE")
                    .serviceEndpointPrefix("notification")
                    .serviceEndpointTemplate("https://notification.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NotificationControlPlaneAsyncClient.class);

    NotificationControlPlaneAsyncClient(
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
                    Builder, NotificationControlPlaneAsyncClient> {
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
        public NotificationControlPlaneAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new NotificationControlPlaneAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeTopicCompartmentResponse> changeTopicCompartment(
            ChangeTopicCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeTopicCompartmentRequest, ChangeTopicCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getTopicId(), "topicId must not be blank");
        Objects.requireNonNull(
                request.getChangeTopicCompartmentDetails(),
                "changeTopicCompartmentDetails is required");

        return clientCall(request, ChangeTopicCompartmentResponse::builder)
                .logger(LOG, "changeTopicCompartment")
                .serviceDetails(
                        "NotificationControlPlane",
                        "ChangeTopicCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/NotificationTopic/ChangeTopicCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTopicCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("topics")
                .appendPathParam(request.getTopicId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeTopicCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTopicResponse> createTopic(
            CreateTopicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTopicRequest, CreateTopicResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateTopicDetails(), "createTopicDetails is required");

        return clientCall(request, CreateTopicResponse::builder)
                .logger(LOG, "createTopic")
                .serviceDetails(
                        "NotificationControlPlane",
                        "CreateTopic",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/NotificationTopic/CreateTopic")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTopicRequest::builder)
                .basePath("/20181201")
                .appendPathParam("topics")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ons.model.NotificationTopic.class,
                        CreateTopicResponse.Builder::notificationTopic)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTopicResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTopicResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTopicResponse> deleteTopic(
            DeleteTopicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTopicRequest, DeleteTopicResponse>
                    handler) {

        Validate.notBlank(request.getTopicId(), "topicId must not be blank");

        return clientCall(request, DeleteTopicResponse::builder)
                .logger(LOG, "deleteTopic")
                .serviceDetails(
                        "NotificationControlPlane",
                        "DeleteTopic",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/NotificationTopic/DeleteTopic")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTopicRequest::builder)
                .basePath("/20181201")
                .appendPathParam("topics")
                .appendPathParam(request.getTopicId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTopicResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTopicResponse> getTopic(
            GetTopicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTopicRequest, GetTopicResponse>
                    handler) {

        Validate.notBlank(request.getTopicId(), "topicId must not be blank");

        return clientCall(request, GetTopicResponse::builder)
                .logger(LOG, "getTopic")
                .serviceDetails(
                        "NotificationControlPlane",
                        "GetTopic",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/NotificationTopic/GetTopic")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTopicRequest::builder)
                .basePath("/20181201")
                .appendPathParam("topics")
                .appendPathParam(request.getTopicId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ons.model.NotificationTopic.class,
                        GetTopicResponse.Builder::notificationTopic)
                .handleResponseHeaderString(
                        "opc-request-id", GetTopicResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetTopicResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTopicsResponse> listTopics(
            ListTopicsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTopicsRequest, ListTopicsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTopicsResponse::builder)
                .logger(LOG, "listTopics")
                .serviceDetails(
                        "NotificationControlPlane",
                        "ListTopics",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/NotificationTopic/ListTopics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTopicsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("topics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.ons.model.NotificationTopicSummary.class,
                        ListTopicsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListTopicsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListTopicsResponse.Builder::opcPreviousPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListTopicsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTopicResponse> updateTopic(
            UpdateTopicRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTopicRequest, UpdateTopicResponse>
                    handler) {

        Validate.notBlank(request.getTopicId(), "topicId must not be blank");
        Objects.requireNonNull(
                request.getTopicAttributesDetails(), "topicAttributesDetails is required");

        return clientCall(request, UpdateTopicResponse::builder)
                .logger(LOG, "updateTopic")
                .serviceDetails(
                        "NotificationControlPlane",
                        "UpdateTopic",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/NotificationTopic/UpdateTopic")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTopicRequest::builder)
                .basePath("/20181201")
                .appendPathParam("topics")
                .appendPathParam(request.getTopicId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ons.model.NotificationTopic.class,
                        UpdateTopicResponse.Builder::notificationTopic)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTopicResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTopicResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NotificationControlPlaneAsyncClient(
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
    public NotificationControlPlaneAsyncClient(
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
    public NotificationControlPlaneAsyncClient(
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
    public NotificationControlPlaneAsyncClient(
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
    public NotificationControlPlaneAsyncClient(
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
    public NotificationControlPlaneAsyncClient(
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
    public NotificationControlPlaneAsyncClient(
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
