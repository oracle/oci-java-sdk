/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.jmsutils.requests.*;
import com.oracle.bmc.jmsutils.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250521")
public class JmsUtilsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements JmsUtils {
    /** Service instance for JmsUtils. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("JMSUTILS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://javamanagement-utils.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JmsUtilsClient.class);

    private final JmsUtilsWaiters waiters;

    private final JmsUtilsPaginators paginators;

    JmsUtilsClient(
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
                                    .nameFormat("JmsUtils-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new JmsUtilsWaiters(executorService, this);

        this.paginators = new JmsUtilsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, JmsUtilsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "jmsutils";
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
        public JmsUtilsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new JmsUtilsClient(this, authenticationDetailsProvider, executorService);
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
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "JmsUtils",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20250521")
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
    public DeleteJavaMigrationAnalysisResponse deleteJavaMigrationAnalysis(
            DeleteJavaMigrationAnalysisRequest request) {

        Validate.notBlank(
                request.getJavaMigrationAnalysisId(), "javaMigrationAnalysisId must not be blank");

        return clientCall(request, DeleteJavaMigrationAnalysisResponse::builder)
                .logger(LOG, "deleteJavaMigrationAnalysis")
                .serviceDetails(
                        "JmsUtils",
                        "DeleteJavaMigrationAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/JavaMigrationAnalysis/DeleteJavaMigrationAnalysis")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJavaMigrationAnalysisRequest::builder)
                .basePath("/20250521")
                .appendPathParam("javaMigrationAnalysis")
                .appendPathParam(request.getJavaMigrationAnalysisId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJavaMigrationAnalysisResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePerformanceTuningAnalysisResponse deletePerformanceTuningAnalysis(
            DeletePerformanceTuningAnalysisRequest request) {

        Validate.notBlank(
                request.getPerformanceTuningAnalysisId(),
                "performanceTuningAnalysisId must not be blank");

        return clientCall(request, DeletePerformanceTuningAnalysisResponse::builder)
                .logger(LOG, "deletePerformanceTuningAnalysis")
                .serviceDetails(
                        "JmsUtils",
                        "DeletePerformanceTuningAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/PerformanceTuningAnalysis/DeletePerformanceTuningAnalysis")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePerformanceTuningAnalysisRequest::builder)
                .basePath("/20250521")
                .appendPathParam("performanceTuningAnalysis")
                .appendPathParam(request.getPerformanceTuningAnalysisId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeletePerformanceTuningAnalysisResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAnalyzeApplicationsConfigurationResponse getAnalyzeApplicationsConfiguration(
            GetAnalyzeApplicationsConfigurationRequest request) {

        return clientCall(request, GetAnalyzeApplicationsConfigurationResponse::builder)
                .logger(LOG, "getAnalyzeApplicationsConfiguration")
                .serviceDetails(
                        "JmsUtils",
                        "GetAnalyzeApplicationsConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/AnalyzeApplicationsConfiguration/GetAnalyzeApplicationsConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAnalyzeApplicationsConfigurationRequest::builder)
                .basePath("/20250521")
                .appendPathParam("analyzeApplicationsConfiguration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.AnalyzeApplicationsConfiguration.class,
                        GetAnalyzeApplicationsConfigurationResponse.Builder
                                ::analyzeApplicationsConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAnalyzeApplicationsConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetAnalyzeApplicationsConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetJavaMigrationAnalysisResponse getJavaMigrationAnalysis(
            GetJavaMigrationAnalysisRequest request) {

        Validate.notBlank(
                request.getJavaMigrationAnalysisId(), "javaMigrationAnalysisId must not be blank");

        return clientCall(request, GetJavaMigrationAnalysisResponse::builder)
                .logger(LOG, "getJavaMigrationAnalysis")
                .serviceDetails(
                        "JmsUtils",
                        "GetJavaMigrationAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/JavaMigrationAnalysis/GetJavaMigrationAnalysis")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJavaMigrationAnalysisRequest::builder)
                .basePath("/20250521")
                .appendPathParam("javaMigrationAnalysis")
                .appendPathParam(request.getJavaMigrationAnalysisId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.JavaMigrationAnalysis.class,
                        GetJavaMigrationAnalysisResponse.Builder::javaMigrationAnalysis)
                .handleResponseHeaderString("etag", GetJavaMigrationAnalysisResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJavaMigrationAnalysisResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPerformanceTuningAnalysisResponse getPerformanceTuningAnalysis(
            GetPerformanceTuningAnalysisRequest request) {

        Validate.notBlank(
                request.getPerformanceTuningAnalysisId(),
                "performanceTuningAnalysisId must not be blank");

        return clientCall(request, GetPerformanceTuningAnalysisResponse::builder)
                .logger(LOG, "getPerformanceTuningAnalysis")
                .serviceDetails(
                        "JmsUtils",
                        "GetPerformanceTuningAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/PerformanceTuningAnalysis/GetPerformanceTuningAnalysis")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPerformanceTuningAnalysisRequest::builder)
                .basePath("/20250521")
                .appendPathParam("performanceTuningAnalysis")
                .appendPathParam(request.getPerformanceTuningAnalysisId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.PerformanceTuningAnalysis.class,
                        GetPerformanceTuningAnalysisResponse.Builder::performanceTuningAnalysis)
                .handleResponseHeaderString(
                        "etag", GetPerformanceTuningAnalysisResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPerformanceTuningAnalysisResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSubscriptionAcknowledgmentConfigurationResponse
            getSubscriptionAcknowledgmentConfiguration(
                    GetSubscriptionAcknowledgmentConfigurationRequest request) {

        return clientCall(request, GetSubscriptionAcknowledgmentConfigurationResponse::builder)
                .logger(LOG, "getSubscriptionAcknowledgmentConfiguration")
                .serviceDetails(
                        "JmsUtils",
                        "GetSubscriptionAcknowledgmentConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/SubscriptionAcknowledgmentConfiguration/GetSubscriptionAcknowledgmentConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSubscriptionAcknowledgmentConfigurationRequest::builder)
                .basePath("/20250521")
                .appendPathParam("subscriptionAcknowledgmentConfiguration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.SubscriptionAcknowledgmentConfiguration.class,
                        GetSubscriptionAcknowledgmentConfigurationResponse.Builder
                                ::subscriptionAcknowledgmentConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSubscriptionAcknowledgmentConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetSubscriptionAcknowledgmentConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "JmsUtils",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20250521")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListJavaMigrationAnalysisResponse listJavaMigrationAnalysis(
            ListJavaMigrationAnalysisRequest request) {

        return clientCall(request, ListJavaMigrationAnalysisResponse::builder)
                .logger(LOG, "listJavaMigrationAnalysis")
                .serviceDetails(
                        "JmsUtils",
                        "ListJavaMigrationAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/JavaMigrationAnalysis/ListJavaMigrationAnalysis")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJavaMigrationAnalysisRequest::builder)
                .basePath("/20250521")
                .appendPathParam("javaMigrationAnalysis")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("analysisProjectName", request.getAnalysisProjectName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.JavaMigrationAnalysisCollection.class,
                        ListJavaMigrationAnalysisResponse.Builder::javaMigrationAnalysisCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJavaMigrationAnalysisResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJavaMigrationAnalysisResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPerformanceTuningAnalysisResponse listPerformanceTuningAnalysis(
            ListPerformanceTuningAnalysisRequest request) {

        return clientCall(request, ListPerformanceTuningAnalysisResponse::builder)
                .logger(LOG, "listPerformanceTuningAnalysis")
                .serviceDetails(
                        "JmsUtils",
                        "ListPerformanceTuningAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/PerformanceTuningAnalysis/ListPerformanceTuningAnalysis")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPerformanceTuningAnalysisRequest::builder)
                .basePath("/20250521")
                .appendPathParam("performanceTuningAnalysis")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("analysisProjectName", request.getAnalysisProjectName())
                .appendEnumQueryParam(
                        "performanceTuningAnalysisResult",
                        request.getPerformanceTuningAnalysisResult())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.PerformanceTuningAnalysisCollection.class,
                        ListPerformanceTuningAnalysisResponse.Builder
                                ::performanceTuningAnalysisCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPerformanceTuningAnalysisResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPerformanceTuningAnalysisResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkItemsResponse listWorkItems(ListWorkItemsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkItemsResponse::builder)
                .logger(LOG, "listWorkItems")
                .serviceDetails(
                        "JmsUtils",
                        "ListWorkItems",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/WorkItemSummary/ListWorkItems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkItemsRequest::builder)
                .basePath("/20250521")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("workItems")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.WorkItemCollection.class,
                        ListWorkItemsResponse.Builder::workItemCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkItemsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkItemsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "JmsUtils",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20250521")
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
                        com.oracle.bmc.jmsutils.model.WorkRequestErrorCollection.class,
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
                        "JmsUtils",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20250521")
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
                        com.oracle.bmc.jmsutils.model.WorkRequestLogEntryCollection.class,
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
                        "JmsUtils",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20250521")
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
                        com.oracle.bmc.jmsutils.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RequestJavaMigrationAnalysisResponse requestJavaMigrationAnalysis(
            RequestJavaMigrationAnalysisRequest request) {
        Objects.requireNonNull(
                request.getRequestJavaMigrationAnalysisDetails(),
                "requestJavaMigrationAnalysisDetails is required");

        return clientCall(request, RequestJavaMigrationAnalysisResponse::builder)
                .logger(LOG, "requestJavaMigrationAnalysis")
                .serviceDetails(
                        "JmsUtils",
                        "RequestJavaMigrationAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/JavaMigrationAnalysis/RequestJavaMigrationAnalysis")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestJavaMigrationAnalysisRequest::builder)
                .basePath("/20250521")
                .appendPathParam("javaMigrationAnalysis")
                .appendPathParam("actions")
                .appendPathParam("requestJavaMigrationAnalysis")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestJavaMigrationAnalysisResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestJavaMigrationAnalysisResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RequestPerformanceTuningAnalysisResponse requestPerformanceTuningAnalysis(
            RequestPerformanceTuningAnalysisRequest request) {
        Objects.requireNonNull(
                request.getRequestPerformanceTuningAnalysisDetails(),
                "requestPerformanceTuningAnalysisDetails is required");

        return clientCall(request, RequestPerformanceTuningAnalysisResponse::builder)
                .logger(LOG, "requestPerformanceTuningAnalysis")
                .serviceDetails(
                        "JmsUtils",
                        "RequestPerformanceTuningAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/PerformanceTuningAnalysis/RequestPerformanceTuningAnalysis")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestPerformanceTuningAnalysisRequest::builder)
                .basePath("/20250521")
                .appendPathParam("performanceTuningAnalysis")
                .appendPathParam("actions")
                .appendPathParam("requestPerformanceTuningAnalysis")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestPerformanceTuningAnalysisResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestPerformanceTuningAnalysisResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateAnalyzeApplicationsConfigurationResponse updateAnalyzeApplicationsConfiguration(
            UpdateAnalyzeApplicationsConfigurationRequest request) {
        Objects.requireNonNull(
                request.getUpdateAnalyzeApplicationsConfigurationDetails(),
                "updateAnalyzeApplicationsConfigurationDetails is required");

        return clientCall(request, UpdateAnalyzeApplicationsConfigurationResponse::builder)
                .logger(LOG, "updateAnalyzeApplicationsConfiguration")
                .serviceDetails(
                        "JmsUtils",
                        "UpdateAnalyzeApplicationsConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/AnalyzeApplicationsConfiguration/UpdateAnalyzeApplicationsConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAnalyzeApplicationsConfigurationRequest::builder)
                .basePath("/20250521")
                .appendPathParam("analyzeApplicationsConfiguration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.AnalyzeApplicationsConfiguration.class,
                        UpdateAnalyzeApplicationsConfigurationResponse.Builder
                                ::analyzeApplicationsConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAnalyzeApplicationsConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateAnalyzeApplicationsConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateSubscriptionAcknowledgmentConfigurationResponse
            updateSubscriptionAcknowledgmentConfiguration(
                    UpdateSubscriptionAcknowledgmentConfigurationRequest request) {
        Objects.requireNonNull(
                request.getUpdateSubscriptionAcknowledgmentConfigurationDetails(),
                "updateSubscriptionAcknowledgmentConfigurationDetails is required");

        return clientCall(request, UpdateSubscriptionAcknowledgmentConfigurationResponse::builder)
                .logger(LOG, "updateSubscriptionAcknowledgmentConfiguration")
                .serviceDetails(
                        "JmsUtils",
                        "UpdateSubscriptionAcknowledgmentConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/jms-utils/20250521/SubscriptionAcknowledgmentConfiguration/UpdateSubscriptionAcknowledgmentConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSubscriptionAcknowledgmentConfigurationRequest::builder)
                .basePath("/20250521")
                .appendPathParam("subscriptionAcknowledgmentConfiguration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jmsutils.model.SubscriptionAcknowledgmentConfiguration.class,
                        UpdateSubscriptionAcknowledgmentConfigurationResponse.Builder
                                ::subscriptionAcknowledgmentConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateSubscriptionAcknowledgmentConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateSubscriptionAcknowledgmentConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public JmsUtilsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public JmsUtilsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JmsUtilsClient(
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
    public JmsUtilsClient(
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
    public JmsUtilsClient(
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
    public JmsUtilsClient(
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
    public JmsUtilsClient(
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
    public JmsUtilsClient(
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
    public JmsUtilsClient(
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
    public JmsUtilsClient(
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
