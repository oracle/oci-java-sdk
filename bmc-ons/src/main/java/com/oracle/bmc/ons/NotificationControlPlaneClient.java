/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ons.requests.*;
import com.oracle.bmc.ons.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class NotificationControlPlaneClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements NotificationControlPlane {
    /** Service instance for NotificationControlPlane. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NOTIFICATIONCONTROLPLANE")
                    .serviceEndpointPrefix("notification")
                    .serviceEndpointTemplate("https://notification.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NotificationControlPlaneClient.class);

    private final NotificationControlPlanePaginators paginators;

    NotificationControlPlaneClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new NotificationControlPlanePaginators(this);
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
                    Builder, NotificationControlPlaneClient> {
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
        public NotificationControlPlaneClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new NotificationControlPlaneClient(this, authenticationDetailsProvider);
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
    public ChangeTopicCompartmentResponse changeTopicCompartment(
            ChangeTopicCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public CreateTopicResponse createTopic(CreateTopicRequest request) {
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
                .callSync();
    }

    @Override
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) {

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
                .callSync();
    }

    @Override
    public GetTopicResponse getTopic(GetTopicRequest request) {

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
                .callSync();
    }

    @Override
    public ListTopicsResponse listTopics(ListTopicsRequest request) {
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
                .callSync();
    }

    @Override
    public UpdateTopicResponse updateTopic(UpdateTopicRequest request) {

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
                .callSync();
    }

    @Override
    public NotificationControlPlanePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NotificationControlPlaneClient(
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
    public NotificationControlPlaneClient(
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
    public NotificationControlPlaneClient(
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
    public NotificationControlPlaneClient(
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
    public NotificationControlPlaneClient(
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
    public NotificationControlPlaneClient(
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
    public NotificationControlPlaneClient(
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
