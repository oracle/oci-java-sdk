/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterplacementgroups;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.clusterplacementgroups.requests.*;
import com.oracle.bmc.clusterplacementgroups.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class ClusterPlacementGroupsCPClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ClusterPlacementGroupsCP {
    /** Service instance for ClusterPlacementGroupsCP. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ClusterPlacementGroupsCPClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://clusterPlacementGroups.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ClusterPlacementGroupsCPClient.class);

    private final ClusterPlacementGroupsCPWaiters waiters;

    private final ClusterPlacementGroupsCPPaginators paginators;

    ClusterPlacementGroupsCPClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("ClusterPlacementGroupsCP-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ClusterPlacementGroupsCPWaiters(executorService, this);

        this.paginators = new ClusterPlacementGroupsCPPaginators(this);
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
                    Builder, ClusterPlacementGroupsCPClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "clusterplacementgroups";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ClusterPlacementGroupsCPClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ClusterPlacementGroupsCPClient(
                    this, authenticationDetailsProvider, executorService);
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
    public ActivateClusterPlacementGroupResponse activateClusterPlacementGroup(
            ActivateClusterPlacementGroupRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.ClusterPlacementGroup.class,
                        ActivateClusterPlacementGroupResponse.Builder::clusterPlacementGroup)
                .handleResponseHeaderString(
                        "etag", ActivateClusterPlacementGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ActivateClusterPlacementGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeClusterPlacementGroupCompartmentResponse changeClusterPlacementGroupCompartment(
            ChangeClusterPlacementGroupCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeClusterPlacementGroupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateClusterPlacementGroupResponse createClusterPlacementGroup(
            CreateClusterPlacementGroupRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public DeactivateClusterPlacementGroupResponse deactivateClusterPlacementGroup(
            DeactivateClusterPlacementGroupRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.ClusterPlacementGroup.class,
                        DeactivateClusterPlacementGroupResponse.Builder::clusterPlacementGroup)
                .handleResponseHeaderString(
                        "etag", DeactivateClusterPlacementGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeactivateClusterPlacementGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteClusterPlacementGroupResponse deleteClusterPlacementGroup(
            DeleteClusterPlacementGroupRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteClusterPlacementGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteClusterPlacementGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetClusterPlacementGroupResponse getClusterPlacementGroup(
            GetClusterPlacementGroupRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.ClusterPlacementGroup.class,
                        GetClusterPlacementGroupResponse.Builder::clusterPlacementGroup)
                .handleResponseHeaderString("etag", GetClusterPlacementGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetClusterPlacementGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListClusterPlacementGroupsResponse listClusterPlacementGroups(
            ListClusterPlacementGroupsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.ClusterPlacementGroupCollection
                                .class,
                        ListClusterPlacementGroupsResponse.Builder::clusterPlacementGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListClusterPlacementGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListClusterPlacementGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.WorkRequestErrorCollection
                                .class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.WorkRequestLogEntryCollection
                                .class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterplacementgroups.model.WorkRequestSummaryCollection
                                .class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateClusterPlacementGroupResponse updateClusterPlacementGroup(
            UpdateClusterPlacementGroupRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateClusterPlacementGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateClusterPlacementGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ClusterPlacementGroupsCPWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ClusterPlacementGroupsCPPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ClusterPlacementGroupsCPClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ClusterPlacementGroupsCPClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
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
    public ClusterPlacementGroupsCPClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
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
    public ClusterPlacementGroupsCPClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
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
    public ClusterPlacementGroupsCPClient(
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
                authenticationDetailsProvider,
                null);
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
    public ClusterPlacementGroupsCPClient(
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
                authenticationDetailsProvider,
                null);
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
    public ClusterPlacementGroupsCPClient(
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
                authenticationDetailsProvider,
                null);
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ClusterPlacementGroupsCPClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
