/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservice;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datalabelingservice.requests.*;
import com.oracle.bmc.datalabelingservice.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DataLabelingManagement service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class DataLabelingManagementAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DataLabelingManagementAsync {
    /** Service instance for DataLabelingManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATALABELINGMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datalabeling-cp.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataLabelingManagementAsyncClient.class);

    private DataLabelingManagementAsyncClient(
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
                    Builder, DataLabelingManagementAsyncClient> {
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
        public DataLabelingManagementAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataLabelingManagementAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddDatasetLabelsResponse> addDatasetLabels(
            AddDatasetLabelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddDatasetLabelsRequest, AddDatasetLabelsResponse>
                    handler) {

        Validate.notBlank(request.getDatasetId(), "datasetId must not be blank");
        Objects.requireNonNull(
                request.getAddDatasetLabelsDetails(), "addDatasetLabelsDetails is required");

        return clientCall(request, AddDatasetLabelsResponse::builder)
                .logger(LOG, "addDatasetLabels")
                .serviceDetails(
                        "DataLabelingManagement",
                        "AddDatasetLabels",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/AddDatasetLabels")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDatasetLabelsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .appendPathParam("actions")
                .appendPathParam("addLabels")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", AddDatasetLabelsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddDatasetLabelsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDatasetCompartmentResponse> changeDatasetCompartment(
            ChangeDatasetCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDatasetCompartmentRequest, ChangeDatasetCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getDatasetId(), "datasetId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatasetCompartmentDetails(),
                "changeDatasetCompartmentDetails is required");

        return clientCall(request, ChangeDatasetCompartmentResponse::builder)
                .logger(LOG, "changeDatasetCompartment")
                .serviceDetails(
                        "DataLabelingManagement",
                        "ChangeDatasetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/ChangeDatasetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatasetCompartmentRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatasetCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDatasetCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatasetResponse> createDataset(
            CreateDatasetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateDatasetRequest, CreateDatasetResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDatasetDetails(), "createDatasetDetails is required");

        return clientCall(request, CreateDatasetResponse::builder)
                .logger(LOG, "createDataset")
                .serviceDetails(
                        "DataLabelingManagement",
                        "CreateDataset",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/CreateDataset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatasetRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservice.model.Dataset.class,
                        CreateDatasetResponse.Builder::dataset)
                .handleResponseHeaderString("etag", CreateDatasetResponse.Builder::etag)
                .handleResponseHeaderString("location", CreateDatasetResponse.Builder::location)
                .handleResponseHeaderString(
                        "Content-Location", CreateDatasetResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDatasetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatasetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResponse> deleteDataset(
            DeleteDatasetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResponse>
                    handler) {

        Validate.notBlank(request.getDatasetId(), "datasetId must not be blank");

        return clientCall(request, DeleteDatasetResponse::builder)
                .logger(LOG, "deleteDataset")
                .serviceDetails(
                        "DataLabelingManagement",
                        "DeleteDataset",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/DeleteDataset")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatasetRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDatasetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatasetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateDatasetRecordsResponse> generateDatasetRecords(
            GenerateDatasetRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateDatasetRecordsRequest, GenerateDatasetRecordsResponse>
                    handler) {

        Validate.notBlank(request.getDatasetId(), "datasetId must not be blank");
        Objects.requireNonNull(
                request.getGenerateDatasetRecordsDetails(),
                "generateDatasetRecordsDetails is required");

        return clientCall(request, GenerateDatasetRecordsResponse::builder)
                .logger(LOG, "generateDatasetRecords")
                .serviceDetails(
                        "DataLabelingManagement",
                        "GenerateDatasetRecords",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/GenerateDatasetRecords")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateDatasetRecordsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .appendPathParam("actions")
                .appendPathParam("generateDatasetRecords")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateDatasetRecordsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateDatasetRecordsResponse.Builder::opcRequestId)
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
                        "DataLabelingManagement",
                        "GetDataset",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/GetDataset")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatasetRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datalabelingservice.model.Dataset.class,
                        GetDatasetResponse.Builder::dataset)
                .handleResponseHeaderString("etag", GetDatasetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatasetResponse.Builder::opcRequestId)
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
                        "DataLabelingManagement",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20211001")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datalabelingservice.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAnnotationFormatsResponse> listAnnotationFormats(
            ListAnnotationFormatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAnnotationFormatsRequest, ListAnnotationFormatsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAnnotationFormatsResponse::builder)
                .logger(LOG, "listAnnotationFormats")
                .serviceDetails(
                        "DataLabelingManagement",
                        "ListAnnotationFormats",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/AnnotationFormat/ListAnnotationFormats")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAnnotationFormatsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("annotationFormats")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datalabelingservice.model.AnnotationFormatCollection.class,
                        ListAnnotationFormatsResponse.Builder::annotationFormatCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAnnotationFormatsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnnotationFormatsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResponse> listDatasets(
            ListDatasetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDatasetsRequest, ListDatasetsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatasetsResponse::builder)
                .logger(LOG, "listDatasets")
                .serviceDetails(
                        "DataLabelingManagement",
                        "ListDatasets",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/DatasetCollection/ListDatasets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatasetsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("annotationFormat", request.getAnnotationFormat())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datalabelingservice.model.DatasetCollection.class,
                        ListDatasetsResponse.Builder::datasetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatasetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatasetsResponse.Builder::opcNextPage)
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
                        "DataLabelingManagement",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/WorkRequest/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datalabelingservice.model.WorkRequestErrorCollection.class,
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
                        "DataLabelingManagement",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/WorkRequest/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datalabelingservice.model.WorkRequestLogEntryCollection
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
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "DataLabelingManagement",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datalabelingservice.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveDatasetLabelsResponse> removeDatasetLabels(
            RemoveDatasetLabelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveDatasetLabelsRequest, RemoveDatasetLabelsResponse>
                    handler) {

        Validate.notBlank(request.getDatasetId(), "datasetId must not be blank");
        Objects.requireNonNull(
                request.getRemoveDatasetLabelsDetails(), "removeDatasetLabelsDetails is required");

        return clientCall(request, RemoveDatasetLabelsResponse::builder)
                .logger(LOG, "removeDatasetLabels")
                .serviceDetails(
                        "DataLabelingManagement",
                        "RemoveDatasetLabels",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/RemoveDatasetLabels")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDatasetLabelsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .appendPathParam("actions")
                .appendPathParam("removeLabels")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveDatasetLabelsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveDatasetLabelsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RenameDatasetLabelsResponse> renameDatasetLabels(
            RenameDatasetLabelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RenameDatasetLabelsRequest, RenameDatasetLabelsResponse>
                    handler) {

        Validate.notBlank(request.getDatasetId(), "datasetId must not be blank");
        Objects.requireNonNull(
                request.getRenameDatasetLabelsDetails(), "renameDatasetLabelsDetails is required");

        return clientCall(request, RenameDatasetLabelsResponse::builder)
                .logger(LOG, "renameDatasetLabels")
                .serviceDetails(
                        "DataLabelingManagement",
                        "RenameDatasetLabels",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/RenameDatasetLabels")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RenameDatasetLabelsRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .appendPathParam("actions")
                .appendPathParam("renameLabels")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RenameDatasetLabelsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RenameDatasetLabelsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SnapshotDatasetResponse> snapshotDataset(
            SnapshotDatasetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SnapshotDatasetRequest, SnapshotDatasetResponse>
                    handler) {

        Validate.notBlank(request.getDatasetId(), "datasetId must not be blank");
        Objects.requireNonNull(
                request.getSnapshotDatasetDetails(), "snapshotDatasetDetails is required");

        return clientCall(request, SnapshotDatasetResponse::builder)
                .logger(LOG, "snapshotDataset")
                .serviceDetails(
                        "DataLabelingManagement",
                        "SnapshotDataset",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/SnapshotDataset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SnapshotDatasetRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .appendPathParam("actions")
                .appendPathParam("snapshot")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", SnapshotDatasetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SnapshotDatasetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasetResponse> updateDataset(
            UpdateDatasetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResponse>
                    handler) {

        Validate.notBlank(request.getDatasetId(), "datasetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatasetDetails(), "updateDatasetDetails is required");

        return clientCall(request, UpdateDatasetResponse::builder)
                .logger(LOG, "updateDataset")
                .serviceDetails(
                        "DataLabelingManagement",
                        "UpdateDataset",
                        "https://docs.oracle.com/iaas/api/#/en/datalabeling/20211001/Dataset/UpdateDataset")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatasetRequest::builder)
                .basePath("/20211001")
                .appendPathParam("datasets")
                .appendPathParam(request.getDatasetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datalabelingservice.model.Dataset.class,
                        UpdateDatasetResponse.Builder::dataset)
                .handleResponseHeaderString("etag", UpdateDatasetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatasetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataLabelingManagementAsyncClient(
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
    public DataLabelingManagementAsyncClient(
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
    public DataLabelingManagementAsyncClient(
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
    public DataLabelingManagementAsyncClient(
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
    public DataLabelingManagementAsyncClient(
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
    public DataLabelingManagementAsyncClient(
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
    public DataLabelingManagementAsyncClient(
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
