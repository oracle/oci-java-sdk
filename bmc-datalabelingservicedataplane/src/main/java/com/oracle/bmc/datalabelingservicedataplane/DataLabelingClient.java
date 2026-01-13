/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datalabelingservicedataplane.requests.*;
import com.oracle.bmc.datalabelingservicedataplane.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class DataLabelingClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DataLabeling {
    /** Service instance for DataLabeling. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DataLabelingClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datalabeling-dp.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataLabelingClient.class);

    private final DataLabelingWaiters waiters;

    private final DataLabelingPaginators paginators;

    DataLabelingClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    DataLabelingClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
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
                                    .nameFormat("DataLabeling-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DataLabelingWaiters(executorService, this);

        this.paginators = new DataLabelingPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DataLabelingClient", "getRecordContent,getRecordPreviewContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataLabelingClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "datalabelingservicedataplane";
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
        public DataLabelingClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataLabelingClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
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
    public CreateAnnotationResponse createAnnotation(CreateAnnotationRequest request) {
        Objects.requireNonNull(
                request.getCreateAnnotationDetails(), "createAnnotationDetails is required");

        return clientCall(request, CreateAnnotationResponse::builder)
                .logger(LOG, "createAnnotation")
                .serviceDetails(
                        "DataLabeling",
                        "CreateAnnotation",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Annotation/CreateAnnotation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAnnotationRequest::builder)
                .basePath("/20211001")
                .appendPathParam("annotations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Annotation.class,
                        CreateAnnotationResponse.Builder::annotation)
                .handleResponseHeaderString("etag", CreateAnnotationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAnnotationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRecordResponse createRecord(CreateRecordRequest request) {
        Objects.requireNonNull(request.getCreateRecordDetails(), "createRecordDetails is required");

        return clientCall(request, CreateRecordResponse::builder)
                .logger(LOG, "createRecord")
                .serviceDetails(
                        "DataLabeling",
                        "CreateRecord",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/CreateRecord")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRecordRequest::builder)
                .basePath("/20211001")
                .appendPathParam("records")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Record.class,
                        CreateRecordResponse.Builder::record)
                .handleResponseHeaderString("etag", CreateRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAnnotationResponse deleteAnnotation(DeleteAnnotationRequest request) {

        Validate.notBlank(request.getAnnotationId(), "annotationId must not be blank");

        return clientCall(request, DeleteAnnotationResponse::builder)
                .logger(LOG, "deleteAnnotation")
                .serviceDetails(
                        "DataLabeling",
                        "DeleteAnnotation",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Annotation/DeleteAnnotation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAnnotationRequest::builder)
                .basePath("/20211001")
                .appendPathParam("annotations")
                .appendPathParam(request.getAnnotationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAnnotationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRecordResponse deleteRecord(DeleteRecordRequest request) {

        Validate.notBlank(request.getRecordId(), "recordId must not be blank");

        return clientCall(request, DeleteRecordResponse::builder)
                .logger(LOG, "deleteRecord")
                .serviceDetails(
                        "DataLabeling",
                        "DeleteRecord",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/DeleteRecord")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRecordRequest::builder)
                .basePath("/20211001")
                .appendPathParam("records")
                .appendPathParam(request.getRecordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAnnotationResponse getAnnotation(GetAnnotationRequest request) {

        Validate.notBlank(request.getAnnotationId(), "annotationId must not be blank");

        return clientCall(request, GetAnnotationResponse::builder)
                .logger(LOG, "getAnnotation")
                .serviceDetails(
                        "DataLabeling",
                        "GetAnnotation",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Annotation/GetAnnotation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAnnotationRequest::builder)
                .basePath("/20211001")
                .appendPathParam("annotations")
                .appendPathParam(request.getAnnotationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Annotation.class,
                        GetAnnotationResponse.Builder::annotation)
                .handleResponseHeaderString("etag", GetAnnotationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAnnotationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatasetResponse getDataset(GetDatasetRequest request) {

        Validate.notBlank(request.getDatasetId(), "datasetId must not be blank");

        return clientCall(request, GetDatasetResponse::builder)
                .logger(LOG, "getDataset")
                .serviceDetails(
                        "DataLabeling",
                        "GetDataset",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Dataset/GetDataset")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatasetRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Dataset.class,
                        GetDatasetResponse.Builder::dataset)
                .handleResponseHeaderString("etag", GetDatasetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatasetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRecordResponse getRecord(GetRecordRequest request) {

        Validate.notBlank(request.getRecordId(), "recordId must not be blank");

        return clientCall(request, GetRecordResponse::builder)
                .logger(LOG, "getRecord")
                .serviceDetails(
                        "DataLabeling",
                        "GetRecord",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/GetRecord")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRecordRequest::builder)
                .basePath("/20211001")
                .appendPathParam("records")
                .appendPathParam(request.getRecordId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Record.class,
                        GetRecordResponse.Builder::record)
                .handleResponseHeaderString("etag", GetRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRecordContentResponse getRecordContent(GetRecordContentRequest request) {

        Validate.notBlank(request.getRecordId(), "recordId must not be blank");

        return clientCall(request, GetRecordContentResponse::builder)
                .logger(LOG, "getRecordContent")
                .serviceDetails(
                        "DataLabeling",
                        "GetRecordContent",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/GetRecordContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRecordContentRequest::builder)
                .basePath("/20211001")
                .appendPathParam("records")
                .appendPathParam(request.getRecordId())
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class, GetRecordContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetRecordContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecordContentResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", GetRecordContentResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-disposition", GetRecordContentResponse.Builder::contentDisposition)
                .handleResponseHeaderString(
                        "content-type", GetRecordContentResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "cache-control", GetRecordContentResponse.Builder::cacheControl)
                .callSync();
    }

    @Override
    public GetRecordPreviewContentResponse getRecordPreviewContent(
            GetRecordPreviewContentRequest request) {

        Validate.notBlank(request.getRecordId(), "recordId must not be blank");

        return clientCall(request, GetRecordPreviewContentResponse::builder)
                .logger(LOG, "getRecordPreviewContent")
                .serviceDetails(
                        "DataLabeling",
                        "GetRecordPreviewContent",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/GetRecordPreviewContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRecordPreviewContentRequest::builder)
                .basePath("/20211001")
                .appendPathParam("records")
                .appendPathParam(request.getRecordId())
                .appendPathParam("preview")
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetRecordPreviewContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetRecordPreviewContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecordPreviewContentResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", GetRecordPreviewContentResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-disposition",
                        GetRecordPreviewContentResponse.Builder::contentDisposition)
                .handleResponseHeaderString(
                        "content-type", GetRecordPreviewContentResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "cache-control", GetRecordPreviewContentResponse.Builder::cacheControl)
                .callSync();
    }

    @Override
    public ListAnnotationsResponse listAnnotations(ListAnnotationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getDatasetId(), "datasetId is required");

        return clientCall(request, ListAnnotationsResponse::builder)
                .logger(LOG, "listAnnotations")
                .serviceDetails(
                        "DataLabeling",
                        "ListAnnotations",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/AnnotationCollection/ListAnnotations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAnnotationsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("annotations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("datasetId", request.getDatasetId())
                .appendQueryParam("updatedBy", request.getUpdatedBy())
                .appendQueryParam("recordId", request.getRecordId())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeCreatedLessThanOrEqualTo", request.getTimeCreatedLessThanOrEqualTo())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.AnnotationCollection
                                .class,
                        ListAnnotationsResponse.Builder::annotationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAnnotationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnnotationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRecordsResponse listRecords(ListRecordsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getDatasetId(), "datasetId is required");

        return clientCall(request, ListRecordsResponse::builder)
                .logger(LOG, "listRecords")
                .serviceDetails(
                        "DataLabeling",
                        "ListRecords",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/RecordCollection/ListRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecordsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("records")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("datasetId", request.getDatasetId())
                .appendQueryParam("isLabeled", request.getIsLabeled())
                .appendListQueryParam(
                        "annotationLabelsContains",
                        request.getAnnotationLabelsContains(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.RecordCollection.class,
                        ListRecordsResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecordsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeAnnotationAnalyticsResponse summarizeAnnotationAnalytics(
            SummarizeAnnotationAnalyticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getDatasetId(), "datasetId is required");

        return clientCall(request, SummarizeAnnotationAnalyticsResponse::builder)
                .logger(LOG, "summarizeAnnotationAnalytics")
                .serviceDetails(
                        "DataLabeling",
                        "SummarizeAnnotationAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/AnnotationAnalyticsAggregationCollection/SummarizeAnnotationAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeAnnotationAnalyticsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("annotationAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("datasetId", request.getDatasetId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("label", request.getLabel())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("annotationGroupBy", request.getAnnotationGroupBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model
                                .AnnotationAnalyticsAggregationCollection.class,
                        SummarizeAnnotationAnalyticsResponse.Builder
                                ::annotationAnalyticsAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeAnnotationAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeAnnotationAnalyticsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeRecordAnalyticsResponse summarizeRecordAnalytics(
            SummarizeRecordAnalyticsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getDatasetId(), "datasetId is required");

        return clientCall(request, SummarizeRecordAnalyticsResponse::builder)
                .logger(LOG, "summarizeRecordAnalytics")
                .serviceDetails(
                        "DataLabeling",
                        "SummarizeRecordAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/RecordAnalyticsAggregationCollection/SummarizeRecordAnalytics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeRecordAnalyticsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("recordAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("datasetId", request.getDatasetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("recordGroupBy", request.getRecordGroupBy())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model
                                .RecordAnalyticsAggregationCollection.class,
                        SummarizeRecordAnalyticsResponse.Builder
                                ::recordAnalyticsAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeRecordAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeRecordAnalyticsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateAnnotationResponse updateAnnotation(UpdateAnnotationRequest request) {

        Validate.notBlank(request.getAnnotationId(), "annotationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAnnotationDetails(), "updateAnnotationDetails is required");

        return clientCall(request, UpdateAnnotationResponse::builder)
                .logger(LOG, "updateAnnotation")
                .serviceDetails(
                        "DataLabeling",
                        "UpdateAnnotation",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Annotation/UpdateAnnotation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAnnotationRequest::builder)
                .basePath("/20211001")
                .appendPathParam("annotations")
                .appendPathParam(request.getAnnotationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Annotation.class,
                        UpdateAnnotationResponse.Builder::annotation)
                .handleResponseHeaderString("etag", UpdateAnnotationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAnnotationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRecordResponse updateRecord(UpdateRecordRequest request) {

        Validate.notBlank(request.getRecordId(), "recordId must not be blank");
        Objects.requireNonNull(request.getUpdateRecordDetails(), "updateRecordDetails is required");

        return clientCall(request, UpdateRecordResponse::builder)
                .logger(LOG, "updateRecord")
                .serviceDetails(
                        "DataLabeling",
                        "UpdateRecord",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling-dp/20211001/Record/UpdateRecord")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRecordRequest::builder)
                .basePath("/20211001")
                .appendPathParam("records")
                .appendPathParam(request.getRecordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Record.class,
                        UpdateRecordResponse.Builder::record)
                .handleResponseHeaderString("etag", UpdateRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DataLabelingWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DataLabelingPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataLabelingClient(
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
    public DataLabelingClient(
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
    public DataLabelingClient(
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
    public DataLabelingClient(
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
    public DataLabelingClient(
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
    public DataLabelingClient(
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
    public DataLabelingClient(
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
    public DataLabelingClient(
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
