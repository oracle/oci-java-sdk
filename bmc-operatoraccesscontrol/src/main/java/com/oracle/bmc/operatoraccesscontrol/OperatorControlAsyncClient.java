/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OperatorControl service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperatorControlAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OperatorControlAsync {
    /** Service instance for OperatorControl. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OperatorControlClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operator-access-control.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperatorControlAsyncClient.class);

    OperatorControlAsyncClient(
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
                    Builder, OperatorControlAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "operatoraccesscontrol";
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
        public OperatorControlAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OperatorControlAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOperatorControlCompartmentResponse>
            changeOperatorControlCompartment(
                    ChangeOperatorControlCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOperatorControlCompartmentRequest,
                                    ChangeOperatorControlCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getOperatorControlId(), "operatorControlId must not be blank");
        Objects.requireNonNull(
                request.getChangeOperatorControlCompartmentDetails(),
                "changeOperatorControlCompartmentDetails is required");

        return clientCall(request, ChangeOperatorControlCompartmentResponse::builder)
                .logger(LOG, "changeOperatorControlCompartment")
                .serviceDetails("OperatorControl", "ChangeOperatorControlCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOperatorControlCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendPathParam(request.getOperatorControlId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOperatorControlCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOperatorControlResponse> createOperatorControl(
            CreateOperatorControlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOperatorControlRequest, CreateOperatorControlResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOperatorControlDetails(),
                "createOperatorControlDetails is required");

        return clientCall(request, CreateOperatorControlResponse::builder)
                .logger(LOG, "createOperatorControl")
                .serviceDetails("OperatorControl", "CreateOperatorControl", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOperatorControlRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControl.class,
                        CreateOperatorControlResponse.Builder::operatorControl)
                .handleResponseHeaderString("etag", CreateOperatorControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOperatorControlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOperatorControlResponse> deleteOperatorControl(
            DeleteOperatorControlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOperatorControlRequest, DeleteOperatorControlResponse>
                    handler) {

        Validate.notBlank(request.getOperatorControlId(), "operatorControlId must not be blank");

        return clientCall(request, DeleteOperatorControlResponse::builder)
                .logger(LOG, "deleteOperatorControl")
                .serviceDetails("OperatorControl", "DeleteOperatorControl", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOperatorControlRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendPathParam(request.getOperatorControlId())
                .appendQueryParam("description", request.getDescription())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOperatorControlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOperatorControlResponse> getOperatorControl(
            GetOperatorControlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOperatorControlRequest, GetOperatorControlResponse>
                    handler) {

        Validate.notBlank(request.getOperatorControlId(), "operatorControlId must not be blank");

        return clientCall(request, GetOperatorControlResponse::builder)
                .logger(LOG, "getOperatorControl")
                .serviceDetails("OperatorControl", "GetOperatorControl", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOperatorControlRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendPathParam(request.getOperatorControlId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControl.class,
                        GetOperatorControlResponse.Builder::operatorControl)
                .handleResponseHeaderString("etag", GetOperatorControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOperatorControlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOperatorControlsResponse> listOperatorControls(
            ListOperatorControlsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOperatorControlsRequest, ListOperatorControlsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOperatorControlsResponse::builder)
                .logger(LOG, "listOperatorControls")
                .serviceDetails("OperatorControl", "ListOperatorControls", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOperatorControlsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControlCollection.class,
                        ListOperatorControlsResponse.Builder::operatorControlCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOperatorControlsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOperatorControlsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOperatorControlResponse> updateOperatorControl(
            UpdateOperatorControlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOperatorControlRequest, UpdateOperatorControlResponse>
                    handler) {

        Validate.notBlank(request.getOperatorControlId(), "operatorControlId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOperatorControlDetails(),
                "updateOperatorControlDetails is required");

        return clientCall(request, UpdateOperatorControlResponse::builder)
                .logger(LOG, "updateOperatorControl")
                .serviceDetails("OperatorControl", "UpdateOperatorControl", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOperatorControlRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendPathParam(request.getOperatorControlId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControl.class,
                        UpdateOperatorControlResponse.Builder::operatorControl)
                .handleResponseHeaderString("etag", UpdateOperatorControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOperatorControlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OperatorControlAsyncClient(
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
    public OperatorControlAsyncClient(
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
    public OperatorControlAsyncClient(
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
    public OperatorControlAsyncClient(
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
    public OperatorControlAsyncClient(
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
    public OperatorControlAsyncClient(
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
    public OperatorControlAsyncClient(
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
