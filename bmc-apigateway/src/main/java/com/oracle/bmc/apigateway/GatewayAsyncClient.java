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
 * Async client implementation for Gateway service. <br>
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
public class GatewayAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements GatewayAsync {
    /** Service instance for Gateway. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(GatewayClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apigateway.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GatewayAsyncClient.class);

    GatewayAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, GatewayAsyncClient> {
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
        public GatewayAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GatewayAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddGatewayLockResponse> addGatewayLock(
            AddGatewayLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddGatewayLockRequest, AddGatewayLockResponse>
                    handler) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddGatewayLockResponse::builder)
                .logger(LOG, "addGatewayLock")
                .serviceDetails(
                        "Gateway",
                        "AddGatewayLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/AddGatewayLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddGatewayLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Gateway.class,
                        AddGatewayLockResponse.Builder::gateway)
                .handleResponseHeaderString(
                        "opc-request-id", AddGatewayLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddGatewayLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeGatewayCompartmentResponse> changeGatewayCompartment(
            ChangeGatewayCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeGatewayCompartmentRequest, ChangeGatewayCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");
        Objects.requireNonNull(
                request.getChangeGatewayCompartmentDetails(),
                "changeGatewayCompartmentDetails is required");

        return clientCall(request, ChangeGatewayCompartmentResponse::builder)
                .logger(LOG, "changeGatewayCompartment")
                .serviceDetails(
                        "Gateway",
                        "ChangeGatewayCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/ChangeGatewayCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeGatewayCompartmentRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
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
                        ChangeGatewayCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeGatewayCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayResponse> createGateway(
            CreateGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateGatewayRequest, CreateGatewayResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateGatewayDetails(), "createGatewayDetails is required");

        return clientCall(request, CreateGatewayResponse::builder)
                .logger(LOG, "createGateway")
                .serviceDetails("Gateway", "CreateGateway", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGatewayRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Gateway.class,
                        CreateGatewayResponse.Builder::gateway)
                .handleResponseHeaderString("etag", CreateGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateGatewayResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGatewayResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateGatewayResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResponse> deleteGateway(
            DeleteGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResponse>
                    handler) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");

        return clientCall(request, DeleteGatewayResponse::builder)
                .logger(LOG, "deleteGateway")
                .serviceDetails(
                        "Gateway",
                        "DeleteGateway",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/DeleteGateway")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGatewayRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteGatewayResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGatewayResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResponse> getGateway(
            GetGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetGatewayRequest, GetGatewayResponse>
                    handler) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");

        return clientCall(request, GetGatewayResponse::builder)
                .logger(LOG, "getGateway")
                .serviceDetails(
                        "Gateway",
                        "GetGateway",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/GetGateway")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGatewayRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apigateway.model.Gateway.class,
                        GetGatewayResponse.Builder::gateway)
                .handleResponseHeaderString("etag", GetGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGatewayResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResponse> listGateways(
            ListGatewaysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGatewaysRequest, ListGatewaysResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListGatewaysResponse::builder)
                .logger(LOG, "listGateways")
                .serviceDetails(
                        "Gateway",
                        "ListGateways",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/GatewaySummary/ListGateways")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGatewaysRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("certificateId", request.getCertificateId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apigateway.model.GatewayCollection.class,
                        ListGatewaysResponse.Builder::gatewayCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGatewaysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGatewaysResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListGatewaysResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveGatewayLockResponse> removeGatewayLock(
            RemoveGatewayLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveGatewayLockRequest, RemoveGatewayLockResponse>
                    handler) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveGatewayLockResponse::builder)
                .logger(LOG, "removeGatewayLock")
                .serviceDetails(
                        "Gateway",
                        "RemoveGatewayLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/RemoveGatewayLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveGatewayLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Gateway.class,
                        RemoveGatewayLockResponse.Builder::gateway)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveGatewayLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveGatewayLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayResponse> updateGateway(
            UpdateGatewayRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateGatewayRequest, UpdateGatewayResponse>
                    handler) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");
        Objects.requireNonNull(
                request.getUpdateGatewayDetails(), "updateGatewayDetails is required");

        return clientCall(request, UpdateGatewayResponse::builder)
                .logger(LOG, "updateGateway")
                .serviceDetails(
                        "Gateway",
                        "UpdateGateway",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/UpdateGateway")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGatewayRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateGatewayResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGatewayResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GatewayAsyncClient(
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
    public GatewayAsyncClient(
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
    public GatewayAsyncClient(
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
    public GatewayAsyncClient(
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
    public GatewayAsyncClient(
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
    public GatewayAsyncClient(
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
    public GatewayAsyncClient(
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
