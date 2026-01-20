/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;

import java.util.Objects;

/**
 * Async client implementation for RoverEntitlement service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class RoverEntitlementAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements RoverEntitlementAsync {
    /** Service instance for RoverEntitlement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(RoverEntitlementClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://rover.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RoverEntitlementAsyncClient.class);

    RoverEntitlementAsyncClient(
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
                    Builder, RoverEntitlementAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "rover";
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
        public RoverEntitlementAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RoverEntitlementAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeRoverEntitlementCompartmentResponse>
            changeRoverEntitlementCompartment(
                    ChangeRoverEntitlementCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeRoverEntitlementCompartmentRequest,
                                    ChangeRoverEntitlementCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getRoverEntitlementId(), "roverEntitlementId must not be blank");
        Objects.requireNonNull(
                request.getChangeRoverEntitlementCompartmentDetails(),
                "changeRoverEntitlementCompartmentDetails is required");

        return clientCall(request, ChangeRoverEntitlementCompartmentResponse::builder)
                .logger(LOG, "changeRoverEntitlementCompartment")
                .serviceDetails(
                        "RoverEntitlement",
                        "ChangeRoverEntitlementCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverEntitlement/ChangeRoverEntitlementCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRoverEntitlementCompartmentRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverEntitlements")
                .appendPathParam(request.getRoverEntitlementId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeRoverEntitlementCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRoverEntitlementResponse> createRoverEntitlement(
            CreateRoverEntitlementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRoverEntitlementRequest, CreateRoverEntitlementResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateRoverEntitlementDetails(),
                "createRoverEntitlementDetails is required");

        return clientCall(request, CreateRoverEntitlementResponse::builder)
                .logger(LOG, "createRoverEntitlement")
                .serviceDetails(
                        "RoverEntitlement",
                        "CreateRoverEntitlement",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverEntitlement/CreateRoverEntitlement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRoverEntitlementRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverEntitlements")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverEntitlement.class,
                        CreateRoverEntitlementResponse.Builder::roverEntitlement)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRoverEntitlementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateRoverEntitlementResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoverEntitlementResponse> deleteRoverEntitlement(
            DeleteRoverEntitlementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRoverEntitlementRequest, DeleteRoverEntitlementResponse>
                    handler) {

        Validate.notBlank(request.getRoverEntitlementId(), "roverEntitlementId must not be blank");

        return clientCall(request, DeleteRoverEntitlementResponse::builder)
                .logger(LOG, "deleteRoverEntitlement")
                .serviceDetails(
                        "RoverEntitlement",
                        "DeleteRoverEntitlement",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverEntitlement/DeleteRoverEntitlement")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRoverEntitlementRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverEntitlements")
                .appendPathParam(request.getRoverEntitlementId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRoverEntitlementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRoverEntitlementResponse> getRoverEntitlement(
            GetRoverEntitlementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRoverEntitlementRequest, GetRoverEntitlementResponse>
                    handler) {

        Validate.notBlank(request.getRoverEntitlementId(), "roverEntitlementId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetRoverEntitlementResponse::builder)
                .logger(LOG, "getRoverEntitlement")
                .serviceDetails(
                        "RoverEntitlement",
                        "GetRoverEntitlement",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverEntitlement/GetRoverEntitlement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRoverEntitlementRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverEntitlements")
                .appendPathParam(request.getRoverEntitlementId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.rover.model.RoverEntitlement.class,
                        GetRoverEntitlementResponse.Builder::roverEntitlement)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoverEntitlementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRoverEntitlementResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRoverEntitlementsResponse> listRoverEntitlements(
            ListRoverEntitlementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRoverEntitlementsRequest, ListRoverEntitlementsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRoverEntitlementsResponse::builder)
                .logger(LOG, "listRoverEntitlements")
                .serviceDetails(
                        "RoverEntitlement",
                        "ListRoverEntitlements",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverEntitlement/ListRoverEntitlements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRoverEntitlementsRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverEntitlements")
                .appendQueryParam("id", request.getId())
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
                        com.oracle.bmc.rover.model.RoverEntitlementCollection.class,
                        ListRoverEntitlementsResponse.Builder::roverEntitlementCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRoverEntitlementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRoverEntitlementsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListRoverEntitlementsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoverEntitlementResponse> updateRoverEntitlement(
            UpdateRoverEntitlementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRoverEntitlementRequest, UpdateRoverEntitlementResponse>
                    handler) {

        Validate.notBlank(request.getRoverEntitlementId(), "roverEntitlementId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRoverEntitlementDetails(),
                "updateRoverEntitlementDetails is required");

        return clientCall(request, UpdateRoverEntitlementResponse::builder)
                .logger(LOG, "updateRoverEntitlement")
                .serviceDetails(
                        "RoverEntitlement",
                        "UpdateRoverEntitlement",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverEntitlement/UpdateRoverEntitlement")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRoverEntitlementRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverEntitlements")
                .appendPathParam(request.getRoverEntitlementId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverEntitlement.class,
                        UpdateRoverEntitlementResponse.Builder::roverEntitlement)
                .handleResponseHeaderString("etag", UpdateRoverEntitlementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRoverEntitlementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RoverEntitlementAsyncClient(
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
    public RoverEntitlementAsyncClient(
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
    public RoverEntitlementAsyncClient(
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
    public RoverEntitlementAsyncClient(
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
    public RoverEntitlementAsyncClient(
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
    public RoverEntitlementAsyncClient(
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
    public RoverEntitlementAsyncClient(
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
