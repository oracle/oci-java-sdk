/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;

import java.util.Objects;

/**
 * Async client implementation for LogAnalytics service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class LogAnalyticsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements LogAnalyticsAsync {
    /** Service instance for LogAnalytics. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LOGANALYTICS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://loganalytics.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LogAnalyticsAsyncClient.class);

    LogAnalyticsAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    LogAnalyticsAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "LogAnalyticsAsyncClient", "exportCustomContent,exportQueryResult"));
        }
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LogAnalyticsAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "loganalytics";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public LogAnalyticsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LogAnalyticsAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<AddEntityAssociationResponse> addEntityAssociation(
            AddEntityAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddEntityAssociationRequest, AddEntityAssociationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddSourceEventTypesResponse> addSourceEventTypes(
            AddSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddSourceEventTypesRequest, AddSourceEventTypesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AppendLookupDataResponse> appendLookupData(
            AppendLookupDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AppendLookupDataRequest, AppendLookupDataResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AssignEncryptionKeyResponse> assignEncryptionKey(
            AssignEncryptionKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AssignEncryptionKeyRequest, AssignEncryptionKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BatchGetBasicInfoResponse> batchGetBasicInfo(
            BatchGetBasicInfoRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BatchGetBasicInfoRequest, BatchGetBasicInfoResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelQueryWorkRequestResponse> cancelQueryWorkRequest(
            CancelQueryWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelQueryWorkRequestRequest, CancelQueryWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeIngestTimeRuleCompartmentResponse>
            changeIngestTimeRuleCompartment(
                    ChangeIngestTimeRuleCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIngestTimeRuleCompartmentRequest,
                                    ChangeIngestTimeRuleCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeLogAnalyticsEmBridgeCompartmentResponse>
            changeLogAnalyticsEmBridgeCompartment(
                    ChangeLogAnalyticsEmBridgeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsEmBridgeCompartmentRequest,
                                    ChangeLogAnalyticsEmBridgeCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeLogAnalyticsEntityCompartmentResponse>
            changeLogAnalyticsEntityCompartment(
                    ChangeLogAnalyticsEntityCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsEntityCompartmentRequest,
                                    ChangeLogAnalyticsEntityCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeLogAnalyticsLogGroupCompartmentResponse>
            changeLogAnalyticsLogGroupCompartment(
                    ChangeLogAnalyticsLogGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsLogGroupCompartmentRequest,
                                    ChangeLogAnalyticsLogGroupCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>
            changeLogAnalyticsObjectCollectionRuleCompartment(
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest,
                                    ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeScheduledTaskCompartmentResponse>
            changeScheduledTaskCompartment(
                    ChangeScheduledTaskCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeScheduledTaskCompartmentRequest,
                                    ChangeScheduledTaskCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CleanResponse> clean(
            CleanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CleanRequest, CleanResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CompareContentResponse> compareContent(
            CompareContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CompareContentRequest, CompareContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIngestTimeRuleResponse> createIngestTimeRule(
            CreateIngestTimeRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIngestTimeRuleRequest, CreateIngestTimeRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsEmBridgeResponse>
            createLogAnalyticsEmBridge(
                    CreateLogAnalyticsEmBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLogAnalyticsEmBridgeRequest,
                                    CreateLogAnalyticsEmBridgeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsEntityResponse> createLogAnalyticsEntity(
            CreateLogAnalyticsEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateLogAnalyticsEntityRequest, CreateLogAnalyticsEntityResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsEntityTypeResponse>
            createLogAnalyticsEntityType(
                    CreateLogAnalyticsEntityTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLogAnalyticsEntityTypeRequest,
                                    CreateLogAnalyticsEntityTypeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsLogGroupResponse>
            createLogAnalyticsLogGroup(
                    CreateLogAnalyticsLogGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLogAnalyticsLogGroupRequest,
                                    CreateLogAnalyticsLogGroupResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLogAnalyticsObjectCollectionRuleResponse>
            createLogAnalyticsObjectCollectionRule(
                    CreateLogAnalyticsObjectCollectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLogAnalyticsObjectCollectionRuleRequest,
                                    CreateLogAnalyticsObjectCollectionRuleResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduledTaskResponse> createScheduledTask(
            CreateScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledTaskRequest, CreateScheduledTaskResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationsResponse> deleteAssociations(
            DeleteAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAssociationsRequest, DeleteAssociationsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFieldResponse> deleteField(
            DeleteFieldRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFieldRequest, DeleteFieldResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIngestTimeRuleResponse> deleteIngestTimeRule(
            DeleteIngestTimeRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIngestTimeRuleRequest, DeleteIngestTimeRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelResponse> deleteLabel(
            DeleteLabelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteLabelRequest, DeleteLabelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsEmBridgeResponse>
            deleteLogAnalyticsEmBridge(
                    DeleteLogAnalyticsEmBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLogAnalyticsEmBridgeRequest,
                                    DeleteLogAnalyticsEmBridgeResponse>
                            handler) {

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
                .appendQueryParam("isDeleteEntities", request.getIsDeleteEntities())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLogAnalyticsEmBridgeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsEntityResponse> deleteLogAnalyticsEntity(
            DeleteLogAnalyticsEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteLogAnalyticsEntityRequest, DeleteLogAnalyticsEntityResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsEntityTypeResponse>
            deleteLogAnalyticsEntityType(
                    DeleteLogAnalyticsEntityTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLogAnalyticsEntityTypeRequest,
                                    DeleteLogAnalyticsEntityTypeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsLogGroupResponse>
            deleteLogAnalyticsLogGroup(
                    DeleteLogAnalyticsLogGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLogAnalyticsLogGroupRequest,
                                    DeleteLogAnalyticsLogGroupResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogAnalyticsObjectCollectionRuleResponse>
            deleteLogAnalyticsObjectCollectionRule(
                    DeleteLogAnalyticsObjectCollectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLogAnalyticsObjectCollectionRuleRequest,
                                    DeleteLogAnalyticsObjectCollectionRuleResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLookupResponse> deleteLookup(
            DeleteLookupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteLookupRequest, DeleteLookupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteParserResponse> deleteParser(
            DeleteParserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteParserRequest, DeleteParserResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledTaskResponse> deleteScheduledTask(
            DeleteScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSourceResponse> deleteSource(
            DeleteSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSourceRequest, DeleteSourceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadResponse> deleteUpload(
            DeleteUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteUploadRequest, DeleteUploadResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadFileResponse> deleteUploadFile(
            DeleteUploadFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUploadFileRequest, DeleteUploadFileResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUploadWarningResponse> deleteUploadWarning(
            DeleteUploadWarningRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUploadWarningRequest, DeleteUploadWarningResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableArchivingResponse> disableArchiving(
            DisableArchivingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableArchivingRequest, DisableArchivingResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableAutoAssociationResponse> disableAutoAssociation(
            DisableAutoAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableAutoAssociationRequest, DisableAutoAssociationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableIngestTimeRuleResponse> disableIngestTimeRule(
            DisableIngestTimeRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableIngestTimeRuleRequest, DisableIngestTimeRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableSourceEventTypesResponse> disableSourceEventTypes(
            DisableSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableSourceEventTypesRequest, DisableSourceEventTypesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableArchivingResponse> enableArchiving(
            EnableArchivingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableArchivingRequest, EnableArchivingResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableAutoAssociationResponse> enableAutoAssociation(
            EnableAutoAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableAutoAssociationRequest, EnableAutoAssociationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableIngestTimeRuleResponse> enableIngestTimeRule(
            EnableIngestTimeRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableIngestTimeRuleRequest, EnableIngestTimeRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableSourceEventTypesResponse> enableSourceEventTypes(
            EnableSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableSourceEventTypesRequest, EnableSourceEventTypesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EstimatePurgeDataSizeResponse> estimatePurgeDataSize(
            EstimatePurgeDataSizeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EstimatePurgeDataSizeRequest, EstimatePurgeDataSizeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EstimateRecallDataSizeResponse> estimateRecallDataSize(
            EstimateRecallDataSizeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EstimateRecallDataSizeRequest, EstimateRecallDataSizeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EstimateReleaseDataSizeResponse> estimateReleaseDataSize(
            EstimateReleaseDataSizeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EstimateReleaseDataSizeRequest, EstimateReleaseDataSizeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportCustomContentResponse> exportCustomContent(
            ExportCustomContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportCustomContentRequest, ExportCustomContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportQueryResultResponse> exportQueryResult(
            ExportQueryResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportQueryResultRequest, ExportQueryResultResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExtractStructuredLogFieldPathsResponse>
            extractStructuredLogFieldPaths(
                    ExtractStructuredLogFieldPathsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ExtractStructuredLogFieldPathsRequest,
                                    ExtractStructuredLogFieldPathsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExtractStructuredLogHeaderPathsResponse>
            extractStructuredLogHeaderPaths(
                    ExtractStructuredLogHeaderPathsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ExtractStructuredLogHeaderPathsRequest,
                                    ExtractStructuredLogHeaderPathsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<FilterResponse> filter(
            FilterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<FilterRequest, FilterResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAssociationSummaryResponse> getAssociationSummary(
            GetAssociationSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAssociationSummaryRequest, GetAssociationSummaryResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCategoryResponse> getCategory(
            GetCategoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCategoryRequest, GetCategoryResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetColumnNamesResponse> getColumnNames(
            GetColumnNamesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetColumnNamesRequest, GetColumnNamesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigWorkRequestResponse> getConfigWorkRequest(
            GetConfigWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigWorkRequestRequest, GetConfigWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFieldResponse> getField(
            GetFieldRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFieldRequest, GetFieldResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFieldsSummaryResponse> getFieldsSummary(
            GetFieldsSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFieldsSummaryRequest, GetFieldsSummaryResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIngestTimeRuleResponse> getIngestTimeRule(
            GetIngestTimeRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIngestTimeRuleRequest, GetIngestTimeRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLabelResponse> getLabel(
            GetLabelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetLabelRequest, GetLabelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLabelSummaryResponse> getLabelSummary(
            GetLabelSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLabelSummaryRequest, GetLabelSummaryResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEmBridgeResponse> getLogAnalyticsEmBridge(
            GetLogAnalyticsEmBridgeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEmBridgeSummaryResponse>
            getLogAnalyticsEmBridgeSummary(
                    GetLogAnalyticsEmBridgeSummaryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsEmBridgeSummaryRequest,
                                    GetLogAnalyticsEmBridgeSummaryResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEntitiesSummaryResponse>
            getLogAnalyticsEntitiesSummary(
                    GetLogAnalyticsEntitiesSummaryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsEntitiesSummaryRequest,
                                    GetLogAnalyticsEntitiesSummaryResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEntityResponse> getLogAnalyticsEntity(
            GetLogAnalyticsEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsEntityTypeResponse> getLogAnalyticsEntityType(
            GetLogAnalyticsEntityTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsLogGroupResponse> getLogAnalyticsLogGroup(
            GetLogAnalyticsLogGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsLogGroupRequest, GetLogAnalyticsLogGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsLogGroupsSummaryResponse>
            getLogAnalyticsLogGroupsSummary(
                    GetLogAnalyticsLogGroupsSummaryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsLogGroupsSummaryRequest,
                                    GetLogAnalyticsLogGroupsSummaryResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLogAnalyticsObjectCollectionRuleResponse>
            getLogAnalyticsObjectCollectionRule(
                    GetLogAnalyticsObjectCollectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsObjectCollectionRuleRequest,
                                    GetLogAnalyticsObjectCollectionRuleResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLogSetsCountResponse> getLogSetsCount(
            GetLogSetsCountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLogSetsCountRequest, GetLogSetsCountResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLookupResponse> getLookup(
            GetLookupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetLookupRequest, GetLookupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLookupSummaryResponse> getLookupSummary(
            GetLookupSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLookupSummaryRequest, GetLookupSummaryResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetParserResponse> getParser(
            GetParserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetParserRequest, GetParserResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetParserSummaryResponse> getParserSummary(
            GetParserSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetParserSummaryRequest, GetParserSummaryResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPreferencesResponse> getPreferences(
            GetPreferencesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPreferencesRequest, GetPreferencesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultResponse> getQueryResult(
            GetQueryResultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetQueryResultRequest, GetQueryResultResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetQueryWorkRequestResponse> getQueryWorkRequest(
            GetQueryWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRecallCountResponse> getRecallCount(
            GetRecallCountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRecallCountRequest, GetRecallCountResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetRecallCountResponse::builder)
                .logger(LOG, "getRecallCount")
                .serviceDetails(
                        "LogAnalytics",
                        "GetRecallCount",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetRecallCount")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRecallCountRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("recallCount")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.RecallCount.class,
                        GetRecallCountResponse.Builder::recallCount)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecallCountResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRecalledDataSizeResponse> getRecalledDataSize(
            GetRecalledDataSizeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRecalledDataSizeRequest, GetRecalledDataSizeResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, GetRecalledDataSizeResponse::builder)
                .logger(LOG, "getRecalledDataSize")
                .serviceDetails(
                        "LogAnalytics",
                        "GetRecalledDataSize",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/GetRecalledDataSize")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRecalledDataSizeRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("recalledDataSize")
                .appendQueryParam("timeDataStarted", request.getTimeDataStarted())
                .appendQueryParam("timeDataEnded", request.getTimeDataEnded())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.RecalledDataSize.class,
                        GetRecalledDataSizeResponse.Builder::recalledDataSize)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecalledDataSizeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetRecalledDataSizeResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", GetRecalledDataSizeResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRulesSummaryResponse> getRulesSummary(
            GetRulesSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRulesSummaryRequest, GetRulesSummaryResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetRulesSummaryResponse::builder)
                .logger(LOG, "getRulesSummary")
                .serviceDetails(
                        "LogAnalytics",
                        "GetRulesSummary",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Rule/GetRulesSummary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRulesSummaryRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("rulesSummary")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json;charset=UTF-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.RuleSummaryReport.class,
                        GetRulesSummaryResponse.Builder::ruleSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetRulesSummaryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetScheduledTaskResponse> getScheduledTask(
            GetScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledTaskRequest, GetScheduledTaskResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSourceResponse> getSource(
            GetSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSourceRequest, GetSourceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSourceSummaryResponse> getSourceSummary(
            GetSourceSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSourceSummaryRequest, GetSourceSummaryResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStorageResponse> getStorage(
            GetStorageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetStorageRequest, GetStorageResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStorageUsageResponse> getStorageUsage(
            GetStorageUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStorageUsageRequest, GetStorageUsageResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStorageWorkRequestResponse> getStorageWorkRequest(
            GetStorageWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUnprocessedDataBucketResponse> getUnprocessedDataBucket(
            GetUnprocessedDataBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUnprocessedDataBucketRequest, GetUnprocessedDataBucketResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUploadResponse> getUpload(
            GetUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUploadRequest, GetUploadResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImportCustomContentResponse> importCustomContent(
            ImportCustomContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportCustomContentRequest, ImportCustomContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssociableEntitiesResponse> listAssociableEntities(
            ListAssociableEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociableEntitiesRequest, ListAssociableEntitiesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedEntitiesResponse> listAssociatedEntities(
            ListAssociatedEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutoAssociationsResponse> listAutoAssociations(
            ListAutoAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAutoAssociationsRequest, ListAutoAssociationsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCategoriesResponse> listCategories(
            ListCategoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCategoriesRequest, ListCategoriesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConfigWorkRequestsResponse> listConfigWorkRequests(
            ListConfigWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEffectivePropertiesResponse> listEffectiveProperties(
            ListEffectivePropertiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEffectivePropertiesRequest, ListEffectivePropertiesResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListEffectivePropertiesResponse::builder)
                .logger(LOG, "listEffectiveProperties")
                .serviceDetails(
                        "LogAnalytics",
                        "ListEffectiveProperties",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsProperty/ListEffectiveProperties")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEffectivePropertiesRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("effectiveProperties")
                .appendQueryParam("agentId", request.getAgentId())
                .appendQueryParam("sourceName", request.getSourceName())
                .appendQueryParam("isIncludePatterns", request.getIsIncludePatterns())
                .appendQueryParam("entityId", request.getEntityId())
                .appendQueryParam("patternId", request.getPatternId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.EffectivePropertyCollection.class,
                        ListEffectivePropertiesResponse.Builder::effectivePropertyCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListEffectivePropertiesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListEffectivePropertiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEffectivePropertiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEncryptionKeyInfoResponse> listEncryptionKeyInfo(
            ListEncryptionKeyInfoRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEncryptionKeyInfoRequest, ListEncryptionKeyInfoResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEntityAssociationsResponse> listEntityAssociations(
            ListEntityAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEntityAssociationsRequest, ListEntityAssociationsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEntitySourceAssociationsResponse>
            listEntitySourceAssociations(
                    ListEntitySourceAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListEntitySourceAssociationsRequest,
                                    ListEntitySourceAssociationsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFieldsResponse> listFields(
            ListFieldsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFieldsRequest, ListFieldsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIngestTimeRulesResponse> listIngestTimeRules(
            ListIngestTimeRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIngestTimeRulesRequest, ListIngestTimeRulesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLabelPrioritiesResponse> listLabelPriorities(
            ListLabelPrioritiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLabelSourceDetailsResponse> listLabelSourceDetails(
            ListLabelSourceDetailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLabelsResponse> listLabels(
            ListLabelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListLabelsRequest, ListLabelsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsEmBridgesResponse> listLogAnalyticsEmBridges(
            ListLogAnalyticsEmBridgesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsEmBridgesRequest, ListLogAnalyticsEmBridgesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsEntitiesResponse> listLogAnalyticsEntities(
            ListLogAnalyticsEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsEntityTopologyResponse>
            listLogAnalyticsEntityTopology(
                    ListLogAnalyticsEntityTopologyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLogAnalyticsEntityTopologyRequest,
                                    ListLogAnalyticsEntityTopologyResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsEntityTypesResponse>
            listLogAnalyticsEntityTypes(
                    ListLogAnalyticsEntityTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLogAnalyticsEntityTypesRequest,
                                    ListLogAnalyticsEntityTypesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsLogGroupsResponse> listLogAnalyticsLogGroups(
            ListLogAnalyticsLogGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsLogGroupsRequest, ListLogAnalyticsLogGroupsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLogAnalyticsObjectCollectionRulesResponse>
            listLogAnalyticsObjectCollectionRules(
                    ListLogAnalyticsObjectCollectionRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLogAnalyticsObjectCollectionRulesRequest,
                                    ListLogAnalyticsObjectCollectionRulesResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLogSetsResponse> listLogSets(
            ListLogSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListLogSetsRequest, ListLogSetsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLookupsResponse> listLookups(
            ListLookupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListLookupsRequest, ListLookupsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMetaSourceTypesResponse> listMetaSourceTypes(
            ListMetaSourceTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNamespacesResponse> listNamespaces(
            ListNamespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNamespacesRequest, ListNamespacesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOverlappingRecallsResponse> listOverlappingRecalls(
            ListOverlappingRecallsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOverlappingRecallsRequest, ListOverlappingRecallsResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListOverlappingRecallsResponse::builder)
                .logger(LOG, "listOverlappingRecalls")
                .serviceDetails(
                        "LogAnalytics",
                        "ListOverlappingRecalls",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/Storage/ListOverlappingRecalls")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOverlappingRecallsRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("storage")
                .appendPathParam("overlappingRecalls")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("timeDataStarted", request.getTimeDataStarted())
                .appendQueryParam("timeDataEnded", request.getTimeDataEnded())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.OverlappingRecallCollection.class,
                        ListOverlappingRecallsResponse.Builder::overlappingRecallCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOverlappingRecallsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOverlappingRecallsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListOverlappingRecallsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListParserFunctionsResponse> listParserFunctions(
            ListParserFunctionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListParserFunctionsRequest, ListParserFunctionsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListParserMetaPluginsResponse> listParserMetaPlugins(
            ListParserMetaPluginsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListParsersResponse> listParsers(
            ListParsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListParsersRequest, ListParsersResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPropertiesMetadataResponse> listPropertiesMetadata(
            ListPropertiesMetadataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPropertiesMetadataRequest, ListPropertiesMetadataResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        return clientCall(request, ListPropertiesMetadataResponse::builder)
                .logger(LOG, "listPropertiesMetadata")
                .serviceDetails(
                        "LogAnalytics",
                        "ListPropertiesMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsProperty/ListPropertiesMetadata")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPropertiesMetadataRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("propertiesMetadata")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("displayText", request.getDisplayText())
                .appendQueryParam("level", request.getLevel())
                .appendQueryParam("constraints", request.getConstraints())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.loganalytics.model.PropertyMetadataSummaryCollection.class,
                        ListPropertiesMetadataResponse.Builder::propertyMetadataSummaryCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPropertiesMetadataResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPropertiesMetadataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPropertiesMetadataResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListQueryWorkRequestsResponse> listQueryWorkRequests(
            ListQueryWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRecalledDataResponse> listRecalledData(
            ListRecalledDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRecalledDataRequest, ListRecalledDataResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResourceCategoriesResponse> listResourceCategories(
            ListResourceCategoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListResourceCategoriesRequest, ListResourceCategoriesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResponse> listRules(
            ListRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRulesRequest, ListRulesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListScheduledTasksResponse> listScheduledTasks(
            ListScheduledTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledTasksRequest, ListScheduledTasksResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSourceAssociationsResponse> listSourceAssociations(
            ListSourceAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourceAssociationsRequest, ListSourceAssociationsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSourceEventTypesResponse> listSourceEventTypes(
            ListSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourceEventTypesRequest, ListSourceEventTypesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSourceExtendedFieldDefinitionsResponse>
            listSourceExtendedFieldDefinitions(
                    ListSourceExtendedFieldDefinitionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSourceExtendedFieldDefinitionsRequest,
                                    ListSourceExtendedFieldDefinitionsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSourceLabelOperatorsResponse> listSourceLabelOperators(
            ListSourceLabelOperatorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSourceMetaFunctionsResponse> listSourceMetaFunctions(
            ListSourceMetaFunctionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSourcePatternsResponse> listSourcePatterns(
            ListSourcePatternsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSourcePatternsRequest, ListSourcePatternsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSourcesResponse> listSources(
            ListSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSourcesRequest, ListSourcesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStorageWorkRequestErrorsResponse>
            listStorageWorkRequestErrors(
                    ListStorageWorkRequestErrorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListStorageWorkRequestErrorsRequest,
                                    ListStorageWorkRequestErrorsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStorageWorkRequestsResponse> listStorageWorkRequests(
            ListStorageWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSupportedCharEncodingsResponse>
            listSupportedCharEncodings(
                    ListSupportedCharEncodingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSupportedCharEncodingsRequest,
                                    ListSupportedCharEncodingsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSupportedTimezonesResponse> listSupportedTimezones(
            ListSupportedTimezonesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSupportedTimezonesRequest, ListSupportedTimezonesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUploadFilesResponse> listUploadFiles(
            ListUploadFilesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUploadFilesRequest, ListUploadFilesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUploadWarningsResponse> listUploadWarnings(
            ListUploadWarningsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUploadWarningsRequest, ListUploadWarningsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUploadsResponse> listUploads(
            ListUploadsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUploadsRequest, ListUploadsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWarningsResponse> listWarnings(
            ListWarningsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListWarningsRequest, ListWarningsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<OffboardNamespaceResponse> offboardNamespace(
            OffboardNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            OffboardNamespaceRequest, OffboardNamespaceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<OnboardNamespaceResponse> onboardNamespace(
            OnboardNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            OnboardNamespaceRequest, OnboardNamespaceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ParseQueryResponse> parseQuery(
            ParseQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ParseQueryRequest, ParseQueryResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PauseScheduledTaskResponse> pauseScheduledTask(
            PauseScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PauseScheduledTaskRequest, PauseScheduledTaskResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PurgeStorageDataResponse> purgeStorageData(
            PurgeStorageDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PurgeStorageDataRequest, PurgeStorageDataResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutQueryWorkRequestBackgroundResponse>
            putQueryWorkRequestBackground(
                    PutQueryWorkRequestBackgroundRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutQueryWorkRequestBackgroundRequest,
                                    PutQueryWorkRequestBackgroundResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<QueryResponse> query(
            QueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<QueryRequest, QueryResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RecallArchivedDataResponse> recallArchivedData(
            RecallArchivedDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RecallArchivedDataRequest, RecallArchivedDataResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.loganalytics.model.RecalledDataInfo.class,
                        RecallArchivedDataResponse.Builder::recalledDataInfo)
                .handleResponseHeaderString(
                        "opc-request-id", RecallArchivedDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RecallArchivedDataResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", RecallArchivedDataResponse.Builder::location)
                .handleResponseHeaderString("etag", RecallArchivedDataResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RegisterLookupResponse> registerLookup(
            RegisterLookupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RegisterLookupRequest, RegisterLookupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReleaseRecalledDataResponse> releaseRecalledData(
            ReleaseRecalledDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReleaseRecalledDataRequest, ReleaseRecalledDataResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveEntityAssociationsResponse> removeEntityAssociations(
            RemoveEntityAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveEntityAssociationsRequest, RemoveEntityAssociationsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemovePreferencesResponse> removePreferences(
            RemovePreferencesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemovePreferencesRequest, RemovePreferencesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveResourceCategoriesResponse> removeResourceCategories(
            RemoveResourceCategoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveResourceCategoriesRequest, RemoveResourceCategoriesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveSourceEventTypesResponse> removeSourceEventTypes(
            RemoveSourceEventTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveSourceEventTypesRequest, RemoveSourceEventTypesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResumeScheduledTaskResponse> resumeScheduledTask(
            ResumeScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResumeScheduledTaskRequest, ResumeScheduledTaskResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RunResponse> run(
            RunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RunRequest, RunResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SetUnprocessedDataBucketResponse> setUnprocessedDataBucket(
            SetUnprocessedDataBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SetUnprocessedDataBucketRequest, SetUnprocessedDataBucketResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SuggestResponse> suggest(
            SuggestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SuggestRequest, SuggestResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SuppressWarningResponse> suppressWarning(
            SuppressWarningRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SuppressWarningRequest, SuppressWarningResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TestParserResponse> testParser(
            TestParserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<TestParserRequest, TestParserResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnsuppressWarningResponse> unsuppressWarning(
            UnsuppressWarningRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UnsuppressWarningRequest, UnsuppressWarningResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIngestTimeRuleResponse> updateIngestTimeRule(
            UpdateIngestTimeRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIngestTimeRuleRequest, UpdateIngestTimeRuleResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsEmBridgeResponse>
            updateLogAnalyticsEmBridge(
                    UpdateLogAnalyticsEmBridgeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLogAnalyticsEmBridgeRequest,
                                    UpdateLogAnalyticsEmBridgeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsEntityResponse> updateLogAnalyticsEntity(
            UpdateLogAnalyticsEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLogAnalyticsEntityRequest, UpdateLogAnalyticsEntityResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsEntityTypeResponse>
            updateLogAnalyticsEntityType(
                    UpdateLogAnalyticsEntityTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLogAnalyticsEntityTypeRequest,
                                    UpdateLogAnalyticsEntityTypeResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsLogGroupResponse>
            updateLogAnalyticsLogGroup(
                    UpdateLogAnalyticsLogGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLogAnalyticsLogGroupRequest,
                                    UpdateLogAnalyticsLogGroupResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLogAnalyticsObjectCollectionRuleResponse>
            updateLogAnalyticsObjectCollectionRule(
                    UpdateLogAnalyticsObjectCollectionRuleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLogAnalyticsObjectCollectionRuleRequest,
                                    UpdateLogAnalyticsObjectCollectionRuleResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLookupResponse> updateLookup(
            UpdateLookupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateLookupRequest, UpdateLookupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLookupDataResponse> updateLookupData(
            UpdateLookupDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLookupDataRequest, UpdateLookupDataResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePreferencesResponse> updatePreferences(
            UpdatePreferencesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePreferencesRequest, UpdatePreferencesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceCategoriesResponse> updateResourceCategories(
            UpdateResourceCategoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateResourceCategoriesRequest, UpdateResourceCategoriesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduledTaskResponse> updateScheduledTask(
            UpdateScheduledTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateStorageResponse> updateStorage(
            UpdateStorageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateStorageRequest, UpdateStorageResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadDiscoveryDataResponse> uploadDiscoveryData(
            UploadDiscoveryDataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadDiscoveryDataRequest, UploadDiscoveryDataResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUploadDiscoveryDataDetails(), "uploadDiscoveryDataDetails is required");

        return clientCall(request, UploadDiscoveryDataResponse::builder)
                .logger(LOG, "uploadDiscoveryData")
                .serviceDetails(
                        "LogAnalytics",
                        "UploadDiscoveryData",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsEntity/UploadDiscoveryData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadDiscoveryDataRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("actions")
                .appendPathParam("uploadDiscoveryData")
                .appendEnumQueryParam("discoveryDataType", request.getDiscoveryDataType())
                .appendEnumQueryParam("payloadType", request.getPayloadType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-meta-properties", request.getOpcMetaProperties())
                .appendHeader("content-type", request.getContentType())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("expect", request.getExpect())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UploadDiscoveryDataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-object-id", UploadDiscoveryDataResponse.Builder::opcObjectId)
                .handleResponseHeaderDate(
                        "timeCreated", UploadDiscoveryDataResponse.Builder::timeCreated)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadLogEventsFileResponse> uploadLogEventsFile(
            UploadLogEventsFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadLogEventsFileRequest, UploadLogEventsFileResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadLogFileResponse> uploadLogFile(
            UploadLogFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UploadLogFileRequest, UploadLogFileResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpsertAssociationsResponse> upsertAssociations(
            UpsertAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpsertAssociationsRequest, UpsertAssociationsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpsertFieldResponse> upsertField(
            UpsertFieldRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpsertFieldRequest, UpsertFieldResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpsertLabelResponse> upsertLabel(
            UpsertLabelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpsertLabelRequest, UpsertLabelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpsertParserResponse> upsertParser(
            UpsertParserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpsertParserRequest, UpsertParserResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpsertSourceResponse> upsertSource(
            UpsertSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpsertSourceRequest, UpsertSourceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateAssociationParametersResponse>
            validateAssociationParameters(
                    ValidateAssociationParametersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateAssociationParametersRequest,
                                    ValidateAssociationParametersResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateEndpointResponse> validateEndpoint(
            ValidateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateEndpointRequest, ValidateEndpointResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getValidateEndpointDetails(), "validateEndpointDetails is required");

        return clientCall(request, ValidateEndpointResponse::builder)
                .logger(LOG, "validateEndpoint")
                .serviceDetails(
                        "LogAnalytics",
                        "ValidateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ValidateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateEndpointRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam("actions")
                .appendPathParam("validateEndpoint")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ValidateEndpointResult.class,
                        ValidateEndpointResponse.Builder::validateEndpointResult)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateFileResponse> validateFile(
            ValidateFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ValidateFileRequest, ValidateFileResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateLabelConditionResponse> validateLabelCondition(
            ValidateLabelConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateLabelConditionRequest, ValidateLabelConditionResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getValidateLabelConditionDetails(),
                "validateLabelConditionDetails is required");

        return clientCall(request, ValidateLabelConditionResponse::builder)
                .logger(LOG, "validateLabelCondition")
                .serviceDetails(
                        "LogAnalytics",
                        "ValidateLabelCondition",
                        "https://docs.oracle.com/iaas/api/#/en/logan-api-spec/20200601/LogAnalyticsSource/ValidateLabelCondition")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateLabelConditionRequest::builder)
                .basePath("/20200601")
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("sources")
                .appendPathParam("actions")
                .appendPathParam("validateLabelCondition")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.loganalytics.model.ValidateLabelConditionResult.class,
                        ValidateLabelConditionResponse.Builder::validateLabelConditionResult)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateLabelConditionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateSourceResponse> validateSource(
            ValidateSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateSourceRequest, ValidateSourceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateSourceExtendedFieldDetailsResponse>
            validateSourceExtendedFieldDetails(
                    ValidateSourceExtendedFieldDetailsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateSourceExtendedFieldDetailsRequest,
                                    ValidateSourceExtendedFieldDetailsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateSourceMappingResponse> validateSourceMapping(
            ValidateSourceMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateSourceMappingRequest, ValidateSourceMappingResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<VerifyResponse> verify(
            VerifyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<VerifyRequest, VerifyResponse> handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
    public LogAnalyticsAsyncClient(
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
