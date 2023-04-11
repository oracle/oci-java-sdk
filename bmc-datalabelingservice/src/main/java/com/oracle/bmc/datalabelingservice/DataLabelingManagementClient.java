/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservice;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datalabelingservice.requests.*;
import com.oracle.bmc.datalabelingservice.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class DataLabelingManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DataLabelingManagement {
    /** Service instance for DataLabelingManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATALABELINGMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datalabeling-cp.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataLabelingManagementClient.class);

    private final DataLabelingManagementWaiters waiters;

    private final DataLabelingManagementPaginators paginators;

    DataLabelingManagementClient(
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
                                    .nameFormat("DataLabelingManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DataLabelingManagementWaiters(executorService, this);

        this.paginators = new DataLabelingManagementPaginators(this);
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
                    Builder, DataLabelingManagementClient> {
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
        public DataLabelingManagementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataLabelingManagementClient(
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
    public AddDatasetLabelsResponse addDatasetLabels(AddDatasetLabelsRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeDatasetCompartmentResponse changeDatasetCompartment(
            ChangeDatasetCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDatasetResponse createDataset(CreateDatasetRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDatasetResponse deleteDataset(DeleteDatasetRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateDatasetRecordsResponse generateDatasetRecords(
            GenerateDatasetRecordsRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDatasetResponse getDataset(GetDatasetRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAnnotationFormatsResponse listAnnotationFormats(
            ListAnnotationFormatsRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDatasetsResponse listDatasets(ListDatasetsRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RemoveDatasetLabelsResponse removeDatasetLabels(RemoveDatasetLabelsRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RenameDatasetLabelsResponse renameDatasetLabels(RenameDatasetLabelsRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SnapshotDatasetResponse snapshotDataset(SnapshotDatasetRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDatasetResponse updateDataset(UpdateDatasetRequest request) {

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
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DataLabelingManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DataLabelingManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataLabelingManagementClient(
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
    public DataLabelingManagementClient(
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
    public DataLabelingManagementClient(
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
    public DataLabelingManagementClient(
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
    public DataLabelingManagementClient(
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
    public DataLabelingManagementClient(
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
    public DataLabelingManagementClient(
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
    public DataLabelingManagementClient(
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
