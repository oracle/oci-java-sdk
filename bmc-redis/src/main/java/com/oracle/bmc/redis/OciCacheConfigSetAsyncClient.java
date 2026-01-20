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
 * Async client implementation for OciCacheConfigSet service. <br>
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
public class OciCacheConfigSetAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OciCacheConfigSetAsync {
    /** Service instance for OciCacheConfigSet. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OciCacheConfigSetClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://redis.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OciCacheConfigSetAsyncClient.class);

    OciCacheConfigSetAsyncClient(
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
                    Builder, OciCacheConfigSetAsyncClient> {
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
        public OciCacheConfigSetAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OciCacheConfigSetAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOciCacheConfigSetCompartmentResponse>
            changeOciCacheConfigSetCompartment(
                    ChangeOciCacheConfigSetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOciCacheConfigSetCompartmentRequest,
                                    ChangeOciCacheConfigSetCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");
        Objects.requireNonNull(
                request.getChangeOciCacheConfigSetCompartmentDetails(),
                "changeOciCacheConfigSetCompartmentDetails is required");

        return clientCall(request, ChangeOciCacheConfigSetCompartmentResponse::builder)
                .logger(LOG, "changeOciCacheConfigSetCompartment")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "ChangeOciCacheConfigSetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/ChangeOciCacheConfigSetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOciCacheConfigSetCompartmentRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOciCacheConfigSetCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOciCacheConfigSetCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOciCacheConfigSetResponse> createOciCacheConfigSet(
            CreateOciCacheConfigSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOciCacheConfigSetRequest, CreateOciCacheConfigSetResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOciCacheConfigSetDetails(),
                "createOciCacheConfigSetDetails is required");

        return clientCall(request, CreateOciCacheConfigSetResponse::builder)
                .logger(LOG, "createOciCacheConfigSet")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "CreateOciCacheConfigSet",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/CreateOciCacheConfigSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOciCacheConfigSetRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheConfigSet.class,
                        CreateOciCacheConfigSetResponse.Builder::ociCacheConfigSet)
                .handleResponseHeaderString("etag", CreateOciCacheConfigSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOciCacheConfigSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOciCacheConfigSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOciCacheConfigSetResponse> deleteOciCacheConfigSet(
            DeleteOciCacheConfigSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOciCacheConfigSetRequest, DeleteOciCacheConfigSetResponse>
                    handler) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");

        return clientCall(request, DeleteOciCacheConfigSetResponse::builder)
                .logger(LOG, "deleteOciCacheConfigSet")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "DeleteOciCacheConfigSet",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/DeleteOciCacheConfigSet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOciCacheConfigSetRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOciCacheConfigSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOciCacheConfigSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOciCacheConfigSetResponse> getOciCacheConfigSet(
            GetOciCacheConfigSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOciCacheConfigSetRequest, GetOciCacheConfigSetResponse>
                    handler) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");

        return clientCall(request, GetOciCacheConfigSetResponse::builder)
                .logger(LOG, "getOciCacheConfigSet")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "GetOciCacheConfigSet",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/GetOciCacheConfigSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOciCacheConfigSetRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheConfigSet.class,
                        GetOciCacheConfigSetResponse.Builder::ociCacheConfigSet)
                .handleResponseHeaderString("etag", GetOciCacheConfigSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOciCacheConfigSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedOciCacheClustersResponse>
            listAssociatedOciCacheClusters(
                    ListAssociatedOciCacheClustersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAssociatedOciCacheClustersRequest,
                                    ListAssociatedOciCacheClustersResponse>
                            handler) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");

        return clientCall(request, ListAssociatedOciCacheClustersResponse::builder)
                .logger(LOG, "listAssociatedOciCacheClusters")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "ListAssociatedOciCacheClusters",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/AssociatedOciCacheClusterSummary/ListAssociatedOciCacheClusters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListAssociatedOciCacheClustersRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .appendPathParam("actions")
                .appendPathParam("listAssociatedOciCacheClusters")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.redis.model.AssociatedOciCacheClusterCollection.class,
                        ListAssociatedOciCacheClustersResponse.Builder
                                ::associatedOciCacheClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAssociatedOciCacheClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAssociatedOciCacheClustersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOciCacheConfigSetsResponse> listOciCacheConfigSets(
            ListOciCacheConfigSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOciCacheConfigSetsRequest, ListOciCacheConfigSetsResponse>
                    handler) {

        return clientCall(request, ListOciCacheConfigSetsResponse::builder)
                .logger(LOG, "listOciCacheConfigSets")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "ListOciCacheConfigSets",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSetSummary/ListOciCacheConfigSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOciCacheConfigSetsRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("softwareVersion", request.getSoftwareVersion())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheConfigSetCollection.class,
                        ListOciCacheConfigSetsResponse.Builder::ociCacheConfigSetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOciCacheConfigSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOciCacheConfigSetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOciCacheConfigSetResponse> updateOciCacheConfigSet(
            UpdateOciCacheConfigSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOciCacheConfigSetRequest, UpdateOciCacheConfigSetResponse>
                    handler) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOciCacheConfigSetDetails(),
                "updateOciCacheConfigSetDetails is required");

        return clientCall(request, UpdateOciCacheConfigSetResponse::builder)
                .logger(LOG, "updateOciCacheConfigSet")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "UpdateOciCacheConfigSet",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/UpdateOciCacheConfigSet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOciCacheConfigSetRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOciCacheConfigSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOciCacheConfigSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OciCacheConfigSetAsyncClient(
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
    public OciCacheConfigSetAsyncClient(
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
    public OciCacheConfigSetAsyncClient(
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
    public OciCacheConfigSetAsyncClient(
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
    public OciCacheConfigSetAsyncClient(
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
    public OciCacheConfigSetAsyncClient(
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
    public OciCacheConfigSetAsyncClient(
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
