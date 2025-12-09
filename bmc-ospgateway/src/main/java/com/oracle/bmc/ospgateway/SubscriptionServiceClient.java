/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ospgateway.requests.*;
import com.oracle.bmc.ospgateway.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class SubscriptionServiceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements SubscriptionService {
    /** Service instance for SubscriptionService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(SubscriptionServiceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://osp-oci-integ.osp.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SubscriptionServiceClient.class);

    private final SubscriptionServicePaginators paginators;

    SubscriptionServiceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new SubscriptionServicePaginators(this);
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
                    Builder, SubscriptionServiceClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ospgateway";
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
        public SubscriptionServiceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SubscriptionServiceClient(this, authenticationDetailsProvider);
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
    public AuthorizeSubscriptionPaymentResponse authorizeSubscriptionPayment(
            AuthorizeSubscriptionPaymentRequest request) {
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getAuthorizeSubscriptionPaymentDetails(),
                "authorizeSubscriptionPaymentDetails is required");

        return clientCall(request, AuthorizeSubscriptionPaymentResponse::builder)
                .logger(LOG, "authorizeSubscriptionPayment")
                .serviceDetails("SubscriptionService", "AuthorizeSubscriptionPayment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AuthorizeSubscriptionPaymentRequest::builder)
                .basePath("/20191001")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("actions")
                .appendPathParam("psd2auth")
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ospgateway.model.AuthorizeSubscriptionPaymentReceipt.class,
                        AuthorizeSubscriptionPaymentResponse.Builder
                                ::authorizeSubscriptionPaymentReceipt)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AuthorizeSubscriptionPaymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", AuthorizeSubscriptionPaymentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetSubscriptionResponse getSubscription(GetSubscriptionRequest request) {

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetSubscriptionResponse::builder)
                .logger(LOG, "getSubscription")
                .serviceDetails("SubscriptionService", "GetSubscription", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSubscriptionRequest::builder)
                .basePath("/20191001")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ospgateway.model.Subscription.class,
                        GetSubscriptionResponse.Builder::subscription)
                .handleResponseHeaderString("etag", GetSubscriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSubscriptionsResponse::builder)
                .logger(LOG, "listSubscriptions")
                .serviceDetails("SubscriptionService", "ListSubscriptions", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSubscriptionsRequest::builder)
                .basePath("/20191001")
                .appendPathParam("subscriptions")
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ospgateway.model.SubscriptionCollection.class,
                        ListSubscriptionsResponse.Builder::subscriptionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSubscriptionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSubscriptionsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSubscriptionsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public PaySubscriptionResponse paySubscription(PaySubscriptionRequest request) {
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getPaySubscriptionDetails(), "paySubscriptionDetails is required");

        return clientCall(request, PaySubscriptionResponse::builder)
                .logger(LOG, "paySubscription")
                .serviceDetails("SubscriptionService", "PaySubscription", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PaySubscriptionRequest::builder)
                .basePath("/20191001")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("actions")
                .appendPathParam("pay")
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ospgateway.model.PaySubscriptionReceipt.class,
                        PaySubscriptionResponse.Builder::paySubscriptionReceipt)
                .handleResponseHeaderString(
                        "opc-request-id", PaySubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PaySubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) {

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getUpdateSubscriptionDetails(), "updateSubscriptionDetails is required");

        return clientCall(request, UpdateSubscriptionResponse::builder)
                .logger(LOG, "updateSubscription")
                .serviceDetails("SubscriptionService", "UpdateSubscription", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSubscriptionRequest::builder)
                .basePath("/20191001")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ospgateway.model.Subscription.class,
                        UpdateSubscriptionResponse.Builder::subscription)
                .handleResponseHeaderString("etag", UpdateSubscriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SubscriptionServicePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SubscriptionServiceClient(
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
    public SubscriptionServiceClient(
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
    public SubscriptionServiceClient(
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
    public SubscriptionServiceClient(
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
    public SubscriptionServiceClient(
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
    public SubscriptionServiceClient(
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
    public SubscriptionServiceClient(
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
