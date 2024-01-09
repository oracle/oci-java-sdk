/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.visualbuilder.requests.*;
import com.oracle.bmc.visualbuilder.responses.*;

import java.util.Objects;

/**
 * Async client implementation for VbInstance service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
public class VbInstanceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements VbInstanceAsync {
    /** Service instance for VbInstance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("VBINSTANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://visualbuilder.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VbInstanceAsyncClient.class);

    VbInstanceAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, VbInstanceAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "visualbuilder";
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
        public VbInstanceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new VbInstanceAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeVbInstanceCompartmentResponse>
            changeVbInstanceCompartment(
                    ChangeVbInstanceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVbInstanceCompartmentRequest,
                                    ChangeVbInstanceCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getVbInstanceId(), "vbInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeVbInstanceCompartmentDetails(),
                "changeVbInstanceCompartmentDetails is required");

        return clientCall(request, ChangeVbInstanceCompartmentResponse::builder)
                .logger(LOG, "changeVbInstanceCompartment")
                .serviceDetails(
                        "VbInstance",
                        "ChangeVbInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/VbInstance/ChangeVbInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVbInstanceCompartmentRequest::builder)
                .basePath("/20210601")
                .appendPathParam("vbInstances")
                .appendPathParam(request.getVbInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVbInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeVbInstanceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVbInstanceResponse> createVbInstance(
            CreateVbInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVbInstanceRequest, CreateVbInstanceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateVbInstanceDetails(), "createVbInstanceDetails is required");

        return clientCall(request, CreateVbInstanceResponse::builder)
                .logger(LOG, "createVbInstance")
                .serviceDetails(
                        "VbInstance",
                        "CreateVbInstance",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/VbInstance/CreateVbInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVbInstanceRequest::builder)
                .basePath("/20210601")
                .appendPathParam("vbInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateVbInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVbInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteVbInstanceResponse> deleteVbInstance(
            DeleteVbInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVbInstanceRequest, DeleteVbInstanceResponse>
                    handler) {

        Validate.notBlank(request.getVbInstanceId(), "vbInstanceId must not be blank");

        return clientCall(request, DeleteVbInstanceResponse::builder)
                .logger(LOG, "deleteVbInstance")
                .serviceDetails(
                        "VbInstance",
                        "DeleteVbInstance",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/VbInstance/DeleteVbInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVbInstanceRequest::builder)
                .basePath("/20210601")
                .appendPathParam("vbInstances")
                .appendPathParam(request.getVbInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteVbInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVbInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVbInstanceResponse> getVbInstance(
            GetVbInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVbInstanceRequest, GetVbInstanceResponse>
                    handler) {

        Validate.notBlank(request.getVbInstanceId(), "vbInstanceId must not be blank");

        return clientCall(request, GetVbInstanceResponse::builder)
                .logger(LOG, "getVbInstance")
                .serviceDetails(
                        "VbInstance",
                        "GetVbInstance",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/VbInstance/GetVbInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVbInstanceRequest::builder)
                .basePath("/20210601")
                .appendPathParam("vbInstances")
                .appendPathParam(request.getVbInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.visualbuilder.model.VbInstance.class,
                        GetVbInstanceResponse.Builder::vbInstance)
                .handleResponseHeaderString("etag", GetVbInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVbInstanceResponse.Builder::opcRequestId)
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
                        "VbInstance",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210601")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.visualbuilder.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVbInstancesResponse> listVbInstances(
            ListVbInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVbInstancesRequest, ListVbInstancesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVbInstancesResponse::builder)
                .logger(LOG, "listVbInstances")
                .serviceDetails(
                        "VbInstance",
                        "ListVbInstances",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/VbInstanceSummaryCollection/ListVbInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVbInstancesRequest::builder)
                .basePath("/20210601")
                .appendPathParam("vbInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.visualbuilder.model.VbInstanceSummaryCollection.class,
                        ListVbInstancesResponse.Builder::vbInstanceSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVbInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVbInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListVbInstancesResponse.Builder::opcPreviousPage)
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
                        "VbInstance",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/WorkRequestErrorCollection/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210601")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.visualbuilder.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
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
                        "VbInstance",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/WorkRequestLogEntryCollection/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210601")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.visualbuilder.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
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
                        "VbInstance",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/WorkRequestSummaryCollection/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210601")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("vbInstanceId", request.getVbInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.visualbuilder.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListWorkRequestsResponse.Builder::opcPreviousPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestSummarizedApplicationsResponse>
            requestSummarizedApplications(
                    RequestSummarizedApplicationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedApplicationsRequest,
                                    RequestSummarizedApplicationsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getRequestSummarizedApplicationsDetails(),
                "requestSummarizedApplicationsDetails is required");

        Validate.notBlank(request.getVbInstanceId(), "vbInstanceId must not be blank");

        return clientCall(request, RequestSummarizedApplicationsResponse::builder)
                .logger(LOG, "requestSummarizedApplications")
                .serviceDetails(
                        "VbInstance",
                        "RequestSummarizedApplications",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/ApplicationSummaryCollection/RequestSummarizedApplications")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedApplicationsRequest::builder)
                .basePath("/20210601")
                .appendPathParam("vbInstances")
                .appendPathParam(request.getVbInstanceId())
                .appendPathParam("actions")
                .appendPathParam("applications")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.visualbuilder.model.ApplicationSummaryCollection.class,
                        RequestSummarizedApplicationsResponse.Builder::applicationSummaryCollection)
                .handleResponseHeaderString(
                        "etag", RequestSummarizedApplicationsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedApplicationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartVbInstanceResponse> startVbInstance(
            StartVbInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartVbInstanceRequest, StartVbInstanceResponse>
                    handler) {

        Validate.notBlank(request.getVbInstanceId(), "vbInstanceId must not be blank");

        return clientCall(request, StartVbInstanceResponse::builder)
                .logger(LOG, "startVbInstance")
                .serviceDetails(
                        "VbInstance",
                        "StartVbInstance",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/VbInstance/StartVbInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartVbInstanceRequest::builder)
                .basePath("/20210601")
                .appendPathParam("vbInstances")
                .appendPathParam(request.getVbInstanceId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", StartVbInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartVbInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopVbInstanceResponse> stopVbInstance(
            StopVbInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopVbInstanceRequest, StopVbInstanceResponse>
                    handler) {

        Validate.notBlank(request.getVbInstanceId(), "vbInstanceId must not be blank");

        return clientCall(request, StopVbInstanceResponse::builder)
                .logger(LOG, "stopVbInstance")
                .serviceDetails(
                        "VbInstance",
                        "StopVbInstance",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/VbInstance/StopVbInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopVbInstanceRequest::builder)
                .basePath("/20210601")
                .appendPathParam("vbInstances")
                .appendPathParam(request.getVbInstanceId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", StopVbInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopVbInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateVbInstanceResponse> updateVbInstance(
            UpdateVbInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVbInstanceRequest, UpdateVbInstanceResponse>
                    handler) {

        Validate.notBlank(request.getVbInstanceId(), "vbInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVbInstanceDetails(), "updateVbInstanceDetails is required");

        return clientCall(request, UpdateVbInstanceResponse::builder)
                .logger(LOG, "updateVbInstance")
                .serviceDetails(
                        "VbInstance",
                        "UpdateVbInstance",
                        "https://docs.oracle.com/iaas/api/#/en/visual-builder/20210601/VbInstance/UpdateVbInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVbInstanceRequest::builder)
                .basePath("/20210601")
                .appendPathParam("vbInstances")
                .appendPathParam(request.getVbInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateVbInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVbInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public VbInstanceAsyncClient(
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
    public VbInstanceAsyncClient(
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
    public VbInstanceAsyncClient(
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
    public VbInstanceAsyncClient(
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
    public VbInstanceAsyncClient(
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
    public VbInstanceAsyncClient(
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
    public VbInstanceAsyncClient(
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
