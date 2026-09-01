/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.clusterhealth.requests.*;
import com.oracle.bmc.clusterhealth.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Diagnosis service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
public class DiagnosisAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DiagnosisAsync {
    /** Service instance for Diagnosis. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DiagnosisClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DiagnosisAsyncClient.class);

    DiagnosisAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DiagnosisAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "clusterhealth";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public DiagnosisAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DiagnosisAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails("Diagnosis", "CancelWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20260331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDiagnosisStoreCompartmentResponse>
            changeDiagnosisStoreCompartment(
                    ChangeDiagnosisStoreCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDiagnosisStoreCompartmentRequest,
                                    ChangeDiagnosisStoreCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getChangeDiagnosisStoreCompartmentDetails(),
                "changeDiagnosisStoreCompartmentDetails is required");

        return clientCall(request, ChangeDiagnosisStoreCompartmentResponse::builder)
                .logger(LOG, "changeDiagnosisStoreCompartment")
                .serviceDetails("Diagnosis", "ChangeDiagnosisStoreCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDiagnosisStoreCompartmentRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDiagnosisStoreCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDiagnosisStoreCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDiagnosisStoreResponse> createDiagnosisStore(
            CreateDiagnosisStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDiagnosisStoreRequest, CreateDiagnosisStoreResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDiagnosisStoreDetails(),
                "createDiagnosisStoreDetails is required");

        return clientCall(request, CreateDiagnosisStoreResponse::builder)
                .logger(LOG, "createDiagnosisStore")
                .serviceDetails("Diagnosis", "CreateDiagnosisStore", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDiagnosisStoreRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisStore.class,
                        CreateDiagnosisStoreResponse.Builder::diagnosisStore)
                .handleResponseHeaderString(
                        "location", CreateDiagnosisStoreResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateDiagnosisStoreResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateDiagnosisStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDiagnosisStoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDiagnosisStoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDiagnosisStoreResponse> deleteDiagnosisStore(
            DeleteDiagnosisStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiagnosisStoreRequest, DeleteDiagnosisStoreResponse>
                    handler) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");

        return clientCall(request, DeleteDiagnosisStoreResponse::builder)
                .logger(LOG, "deleteDiagnosisStore")
                .serviceDetails("Diagnosis", "DeleteDiagnosisStore", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDiagnosisStoreRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDiagnosisStoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDiagnosisStoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDiagnosisStoreResponse> getDiagnosisStore(
            GetDiagnosisStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiagnosisStoreRequest, GetDiagnosisStoreResponse>
                    handler) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");

        return clientCall(request, GetDiagnosisStoreResponse::builder)
                .logger(LOG, "getDiagnosisStore")
                .serviceDetails("Diagnosis", "GetDiagnosisStore", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDiagnosisStoreRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisStore.class,
                        GetDiagnosisStoreResponse.Builder::diagnosisStore)
                .handleResponseHeaderString("etag", GetDiagnosisStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDiagnosisStoreResponse.Builder::opcRequestId)
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
                .serviceDetails("Diagnosis", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20260331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDiagnosisStoresResponse> listDiagnosisStores(
            ListDiagnosisStoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiagnosisStoresRequest, ListDiagnosisStoresResponse>
                    handler) {

        return clientCall(request, ListDiagnosisStoresResponse::builder)
                .logger(LOG, "listDiagnosisStores")
                .serviceDetails("Diagnosis", "ListDiagnosisStores", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDiagnosisStoresRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("diagnosisStoreId", request.getDiagnosisStoreId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisStoreCollection.class,
                        ListDiagnosisStoresResponse.Builder::diagnosisStoreCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDiagnosisStoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDiagnosisStoresResponse.Builder::opcNextPage)
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
                .serviceDetails("Diagnosis", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20260331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.WorkRequestErrorCollection.class,
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
                .serviceDetails("Diagnosis", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20260331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.WorkRequestLogEntryCollection.class,
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

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails("Diagnosis", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20260331")
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
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<QueryDiagnosisByHealthCheckKeyResponse>
            queryDiagnosisByHealthCheckKey(
                    QueryDiagnosisByHealthCheckKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    QueryDiagnosisByHealthCheckKeyRequest,
                                    QueryDiagnosisByHealthCheckKeyResponse>
                            handler) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getQueryDiagnosisByHealthCheckKeyDetails(),
                "queryDiagnosisByHealthCheckKeyDetails is required");

        return clientCall(request, QueryDiagnosisByHealthCheckKeyResponse::builder)
                .logger(LOG, "queryDiagnosisByHealthCheckKey")
                .serviceDetails("Diagnosis", "QueryDiagnosisByHealthCheckKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(QueryDiagnosisByHealthCheckKeyRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .appendPathParam("actions")
                .appendPathParam("queryDiagnosisByHealthCheckKey")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.RecommendationReport.class,
                        QueryDiagnosisByHealthCheckKeyResponse.Builder::recommendationReport)
                .handleResponseHeaderString(
                        "etag", QueryDiagnosisByHealthCheckKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        QueryDiagnosisByHealthCheckKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<QueryDiagnosisSummaryResponse> queryDiagnosisSummary(
            QueryDiagnosisSummaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            QueryDiagnosisSummaryRequest, QueryDiagnosisSummaryResponse>
                    handler) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getQueryDiagnosisSummaryDetails(),
                "queryDiagnosisSummaryDetails is required");

        return clientCall(request, QueryDiagnosisSummaryResponse::builder)
                .logger(LOG, "queryDiagnosisSummary")
                .serviceDetails("Diagnosis", "QueryDiagnosisSummary", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(QueryDiagnosisSummaryRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .appendPathParam("actions")
                .appendPathParam("queryDiagnosisSummary")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisSummaryCollection.class,
                        QueryDiagnosisSummaryResponse.Builder::diagnosisSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", QueryDiagnosisSummaryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", QueryDiagnosisSummaryResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RequestDiagnosisResponse> requestDiagnosis(
            RequestDiagnosisRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RequestDiagnosisRequest, RequestDiagnosisResponse>
                    handler) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getRequestDiagnosisDetails(), "requestDiagnosisDetails is required");

        return clientCall(request, RequestDiagnosisResponse::builder)
                .logger(LOG, "requestDiagnosis")
                .serviceDetails("Diagnosis", "RequestDiagnosis", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestDiagnosisRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .appendPathParam("actions")
                .appendPathParam("requestDiagnosis")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisResults.class,
                        RequestDiagnosisResponse.Builder::diagnosisResults)
                .handleResponseHeaderString("etag", RequestDiagnosisResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RequestDiagnosisResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDiagnosisStoreResponse> updateDiagnosisStore(
            UpdateDiagnosisStoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDiagnosisStoreRequest, UpdateDiagnosisStoreResponse>
                    handler) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDiagnosisStoreDetails(),
                "updateDiagnosisStoreDetails is required");

        return clientCall(request, UpdateDiagnosisStoreResponse::builder)
                .logger(LOG, "updateDiagnosisStore")
                .serviceDetails("Diagnosis", "UpdateDiagnosisStore", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDiagnosisStoreRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDiagnosisStoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDiagnosisStoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DiagnosisAsyncClient(
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
    public DiagnosisAsyncClient(
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
    public DiagnosisAsyncClient(
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
    public DiagnosisAsyncClient(
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
    public DiagnosisAsyncClient(
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
    public DiagnosisAsyncClient(
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
    public DiagnosisAsyncClient(
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
