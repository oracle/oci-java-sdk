/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Subscribers service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class SubscribersAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements SubscribersAsync {
    /** Service instance for Subscribers. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(SubscribersClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apigateway.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SubscribersAsyncClient.class);

    SubscribersAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SubscribersAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apigateway";
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
        public SubscribersAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SubscribersAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddSubscriberLockResponse> addSubscriberLock(
            AddSubscriberLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddSubscriberLockRequest, AddSubscriberLockResponse>
                    handler) {

        Validate.notBlank(request.getSubscriberId(), "subscriberId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddSubscriberLockResponse::builder)
                .logger(LOG, "addSubscriberLock")
                .serviceDetails(
                        "Subscribers",
                        "AddSubscriberLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Subscriber/AddSubscriberLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddSubscriberLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("subscribers")
                .appendPathParam(request.getSubscriberId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Subscriber.class,
                        AddSubscriberLockResponse.Builder::subscriber)
                .handleResponseHeaderString(
                        "opc-request-id", AddSubscriberLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddSubscriberLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSubscriberCompartmentResponse>
            changeSubscriberCompartment(
                    ChangeSubscriberCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSubscriberCompartmentRequest,
                                    ChangeSubscriberCompartmentResponse>
                            handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberResponse> createSubscriber(
            CreateSubscriberRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSubscriberRequest, CreateSubscriberResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberResponse> deleteSubscriber(
            DeleteSubscriberRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSubscriberRequest, DeleteSubscriberResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteSubscriberResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSubscriberResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriberResponse> getSubscriber(
            GetSubscriberRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSubscriberRequest, GetSubscriberResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscribersResponse> listSubscribers(
            ListSubscribersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSubscribersRequest, ListSubscribersResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveSubscriberLockResponse> removeSubscriberLock(
            RemoveSubscriberLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveSubscriberLockRequest, RemoveSubscriberLockResponse>
                    handler) {

        Validate.notBlank(request.getSubscriberId(), "subscriberId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveSubscriberLockResponse::builder)
                .logger(LOG, "removeSubscriberLock")
                .serviceDetails(
                        "Subscribers",
                        "RemoveSubscriberLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Subscriber/RemoveSubscriberLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveSubscriberLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("subscribers")
                .appendPathParam(request.getSubscriberId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Subscriber.class,
                        RemoveSubscriberLockResponse.Builder::subscriber)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveSubscriberLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveSubscriberLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberResponse> updateSubscriber(
            UpdateSubscriberRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSubscriberRequest, UpdateSubscriberResponse>
                    handler) {

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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateSubscriberResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSubscriberResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SubscribersAsyncClient(
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
    public SubscribersAsyncClient(
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
    public SubscribersAsyncClient(
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
    public SubscribersAsyncClient(
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
    public SubscribersAsyncClient(
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
    public SubscribersAsyncClient(
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
    public SubscribersAsyncClient(
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
