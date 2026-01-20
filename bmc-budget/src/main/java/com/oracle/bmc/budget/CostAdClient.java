/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class CostAdClient extends com.oracle.bmc.http.internal.BaseSyncClient implements CostAd {
    /** Service instance for CostAd. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(CostAdClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://usage.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CostAdClient.class);

    private final CostAdWaiters waiters;

    private final CostAdPaginators paginators;

    CostAdClient(
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
                                    .nameFormat("CostAd-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new CostAdWaiters(executorService, this);

        this.paginators = new CostAdPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CostAdClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "budget";
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
        public CostAdClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CostAdClient(this, authenticationDetailsProvider, executorService);
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
    public CreateCostAlertSubscriptionResponse createCostAlertSubscription(
            CreateCostAlertSubscriptionRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAlertSubscription.class,
                        CreateCostAlertSubscriptionResponse.Builder::costAlertSubscription)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCostAlertSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateCostAlertSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateCostAnomalyMonitorResponse createCostAnomalyMonitor(
            CreateCostAnomalyMonitorRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        CreateCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCostAnomalyMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCostAnomalyMonitorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteCostAlertSubscriptionResponse deleteCostAlertSubscription(
            DeleteCostAlertSubscriptionRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCostAlertSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCostAnomalyMonitorResponse deleteCostAnomalyMonitor(
            DeleteCostAnomalyMonitorRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCostAnomalyMonitorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableCostAnomalyMonitorResponse disableCostAnomalyMonitor(
            DisableCostAnomalyMonitorRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        DisableCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString("etag", DisableCostAnomalyMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DisableCostAnomalyMonitorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableCostAnomalyMonitorResponse enableCostAnomalyMonitor(
            EnableCostAnomalyMonitorRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        EnableCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString("etag", EnableCostAnomalyMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", EnableCostAnomalyMonitorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCostAlertSubscriptionResponse getCostAlertSubscription(
            GetCostAlertSubscriptionRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAlertSubscription.class,
                        GetCostAlertSubscriptionResponse.Builder::costAlertSubscription)
                .handleResponseHeaderString(
                        "opc-request-id", GetCostAlertSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCostAlertSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetCostAnomalyEventResponse getCostAnomalyEvent(GetCostAnomalyEventRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyEvent.class,
                        GetCostAnomalyEventResponse.Builder::costAnomalyEvent)
                .handleResponseHeaderString(
                        "opc-request-id", GetCostAnomalyEventResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCostAnomalyEventResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetCostAnomalyMonitorResponse getCostAnomalyMonitor(
            GetCostAnomalyMonitorRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        GetCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", GetCostAnomalyMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCostAnomalyMonitorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListCostAlertSubscriptionsResponse listCostAlertSubscriptions(
            ListCostAlertSubscriptionsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAlertSubscriptionCollection.class,
                        ListCostAlertSubscriptionsResponse.Builder::costAlertSubscriptionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCostAlertSubscriptionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCostAlertSubscriptionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCostAnomalyEventsResponse listCostAnomalyEvents(
            ListCostAnomalyEventsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyEventCollection.class,
                        ListCostAnomalyEventsResponse.Builder::costAnomalyEventCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCostAnomalyEventsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCostAnomalyEventsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCostAnomalyMonitorsResponse listCostAnomalyMonitors(
            ListCostAnomalyMonitorsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitorCollection.class,
                        ListCostAnomalyMonitorsResponse.Builder::costAnomalyMonitorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCostAnomalyMonitorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCostAnomalyMonitorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeCostAnomalyEventAnalyticsResponse summarizeCostAnomalyEventAnalytics(
            SummarizeCostAnomalyEventAnalyticsRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public UpdateCostAlertSubscriptionResponse updateCostAlertSubscription(
            UpdateCostAlertSubscriptionRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAlertSubscription.class,
                        UpdateCostAlertSubscriptionResponse.Builder::costAlertSubscription)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCostAlertSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateCostAlertSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateCostAnomalyEventResponse updateCostAnomalyEvent(
            UpdateCostAnomalyEventRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyEvent.class,
                        UpdateCostAnomalyEventResponse.Builder::costAnomalyEvent)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCostAnomalyEventResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCostAnomalyEventResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateCostAnomalyMonitorResponse updateCostAnomalyMonitor(
            UpdateCostAnomalyMonitorRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.budget.model.CostAnomalyMonitor.class,
                        UpdateCostAnomalyMonitorResponse.Builder::costAnomalyMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCostAnomalyMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCostAnomalyMonitorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CostAdWaiters getWaiters() {
        return waiters;
    }

    @Override
    public CostAdPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CostAdClient(
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
    public CostAdClient(
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
    public CostAdClient(
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
    public CostAdClient(
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
    public CostAdClient(
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
    public CostAdClient(
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
    public CostAdClient(
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
    public CostAdClient(
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
