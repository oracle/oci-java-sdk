/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.analytics.requests.*;
import com.oracle.bmc.analytics.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public class AnalyticsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Analytics {
    /** Service instance for Analytics. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ANALYTICS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://analytics.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AnalyticsAsyncClient.class);

    private final AnalyticsWaiters waiters;

    private final AnalyticsPaginators paginators;

    private AnalyticsClient(
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
                                    .nameFormat("Analytics-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new AnalyticsWaiters(executorService, this);

        this.paginators = new AnalyticsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AnalyticsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public AnalyticsClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AnalyticsClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeAnalyticsInstanceCompartmentResponse changeAnalyticsInstanceCompartment(
            ChangeAnalyticsInstanceCompartmentRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        return clientCall(request, ChangeAnalyticsInstanceCompartmentResponse::builder)
                .logger(LOG, "changeAnalyticsInstanceCompartment")
                .serviceDetails(
                        "Analytics",
                        "ChangeAnalyticsInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/ChangeAnalyticsInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAnalyticsInstanceCompartmentRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAnalyticsInstanceCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAnalyticsInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeAnalyticsInstanceNetworkEndpointResponse changeAnalyticsInstanceNetworkEndpoint(
            ChangeAnalyticsInstanceNetworkEndpointRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeAnalyticsInstanceNetworkEndpointDetails(),
                "changeAnalyticsInstanceNetworkEndpointDetails is required");

        return clientCall(request, ChangeAnalyticsInstanceNetworkEndpointResponse::builder)
                .logger(LOG, "changeAnalyticsInstanceNetworkEndpoint")
                .serviceDetails(
                        "Analytics",
                        "ChangeAnalyticsInstanceNetworkEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/ChangeAnalyticsInstanceNetworkEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAnalyticsInstanceNetworkEndpointRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeNetworkEndpoint")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAnalyticsInstanceNetworkEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAnalyticsInstanceNetworkEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateAnalyticsInstanceResponse createAnalyticsInstance(
            CreateAnalyticsInstanceRequest request) {
        Objects.requireNonNull(
                request.getCreateAnalyticsInstanceDetails(),
                "createAnalyticsInstanceDetails is required");

        return clientCall(request, CreateAnalyticsInstanceResponse::builder)
                .logger(LOG, "createAnalyticsInstance")
                .serviceDetails("Analytics", "CreateAnalyticsInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAnalyticsInstanceRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.analytics.model.AnalyticsInstance.class,
                        CreateAnalyticsInstanceResponse.Builder::analyticsInstance)
                .handleResponseHeaderString("etag", CreateAnalyticsInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAnalyticsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAnalyticsInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", CreateAnalyticsInstanceResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreatePrivateAccessChannelResponse createPrivateAccessChannel(
            CreatePrivateAccessChannelRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreatePrivateAccessChannelDetails(),
                "createPrivateAccessChannelDetails is required");

        return clientCall(request, CreatePrivateAccessChannelResponse::builder)
                .logger(LOG, "createPrivateAccessChannel")
                .serviceDetails(
                        "Analytics",
                        "CreatePrivateAccessChannel",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/CreatePrivateAccessChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivateAccessChannelRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("privateAccessChannels")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivateAccessChannelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivateAccessChannelResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateVanityUrlResponse createVanityUrl(CreateVanityUrlRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateVanityUrlDetails(), "createVanityUrlDetails is required");

        return clientCall(request, CreateVanityUrlResponse::builder)
                .logger(LOG, "createVanityUrl")
                .serviceDetails(
                        "Analytics",
                        "CreateVanityUrl",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/CreateVanityUrl")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVanityUrlRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("vanityUrls")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateVanityUrlResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateVanityUrlResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteAnalyticsInstanceResponse deleteAnalyticsInstance(
            DeleteAnalyticsInstanceRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");

        return clientCall(request, DeleteAnalyticsInstanceResponse::builder)
                .logger(LOG, "deleteAnalyticsInstance")
                .serviceDetails(
                        "Analytics",
                        "DeleteAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/DeleteAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAnalyticsInstanceRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAnalyticsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAnalyticsInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeletePrivateAccessChannelResponse deletePrivateAccessChannel(
            DeletePrivateAccessChannelRequest request) {

        Validate.notBlank(
                request.getPrivateAccessChannelKey(), "privateAccessChannelKey must not be blank");

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");

        return clientCall(request, DeletePrivateAccessChannelResponse::builder)
                .logger(LOG, "deletePrivateAccessChannel")
                .serviceDetails(
                        "Analytics",
                        "DeletePrivateAccessChannel",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/DeletePrivateAccessChannel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivateAccessChannelRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("privateAccessChannels")
                .appendPathParam(request.getPrivateAccessChannelKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivateAccessChannelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePrivateAccessChannelResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteVanityUrlResponse deleteVanityUrl(DeleteVanityUrlRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");

        Validate.notBlank(request.getVanityUrlKey(), "vanityUrlKey must not be blank");

        return clientCall(request, DeleteVanityUrlResponse::builder)
                .logger(LOG, "deleteVanityUrl")
                .serviceDetails(
                        "Analytics",
                        "DeleteVanityUrl",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/DeleteVanityUrl")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVanityUrlRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("vanityUrls")
                .appendPathParam(request.getVanityUrlKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVanityUrlResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteVanityUrlResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteWorkRequestResponse deleteWorkRequest(DeleteWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, DeleteWorkRequestResponse::builder)
                .logger(LOG, "deleteWorkRequest")
                .serviceDetails(
                        "Analytics",
                        "DeleteWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/WorkRequest/DeleteWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWorkRequestRequest::builder)
                .basePath("/20190331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAnalyticsInstanceResponse getAnalyticsInstance(GetAnalyticsInstanceRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");

        return clientCall(request, GetAnalyticsInstanceResponse::builder)
                .logger(LOG, "getAnalyticsInstance")
                .serviceDetails(
                        "Analytics",
                        "GetAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/GetAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAnalyticsInstanceRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.analytics.model.AnalyticsInstance.class,
                        GetAnalyticsInstanceResponse.Builder::analyticsInstance)
                .handleResponseHeaderString("etag", GetAnalyticsInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAnalyticsInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPrivateAccessChannelResponse getPrivateAccessChannel(
            GetPrivateAccessChannelRequest request) {

        Validate.notBlank(
                request.getPrivateAccessChannelKey(), "privateAccessChannelKey must not be blank");

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");

        return clientCall(request, GetPrivateAccessChannelResponse::builder)
                .logger(LOG, "getPrivateAccessChannel")
                .serviceDetails(
                        "Analytics",
                        "GetPrivateAccessChannel",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/GetPrivateAccessChannel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateAccessChannelRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("privateAccessChannels")
                .appendPathParam(request.getPrivateAccessChannelKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.analytics.model.PrivateAccessChannel.class,
                        GetPrivateAccessChannelResponse.Builder::privateAccessChannel)
                .handleResponseHeaderString("etag", GetPrivateAccessChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivateAccessChannelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Analytics",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20190331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.analytics.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListAnalyticsInstancesResponse listAnalyticsInstances(
            ListAnalyticsInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAnalyticsInstancesResponse::builder)
                .logger(LOG, "listAnalyticsInstances")
                .serviceDetails(
                        "Analytics",
                        "ListAnalyticsInstances",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstanceSummary/ListAnalyticsInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAnalyticsInstancesRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("capacityType", request.getCapacityType())
                .appendEnumQueryParam("featureSet", request.getFeatureSet())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.analytics.model.AnalyticsInstanceSummary.class,
                        ListAnalyticsInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnalyticsInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAnalyticsInstancesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Analytics",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20190331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.analytics.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
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
                        "Analytics",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/WorkRequestLog/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20190331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.analytics.model.WorkRequestLog.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Analytics",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20190331")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendEnumQueryParam("resourceType", request.getResourceType())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.analytics.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ScaleAnalyticsInstanceResponse scaleAnalyticsInstance(
            ScaleAnalyticsInstanceRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getScaleAnalyticsInstanceDetails(),
                "scaleAnalyticsInstanceDetails is required");

        return clientCall(request, ScaleAnalyticsInstanceResponse::builder)
                .logger(LOG, "scaleAnalyticsInstance")
                .serviceDetails(
                        "Analytics",
                        "ScaleAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/ScaleAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScaleAnalyticsInstanceRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("scale")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ScaleAnalyticsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScaleAnalyticsInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public SetKmsKeyResponse setKmsKey(SetKmsKeyRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");
        Objects.requireNonNull(request.getSetKmsKeyDetails(), "setKmsKeyDetails is required");

        return clientCall(request, SetKmsKeyResponse::builder)
                .logger(LOG, "setKmsKey")
                .serviceDetails(
                        "Analytics",
                        "SetKmsKey",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/SetKmsKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SetKmsKeyRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("setKmsKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", SetKmsKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", SetKmsKeyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StartAnalyticsInstanceResponse startAnalyticsInstance(
            StartAnalyticsInstanceRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");

        return clientCall(request, StartAnalyticsInstanceResponse::builder)
                .logger(LOG, "startAnalyticsInstance")
                .serviceDetails(
                        "Analytics",
                        "StartAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/StartAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartAnalyticsInstanceRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StartAnalyticsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartAnalyticsInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StopAnalyticsInstanceResponse stopAnalyticsInstance(
            StopAnalyticsInstanceRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");

        return clientCall(request, StopAnalyticsInstanceResponse::builder)
                .logger(LOG, "stopAnalyticsInstance")
                .serviceDetails(
                        "Analytics",
                        "StopAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/StopAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopAnalyticsInstanceRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StopAnalyticsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopAnalyticsInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAnalyticsInstanceResponse updateAnalyticsInstance(
            UpdateAnalyticsInstanceRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAnalyticsInstanceDetails(),
                "updateAnalyticsInstanceDetails is required");

        return clientCall(request, UpdateAnalyticsInstanceResponse::builder)
                .logger(LOG, "updateAnalyticsInstance")
                .serviceDetails(
                        "Analytics",
                        "UpdateAnalyticsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/UpdateAnalyticsInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAnalyticsInstanceRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.analytics.model.AnalyticsInstance.class,
                        UpdateAnalyticsInstanceResponse.Builder::analyticsInstance)
                .handleResponseHeaderString("etag", UpdateAnalyticsInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAnalyticsInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePrivateAccessChannelResponse updatePrivateAccessChannel(
            UpdatePrivateAccessChannelRequest request) {

        Validate.notBlank(
                request.getPrivateAccessChannelKey(), "privateAccessChannelKey must not be blank");

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivateAccessChannelDetails(),
                "updatePrivateAccessChannelDetails is required");

        return clientCall(request, UpdatePrivateAccessChannelResponse::builder)
                .logger(LOG, "updatePrivateAccessChannel")
                .serviceDetails(
                        "Analytics",
                        "UpdatePrivateAccessChannel",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/UpdatePrivateAccessChannel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivateAccessChannelRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("privateAccessChannels")
                .appendPathParam(request.getPrivateAccessChannelKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivateAccessChannelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePrivateAccessChannelResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateVanityUrlResponse updateVanityUrl(UpdateVanityUrlRequest request) {

        Validate.notBlank(
                request.getAnalyticsInstanceId(), "analyticsInstanceId must not be blank");

        Validate.notBlank(request.getVanityUrlKey(), "vanityUrlKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateVanityUrlDetails(), "updateVanityUrlDetails is required");

        return clientCall(request, UpdateVanityUrlResponse::builder)
                .logger(LOG, "updateVanityUrl")
                .serviceDetails(
                        "Analytics",
                        "UpdateVanityUrl",
                        "https://docs.oracle.com/iaas/api/#/en/analytics/20190331/AnalyticsInstance/UpdateVanityUrl")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVanityUrlRequest::builder)
                .basePath("/20190331")
                .appendPathParam("analyticsInstances")
                .appendPathParam(request.getAnalyticsInstanceId())
                .appendPathParam("vanityUrls")
                .appendPathParam(request.getVanityUrlKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVanityUrlResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateVanityUrlResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AnalyticsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public AnalyticsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AnalyticsClient(
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
    public AnalyticsClient(
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
    public AnalyticsClient(
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
    public AnalyticsClient(
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
    public AnalyticsClient(
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
    public AnalyticsClient(
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
    public AnalyticsClient(
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
    public AnalyticsClient(
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
