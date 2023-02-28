/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.autoscaling.requests.*;
import com.oracle.bmc.autoscaling.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class AutoScalingClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements AutoScaling {
    /** Service instance for AutoScaling. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("AUTOSCALING")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://autoscaling.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AutoScalingClient.class);

    private final AutoScalingPaginators paginators;

    private AutoScalingClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new AutoScalingPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AutoScalingClient> {
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
        public AutoScalingClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AutoScalingClient(this, authenticationDetailsProvider);
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
    public ChangeAutoScalingConfigurationCompartmentResponse
            changeAutoScalingConfigurationCompartment(
                    ChangeAutoScalingConfigurationCompartmentRequest request) {

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        return clientCall(request, ChangeAutoScalingConfigurationCompartmentResponse::builder)
                .logger(LOG, "changeAutoScalingConfigurationCompartment")
                .serviceDetails(
                        "AutoScaling",
                        "ChangeAutoScalingConfigurationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingConfiguration/ChangeAutoScalingConfigurationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutoScalingConfigurationCompartmentRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeAutoScalingConfigurationCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutoScalingConfigurationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAutoScalingConfigurationResponse createAutoScalingConfiguration(
            CreateAutoScalingConfigurationRequest request) {
        Objects.requireNonNull(
                request.getCreateAutoScalingConfigurationDetails(),
                "createAutoScalingConfigurationDetails is required");

        return clientCall(request, CreateAutoScalingConfigurationResponse::builder)
                .logger(LOG, "createAutoScalingConfiguration")
                .serviceDetails(
                        "AutoScaling",
                        "CreateAutoScalingConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingConfiguration/CreateAutoScalingConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutoScalingConfigurationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.autoscaling.model.AutoScalingConfiguration.class,
                        CreateAutoScalingConfigurationResponse.Builder::autoScalingConfiguration)
                .handleResponseHeaderString(
                        "etag", CreateAutoScalingConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAutoScalingConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAutoScalingPolicyResponse createAutoScalingPolicy(
            CreateAutoScalingPolicyRequest request) {

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getCreateAutoScalingPolicyDetails(),
                "createAutoScalingPolicyDetails is required");

        return clientCall(request, CreateAutoScalingPolicyResponse::builder)
                .logger(LOG, "createAutoScalingPolicy")
                .serviceDetails(
                        "AutoScaling",
                        "CreateAutoScalingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingPolicy/CreateAutoScalingPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutoScalingPolicyRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .appendPathParam("policies")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.autoscaling.model.AutoScalingPolicy.class,
                        CreateAutoScalingPolicyResponse.Builder::autoScalingPolicy)
                .handleResponseHeaderString("etag", CreateAutoScalingPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAutoScalingPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAutoScalingConfigurationResponse deleteAutoScalingConfiguration(
            DeleteAutoScalingConfigurationRequest request) {

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");

        return clientCall(request, DeleteAutoScalingConfigurationResponse::builder)
                .logger(LOG, "deleteAutoScalingConfiguration")
                .serviceDetails(
                        "AutoScaling",
                        "DeleteAutoScalingConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingConfiguration/DeleteAutoScalingConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAutoScalingConfigurationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteAutoScalingConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAutoScalingPolicyResponse deleteAutoScalingPolicy(
            DeleteAutoScalingPolicyRequest request) {

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");

        Validate.notBlank(
                request.getAutoScalingPolicyId(), "autoScalingPolicyId must not be blank");

        return clientCall(request, DeleteAutoScalingPolicyResponse::builder)
                .logger(LOG, "deleteAutoScalingPolicy")
                .serviceDetails(
                        "AutoScaling",
                        "DeleteAutoScalingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingPolicy/DeleteAutoScalingPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAutoScalingPolicyRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .appendPathParam("policies")
                .appendPathParam(request.getAutoScalingPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAutoScalingPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutoScalingConfigurationResponse getAutoScalingConfiguration(
            GetAutoScalingConfigurationRequest request) {

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");

        return clientCall(request, GetAutoScalingConfigurationResponse::builder)
                .logger(LOG, "getAutoScalingConfiguration")
                .serviceDetails(
                        "AutoScaling",
                        "GetAutoScalingConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingConfiguration/GetAutoScalingConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutoScalingConfigurationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.autoscaling.model.AutoScalingConfiguration.class,
                        GetAutoScalingConfigurationResponse.Builder::autoScalingConfiguration)
                .handleResponseHeaderString(
                        "etag", GetAutoScalingConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutoScalingConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutoScalingPolicyResponse getAutoScalingPolicy(GetAutoScalingPolicyRequest request) {

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");

        Validate.notBlank(
                request.getAutoScalingPolicyId(), "autoScalingPolicyId must not be blank");

        return clientCall(request, GetAutoScalingPolicyResponse::builder)
                .logger(LOG, "getAutoScalingPolicy")
                .serviceDetails(
                        "AutoScaling",
                        "GetAutoScalingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingPolicy/GetAutoScalingPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutoScalingPolicyRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .appendPathParam("policies")
                .appendPathParam(request.getAutoScalingPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.autoscaling.model.AutoScalingPolicy.class,
                        GetAutoScalingPolicyResponse.Builder::autoScalingPolicy)
                .handleResponseHeaderString("etag", GetAutoScalingPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutoScalingPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAutoScalingConfigurationsResponse listAutoScalingConfigurations(
            ListAutoScalingConfigurationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutoScalingConfigurationsResponse::builder)
                .logger(LOG, "listAutoScalingConfigurations")
                .serviceDetails(
                        "AutoScaling",
                        "ListAutoScalingConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingConfigurationSummary/ListAutoScalingConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutoScalingConfigurationsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.autoscaling.model.AutoScalingConfigurationSummary.class,
                        ListAutoScalingConfigurationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutoScalingConfigurationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutoScalingConfigurationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAutoScalingPoliciesResponse listAutoScalingPolicies(
            ListAutoScalingPoliciesRequest request) {

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");

        return clientCall(request, ListAutoScalingPoliciesResponse::builder)
                .logger(LOG, "listAutoScalingPolicies")
                .serviceDetails(
                        "AutoScaling",
                        "ListAutoScalingPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingPolicySummary/ListAutoScalingPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutoScalingPoliciesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .appendPathParam("policies")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.autoscaling.model.AutoScalingPolicySummary.class,
                        ListAutoScalingPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutoScalingPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAutoScalingPoliciesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateAutoScalingConfigurationResponse updateAutoScalingConfiguration(
            UpdateAutoScalingConfigurationRequest request) {

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutoScalingConfigurationDetails(),
                "updateAutoScalingConfigurationDetails is required");

        return clientCall(request, UpdateAutoScalingConfigurationResponse::builder)
                .logger(LOG, "updateAutoScalingConfiguration")
                .serviceDetails(
                        "AutoScaling",
                        "UpdateAutoScalingConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingConfiguration/UpdateAutoScalingConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutoScalingConfigurationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.autoscaling.model.AutoScalingConfiguration.class,
                        UpdateAutoScalingConfigurationResponse.Builder::autoScalingConfiguration)
                .handleResponseHeaderString(
                        "etag", UpdateAutoScalingConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutoScalingConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateAutoScalingPolicyResponse updateAutoScalingPolicy(
            UpdateAutoScalingPolicyRequest request) {

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");

        Validate.notBlank(
                request.getAutoScalingPolicyId(), "autoScalingPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutoScalingPolicyDetails(),
                "updateAutoScalingPolicyDetails is required");

        return clientCall(request, UpdateAutoScalingPolicyResponse::builder)
                .logger(LOG, "updateAutoScalingPolicy")
                .serviceDetails(
                        "AutoScaling",
                        "UpdateAutoScalingPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/autoscaling/20181001/AutoScalingPolicy/UpdateAutoScalingPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutoScalingPolicyRequest::builder)
                .basePath("/20181001")
                .appendPathParam("autoScalingConfigurations")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .appendPathParam("policies")
                .appendPathParam(request.getAutoScalingPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.autoscaling.model.AutoScalingPolicy.class,
                        UpdateAutoScalingPolicyResponse.Builder::autoScalingPolicy)
                .handleResponseHeaderString("etag", UpdateAutoScalingPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAutoScalingPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AutoScalingPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AutoScalingClient(
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
    public AutoScalingClient(
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
    public AutoScalingClient(
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
    public AutoScalingClient(
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
    public AutoScalingClient(
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
    public AutoScalingClient(
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
    public AutoScalingClient(
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
