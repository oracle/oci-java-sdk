/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.aianomalydetection.requests.*;
import com.oracle.bmc.aianomalydetection.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class AnomalyDetectionClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements AnomalyDetection {
    /** Service instance for AnomalyDetection. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ANOMALYDETECTION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://anomalydetection.aiservice.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AnomalyDetectionClient.class);

    private final AnomalyDetectionWaiters waiters;

    private final AnomalyDetectionPaginators paginators;

    AnomalyDetectionClient(
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
                                    .nameFormat("AnomalyDetection-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new AnomalyDetectionWaiters(executorService, this);

        this.paginators = new AnomalyDetectionPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AnomalyDetectionClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "aianomalydetection";
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
        public AnomalyDetectionClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AnomalyDetectionClient(this, authenticationDetailsProvider, executorService);
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
                .serviceDetails("AnomalyDetection", "CancelWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20210101")
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
    public ChangeAiPrivateEndpointCompartmentResponse changeAiPrivateEndpointCompartment(
            ChangeAiPrivateEndpointCompartmentRequest request) {

        Validate.notBlank(
                request.getAiPrivateEndpointId(), "aiPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeAiPrivateEndpointCompartmentDetails(),
                "changeAiPrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangeAiPrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeAiPrivateEndpointCompartment")
                .serviceDetails("AnomalyDetection", "ChangeAiPrivateEndpointCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAiPrivateEndpointCompartmentRequest::builder)
                .basePath("/20210101")
                .appendPathParam("aiPrivateEndpoints")
                .appendPathParam(request.getAiPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAiPrivateEndpointCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAiPrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDataAssetCompartmentResponse changeDataAssetCompartment(
            ChangeDataAssetCompartmentRequest request) {

        Validate.notBlank(request.getDataAssetId(), "dataAssetId must not be blank");
        Objects.requireNonNull(
                request.getChangeDataAssetCompartmentDetails(),
                "changeDataAssetCompartmentDetails is required");

        return clientCall(request, ChangeDataAssetCompartmentResponse::builder)
                .logger(LOG, "changeDataAssetCompartment")
                .serviceDetails("AnomalyDetection", "ChangeDataAssetCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDataAssetCompartmentRequest::builder)
                .basePath("/20210101")
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.DataAsset.class,
                        ChangeDataAssetCompartmentResponse.Builder::dataAsset)
                .handleResponseHeaderString(
                        "etag", ChangeDataAssetCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDataAssetCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDetectAnomalyJobCompartmentResponse changeDetectAnomalyJobCompartment(
            ChangeDetectAnomalyJobCompartmentRequest request) {

        Validate.notBlank(request.getDetectAnomalyJobId(), "detectAnomalyJobId must not be blank");
        Objects.requireNonNull(
                request.getChangeDetectAnomalyJobCompartmentDetails(),
                "changeDetectAnomalyJobCompartmentDetails is required");

        return clientCall(request, ChangeDetectAnomalyJobCompartmentResponse::builder)
                .logger(LOG, "changeDetectAnomalyJobCompartment")
                .serviceDetails("AnomalyDetection", "ChangeDetectAnomalyJobCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDetectAnomalyJobCompartmentRequest::builder)
                .basePath("/20210101")
                .appendPathParam("detectAnomalyJobs")
                .appendPathParam(request.getDetectAnomalyJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDetectAnomalyJobCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeModelCompartmentResponse changeModelCompartment(
            ChangeModelCompartmentRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(
                request.getChangeModelCompartmentDetails(),
                "changeModelCompartmentDetails is required");

        return clientCall(request, ChangeModelCompartmentResponse::builder)
                .logger(LOG, "changeModelCompartment")
                .serviceDetails("AnomalyDetection", "ChangeModelCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeModelCompartmentRequest::builder)
                .basePath("/20210101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeModelCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeProjectCompartmentResponse changeProjectCompartment(
            ChangeProjectCompartmentRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");
        Objects.requireNonNull(
                request.getChangeProjectCompartmentDetails(),
                "changeProjectCompartmentDetails is required");

        return clientCall(request, ChangeProjectCompartmentResponse::builder)
                .logger(LOG, "changeProjectCompartment")
                .serviceDetails("AnomalyDetection", "ChangeProjectCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProjectCompartmentRequest::builder)
                .basePath("/20210101")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeProjectCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAiPrivateEndpointResponse createAiPrivateEndpoint(
            CreateAiPrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreateAiPrivateEndpointDetails(),
                "createAiPrivateEndpointDetails is required");

        return clientCall(request, CreateAiPrivateEndpointResponse::builder)
                .logger(LOG, "createAiPrivateEndpoint")
                .serviceDetails("AnomalyDetection", "CreateAiPrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAiPrivateEndpointRequest::builder)
                .basePath("/20210101")
                .appendPathParam("aiPrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateAiPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAiPrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateDataAssetResponse createDataAsset(CreateDataAssetRequest request) {
        Objects.requireNonNull(
                request.getCreateDataAssetDetails(), "createDataAssetDetails is required");

        return clientCall(request, CreateDataAssetResponse::builder)
                .logger(LOG, "createDataAsset")
                .serviceDetails("AnomalyDetection", "CreateDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataAssetRequest::builder)
                .basePath("/20210101")
                .appendPathParam("dataAssets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.DataAsset.class,
                        CreateDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", CreateDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDetectAnomalyJobResponse createDetectAnomalyJob(
            CreateDetectAnomalyJobRequest request) {
        Objects.requireNonNull(
                request.getCreateDetectAnomalyJobDetails(),
                "createDetectAnomalyJobDetails is required");

        return clientCall(request, CreateDetectAnomalyJobResponse::builder)
                .logger(LOG, "createDetectAnomalyJob")
                .serviceDetails("AnomalyDetection", "CreateDetectAnomalyJob", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDetectAnomalyJobRequest::builder)
                .basePath("/20210101")
                .appendPathParam("detectAnomalyJobs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.DetectAnomalyJob.class,
                        CreateDetectAnomalyJobResponse.Builder::detectAnomalyJob)
                .handleResponseHeaderString("etag", CreateDetectAnomalyJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDetectAnomalyJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateModelResponse createModel(CreateModelRequest request) {
        Objects.requireNonNull(request.getCreateModelDetails(), "createModelDetails is required");

        return clientCall(request, CreateModelResponse::builder)
                .logger(LOG, "createModel")
                .serviceDetails("AnomalyDetection", "CreateModel", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelRequest::builder)
                .basePath("/20210101")
                .appendPathParam("models")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.Model.class,
                        CreateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", CreateModelResponse.Builder::etag)
                .handleResponseHeaderString("location", CreateModelResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        Objects.requireNonNull(
                request.getCreateProjectDetails(), "createProjectDetails is required");

        return clientCall(request, CreateProjectResponse::builder)
                .logger(LOG, "createProject")
                .serviceDetails("AnomalyDetection", "CreateProject", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProjectRequest::builder)
                .basePath("/20210101")
                .appendPathParam("projects")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.Project.class,
                        CreateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", CreateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAiPrivateEndpointResponse deleteAiPrivateEndpoint(
            DeleteAiPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getAiPrivateEndpointId(), "aiPrivateEndpointId must not be blank");

        return clientCall(request, DeleteAiPrivateEndpointResponse::builder)
                .logger(LOG, "deleteAiPrivateEndpoint")
                .serviceDetails("AnomalyDetection", "DeleteAiPrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAiPrivateEndpointRequest::builder)
                .basePath("/20210101")
                .appendPathParam("aiPrivateEndpoints")
                .appendPathParam(request.getAiPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAiPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAiPrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDataAssetResponse deleteDataAsset(DeleteDataAssetRequest request) {

        Validate.notBlank(request.getDataAssetId(), "dataAssetId must not be blank");

        return clientCall(request, DeleteDataAssetResponse::builder)
                .logger(LOG, "deleteDataAsset")
                .serviceDetails("AnomalyDetection", "DeleteDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataAssetRequest::builder)
                .basePath("/20210101")
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDetectAnomalyJobResponse deleteDetectAnomalyJob(
            DeleteDetectAnomalyJobRequest request) {

        Validate.notBlank(request.getDetectAnomalyJobId(), "detectAnomalyJobId must not be blank");

        return clientCall(request, DeleteDetectAnomalyJobResponse::builder)
                .logger(LOG, "deleteDetectAnomalyJob")
                .serviceDetails("AnomalyDetection", "DeleteDetectAnomalyJob", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDetectAnomalyJobRequest::builder)
                .basePath("/20210101")
                .appendPathParam("detectAnomalyJobs")
                .appendPathParam(request.getDetectAnomalyJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDetectAnomalyJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteModelResponse deleteModel(DeleteModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, DeleteModelResponse::builder)
                .logger(LOG, "deleteModel")
                .serviceDetails("AnomalyDetection", "DeleteModel", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteModelRequest::builder)
                .basePath("/20210101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, DeleteProjectResponse::builder)
                .logger(LOG, "deleteProject")
                .serviceDetails("AnomalyDetection", "DeleteProject", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProjectRequest::builder)
                .basePath("/20210101")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetectAnomaliesResponse detectAnomalies(DetectAnomaliesRequest request) {
        Objects.requireNonNull(
                request.getDetectAnomaliesDetails(), "detectAnomaliesDetails is required");

        return clientCall(request, DetectAnomaliesResponse::builder)
                .logger(LOG, "detectAnomalies")
                .serviceDetails("AnomalyDetection", "DetectAnomalies", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetectAnomaliesRequest::builder)
                .basePath("/20210101")
                .appendPathParam("actions")
                .appendPathParam("detectAnomalies")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.AnomalyDetectResult.class,
                        DetectAnomaliesResponse.Builder::anomalyDetectResult)
                .handleResponseHeaderString(
                        "opc-request-id", DetectAnomaliesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAiPrivateEndpointResponse getAiPrivateEndpoint(GetAiPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getAiPrivateEndpointId(), "aiPrivateEndpointId must not be blank");

        return clientCall(request, GetAiPrivateEndpointResponse::builder)
                .logger(LOG, "getAiPrivateEndpoint")
                .serviceDetails("AnomalyDetection", "GetAiPrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAiPrivateEndpointRequest::builder)
                .basePath("/20210101")
                .appendPathParam("aiPrivateEndpoints")
                .appendPathParam(request.getAiPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.AiPrivateEndpoint.class,
                        GetAiPrivateEndpointResponse.Builder::aiPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id", GetAiPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAiPrivateEndpointResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetDataAssetResponse getDataAsset(GetDataAssetRequest request) {

        Validate.notBlank(request.getDataAssetId(), "dataAssetId must not be blank");

        return clientCall(request, GetDataAssetResponse::builder)
                .logger(LOG, "getDataAsset")
                .serviceDetails("AnomalyDetection", "GetDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataAssetRequest::builder)
                .basePath("/20210101")
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.DataAsset.class,
                        GetDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", GetDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDetectAnomalyJobResponse getDetectAnomalyJob(GetDetectAnomalyJobRequest request) {

        Validate.notBlank(request.getDetectAnomalyJobId(), "detectAnomalyJobId must not be blank");

        return clientCall(request, GetDetectAnomalyJobResponse::builder)
                .logger(LOG, "getDetectAnomalyJob")
                .serviceDetails("AnomalyDetection", "GetDetectAnomalyJob", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDetectAnomalyJobRequest::builder)
                .basePath("/20210101")
                .appendPathParam("detectAnomalyJobs")
                .appendPathParam(request.getDetectAnomalyJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.DetectAnomalyJob.class,
                        GetDetectAnomalyJobResponse.Builder::detectAnomalyJob)
                .handleResponseHeaderString("etag", GetDetectAnomalyJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDetectAnomalyJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetModelResponse getModel(GetModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, GetModelResponse::builder)
                .logger(LOG, "getModel")
                .serviceDetails("AnomalyDetection", "GetModel", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelRequest::builder)
                .basePath("/20210101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.Model.class,
                        GetModelResponse.Builder::model)
                .handleResponseHeaderString("etag", GetModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetProjectResponse getProject(GetProjectRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, GetProjectResponse::builder)
                .logger(LOG, "getProject")
                .serviceDetails("AnomalyDetection", "GetProject", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProjectRequest::builder)
                .basePath("/20210101")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.Project.class,
                        GetProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", GetProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails("AnomalyDetection", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListAiPrivateEndpointsResponse listAiPrivateEndpoints(
            ListAiPrivateEndpointsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAiPrivateEndpointsResponse::builder)
                .logger(LOG, "listAiPrivateEndpoints")
                .serviceDetails("AnomalyDetection", "ListAiPrivateEndpoints", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAiPrivateEndpointsRequest::builder)
                .basePath("/20210101")
                .appendPathParam("aiPrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.AiPrivateEndpointCollection.class,
                        ListAiPrivateEndpointsResponse.Builder::aiPrivateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAiPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAiPrivateEndpointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDataAssetsResponse listDataAssets(ListDataAssetsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDataAssetsResponse::builder)
                .logger(LOG, "listDataAssets")
                .serviceDetails("AnomalyDetection", "ListDataAssets", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataAssetsRequest::builder)
                .basePath("/20210101")
                .appendPathParam("dataAssets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.DataAssetCollection.class,
                        ListDataAssetsResponse.Builder::dataAssetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataAssetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDetectAnomalyJobsResponse listDetectAnomalyJobs(
            ListDetectAnomalyJobsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDetectAnomalyJobsResponse::builder)
                .logger(LOG, "listDetectAnomalyJobs")
                .serviceDetails("AnomalyDetection", "ListDetectAnomalyJobs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDetectAnomalyJobsRequest::builder)
                .basePath("/20210101")
                .appendPathParam("detectAnomalyJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("modelId", request.getModelId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("detectAnomalyJobId", request.getDetectAnomalyJobId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobCollection.class,
                        ListDetectAnomalyJobsResponse.Builder::detectAnomalyJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDetectAnomalyJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDetectAnomalyJobsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListDetectAnomalyJobsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListModelsResponse listModels(ListModelsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListModelsResponse::builder)
                .logger(LOG, "listModels")
                .serviceDetails("AnomalyDetection", "ListModels", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModelsRequest::builder)
                .basePath("/20210101")
                .appendPathParam("models")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.ModelCollection.class,
                        ListModelsResponse.Builder::modelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListProjectsResponse listProjects(ListProjectsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProjectsResponse::builder)
                .logger(LOG, "listProjects")
                .serviceDetails("AnomalyDetection", "ListProjects", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProjectsRequest::builder)
                .basePath("/20210101")
                .appendPathParam("projects")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.ProjectCollection.class,
                        ListProjectsResponse.Builder::projectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProjectsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails("AnomalyDetection", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.WorkRequestErrorCollection.class,
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
                .serviceDetails("AnomalyDetection", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails("AnomalyDetection", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210101")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateAiPrivateEndpointResponse updateAiPrivateEndpoint(
            UpdateAiPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getAiPrivateEndpointId(), "aiPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAiPrivateEndpointDetails(),
                "updateAiPrivateEndpointDetails is required");

        return clientCall(request, UpdateAiPrivateEndpointResponse::builder)
                .logger(LOG, "updateAiPrivateEndpoint")
                .serviceDetails("AnomalyDetection", "UpdateAiPrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAiPrivateEndpointRequest::builder)
                .basePath("/20210101")
                .appendPathParam("aiPrivateEndpoints")
                .appendPathParam(request.getAiPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAiPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAiPrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateDataAssetResponse updateDataAsset(UpdateDataAssetRequest request) {

        Validate.notBlank(request.getDataAssetId(), "dataAssetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataAssetDetails(), "updateDataAssetDetails is required");

        return clientCall(request, UpdateDataAssetResponse::builder)
                .logger(LOG, "updateDataAsset")
                .serviceDetails("AnomalyDetection", "UpdateDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataAssetRequest::builder)
                .basePath("/20210101")
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.DataAsset.class,
                        UpdateDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", UpdateDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDetectAnomalyJobResponse updateDetectAnomalyJob(
            UpdateDetectAnomalyJobRequest request) {

        Validate.notBlank(request.getDetectAnomalyJobId(), "detectAnomalyJobId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDetectAnomalyJobDetails(),
                "updateDetectAnomalyJobDetails is required");

        return clientCall(request, UpdateDetectAnomalyJobResponse::builder)
                .logger(LOG, "updateDetectAnomalyJob")
                .serviceDetails("AnomalyDetection", "UpdateDetectAnomalyJob", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDetectAnomalyJobRequest::builder)
                .basePath("/20210101")
                .appendPathParam("detectAnomalyJobs")
                .appendPathParam(request.getDetectAnomalyJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.DetectAnomalyJob.class,
                        UpdateDetectAnomalyJobResponse.Builder::detectAnomalyJob)
                .handleResponseHeaderString("etag", UpdateDetectAnomalyJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDetectAnomalyJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateModelResponse updateModel(UpdateModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(request.getUpdateModelDetails(), "updateModelDetails is required");

        return clientCall(request, UpdateModelResponse::builder)
                .logger(LOG, "updateModel")
                .serviceDetails("AnomalyDetection", "UpdateModel", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelRequest::builder)
                .basePath("/20210101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProjectDetails(), "updateProjectDetails is required");

        return clientCall(request, UpdateProjectResponse::builder)
                .logger(LOG, "updateProject")
                .serviceDetails("AnomalyDetection", "UpdateProject", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProjectRequest::builder)
                .basePath("/20210101")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aianomalydetection.model.Project.class,
                        UpdateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", UpdateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AnomalyDetectionWaiters getWaiters() {
        return waiters;
    }

    @Override
    public AnomalyDetectionPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AnomalyDetectionClient(
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
    public AnomalyDetectionClient(
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
    public AnomalyDetectionClient(
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
    public AnomalyDetectionClient(
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
    public AnomalyDetectionClient(
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
    public AnomalyDetectionClient(
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
    public AnomalyDetectionClient(
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
    public AnomalyDetectionClient(
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
