/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;

import java.util.Objects;

/**
 * Async client implementation for AnnouncementSubscription service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class AnnouncementSubscriptionAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements AnnouncementSubscriptionAsync {
    /** Service instance for AnnouncementSubscription. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ANNOUNCEMENTSUBSCRIPTION")
                    .serviceEndpointPrefix("announcements")
                    .serviceEndpointTemplate(
                            "https://announcements.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AnnouncementSubscriptionAsyncClient.class);

    private AnnouncementSubscriptionAsyncClient(
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
                    Builder, AnnouncementSubscriptionAsyncClient> {
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
        public AnnouncementSubscriptionAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AnnouncementSubscriptionAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeAnnouncementSubscriptionCompartmentResponse>
            changeAnnouncementSubscriptionCompartment(
                    ChangeAnnouncementSubscriptionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAnnouncementSubscriptionCompartmentRequest,
                                    ChangeAnnouncementSubscriptionCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAnnouncementSubscriptionResponse>
            createAnnouncementSubscription(
                    CreateAnnouncementSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAnnouncementSubscriptionRequest,
                                    CreateAnnouncementSubscriptionResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFilterGroupResponse> createFilterGroup(
            CreateFilterGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFilterGroupRequest, CreateFilterGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnnouncementSubscriptionResponse>
            deleteAnnouncementSubscription(
                    DeleteAnnouncementSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAnnouncementSubscriptionRequest,
                                    DeleteAnnouncementSubscriptionResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFilterGroupResponse> deleteFilterGroup(
            DeleteFilterGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFilterGroupRequest, DeleteFilterGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAnnouncementSubscriptionResponse>
            getAnnouncementSubscription(
                    GetAnnouncementSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAnnouncementSubscriptionRequest,
                                    GetAnnouncementSubscriptionResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAnnouncementSubscriptionsResponse>
            listAnnouncementSubscriptions(
                    ListAnnouncementSubscriptionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAnnouncementSubscriptionsRequest,
                                    ListAnnouncementSubscriptionsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnnouncementSubscriptionResponse>
            updateAnnouncementSubscription(
                    UpdateAnnouncementSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAnnouncementSubscriptionRequest,
                                    UpdateAnnouncementSubscriptionResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFilterGroupResponse> updateFilterGroup(
            UpdateFilterGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFilterGroupRequest, UpdateFilterGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
    public AnnouncementSubscriptionAsyncClient(
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
