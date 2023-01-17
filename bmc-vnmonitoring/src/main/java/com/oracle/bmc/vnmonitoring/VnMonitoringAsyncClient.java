/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.vnmonitoring.requests.*;
import com.oracle.bmc.vnmonitoring.responses.*;

import java.util.Objects;

/**
 * Async client implementation for VnMonitoring service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class VnMonitoringAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements VnMonitoringAsync {
    /** Service instance for VnMonitoring. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("VNMONITORING")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://vnca-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VnMonitoringAsyncClient.class);

    private VnMonitoringAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, VnMonitoringAsyncClient> {
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
        public VnMonitoringAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new VnMonitoringAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangePathAnalyzerTestCompartmentResponse>
            changePathAnalyzerTestCompartment(
                    ChangePathAnalyzerTestCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePathAnalyzerTestCompartmentRequest,
                                    ChangePathAnalyzerTestCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getPathAnalyzerTestId(), "pathAnalyzerTestId must not be blank");
        Objects.requireNonNull(
                request.getChangePathAnalyzerTestCompartmentDetails(),
                "changePathAnalyzerTestCompartmentDetails is required");

        return clientCall(request, ChangePathAnalyzerTestCompartmentResponse::builder)
                .logger(LOG, "changePathAnalyzerTestCompartment")
                .serviceDetails(
                        "VnMonitoring",
                        "ChangePathAnalyzerTestCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/ChangePathAnalyzerTestCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePathAnalyzerTestCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendPathParam(request.getPathAnalyzerTestId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangePathAnalyzerTestCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePathAnalyzerTestCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePathAnalyzerTestResponse> createPathAnalyzerTest(
            CreatePathAnalyzerTestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePathAnalyzerTestRequest, CreatePathAnalyzerTestResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreatePathAnalyzerTestDetails(),
                "createPathAnalyzerTestDetails is required");

        return clientCall(request, CreatePathAnalyzerTestResponse::builder)
                .logger(LOG, "createPathAnalyzerTest")
                .serviceDetails(
                        "VnMonitoring",
                        "CreatePathAnalyzerTest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/CreatePathAnalyzerTest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePathAnalyzerTestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.PathAnalyzerTest.class,
                        CreatePathAnalyzerTestResponse.Builder::pathAnalyzerTest)
                .handleResponseHeaderString("etag", CreatePathAnalyzerTestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePathAnalyzerTestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePathAnalyzerTestResponse> deletePathAnalyzerTest(
            DeletePathAnalyzerTestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePathAnalyzerTestRequest, DeletePathAnalyzerTestResponse>
                    handler) {

        Validate.notBlank(request.getPathAnalyzerTestId(), "pathAnalyzerTestId must not be blank");

        return clientCall(request, DeletePathAnalyzerTestResponse::builder)
                .logger(LOG, "deletePathAnalyzerTest")
                .serviceDetails(
                        "VnMonitoring",
                        "DeletePathAnalyzerTest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/DeletePathAnalyzerTest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePathAnalyzerTestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendPathParam(request.getPathAnalyzerTestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePathAnalyzerTestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPathAnalysisResponse> getPathAnalysis(
            GetPathAnalysisRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPathAnalysisRequest, GetPathAnalysisResponse>
                    handler) {
        Objects.requireNonNull(
                request.getGetPathAnalysisDetails(), "getPathAnalysisDetails is required");

        return clientCall(request, GetPathAnalysisResponse::builder)
                .logger(LOG, "getPathAnalysis")
                .serviceDetails(
                        "VnMonitoring",
                        "GetPathAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalysisWorkRequestResult/GetPathAnalysis")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GetPathAnalysisRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalysis")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("cache-control", request.getCacheControl())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", GetPathAnalysisResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", GetPathAnalysisResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPathAnalyzerTestResponse> getPathAnalyzerTest(
            GetPathAnalyzerTestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPathAnalyzerTestRequest, GetPathAnalyzerTestResponse>
                    handler) {

        Validate.notBlank(request.getPathAnalyzerTestId(), "pathAnalyzerTestId must not be blank");

        return clientCall(request, GetPathAnalyzerTestResponse::builder)
                .logger(LOG, "getPathAnalyzerTest")
                .serviceDetails(
                        "VnMonitoring",
                        "GetPathAnalyzerTest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/GetPathAnalyzerTest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPathAnalyzerTestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendPathParam(request.getPathAnalyzerTestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.PathAnalyzerTest.class,
                        GetPathAnalyzerTestResponse.Builder::pathAnalyzerTest)
                .handleResponseHeaderString("etag", GetPathAnalyzerTestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPathAnalyzerTestResponse.Builder::opcRequestId)
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
                        "VnMonitoring",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPathAnalyzerTestsResponse> listPathAnalyzerTests(
            ListPathAnalyzerTestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPathAnalyzerTestsRequest, ListPathAnalyzerTestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPathAnalyzerTestsResponse::builder)
                .logger(LOG, "listPathAnalyzerTests")
                .serviceDetails(
                        "VnMonitoring",
                        "ListPathAnalyzerTests",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTestCollection/ListPathAnalyzerTests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPathAnalyzerTestsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.PathAnalyzerTestCollection.class,
                        ListPathAnalyzerTestsResponse.Builder::pathAnalyzerTestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPathAnalyzerTestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPathAnalyzerTestsResponse.Builder::opcNextPage)
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
                        "VnMonitoring",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
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
                        "VnMonitoring",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestResultsResponse> listWorkRequestResults(
            ListWorkRequestResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestResultsRequest, ListWorkRequestResultsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestResultsResponse::builder)
                .logger(LOG, "listWorkRequestResults")
                .serviceDetails(
                        "VnMonitoring",
                        "ListWorkRequestResults",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequestResult/ListWorkRequestResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestResultsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("results")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("resultType", request.getResultType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequestResultCollection.class,
                        ListWorkRequestResultsResponse.Builder::workRequestResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestResultsResponse.Builder::opcNextPage)
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
                        "VnMonitoring",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePathAnalyzerTestResponse> updatePathAnalyzerTest(
            UpdatePathAnalyzerTestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePathAnalyzerTestRequest, UpdatePathAnalyzerTestResponse>
                    handler) {

        Validate.notBlank(request.getPathAnalyzerTestId(), "pathAnalyzerTestId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePathAnalyzerTestDetails(),
                "updatePathAnalyzerTestDetails is required");

        return clientCall(request, UpdatePathAnalyzerTestResponse::builder)
                .logger(LOG, "updatePathAnalyzerTest")
                .serviceDetails(
                        "VnMonitoring",
                        "UpdatePathAnalyzerTest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/UpdatePathAnalyzerTest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePathAnalyzerTestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendPathParam(request.getPathAnalyzerTestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.PathAnalyzerTest.class,
                        UpdatePathAnalyzerTestResponse.Builder::pathAnalyzerTest)
                .handleResponseHeaderString("etag", UpdatePathAnalyzerTestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePathAnalyzerTestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public VnMonitoringAsyncClient(
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
    public VnMonitoringAsyncClient(
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
    public VnMonitoringAsyncClient(
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
    public VnMonitoringAsyncClient(
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
    public VnMonitoringAsyncClient(
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
    public VnMonitoringAsyncClient(
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
    public VnMonitoringAsyncClient(
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
