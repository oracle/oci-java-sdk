/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.containerinstances.requests.*;
import com.oracle.bmc.containerinstances.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ContainerInstance service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
public class ContainerInstanceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ContainerInstanceAsync {
    /** Service instance for ContainerInstance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CONTAINERINSTANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://compute-containers.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ContainerInstanceAsyncClient.class);

    private ContainerInstanceAsyncClient(
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
                    Builder, ContainerInstanceAsyncClient> {
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
        public ContainerInstanceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ContainerInstanceAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeContainerInstanceCompartmentResponse>
            changeContainerInstanceCompartment(
                    ChangeContainerInstanceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeContainerInstanceCompartmentRequest,
                                    ChangeContainerInstanceCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getContainerInstanceId(), "containerInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeContainerInstanceCompartmentDetails(),
                "changeContainerInstanceCompartmentDetails is required");

        return clientCall(request, ChangeContainerInstanceCompartmentResponse::builder)
                .logger(LOG, "changeContainerInstanceCompartment")
                .serviceDetails(
                        "ContainerInstance",
                        "ChangeContainerInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstance/ChangeContainerInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeContainerInstanceCompartmentRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstances")
                .appendPathParam(request.getContainerInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeContainerInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeContainerInstanceCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateContainerInstanceResponse> createContainerInstance(
            CreateContainerInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateContainerInstanceRequest, CreateContainerInstanceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateContainerInstanceDetails(),
                "createContainerInstanceDetails is required");

        return clientCall(request, CreateContainerInstanceResponse::builder)
                .logger(LOG, "createContainerInstance")
                .serviceDetails(
                        "ContainerInstance",
                        "CreateContainerInstance",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstance/CreateContainerInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateContainerInstanceRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.containerinstances.model.ContainerInstance.class,
                        CreateContainerInstanceResponse.Builder::containerInstance)
                .handleResponseHeaderString("etag", CreateContainerInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateContainerInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateContainerInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteContainerInstanceResponse> deleteContainerInstance(
            DeleteContainerInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteContainerInstanceRequest, DeleteContainerInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getContainerInstanceId(), "containerInstanceId must not be blank");

        return clientCall(request, DeleteContainerInstanceResponse::builder)
                .logger(LOG, "deleteContainerInstance")
                .serviceDetails(
                        "ContainerInstance",
                        "DeleteContainerInstance",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstance/DeleteContainerInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteContainerInstanceRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstances")
                .appendPathParam(request.getContainerInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteContainerInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteContainerInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetContainerResponse> getContainer(
            GetContainerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetContainerRequest, GetContainerResponse>
                    handler) {

        Validate.notBlank(request.getContainerId(), "containerId must not be blank");

        return clientCall(request, GetContainerResponse::builder)
                .logger(LOG, "getContainer")
                .serviceDetails(
                        "ContainerInstance",
                        "GetContainer",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/Container/GetContainer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetContainerRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containers")
                .appendPathParam(request.getContainerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerinstances.model.Container.class,
                        GetContainerResponse.Builder::container)
                .handleResponseHeaderString("etag", GetContainerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetContainerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetContainerInstanceResponse> getContainerInstance(
            GetContainerInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetContainerInstanceRequest, GetContainerInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getContainerInstanceId(), "containerInstanceId must not be blank");

        return clientCall(request, GetContainerInstanceResponse::builder)
                .logger(LOG, "getContainerInstance")
                .serviceDetails(
                        "ContainerInstance",
                        "GetContainerInstance",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstance/GetContainerInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetContainerInstanceRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstances")
                .appendPathParam(request.getContainerInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerinstances.model.ContainerInstance.class,
                        GetContainerInstanceResponse.Builder::containerInstance)
                .handleResponseHeaderString("etag", GetContainerInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetContainerInstanceResponse.Builder::opcRequestId)
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
                        "ContainerInstance",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210415")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerinstances.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListContainerInstanceShapesResponse>
            listContainerInstanceShapes(
                    ListContainerInstanceShapesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListContainerInstanceShapesRequest,
                                    ListContainerInstanceShapesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListContainerInstanceShapesResponse::builder)
                .logger(LOG, "listContainerInstanceShapes")
                .serviceDetails(
                        "ContainerInstance",
                        "ListContainerInstanceShapes",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstanceShapeCollection/ListContainerInstanceShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListContainerInstanceShapesRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstanceShapes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerinstances.model.ContainerInstanceShapeCollection
                                .class,
                        ListContainerInstanceShapesResponse.Builder
                                ::containerInstanceShapeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListContainerInstanceShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListContainerInstanceShapesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListContainerInstancesResponse> listContainerInstances(
            ListContainerInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListContainerInstancesRequest, ListContainerInstancesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListContainerInstancesResponse::builder)
                .logger(LOG, "listContainerInstances")
                .serviceDetails(
                        "ContainerInstance",
                        "ListContainerInstances",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstanceCollection/ListContainerInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListContainerInstancesRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerinstances.model.ContainerInstanceCollection.class,
                        ListContainerInstancesResponse.Builder::containerInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListContainerInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListContainerInstancesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListContainersResponse> listContainers(
            ListContainersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListContainersRequest, ListContainersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListContainersResponse::builder)
                .logger(LOG, "listContainers")
                .serviceDetails(
                        "ContainerInstance",
                        "ListContainers",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerCollection/ListContainers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListContainersRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("containerInstanceId", request.getContainerInstanceId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerinstances.model.ContainerCollection.class,
                        ListContainersResponse.Builder::containerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListContainersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListContainersResponse.Builder::opcNextPage)
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
                .serviceDetails(
                        "ContainerInstance",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/WorkRequestErrorCollection/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210415")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerinstances.model.WorkRequestErrorCollection.class,
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
                .serviceDetails(
                        "ContainerInstance",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/WorkRequestLogEntryCollection/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210415")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerinstances.model.WorkRequestLogEntryCollection.class,
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
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "ContainerInstance",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/WorkRequestSummaryCollection/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210415")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerinstances.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestartContainerInstanceResponse> restartContainerInstance(
            RestartContainerInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestartContainerInstanceRequest, RestartContainerInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getContainerInstanceId(), "containerInstanceId must not be blank");

        return clientCall(request, RestartContainerInstanceResponse::builder)
                .logger(LOG, "restartContainerInstance")
                .serviceDetails(
                        "ContainerInstance",
                        "RestartContainerInstance",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstance/RestartContainerInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartContainerInstanceRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstances")
                .appendPathParam(request.getContainerInstanceId())
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestartContainerInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestartContainerInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetrieveLogsResponse> retrieveLogs(
            RetrieveLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RetrieveLogsRequest, RetrieveLogsResponse>
                    handler) {

        Validate.notBlank(request.getContainerId(), "containerId must not be blank");

        return clientCall(request, RetrieveLogsResponse::builder)
                .logger(LOG, "retrieveLogs")
                .serviceDetails(
                        "ContainerInstance",
                        "RetrieveLogs",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/Container/RetrieveLogs")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveLogsRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containers")
                .appendPathParam(request.getContainerId())
                .appendPathParam("actions")
                .appendPathParam("retrieveLogs")
                .accept("application/json", "text/plain")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, RetrieveLogsResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", RetrieveLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartContainerInstanceResponse> startContainerInstance(
            StartContainerInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartContainerInstanceRequest, StartContainerInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getContainerInstanceId(), "containerInstanceId must not be blank");

        return clientCall(request, StartContainerInstanceResponse::builder)
                .logger(LOG, "startContainerInstance")
                .serviceDetails(
                        "ContainerInstance",
                        "StartContainerInstance",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstance/StartContainerInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartContainerInstanceRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstances")
                .appendPathParam(request.getContainerInstanceId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartContainerInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartContainerInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopContainerInstanceResponse> stopContainerInstance(
            StopContainerInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopContainerInstanceRequest, StopContainerInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getContainerInstanceId(), "containerInstanceId must not be blank");

        return clientCall(request, StopContainerInstanceResponse::builder)
                .logger(LOG, "stopContainerInstance")
                .serviceDetails(
                        "ContainerInstance",
                        "StopContainerInstance",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstance/StopContainerInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopContainerInstanceRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstances")
                .appendPathParam(request.getContainerInstanceId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopContainerInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopContainerInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateContainerResponse> updateContainer(
            UpdateContainerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateContainerRequest, UpdateContainerResponse>
                    handler) {

        Validate.notBlank(request.getContainerId(), "containerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateContainerDetails(), "updateContainerDetails is required");

        return clientCall(request, UpdateContainerResponse::builder)
                .logger(LOG, "updateContainer")
                .serviceDetails(
                        "ContainerInstance",
                        "UpdateContainer",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/Container/UpdateContainer")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateContainerRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containers")
                .appendPathParam(request.getContainerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateContainerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateContainerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateContainerInstanceResponse> updateContainerInstance(
            UpdateContainerInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateContainerInstanceRequest, UpdateContainerInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getContainerInstanceId(), "containerInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateContainerInstanceDetails(),
                "updateContainerInstanceDetails is required");

        return clientCall(request, UpdateContainerInstanceResponse::builder)
                .logger(LOG, "updateContainerInstance")
                .serviceDetails(
                        "ContainerInstance",
                        "UpdateContainerInstance",
                        "https://docs.oracle.com/iaas/api/#/en/container-instances/20210415/ContainerInstance/UpdateContainerInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateContainerInstanceRequest::builder)
                .basePath("/20210415")
                .appendPathParam("containerInstances")
                .appendPathParam(request.getContainerInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateContainerInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateContainerInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ContainerInstanceAsyncClient(
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
    public ContainerInstanceAsyncClient(
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
    public ContainerInstanceAsyncClient(
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
    public ContainerInstanceAsyncClient(
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
    public ContainerInstanceAsyncClient(
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
    public ContainerInstanceAsyncClient(
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
    public ContainerInstanceAsyncClient(
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
