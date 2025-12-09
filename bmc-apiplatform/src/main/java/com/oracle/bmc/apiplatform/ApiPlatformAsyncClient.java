/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiplatform;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apiplatform.requests.*;
import com.oracle.bmc.apiplatform.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ApiPlatform service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240829")
public class ApiPlatformAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ApiPlatformAsync {
    /** Service instance for ApiPlatform. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ApiPlatformClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apip.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApiPlatformAsyncClient.class);

    ApiPlatformAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ApiPlatformAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apiplatform";
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
        public ApiPlatformAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApiPlatformAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeApiPlatformInstanceCompartmentResponse>
            changeApiPlatformInstanceCompartment(
                    ChangeApiPlatformInstanceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeApiPlatformInstanceCompartmentRequest,
                                    ChangeApiPlatformInstanceCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getApiPlatformInstanceId(), "apiPlatformInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeApiPlatformInstanceCompartmentDetails(),
                "changeApiPlatformInstanceCompartmentDetails is required");

        return clientCall(request, ChangeApiPlatformInstanceCompartmentResponse::builder)
                .logger(LOG, "changeApiPlatformInstanceCompartment")
                .serviceDetails("ApiPlatform", "ChangeApiPlatformInstanceCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeApiPlatformInstanceCompartmentRequest::builder)
                .basePath("/20240829")
                .appendPathParam("apiPlatformInstances")
                .appendPathParam(request.getApiPlatformInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeApiPlatformInstanceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateApiPlatformInstanceResponse> createApiPlatformInstance(
            CreateApiPlatformInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateApiPlatformInstanceRequest, CreateApiPlatformInstanceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateApiPlatformInstanceDetails(),
                "createApiPlatformInstanceDetails is required");

        return clientCall(request, CreateApiPlatformInstanceResponse::builder)
                .logger(LOG, "createApiPlatformInstance")
                .serviceDetails("ApiPlatform", "CreateApiPlatformInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApiPlatformInstanceRequest::builder)
                .basePath("/20240829")
                .appendPathParam("apiPlatformInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apiplatform.model.ApiPlatformInstance.class,
                        CreateApiPlatformInstanceResponse.Builder::apiPlatformInstance)
                .handleResponseHeaderString(
                        "location", CreateApiPlatformInstanceResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateApiPlatformInstanceResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateApiPlatformInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateApiPlatformInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApiPlatformInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiPlatformInstanceResponse> deleteApiPlatformInstance(
            DeleteApiPlatformInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteApiPlatformInstanceRequest, DeleteApiPlatformInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getApiPlatformInstanceId(), "apiPlatformInstanceId must not be blank");

        return clientCall(request, DeleteApiPlatformInstanceResponse::builder)
                .logger(LOG, "deleteApiPlatformInstance")
                .serviceDetails("ApiPlatform", "DeleteApiPlatformInstance", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApiPlatformInstanceRequest::builder)
                .basePath("/20240829")
                .appendPathParam("apiPlatformInstances")
                .appendPathParam(request.getApiPlatformInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteApiPlatformInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApiPlatformInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApiPlatformInstanceResponse> getApiPlatformInstance(
            GetApiPlatformInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApiPlatformInstanceRequest, GetApiPlatformInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getApiPlatformInstanceId(), "apiPlatformInstanceId must not be blank");

        return clientCall(request, GetApiPlatformInstanceResponse::builder)
                .logger(LOG, "getApiPlatformInstance")
                .serviceDetails("ApiPlatform", "GetApiPlatformInstance", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApiPlatformInstanceRequest::builder)
                .basePath("/20240829")
                .appendPathParam("apiPlatformInstances")
                .appendPathParam(request.getApiPlatformInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apiplatform.model.ApiPlatformInstance.class,
                        GetApiPlatformInstanceResponse.Builder::apiPlatformInstance)
                .handleResponseHeaderString("etag", GetApiPlatformInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApiPlatformInstanceResponse.Builder::opcRequestId)
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
                .serviceDetails("ApiPlatform", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20240829")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apiplatform.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApiPlatformInstancesResponse> listApiPlatformInstances(
            ListApiPlatformInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApiPlatformInstancesRequest, ListApiPlatformInstancesResponse>
                    handler) {

        return clientCall(request, ListApiPlatformInstancesResponse::builder)
                .logger(LOG, "listApiPlatformInstances")
                .serviceDetails("ApiPlatform", "ListApiPlatformInstances", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApiPlatformInstancesRequest::builder)
                .basePath("/20240829")
                .appendPathParam("apiPlatformInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apiplatform.model.ApiPlatformInstanceCollection.class,
                        ListApiPlatformInstancesResponse.Builder::apiPlatformInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApiPlatformInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApiPlatformInstancesResponse.Builder::opcNextPage)
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
                .serviceDetails("ApiPlatform", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20240829")
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
                        com.oracle.bmc.apiplatform.model.WorkRequestErrorCollection.class,
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
                .serviceDetails("ApiPlatform", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20240829")
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
                        com.oracle.bmc.apiplatform.model.WorkRequestLogEntryCollection.class,
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
                .serviceDetails("ApiPlatform", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20240829")
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
                        com.oracle.bmc.apiplatform.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiPlatformInstanceResponse> updateApiPlatformInstance(
            UpdateApiPlatformInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateApiPlatformInstanceRequest, UpdateApiPlatformInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getApiPlatformInstanceId(), "apiPlatformInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateApiPlatformInstanceDetails(),
                "updateApiPlatformInstanceDetails is required");

        return clientCall(request, UpdateApiPlatformInstanceResponse::builder)
                .logger(LOG, "updateApiPlatformInstance")
                .serviceDetails("ApiPlatform", "UpdateApiPlatformInstance", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApiPlatformInstanceRequest::builder)
                .basePath("/20240829")
                .appendPathParam("apiPlatformInstances")
                .appendPathParam(request.getApiPlatformInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apiplatform.model.ApiPlatformInstance.class,
                        UpdateApiPlatformInstanceResponse.Builder::apiPlatformInstance)
                .handleResponseHeaderString("etag", UpdateApiPlatformInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApiPlatformInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApiPlatformAsyncClient(
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
    public ApiPlatformAsyncClient(
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
    public ApiPlatformAsyncClient(
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
    public ApiPlatformAsyncClient(
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
    public ApiPlatformAsyncClient(
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
    public ApiPlatformAsyncClient(
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
    public ApiPlatformAsyncClient(
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
