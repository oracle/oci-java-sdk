/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emwarehouse;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.emwarehouse.requests.*;
import com.oracle.bmc.emwarehouse.responses.*;

import java.util.Objects;

/**
 * Async client implementation for EmWarehouse service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class EmWarehouseAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements EmWarehouseAsync {
    /** Service instance for EmWarehouse. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(EmWarehouseClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operationsinsights.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EmWarehouseAsyncClient.class);

    EmWarehouseAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, EmWarehouseAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "emwarehouse";
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
        public EmWarehouseAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new EmWarehouseAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails("EmWarehouse", "CancelWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20180828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeEmWarehouseCompartmentResponse>
            changeEmWarehouseCompartment(
                    ChangeEmWarehouseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeEmWarehouseCompartmentRequest,
                                    ChangeEmWarehouseCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getEmWarehouseId(), "emWarehouseId must not be blank");
        Objects.requireNonNull(
                request.getChangeEmWarehouseCompartmentDetails(),
                "changeEmWarehouseCompartmentDetails is required");

        return clientCall(request, ChangeEmWarehouseCompartmentResponse::builder)
                .logger(LOG, "changeEmWarehouseCompartment")
                .serviceDetails("EmWarehouse", "ChangeEmWarehouseCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeEmWarehouseCompartmentRequest::builder)
                .basePath("/20180828")
                .appendPathParam("emWarehouses")
                .appendPathParam(request.getEmWarehouseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeEmWarehouseCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeEmWarehouseCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEmWarehouseResponse> createEmWarehouse(
            CreateEmWarehouseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEmWarehouseRequest, CreateEmWarehouseResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateEmWarehouseDetails(), "createEmWarehouseDetails is required");

        return clientCall(request, CreateEmWarehouseResponse::builder)
                .logger(LOG, "createEmWarehouse")
                .serviceDetails("EmWarehouse", "CreateEmWarehouse", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEmWarehouseRequest::builder)
                .basePath("/20180828")
                .appendPathParam("emWarehouses")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateEmWarehouseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEmWarehouseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEmWarehouseResponse> deleteEmWarehouse(
            DeleteEmWarehouseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEmWarehouseRequest, DeleteEmWarehouseResponse>
                    handler) {

        Validate.notBlank(request.getEmWarehouseId(), "emWarehouseId must not be blank");

        return clientCall(request, DeleteEmWarehouseResponse::builder)
                .logger(LOG, "deleteEmWarehouse")
                .serviceDetails("EmWarehouse", "DeleteEmWarehouse", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEmWarehouseRequest::builder)
                .basePath("/20180828")
                .appendPathParam("emWarehouses")
                .appendPathParam(request.getEmWarehouseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteEmWarehouseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEmWarehouseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEmWarehouseResponse> getEmWarehouse(
            GetEmWarehouseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEmWarehouseRequest, GetEmWarehouseResponse>
                    handler) {

        Validate.notBlank(request.getEmWarehouseId(), "emWarehouseId must not be blank");

        return clientCall(request, GetEmWarehouseResponse::builder)
                .logger(LOG, "getEmWarehouse")
                .serviceDetails("EmWarehouse", "GetEmWarehouse", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEmWarehouseRequest::builder)
                .basePath("/20180828")
                .appendPathParam("emWarehouses")
                .appendPathParam(request.getEmWarehouseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.emwarehouse.model.EmWarehouse.class,
                        GetEmWarehouseResponse.Builder::emWarehouse)
                .handleResponseHeaderString("etag", GetEmWarehouseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEmWarehouseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEmWarehouseResourceUsageResponse>
            getEmWarehouseResourceUsage(
                    GetEmWarehouseResourceUsageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetEmWarehouseResourceUsageRequest,
                                    GetEmWarehouseResourceUsageResponse>
                            handler) {

        Validate.notBlank(request.getEmWarehouseId(), "emWarehouseId must not be blank");

        return clientCall(request, GetEmWarehouseResourceUsageResponse::builder)
                .logger(LOG, "getEmWarehouseResourceUsage")
                .serviceDetails("EmWarehouse", "GetEmWarehouseResourceUsage", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEmWarehouseResourceUsageRequest::builder)
                .basePath("/20180828")
                .appendPathParam("emWarehouses")
                .appendPathParam(request.getEmWarehouseId())
                .appendPathParam("resourceUsage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.emwarehouse.model.ResourceUsage.class,
                        GetEmWarehouseResourceUsageResponse.Builder::resourceUsage)
                .handleResponseHeaderString(
                        "etag", GetEmWarehouseResourceUsageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEmWarehouseResourceUsageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails("EmWarehouse", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20180828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.emwarehouse.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEmWarehousesResponse> listEmWarehouses(
            ListEmWarehousesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEmWarehousesRequest, ListEmWarehousesResponse>
                    handler) {

        return clientCall(request, ListEmWarehousesResponse::builder)
                .logger(LOG, "listEmWarehouses")
                .serviceDetails("EmWarehouse", "ListEmWarehouses", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEmWarehousesRequest::builder)
                .basePath("/20180828")
                .appendPathParam("emWarehouses")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "operationsInsightsWarehouseId", request.getOperationsInsightsWarehouseId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.emwarehouse.model.EmWarehouseCollection.class,
                        ListEmWarehousesResponse.Builder::emWarehouseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEmWarehousesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEmWarehousesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEtlRunsResponse> listEtlRuns(
            ListEtlRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListEtlRunsRequest, ListEtlRunsResponse>
                    handler) {

        Validate.notBlank(request.getEmWarehouseId(), "emWarehouseId must not be blank");

        return clientCall(request, ListEtlRunsResponse::builder)
                .logger(LOG, "listEtlRuns")
                .serviceDetails("EmWarehouse", "ListEtlRuns", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEtlRunsRequest::builder)
                .basePath("/20180828")
                .appendPathParam("emWarehouses")
                .appendPathParam(request.getEmWarehouseId())
                .appendPathParam("etlRuns")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.emwarehouse.model.EtlRunCollection.class,
                        ListEtlRunsResponse.Builder::etlRunCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEtlRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEtlRunsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails("EmWarehouse", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20180828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.emwarehouse.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails("EmWarehouse", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20180828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.emwarehouse.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails("EmWarehouse", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20180828")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.emwarehouse.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEmWarehouseResponse> updateEmWarehouse(
            UpdateEmWarehouseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateEmWarehouseRequest, UpdateEmWarehouseResponse>
                    handler) {

        Validate.notBlank(request.getEmWarehouseId(), "emWarehouseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEmWarehouseDetails(), "updateEmWarehouseDetails is required");

        return clientCall(request, UpdateEmWarehouseResponse::builder)
                .logger(LOG, "updateEmWarehouse")
                .serviceDetails("EmWarehouse", "UpdateEmWarehouse", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEmWarehouseRequest::builder)
                .basePath("/20180828")
                .appendPathParam("emWarehouses")
                .appendPathParam(request.getEmWarehouseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateEmWarehouseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEmWarehouseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EmWarehouseAsyncClient(
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
    public EmWarehouseAsyncClient(
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
    public EmWarehouseAsyncClient(
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
    public EmWarehouseAsyncClient(
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
    public EmWarehouseAsyncClient(
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
    public EmWarehouseAsyncClient(
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
    public EmWarehouseAsyncClient(
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
