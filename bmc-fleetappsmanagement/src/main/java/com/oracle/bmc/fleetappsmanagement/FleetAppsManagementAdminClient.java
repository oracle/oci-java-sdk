/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementAdminClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements FleetAppsManagementAdmin {
    /** Service instance for FleetAppsManagementAdmin. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENTADMIN")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementAdminClient.class);

    private final FleetAppsManagementAdminWaiters waiters;

    private final FleetAppsManagementAdminPaginators paginators;

    FleetAppsManagementAdminClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("FleetAppsManagementAdmin-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new FleetAppsManagementAdminWaiters(executorService, this);

        this.paginators = new FleetAppsManagementAdminPaginators(this);
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
                    Builder, FleetAppsManagementAdminClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetappsmanagement";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public FleetAppsManagementAdminClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementAdminClient(
                    this, authenticationDetailsProvider, executorService);
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
    public CreateOnboardingResponse createOnboarding(CreateOnboardingRequest request) {
        Objects.requireNonNull(
                request.getCreateOnboardingDetails(), "createOnboardingDetails is required");

        return clientCall(request, CreateOnboardingResponse::builder)
                .logger(LOG, "createOnboarding")
                .serviceDetails("FleetAppsManagementAdmin", "CreateOnboarding", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOnboardingRequest::builder)
                .basePath("/20230831")
                .appendPathParam("Onboardings")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Onboarding.class,
                        CreateOnboardingResponse.Builder::onboarding)
                .handleResponseHeaderString("location", CreateOnboardingResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateOnboardingResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateOnboardingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateOnboardingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOnboardingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePropertyResponse createProperty(CreatePropertyRequest request) {
        Objects.requireNonNull(
                request.getCreatePropertyDetails(), "createPropertyDetails is required");

        return clientCall(request, CreatePropertyResponse::builder)
                .logger(LOG, "createProperty")
                .serviceDetails("FleetAppsManagementAdmin", "CreateProperty", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("properties")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Property.class,
                        CreatePropertyResponse.Builder::property)
                .handleResponseHeaderString("etag", CreatePropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePropertyResponse deleteProperty(DeletePropertyRequest request) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");

        return clientCall(request, DeletePropertyResponse::builder)
                .logger(LOG, "deleteProperty")
                .serviceDetails("FleetAppsManagementAdmin", "DeleteProperty", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeletePropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPropertyResponse getProperty(GetPropertyRequest request) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");

        return clientCall(request, GetPropertyResponse::builder)
                .logger(LOG, "getProperty")
                .serviceDetails("FleetAppsManagementAdmin", "GetProperty", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Property.class,
                        GetPropertyResponse.Builder::property)
                .handleResponseHeaderString("etag", GetPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOnboardingPoliciesResponse listOnboardingPolicies(
            ListOnboardingPoliciesRequest request) {

        return clientCall(request, ListOnboardingPoliciesResponse::builder)
                .logger(LOG, "listOnboardingPolicies")
                .serviceDetails("FleetAppsManagementAdmin", "ListOnboardingPolicies", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOnboardingPoliciesRequest::builder)
                .basePath("/20230831")
                .appendPathParam("OnboardingPolicies")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.OnboardingPolicyCollection.class,
                        ListOnboardingPoliciesResponse.Builder::onboardingPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOnboardingPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOnboardingPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOnboardingsResponse listOnboardings(ListOnboardingsRequest request) {

        return clientCall(request, ListOnboardingsResponse::builder)
                .logger(LOG, "listOnboardings")
                .serviceDetails("FleetAppsManagementAdmin", "ListOnboardings", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOnboardingsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("Onboardings")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.OnboardingCollection.class,
                        ListOnboardingsResponse.Builder::onboardingCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOnboardingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOnboardingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPropertiesResponse listProperties(ListPropertiesRequest request) {

        return clientCall(request, ListPropertiesResponse::builder)
                .logger(LOG, "listProperties")
                .serviceDetails("FleetAppsManagementAdmin", "ListProperties", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPropertiesRequest::builder)
                .basePath("/20230831")
                .appendPathParam("properties")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.PropertyCollection.class,
                        ListPropertiesResponse.Builder::propertyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPropertiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPropertiesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdatePropertyResponse updateProperty(UpdatePropertyRequest request) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePropertyDetails(), "updatePropertyDetails is required");

        return clientCall(request, UpdatePropertyResponse::builder)
                .logger(LOG, "updateProperty")
                .serviceDetails("FleetAppsManagementAdmin", "UpdateProperty", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Property.class,
                        UpdatePropertyResponse.Builder::property)
                .handleResponseHeaderString("etag", UpdatePropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePropertyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FleetAppsManagementAdminWaiters getWaiters() {
        return waiters;
    }

    @Override
    public FleetAppsManagementAdminPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementAdminClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementAdminClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
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
    public FleetAppsManagementAdminClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
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
    public FleetAppsManagementAdminClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
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
    public FleetAppsManagementAdminClient(
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
                authenticationDetailsProvider,
                null);
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
    public FleetAppsManagementAdminClient(
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
                authenticationDetailsProvider,
                null);
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
    public FleetAppsManagementAdminClient(
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
                authenticationDetailsProvider,
                null);
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementAdminClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
