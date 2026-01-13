/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;

import java.util.Objects;

/**
 * Async client implementation for CostAd service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class CostAdAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements CostAdAsync {
    /** Service instance for CostAd. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(CostAdClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://usage.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CostAdAsyncClient.class);

    CostAdAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CostAdAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "budget";
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
        public CostAdAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CostAdAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateCostAlertSubscriptionResponse>
            createCostAlertSubscription(
                    CreateCostAlertSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCostAlertSubscriptionRequest,
                                    CreateCostAlertSubscriptionResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateCostAlertSubscriptionDetails(),
                "createCostAlertSubscriptionDetails is required");

        return clientCall(request, CreateCostAlertSubscriptionResponse::builder)
                .logger(LOG, "createCostAlertSubscription")
                .serviceDetails(
                        "CostAd",
                        "CreateCostAlertSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscription/CreateCostAlertSubscription")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCostAlertSubscriptionRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAlertSubscriptions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAlertSubscription.class,
                        CreateCostAlertSubscriptionResponse.Builder::costAlertSubscription)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCostAlertSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateCostAlertSubscriptionResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCostAnomalyMonitorResponse> createCostAnomalyMonitor(
            CreateCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCostAnomalyMonitorRequest, CreateCostAnomalyMonitorResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCostAnomalyMonitorDetails(),
                "createCostAnomalyMonitorDetails is required");

        return clientCall(request, CreateCostAnomalyMonitorResponse::builder)
                .logger(LOG, "createCostAnomalyMonitor")
                .serviceDetails(
                        "CostAd",
                        "CreateCostAnomalyMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/CreateCostAnomalyMonitor")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCostAnomalyMonitorRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyMonitors")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        CreateCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCostAnomalyMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCostAnomalyMonitorResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCostAlertSubscriptionResponse>
            deleteCostAlertSubscription(
                    DeleteCostAlertSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCostAlertSubscriptionRequest,
                                    DeleteCostAlertSubscriptionResponse>
                            handler) {

        Validate.notBlank(
                request.getCostAlertSubscriptionId(), "costAlertSubscriptionId must not be blank");

        return clientCall(request, DeleteCostAlertSubscriptionResponse::builder)
                .logger(LOG, "deleteCostAlertSubscription")
                .serviceDetails(
                        "CostAd",
                        "DeleteCostAlertSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscription/DeleteCostAlertSubscription")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCostAlertSubscriptionRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAlertSubscriptions")
                .appendPathParam(request.getCostAlertSubscriptionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCostAlertSubscriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCostAnomalyMonitorResponse> deleteCostAnomalyMonitor(
            DeleteCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCostAnomalyMonitorRequest, DeleteCostAnomalyMonitorResponse>
                    handler) {

        Validate.notBlank(
                request.getCostAnomalyMonitorId(), "costAnomalyMonitorId must not be blank");

        return clientCall(request, DeleteCostAnomalyMonitorResponse::builder)
                .logger(LOG, "deleteCostAnomalyMonitor")
                .serviceDetails(
                        "CostAd",
                        "DeleteCostAnomalyMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/DeleteCostAnomalyMonitor")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCostAnomalyMonitorRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyMonitors")
                .appendPathParam(request.getCostAnomalyMonitorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCostAnomalyMonitorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableCostAnomalyMonitorResponse> disableCostAnomalyMonitor(
            DisableCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableCostAnomalyMonitorRequest, DisableCostAnomalyMonitorResponse>
                    handler) {

        Validate.notBlank(
                request.getCostAnomalyMonitorId(), "costAnomalyMonitorId must not be blank");

        return clientCall(request, DisableCostAnomalyMonitorResponse::builder)
                .logger(LOG, "disableCostAnomalyMonitor")
                .serviceDetails(
                        "CostAd",
                        "DisableCostAnomalyMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/DisableCostAnomalyMonitor")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableCostAnomalyMonitorRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyMonitors")
                .appendPathParam(request.getCostAnomalyMonitorId())
                .appendPathParam("actions")
                .appendPathParam("disable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        DisableCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString("etag", DisableCostAnomalyMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DisableCostAnomalyMonitorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableCostAnomalyMonitorResponse> enableCostAnomalyMonitor(
            EnableCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableCostAnomalyMonitorRequest, EnableCostAnomalyMonitorResponse>
                    handler) {

        Validate.notBlank(
                request.getCostAnomalyMonitorId(), "costAnomalyMonitorId must not be blank");

        return clientCall(request, EnableCostAnomalyMonitorResponse::builder)
                .logger(LOG, "enableCostAnomalyMonitor")
                .serviceDetails(
                        "CostAd",
                        "EnableCostAnomalyMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/EnableCostAnomalyMonitor")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableCostAnomalyMonitorRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyMonitors")
                .appendPathParam(request.getCostAnomalyMonitorId())
                .appendPathParam("actions")
                .appendPathParam("enable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        EnableCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString("etag", EnableCostAnomalyMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", EnableCostAnomalyMonitorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCostAlertSubscriptionResponse> getCostAlertSubscription(
            GetCostAlertSubscriptionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>
                    handler) {

        Validate.notBlank(
                request.getCostAlertSubscriptionId(), "costAlertSubscriptionId must not be blank");

        return clientCall(request, GetCostAlertSubscriptionResponse::builder)
                .logger(LOG, "getCostAlertSubscription")
                .serviceDetails(
                        "CostAd",
                        "GetCostAlertSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscription/GetCostAlertSubscription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCostAlertSubscriptionRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAlertSubscriptions")
                .appendPathParam(request.getCostAlertSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.budget.model.CostAlertSubscription.class,
                        GetCostAlertSubscriptionResponse.Builder::costAlertSubscription)
                .handleResponseHeaderString(
                        "opc-request-id", GetCostAlertSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCostAlertSubscriptionResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCostAnomalyEventResponse> getCostAnomalyEvent(
            GetCostAnomalyEventRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>
                    handler) {

        Validate.notBlank(request.getCostAnomalyEventId(), "costAnomalyEventId must not be blank");

        return clientCall(request, GetCostAnomalyEventResponse::builder)
                .logger(LOG, "getCostAnomalyEvent")
                .serviceDetails(
                        "CostAd",
                        "GetCostAnomalyEvent",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyEvent/GetCostAnomalyEvent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCostAnomalyEventRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyEvents")
                .appendPathParam(request.getCostAnomalyEventId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyEvent.class,
                        GetCostAnomalyEventResponse.Builder::costAnomalyEvent)
                .handleResponseHeaderString(
                        "opc-request-id", GetCostAnomalyEventResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCostAnomalyEventResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCostAnomalyMonitorResponse> getCostAnomalyMonitor(
            GetCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>
                    handler) {

        Validate.notBlank(
                request.getCostAnomalyMonitorId(), "costAnomalyMonitorId must not be blank");

        return clientCall(request, GetCostAnomalyMonitorResponse::builder)
                .logger(LOG, "getCostAnomalyMonitor")
                .serviceDetails(
                        "CostAd",
                        "GetCostAnomalyMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/GetCostAnomalyMonitor")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCostAnomalyMonitorRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyMonitors")
                .appendPathParam(request.getCostAnomalyMonitorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        GetCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", GetCostAnomalyMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCostAnomalyMonitorResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCostAlertSubscriptionsResponse>
            listCostAlertSubscriptions(
                    ListCostAlertSubscriptionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCostAlertSubscriptionsRequest,
                                    ListCostAlertSubscriptionsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCostAlertSubscriptionsResponse::builder)
                .logger(LOG, "listCostAlertSubscriptions")
                .serviceDetails(
                        "CostAd",
                        "ListCostAlertSubscriptions",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscriptionCollection/ListCostAlertSubscriptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCostAlertSubscriptionsRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAlertSubscriptions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.budget.model.CostAlertSubscriptionCollection.class,
                        ListCostAlertSubscriptionsResponse.Builder::costAlertSubscriptionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCostAlertSubscriptionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCostAlertSubscriptionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCostAnomalyEventsResponse> listCostAnomalyEvents(
            ListCostAnomalyEventsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCostAnomalyEventsRequest, ListCostAnomalyEventsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCostAnomalyEventsResponse::builder)
                .logger(LOG, "listCostAnomalyEvents")
                .serviceDetails(
                        "CostAd",
                        "ListCostAnomalyEvents",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyEventCollection/ListCostAnomalyEvents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCostAnomalyEventsRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyEvents")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("costAnomalyMonitorId", request.getCostAnomalyMonitorId())
                .appendListQueryParam(
                        "targetTenantId",
                        request.getTargetTenantId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .appendQueryParam(
                        "timeAnomalyEventStartDate", request.getTimeAnomalyEventStartDate())
                .appendQueryParam("timeAnomalyEventEndDate", request.getTimeAnomalyEventEndDate())
                .appendListQueryParam(
                        "region",
                        request.getRegion(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .appendQueryParam("costImpact", request.getCostImpact())
                .appendQueryParam("costImpactPercentage", request.getCostImpactPercentage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyEventCollection.class,
                        ListCostAnomalyEventsResponse.Builder::costAnomalyEventCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCostAnomalyEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCostAnomalyEventsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCostAnomalyMonitorsResponse> listCostAnomalyMonitors(
            ListCostAnomalyMonitorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCostAnomalyMonitorsRequest, ListCostAnomalyMonitorsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCostAnomalyMonitorsResponse::builder)
                .logger(LOG, "listCostAnomalyMonitors")
                .serviceDetails(
                        "CostAd",
                        "ListCostAnomalyMonitors",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitorCollection/ListCostAnomalyMonitors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCostAnomalyMonitorsRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyMonitors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "targetTenantId",
                        request.getTargetTenantId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .appendListQueryParam(
                        "region",
                        request.getRegion(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitorCollection.class,
                        ListCostAnomalyMonitorsResponse.Builder::costAnomalyMonitorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCostAnomalyMonitorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCostAnomalyMonitorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeCostAnomalyEventAnalyticsResponse>
            summarizeCostAnomalyEventAnalytics(
                    SummarizeCostAnomalyEventAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeCostAnomalyEventAnalyticsRequest,
                                    SummarizeCostAnomalyEventAnalyticsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SummarizeCostAnomalyEventAnalyticsResponse::builder)
                .logger(LOG, "summarizeCostAnomalyEventAnalytics")
                .serviceDetails(
                        "CostAd",
                        "SummarizeCostAnomalyEventAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyEvent/SummarizeCostAnomalyEventAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeCostAnomalyEventAnalyticsRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyEventAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("costAnomalyMonitorId", request.getCostAnomalyMonitorId())
                .appendListQueryParam(
                        "targetTenantId",
                        request.getTargetTenantId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .appendQueryParam(
                        "timeAnomalyEventStartDate", request.getTimeAnomalyEventStartDate())
                .appendQueryParam("timeAnomalyEventEndDate", request.getTimeAnomalyEventEndDate())
                .appendListQueryParam(
                        "region",
                        request.getRegion(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .appendQueryParam("costImpact", request.getCostImpact())
                .appendQueryParam("costImpactPercentage", request.getCostImpactPercentage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyEventAnalyticCollection.class,
                        SummarizeCostAnomalyEventAnalyticsResponse.Builder
                                ::costAnomalyEventAnalyticCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeCostAnomalyEventAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeCostAnomalyEventAnalyticsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCostAlertSubscriptionResponse>
            updateCostAlertSubscription(
                    UpdateCostAlertSubscriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCostAlertSubscriptionRequest,
                                    UpdateCostAlertSubscriptionResponse>
                            handler) {

        Validate.notBlank(
                request.getCostAlertSubscriptionId(), "costAlertSubscriptionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCostAlertSubscriptionDetails(),
                "updateCostAlertSubscriptionDetails is required");

        return clientCall(request, UpdateCostAlertSubscriptionResponse::builder)
                .logger(LOG, "updateCostAlertSubscription")
                .serviceDetails(
                        "CostAd",
                        "UpdateCostAlertSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAlertSubscription/UpdateCostAlertSubscription")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCostAlertSubscriptionRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAlertSubscriptions")
                .appendPathParam(request.getCostAlertSubscriptionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAlertSubscription.class,
                        UpdateCostAlertSubscriptionResponse.Builder::costAlertSubscription)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCostAlertSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateCostAlertSubscriptionResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCostAnomalyEventResponse> updateCostAnomalyEvent(
            UpdateCostAnomalyEventRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCostAnomalyEventRequest, UpdateCostAnomalyEventResponse>
                    handler) {

        Validate.notBlank(request.getCostAnomalyEventId(), "costAnomalyEventId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCostAnomalyEventDetails(),
                "updateCostAnomalyEventDetails is required");

        return clientCall(request, UpdateCostAnomalyEventResponse::builder)
                .logger(LOG, "updateCostAnomalyEvent")
                .serviceDetails(
                        "CostAd",
                        "UpdateCostAnomalyEvent",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyEvent/UpdateCostAnomalyEvent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCostAnomalyEventRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyEvents")
                .appendPathParam(request.getCostAnomalyEventId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyEvent.class,
                        UpdateCostAnomalyEventResponse.Builder::costAnomalyEvent)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCostAnomalyEventResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCostAnomalyEventResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCostAnomalyMonitorResponse> updateCostAnomalyMonitor(
            UpdateCostAnomalyMonitorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCostAnomalyMonitorRequest, UpdateCostAnomalyMonitorResponse>
                    handler) {

        Validate.notBlank(
                request.getCostAnomalyMonitorId(), "costAnomalyMonitorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCostAnomalyMonitorDetails(),
                "updateCostAnomalyMonitorDetails is required");

        return clientCall(request, UpdateCostAnomalyMonitorResponse::builder)
                .logger(LOG, "updateCostAnomalyMonitor")
                .serviceDetails(
                        "CostAd",
                        "UpdateCostAnomalyMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/budgets/20190111/CostAnomalyMonitor/UpdateCostAnomalyMonitor")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCostAnomalyMonitorRequest::builder)
                .basePath("/20190111")
                .appendPathParam("costAnomalyMonitors")
                .appendPathParam(request.getCostAnomalyMonitorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        UpdateCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCostAnomalyMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCostAnomalyMonitorResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
    public CostAdAsyncClient(
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
