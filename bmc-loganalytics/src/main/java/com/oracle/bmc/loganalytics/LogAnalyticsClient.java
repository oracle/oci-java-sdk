/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class LogAnalyticsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements LogAnalytics {
    /** Service instance for LogAnalytics. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LOGANALYTICS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://loganalytics.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LogAnalyticsClient.class);

    private final LogAnalyticsWaiters waiters;

    private final LogAnalyticsPaginators paginators;

    LogAnalyticsClient(
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
                                    .nameFormat("LogAnalytics-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new LogAnalyticsWaiters(executorService, this);

        this.paginators = new LogAnalyticsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LogAnalyticsClient> {
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
        public LogAnalyticsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LogAnalyticsClient(this, authenticationDetailsProvider, executorService);
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
    public AddEntityAssociationResponse addEntityAssociation(AddEntityAssociationRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEntityId(), "logAnalyticsEntityId must not be blank");
        Objects.requireNonNull(
                request.getAddEntityAssociationDetails(),
                "addEntityAssociationDetails is required");

        return clientCall(request, AddEntityAssociationResponse::builder)
                .logger(LOG, "addEntityAssociation")
                .serviceDetails(
                        "LogAnalytics",
                        "AddEntityAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/AddEntityAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddEntityAssociationRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendPathParam(request.getLogAnalyticsEntityId())
                .appendPathParam("actions")
                .appendPathParam("addEntityAssociations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddEntityAssociationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public AddSourceEventTypesResponse addSourceEventTypes(AddSourceEventTypesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");
        Objects.requireNonNull(request.getAddEventTypeDetails(), "addEventTypeDetails is required");

        return clientCall(request, AddSourceEventTypesResponse::builder)
                .logger(LOG, "addSourceEventTypes")
                .serviceDetails(
                        "LogAnalytics",
                        "AddSourceEventTypes",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/AddSourceEventTypes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddSourceEventTypesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("actions")
                .appendPathParam("addEventTypes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddSourceEventTypesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public AppendLookupDataResponse appendLookupData(AppendLookupDataRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getLookupName(), "lookupName must not be blank");
        Objects.requireNonNull(
                request.getAppendLookupFileBody(), "appendLookupFileBody is required");

        return clientCall(request, AppendLookupDataResponse::builder)
                .logger(LOG, "appendLookupData")
                .serviceDetails(
                        "LogAnalytics",
                        "AppendLookupData",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/AppendLookupData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AppendLookupDataRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("lookups")
                .appendPathParam(request.getLookupName())
                .appendPathParam("actions")
                .appendPathParam("appendData")
                .appendQueryParam("isForce", request.getIsForce())
                .appendQueryParam("charEncoding", request.getCharEncoding())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("expect", request.getExpect())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", AppendLookupDataResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AppendLookupDataResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public AssignEncryptionKeyResponse assignEncryptionKey(AssignEncryptionKeyRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getAssignEncryptionKeyDetails(), "assignEncryptionKeyDetails is required");

        return clientCall(request, AssignEncryptionKeyResponse::builder)
                .logger(LOG, "assignEncryptionKey")
                .serviceDetails(
                        "LogAnalytics",
                        "AssignEncryptionKey",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/AssignEncryptionKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AssignEncryptionKeyRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("actions")
                .appendPathParam("assignEncryptionKey")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AssignEncryptionKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AssignEncryptionKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", AssignEncryptionKeyResponse.Builder::location)
                .callSync();
    }

    @Override
    public BatchGetBasicInfoResponse batchGetBasicInfo(BatchGetBasicInfoRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getBasicDetails(), "basicDetails is required");

        Objects.requireNonNull(request.getIsIncludeDeleted(), "isIncludeDeleted is required");

        return clientCall(request, BatchGetBasicInfoResponse::builder)
                .logger(LOG, "batchGetBasicInfo")
                .serviceDetails(
                        "LogAnalytics",
                        "BatchGetBasicInfo",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/BatchGetBasicInfo")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchGetBasicInfoRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("labels")
                .appendPathParam("actions")
                .appendPathParam("basicInfo")
                .appendQueryParam("isIncludeDeleted", request.getIsIncludeDeleted())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("basicLabelSortBy", request.getBasicLabelSortBy())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLabelCollection.class,
                        BatchGetBasicInfoResponse.Builder::logAnalyticsLabelCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", BatchGetBasicInfoResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", BatchGetBasicInfoResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", BatchGetBasicInfoResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CancelQueryWorkRequestResponse cancelQueryWorkRequest(
            CancelQueryWorkRequestRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelQueryWorkRequestResponse::builder)
                .logger(LOG, "cancelQueryWorkRequest")
                .serviceDetails(
                        "LogAnalytics",
                        "CancelQueryWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryWorkRequest/CancelQueryWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelQueryWorkRequestRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("queryWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", CancelQueryWorkRequestResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeIngestTimeRuleCompartmentResponse changeIngestTimeRuleCompartment(
            ChangeIngestTimeRuleCompartmentRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getIngestTimeRuleId(), "ingestTimeRuleId must not be blank");
        Objects.requireNonNull(
                request.getChangeIngestTimeRuleCompartmentDetails(),
                "changeIngestTimeRuleCompartmentDetails is required");

        return clientCall(request, ChangeIngestTimeRuleCompartmentResponse::builder)
                .logger(LOG, "changeIngestTimeRuleCompartment")
                .serviceDetails(
                        "LogAnalytics",
                        "ChangeIngestTimeRuleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/ChangeIngestTimeRuleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIngestTimeRuleCompartmentRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("ingestTimeRules")
                .appendPathParam(request.getIngestTimeRuleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIngestTimeRuleCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeLogAnalyticsEmBridgeCompartmentResponse changeLogAnalyticsEmBridgeCompartment(
            ChangeLogAnalyticsEmBridgeCompartmentRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEmBridgeId(), "logAnalyticsEmBridgeId must not be blank");
        Objects.requireNonNull(
                request.getChangeLogAnalyticsEmBridgeCompartmentDetails(),
                "changeLogAnalyticsEmBridgeCompartmentDetails is required");

        return clientCall(request, ChangeLogAnalyticsEmBridgeCompartmentResponse::builder)
                .logger(LOG, "changeLogAnalyticsEmBridgeCompartment")
                .serviceDetails(
                        "LogAnalytics",
                        "ChangeLogAnalyticsEmBridgeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/ChangeLogAnalyticsEmBridgeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLogAnalyticsEmBridgeCompartmentRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEmBridges")
                .appendPathParam(request.getLogAnalyticsEmBridgeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLogAnalyticsEmBridgeCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeLogAnalyticsEntityCompartmentResponse changeLogAnalyticsEntityCompartment(
            ChangeLogAnalyticsEntityCompartmentRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEntityId(), "logAnalyticsEntityId must not be blank");
        Objects.requireNonNull(
                request.getChangeLogAnalyticsEntityCompartmentDetails(),
                "changeLogAnalyticsEntityCompartmentDetails is required");

        return clientCall(request, ChangeLogAnalyticsEntityCompartmentResponse::builder)
                .logger(LOG, "changeLogAnalyticsEntityCompartment")
                .serviceDetails(
                        "LogAnalytics",
                        "ChangeLogAnalyticsEntityCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/ChangeLogAnalyticsEntityCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLogAnalyticsEntityCompartmentRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendPathParam(request.getLogAnalyticsEntityId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLogAnalyticsEntityCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeLogAnalyticsLogGroupCompartmentResponse changeLogAnalyticsLogGroupCompartment(
            ChangeLogAnalyticsLogGroupCompartmentRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsLogGroupId(), "logAnalyticsLogGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeLogAnalyticsLogGroupCompartmentDetails(),
                "changeLogAnalyticsLogGroupCompartmentDetails is required");

        return clientCall(request, ChangeLogAnalyticsLogGroupCompartmentResponse::builder)
                .logger(LOG, "changeLogAnalyticsLogGroupCompartment")
                .serviceDetails(
                        "LogAnalytics",
                        "ChangeLogAnalyticsLogGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/ChangeLogAnalyticsLogGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLogAnalyticsLogGroupCompartmentRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsLogGroups")
                .appendPathParam(request.getLogAnalyticsLogGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLogAnalyticsLogGroupCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse
            changeLogAnalyticsObjectCollectionRuleCompartment(
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsObjectCollectionRuleId(),
                "logAnalyticsObjectCollectionRuleId must not be blank");
        Objects.requireNonNull(
                request.getChangeLogAnalyticsObjectCollectionRuleCompartmentDetails(),
                "changeLogAnalyticsObjectCollectionRuleCompartmentDetails is required");

        return clientCall(
                        request, ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse::builder)
                .logger(LOG, "changeLogAnalyticsObjectCollectionRuleCompartment")
                .serviceDetails(
                        "LogAnalytics",
                        "ChangeLogAnalyticsObjectCollectionRuleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/ChangeLogAnalyticsObjectCollectionRuleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsObjectCollectionRules")
                .appendPathParam(request.getLogAnalyticsObjectCollectionRuleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeScheduledTaskCompartmentResponse changeScheduledTaskCompartment(
            ChangeScheduledTaskCompartmentRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getScheduledTaskId(), "scheduledTaskId must not be blank");
        Objects.requireNonNull(
                request.getChangeScheduledTaskCompartmentDetails(),
                "changeScheduledTaskCompartmentDetails is required");

        return clientCall(request, ChangeScheduledTaskCompartmentResponse::builder)
                .logger(LOG, "changeScheduledTaskCompartment")
                .serviceDetails(
                        "LogAnalytics",
                        "ChangeScheduledTaskCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/ChangeScheduledTaskCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeScheduledTaskCompartmentRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendPathParam(request.getScheduledTaskId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeScheduledTaskCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CleanResponse clean(CleanRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getScheduledTaskId(), "scheduledTaskId must not be blank");

        return clientCall(request, CleanResponse::builder)
                .logger(LOG, "clean")
                .serviceDetails(
                        "LogAnalytics",
                        "Clean",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/Clean")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CleanRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendPathParam(request.getScheduledTaskId())
                .appendPathParam("actions")
                .appendPathParam("clean")
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString("opc-request-id", CleanResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CompareContentResponse compareContent(CompareContentRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getCompareContentDetails(), "compareContentDetails is required");

        return clientCall(request, CompareContentResponse::builder)
                .logger(LOG, "compareContent")
                .serviceDetails(
                        "LogAnalytics",
                        "CompareContent",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/CompareContent")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CompareContentRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("search")
                .appendPathParam("actions")
                .appendPathParam("compareContent")
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.CompareContentResult.class,
                        CompareContentResponse.Builder::compareContentResult)
                .handleResponseHeaderString(
                        "opc-request-id", CompareContentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateIngestTimeRuleResponse createIngestTimeRule(CreateIngestTimeRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getCreateIngestTimeRuleDetails(),
                "createIngestTimeRuleDetails is required");

        return clientCall(request, CreateIngestTimeRuleResponse::builder)
                .logger(LOG, "createIngestTimeRule")
                .serviceDetails(
                        "LogAnalytics",
                        "CreateIngestTimeRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/CreateIngestTimeRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIngestTimeRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("ingestTimeRules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.IngestTimeRule.class,
                        CreateIngestTimeRuleResponse.Builder::ingestTimeRule)
                .handleResponseHeaderString("etag", CreateIngestTimeRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIngestTimeRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateLogAnalyticsEmBridgeResponse createLogAnalyticsEmBridge(
            CreateLogAnalyticsEmBridgeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getCreateLogAnalyticsEmBridgeDetails(),
                "createLogAnalyticsEmBridgeDetails is required");

        return clientCall(request, CreateLogAnalyticsEmBridgeResponse::builder)
                .logger(LOG, "createLogAnalyticsEmBridge")
                .serviceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsEmBridge",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/CreateLogAnalyticsEmBridge")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLogAnalyticsEmBridgeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEmBridges")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridge.class,
                        CreateLogAnalyticsEmBridgeResponse.Builder::logAnalyticsEmBridge)
                .handleResponseHeaderString(
                        "etag", CreateLogAnalyticsEmBridgeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLogAnalyticsEmBridgeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateLogAnalyticsEntityResponse createLogAnalyticsEntity(
            CreateLogAnalyticsEntityRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getCreateLogAnalyticsEntityDetails(),
                "createLogAnalyticsEntityDetails is required");

        return clientCall(request, CreateLogAnalyticsEntityResponse::builder)
                .logger(LOG, "createLogAnalyticsEntity")
                .serviceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsEntity",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/CreateLogAnalyticsEntity")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLogAnalyticsEntityRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEntity.class,
                        CreateLogAnalyticsEntityResponse.Builder::logAnalyticsEntity)
                .handleResponseHeaderString("etag", CreateLogAnalyticsEntityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLogAnalyticsEntityResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateLogAnalyticsEntityTypeResponse createLogAnalyticsEntityType(
            CreateLogAnalyticsEntityTypeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getCreateLogAnalyticsEntityTypeDetails(),
                "createLogAnalyticsEntityTypeDetails is required");

        return clientCall(request, CreateLogAnalyticsEntityTypeResponse::builder)
                .logger(LOG, "createLogAnalyticsEntityType")
                .serviceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsEntityType",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/CreateLogAnalyticsEntityType")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLogAnalyticsEntityTypeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntityTypes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateLogAnalyticsEntityTypeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateLogAnalyticsLogGroupResponse createLogAnalyticsLogGroup(
            CreateLogAnalyticsLogGroupRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getCreateLogAnalyticsLogGroupDetails(),
                "createLogAnalyticsLogGroupDetails is required");

        return clientCall(request, CreateLogAnalyticsLogGroupResponse::builder)
                .logger(LOG, "createLogAnalyticsLogGroup")
                .serviceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsLogGroup",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/CreateLogAnalyticsLogGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLogAnalyticsLogGroupRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsLogGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroup.class,
                        CreateLogAnalyticsLogGroupResponse.Builder::logAnalyticsLogGroup)
                .handleResponseHeaderString(
                        "etag", CreateLogAnalyticsLogGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLogAnalyticsLogGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateLogAnalyticsObjectCollectionRuleResponse createLogAnalyticsObjectCollectionRule(
            CreateLogAnalyticsObjectCollectionRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getCreateLogAnalyticsObjectCollectionRuleDetails(),
                "createLogAnalyticsObjectCollectionRuleDetails is required");

        return clientCall(request, CreateLogAnalyticsObjectCollectionRuleResponse::builder)
                .logger(LOG, "createLogAnalyticsObjectCollectionRule")
                .serviceDetails(
                        "LogAnalytics",
                        "CreateLogAnalyticsObjectCollectionRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/CreateLogAnalyticsObjectCollectionRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLogAnalyticsObjectCollectionRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsObjectCollectionRules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRule.class,
                        CreateLogAnalyticsObjectCollectionRuleResponse.Builder
                                ::logAnalyticsObjectCollectionRule)
                .handleResponseHeaderString(
                        "etag", CreateLogAnalyticsObjectCollectionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateLogAnalyticsObjectCollectionRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getCreateScheduledTaskDetails(), "createScheduledTaskDetails is required");

        return clientCall(request, CreateScheduledTaskResponse::builder)
                .logger(LOG, "createScheduledTask")
                .serviceDetails(
                        "LogAnalytics",
                        "CreateScheduledTask",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/CreateScheduledTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScheduledTaskRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ScheduledTask.class,
                        CreateScheduledTaskResponse.Builder::scheduledTask)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScheduledTaskResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateScheduledTaskResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteAssociationsResponse deleteAssociations(DeleteAssociationsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getDeleteLogAnalyticsAssociationDetails(),
                "deleteLogAnalyticsAssociationDetails is required");

        return clientCall(request, DeleteAssociationsResponse::builder)
                .logger(LOG, "deleteAssociations")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/DeleteAssociations")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeleteAssociationsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("associations")
                .appendPathParam("actions")
                .appendPathParam("delete")
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAssociationsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAssociationsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteFieldResponse deleteField(DeleteFieldRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getFieldName(), "fieldName must not be blank");

        return clientCall(request, DeleteFieldResponse::builder)
                .logger(LOG, "deleteField")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteField",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/DeleteField")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFieldRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("fields")
                .appendPathParam(request.getFieldName())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFieldResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteIngestTimeRuleResponse deleteIngestTimeRule(DeleteIngestTimeRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getIngestTimeRuleId(), "ingestTimeRuleId must not be blank");

        return clientCall(request, DeleteIngestTimeRuleResponse::builder)
                .logger(LOG, "deleteIngestTimeRule")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteIngestTimeRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/DeleteIngestTimeRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIngestTimeRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("ingestTimeRules")
                .appendPathParam(request.getIngestTimeRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIngestTimeRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteLabelResponse deleteLabel(DeleteLabelRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getLabelName(), "labelName must not be blank");

        return clientCall(request, DeleteLabelResponse::builder)
                .logger(LOG, "deleteLabel")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteLabel",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/DeleteLabel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLabelRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("labels")
                .appendPathParam(request.getLabelName())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLabelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteLogAnalyticsEmBridgeResponse deleteLogAnalyticsEmBridge(
            DeleteLogAnalyticsEmBridgeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEmBridgeId(), "logAnalyticsEmBridgeId must not be blank");

        return clientCall(request, DeleteLogAnalyticsEmBridgeResponse::builder)
                .logger(LOG, "deleteLogAnalyticsEmBridge")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsEmBridge",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/DeleteLogAnalyticsEmBridge")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLogAnalyticsEmBridgeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEmBridges")
                .appendPathParam(request.getLogAnalyticsEmBridgeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLogAnalyticsEmBridgeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLogAnalyticsEntityResponse deleteLogAnalyticsEntity(
            DeleteLogAnalyticsEntityRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEntityId(), "logAnalyticsEntityId must not be blank");

        return clientCall(request, DeleteLogAnalyticsEntityResponse::builder)
                .logger(LOG, "deleteLogAnalyticsEntity")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsEntity",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/DeleteLogAnalyticsEntity")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLogAnalyticsEntityRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendPathParam(request.getLogAnalyticsEntityId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLogAnalyticsEntityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLogAnalyticsEntityTypeResponse deleteLogAnalyticsEntityType(
            DeleteLogAnalyticsEntityTypeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getEntityTypeName(), "entityTypeName must not be blank");

        return clientCall(request, DeleteLogAnalyticsEntityTypeResponse::builder)
                .logger(LOG, "deleteLogAnalyticsEntityType")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsEntityType",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/DeleteLogAnalyticsEntityType")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLogAnalyticsEntityTypeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntityTypes")
                .appendPathParam(request.getEntityTypeName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteLogAnalyticsEntityTypeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLogAnalyticsLogGroupResponse deleteLogAnalyticsLogGroup(
            DeleteLogAnalyticsLogGroupRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsLogGroupId(), "logAnalyticsLogGroupId must not be blank");

        return clientCall(request, DeleteLogAnalyticsLogGroupResponse::builder)
                .logger(LOG, "deleteLogAnalyticsLogGroup")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsLogGroup",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/DeleteLogAnalyticsLogGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLogAnalyticsLogGroupRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsLogGroups")
                .appendPathParam(request.getLogAnalyticsLogGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLogAnalyticsLogGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteLogAnalyticsObjectCollectionRuleResponse deleteLogAnalyticsObjectCollectionRule(
            DeleteLogAnalyticsObjectCollectionRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsObjectCollectionRuleId(),
                "logAnalyticsObjectCollectionRuleId must not be blank");

        return clientCall(request, DeleteLogAnalyticsObjectCollectionRuleResponse::builder)
                .logger(LOG, "deleteLogAnalyticsObjectCollectionRule")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteLogAnalyticsObjectCollectionRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/DeleteLogAnalyticsObjectCollectionRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLogAnalyticsObjectCollectionRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsObjectCollectionRules")
                .appendPathParam(request.getLogAnalyticsObjectCollectionRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteLogAnalyticsObjectCollectionRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLookupResponse deleteLookup(DeleteLookupRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getLookupName(), "lookupName must not be blank");

        return clientCall(request, DeleteLookupResponse::builder)
                .logger(LOG, "deleteLookup")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteLookup",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/DeleteLookup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLookupRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("lookups")
                .appendPathParam(request.getLookupName())
                .appendQueryParam("isForce", request.getIsForce())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteLookupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLookupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteParserResponse deleteParser(DeleteParserRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getParserName(), "parserName must not be blank");

        return clientCall(request, DeleteParserResponse::builder)
                .logger(LOG, "deleteParser")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteParser",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/DeleteParser")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteParserRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parsers")
                .appendPathParam(request.getParserName())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteParserResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getScheduledTaskId(), "scheduledTaskId must not be blank");

        return clientCall(request, DeleteScheduledTaskResponse::builder)
                .logger(LOG, "deleteScheduledTask")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteScheduledTask",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/DeleteScheduledTask")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScheduledTaskRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendPathParam(request.getScheduledTaskId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScheduledTaskResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteSourceResponse deleteSource(DeleteSourceRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");

        return clientCall(request, DeleteSourceResponse::builder)
                .logger(LOG, "deleteSource")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteSource",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/DeleteSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSourceRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSourceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteUploadResponse deleteUpload(DeleteUploadRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getUploadReference(), "uploadReference must not be blank");

        return clientCall(request, DeleteUploadResponse::builder)
                .logger(LOG, "deleteUpload")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteUpload",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/DeleteUpload")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUploadRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("uploads")
                .appendPathParam(request.getUploadReference())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUploadResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "opc-deleted-log-count", DeleteUploadResponse.Builder::opcDeletedLogCount)
                .handleResponseHeaderLong(
                        "opc-deleted-logfile-count",
                        DeleteUploadResponse.Builder::opcDeletedLogfileCount)
                .callSync();
    }

    @Override
    public DeleteUploadFileResponse deleteUploadFile(DeleteUploadFileRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getUploadReference(), "uploadReference must not be blank");

        Validate.notBlank(request.getFileReference(), "fileReference must not be blank");

        return clientCall(request, DeleteUploadFileResponse::builder)
                .logger(LOG, "deleteUploadFile")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteUploadFile",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/DeleteUploadFile")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUploadFileRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("uploads")
                .appendPathParam(request.getUploadReference())
                .appendPathParam("files")
                .appendPathParam(request.getFileReference())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUploadFileResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "opc-deleted-log-count",
                        DeleteUploadFileResponse.Builder::opcDeletedLogCount)
                .handleResponseHeaderLong(
                        "opc-deleted-logfile-count",
                        DeleteUploadFileResponse.Builder::opcDeletedLogfileCount)
                .callSync();
    }

    @Override
    public DeleteUploadWarningResponse deleteUploadWarning(DeleteUploadWarningRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getUploadReference(), "uploadReference must not be blank");

        Validate.notBlank(request.getWarningReference(), "warningReference must not be blank");

        return clientCall(request, DeleteUploadWarningResponse::builder)
                .logger(LOG, "deleteUploadWarning")
                .serviceDetails(
                        "LogAnalytics",
                        "DeleteUploadWarning",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/DeleteUploadWarning")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUploadWarningRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("uploads")
                .appendPathParam(request.getUploadReference())
                .appendPathParam("warnings")
                .appendPathParam(request.getWarningReference())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUploadWarningResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableArchivingResponse disableArchiving(DisableArchivingRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, DisableArchivingResponse::builder)
                .logger(LOG, "disableArchiving")
                .serviceDetails(
                        "LogAnalytics",
                        "DisableArchiving",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/DisableArchiving")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableArchivingRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("actions")
                .appendPathParam("disableArchiving")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.Success.class,
                        DisableArchivingResponse.Builder::success)
                .handleResponseHeaderString(
                        "opc-request-id", DisableArchivingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", DisableArchivingResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DisableAutoAssociationResponse disableAutoAssociation(
            DisableAutoAssociationRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");
        Objects.requireNonNull(
                request.getDisableAutoAssociationDetails(),
                "disableAutoAssociationDetails is required");

        return clientCall(request, DisableAutoAssociationResponse::builder)
                .logger(LOG, "disableAutoAssociation")
                .serviceDetails(
                        "LogAnalytics",
                        "DisableAutoAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/DisableAutoAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAutoAssociationRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("actions")
                .appendPathParam("disableAutoAssociation")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableAutoAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableAutoAssociationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DisableIngestTimeRuleResponse disableIngestTimeRule(
            DisableIngestTimeRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getIngestTimeRuleId(), "ingestTimeRuleId must not be blank");

        return clientCall(request, DisableIngestTimeRuleResponse::builder)
                .logger(LOG, "disableIngestTimeRule")
                .serviceDetails(
                        "LogAnalytics",
                        "DisableIngestTimeRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/DisableIngestTimeRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableIngestTimeRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("ingestTimeRules")
                .appendPathParam(request.getIngestTimeRuleId())
                .appendPathParam("actions")
                .appendPathParam("disableIngestTimeRule")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableIngestTimeRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableIngestTimeRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DisableSourceEventTypesResponse disableSourceEventTypes(
            DisableSourceEventTypesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");
        Objects.requireNonNull(
                request.getDisableEventTypeDetails(), "disableEventTypeDetails is required");

        return clientCall(request, DisableSourceEventTypesResponse::builder)
                .logger(LOG, "disableSourceEventTypes")
                .serviceDetails(
                        "LogAnalytics",
                        "DisableSourceEventTypes",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/DisableSourceEventTypes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableSourceEventTypesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("actions")
                .appendPathParam("disableEventTypes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", DisableSourceEventTypesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EnableArchivingResponse enableArchiving(EnableArchivingRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, EnableArchivingResponse::builder)
                .logger(LOG, "enableArchiving")
                .serviceDetails(
                        "LogAnalytics",
                        "EnableArchiving",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/EnableArchiving")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableArchivingRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("actions")
                .appendPathParam("enableArchiving")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.Success.class,
                        EnableArchivingResponse.Builder::success)
                .handleResponseHeaderString(
                        "opc-request-id", EnableArchivingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", EnableArchivingResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EnableAutoAssociationResponse enableAutoAssociation(
            EnableAutoAssociationRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");
        Objects.requireNonNull(
                request.getEnableAutoAssociationDetails(),
                "enableAutoAssociationDetails is required");

        return clientCall(request, EnableAutoAssociationResponse::builder)
                .logger(LOG, "enableAutoAssociation")
                .serviceDetails(
                        "LogAnalytics",
                        "EnableAutoAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/EnableAutoAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAutoAssociationRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("actions")
                .appendPathParam("enableAutoAssociation")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableAutoAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableAutoAssociationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EnableIngestTimeRuleResponse enableIngestTimeRule(EnableIngestTimeRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getIngestTimeRuleId(), "ingestTimeRuleId must not be blank");

        return clientCall(request, EnableIngestTimeRuleResponse::builder)
                .logger(LOG, "enableIngestTimeRule")
                .serviceDetails(
                        "LogAnalytics",
                        "EnableIngestTimeRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/EnableIngestTimeRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableIngestTimeRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("ingestTimeRules")
                .appendPathParam(request.getIngestTimeRuleId())
                .appendPathParam("actions")
                .appendPathParam("enableIngestTimeRule")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableIngestTimeRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableIngestTimeRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EnableSourceEventTypesResponse enableSourceEventTypes(
            EnableSourceEventTypesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");
        Objects.requireNonNull(
                request.getEnableEventTypeDetails(), "enableEventTypeDetails is required");

        return clientCall(request, EnableSourceEventTypesResponse::builder)
                .logger(LOG, "enableSourceEventTypes")
                .serviceDetails(
                        "LogAnalytics",
                        "EnableSourceEventTypes",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/EnableSourceEventTypes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableSourceEventTypesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("actions")
                .appendPathParam("enableEventTypes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", EnableSourceEventTypesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EstimatePurgeDataSizeResponse estimatePurgeDataSize(
            EstimatePurgeDataSizeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getEstimatePurgeDataSizeDetails(),
                "estimatePurgeDataSizeDetails is required");

        return clientCall(request, EstimatePurgeDataSizeResponse::builder)
                .logger(LOG, "estimatePurgeDataSize")
                .serviceDetails(
                        "LogAnalytics",
                        "EstimatePurgeDataSize",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/EstimatePurgeDataSize")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EstimatePurgeDataSizeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("actions")
                .appendPathParam("estimatePurgeDataSize")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.EstimatePurgeDataSizeResult.class,
                        EstimatePurgeDataSizeResponse.Builder::estimatePurgeDataSizeResult)
                .handleResponseHeaderString(
                        "opc-request-id", EstimatePurgeDataSizeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", EstimatePurgeDataSizeResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EstimateRecallDataSizeResponse estimateRecallDataSize(
            EstimateRecallDataSizeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getEstimateRecallDataSizeDetails(),
                "estimateRecallDataSizeDetails is required");

        return clientCall(request, EstimateRecallDataSizeResponse::builder)
                .logger(LOG, "estimateRecallDataSize")
                .serviceDetails(
                        "LogAnalytics",
                        "EstimateRecallDataSize",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/EstimateRecallDataSize")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EstimateRecallDataSizeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("actions")
                .appendPathParam("estimateRecallDataSize")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.EstimateRecallDataSizeResult.class,
                        EstimateRecallDataSizeResponse.Builder::estimateRecallDataSizeResult)
                .handleResponseHeaderString(
                        "opc-request-id", EstimateRecallDataSizeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EstimateReleaseDataSizeResponse estimateReleaseDataSize(
            EstimateReleaseDataSizeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getEstimateReleaseDataSizeDetails(),
                "estimateReleaseDataSizeDetails is required");

        return clientCall(request, EstimateReleaseDataSizeResponse::builder)
                .logger(LOG, "estimateReleaseDataSize")
                .serviceDetails(
                        "LogAnalytics",
                        "EstimateReleaseDataSize",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/EstimateReleaseDataSize")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EstimateReleaseDataSizeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("actions")
                .appendPathParam("estimateReleaseDataSize")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.EstimateReleaseDataSizeResult.class,
                        EstimateReleaseDataSizeResponse.Builder::estimateReleaseDataSizeResult)
                .handleResponseHeaderString(
                        "opc-request-id", EstimateReleaseDataSizeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ExportCustomContentResponse exportCustomContent(ExportCustomContentRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getExportCustomContentDetails(), "exportCustomContentDetails is required");

        return clientCall(request, ExportCustomContentResponse::builder)
                .logger(LOG, "exportCustomContent")
                .serviceDetails("LogAnalytics", "ExportCustomContent", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportCustomContentRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("contents")
                .appendPathParam("actions")
                .appendPathParam("exportCustomContent")
                .accept("application/octet-stream")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class, ExportCustomContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", ExportCustomContentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ExportQueryResultResponse exportQueryResult(ExportQueryResultRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getExportDetails(), "exportDetails is required");

        return clientCall(request, ExportQueryResultResponse::builder)
                .logger(LOG, "exportQueryResult")
                .serviceDetails(
                        "LogAnalytics",
                        "ExportQueryResult",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/ExportQueryResult")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportQueryResultRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("search")
                .appendPathParam("actions")
                .appendPathParam("export")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class, ExportQueryResultResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", ExportQueryResultResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ExtractStructuredLogFieldPathsResponse extractStructuredLogFieldPaths(
            ExtractStructuredLogFieldPathsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getLoganParserDetails(), "loganParserDetails is required");

        return clientCall(request, ExtractStructuredLogFieldPathsResponse::builder)
                .logger(LOG, "extractStructuredLogFieldPaths")
                .serviceDetails(
                        "LogAnalytics",
                        "ExtractStructuredLogFieldPaths",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ExtractStructuredLogFieldPaths")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExtractStructuredLogFieldPathsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parsers")
                .appendPathParam("actions")
                .appendPathParam("extractLogFieldPaths")
                .appendEnumQueryParam("parserType", request.getParserType())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ExtractLogFieldResults.class,
                        ExtractStructuredLogFieldPathsResponse.Builder::extractLogFieldResults)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ExtractStructuredLogFieldPathsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ExtractStructuredLogHeaderPathsResponse extractStructuredLogHeaderPaths(
            ExtractStructuredLogHeaderPathsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getLoganParserDetails(), "loganParserDetails is required");

        return clientCall(request, ExtractStructuredLogHeaderPathsResponse::builder)
                .logger(LOG, "extractStructuredLogHeaderPaths")
                .serviceDetails(
                        "LogAnalytics",
                        "ExtractStructuredLogHeaderPaths",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ExtractStructuredLogHeaderPaths")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExtractStructuredLogHeaderPathsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parsers")
                .appendPathParam("actions")
                .appendPathParam("extractLogHeaderPaths")
                .appendEnumQueryParam("parserType", request.getParserType())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ExtractLogHeaderResults.class,
                        ExtractStructuredLogHeaderPathsResponse.Builder::extractLogHeaderResults)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ExtractStructuredLogHeaderPathsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public FilterResponse filter(FilterRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getFilterDetails(), "filterDetails is required");

        return clientCall(request, FilterResponse::builder)
                .logger(LOG, "filter")
                .serviceDetails(
                        "LogAnalytics",
                        "Filter",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/Filter")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FilterRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("search")
                .appendPathParam("actions")
                .appendPathParam("filter")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.FilterOutput.class,
                        FilterResponse.Builder::filterOutput)
                .handleResponseHeaderString("opc-request-id", FilterResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAssociationSummaryResponse getAssociationSummary(
            GetAssociationSummaryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetAssociationSummaryResponse::builder)
                .logger(LOG, "getAssociationSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetAssociationSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/GetAssociationSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAssociationSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("associationSummary")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.AssociationSummaryReport.class,
                        GetAssociationSummaryResponse.Builder::associationSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetAssociationSummaryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCategoryResponse getCategory(GetCategoryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getCategoryName(), "categoryName must not be blank");

        return clientCall(request, GetCategoryResponse::builder)
                .logger(LOG, "getCategory")
                .serviceDetails(
                        "LogAnalytics",
                        "GetCategory",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/GetCategory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCategoryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("categories")
                .appendPathParam(request.getCategoryName())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsCategory.class,
                        GetCategoryResponse.Builder::logAnalyticsCategory)
                .handleResponseHeaderString(
                        "opc-request-id", GetCategoryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetColumnNamesResponse getColumnNames(GetColumnNamesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getSqlQuery(), "sqlQuery is required");

        return clientCall(request, GetColumnNamesResponse::builder)
                .logger(LOG, "getColumnNames")
                .serviceDetails(
                        "LogAnalytics",
                        "GetColumnNames",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/GetColumnNames")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetColumnNamesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam("sqlColumnNames")
                .appendQueryParam("sqlQuery", request.getSqlQuery())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ColumnNameCollection.class,
                        GetColumnNamesResponse.Builder::columnNameCollection)
                .handleResponseHeaderString(
                        "opc-request-id", GetColumnNamesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetConfigWorkRequestResponse getConfigWorkRequest(GetConfigWorkRequestRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetConfigWorkRequestResponse::builder)
                .logger(LOG, "getConfigWorkRequest")
                .serviceDetails(
                        "LogAnalytics",
                        "GetConfigWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsConfigWorkRequest/GetConfigWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigWorkRequestRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("configWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequest.class,
                        GetConfigWorkRequestResponse.Builder::logAnalyticsConfigWorkRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigWorkRequestResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetFieldResponse getField(GetFieldRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getFieldName(), "fieldName must not be blank");

        return clientCall(request, GetFieldResponse::builder)
                .logger(LOG, "getField")
                .serviceDetails(
                        "LogAnalytics",
                        "GetField",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/GetField")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFieldRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("fields")
                .appendPathParam(request.getFieldName())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsField.class,
                        GetFieldResponse.Builder::logAnalyticsField)
                .handleResponseHeaderString("etag", GetFieldResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFieldResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetFieldsSummaryResponse getFieldsSummary(GetFieldsSummaryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetFieldsSummaryResponse::builder)
                .logger(LOG, "getFieldsSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetFieldsSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/GetFieldsSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFieldsSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("fieldSummary")
                .appendQueryParam("isShowDetail", request.getIsShowDetail())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.FieldSummaryReport.class,
                        GetFieldsSummaryResponse.Builder::fieldSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetFieldsSummaryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetIngestTimeRuleResponse getIngestTimeRule(GetIngestTimeRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getIngestTimeRuleId(), "ingestTimeRuleId must not be blank");

        return clientCall(request, GetIngestTimeRuleResponse::builder)
                .logger(LOG, "getIngestTimeRule")
                .serviceDetails(
                        "LogAnalytics",
                        "GetIngestTimeRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/GetIngestTimeRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIngestTimeRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("ingestTimeRules")
                .appendPathParam(request.getIngestTimeRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.IngestTimeRule.class,
                        GetIngestTimeRuleResponse.Builder::ingestTimeRule)
                .handleResponseHeaderString("etag", GetIngestTimeRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIngestTimeRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLabelResponse getLabel(GetLabelRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getLabelName(), "labelName must not be blank");

        return clientCall(request, GetLabelResponse::builder)
                .logger(LOG, "getLabel")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLabel",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/GetLabel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLabelRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("labels")
                .appendPathParam(request.getLabelName())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLabel.class,
                        GetLabelResponse.Builder::logAnalyticsLabel)
                .handleResponseHeaderString("etag", GetLabelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLabelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLabelSummaryResponse getLabelSummary(GetLabelSummaryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetLabelSummaryResponse::builder)
                .logger(LOG, "getLabelSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLabelSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/GetLabelSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLabelSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("labelSummary")
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LabelSummaryReport.class,
                        GetLabelSummaryResponse.Builder::labelSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetLabelSummaryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLogAnalyticsEmBridgeResponse getLogAnalyticsEmBridge(
            GetLogAnalyticsEmBridgeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEmBridgeId(), "logAnalyticsEmBridgeId must not be blank");

        return clientCall(request, GetLogAnalyticsEmBridgeResponse::builder)
                .logger(LOG, "getLogAnalyticsEmBridge")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEmBridge",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/GetLogAnalyticsEmBridge")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogAnalyticsEmBridgeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEmBridges")
                .appendPathParam(request.getLogAnalyticsEmBridgeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridge.class,
                        GetLogAnalyticsEmBridgeResponse.Builder::logAnalyticsEmBridge)
                .handleResponseHeaderString("etag", GetLogAnalyticsEmBridgeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLogAnalyticsEmBridgeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLogAnalyticsEmBridgeSummaryResponse getLogAnalyticsEmBridgeSummary(
            GetLogAnalyticsEmBridgeSummaryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetLogAnalyticsEmBridgeSummaryResponse::builder)
                .logger(LOG, "getLogAnalyticsEmBridgeSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEmBridgeSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/GetLogAnalyticsEmBridgeSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogAnalyticsEmBridgeSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEmBridges")
                .appendPathParam("emBridgeSummary")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeSummaryReport.class,
                        GetLogAnalyticsEmBridgeSummaryResponse.Builder
                                ::logAnalyticsEmBridgeSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetLogAnalyticsEmBridgeSummaryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLogAnalyticsEntitiesSummaryResponse getLogAnalyticsEntitiesSummary(
            GetLogAnalyticsEntitiesSummaryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetLogAnalyticsEntitiesSummaryResponse::builder)
                .logger(LOG, "getLogAnalyticsEntitiesSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEntitiesSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/GetLogAnalyticsEntitiesSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogAnalyticsEntitiesSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendPathParam("entitySummary")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEntitySummaryReport.class,
                        GetLogAnalyticsEntitiesSummaryResponse.Builder
                                ::logAnalyticsEntitySummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetLogAnalyticsEntitiesSummaryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLogAnalyticsEntityResponse getLogAnalyticsEntity(
            GetLogAnalyticsEntityRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEntityId(), "logAnalyticsEntityId must not be blank");

        return clientCall(request, GetLogAnalyticsEntityResponse::builder)
                .logger(LOG, "getLogAnalyticsEntity")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEntity",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/GetLogAnalyticsEntity")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogAnalyticsEntityRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendPathParam(request.getLogAnalyticsEntityId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEntity.class,
                        GetLogAnalyticsEntityResponse.Builder::logAnalyticsEntity)
                .handleResponseHeaderString("etag", GetLogAnalyticsEntityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLogAnalyticsEntityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLogAnalyticsEntityTypeResponse getLogAnalyticsEntityType(
            GetLogAnalyticsEntityTypeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getEntityTypeName(), "entityTypeName must not be blank");

        return clientCall(request, GetLogAnalyticsEntityTypeResponse::builder)
                .logger(LOG, "getLogAnalyticsEntityType")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsEntityType",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/GetLogAnalyticsEntityType")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogAnalyticsEntityTypeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntityTypes")
                .appendPathParam(request.getEntityTypeName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEntityType.class,
                        GetLogAnalyticsEntityTypeResponse.Builder::logAnalyticsEntityType)
                .handleResponseHeaderString("etag", GetLogAnalyticsEntityTypeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLogAnalyticsEntityTypeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLogAnalyticsLogGroupResponse getLogAnalyticsLogGroup(
            GetLogAnalyticsLogGroupRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsLogGroupId(), "logAnalyticsLogGroupId must not be blank");

        return clientCall(request, GetLogAnalyticsLogGroupResponse::builder)
                .logger(LOG, "getLogAnalyticsLogGroup")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsLogGroup",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/GetLogAnalyticsLogGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogAnalyticsLogGroupRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsLogGroups")
                .appendPathParam(request.getLogAnalyticsLogGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroup.class,
                        GetLogAnalyticsLogGroupResponse.Builder::logAnalyticsLogGroup)
                .handleResponseHeaderString("etag", GetLogAnalyticsLogGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLogAnalyticsLogGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLogAnalyticsLogGroupsSummaryResponse getLogAnalyticsLogGroupsSummary(
            GetLogAnalyticsLogGroupsSummaryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetLogAnalyticsLogGroupsSummaryResponse::builder)
                .logger(LOG, "getLogAnalyticsLogGroupsSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsLogGroupsSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/GetLogAnalyticsLogGroupsSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogAnalyticsLogGroupsSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsLogGroupsSummary")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogGroupSummaryReport.class,
                        GetLogAnalyticsLogGroupsSummaryResponse.Builder::logGroupSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetLogAnalyticsLogGroupsSummaryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLogAnalyticsObjectCollectionRuleResponse getLogAnalyticsObjectCollectionRule(
            GetLogAnalyticsObjectCollectionRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsObjectCollectionRuleId(),
                "logAnalyticsObjectCollectionRuleId must not be blank");

        return clientCall(request, GetLogAnalyticsObjectCollectionRuleResponse::builder)
                .logger(LOG, "getLogAnalyticsObjectCollectionRule")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLogAnalyticsObjectCollectionRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/GetLogAnalyticsObjectCollectionRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogAnalyticsObjectCollectionRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsObjectCollectionRules")
                .appendPathParam(request.getLogAnalyticsObjectCollectionRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRule.class,
                        GetLogAnalyticsObjectCollectionRuleResponse.Builder
                                ::logAnalyticsObjectCollectionRule)
                .handleResponseHeaderString(
                        "etag", GetLogAnalyticsObjectCollectionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetLogAnalyticsObjectCollectionRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLogSetsCountResponse getLogSetsCount(GetLogSetsCountRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetLogSetsCountResponse::builder)
                .logger(LOG, "getLogSetsCount")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLogSetsCount",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetLogSetsCount")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogSetsCountRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("logSetsCount")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogSetsCount.class,
                        GetLogSetsCountResponse.Builder::logSetsCount)
                .handleResponseHeaderString(
                        "opc-request-id", GetLogSetsCountResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLookupResponse getLookup(GetLookupRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getLookupName(), "lookupName must not be blank");

        return clientCall(request, GetLookupResponse::builder)
                .logger(LOG, "getLookup")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLookup",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/GetLookup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLookupRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("lookups")
                .appendPathParam(request.getLookupName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLookup.class,
                        GetLookupResponse.Builder::logAnalyticsLookup)
                .handleResponseHeaderString("etag", GetLookupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLookupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetLookupSummaryResponse getLookupSummary(GetLookupSummaryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetLookupSummaryResponse::builder)
                .logger(LOG, "getLookupSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetLookupSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/GetLookupSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLookupSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("lookupSummary")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LookupSummaryReport.class,
                        GetLookupSummaryResponse.Builder::lookupSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetLookupSummaryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetNamespaceResponse::builder)
                .logger(LOG, "getNamespace")
                .serviceDetails(
                        "LogAnalytics",
                        "GetNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Namespace/GetNamespace")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNamespaceRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.Namespace.class,
                        GetNamespaceResponse.Builder::namespace)
                .handleResponseHeaderString(
                        "opc-request-id", GetNamespaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetNamespaceResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetParserResponse getParser(GetParserRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getParserName(), "parserName must not be blank");

        return clientCall(request, GetParserResponse::builder)
                .logger(LOG, "getParser")
                .serviceDetails(
                        "LogAnalytics",
                        "GetParser",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/GetParser")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetParserRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parsers")
                .appendPathParam(request.getParserName())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsParser.class,
                        GetParserResponse.Builder::logAnalyticsParser)
                .handleResponseHeaderString("etag", GetParserResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetParserResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetParserSummaryResponse getParserSummary(GetParserSummaryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetParserSummaryResponse::builder)
                .logger(LOG, "getParserSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetParserSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/GetParserSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetParserSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parsersSummary")
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ParserSummaryReport.class,
                        GetParserSummaryResponse.Builder::parserSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetParserSummaryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetPreferencesResponse getPreferences(GetPreferencesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetPreferencesResponse::builder)
                .logger(LOG, "getPreferences")
                .serviceDetails(
                        "LogAnalytics",
                        "GetPreferences",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsPreference/GetPreferences")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPreferencesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("preferences")
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsPreferenceCollection.class,
                        GetPreferencesResponse.Builder::logAnalyticsPreferenceCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", GetPreferencesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", GetPreferencesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", GetPreferencesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetQueryResultResponse getQueryResult(GetQueryResultRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getWorkRequestId(), "workRequestId is required");

        return clientCall(request, GetQueryResultResponse::builder)
                .logger(LOG, "getQueryResult")
                .serviceDetails(
                        "LogAnalytics",
                        "GetQueryResult",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/GetQueryResult")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQueryResultRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("search")
                .appendPathParam("actions")
                .appendPathParam("query")
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("shouldIncludeColumns", request.getShouldIncludeColumns())
                .appendQueryParam("shouldIncludeFields", request.getShouldIncludeFields())
                .appendEnumQueryParam("outputMode", request.getOutputMode())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.QueryAggregation.class,
                        GetQueryResultResponse.Builder::queryAggregation)
                .handleResponseHeaderString(
                        "opc-request-id", GetQueryResultResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetQueryResultResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", GetQueryResultResponse.Builder::opcPrevPage)
                .handleResponseHeaderFloat(
                        "retry-after", GetQueryResultResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetQueryWorkRequestResponse getQueryWorkRequest(GetQueryWorkRequestRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetQueryWorkRequestResponse::builder)
                .logger(LOG, "getQueryWorkRequest")
                .serviceDetails(
                        "LogAnalytics",
                        "GetQueryWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryWorkRequest/GetQueryWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQueryWorkRequestRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("queryWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.QueryWorkRequest.class,
                        GetQueryWorkRequestResponse.Builder::queryWorkRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetQueryWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetQueryWorkRequestResponse.Builder::etag)
                .handleResponseHeaderFloat(
                        "retry-after", GetQueryWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetScheduledTaskResponse getScheduledTask(GetScheduledTaskRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getScheduledTaskId(), "scheduledTaskId must not be blank");

        return clientCall(request, GetScheduledTaskResponse::builder)
                .logger(LOG, "getScheduledTask")
                .serviceDetails(
                        "LogAnalytics",
                        "GetScheduledTask",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/GetScheduledTask")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduledTaskRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendPathParam(request.getScheduledTaskId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ScheduledTask.class,
                        GetScheduledTaskResponse.Builder::scheduledTask)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduledTaskResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetScheduledTaskResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSourceResponse getSource(GetSourceRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetSourceResponse::builder)
                .logger(LOG, "getSource")
                .serviceDetails(
                        "LogAnalytics",
                        "GetSource",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/GetSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSourceRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsSource.class,
                        GetSourceResponse.Builder::logAnalyticsSource)
                .handleResponseHeaderString("etag", GetSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSourceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSourceSummaryResponse getSourceSummary(GetSourceSummaryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetSourceSummaryResponse::builder)
                .logger(LOG, "getSourceSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetSourceSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/GetSourceSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSourceSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sourceSummary")
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.SourceSummaryReport.class,
                        GetSourceSummaryResponse.Builder::sourceSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetSourceSummaryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStorageResponse getStorage(GetStorageRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetStorageResponse::builder)
                .logger(LOG, "getStorage")
                .serviceDetails(
                        "LogAnalytics",
                        "GetStorage",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetStorage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStorageRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.Storage.class,
                        GetStorageResponse.Builder::storage)
                .handleResponseHeaderString(
                        "opc-request-id", GetStorageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetStorageResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStorageUsageResponse getStorageUsage(GetStorageUsageRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetStorageUsageResponse::builder)
                .logger(LOG, "getStorageUsage")
                .serviceDetails(
                        "LogAnalytics",
                        "GetStorageUsage",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetStorageUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStorageUsageRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("usage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.StorageUsage.class,
                        GetStorageUsageResponse.Builder::storageUsage)
                .handleResponseHeaderString(
                        "opc-request-id", GetStorageUsageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStorageWorkRequestResponse getStorageWorkRequest(
            GetStorageWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetStorageWorkRequestResponse::builder)
                .logger(LOG, "getStorageWorkRequest")
                .serviceDetails(
                        "LogAnalytics",
                        "GetStorageWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetStorageWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStorageWorkRequestRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storageWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.StorageWorkRequest.class,
                        GetStorageWorkRequestResponse.Builder::storageWorkRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetStorageWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetStorageWorkRequestResponse.Builder::etag)
                .handleResponseHeaderFloat(
                        "retry-after", GetStorageWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetUnprocessedDataBucketResponse getUnprocessedDataBucket(
            GetUnprocessedDataBucketRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetUnprocessedDataBucketResponse::builder)
                .logger(LOG, "getUnprocessedDataBucket")
                .serviceDetails(
                        "LogAnalytics",
                        "GetUnprocessedDataBucket",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/GetUnprocessedDataBucket")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUnprocessedDataBucketRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("unprocessedDataBucket")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.UnprocessedDataBucket.class,
                        GetUnprocessedDataBucketResponse.Builder::unprocessedDataBucket)
                .handleResponseHeaderString(
                        "opc-request-id", GetUnprocessedDataBucketResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetUploadResponse getUpload(GetUploadRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getUploadReference(), "uploadReference must not be blank");

        return clientCall(request, GetUploadResponse::builder)
                .logger(LOG, "getUpload")
                .serviceDetails(
                        "LogAnalytics",
                        "GetUpload",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/GetUpload")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUploadRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("uploads")
                .appendPathParam(request.getUploadReference())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.Upload.class,
                        GetUploadResponse.Builder::upload)
                .handleResponseHeaderString("etag", GetUploadResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetUploadResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "LogAnalytics",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ImportCustomContentResponse importCustomContent(ImportCustomContentRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getImportCustomContentFileBody(),
                "importCustomContentFileBody is required");

        return clientCall(request, ImportCustomContentResponse::builder)
                .logger(LOG, "importCustomContent")
                .serviceDetails(
                        "LogAnalytics",
                        "ImportCustomContent",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsImportCustomContent/ImportCustomContent")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportCustomContentRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("contents")
                .appendPathParam("actions")
                .appendPathParam("importCustomContent")
                .appendQueryParam("isOverwrite", request.getIsOverwrite())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("expect", request.getExpect())
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsImportCustomContent.class,
                        ImportCustomContentResponse.Builder::logAnalyticsImportCustomContent)
                .handleResponseHeaderString(
                        "opc-request-id", ImportCustomContentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAssociableEntitiesResponse listAssociableEntities(
            ListAssociableEntitiesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAssociableEntitiesResponse::builder)
                .logger(LOG, "listAssociableEntities")
                .serviceDetails(
                        "LogAnalytics",
                        "ListAssociableEntities",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListAssociableEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAssociableEntitiesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("associableEntities")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("searchText", request.getSearchText())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.AssociableEntityCollection.class,
                        ListAssociableEntitiesResponse.Builder::associableEntityCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAssociableEntitiesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssociableEntitiesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssociableEntitiesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAssociatedEntitiesResponse listAssociatedEntities(
            ListAssociatedEntitiesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAssociatedEntitiesResponse::builder)
                .logger(LOG, "listAssociatedEntities")
                .serviceDetails(
                        "LogAnalytics",
                        "ListAssociatedEntities",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/ListAssociatedEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAssociatedEntitiesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("associatedEntities")
                .appendQueryParam("entityId", request.getEntityId())
                .appendQueryParam("entityType", request.getEntityType())
                .appendQueryParam("entityTypeDisplayName", request.getEntityTypeDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsAssociatedEntityCollection
                                .class,
                        ListAssociatedEntitiesResponse.Builder
                                ::logAnalyticsAssociatedEntityCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAssociatedEntitiesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssociatedEntitiesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssociatedEntitiesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAutoAssociationsResponse listAutoAssociations(ListAutoAssociationsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");

        return clientCall(request, ListAutoAssociationsResponse::builder)
                .logger(LOG, "listAutoAssociations")
                .serviceDetails(
                        "LogAnalytics",
                        "ListAutoAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListAutoAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutoAssociationsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("autoAssociations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.AutoAssociationCollection.class,
                        ListAutoAssociationsResponse.Builder::autoAssociationCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAutoAssociationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutoAssociationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAutoAssociationsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListCategoriesResponse::builder)
                .logger(LOG, "listCategories")
                .serviceDetails(
                        "LogAnalytics",
                        "ListCategories",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/ListCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCategoriesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("categories")
                .appendQueryParam("categoryType", request.getCategoryType())
                .appendQueryParam("categoryDisplayText", request.getCategoryDisplayText())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("name", request.getName())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsCategoryCollection.class,
                        ListCategoriesResponse.Builder::logAnalyticsCategoryCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListCategoriesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListCategoriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCategoriesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListConfigWorkRequestsResponse listConfigWorkRequests(
            ListConfigWorkRequestsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListConfigWorkRequestsResponse::builder)
                .logger(LOG, "listConfigWorkRequests")
                .serviceDetails(
                        "LogAnalytics",
                        "ListConfigWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsConfigWorkRequest/ListConfigWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConfigWorkRequestsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("configWorkRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json;charset=UTF-8")
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsConfigWorkRequestCollection
                                .class,
                        ListConfigWorkRequestsResponse.Builder
                                ::logAnalyticsConfigWorkRequestCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListConfigWorkRequestsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListConfigWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListConfigWorkRequestsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListEncryptionKeyInfoResponse listEncryptionKeyInfo(
            ListEncryptionKeyInfoRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListEncryptionKeyInfoResponse::builder)
                .logger(LOG, "listEncryptionKeyInfo")
                .serviceDetails(
                        "LogAnalytics",
                        "ListEncryptionKeyInfo",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListEncryptionKeyInfo")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEncryptionKeyInfoRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("encryptionKeyInfo")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.EncryptionKeyInfoCollection.class,
                        ListEncryptionKeyInfoResponse.Builder::encryptionKeyInfoCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEncryptionKeyInfoResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListEntityAssociationsResponse listEntityAssociations(
            ListEntityAssociationsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEntityId(), "logAnalyticsEntityId must not be blank");

        return clientCall(request, ListEntityAssociationsResponse::builder)
                .logger(LOG, "listEntityAssociations")
                .serviceDetails(
                        "LogAnalytics",
                        "ListEntityAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/ListEntityAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEntityAssociationsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendPathParam(request.getLogAnalyticsEntityId())
                .appendPathParam("entityAssociations")
                .appendEnumQueryParam(
                        "directOrAllAssociations", request.getDirectOrAllAssociations())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEntityCollection.class,
                        ListEntityAssociationsResponse.Builder::logAnalyticsEntityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEntityAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEntityAssociationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListEntitySourceAssociationsResponse listEntitySourceAssociations(
            ListEntitySourceAssociationsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEntitySourceAssociationsResponse::builder)
                .logger(LOG, "listEntitySourceAssociations")
                .serviceDetails(
                        "LogAnalytics",
                        "ListEntitySourceAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/ListEntitySourceAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEntitySourceAssociationsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("entityAssociations")
                .appendQueryParam("entityId", request.getEntityId())
                .appendQueryParam("entityType", request.getEntityType())
                .appendQueryParam("entityTypeDisplayName", request.getEntityTypeDisplayName())
                .appendEnumQueryParam("lifeCycleState", request.getLifeCycleState())
                .appendQueryParam("isShowTotal", request.getIsShowTotal())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsAssociationCollection.class,
                        ListEntitySourceAssociationsResponse.Builder
                                ::logAnalyticsAssociationCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListEntitySourceAssociationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListEntitySourceAssociationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListEntitySourceAssociationsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListFieldsResponse listFields(ListFieldsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListFieldsResponse::builder)
                .logger(LOG, "listFields")
                .serviceDetails(
                        "LogAnalytics",
                        "ListFields",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/ListFields")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFieldsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("fields")
                .appendQueryParam("isMatchAll", request.getIsMatchAll())
                .appendQueryParam("sourceIds", request.getSourceIds())
                .appendQueryParam("sourceNames", request.getSourceNames())
                .appendEnumQueryParam("parserType", request.getParserType())
                .appendQueryParam("parserIds", request.getParserIds())
                .appendQueryParam("parserNames", request.getParserNames())
                .appendQueryParam("isIncludeParser", request.getIsIncludeParser())
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsFieldCollection.class,
                        ListFieldsResponse.Builder::logAnalyticsFieldCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListFieldsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListFieldsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListFieldsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListIngestTimeRulesResponse listIngestTimeRules(ListIngestTimeRulesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIngestTimeRulesResponse::builder)
                .logger(LOG, "listIngestTimeRules")
                .serviceDetails(
                        "LogAnalytics",
                        "ListIngestTimeRules",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/ListIngestTimeRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIngestTimeRulesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("ingestTimeRules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("conditionKind", request.getConditionKind())
                .appendQueryParam("fieldName", request.getFieldName())
                .appendQueryParam("fieldValue", request.getFieldValue())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.IngestTimeRuleSummaryCollection.class,
                        ListIngestTimeRulesResponse.Builder::ingestTimeRuleSummaryCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListIngestTimeRulesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListIngestTimeRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIngestTimeRulesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLabelPrioritiesResponse listLabelPriorities(ListLabelPrioritiesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListLabelPrioritiesResponse::builder)
                .logger(LOG, "listLabelPriorities")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLabelPriorities",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/ListLabelPriorities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLabelPrioritiesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("labelPriorities")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LabelPriorityCollection.class,
                        ListLabelPrioritiesResponse.Builder::labelPriorityCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListLabelPrioritiesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListLabelPrioritiesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLabelPrioritiesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLabelSourceDetailsResponse listLabelSourceDetails(
            ListLabelSourceDetailsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListLabelSourceDetailsResponse::builder)
                .logger(LOG, "listLabelSourceDetails")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLabelSourceDetails",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/ListLabelSourceDetails")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLabelSourceDetailsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("labelSourceDetails")
                .appendQueryParam("labelName", request.getLabelName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("labelSourceSortBy", request.getLabelSourceSortBy())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LabelSourceCollection.class,
                        ListLabelSourceDetailsResponse.Builder::labelSourceCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListLabelSourceDetailsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListLabelSourceDetailsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLabelSourceDetailsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLabelsResponse listLabels(ListLabelsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListLabelsResponse::builder)
                .logger(LOG, "listLabels")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLabels",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/ListLabels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLabelsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("labels")
                .appendQueryParam("labelName", request.getLabelName())
                .appendQueryParam("labelDisplayText", request.getLabelDisplayText())
                .appendEnumQueryParam("isSystem", request.getIsSystem())
                .appendEnumQueryParam("labelPriority", request.getLabelPriority())
                .appendQueryParam("isCountPop", request.getIsCountPop())
                .appendQueryParam("isAliasPop", request.getIsAliasPop())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("labelSortBy", request.getLabelSortBy())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLabelCollection.class,
                        ListLabelsResponse.Builder::logAnalyticsLabelCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListLabelsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListLabelsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLabelsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLogAnalyticsEmBridgesResponse listLogAnalyticsEmBridges(
            ListLogAnalyticsEmBridgesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLogAnalyticsEmBridgesResponse::builder)
                .logger(LOG, "listLogAnalyticsEmBridges")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsEmBridges",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/ListLogAnalyticsEmBridges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogAnalyticsEmBridgesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEmBridges")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("lifecycleDetailsContains", request.getLifecycleDetailsContains())
                .appendListQueryParam(
                        "importStatus",
                        request.getImportStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeCollection.class,
                        ListLogAnalyticsEmBridgesResponse.Builder::logAnalyticsEmBridgeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLogAnalyticsEmBridgesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLogAnalyticsEmBridgesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListLogAnalyticsEntitiesResponse listLogAnalyticsEntities(
            ListLogAnalyticsEntitiesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLogAnalyticsEntitiesResponse::builder)
                .logger(LOG, "listLogAnalyticsEntities")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsEntities",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/ListLogAnalyticsEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogAnalyticsEntitiesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendListQueryParam(
                        "entityTypeName",
                        request.getEntityTypeName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("cloudResourceId", request.getCloudResourceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("lifecycleDetailsContains", request.getLifecycleDetailsContains())
                .appendEnumQueryParam(
                        "isManagementAgentIdNull", request.getIsManagementAgentIdNull())
                .appendQueryParam("hostname", request.getHostname())
                .appendQueryParam("hostnameContains", request.getHostnameContains())
                .appendQueryParam("sourceId", request.getSourceId())
                .appendListQueryParam(
                        "creationSourceType",
                        request.getCreationSourceType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("creationSourceDetails", request.getCreationSourceDetails())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEntityCollection.class,
                        ListLogAnalyticsEntitiesResponse.Builder::logAnalyticsEntityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLogAnalyticsEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLogAnalyticsEntitiesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListLogAnalyticsEntityTopologyResponse listLogAnalyticsEntityTopology(
            ListLogAnalyticsEntityTopologyRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEntityId(), "logAnalyticsEntityId must not be blank");

        return clientCall(request, ListLogAnalyticsEntityTopologyResponse::builder)
                .logger(LOG, "listLogAnalyticsEntityTopology")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsEntityTopology",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntitySummary/ListLogAnalyticsEntityTopology")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogAnalyticsEntityTopologyRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendPathParam(request.getLogAnalyticsEntityId())
                .appendPathParam("entityTopology")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTopologyCollection
                                .class,
                        ListLogAnalyticsEntityTopologyResponse.Builder
                                ::logAnalyticsEntityTopologyCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListLogAnalyticsEntityTopologyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListLogAnalyticsEntityTopologyResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListLogAnalyticsEntityTypesResponse listLogAnalyticsEntityTypes(
            ListLogAnalyticsEntityTypesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListLogAnalyticsEntityTypesResponse::builder)
                .logger(LOG, "listLogAnalyticsEntityTypes")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsEntityTypes",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/ListLogAnalyticsEntityTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogAnalyticsEntityTypesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntityTypes")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendEnumQueryParam("cloudType", request.getCloudType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEntityTypeCollection.class,
                        ListLogAnalyticsEntityTypesResponse.Builder
                                ::logAnalyticsEntityTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLogAnalyticsEntityTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLogAnalyticsEntityTypesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListLogAnalyticsLogGroupsResponse listLogAnalyticsLogGroups(
            ListLogAnalyticsLogGroupsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLogAnalyticsLogGroupsResponse::builder)
                .logger(LOG, "listLogAnalyticsLogGroups")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsLogGroups",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/ListLogAnalyticsLogGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogAnalyticsLogGroupsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsLogGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroupSummaryCollection
                                .class,
                        ListLogAnalyticsLogGroupsResponse.Builder
                                ::logAnalyticsLogGroupSummaryCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListLogAnalyticsLogGroupsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLogAnalyticsLogGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLogAnalyticsLogGroupsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLogAnalyticsObjectCollectionRulesResponse listLogAnalyticsObjectCollectionRules(
            ListLogAnalyticsObjectCollectionRulesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLogAnalyticsObjectCollectionRulesResponse::builder)
                .logger(LOG, "listLogAnalyticsObjectCollectionRules")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLogAnalyticsObjectCollectionRules",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/ListLogAnalyticsObjectCollectionRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogAnalyticsObjectCollectionRulesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsObjectCollectionRules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRuleCollection
                                .class,
                        ListLogAnalyticsObjectCollectionRulesResponse.Builder
                                ::logAnalyticsObjectCollectionRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListLogAnalyticsObjectCollectionRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListLogAnalyticsObjectCollectionRulesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLogSetsResponse listLogSets(ListLogSetsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListLogSetsResponse::builder)
                .logger(LOG, "listLogSets")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLogSets",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListLogSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogSetsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("logSets")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendListQueryParam(
                        "logSetNameContains",
                        request.getLogSetNameContains(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogSetCollection.class,
                        ListLogSetsResponse.Builder::logSetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLogSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLogSetsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListLookupsResponse listLookups(ListLookupsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getType(), "type is required");

        return clientCall(request, ListLookupsResponse::builder)
                .logger(LOG, "listLookups")
                .serviceDetails(
                        "LogAnalytics",
                        "ListLookups",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/ListLookups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLookupsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("lookups")
                .appendQueryParam("lookupDisplayText", request.getLookupDisplayText())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("isSystem", request.getIsSystem())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("categories", request.getCategories())
                .appendQueryParam("isHideSpecial", request.getIsHideSpecial())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLookupCollection.class,
                        ListLookupsResponse.Builder::logAnalyticsLookupCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListLookupsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListLookupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLookupsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMetaSourceTypesResponse listMetaSourceTypes(ListMetaSourceTypesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListMetaSourceTypesResponse::builder)
                .logger(LOG, "listMetaSourceTypes")
                .serviceDetails(
                        "LogAnalytics",
                        "ListMetaSourceTypes",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListMetaSourceTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMetaSourceTypesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sourceMetaTypes")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsMetaSourceTypeCollection
                                .class,
                        ListMetaSourceTypesResponse.Builder::logAnalyticsMetaSourceTypeCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMetaSourceTypesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListMetaSourceTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListMetaSourceTypesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNamespacesResponse::builder)
                .logger(LOG, "listNamespaces")
                .serviceDetails(
                        "LogAnalytics",
                        "ListNamespaces",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Namespace/ListNamespaces")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNamespacesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.NamespaceCollection.class,
                        ListNamespacesResponse.Builder::namespaceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNamespacesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListParserFunctionsResponse listParserFunctions(ListParserFunctionsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListParserFunctionsResponse::builder)
                .logger(LOG, "listParserFunctions")
                .serviceDetails(
                        "LogAnalytics",
                        "ListParserFunctions",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ListParserFunctions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListParserFunctionsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parserFunctions")
                .appendQueryParam("parserName", request.getParserName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsParserFunctionCollection
                                .class,
                        ListParserFunctionsResponse.Builder::logAnalyticsParserFunctionCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListParserFunctionsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListParserFunctionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListParserFunctionsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListParserMetaPluginsResponse listParserMetaPlugins(
            ListParserMetaPluginsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListParserMetaPluginsResponse::builder)
                .logger(LOG, "listParserMetaPlugins")
                .serviceDetails(
                        "LogAnalytics",
                        "ListParserMetaPlugins",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ListParserMetaPlugins")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListParserMetaPluginsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parserMetaPlugins")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsParserMetaPluginCollection
                                .class,
                        ListParserMetaPluginsResponse.Builder
                                ::logAnalyticsParserMetaPluginCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListParserMetaPluginsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListParserMetaPluginsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListParserMetaPluginsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListParsersResponse listParsers(ListParsersRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListParsersResponse::builder)
                .logger(LOG, "listParsers")
                .serviceDetails(
                        "LogAnalytics",
                        "ListParsers",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/ListParsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListParsersRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parsers")
                .appendQueryParam("isMatchAll", request.getIsMatchAll())
                .appendEnumQueryParam("sourceType", request.getSourceType())
                .appendQueryParam("parserName", request.getParserName())
                .appendQueryParam("parserDisplayText", request.getParserDisplayText())
                .appendEnumQueryParam("parserType", request.getParserType())
                .appendQueryParam("categories", request.getCategories())
                .appendEnumQueryParam("isSystem", request.getIsSystem())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsParserCollection.class,
                        ListParsersResponse.Builder::logAnalyticsParserCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListParsersResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListParsersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListParsersResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListQueryWorkRequestsResponse listQueryWorkRequests(
            ListQueryWorkRequestsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListQueryWorkRequestsResponse::builder)
                .logger(LOG, "listQueryWorkRequests")
                .serviceDetails(
                        "LogAnalytics",
                        "ListQueryWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryWorkRequest/ListQueryWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListQueryWorkRequestsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("queryWorkRequests")
                .appendEnumQueryParam("mode", request.getMode())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.QueryWorkRequestCollection.class,
                        ListQueryWorkRequestsResponse.Builder::queryWorkRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListQueryWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListQueryWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListQueryWorkRequestsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListRecalledDataResponse listRecalledData(ListRecalledDataRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListRecalledDataResponse::builder)
                .logger(LOG, "listRecalledData")
                .serviceDetails(
                        "LogAnalytics",
                        "ListRecalledData",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListRecalledData")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecalledDataRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("recalledData")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam(
                        "timeDataStartedGreaterThanOrEqual",
                        request.getTimeDataStartedGreaterThanOrEqual())
                .appendQueryParam("timeDataEndedLessThan", request.getTimeDataEndedLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.RecalledDataCollection.class,
                        ListRecalledDataResponse.Builder::recalledDataCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecalledDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecalledDataResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListRecalledDataResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListResourceCategoriesResponse listResourceCategories(
            ListResourceCategoriesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListResourceCategoriesResponse::builder)
                .logger(LOG, "listResourceCategories")
                .serviceDetails(
                        "LogAnalytics",
                        "ListResourceCategories",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/ListResourceCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceCategoriesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("categories")
                .appendPathParam("resourceCategories")
                .appendQueryParam("categories", request.getCategories())
                .appendQueryParam("resourceTypes", request.getResourceTypes())
                .appendQueryParam("resourceIds", request.getResourceIds())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsResourceCategoryCollection
                                .class,
                        ListResourceCategoriesResponse.Builder
                                ::logAnalyticsResourceCategoryCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListResourceCategoriesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListResourceCategoriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListResourceCategoriesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListRulesResponse listRules(ListRulesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRulesResponse::builder)
                .logger(LOG, "listRules")
                .serviceDetails(
                        "LogAnalytics",
                        "ListRules",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Rule/ListRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRulesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("rules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("kind", request.getKind())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.RuleSummaryCollection.class,
                        ListRulesResponse.Builder::ruleSummaryCollection)
                .handleResponseHeaderString("opc-prev-page", ListRulesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListRulesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListScheduledTasksResponse listScheduledTasks(ListScheduledTasksRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getTaskType(), "taskType is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListScheduledTasksResponse::builder)
                .logger(LOG, "listScheduledTasks")
                .serviceDetails(
                        "LogAnalytics",
                        "ListScheduledTasks",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/ListScheduledTasks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScheduledTasksRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendEnumQueryParam("taskType", request.getTaskType())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("savedSearchId", request.getSavedSearchId())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ScheduledTaskCollection.class,
                        ListScheduledTasksResponse.Builder::scheduledTaskCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScheduledTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScheduledTasksResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListScheduledTasksResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSourceAssociationsResponse listSourceAssociations(
            ListSourceAssociationsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getSourceName(), "sourceName is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSourceAssociationsResponse::builder)
                .logger(LOG, "listSourceAssociations")
                .serviceDetails(
                        "LogAnalytics",
                        "ListSourceAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/ListSourceAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSourceAssociationsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sourceAssociations")
                .appendQueryParam("sourceName", request.getSourceName())
                .appendQueryParam("entityId", request.getEntityId())
                .appendEnumQueryParam("lifeCycleState", request.getLifeCycleState())
                .appendQueryParam("isShowTotal", request.getIsShowTotal())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsAssociationCollection.class,
                        ListSourceAssociationsResponse.Builder::logAnalyticsAssociationCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSourceAssociationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListSourceAssociationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSourceAssociationsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSourceEventTypesResponse listSourceEventTypes(ListSourceEventTypesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");

        return clientCall(request, ListSourceEventTypesResponse::builder)
                .logger(LOG, "listSourceEventTypes")
                .serviceDetails(
                        "LogAnalytics",
                        "ListSourceEventTypes",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourceEventTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSourceEventTypesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("eventTypes")
                .appendQueryParam("displayText", request.getDisplayText())
                .appendEnumQueryParam("isSystem", request.getIsSystem())
                .appendQueryParam("isEnabled", request.getIsEnabled())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.EventTypeCollection.class,
                        ListSourceEventTypesResponse.Builder::eventTypeCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSourceEventTypesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListSourceEventTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSourceEventTypesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSourceExtendedFieldDefinitionsResponse listSourceExtendedFieldDefinitions(
            ListSourceExtendedFieldDefinitionsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");

        return clientCall(request, ListSourceExtendedFieldDefinitionsResponse::builder)
                .logger(LOG, "listSourceExtendedFieldDefinitions")
                .serviceDetails(
                        "LogAnalytics",
                        "ListSourceExtendedFieldDefinitions",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourceExtendedFieldDefinitions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSourceExtendedFieldDefinitionsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("extendedFieldDefinitions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model
                                .LogAnalyticsSourceExtendedFieldDefinitionCollection.class,
                        ListSourceExtendedFieldDefinitionsResponse.Builder
                                ::logAnalyticsSourceExtendedFieldDefinitionCollection)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListSourceExtendedFieldDefinitionsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSourceExtendedFieldDefinitionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSourceExtendedFieldDefinitionsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSourceLabelOperatorsResponse listSourceLabelOperators(
            ListSourceLabelOperatorsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListSourceLabelOperatorsResponse::builder)
                .logger(LOG, "listSourceLabelOperators")
                .serviceDetails(
                        "LogAnalytics",
                        "ListSourceLabelOperators",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourceLabelOperators")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSourceLabelOperatorsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sourceLabelOperators")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLabelOperatorCollection.class,
                        ListSourceLabelOperatorsResponse.Builder
                                ::logAnalyticsLabelOperatorCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSourceLabelOperatorsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListSourceLabelOperatorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSourceLabelOperatorsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSourceMetaFunctionsResponse listSourceMetaFunctions(
            ListSourceMetaFunctionsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListSourceMetaFunctionsResponse::builder)
                .logger(LOG, "listSourceMetaFunctions")
                .serviceDetails(
                        "LogAnalytics",
                        "ListSourceMetaFunctions",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourceMetaFunctions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSourceMetaFunctionsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sourceMetaFunctions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsMetaFunctionCollection.class,
                        ListSourceMetaFunctionsResponse.Builder::logAnalyticsMetaFunctionCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSourceMetaFunctionsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListSourceMetaFunctionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSourceMetaFunctionsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSourcePatternsResponse listSourcePatterns(ListSourcePatternsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");

        return clientCall(request, ListSourcePatternsResponse::builder)
                .logger(LOG, "listSourcePatterns")
                .serviceDetails(
                        "LogAnalytics",
                        "ListSourcePatterns",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSourcePatterns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSourcePatternsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("patterns")
                .appendQueryParam("isInclude", request.getIsInclude())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsSourcePatternCollection.class,
                        ListSourcePatternsResponse.Builder::logAnalyticsSourcePatternCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSourcePatternsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListSourcePatternsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSourcePatternsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSourcesResponse listSources(ListSourcesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSourcesResponse::builder)
                .logger(LOG, "listSources")
                .serviceDetails(
                        "LogAnalytics",
                        "ListSources",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ListSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSourcesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendQueryParam("entityType", request.getEntityType())
                .appendQueryParam("sourceDisplayText", request.getSourceDisplayText())
                .appendEnumQueryParam("isSystem", request.getIsSystem())
                .appendQueryParam("isAutoAssociated", request.getIsAutoAssociated())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("categories", request.getCategories())
                .appendQueryParam("isSimplified", request.getIsSimplified())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsSourceCollection.class,
                        ListSourcesResponse.Builder::logAnalyticsSourceCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSourcesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListSourcesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSourcesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListStorageWorkRequestErrorsResponse listStorageWorkRequestErrors(
            ListStorageWorkRequestErrorsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListStorageWorkRequestErrorsResponse::builder)
                .logger(LOG, "listStorageWorkRequestErrors")
                .serviceDetails(
                        "LogAnalytics",
                        "ListStorageWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListStorageWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStorageWorkRequestErrorsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storageWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.WorkRequestErrorCollection.class,
                        ListStorageWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListStorageWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStorageWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListStorageWorkRequestErrorsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListStorageWorkRequestsResponse listStorageWorkRequests(
            ListStorageWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListStorageWorkRequestsResponse::builder)
                .logger(LOG, "listStorageWorkRequests")
                .serviceDetails(
                        "LogAnalytics",
                        "ListStorageWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListStorageWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStorageWorkRequestsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storageWorkRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("operationType", request.getOperationType())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("timeStarted", request.getTimeStarted())
                .appendQueryParam("timeFinished", request.getTimeFinished())
                .appendQueryParam("policyName", request.getPolicyName())
                .appendQueryParam("policyId", request.getPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.StorageWorkRequestCollection.class,
                        ListStorageWorkRequestsResponse.Builder::storageWorkRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListStorageWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStorageWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListStorageWorkRequestsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSupportedCharEncodingsResponse listSupportedCharEncodings(
            ListSupportedCharEncodingsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListSupportedCharEncodingsResponse::builder)
                .logger(LOG, "listSupportedCharEncodings")
                .serviceDetails(
                        "LogAnalytics",
                        "ListSupportedCharEncodings",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/CharEncodingCollection/ListSupportedCharEncodings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedCharEncodingsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("supportedCharEncodings")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.CharEncodingCollection.class,
                        ListSupportedCharEncodingsResponse.Builder::charEncodingCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSupportedCharEncodingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSupportedCharEncodingsResponse.Builder::opcNextPage)
                .handleResponseHeaderLong(
                        "opc-total-items",
                        ListSupportedCharEncodingsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSupportedTimezonesResponse listSupportedTimezones(
            ListSupportedTimezonesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListSupportedTimezonesResponse::builder)
                .logger(LOG, "listSupportedTimezones")
                .serviceDetails(
                        "LogAnalytics",
                        "ListSupportedTimezones",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/TimezoneCollection/ListSupportedTimezones")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedTimezonesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("supportedTimezones")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.TimezoneCollection.class,
                        ListSupportedTimezonesResponse.Builder::timezoneCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSupportedTimezonesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSupportedTimezonesResponse.Builder::opcNextPage)
                .handleResponseHeaderLong(
                        "opc-total-items", ListSupportedTimezonesResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListUploadFilesResponse listUploadFiles(ListUploadFilesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getUploadReference(), "uploadReference must not be blank");

        return clientCall(request, ListUploadFilesResponse::builder)
                .logger(LOG, "listUploadFiles")
                .serviceDetails(
                        "LogAnalytics",
                        "ListUploadFiles",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ListUploadFiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUploadFilesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("uploads")
                .appendPathParam(request.getUploadReference())
                .appendPathParam("files")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("searchStr", request.getSearchStr())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.UploadFileCollection.class,
                        ListUploadFilesResponse.Builder::uploadFileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListUploadFilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUploadFilesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListUploadWarningsResponse listUploadWarnings(ListUploadWarningsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getUploadReference(), "uploadReference must not be blank");

        return clientCall(request, ListUploadWarningsResponse::builder)
                .logger(LOG, "listUploadWarnings")
                .serviceDetails(
                        "LogAnalytics",
                        "ListUploadWarnings",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ListUploadWarnings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUploadWarningsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("uploads")
                .appendPathParam(request.getUploadReference())
                .appendPathParam("warnings")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.UploadWarningCollection.class,
                        ListUploadWarningsResponse.Builder::uploadWarningCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListUploadWarningsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUploadWarningsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListUploadsResponse listUploads(ListUploadsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListUploadsResponse::builder)
                .logger(LOG, "listUploads")
                .serviceDetails(
                        "LogAnalytics",
                        "ListUploads",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ListUploads")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUploadsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("uploads")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("warningsFilter", request.getWarningsFilter())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.UploadCollection.class,
                        ListUploadsResponse.Builder::uploadCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListUploadsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUploadsResponse.Builder::opcNextPage)
                .handleResponseHeaderLong(
                        "opc-total-items", ListUploadsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWarningsResponse listWarnings(ListWarningsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWarningsResponse::builder)
                .logger(LOG, "listWarnings")
                .serviceDetails(
                        "LogAnalytics",
                        "ListWarnings",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsWarning/ListWarnings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWarningsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("warnings")
                .appendEnumQueryParam("warningState", request.getWarningState())
                .appendQueryParam("sourceName", request.getSourceName())
                .appendQueryParam("sourcePattern", request.getSourcePattern())
                .appendQueryParam("warningMessage", request.getWarningMessage())
                .appendQueryParam("entityName", request.getEntityName())
                .appendQueryParam("entityType", request.getEntityType())
                .appendQueryParam("warningType", request.getWarningType())
                .appendQueryParam("isNoSource", request.getIsNoSource())
                .appendQueryParam("startTime", request.getStartTime())
                .appendQueryParam("endTime", request.getEndTime())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsWarningCollection.class,
                        ListWarningsResponse.Builder::logAnalyticsWarningCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWarningsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListWarningsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWarningsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "LogAnalytics",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "LogAnalytics",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/WorkRequestLog/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.WorkRequestLogCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "LogAnalytics",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public OffboardNamespaceResponse offboardNamespace(OffboardNamespaceRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, OffboardNamespaceResponse::builder)
                .logger(LOG, "offboardNamespace")
                .serviceDetails(
                        "LogAnalytics",
                        "OffboardNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Namespace/OffboardNamespace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(OffboardNamespaceRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("actions")
                .appendPathParam("offboard")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", OffboardNamespaceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", OffboardNamespaceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OnboardNamespaceResponse onboardNamespace(OnboardNamespaceRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, OnboardNamespaceResponse::builder)
                .logger(LOG, "onboardNamespace")
                .serviceDetails(
                        "LogAnalytics",
                        "OnboardNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Namespace/OnboardNamespace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(OnboardNamespaceRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("actions")
                .appendPathParam("onboard")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", OnboardNamespaceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", OnboardNamespaceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ParseQueryResponse parseQuery(ParseQueryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getParseQueryDetails(), "parseQueryDetails is required");

        return clientCall(request, ParseQueryResponse::builder)
                .logger(LOG, "parseQuery")
                .serviceDetails(
                        "LogAnalytics",
                        "ParseQuery",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/ParseQuery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ParseQueryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("search")
                .appendPathParam("actions")
                .appendPathParam("parse")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ParseQueryOutput.class,
                        ParseQueryResponse.Builder::parseQueryOutput)
                .handleResponseHeaderString(
                        "opc-request-id", ParseQueryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PauseScheduledTaskResponse pauseScheduledTask(PauseScheduledTaskRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getScheduledTaskId(), "scheduledTaskId must not be blank");

        return clientCall(request, PauseScheduledTaskResponse::builder)
                .logger(LOG, "pauseScheduledTask")
                .serviceDetails(
                        "LogAnalytics",
                        "PauseScheduledTask",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/PauseScheduledTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PauseScheduledTaskRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendPathParam(request.getScheduledTaskId())
                .appendPathParam("actions")
                .appendPathParam("pause")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ScheduledTask.class,
                        PauseScheduledTaskResponse.Builder::scheduledTask)
                .handleResponseHeaderString(
                        "opc-request-id", PauseScheduledTaskResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PauseScheduledTaskResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public PurgeStorageDataResponse purgeStorageData(PurgeStorageDataRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getPurgeStorageDataDetails(), "purgeStorageDataDetails is required");

        return clientCall(request, PurgeStorageDataResponse::builder)
                .logger(LOG, "purgeStorageData")
                .serviceDetails(
                        "LogAnalytics",
                        "PurgeStorageData",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/PurgeStorageData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PurgeStorageDataRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("actions")
                .appendPathParam("purgeData")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", PurgeStorageDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", PurgeStorageDataResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("location", PurgeStorageDataResponse.Builder::location)
                .callSync();
    }

    @Override
    public PutQueryWorkRequestBackgroundResponse putQueryWorkRequestBackground(
            PutQueryWorkRequestBackgroundRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, PutQueryWorkRequestBackgroundResponse::builder)
                .logger(LOG, "putQueryWorkRequestBackground")
                .serviceDetails(
                        "LogAnalytics",
                        "PutQueryWorkRequestBackground",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryWorkRequest/PutQueryWorkRequestBackground")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutQueryWorkRequestBackgroundRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("queryWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("actions")
                .appendPathParam("background")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.QueryWorkRequest.class,
                        PutQueryWorkRequestBackgroundResponse.Builder::queryWorkRequest)
                .handleResponseHeaderString(
                        "etag", PutQueryWorkRequestBackgroundResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PutQueryWorkRequestBackgroundResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public QueryResponse query(QueryRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getQueryDetails(), "queryDetails is required");

        return clientCall(request, QueryResponse::builder)
                .logger(LOG, "query")
                .serviceDetails(
                        "LogAnalytics",
                        "Query",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/Query")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(QueryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("search")
                .appendPathParam("actions")
                .appendPathParam("query")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.QueryAggregation.class,
                        QueryResponse.Builder::queryAggregation)
                .handleResponseHeaderString("opc-request-id", QueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page-id", QueryResponse.Builder::opcNextPageId)
                .handleResponseHeaderString(
                        "opc-prev-page-id", QueryResponse.Builder::opcPrevPageId)
                .handleResponseHeaderString(
                        "opc-work-request-id", QueryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("location", QueryResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RecallArchivedDataResponse recallArchivedData(RecallArchivedDataRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getRecallArchivedDataDetails(), "recallArchivedDataDetails is required");

        return clientCall(request, RecallArchivedDataResponse::builder)
                .logger(LOG, "recallArchivedData")
                .serviceDetails(
                        "LogAnalytics",
                        "RecallArchivedData",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/RecallArchivedData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RecallArchivedDataRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("actions")
                .appendPathParam("recallArchivedData")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RecallArchivedDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RecallArchivedDataResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", RecallArchivedDataResponse.Builder::location)
                .callSync();
    }

    @Override
    public RegisterLookupResponse registerLookup(RegisterLookupRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getType(), "type is required");

        Objects.requireNonNull(
                request.getRegisterLookupContentFileBody(),
                "registerLookupContentFileBody is required");

        return clientCall(request, RegisterLookupResponse::builder)
                .logger(LOG, "registerLookup")
                .serviceDetails(
                        "LogAnalytics",
                        "RegisterLookup",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/RegisterLookup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RegisterLookupRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("lookups")
                .appendPathParam("actions")
                .appendPathParam("register")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("description", request.getDescription())
                .appendQueryParam("charEncoding", request.getCharEncoding())
                .appendQueryParam("isHidden", request.getIsHidden())
                .appendEnumQueryParam("type", request.getType())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("expect", request.getExpect())
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLookup.class,
                        RegisterLookupResponse.Builder::logAnalyticsLookup)
                .handleResponseHeaderString("etag", RegisterLookupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RegisterLookupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ReleaseRecalledDataResponse releaseRecalledData(ReleaseRecalledDataRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getReleaseRecalledDataDetails(), "releaseRecalledDataDetails is required");

        return clientCall(request, ReleaseRecalledDataResponse::builder)
                .logger(LOG, "releaseRecalledData")
                .serviceDetails(
                        "LogAnalytics",
                        "ReleaseRecalledData",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ReleaseRecalledData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReleaseRecalledDataRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("actions")
                .appendPathParam("releaseRecalledData")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ReleaseRecalledDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ReleaseRecalledDataResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", ReleaseRecalledDataResponse.Builder::location)
                .callSync();
    }

    @Override
    public RemoveEntityAssociationsResponse removeEntityAssociations(
            RemoveEntityAssociationsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEntityId(), "logAnalyticsEntityId must not be blank");
        Objects.requireNonNull(
                request.getRemoveEntityAssociationsDetails(),
                "removeEntityAssociationsDetails is required");

        return clientCall(request, RemoveEntityAssociationsResponse::builder)
                .logger(LOG, "removeEntityAssociations")
                .serviceDetails(
                        "LogAnalytics",
                        "RemoveEntityAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/RemoveEntityAssociations")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveEntityAssociationsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendPathParam(request.getLogAnalyticsEntityId())
                .appendPathParam("actions")
                .appendPathParam("removeEntityAssociations")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemoveEntityAssociationsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RemovePreferencesResponse removePreferences(RemovePreferencesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getRemovePreferencesDetails(), "removePreferencesDetails is required");

        return clientCall(request, RemovePreferencesResponse::builder)
                .logger(LOG, "removePreferences")
                .serviceDetails(
                        "LogAnalytics",
                        "RemovePreferences",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsPreference/RemovePreferences")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemovePreferencesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("preferences")
                .appendPathParam("actions")
                .appendPathParam("removePreferences")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemovePreferencesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RemoveResourceCategoriesResponse removeResourceCategories(
            RemoveResourceCategoriesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceCategoriesDetails(),
                "removeResourceCategoriesDetails is required");

        return clientCall(request, RemoveResourceCategoriesResponse::builder)
                .logger(LOG, "removeResourceCategories")
                .serviceDetails(
                        "LogAnalytics",
                        "RemoveResourceCategories",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/RemoveResourceCategories")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveResourceCategoriesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("categories")
                .appendPathParam("actions")
                .appendPathParam("removeResourceCategories")
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemoveResourceCategoriesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RemoveSourceEventTypesResponse removeSourceEventTypes(
            RemoveSourceEventTypesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getSourceName(), "sourceName must not be blank");
        Objects.requireNonNull(
                request.getRemoveEventTypeDetails(), "removeEventTypeDetails is required");

        return clientCall(request, RemoveSourceEventTypesResponse::builder)
                .logger(LOG, "removeSourceEventTypes")
                .serviceDetails(
                        "LogAnalytics",
                        "RemoveSourceEventTypes",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/RemoveSourceEventTypes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveSourceEventTypesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam(request.getSourceName())
                .appendPathParam("actions")
                .appendPathParam("removeEventTypes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemoveSourceEventTypesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ResumeScheduledTaskResponse resumeScheduledTask(ResumeScheduledTaskRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getScheduledTaskId(), "scheduledTaskId must not be blank");

        return clientCall(request, ResumeScheduledTaskResponse::builder)
                .logger(LOG, "resumeScheduledTask")
                .serviceDetails(
                        "LogAnalytics",
                        "ResumeScheduledTask",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/ResumeScheduledTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResumeScheduledTaskRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendPathParam(request.getScheduledTaskId())
                .appendPathParam("actions")
                .appendPathParam("resume")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ScheduledTask.class,
                        ResumeScheduledTaskResponse.Builder::scheduledTask)
                .handleResponseHeaderString(
                        "opc-request-id", ResumeScheduledTaskResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ResumeScheduledTaskResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RunResponse run(RunRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getScheduledTaskId(), "scheduledTaskId must not be blank");

        return clientCall(request, RunResponse::builder)
                .logger(LOG, "run")
                .serviceDetails(
                        "LogAnalytics",
                        "Run",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/Run")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RunRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendPathParam(request.getScheduledTaskId())
                .appendPathParam("actions")
                .appendPathParam("run")
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString("opc-request-id", RunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SetUnprocessedDataBucketResponse setUnprocessedDataBucket(
            SetUnprocessedDataBucketRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getBucketName(), "bucketName is required");

        return clientCall(request, SetUnprocessedDataBucketResponse::builder)
                .logger(LOG, "setUnprocessedDataBucket")
                .serviceDetails(
                        "LogAnalytics",
                        "SetUnprocessedDataBucket",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/SetUnprocessedDataBucket")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SetUnprocessedDataBucketRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("actions")
                .appendPathParam("setUnprocessedDataBucket")
                .appendQueryParam("bucketName", request.getBucketName())
                .appendQueryParam("isEnabled", request.getIsEnabled())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.UnprocessedDataBucket.class,
                        SetUnprocessedDataBucketResponse.Builder::unprocessedDataBucket)
                .handleResponseHeaderString(
                        "opc-request-id", SetUnprocessedDataBucketResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SuggestResponse suggest(SuggestRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getSuggestDetails(), "suggestDetails is required");

        return clientCall(request, SuggestResponse::builder)
                .logger(LOG, "suggest")
                .serviceDetails(
                        "LogAnalytics",
                        "Suggest",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/QueryDetails/Suggest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SuggestRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("search")
                .appendPathParam("actions")
                .appendPathParam("suggest")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.SuggestOutput.class,
                        SuggestResponse.Builder::suggestOutput)
                .handleResponseHeaderString("opc-request-id", SuggestResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SuppressWarningResponse suppressWarning(SuppressWarningRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getWarningReferenceDetails(), "warningReferenceDetails is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, SuppressWarningResponse::builder)
                .logger(LOG, "suppressWarning")
                .serviceDetails(
                        "LogAnalytics",
                        "SuppressWarning",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsWarning/SuppressWarning")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SuppressWarningRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("warnings")
                .appendPathParam("actions")
                .appendPathParam("suppress")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", SuppressWarningResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public TestParserResponse testParser(TestParserRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getTestParserPayloadDetails(), "testParserPayloadDetails is required");

        return clientCall(request, TestParserResponse::builder)
                .logger(LOG, "testParser")
                .serviceDetails(
                        "LogAnalytics",
                        "TestParser",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/TestParser")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestParserRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parsers")
                .appendPathParam("actions")
                .appendPathParam("test")
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("reqOriginModule", request.getReqOriginModule())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ParserTestResult.class,
                        TestParserResponse.Builder::parserTestResult)
                .handleResponseHeaderString(
                        "opc-request-id", TestParserResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UnsuppressWarningResponse unsuppressWarning(UnsuppressWarningRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getWarningReferenceDetails(), "warningReferenceDetails is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, UnsuppressWarningResponse::builder)
                .logger(LOG, "unsuppressWarning")
                .serviceDetails(
                        "LogAnalytics",
                        "UnsuppressWarning",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsWarning/UnsuppressWarning")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnsuppressWarningRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("warnings")
                .appendPathParam("actions")
                .appendPathParam("unsuppress")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UnsuppressWarningResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateIngestTimeRuleResponse updateIngestTimeRule(UpdateIngestTimeRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getIngestTimeRuleId(), "ingestTimeRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIngestTimeRuleDetails(),
                "updateIngestTimeRuleDetails is required");

        return clientCall(request, UpdateIngestTimeRuleResponse::builder)
                .logger(LOG, "updateIngestTimeRule")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateIngestTimeRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/IngestTimeRule/UpdateIngestTimeRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIngestTimeRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("ingestTimeRules")
                .appendPathParam(request.getIngestTimeRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.IngestTimeRule.class,
                        UpdateIngestTimeRuleResponse.Builder::ingestTimeRule)
                .handleResponseHeaderString("etag", UpdateIngestTimeRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIngestTimeRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateLogAnalyticsEmBridgeResponse updateLogAnalyticsEmBridge(
            UpdateLogAnalyticsEmBridgeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEmBridgeId(), "logAnalyticsEmBridgeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLogAnalyticsEmBridgeDetails(),
                "updateLogAnalyticsEmBridgeDetails is required");

        return clientCall(request, UpdateLogAnalyticsEmBridgeResponse::builder)
                .logger(LOG, "updateLogAnalyticsEmBridge")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsEmBridge",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEmBridge/UpdateLogAnalyticsEmBridge")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLogAnalyticsEmBridgeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEmBridges")
                .appendPathParam(request.getLogAnalyticsEmBridgeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridge.class,
                        UpdateLogAnalyticsEmBridgeResponse.Builder::logAnalyticsEmBridge)
                .handleResponseHeaderString(
                        "etag", UpdateLogAnalyticsEmBridgeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLogAnalyticsEmBridgeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLogAnalyticsEntityResponse updateLogAnalyticsEntity(
            UpdateLogAnalyticsEntityRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsEntityId(), "logAnalyticsEntityId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLogAnalyticsEntityDetails(),
                "updateLogAnalyticsEntityDetails is required");

        return clientCall(request, UpdateLogAnalyticsEntityResponse::builder)
                .logger(LOG, "updateLogAnalyticsEntity")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsEntity",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/UpdateLogAnalyticsEntity")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLogAnalyticsEntityRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntities")
                .appendPathParam(request.getLogAnalyticsEntityId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsEntity.class,
                        UpdateLogAnalyticsEntityResponse.Builder::logAnalyticsEntity)
                .handleResponseHeaderString("etag", UpdateLogAnalyticsEntityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLogAnalyticsEntityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLogAnalyticsEntityTypeResponse updateLogAnalyticsEntityType(
            UpdateLogAnalyticsEntityTypeRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpdateLogAnalyticsEntityTypeDetails(),
                "updateLogAnalyticsEntityTypeDetails is required");

        Validate.notBlank(request.getEntityTypeName(), "entityTypeName must not be blank");

        return clientCall(request, UpdateLogAnalyticsEntityTypeResponse::builder)
                .logger(LOG, "updateLogAnalyticsEntityType")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsEntityType",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntityType/UpdateLogAnalyticsEntityType")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLogAnalyticsEntityTypeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsEntityTypes")
                .appendPathParam(request.getEntityTypeName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateLogAnalyticsEntityTypeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLogAnalyticsLogGroupResponse updateLogAnalyticsLogGroup(
            UpdateLogAnalyticsLogGroupRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsLogGroupId(), "logAnalyticsLogGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLogAnalyticsLogGroupDetails(),
                "updateLogAnalyticsLogGroupDetails is required");

        return clientCall(request, UpdateLogAnalyticsLogGroupResponse::builder)
                .logger(LOG, "updateLogAnalyticsLogGroup")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsLogGroup",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLogGroup/UpdateLogAnalyticsLogGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLogAnalyticsLogGroupRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsLogGroups")
                .appendPathParam(request.getLogAnalyticsLogGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLogGroup.class,
                        UpdateLogAnalyticsLogGroupResponse.Builder::logAnalyticsLogGroup)
                .handleResponseHeaderString(
                        "etag", UpdateLogAnalyticsLogGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLogAnalyticsLogGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateLogAnalyticsObjectCollectionRuleResponse updateLogAnalyticsObjectCollectionRule(
            UpdateLogAnalyticsObjectCollectionRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(
                request.getLogAnalyticsObjectCollectionRuleId(),
                "logAnalyticsObjectCollectionRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLogAnalyticsObjectCollectionRuleDetails(),
                "updateLogAnalyticsObjectCollectionRuleDetails is required");

        return clientCall(request, UpdateLogAnalyticsObjectCollectionRuleResponse::builder)
                .logger(LOG, "updateLogAnalyticsObjectCollectionRule")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateLogAnalyticsObjectCollectionRule",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsObjectCollectionRule/UpdateLogAnalyticsObjectCollectionRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLogAnalyticsObjectCollectionRuleRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("logAnalyticsObjectCollectionRules")
                .appendPathParam(request.getLogAnalyticsObjectCollectionRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRule.class,
                        UpdateLogAnalyticsObjectCollectionRuleResponse.Builder
                                ::logAnalyticsObjectCollectionRule)
                .handleResponseHeaderString(
                        "etag", UpdateLogAnalyticsObjectCollectionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateLogAnalyticsObjectCollectionRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLookupResponse updateLookup(UpdateLookupRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getLookupName(), "lookupName must not be blank");
        Objects.requireNonNull(
                request.getUpdateLookupMetadataDetails(),
                "updateLookupMetadataDetails is required");

        return clientCall(request, UpdateLookupResponse::builder)
                .logger(LOG, "updateLookup")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateLookup",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/UpdateLookup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLookupRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("lookups")
                .appendPathParam(request.getLookupName())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLookup.class,
                        UpdateLookupResponse.Builder::logAnalyticsLookup)
                .handleResponseHeaderString("etag", UpdateLookupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLookupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateLookupDataResponse updateLookupData(UpdateLookupDataRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getLookupName(), "lookupName must not be blank");
        Objects.requireNonNull(
                request.getUpdateLookupFileBody(), "updateLookupFileBody is required");

        return clientCall(request, UpdateLookupDataResponse::builder)
                .logger(LOG, "updateLookupData")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateLookupData",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLookup/UpdateLookupData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateLookupDataRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("lookups")
                .appendPathParam(request.getLookupName())
                .appendPathParam("actions")
                .appendPathParam("updateData")
                .appendQueryParam("isForce", request.getIsForce())
                .appendQueryParam("charEncoding", request.getCharEncoding())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("expect", request.getExpect())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateLookupDataResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLookupDataResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdatePreferencesResponse updatePreferences(UpdatePreferencesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpdatePreferencesDetails(), "updatePreferencesDetails is required");

        return clientCall(request, UpdatePreferencesResponse::builder)
                .logger(LOG, "updatePreferences")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdatePreferences",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsPreference/UpdatePreferences")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdatePreferencesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("preferences")
                .appendPathParam("actions")
                .appendPathParam("updatePreferences")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePreferencesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateResourceCategoriesResponse updateResourceCategories(
            UpdateResourceCategoriesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpdateResourceCategoriesDetails(),
                "updateResourceCategoriesDetails is required");

        return clientCall(request, UpdateResourceCategoriesResponse::builder)
                .logger(LOG, "updateResourceCategories")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateResourceCategories",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsCategory/UpdateResourceCategories")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateResourceCategoriesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("categories")
                .appendPathParam("actions")
                .appendPathParam("updateResourceCategories")
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateResourceCategoriesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateScheduledTaskResponse updateScheduledTask(UpdateScheduledTaskRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getScheduledTaskId(), "scheduledTaskId must not be blank");
        Objects.requireNonNull(
                request.getUpdateScheduledTaskDetails(), "updateScheduledTaskDetails is required");

        return clientCall(request, UpdateScheduledTaskResponse::builder)
                .logger(LOG, "updateScheduledTask")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateScheduledTask",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/UpdateScheduledTask")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScheduledTaskRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendPathParam(request.getScheduledTaskId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ScheduledTask.class,
                        UpdateScheduledTaskResponse.Builder::scheduledTask)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScheduledTaskResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateScheduledTaskResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateStorageResponse updateStorage(UpdateStorageRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpdateStorageDetails(), "updateStorageDetails is required");

        return clientCall(request, UpdateStorageResponse::builder)
                .logger(LOG, "updateStorage")
                .serviceDetails(
                        "LogAnalytics",
                        "UpdateStorage",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/UpdateStorage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStorageRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.Storage.class,
                        UpdateStorageResponse.Builder::storage)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStorageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateStorageResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UploadLogEventsFileResponse uploadLogEventsFile(UploadLogEventsFileRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getLogGroupId(), "logGroupId is required");

        Objects.requireNonNull(
                request.getUploadLogEventsFileDetails(), "uploadLogEventsFileDetails is required");

        return clientCall(request, UploadLogEventsFileResponse::builder)
                .logger(LOG, "uploadLogEventsFile")
                .serviceDetails(
                        "LogAnalytics",
                        "UploadLogEventsFile",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/UploadLogEventsFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadLogEventsFileRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("actions")
                .appendPathParam("uploadLogEventsFile")
                .appendQueryParam("logGroupId", request.getLogGroupId())
                .appendQueryParam("logSet", request.getLogSet())
                .appendEnumQueryParam("payloadType", request.getPayloadType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("content-type", request.getContentType())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("expect", request.getExpect())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UploadLogEventsFileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-object-id", UploadLogEventsFileResponse.Builder::opcObjectId)
                .handleResponseHeaderDate(
                        "timeCreated", UploadLogEventsFileResponse.Builder::timeCreated)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UploadLogFileResponse uploadLogFile(UploadLogFileRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getUploadName(), "uploadName is required");

        Objects.requireNonNull(request.getLogSourceName(), "logSourceName is required");

        Objects.requireNonNull(request.getFilename(), "filename is required");

        Objects.requireNonNull(request.getOpcMetaLoggrpid(), "opcMetaLoggrpid is required");

        Objects.requireNonNull(request.getUploadLogFileBody(), "uploadLogFileBody is required");

        return clientCall(request, UploadLogFileResponse::builder)
                .logger(LOG, "uploadLogFile")
                .serviceDetails(
                        "LogAnalytics",
                        "UploadLogFile",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/UploadLogFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadLogFileRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("actions")
                .appendPathParam("uploadLogFile")
                .appendQueryParam("uploadName", request.getUploadName())
                .appendQueryParam("logSourceName", request.getLogSourceName())
                .appendQueryParam("entityId", request.getEntityId())
                .appendQueryParam("timezone", request.getTimezone())
                .appendQueryParam("charEncoding", request.getCharEncoding())
                .appendQueryParam("dateFormat", request.getDateFormat())
                .appendQueryParam("dateYear", request.getDateYear())
                .appendQueryParam("invalidateCache", request.getInvalidateCache())
                .appendQueryParam("filename", request.getFilename())
                .appendQueryParam("logSet", request.getLogSet())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("content-md5", request.getContentMd5())
                .appendHeader("content-type", request.getContentType())
                .appendHeader("opc-meta-loggrpid", request.getOpcMetaLoggrpid())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("expect", request.getExpect())
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.Upload.class,
                        UploadLogFileResponse.Builder::upload)
                .handleResponseHeaderString(
                        "opc-request-id", UploadLogFileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-md5", UploadLogFileResponse.Builder::opcContentMd5)
                .handleResponseHeaderString(
                        "opc-object-id", UploadLogFileResponse.Builder::opcObjectId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpsertAssociationsResponse upsertAssociations(UpsertAssociationsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpsertLogAnalyticsAssociationDetails(),
                "upsertLogAnalyticsAssociationDetails is required");

        return clientCall(request, UpsertAssociationsResponse::builder)
                .logger(LOG, "upsertAssociations")
                .serviceDetails(
                        "LogAnalytics",
                        "UpsertAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/UpsertAssociations")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpsertAssociationsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("associations")
                .appendPathParam("actions")
                .appendPathParam("upsert")
                .appendQueryParam("isFromRepublish", request.getIsFromRepublish())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpsertAssociationsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpsertAssociationsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpsertFieldResponse upsertField(UpsertFieldRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpsertLogAnalyticsFieldDetails(),
                "upsertLogAnalyticsFieldDetails is required");

        return clientCall(request, UpsertFieldResponse::builder)
                .logger(LOG, "upsertField")
                .serviceDetails(
                        "LogAnalytics",
                        "UpsertField",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsField/UpsertField")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpsertFieldRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("fields")
                .appendPathParam("actions")
                .appendPathParam("upsert")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsField.class,
                        UpsertFieldResponse.Builder::logAnalyticsField)
                .handleResponseHeaderString("etag", UpsertFieldResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpsertFieldResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpsertLabelResponse upsertLabel(UpsertLabelRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpsertLogAnalyticsLabelDetails(),
                "upsertLogAnalyticsLabelDetails is required");

        return clientCall(request, UpsertLabelResponse::builder)
                .logger(LOG, "upsertLabel")
                .serviceDetails(
                        "LogAnalytics",
                        "UpsertLabel",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsLabel/UpsertLabel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpsertLabelRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("labels")
                .appendPathParam("actions")
                .appendPathParam("upsert")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsLabel.class,
                        UpsertLabelResponse.Builder::logAnalyticsLabel)
                .handleResponseHeaderString("etag", UpsertLabelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpsertLabelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpsertParserResponse upsertParser(UpsertParserRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpsertLogAnalyticsParserDetails(),
                "upsertLogAnalyticsParserDetails is required");

        return clientCall(request, UpsertParserResponse::builder)
                .logger(LOG, "upsertParser")
                .serviceDetails(
                        "LogAnalytics",
                        "UpsertParser",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsParser/UpsertParser")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpsertParserRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("parsers")
                .appendPathParam("actions")
                .appendPathParam("upsert")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsParser.class,
                        UpsertParserResponse.Builder::logAnalyticsParser)
                .handleResponseHeaderString("etag", UpsertParserResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpsertParserResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpsertSourceResponse upsertSource(UpsertSourceRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpsertLogAnalyticsSourceDetails(),
                "upsertLogAnalyticsSourceDetails is required");

        return clientCall(request, UpsertSourceResponse::builder)
                .logger(LOG, "upsertSource")
                .serviceDetails(
                        "LogAnalytics",
                        "UpsertSource",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/UpsertSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpsertSourceRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam("actions")
                .appendPathParam("upsert")
                .appendQueryParam("createLikeSourceId", request.getCreateLikeSourceId())
                .appendQueryParam("isIncremental", request.getIsIncremental())
                .appendQueryParam("isIgnoreWarning", request.getIsIgnoreWarning())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsSource.class,
                        UpsertSourceResponse.Builder::logAnalyticsSource)
                .handleResponseHeaderString("etag", UpsertSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpsertSourceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ValidateAssociationParametersResponse validateAssociationParameters(
            ValidateAssociationParametersRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpsertLogAnalyticsAssociationDetails(),
                "upsertLogAnalyticsAssociationDetails is required");

        return clientCall(request, ValidateAssociationParametersResponse::builder)
                .logger(LOG, "validateAssociationParameters")
                .serviceDetails(
                        "LogAnalytics",
                        "ValidateAssociationParameters",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsAssociation/ValidateAssociationParameters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateAssociationParametersRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("associations")
                .appendPathParam("actions")
                .appendPathParam("validateParameters")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.LogAnalyticsAssociationParameterCollection
                                .class,
                        ValidateAssociationParametersResponse.Builder
                                ::logAnalyticsAssociationParameterCollection)
                .handleResponseHeaderString(
                        "etag", ValidateAssociationParametersResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateAssociationParametersResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ValidateFileResponse validateFile(ValidateFileRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getObjectLocation(), "objectLocation is required");

        Objects.requireNonNull(request.getFilename(), "filename is required");

        return clientCall(request, ValidateFileResponse::builder)
                .logger(LOG, "validateFile")
                .serviceDetails(
                        "LogAnalytics",
                        "ValidateFile",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ValidateFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateFileRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("uploads")
                .appendPathParam("actions")
                .appendPathParam("validateFile")
                .appendQueryParam("objectLocation", request.getObjectLocation())
                .appendQueryParam("filename", request.getFilename())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.FileValidationResponse.class,
                        ValidateFileResponse.Builder::fileValidationResponse)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateFileResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ValidateSourceResponse validateSource(ValidateSourceRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpsertLogAnalyticsSourceDetails(),
                "upsertLogAnalyticsSourceDetails is required");

        return clientCall(request, ValidateSourceResponse::builder)
                .logger(LOG, "validateSource")
                .serviceDetails(
                        "LogAnalytics",
                        "ValidateSource",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ValidateSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateSourceRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam("actions")
                .appendPathParam("validate")
                .appendQueryParam("createLikeSourceId", request.getCreateLikeSourceId())
                .appendQueryParam("isIncremental", request.getIsIncremental())
                .appendQueryParam("isIgnoreWarning", request.getIsIgnoreWarning())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.SourceValidateResults.class,
                        ValidateSourceResponse.Builder::sourceValidateResults)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateSourceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ValidateSourceExtendedFieldDetailsResponse validateSourceExtendedFieldDetails(
            ValidateSourceExtendedFieldDetailsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getLogAnalyticsSource(), "logAnalyticsSource is required");

        return clientCall(request, ValidateSourceExtendedFieldDetailsResponse::builder)
                .logger(LOG, "validateSourceExtendedFieldDetails")
                .serviceDetails(
                        "LogAnalytics",
                        "ValidateSourceExtendedFieldDetails",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ValidateSourceExtendedFieldDetails")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateSourceExtendedFieldDetailsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam("actions")
                .appendPathParam("validateExtendedFields")
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ExtendedFieldsValidationResult.class,
                        ValidateSourceExtendedFieldDetailsResponse.Builder
                                ::extendedFieldsValidationResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateSourceExtendedFieldDetailsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ValidateSourceMappingResponse validateSourceMapping(
            ValidateSourceMappingRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getObjectLocation(), "objectLocation is required");

        Objects.requireNonNull(request.getFilename(), "filename is required");

        Objects.requireNonNull(request.getLogSourceName(), "logSourceName is required");

        return clientCall(request, ValidateSourceMappingResponse::builder)
                .logger(LOG, "validateSourceMapping")
                .serviceDetails(
                        "LogAnalytics",
                        "ValidateSourceMapping",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Upload/ValidateSourceMapping")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateSourceMappingRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("uploads")
                .appendPathParam("actions")
                .appendPathParam("validateSourceMapping")
                .appendQueryParam("objectLocation", request.getObjectLocation())
                .appendQueryParam("filename", request.getFilename())
                .appendQueryParam("logSourceName", request.getLogSourceName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.SourceMappingResponse.class,
                        ValidateSourceMappingResponse.Builder::sourceMappingResponse)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateSourceMappingResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public VerifyResponse verify(VerifyRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getScheduledTaskId(), "scheduledTaskId must not be blank");

        return clientCall(request, VerifyResponse::builder)
                .logger(LOG, "verify")
                .serviceDetails(
                        "LogAnalytics",
                        "Verify",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/ScheduledTask/Verify")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(VerifyRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("scheduledTasks")
                .appendPathParam(request.getScheduledTaskId())
                .appendPathParam("actions")
                .appendPathParam("verify")
                .appendQueryParam("shouldIncludeResults", request.getShouldIncludeResults())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.VerifyOutput.class,
                        VerifyResponse.Builder::verifyOutput)
                .handleResponseHeaderString("opc-request-id", VerifyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public LogAnalyticsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public LogAnalyticsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
    public LogAnalyticsClient(
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
