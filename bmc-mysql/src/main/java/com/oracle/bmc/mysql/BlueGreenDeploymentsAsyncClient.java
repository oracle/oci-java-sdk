/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

import java.util.Objects;

/**
 * Async client implementation for BlueGreenDeployments service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class BlueGreenDeploymentsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements BlueGreenDeploymentsAsync {
    /** Service instance for BlueGreenDeployments. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(BlueGreenDeploymentsClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BlueGreenDeploymentsAsyncClient.class);

    BlueGreenDeploymentsAsyncClient(
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
                    Builder, BlueGreenDeploymentsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "mysql";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public BlueGreenDeploymentsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BlueGreenDeploymentsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeBlueGreenDeploymentCompartmentResponse>
            changeBlueGreenDeploymentCompartment(
                    ChangeBlueGreenDeploymentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBlueGreenDeploymentCompartmentRequest,
                                    ChangeBlueGreenDeploymentCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getChangeBlueGreenDeploymentCompartmentDetails(),
                "changeBlueGreenDeploymentCompartmentDetails is required");

        return clientCall(request, ChangeBlueGreenDeploymentCompartmentResponse::builder)
                .logger(LOG, "changeBlueGreenDeploymentCompartment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "ChangeBlueGreenDeploymentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/ChangeBlueGreenDeploymentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBlueGreenDeploymentCompartmentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBlueGreenDeploymentCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBlueGreenDeploymentCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBlueGreenDeploymentResponse> createBlueGreenDeployment(
            CreateBlueGreenDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBlueGreenDeploymentRequest, CreateBlueGreenDeploymentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateBlueGreenDeploymentDetails(),
                "createBlueGreenDeploymentDetails is required");

        return clientCall(request, CreateBlueGreenDeploymentResponse::builder)
                .logger(LOG, "createBlueGreenDeployment")
                .serviceDetails("BlueGreenDeployments", "CreateBlueGreenDeployment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.BlueGreenDeployment.class,
                        CreateBlueGreenDeploymentResponse.Builder::blueGreenDeployment)
                .handleResponseHeaderString("etag", CreateBlueGreenDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBlueGreenDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateBlueGreenDeploymentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBlueGreenDeploymentResponse> deleteBlueGreenDeployment(
            DeleteBlueGreenDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBlueGreenDeploymentRequest, DeleteBlueGreenDeploymentResponse>
                    handler) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");

        return clientCall(request, DeleteBlueGreenDeploymentResponse::builder)
                .logger(LOG, "deleteBlueGreenDeployment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "DeleteBlueGreenDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/DeleteBlueGreenDeployment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBlueGreenDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteBlueGreenDeploymentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBlueGreenDeploymentResponse> getBlueGreenDeployment(
            GetBlueGreenDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBlueGreenDeploymentRequest, GetBlueGreenDeploymentResponse>
                    handler) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");

        return clientCall(request, GetBlueGreenDeploymentResponse::builder)
                .logger(LOG, "getBlueGreenDeployment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "GetBlueGreenDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/GetBlueGreenDeployment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .handleBody(
                        com.oracle.bmc.mysql.model.BlueGreenDeployment.class,
                        GetBlueGreenDeploymentResponse.Builder::blueGreenDeployment)
                .handleResponseHeaderString("etag", GetBlueGreenDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBlueGreenDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBlueGreenDeploymentsResponse> listBlueGreenDeployments(
            ListBlueGreenDeploymentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBlueGreenDeploymentsRequest, ListBlueGreenDeploymentsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBlueGreenDeploymentsResponse::builder)
                .logger(LOG, "listBlueGreenDeployments")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "ListBlueGreenDeployments",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeploymentCollection/ListBlueGreenDeployments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBlueGreenDeploymentsRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("sourceDbSystemId", request.getSourceDbSystemId())
                .appendQueryParam("targetDbSystemId", request.getTargetDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mysql.model.BlueGreenDeploymentCollection.class,
                        ListBlueGreenDeploymentsResponse.Builder::blueGreenDeploymentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBlueGreenDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBlueGreenDeploymentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SwitchoverBlueGreenDeploymentResponse>
            switchoverBlueGreenDeployment(
                    SwitchoverBlueGreenDeploymentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverBlueGreenDeploymentRequest,
                                    SwitchoverBlueGreenDeploymentResponse>
                            handler) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getSwitchoverBlueGreenDeploymentDetails(),
                "switchoverBlueGreenDeploymentDetails is required");

        return clientCall(request, SwitchoverBlueGreenDeploymentResponse::builder)
                .logger(LOG, "switchoverBlueGreenDeployment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "SwitchoverBlueGreenDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/SwitchoverBlueGreenDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchoverBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("switchover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.BlueGreenDeployment.class,
                        SwitchoverBlueGreenDeploymentResponse.Builder::blueGreenDeployment)
                .handleResponseHeaderString(
                        "etag", SwitchoverBlueGreenDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchoverBlueGreenDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchoverBlueGreenDeploymentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBlueGreenDeploymentResponse> updateBlueGreenDeployment(
            UpdateBlueGreenDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBlueGreenDeploymentRequest, UpdateBlueGreenDeploymentResponse>
                    handler) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBlueGreenDeploymentDetails(),
                "updateBlueGreenDeploymentDetails is required");

        return clientCall(request, UpdateBlueGreenDeploymentResponse::builder)
                .logger(LOG, "updateBlueGreenDeployment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "UpdateBlueGreenDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/UpdateBlueGreenDeployment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBlueGreenDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateBlueGreenDeploymentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BlueGreenDeploymentsAsyncClient(
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
    public BlueGreenDeploymentsAsyncClient(
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
    public BlueGreenDeploymentsAsyncClient(
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
    public BlueGreenDeploymentsAsyncClient(
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
    public BlueGreenDeploymentsAsyncClient(
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
    public BlueGreenDeploymentsAsyncClient(
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
    public BlueGreenDeploymentsAsyncClient(
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
