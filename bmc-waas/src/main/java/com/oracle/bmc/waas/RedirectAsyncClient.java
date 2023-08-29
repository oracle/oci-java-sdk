/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Redirect service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class RedirectAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements RedirectAsync {
    /** Service instance for Redirect. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("REDIRECT")
                    .serviceEndpointPrefix("waas")
                    .serviceEndpointTemplate("https://waas.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RedirectAsyncClient.class);

    RedirectAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, RedirectAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "waas";
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
        public RedirectAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RedirectAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeHttpRedirectCompartmentResponse>
            changeHttpRedirectCompartment(
                    ChangeHttpRedirectCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeHttpRedirectCompartmentRequest,
                                    ChangeHttpRedirectCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getHttpRedirectId(), "httpRedirectId must not be blank");
        Objects.requireNonNull(
                request.getChangeHttpRedirectCompartmentDetails(),
                "changeHttpRedirectCompartmentDetails is required");

        return clientCall(request, ChangeHttpRedirectCompartmentResponse::builder)
                .logger(LOG, "changeHttpRedirectCompartment")
                .serviceDetails(
                        "Redirect",
                        "ChangeHttpRedirectCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HttpRedirect/ChangeHttpRedirectCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeHttpRedirectCompartmentRequest::builder)
                .basePath("/20181116")
                .appendPathParam("httpRedirects")
                .appendPathParam(request.getHttpRedirectId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeHttpRedirectCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateHttpRedirectResponse> createHttpRedirect(
            CreateHttpRedirectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateHttpRedirectRequest, CreateHttpRedirectResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateHttpRedirectDetails(), "createHttpRedirectDetails is required");

        return clientCall(request, CreateHttpRedirectResponse::builder)
                .logger(LOG, "createHttpRedirect")
                .serviceDetails(
                        "Redirect",
                        "CreateHttpRedirect",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HttpRedirect/CreateHttpRedirect")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateHttpRedirectRequest::builder)
                .basePath("/20181116")
                .appendPathParam("httpRedirects")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateHttpRedirectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateHttpRedirectResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteHttpRedirectResponse> deleteHttpRedirect(
            DeleteHttpRedirectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteHttpRedirectRequest, DeleteHttpRedirectResponse>
                    handler) {

        Validate.notBlank(request.getHttpRedirectId(), "httpRedirectId must not be blank");

        return clientCall(request, DeleteHttpRedirectResponse::builder)
                .logger(LOG, "deleteHttpRedirect")
                .serviceDetails(
                        "Redirect",
                        "DeleteHttpRedirect",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HttpRedirect/DeleteHttpRedirect")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHttpRedirectRequest::builder)
                .basePath("/20181116")
                .appendPathParam("httpRedirects")
                .appendPathParam(request.getHttpRedirectId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteHttpRedirectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteHttpRedirectResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHttpRedirectResponse> getHttpRedirect(
            GetHttpRedirectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHttpRedirectRequest, GetHttpRedirectResponse>
                    handler) {

        Validate.notBlank(request.getHttpRedirectId(), "httpRedirectId must not be blank");

        return clientCall(request, GetHttpRedirectResponse::builder)
                .logger(LOG, "getHttpRedirect")
                .serviceDetails(
                        "Redirect",
                        "GetHttpRedirect",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HttpRedirect/GetHttpRedirect")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHttpRedirectRequest::builder)
                .basePath("/20181116")
                .appendPathParam("httpRedirects")
                .appendPathParam(request.getHttpRedirectId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.waas.model.HttpRedirect.class,
                        GetHttpRedirectResponse.Builder::httpRedirect)
                .handleResponseHeaderString("etag", GetHttpRedirectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetHttpRedirectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListHttpRedirectsResponse> listHttpRedirects(
            ListHttpRedirectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHttpRedirectsRequest, ListHttpRedirectsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListHttpRedirectsResponse::builder)
                .logger(LOG, "listHttpRedirects")
                .serviceDetails(
                        "Redirect",
                        "ListHttpRedirects",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HttpRedirect/ListHttpRedirects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHttpRedirectsRequest::builder)
                .basePath("/20181116")
                .appendPathParam("httpRedirects")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "id",
                        request.getId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.waas.model.HttpRedirectSummary.class,
                        ListHttpRedirectsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListHttpRedirectsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListHttpRedirectsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateHttpRedirectResponse> updateHttpRedirect(
            UpdateHttpRedirectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHttpRedirectRequest, UpdateHttpRedirectResponse>
                    handler) {

        Validate.notBlank(request.getHttpRedirectId(), "httpRedirectId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHttpRedirectDetails(), "updateHttpRedirectDetails is required");

        return clientCall(request, UpdateHttpRedirectResponse::builder)
                .logger(LOG, "updateHttpRedirect")
                .serviceDetails(
                        "Redirect",
                        "UpdateHttpRedirect",
                        "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HttpRedirect/UpdateHttpRedirect")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHttpRedirectRequest::builder)
                .basePath("/20181116")
                .appendPathParam("httpRedirects")
                .appendPathParam(request.getHttpRedirectId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHttpRedirectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateHttpRedirectResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RedirectAsyncClient(
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
    public RedirectAsyncClient(
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
    public RedirectAsyncClient(
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
    public RedirectAsyncClient(
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
    public RedirectAsyncClient(
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
    public RedirectAsyncClient(
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
    public RedirectAsyncClient(
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
