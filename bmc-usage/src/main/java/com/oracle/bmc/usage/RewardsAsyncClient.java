/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.usage.requests.*;
import com.oracle.bmc.usage.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Rewards service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class RewardsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements RewardsAsync {
    /** Service instance for Rewards. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("REWARDS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://identity.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RewardsAsyncClient.class);

    private RewardsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, RewardsAsyncClient> {
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
        public RewardsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RewardsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateRedeemableUserResponse> createRedeemableUser(
            CreateRedeemableUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRedeemableUserRequest, CreateRedeemableUserResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateRedeemableUserDetails(),
                "createRedeemableUserDetails is required");

        Objects.requireNonNull(request.getTenancyId(), "tenancyId is required");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, CreateRedeemableUserResponse::builder)
                .logger(LOG, "createRedeemableUser")
                .serviceDetails(
                        "Rewards",
                        "CreateRedeemableUser",
                        "https://docs.oracle.com/iaas/api/#/en/usage-proxy/20190111/RedeemableUser/CreateRedeemableUser")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRedeemableUserRequest::builder)
                .basePath("/20190111")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("redeemableUsers")
                .appendQueryParam("tenancyId", request.getTenancyId())
                .appendQueryParam("userId", request.getUserId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usage.model.RedeemableUserCollection.class,
                        CreateRedeemableUserResponse.Builder::redeemableUserCollection)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRedeemableUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateRedeemableUserResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRedeemableUserResponse> deleteRedeemableUser(
            DeleteRedeemableUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRedeemableUserRequest, DeleteRedeemableUserResponse>
                    handler) {
        Objects.requireNonNull(request.getEmailId(), "emailId is required");

        Objects.requireNonNull(request.getTenancyId(), "tenancyId is required");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, DeleteRedeemableUserResponse::builder)
                .logger(LOG, "deleteRedeemableUser")
                .serviceDetails(
                        "Rewards",
                        "DeleteRedeemableUser",
                        "https://docs.oracle.com/iaas/api/#/en/usage-proxy/20190111/RedeemableUser/DeleteRedeemableUser")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRedeemableUserRequest::builder)
                .basePath("/20190111")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("redeemableUsers")
                .appendQueryParam("emailId", request.getEmailId())
                .appendQueryParam("tenancyId", request.getTenancyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRedeemableUserResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProductsResponse> listProducts(
            ListProductsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProductsRequest, ListProductsResponse>
                    handler) {
        Objects.requireNonNull(request.getTenancyId(), "tenancyId is required");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(request.getUsagePeriodKey(), "usagePeriodKey is required");

        return clientCall(request, ListProductsResponse::builder)
                .logger(LOG, "listProducts")
                .serviceDetails(
                        "Rewards",
                        "ListProducts",
                        "https://docs.oracle.com/iaas/api/#/en/usage-proxy/20190111/ProductSummary/ListProducts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProductsRequest::builder)
                .basePath("/20190111")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("products")
                .appendQueryParam("tenancyId", request.getTenancyId())
                .appendQueryParam("usagePeriodKey", request.getUsagePeriodKey())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("producttype", request.getProducttype())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usage.model.ProductCollection.class,
                        ListProductsResponse.Builder::productCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProductsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProductsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRedeemableUsersResponse> listRedeemableUsers(
            ListRedeemableUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRedeemableUsersRequest, ListRedeemableUsersResponse>
                    handler) {
        Objects.requireNonNull(request.getTenancyId(), "tenancyId is required");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, ListRedeemableUsersResponse::builder)
                .logger(LOG, "listRedeemableUsers")
                .serviceDetails(
                        "Rewards",
                        "ListRedeemableUsers",
                        "https://docs.oracle.com/iaas/api/#/en/usage-proxy/20190111/RedeemableUserSummary/ListRedeemableUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRedeemableUsersRequest::builder)
                .basePath("/20190111")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("redeemableUsers")
                .appendQueryParam("tenancyId", request.getTenancyId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usage.model.RedeemableUserCollection.class,
                        ListRedeemableUsersResponse.Builder::redeemableUserCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRedeemableUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRedeemableUsersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRedemptionsResponse> listRedemptions(
            ListRedemptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRedemptionsRequest, ListRedemptionsResponse>
                    handler) {
        Objects.requireNonNull(request.getTenancyId(), "tenancyId is required");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, ListRedemptionsResponse::builder)
                .logger(LOG, "listRedemptions")
                .serviceDetails(
                        "Rewards",
                        "ListRedemptions",
                        "https://docs.oracle.com/iaas/api/#/en/usage-proxy/20190111/RedemptionSummary/ListRedemptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRedemptionsRequest::builder)
                .basePath("/20190111")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("redemptions")
                .appendQueryParam("tenancyId", request.getTenancyId())
                .appendQueryParam(
                        "timeRedeemedGreaterThanOrEqualTo",
                        request.getTimeRedeemedGreaterThanOrEqualTo())
                .appendQueryParam("timeRedeemedLessThan", request.getTimeRedeemedLessThan())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usage.model.RedemptionCollection.class,
                        ListRedemptionsResponse.Builder::redemptionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRedemptionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRedemptionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRewardsResponse> listRewards(
            ListRewardsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRewardsRequest, ListRewardsResponse>
                    handler) {
        Objects.requireNonNull(request.getTenancyId(), "tenancyId is required");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, ListRewardsResponse::builder)
                .logger(LOG, "listRewards")
                .serviceDetails(
                        "Rewards",
                        "ListRewards",
                        "https://docs.oracle.com/iaas/api/#/en/usage-proxy/20190111/MonthlyRewardSummary/ListRewards")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRewardsRequest::builder)
                .basePath("/20190111")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("rewards")
                .appendQueryParam("tenancyId", request.getTenancyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usage.model.RewardCollection.class,
                        ListRewardsResponse.Builder::rewardCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRewardsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RewardsAsyncClient(
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
    public RewardsAsyncClient(
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
    public RewardsAsyncClient(
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
    public RewardsAsyncClient(
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
    public RewardsAsyncClient(
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
    public RewardsAsyncClient(
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
    public RewardsAsyncClient(
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
