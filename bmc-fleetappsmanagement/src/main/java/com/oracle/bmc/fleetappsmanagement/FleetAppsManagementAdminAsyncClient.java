/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for FleetAppsManagementAdmin service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementAdminAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements FleetAppsManagementAdminAsync {
    /** Service instance for FleetAppsManagementAdmin. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENTADMIN")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementAdminAsyncClient.class);

    FleetAppsManagementAdminAsyncClient(
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
                    Builder, FleetAppsManagementAdminAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetappsmanagement";
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
        public FleetAppsManagementAdminAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementAdminAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateOnboardingResponse> createOnboarding(
            CreateOnboardingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOnboardingRequest, CreateOnboardingResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOnboardingDetails(), "createOnboardingDetails is required");

        return clientCall(request, CreateOnboardingResponse::builder)
                .logger(LOG, "createOnboarding")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "CreateOnboarding",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Onboarding/CreateOnboarding")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOnboardingRequest::builder)
                .basePath("/20230831")
                .appendPathParam("Onboardings")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePropertyResponse> createProperty(
            CreatePropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePropertyRequest, CreatePropertyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreatePropertyDetails(), "createPropertyDetails is required");

        return clientCall(request, CreatePropertyResponse::builder)
                .logger(LOG, "createProperty")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "CreateProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Property/CreateProperty")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("properties")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Property.class,
                        CreatePropertyResponse.Builder::property)
                .handleResponseHeaderString("etag", CreatePropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePropertyResponse> deleteProperty(
            DeletePropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePropertyRequest, DeletePropertyResponse>
                    handler) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");

        return clientCall(request, DeletePropertyResponse::builder)
                .logger(LOG, "deleteProperty")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "DeleteProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Property/DeleteProperty")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPropertyResponse> getProperty(
            GetPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPropertyRequest, GetPropertyResponse>
                    handler) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");

        return clientCall(request, GetPropertyResponse::builder)
                .logger(LOG, "getProperty")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "GetProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Property/GetProperty")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Property.class,
                        GetPropertyResponse.Builder::property)
                .handleResponseHeaderString("etag", GetPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOnboardingPoliciesResponse> listOnboardingPolicies(
            ListOnboardingPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOnboardingPoliciesRequest, ListOnboardingPoliciesResponse>
                    handler) {

        return clientCall(request, ListOnboardingPoliciesResponse::builder)
                .logger(LOG, "listOnboardingPolicies")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ListOnboardingPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/OnboardingPolicyCollection/ListOnboardingPolicies")
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
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.OnboardingPolicyCollection.class,
                        ListOnboardingPoliciesResponse.Builder::onboardingPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOnboardingPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOnboardingPoliciesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOnboardingsResponse> listOnboardings(
            ListOnboardingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOnboardingsRequest, ListOnboardingsResponse>
                    handler) {

        return clientCall(request, ListOnboardingsResponse::builder)
                .logger(LOG, "listOnboardings")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ListOnboardings",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/OnboardingCollection/ListOnboardings")
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
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.OnboardingCollection.class,
                        ListOnboardingsResponse.Builder::onboardingCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOnboardingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOnboardingsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPropertiesResponse> listProperties(
            ListPropertiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPropertiesRequest, ListPropertiesResponse>
                    handler) {

        return clientCall(request, ListPropertiesResponse::builder)
                .logger(LOG, "listProperties")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "ListProperties",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/PropertyCollection/ListProperties")
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
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.PropertyCollection.class,
                        ListPropertiesResponse.Builder::propertyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPropertiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPropertiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePropertyResponse> updateProperty(
            UpdatePropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePropertyRequest, UpdatePropertyResponse>
                    handler) {

        Validate.notBlank(request.getPropertyId(), "propertyId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePropertyDetails(), "updatePropertyDetails is required");

        return clientCall(request, UpdatePropertyResponse::builder)
                .logger(LOG, "updateProperty")
                .serviceDetails(
                        "FleetAppsManagementAdmin",
                        "UpdateProperty",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/Property/UpdateProperty")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePropertyRequest::builder)
                .basePath("/20230831")
                .appendPathParam("properties")
                .appendPathParam(request.getPropertyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.Property.class,
                        UpdatePropertyResponse.Builder::property)
                .handleResponseHeaderString("etag", UpdatePropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
    public FleetAppsManagementAdminAsyncClient(
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
