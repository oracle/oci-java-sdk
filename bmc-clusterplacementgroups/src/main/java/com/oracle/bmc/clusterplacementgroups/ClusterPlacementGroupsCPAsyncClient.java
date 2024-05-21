/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterplacementgroups;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.clusterplacementgroups.requests.*;
import com.oracle.bmc.clusterplacementgroups.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ClusterPlacementGroupsCP service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class ClusterPlacementGroupsCPAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ClusterPlacementGroupsCPAsync {
    /** Service instance for ClusterPlacementGroupsCP. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CLUSTERPLACEMENTGROUPSCP")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://clusterPlacementGroups.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ClusterPlacementGroupsCPAsyncClient.class);

    ClusterPlacementGroupsCPAsyncClient(
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
                    Builder, ClusterPlacementGroupsCPAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "clusterplacementgroups";
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
        public ClusterPlacementGroupsCPAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ClusterPlacementGroupsCPAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ActivateClusterPlacementGroupResponse>
            activateClusterPlacementGroup(
                    ActivateClusterPlacementGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ActivateClusterPlacementGroupRequest,
                                    ActivateClusterPlacementGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getClusterPlacementGroupId(), "clusterPlacementGroupId must not be blank");

        return clientCall(request, ActivateClusterPlacementGroupResponse::builder)
                .logger(LOG, "activateClusterPlacementGroup")
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "ActivateClusterPlacementGroup",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/ClusterPlacementGroup/ActivateClusterPlacementGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateClusterPlacementGroupRequest::builder)
                .basePath("/20230801")
                .appendPathParam("clusterPlacementGroups")
                .appendPathParam(request.getClusterPlacementGroupId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.ClusterPlacementGroup.class,
                        ActivateClusterPlacementGroupResponse.Builder::clusterPlacementGroup)
                .handleResponseHeaderString(
                        "etag", ActivateClusterPlacementGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ActivateClusterPlacementGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
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
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20230801")
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
    public java.util.concurrent.Future<ChangeClusterPlacementGroupCompartmentResponse>
            changeClusterPlacementGroupCompartment(
                    ChangeClusterPlacementGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeClusterPlacementGroupCompartmentRequest,
                                    ChangeClusterPlacementGroupCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getClusterPlacementGroupId(), "clusterPlacementGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeClusterPlacementGroupCompartmentDetails(),
                "changeClusterPlacementGroupCompartmentDetails is required");

        return clientCall(request, ChangeClusterPlacementGroupCompartmentResponse::builder)
                .logger(LOG, "changeClusterPlacementGroupCompartment")
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "ChangeClusterPlacementGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/ClusterPlacementGroup/ChangeClusterPlacementGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeClusterPlacementGroupCompartmentRequest::builder)
                .basePath("/20230801")
                .appendPathParam("clusterPlacementGroups")
                .appendPathParam(request.getClusterPlacementGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeClusterPlacementGroupCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterPlacementGroupResponse>
            createClusterPlacementGroup(
                    CreateClusterPlacementGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateClusterPlacementGroupRequest,
                                    CreateClusterPlacementGroupResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateClusterPlacementGroupDetails(),
                "createClusterPlacementGroupDetails is required");

        return clientCall(request, CreateClusterPlacementGroupResponse::builder)
                .logger(LOG, "createClusterPlacementGroup")
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "CreateClusterPlacementGroup",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/ClusterPlacementGroup/CreateClusterPlacementGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateClusterPlacementGroupRequest::builder)
                .basePath("/20230801")
                .appendPathParam("clusterPlacementGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.ClusterPlacementGroup.class,
                        CreateClusterPlacementGroupResponse.Builder::clusterPlacementGroup)
                .handleResponseHeaderString(
                        "location", CreateClusterPlacementGroupResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateClusterPlacementGroupResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateClusterPlacementGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateClusterPlacementGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateClusterPlacementGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeactivateClusterPlacementGroupResponse>
            deactivateClusterPlacementGroup(
                    DeactivateClusterPlacementGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeactivateClusterPlacementGroupRequest,
                                    DeactivateClusterPlacementGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getClusterPlacementGroupId(), "clusterPlacementGroupId must not be blank");

        return clientCall(request, DeactivateClusterPlacementGroupResponse::builder)
                .logger(LOG, "deactivateClusterPlacementGroup")
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "DeactivateClusterPlacementGroup",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/ClusterPlacementGroup/DeactivateClusterPlacementGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateClusterPlacementGroupRequest::builder)
                .basePath("/20230801")
                .appendPathParam("clusterPlacementGroups")
                .appendPathParam(request.getClusterPlacementGroupId())
                .appendPathParam("actions")
                .appendPathParam("deactivate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.ClusterPlacementGroup.class,
                        DeactivateClusterPlacementGroupResponse.Builder::clusterPlacementGroup)
                .handleResponseHeaderString(
                        "etag", DeactivateClusterPlacementGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeactivateClusterPlacementGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterPlacementGroupResponse>
            deleteClusterPlacementGroup(
                    DeleteClusterPlacementGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteClusterPlacementGroupRequest,
                                    DeleteClusterPlacementGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getClusterPlacementGroupId(), "clusterPlacementGroupId must not be blank");

        return clientCall(request, DeleteClusterPlacementGroupResponse::builder)
                .logger(LOG, "deleteClusterPlacementGroup")
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "DeleteClusterPlacementGroup",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/ClusterPlacementGroup/DeleteClusterPlacementGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteClusterPlacementGroupRequest::builder)
                .basePath("/20230801")
                .appendPathParam("clusterPlacementGroups")
                .appendPathParam(request.getClusterPlacementGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteClusterPlacementGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteClusterPlacementGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetClusterPlacementGroupResponse> getClusterPlacementGroup(
            GetClusterPlacementGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetClusterPlacementGroupRequest, GetClusterPlacementGroupResponse>
                    handler) {

        Validate.notBlank(
                request.getClusterPlacementGroupId(), "clusterPlacementGroupId must not be blank");

        return clientCall(request, GetClusterPlacementGroupResponse::builder)
                .logger(LOG, "getClusterPlacementGroup")
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "GetClusterPlacementGroup",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/ClusterPlacementGroup/GetClusterPlacementGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetClusterPlacementGroupRequest::builder)
                .basePath("/20230801")
                .appendPathParam("clusterPlacementGroups")
                .appendPathParam(request.getClusterPlacementGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.ClusterPlacementGroup.class,
                        GetClusterPlacementGroupResponse.Builder::clusterPlacementGroup)
                .handleResponseHeaderString("etag", GetClusterPlacementGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetClusterPlacementGroupResponse.Builder::opcRequestId)
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
                        "ClusterPlacementGroupsCP",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20230801")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListClusterPlacementGroupsResponse>
            listClusterPlacementGroups(
                    ListClusterPlacementGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListClusterPlacementGroupsRequest,
                                    ListClusterPlacementGroupsResponse>
                            handler) {

        return clientCall(request, ListClusterPlacementGroupsResponse::builder)
                .logger(LOG, "listClusterPlacementGroups")
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "ListClusterPlacementGroups",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/ClusterPlacementGroupCollection/ListClusterPlacementGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListClusterPlacementGroupsRequest::builder)
                .basePath("/20230801")
                .appendPathParam("clusterPlacementGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("ad", request.getAd())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.ClusterPlacementGroupCollection
                                .class,
                        ListClusterPlacementGroupsResponse.Builder::clusterPlacementGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListClusterPlacementGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListClusterPlacementGroupsResponse.Builder::opcNextPage)
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
                        "ClusterPlacementGroupsCP",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20230801")
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
                        com.oracle.bmc.clusterplacementgroups.model.WorkRequestErrorCollection
                                .class,
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
                        "ClusterPlacementGroupsCP",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20230801")
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
                        com.oracle.bmc.clusterplacementgroups.model.WorkRequestLogEntryCollection
                                .class,
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
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20230801")
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
                        com.oracle.bmc.clusterplacementgroups.model.WorkRequestSummaryCollection
                                .class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterPlacementGroupResponse>
            updateClusterPlacementGroup(
                    UpdateClusterPlacementGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateClusterPlacementGroupRequest,
                                    UpdateClusterPlacementGroupResponse>
                            handler) {

        Validate.notBlank(
                request.getClusterPlacementGroupId(), "clusterPlacementGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateClusterPlacementGroupDetails(),
                "updateClusterPlacementGroupDetails is required");

        return clientCall(request, UpdateClusterPlacementGroupResponse::builder)
                .logger(LOG, "updateClusterPlacementGroup")
                .serviceDetails(
                        "ClusterPlacementGroupsCP",
                        "UpdateClusterPlacementGroup",
                        "https://docs.oracle.com/iaas/api/#/en/clusterplacementgroups/20230801/ClusterPlacementGroup/UpdateClusterPlacementGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateClusterPlacementGroupRequest::builder)
                .basePath("/20230801")
                .appendPathParam("clusterPlacementGroups")
                .appendPathParam(request.getClusterPlacementGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateClusterPlacementGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateClusterPlacementGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ClusterPlacementGroupsCPAsyncClient(
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
    public ClusterPlacementGroupsCPAsyncClient(
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
    public ClusterPlacementGroupsCPAsyncClient(
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
    public ClusterPlacementGroupsCPAsyncClient(
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
    public ClusterPlacementGroupsCPAsyncClient(
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
    public ClusterPlacementGroupsCPAsyncClient(
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
    public ClusterPlacementGroupsCPAsyncClient(
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
