/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Ekm service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class EkmAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements EkmAsync {
    /** Service instance for Ekm. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("EKM")
                    .serviceEndpointPrefix("kms")
                    .serviceEndpointTemplate("https://kms.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EkmAsyncClient.class);

    EkmAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, EkmAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "keymanagement";
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
        public EkmAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new EkmAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateEkmsPrivateEndpointResponse> createEkmsPrivateEndpoint(
            CreateEkmsPrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEkmsPrivateEndpointRequest, CreateEkmsPrivateEndpointResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateEkmsPrivateEndpointDetails(),
                "createEkmsPrivateEndpointDetails is required");

        return clientCall(request, CreateEkmsPrivateEndpointResponse::builder)
                .logger(LOG, "createEkmsPrivateEndpoint")
                .serviceDetails(
                        "Ekm",
                        "CreateEkmsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/EkmsPrivateEndpoint/CreateEkmsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEkmsPrivateEndpointRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("ekmsPrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.EkmsPrivateEndpoint.class,
                        CreateEkmsPrivateEndpointResponse.Builder::ekmsPrivateEndpoint)
                .handleResponseHeaderString("etag", CreateEkmsPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEkmsPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateEkmsPrivateEndpointResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEkmsPrivateEndpointResponse> deleteEkmsPrivateEndpoint(
            DeleteEkmsPrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEkmsPrivateEndpointRequest, DeleteEkmsPrivateEndpointResponse>
                    handler) {

        Validate.notBlank(
                request.getEkmsPrivateEndpointId(), "ekmsPrivateEndpointId must not be blank");

        return clientCall(request, DeleteEkmsPrivateEndpointResponse::builder)
                .logger(LOG, "deleteEkmsPrivateEndpoint")
                .serviceDetails(
                        "Ekm",
                        "DeleteEkmsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/EkmsPrivateEndpoint/DeleteEkmsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEkmsPrivateEndpointRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("ekmsPrivateEndpoints")
                .appendPathParam(request.getEkmsPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteEkmsPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEkmsPrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEkmsPrivateEndpointResponse> getEkmsPrivateEndpoint(
            GetEkmsPrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEkmsPrivateEndpointRequest, GetEkmsPrivateEndpointResponse>
                    handler) {

        Validate.notBlank(
                request.getEkmsPrivateEndpointId(), "ekmsPrivateEndpointId must not be blank");

        return clientCall(request, GetEkmsPrivateEndpointResponse::builder)
                .logger(LOG, "getEkmsPrivateEndpoint")
                .serviceDetails(
                        "Ekm",
                        "GetEkmsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/EkmsPrivateEndpoint/GetEkmsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEkmsPrivateEndpointRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("ekmsPrivateEndpoints")
                .appendPathParam(request.getEkmsPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.EkmsPrivateEndpoint.class,
                        GetEkmsPrivateEndpointResponse.Builder::ekmsPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id", GetEkmsPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetEkmsPrivateEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEkmsPrivateEndpointsResponse> listEkmsPrivateEndpoints(
            ListEkmsPrivateEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEkmsPrivateEndpointsRequest, ListEkmsPrivateEndpointsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEkmsPrivateEndpointsResponse::builder)
                .logger(LOG, "listEkmsPrivateEndpoints")
                .serviceDetails(
                        "Ekm",
                        "ListEkmsPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/EkmsPrivateEndpointSummary/ListEkmsPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEkmsPrivateEndpointsRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("ekmsPrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.keymanagement.model.EkmsPrivateEndpointSummary.class,
                        ListEkmsPrivateEndpointsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListEkmsPrivateEndpointsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListEkmsPrivateEndpointsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEkmsPrivateEndpointResponse> updateEkmsPrivateEndpoint(
            UpdateEkmsPrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateEkmsPrivateEndpointRequest, UpdateEkmsPrivateEndpointResponse>
                    handler) {

        Validate.notBlank(
                request.getEkmsPrivateEndpointId(), "ekmsPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEkmsPrivateEndpointDetails(),
                "updateEkmsPrivateEndpointDetails is required");

        return clientCall(request, UpdateEkmsPrivateEndpointResponse::builder)
                .logger(LOG, "updateEkmsPrivateEndpoint")
                .serviceDetails(
                        "Ekm",
                        "UpdateEkmsPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/EkmsPrivateEndpoint/UpdateEkmsPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEkmsPrivateEndpointRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("ekmsPrivateEndpoints")
                .appendPathParam(request.getEkmsPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.EkmsPrivateEndpoint.class,
                        UpdateEkmsPrivateEndpointResponse.Builder::ekmsPrivateEndpoint)
                .handleResponseHeaderString("etag", UpdateEkmsPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEkmsPrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EkmAsyncClient(
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
    public EkmAsyncClient(
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
    public EkmAsyncClient(
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
    public EkmAsyncClient(
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
    public EkmAsyncClient(
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
    public EkmAsyncClient(
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
    public EkmAsyncClient(
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
