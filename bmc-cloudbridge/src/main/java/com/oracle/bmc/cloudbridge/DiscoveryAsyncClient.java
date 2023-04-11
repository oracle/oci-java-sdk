/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Discovery service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class DiscoveryAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DiscoveryAsync {
    /** Service instance for Discovery. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DISCOVERY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://cloudbridge.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DiscoveryAsyncClient.class);

    DiscoveryAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DiscoveryAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public DiscoveryAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DiscoveryAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeAssetSourceCompartmentResponse>
            changeAssetSourceCompartment(
                    ChangeAssetSourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAssetSourceCompartmentRequest,
                                    ChangeAssetSourceCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");
        Objects.requireNonNull(
                request.getChangeAssetSourceCompartmentDetails(),
                "changeAssetSourceCompartmentDetails is required");

        return clientCall(request, ChangeAssetSourceCompartmentResponse::builder)
                .logger(LOG, "changeAssetSourceCompartment")
                .serviceDetails(
                        "Discovery",
                        "ChangeAssetSourceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/ChangeAssetSourceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAssetSourceCompartmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAssetSourceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDiscoveryScheduleCompartmentResponse>
            changeDiscoveryScheduleCompartment(
                    ChangeDiscoveryScheduleCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDiscoveryScheduleCompartmentRequest,
                                    ChangeDiscoveryScheduleCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getDiscoveryScheduleId(), "discoveryScheduleId must not be blank");
        Objects.requireNonNull(
                request.getChangeDiscoveryScheduleCompartmentDetails(),
                "changeDiscoveryScheduleCompartmentDetails is required");

        return clientCall(request, ChangeDiscoveryScheduleCompartmentResponse::builder)
                .logger(LOG, "changeDiscoveryScheduleCompartment")
                .serviceDetails(
                        "Discovery",
                        "ChangeDiscoveryScheduleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/ChangeDiscoveryScheduleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDiscoveryScheduleCompartmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendPathParam(request.getDiscoveryScheduleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDiscoveryScheduleCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAssetSourceResponse> createAssetSource(
            CreateAssetSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAssetSourceRequest, CreateAssetSourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAssetSourceDetails(), "createAssetSourceDetails is required");

        return clientCall(request, CreateAssetSourceResponse::builder)
                .logger(LOG, "createAssetSource")
                .serviceDetails(
                        "Discovery",
                        "CreateAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/CreateAssetSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetSource.class,
                        CreateAssetSourceResponse.Builder::assetSource)
                .handleResponseHeaderString("etag", CreateAssetSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAssetSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateAssetSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("Location", CreateAssetSourceResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDiscoveryScheduleResponse> createDiscoverySchedule(
            CreateDiscoveryScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDiscoveryScheduleRequest, CreateDiscoveryScheduleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDiscoveryScheduleDetails(),
                "createDiscoveryScheduleDetails is required");

        return clientCall(request, CreateDiscoveryScheduleResponse::builder)
                .logger(LOG, "createDiscoverySchedule")
                .serviceDetails(
                        "Discovery",
                        "CreateDiscoverySchedule",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/CreateDiscoverySchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDiscoveryScheduleRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.DiscoverySchedule.class,
                        CreateDiscoveryScheduleResponse.Builder::discoverySchedule)
                .handleResponseHeaderString("etag", CreateDiscoveryScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDiscoveryScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetSourceResponse> deleteAssetSource(
            DeleteAssetSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAssetSourceRequest, DeleteAssetSourceResponse>
                    handler) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");

        return clientCall(request, DeleteAssetSourceResponse::builder)
                .logger(LOG, "deleteAssetSource")
                .serviceDetails(
                        "Discovery",
                        "DeleteAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/DeleteAssetSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAssetSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAssetSourceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscoveryScheduleResponse> deleteDiscoverySchedule(
            DeleteDiscoveryScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryScheduleRequest, DeleteDiscoveryScheduleResponse>
                    handler) {

        Validate.notBlank(
                request.getDiscoveryScheduleId(), "discoveryScheduleId must not be blank");

        return clientCall(request, DeleteDiscoveryScheduleResponse::builder)
                .logger(LOG, "deleteDiscoverySchedule")
                .serviceDetails(
                        "Discovery",
                        "DeleteDiscoverySchedule",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/DeleteDiscoverySchedule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDiscoveryScheduleRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendPathParam(request.getDiscoveryScheduleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDiscoveryScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAssetSourceResponse> getAssetSource(
            GetAssetSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAssetSourceRequest, GetAssetSourceResponse>
                    handler) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");

        return clientCall(request, GetAssetSourceResponse::builder)
                .logger(LOG, "getAssetSource")
                .serviceDetails(
                        "Discovery",
                        "GetAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/GetAssetSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetSource.class,
                        GetAssetSourceResponse.Builder::assetSource)
                .handleResponseHeaderString("etag", GetAssetSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAssetSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveryScheduleResponse> getDiscoverySchedule(
            GetDiscoveryScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryScheduleRequest, GetDiscoveryScheduleResponse>
                    handler) {

        Validate.notBlank(
                request.getDiscoveryScheduleId(), "discoveryScheduleId must not be blank");

        return clientCall(request, GetDiscoveryScheduleResponse::builder)
                .logger(LOG, "getDiscoverySchedule")
                .serviceDetails(
                        "Discovery",
                        "GetDiscoverySchedule",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/GetDiscoverySchedule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDiscoveryScheduleRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendPathParam(request.getDiscoveryScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.DiscoverySchedule.class,
                        GetDiscoveryScheduleResponse.Builder::discoverySchedule)
                .handleResponseHeaderString("etag", GetDiscoveryScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDiscoveryScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssetSourceConnectionsResponse>
            listAssetSourceConnections(
                    ListAssetSourceConnectionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAssetSourceConnectionsRequest,
                                    ListAssetSourceConnectionsResponse>
                            handler) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");

        return clientCall(request, ListAssetSourceConnectionsResponse::builder)
                .logger(LOG, "listAssetSourceConnections")
                .serviceDetails(
                        "Discovery",
                        "ListAssetSourceConnections",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/ListAssetSourceConnections")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListAssetSourceConnectionsRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .appendPathParam("actions")
                .appendPathParam("listConnections")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetSourceConnectionCollection.class,
                        ListAssetSourceConnectionsResponse.Builder::assetSourceConnectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssetSourceConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssetSourceConnectionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssetSourcesResponse> listAssetSources(
            ListAssetSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssetSourcesRequest, ListAssetSourcesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAssetSourcesResponse::builder)
                .logger(LOG, "listAssetSources")
                .serviceDetails(
                        "Discovery",
                        "ListAssetSources",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/ListAssetSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAssetSourcesRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendQueryParam("assetSourceId", request.getAssetSourceId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetSourceCollection.class,
                        ListAssetSourcesResponse.Builder::assetSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssetSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssetSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoverySchedulesResponse> listDiscoverySchedules(
            ListDiscoverySchedulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoverySchedulesRequest, ListDiscoverySchedulesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDiscoverySchedulesResponse::builder)
                .logger(LOG, "listDiscoverySchedules")
                .serviceDetails(
                        "Discovery",
                        "ListDiscoverySchedules",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/ListDiscoverySchedules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDiscoverySchedulesRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendQueryParam("discoveryScheduleId", request.getDiscoveryScheduleId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.DiscoveryScheduleCollection.class,
                        ListDiscoverySchedulesResponse.Builder::discoveryScheduleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDiscoverySchedulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDiscoverySchedulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshAssetSourceResponse> refreshAssetSource(
            RefreshAssetSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshAssetSourceRequest, RefreshAssetSourceResponse>
                    handler) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");

        return clientCall(request, RefreshAssetSourceResponse::builder)
                .logger(LOG, "refreshAssetSource")
                .serviceDetails(
                        "Discovery",
                        "RefreshAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/RefreshAssetSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", RefreshAssetSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RefreshAssetSourceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetSourceResponse> updateAssetSource(
            UpdateAssetSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAssetSourceRequest, UpdateAssetSourceResponse>
                    handler) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAssetSourceDetails(), "updateAssetSourceDetails is required");

        return clientCall(request, UpdateAssetSourceResponse::builder)
                .logger(LOG, "updateAssetSource")
                .serviceDetails(
                        "Discovery",
                        "UpdateAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/UpdateAssetSource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAssetSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAssetSourceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDiscoveryScheduleResponse> updateDiscoverySchedule(
            UpdateDiscoveryScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDiscoveryScheduleRequest, UpdateDiscoveryScheduleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateDiscoveryScheduleDetails(),
                "updateDiscoveryScheduleDetails is required");

        Validate.notBlank(
                request.getDiscoveryScheduleId(), "discoveryScheduleId must not be blank");

        return clientCall(request, UpdateDiscoveryScheduleResponse::builder)
                .logger(LOG, "updateDiscoverySchedule")
                .serviceDetails(
                        "Discovery",
                        "UpdateDiscoverySchedule",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/UpdateDiscoverySchedule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDiscoveryScheduleRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendPathParam(request.getDiscoveryScheduleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.DiscoverySchedule.class,
                        UpdateDiscoveryScheduleResponse.Builder::discoverySchedule)
                .handleResponseHeaderString("etag", UpdateDiscoveryScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDiscoveryScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DiscoveryAsyncClient(
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
    public DiscoveryAsyncClient(
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
    public DiscoveryAsyncClient(
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
    public DiscoveryAsyncClient(
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
    public DiscoveryAsyncClient(
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
    public DiscoveryAsyncClient(
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
    public DiscoveryAsyncClient(
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
