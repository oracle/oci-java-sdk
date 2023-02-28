/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Subscription service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public class SubscriptionAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements SubscriptionAsync {
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

    private SubscriptionAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SubscriptionAsyncClient> {
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
        public SubscriptionAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SubscriptionAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateSubscriptionMappingResponse> createSubscriptionMapping(
            CreateSubscriptionMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSubscriptionMappingRequest, CreateSubscriptionMappingResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionMappingResponse> deleteSubscriptionMapping(
            DeleteSubscriptionMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSubscriptionMappingRequest, DeleteSubscriptionMappingResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAssignedSubscriptionResponse> getAssignedSubscription(
            GetAssignedSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAssignedSubscriptionRequest, GetAssignedSubscriptionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionMappingResponse> getSubscriptionMapping(
            GetSubscriptionMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSubscriptionMappingRequest, GetSubscriptionMappingResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssignedSubscriptionsResponse> listAssignedSubscriptions(
            ListAssignedSubscriptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssignedSubscriptionsRequest, ListAssignedSubscriptionsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableRegionsResponse> listAvailableRegions(
            ListAvailableRegionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAvailableRegionsRequest, ListAvailableRegionsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionMappingsResponse> listSubscriptionMappings(
            ListSubscriptionMappingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSubscriptionMappingsRequest, ListSubscriptionMappingsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsResponse> listSubscriptions(
            ListSubscriptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSubscriptionsRequest, ListSubscriptionsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SubscriptionAsyncClient(
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
    public SubscriptionAsyncClient(
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
    public SubscriptionAsyncClient(
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
    public SubscriptionAsyncClient(
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
    public SubscriptionAsyncClient(
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
    public SubscriptionAsyncClient(
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
    public SubscriptionAsyncClient(
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
