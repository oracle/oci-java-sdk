/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.limits.requests.*;
import com.oracle.bmc.limits.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
public class LimitsClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Limits {
    /** Service instance for Limits. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LIMITS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://limits.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LimitsClient.class);

    private final LimitsPaginators paginators;

    LimitsClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new LimitsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LimitsClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "limits";
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
        public LimitsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LimitsClient(this, authenticationDetailsProvider);
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
    public GetResourceAvailabilityResponse getResourceAvailability(
            GetResourceAvailabilityRequest request) {

        Validate.notBlank(request.getServiceName(), "serviceName must not be blank");

        Validate.notBlank(request.getLimitName(), "limitName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetResourceAvailabilityResponse::builder)
                .logger(LOG, "getResourceAvailability")
                .serviceDetails(
                        "Limits",
                        "GetResourceAvailability",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/ResourceAvailability/GetResourceAvailability")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResourceAvailabilityRequest::builder)
                .basePath("/")
                .appendPathParam("20190729")
                .appendPathParam("services")
                .appendPathParam(request.getServiceName())
                .appendPathParam("limits")
                .appendPathParam(request.getLimitName())
                .appendPathParam("resourceAvailability")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.limits.model.ResourceAvailability.class,
                        GetResourceAvailabilityResponse.Builder::resourceAvailability)
                .handleResponseHeaderString(
                        "opc-request-id", GetResourceAvailabilityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListLimitDefinitionsResponse listLimitDefinitions(ListLimitDefinitionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLimitDefinitionsResponse::builder)
                .logger(LOG, "listLimitDefinitions")
                .serviceDetails(
                        "Limits",
                        "ListLimitDefinitions",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/LimitDefinitionSummary/ListLimitDefinitions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLimitDefinitionsRequest::builder)
                .basePath("/")
                .appendPathParam("20190729")
                .appendPathParam("limitDefinitions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendQueryParam("serviceName", request.getServiceName())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.limits.model.LimitDefinitionSummary.class,
                        ListLimitDefinitionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListLimitDefinitionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLimitDefinitionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListLimitValuesResponse listLimitValues(ListLimitValuesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getServiceName(), "serviceName is required");

        return clientCall(request, ListLimitValuesResponse::builder)
                .logger(LOG, "listLimitValues")
                .serviceDetails(
                        "Limits",
                        "ListLimitValues",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/LimitValueSummary/ListLimitValues")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLimitValuesRequest::builder)
                .basePath("/")
                .appendPathParam("20190729")
                .appendPathParam("limitValues")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendQueryParam("serviceName", request.getServiceName())
                .appendEnumQueryParam("scopeType", request.getScopeType())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.limits.model.LimitValueSummary.class,
                        ListLimitValuesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListLimitValuesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLimitValuesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListServicesResponse listServices(ListServicesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListServicesResponse::builder)
                .logger(LOG, "listServices")
                .serviceDetails(
                        "Limits",
                        "ListServices",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/ServiceSummary/ListServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServicesRequest::builder)
                .basePath("/")
                .appendPathParam("20190729")
                .appendPathParam("services")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.limits.model.ServiceSummary.class,
                        ListServicesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListServicesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListServicesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public LimitsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LimitsClient(
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
    public LimitsClient(
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
    public LimitsClient(
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
    public LimitsClient(
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
    public LimitsClient(
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
    public LimitsClient(
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
    public LimitsClient(
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
