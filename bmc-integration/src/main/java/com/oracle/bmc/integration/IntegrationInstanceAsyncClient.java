/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.integration.requests.*;
import com.oracle.bmc.integration.responses.*;

import java.util.Objects;

/**
 * Async client implementation for IntegrationInstance service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
public class IntegrationInstanceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements IntegrationInstanceAsync {
    /** Service instance for IntegrationInstance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("INTEGRATIONINSTANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://integration.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IntegrationInstanceAsyncClient.class);

    IntegrationInstanceAsyncClient(
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
                    Builder, IntegrationInstanceAsyncClient> {
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
        public IntegrationInstanceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new IntegrationInstanceAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeIntegrationInstanceCompartmentResponse>
            changeIntegrationInstanceCompartment(
                    ChangeIntegrationInstanceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIntegrationInstanceCompartmentRequest,
                                    ChangeIntegrationInstanceCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeIntegrationInstanceCompartmentDetails(),
                "changeIntegrationInstanceCompartmentDetails is required");

        return clientCall(request, ChangeIntegrationInstanceCompartmentResponse::builder)
                .logger(LOG, "changeIntegrationInstanceCompartment")
                .serviceDetails(
                        "IntegrationInstance",
                        "ChangeIntegrationInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/ChangeIntegrationInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIntegrationInstanceCompartmentRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIntegrationInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIntegrationInstanceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeIntegrationInstanceNetworkEndpointResponse>
            changeIntegrationInstanceNetworkEndpoint(
                    ChangeIntegrationInstanceNetworkEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIntegrationInstanceNetworkEndpointRequest,
                                    ChangeIntegrationInstanceNetworkEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeIntegrationInstanceNetworkEndpointDetails(),
                "changeIntegrationInstanceNetworkEndpointDetails is required");

        return clientCall(request, ChangeIntegrationInstanceNetworkEndpointResponse::builder)
                .logger(LOG, "changeIntegrationInstanceNetworkEndpoint")
                .serviceDetails(
                        "IntegrationInstance",
                        "ChangeIntegrationInstanceNetworkEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/ChangeIntegrationInstanceNetworkEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIntegrationInstanceNetworkEndpointRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeNetworkEndpoint")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIntegrationInstanceNetworkEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIntegrationInstanceNetworkEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIntegrationInstanceResponse> createIntegrationInstance(
            CreateIntegrationInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIntegrationInstanceRequest, CreateIntegrationInstanceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateIntegrationInstanceDetails(),
                "createIntegrationInstanceDetails is required");

        return clientCall(request, CreateIntegrationInstanceResponse::builder)
                .logger(LOG, "createIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "CreateIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/CreateIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIntegrationInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationInstanceResponse> deleteIntegrationInstance(
            DeleteIntegrationInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIntegrationInstanceRequest, DeleteIntegrationInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, DeleteIntegrationInstanceResponse::builder)
                .logger(LOG, "deleteIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "DeleteIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/DeleteIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIntegrationInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationInstanceResponse> getIntegrationInstance(
            GetIntegrationInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIntegrationInstanceRequest, GetIntegrationInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, GetIntegrationInstanceResponse::builder)
                .logger(LOG, "getIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "GetIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/GetIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.integration.model.IntegrationInstance.class,
                        GetIntegrationInstanceResponse.Builder::integrationInstance)
                .handleResponseHeaderString("etag", GetIntegrationInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIntegrationInstanceResponse.Builder::opcRequestId)
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
                .serviceDetails(
                        "IntegrationInstance",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20190131")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.integration.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIntegrationInstancesResponse> listIntegrationInstances(
            ListIntegrationInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIntegrationInstancesRequest, ListIntegrationInstancesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIntegrationInstancesResponse::builder)
                .logger(LOG, "listIntegrationInstances")
                .serviceDetails(
                        "IntegrationInstance",
                        "ListIntegrationInstances",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstanceSummary/ListIntegrationInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIntegrationInstancesRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.integration.model.IntegrationInstanceSummary.class,
                        ListIntegrationInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIntegrationInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIntegrationInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page",
                        ListIntegrationInstancesResponse.Builder::opcPreviousPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "IntegrationInstance",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20190131")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.integration.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListWorkRequestErrorsResponse.Builder::opcPreviousPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "IntegrationInstance",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20190131")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.integration.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListWorkRequestLogsResponse.Builder::opcPreviousPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "IntegrationInstance",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20190131")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("integrationInstanceId", request.getIntegrationInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.integration.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListWorkRequestsResponse.Builder::opcPreviousPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartIntegrationInstanceResponse> startIntegrationInstance(
            StartIntegrationInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartIntegrationInstanceRequest, StartIntegrationInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, StartIntegrationInstanceResponse::builder)
                .logger(LOG, "startIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "StartIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/StartIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartIntegrationInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopIntegrationInstanceResponse> stopIntegrationInstance(
            StopIntegrationInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopIntegrationInstanceRequest, StopIntegrationInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");

        return clientCall(request, StopIntegrationInstanceResponse::builder)
                .logger(LOG, "stopIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "StopIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/StopIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopIntegrationInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationInstanceResponse> updateIntegrationInstance(
            UpdateIntegrationInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIntegrationInstanceRequest, UpdateIntegrationInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getIntegrationInstanceId(), "integrationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIntegrationInstanceDetails(),
                "updateIntegrationInstanceDetails is required");

        return clientCall(request, UpdateIntegrationInstanceResponse::builder)
                .logger(LOG, "updateIntegrationInstance")
                .serviceDetails(
                        "IntegrationInstance",
                        "UpdateIntegrationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/integration/20190131/IntegrationInstance/UpdateIntegrationInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIntegrationInstanceRequest::builder)
                .basePath("/20190131")
                .appendPathParam("integrationInstances")
                .appendPathParam(request.getIntegrationInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateIntegrationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIntegrationInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IntegrationInstanceAsyncClient(
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
    public IntegrationInstanceAsyncClient(
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
    public IntegrationInstanceAsyncClient(
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
    public IntegrationInstanceAsyncClient(
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
    public IntegrationInstanceAsyncClient(
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
    public IntegrationInstanceAsyncClient(
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
    public IntegrationInstanceAsyncClient(
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
