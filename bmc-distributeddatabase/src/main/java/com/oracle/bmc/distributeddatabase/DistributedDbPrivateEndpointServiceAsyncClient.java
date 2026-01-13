/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.distributeddatabase.requests.*;
import com.oracle.bmc.distributeddatabase.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DistributedDbPrivateEndpointService service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
public class DistributedDbPrivateEndpointServiceAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DistributedDbPrivateEndpointServiceAsync {
    /** Service instance for DistributedDbPrivateEndpointService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DistributedDbPrivateEndpointServiceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://globaldb.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DistributedDbPrivateEndpointServiceAsyncClient.class);

    DistributedDbPrivateEndpointServiceAsyncClient(
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
                    Builder, DistributedDbPrivateEndpointServiceAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "distributeddatabase";
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
        public DistributedDbPrivateEndpointServiceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DistributedDbPrivateEndpointServiceAsyncClient(
                    this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeDistributedDatabasePrivateEndpointCompartmentResponse>
            changeDistributedDatabasePrivateEndpointCompartment(
                    ChangeDistributedDatabasePrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDistributedDatabasePrivateEndpointCompartmentRequest,
                                    ChangeDistributedDatabasePrivateEndpointCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeDistributedDatabasePrivateEndpointCompartmentDetails(),
                "changeDistributedDatabasePrivateEndpointCompartmentDetails is required");

        Validate.notBlank(
                request.getDistributedDatabasePrivateEndpointId(),
                "distributedDatabasePrivateEndpointId must not be blank");

        return clientCall(
                        request,
                        ChangeDistributedDatabasePrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeDistributedDatabasePrivateEndpointCompartment")
                .serviceDetails(
                        "DistributedDbPrivateEndpointService",
                        "ChangeDistributedDatabasePrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabasePrivateEndpoint/ChangeDistributedDatabasePrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDistributedDatabasePrivateEndpointCompartmentRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabasePrivateEndpoints")
                .appendPathParam(request.getDistributedDatabasePrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDistributedDatabasePrivateEndpointCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDistributedDatabasePrivateEndpointCompartmentResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDistributedDatabasePrivateEndpointResponse>
            createDistributedDatabasePrivateEndpoint(
                    CreateDistributedDatabasePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDistributedDatabasePrivateEndpointRequest,
                                    CreateDistributedDatabasePrivateEndpointResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateDistributedDatabasePrivateEndpointDetails(),
                "createDistributedDatabasePrivateEndpointDetails is required");

        return clientCall(request, CreateDistributedDatabasePrivateEndpointResponse::builder)
                .logger(LOG, "createDistributedDatabasePrivateEndpoint")
                .serviceDetails(
                        "DistributedDbPrivateEndpointService",
                        "CreateDistributedDatabasePrivateEndpoint",
                        "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDistributedDatabasePrivateEndpointRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabasePrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabasePrivateEndpoint
                                .class,
                        CreateDistributedDatabasePrivateEndpointResponse.Builder
                                ::distributedDatabasePrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDistributedDatabasePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDistributedDatabasePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateDistributedDatabasePrivateEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributedDatabasePrivateEndpointResponse>
            deleteDistributedDatabasePrivateEndpoint(
                    DeleteDistributedDatabasePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDistributedDatabasePrivateEndpointRequest,
                                    DeleteDistributedDatabasePrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabasePrivateEndpointId(),
                "distributedDatabasePrivateEndpointId must not be blank");

        return clientCall(request, DeleteDistributedDatabasePrivateEndpointResponse::builder)
                .logger(LOG, "deleteDistributedDatabasePrivateEndpoint")
                .serviceDetails(
                        "DistributedDbPrivateEndpointService",
                        "DeleteDistributedDatabasePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabasePrivateEndpoint/DeleteDistributedDatabasePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDistributedDatabasePrivateEndpointRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabasePrivateEndpoints")
                .appendPathParam(request.getDistributedDatabasePrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDistributedDatabasePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDistributedDatabasePrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDistributedDatabasePrivateEndpointResponse>
            getDistributedDatabasePrivateEndpoint(
                    GetDistributedDatabasePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDistributedDatabasePrivateEndpointRequest,
                                    GetDistributedDatabasePrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabasePrivateEndpointId(),
                "distributedDatabasePrivateEndpointId must not be blank");

        return clientCall(request, GetDistributedDatabasePrivateEndpointResponse::builder)
                .logger(LOG, "getDistributedDatabasePrivateEndpoint")
                .serviceDetails(
                        "DistributedDbPrivateEndpointService",
                        "GetDistributedDatabasePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabasePrivateEndpoint/GetDistributedDatabasePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDistributedDatabasePrivateEndpointRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabasePrivateEndpoints")
                .appendPathParam(request.getDistributedDatabasePrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabasePrivateEndpoint
                                .class,
                        GetDistributedDatabasePrivateEndpointResponse.Builder
                                ::distributedDatabasePrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDistributedDatabasePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetDistributedDatabasePrivateEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDistributedDatabasePrivateEndpointsResponse>
            listDistributedDatabasePrivateEndpoints(
                    ListDistributedDatabasePrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDistributedDatabasePrivateEndpointsRequest,
                                    ListDistributedDatabasePrivateEndpointsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDistributedDatabasePrivateEndpointsResponse::builder)
                .logger(LOG, "listDistributedDatabasePrivateEndpoints")
                .serviceDetails(
                        "DistributedDbPrivateEndpointService",
                        "ListDistributedDatabasePrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabasePrivateEndpointCollection/ListDistributedDatabasePrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDistributedDatabasePrivateEndpointsRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabasePrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model
                                .DistributedDatabasePrivateEndpointCollection.class,
                        ListDistributedDatabasePrivateEndpointsResponse.Builder
                                ::distributedDatabasePrivateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDistributedDatabasePrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDistributedDatabasePrivateEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReinstateProxyInstanceResponse> reinstateProxyInstance(
            ReinstateProxyInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReinstateProxyInstanceRequest, ReinstateProxyInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getDistributedDatabasePrivateEndpointId(),
                "distributedDatabasePrivateEndpointId must not be blank");

        return clientCall(request, ReinstateProxyInstanceResponse::builder)
                .logger(LOG, "reinstateProxyInstance")
                .serviceDetails(
                        "DistributedDbPrivateEndpointService",
                        "ReinstateProxyInstance",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabasePrivateEndpoint/ReinstateProxyInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReinstateProxyInstanceRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabasePrivateEndpoints")
                .appendPathParam(request.getDistributedDatabasePrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("reinstateProxyInstance")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ReinstateProxyInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ReinstateProxyInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributedDatabasePrivateEndpointResponse>
            updateDistributedDatabasePrivateEndpoint(
                    UpdateDistributedDatabasePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDistributedDatabasePrivateEndpointRequest,
                                    UpdateDistributedDatabasePrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getDistributedDatabasePrivateEndpointId(),
                "distributedDatabasePrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDistributedDatabasePrivateEndpointDetails(),
                "updateDistributedDatabasePrivateEndpointDetails is required");

        return clientCall(request, UpdateDistributedDatabasePrivateEndpointResponse::builder)
                .logger(LOG, "updateDistributedDatabasePrivateEndpoint")
                .serviceDetails(
                        "DistributedDbPrivateEndpointService",
                        "UpdateDistributedDatabasePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/globally-distributed-database/20250101/DistributedDatabasePrivateEndpoint/UpdateDistributedDatabasePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDistributedDatabasePrivateEndpointRequest::builder)
                .basePath("/20250101")
                .appendPathParam("distributedDatabasePrivateEndpoints")
                .appendPathParam(request.getDistributedDatabasePrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.distributeddatabase.model.DistributedDatabasePrivateEndpoint
                                .class,
                        UpdateDistributedDatabasePrivateEndpointResponse.Builder
                                ::distributedDatabasePrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDistributedDatabasePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateDistributedDatabasePrivateEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DistributedDbPrivateEndpointServiceAsyncClient(
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
    public DistributedDbPrivateEndpointServiceAsyncClient(
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
    public DistributedDbPrivateEndpointServiceAsyncClient(
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
    public DistributedDbPrivateEndpointServiceAsyncClient(
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
    public DistributedDbPrivateEndpointServiceAsyncClient(
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
    public DistributedDbPrivateEndpointServiceAsyncClient(
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
    public DistributedDbPrivateEndpointServiceAsyncClient(
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
