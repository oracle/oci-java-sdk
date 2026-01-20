/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.redis.requests.*;
import com.oracle.bmc.redis.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OciCacheUser service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
public class OciCacheUserAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OciCacheUserAsync {
    /** Service instance for OciCacheUser. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OciCacheUserClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://redis.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OciCacheUserAsyncClient.class);

    OciCacheUserAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OciCacheUserAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "redis";
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
        public OciCacheUserAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OciCacheUserAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOciCacheUserCompartmentResponse>
            changeOciCacheUserCompartment(
                    ChangeOciCacheUserCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOciCacheUserCompartmentRequest,
                                    ChangeOciCacheUserCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getOciCacheUserId(), "ociCacheUserId must not be blank");
        Objects.requireNonNull(
                request.getChangeOciCacheUserCompartmentDetails(),
                "changeOciCacheUserCompartmentDetails is required");

        return clientCall(request, ChangeOciCacheUserCompartmentResponse::builder)
                .logger(LOG, "changeOciCacheUserCompartment")
                .serviceDetails(
                        "OciCacheUser",
                        "ChangeOciCacheUserCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheUser/ChangeOciCacheUserCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOciCacheUserCompartmentRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheUsers")
                .appendPathParam(request.getOciCacheUserId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOciCacheUserCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOciCacheUserCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOciCacheUserResponse> createOciCacheUser(
            CreateOciCacheUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOciCacheUserRequest, CreateOciCacheUserResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOciCacheUserDetails(), "createOciCacheUserDetails is required");

        return clientCall(request, CreateOciCacheUserResponse::builder)
                .logger(LOG, "createOciCacheUser")
                .serviceDetails(
                        "OciCacheUser",
                        "CreateOciCacheUser",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/CreateOciCacheUserDetails/CreateOciCacheUser")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOciCacheUserRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheUsers")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheUser.class,
                        CreateOciCacheUserResponse.Builder::ociCacheUser)
                .handleResponseHeaderString("etag", CreateOciCacheUserResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateOciCacheUserResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOciCacheUserResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOciCacheUserResponse> deleteOciCacheUser(
            DeleteOciCacheUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOciCacheUserRequest, DeleteOciCacheUserResponse>
                    handler) {

        Validate.notBlank(request.getOciCacheUserId(), "ociCacheUserId must not be blank");

        return clientCall(request, DeleteOciCacheUserResponse::builder)
                .logger(LOG, "deleteOciCacheUser")
                .serviceDetails(
                        "OciCacheUser",
                        "DeleteOciCacheUser",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheUser/DeleteOciCacheUser")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOciCacheUserRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheUsers")
                .appendPathParam(request.getOciCacheUserId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteOciCacheUserResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOciCacheUserResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOciCacheUserResponse> getOciCacheUser(
            GetOciCacheUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOciCacheUserRequest, GetOciCacheUserResponse>
                    handler) {

        Validate.notBlank(request.getOciCacheUserId(), "ociCacheUserId must not be blank");

        return clientCall(request, GetOciCacheUserResponse::builder)
                .logger(LOG, "getOciCacheUser")
                .serviceDetails(
                        "OciCacheUser",
                        "GetOciCacheUser",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheUser/GetOciCacheUser")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOciCacheUserRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheUsers")
                .appendPathParam(request.getOciCacheUserId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheUser.class,
                        GetOciCacheUserResponse.Builder::ociCacheUser)
                .handleResponseHeaderString(
                        "opc-request-id", GetOciCacheUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetOciCacheUserResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedRedisClustersResponse> listAttachedRedisClusters(
            ListAttachedRedisClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAttachedRedisClustersRequest, ListAttachedRedisClustersResponse>
                    handler) {

        Validate.notBlank(request.getOciCacheUserId(), "ociCacheUserId must not be blank");

        return clientCall(request, ListAttachedRedisClustersResponse::builder)
                .logger(LOG, "listAttachedRedisClusters")
                .serviceDetails(
                        "OciCacheUser",
                        "ListAttachedRedisClusters",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/AttachedOciCacheCluster/ListAttachedRedisClusters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListAttachedRedisClustersRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheUsers")
                .appendPathParam(request.getOciCacheUserId())
                .appendPathParam("actions")
                .appendPathParam("getRedisClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.redis.model.AttachedOciCacheCluster.class,
                        ListAttachedRedisClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAttachedRedisClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAttachedRedisClustersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOciCacheUsersResponse> listOciCacheUsers(
            ListOciCacheUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOciCacheUsersRequest, ListOciCacheUsersResponse>
                    handler) {

        return clientCall(request, ListOciCacheUsersResponse::builder)
                .logger(LOG, "listOciCacheUsers")
                .serviceDetails(
                        "OciCacheUser",
                        "ListOciCacheUsers",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheUserSummary/ListOciCacheUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOciCacheUsersRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheUsers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheUserCollection.class,
                        ListOciCacheUsersResponse.Builder::ociCacheUserCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOciCacheUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOciCacheUsersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOciCacheUserResponse> updateOciCacheUser(
            UpdateOciCacheUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOciCacheUserRequest, UpdateOciCacheUserResponse>
                    handler) {

        Validate.notBlank(request.getOciCacheUserId(), "ociCacheUserId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOciCacheUserDetails(), "updateOciCacheUserDetails is required");

        return clientCall(request, UpdateOciCacheUserResponse::builder)
                .logger(LOG, "updateOciCacheUser")
                .serviceDetails(
                        "OciCacheUser",
                        "UpdateOciCacheUser",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheUser/UpdateOciCacheUser")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOciCacheUserRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheUsers")
                .appendPathParam(request.getOciCacheUserId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateOciCacheUserResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOciCacheUserResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OciCacheUserAsyncClient(
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
    public OciCacheUserAsyncClient(
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
    public OciCacheUserAsyncClient(
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
    public OciCacheUserAsyncClient(
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
    public OciCacheUserAsyncClient(
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
    public OciCacheUserAsyncClient(
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
    public OciCacheUserAsyncClient(
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
