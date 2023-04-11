/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datalabelingservicedataplane.requests.*;
import com.oracle.bmc.datalabelingservicedataplane.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DataLabeling service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class DataLabelingAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DataLabelingAsync {
    /** Service instance for DataLabeling. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATALABELING")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datalabeling-dp.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataLabelingAsyncClient.class);

    DataLabelingAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataLabelingAsyncClient> {
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
        public DataLabelingAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataLabelingAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateAnnotationResponse> createAnnotation(
            CreateAnnotationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAnnotationRequest, CreateAnnotationResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Annotation.class,
                        CreateAnnotationResponse.Builder::annotation)
                .handleResponseHeaderString("etag", CreateAnnotationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAnnotationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRecordResponse> createRecord(
            CreateRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateRecordRequest, CreateRecordResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Record.class,
                        CreateRecordResponse.Builder::record)
                .handleResponseHeaderString("etag", CreateRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnnotationResponse> deleteAnnotation(
            DeleteAnnotationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAnnotationRequest, DeleteAnnotationResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAnnotationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecordResponse> deleteRecord(
            DeleteRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRecordRequest, DeleteRecordResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAnnotationResponse> getAnnotation(
            GetAnnotationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAnnotationRequest, GetAnnotationResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Annotation.class,
                        GetAnnotationResponse.Builder::annotation)
                .handleResponseHeaderString("etag", GetAnnotationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAnnotationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatasetResponse> getDataset(
            GetDatasetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDatasetRequest, GetDatasetResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Dataset.class,
                        GetDatasetResponse.Builder::dataset)
                .handleResponseHeaderString("etag", GetDatasetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatasetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRecordResponse> getRecord(
            GetRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRecordRequest, GetRecordResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Record.class,
                        GetRecordResponse.Builder::record)
                .handleResponseHeaderString("etag", GetRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRecordContentResponse> getRecordContent(
            GetRecordContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRecordContentRequest, GetRecordContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRecordPreviewContentResponse> getRecordPreviewContent(
            GetRecordPreviewContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRecordPreviewContentRequest, GetRecordPreviewContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAnnotationsResponse> listAnnotations(
            ListAnnotationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAnnotationsRequest, ListAnnotationsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.AnnotationCollection
                                .class,
                        ListAnnotationsResponse.Builder::annotationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAnnotationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnnotationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRecordsResponse> listRecords(
            ListRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRecordsRequest, ListRecordsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.RecordCollection.class,
                        ListRecordsResponse.Builder::recordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecordsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeAnnotationAnalyticsResponse>
            summarizeAnnotationAnalytics(
                    SummarizeAnnotationAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAnnotationAnalyticsRequest,
                                    SummarizeAnnotationAnalyticsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeRecordAnalyticsResponse> summarizeRecordAnalytics(
            SummarizeRecordAnalyticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeRecordAnalyticsRequest, SummarizeRecordAnalyticsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model
                                .RecordAnalyticsAggregationCollection.class,
                        SummarizeRecordAnalyticsResponse.Builder
                                ::recordAnalyticsAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeRecordAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeRecordAnalyticsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnnotationResponse> updateAnnotation(
            UpdateAnnotationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAnnotationRequest, UpdateAnnotationResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Annotation.class,
                        UpdateAnnotationResponse.Builder::annotation)
                .handleResponseHeaderString("etag", UpdateAnnotationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAnnotationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecordResponse> updateRecord(
            UpdateRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRecordRequest, UpdateRecordResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservicedataplane.model.Record.class,
                        UpdateRecordResponse.Builder::record)
                .handleResponseHeaderString("etag", UpdateRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
    public DataLabelingAsyncClient(
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
