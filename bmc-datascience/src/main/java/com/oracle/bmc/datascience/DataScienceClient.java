/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class DataScienceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DataScience {
    /** Service instance for DataScience. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATASCIENCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datascience.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataScienceClient.class);

    private final DataScienceWaiters waiters;

    private final DataSciencePaginators paginators;

    DataScienceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    DataScienceClient(
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
                                    .nameFormat("DataScience-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DataScienceWaiters(executorService, this);

        this.paginators = new DataSciencePaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DataScienceClient",
                            "getJobArtifactContent,getMlApplicationHistoricalPackageContent,getMlApplicationPackageContent,getModelArtifactContent,getModelCustomMetadatumArtifactContent,getModelDefinedMetadatumArtifactContent,getStepArtifactContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataScienceClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "datascience";
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
        public DataScienceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataScienceClient(
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
    public ActivateModelResponse activateModel(ActivateModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, ActivateModelResponse::builder)
                .logger(LOG, "activateModel")
                .serviceDetails(
                        "DataScience",
                        "ActivateModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ActivateModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateModelRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        ActivateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", ActivateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ActivateModelDeploymentResponse activateModelDeployment(
            ActivateModelDeploymentRequest request) {

        Validate.notBlank(request.getModelDeploymentId(), "modelDeploymentId must not be blank");

        return clientCall(request, ActivateModelDeploymentResponse::builder)
                .logger(LOG, "activateModelDeployment")
                .serviceDetails(
                        "DataScience",
                        "ActivateModelDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/ActivateModelDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateModelDeploymentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelDeployments")
                .appendPathParam(request.getModelDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateModelDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateModelDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ActivateNotebookSessionResponse activateNotebookSession(
            ActivateNotebookSessionRequest request) {

        Validate.notBlank(request.getNotebookSessionId(), "notebookSessionId must not be blank");

        return clientCall(request, ActivateNotebookSessionResponse::builder)
                .logger(LOG, "activateNotebookSession")
                .serviceDetails(
                        "DataScience",
                        "ActivateNotebookSession",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/ActivateNotebookSession")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateNotebookSessionRequest::builder)
                .basePath("/20190101")
                .appendPathParam("notebookSessions")
                .appendPathParam(request.getNotebookSessionId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateNotebookSessionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateNotebookSessionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ActivateScheduleResponse activateSchedule(ActivateScheduleRequest request) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, ActivateScheduleResponse::builder)
                .logger(LOG, "activateSchedule")
                .serviceDetails(
                        "DataScience",
                        "ActivateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/ActivateSchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateScheduleRequest::builder)
                .basePath("/20190101")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", ActivateScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ActivateScheduleResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CancelJobRunResponse cancelJobRun(CancelJobRunRequest request) {

        Validate.notBlank(request.getJobRunId(), "jobRunId must not be blank");

        return clientCall(request, CancelJobRunResponse::builder)
                .logger(LOG, "cancelJobRun")
                .serviceDetails(
                        "DataScience",
                        "CancelJobRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/CancelJobRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelJobRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobRuns")
                .appendPathParam(request.getJobRunId())
                .appendPathParam("actions")
                .appendPathParam("cancelJobRun")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelJobRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelPipelineRunResponse cancelPipelineRun(CancelPipelineRunRequest request) {

        Validate.notBlank(request.getPipelineRunId(), "pipelineRunId must not be blank");

        return clientCall(request, CancelPipelineRunResponse::builder)
                .logger(LOG, "cancelPipelineRun")
                .serviceDetails(
                        "DataScience",
                        "CancelPipelineRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/CancelPipelineRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelPipelineRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelineRuns")
                .appendPathParam(request.getPipelineRunId())
                .appendPathParam("actions")
                .appendPathParam("cancelPipelineRun")
                .appendQueryParam("terminateGracefully", request.getTerminateGracefully())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelPipelineRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "DataScience",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20190101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDataSciencePrivateEndpointCompartmentResponse
            changeDataSciencePrivateEndpointCompartment(
                    ChangeDataSciencePrivateEndpointCompartmentRequest request) {

        Validate.notBlank(
                request.getDataSciencePrivateEndpointId(),
                "dataSciencePrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeDataSciencePrivateEndpointCompartmentDetails(),
                "changeDataSciencePrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangeDataSciencePrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeDataSciencePrivateEndpointCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeDataSciencePrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/ChangeDataSciencePrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDataSciencePrivateEndpointCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("dataSciencePrivateEndpoints")
                .appendPathParam(request.getDataSciencePrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDataSciencePrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDataSciencePrivateEndpointCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeJobCompartmentResponse changeJobCompartment(ChangeJobCompartmentRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");
        Objects.requireNonNull(
                request.getChangeJobCompartmentDetails(),
                "changeJobCompartmentDetails is required");

        return clientCall(request, ChangeJobCompartmentResponse::builder)
                .logger(LOG, "changeJobCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeJobCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/ChangeJobCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeJobCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeJobCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeJobRunCompartmentResponse changeJobRunCompartment(
            ChangeJobRunCompartmentRequest request) {

        Validate.notBlank(request.getJobRunId(), "jobRunId must not be blank");
        Objects.requireNonNull(
                request.getChangeJobRunCompartmentDetails(),
                "changeJobRunCompartmentDetails is required");

        return clientCall(request, ChangeJobRunCompartmentResponse::builder)
                .logger(LOG, "changeJobRunCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeJobRunCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/ChangeJobRunCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeJobRunCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobRuns")
                .appendPathParam(request.getJobRunId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeJobRunCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeMlApplicationCompartmentResponse changeMlApplicationCompartment(
            ChangeMlApplicationCompartmentRequest request) {

        Validate.notBlank(request.getMlApplicationId(), "mlApplicationId must not be blank");
        Objects.requireNonNull(
                request.getChangeMlApplicationCompartmentDetails(),
                "changeMlApplicationCompartmentDetails is required");

        return clientCall(request, ChangeMlApplicationCompartmentResponse::builder)
                .logger(LOG, "changeMlApplicationCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeMlApplicationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/ChangeMlApplicationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMlApplicationCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplications")
                .appendPathParam(request.getMlApplicationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMlApplicationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeMlApplicationImplementationCompartmentResponse
            changeMlApplicationImplementationCompartment(
                    ChangeMlApplicationImplementationCompartmentRequest request) {

        Validate.notBlank(
                request.getMlApplicationImplementationId(),
                "mlApplicationImplementationId must not be blank");
        Objects.requireNonNull(
                request.getChangeMlApplicationImplementationCompartmentDetails(),
                "changeMlApplicationImplementationCompartmentDetails is required");

        return clientCall(request, ChangeMlApplicationImplementationCompartmentResponse::builder)
                .logger(LOG, "changeMlApplicationImplementationCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeMlApplicationImplementationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/ChangeMlApplicationImplementationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMlApplicationImplementationCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementations")
                .appendPathParam(request.getMlApplicationImplementationId())
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
                        ChangeMlApplicationImplementationCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMlApplicationImplementationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeMlApplicationInstanceCompartmentResponse changeMlApplicationInstanceCompartment(
            ChangeMlApplicationInstanceCompartmentRequest request) {

        Validate.notBlank(
                request.getMlApplicationInstanceId(), "mlApplicationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeMlApplicationInstanceCompartmentDetails(),
                "changeMlApplicationInstanceCompartmentDetails is required");

        return clientCall(request, ChangeMlApplicationInstanceCompartmentResponse::builder)
                .logger(LOG, "changeMlApplicationInstanceCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeMlApplicationInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/ChangeMlApplicationInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMlApplicationInstanceCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstances")
                .appendPathParam(request.getMlApplicationInstanceId())
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
                        ChangeMlApplicationInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMlApplicationInstanceCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeMlApplicationInstanceViewCompartmentResponse
            changeMlApplicationInstanceViewCompartment(
                    ChangeMlApplicationInstanceViewCompartmentRequest request) {

        Validate.notBlank(
                request.getMlApplicationInstanceViewId(),
                "mlApplicationInstanceViewId must not be blank");
        Objects.requireNonNull(
                request.getChangeMlApplicationInstanceViewCompartmentDetails(),
                "changeMlApplicationInstanceViewCompartmentDetails is required");

        return clientCall(request, ChangeMlApplicationInstanceViewCompartmentResponse::builder)
                .logger(LOG, "changeMlApplicationInstanceViewCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeMlApplicationInstanceViewCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/ChangeMlApplicationInstanceViewCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMlApplicationInstanceViewCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstanceViews")
                .appendPathParam(request.getMlApplicationInstanceViewId())
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
                        ChangeMlApplicationInstanceViewCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMlApplicationInstanceViewCompartmentResponse.Builder::opcRequestId)
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
                .serviceDetails(
                        "DataScience",
                        "ChangeModelCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ChangeModelCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeModelCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeModelCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeModelDeploymentCompartmentResponse changeModelDeploymentCompartment(
            ChangeModelDeploymentCompartmentRequest request) {

        Validate.notBlank(request.getModelDeploymentId(), "modelDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getChangeModelDeploymentCompartmentDetails(),
                "changeModelDeploymentCompartmentDetails is required");

        return clientCall(request, ChangeModelDeploymentCompartmentResponse::builder)
                .logger(LOG, "changeModelDeploymentCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeModelDeploymentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/ChangeModelDeploymentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeModelDeploymentCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelDeployments")
                .appendPathParam(request.getModelDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeModelDeploymentCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeModelVersionSetCompartmentResponse changeModelVersionSetCompartment(
            ChangeModelVersionSetCompartmentRequest request) {

        Validate.notBlank(request.getModelVersionSetId(), "modelVersionSetId must not be blank");
        Objects.requireNonNull(
                request.getChangeModelVersionSetCompartmentDetails(),
                "changeModelVersionSetCompartmentDetails is required");

        return clientCall(request, ChangeModelVersionSetCompartmentResponse::builder)
                .logger(LOG, "changeModelVersionSetCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeModelVersionSetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/ChangeModelVersionSetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeModelVersionSetCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelVersionSets")
                .appendPathParam(request.getModelVersionSetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeModelVersionSetCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeModelVersionSetCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeNotebookSessionCompartmentResponse changeNotebookSessionCompartment(
            ChangeNotebookSessionCompartmentRequest request) {

        Validate.notBlank(request.getNotebookSessionId(), "notebookSessionId must not be blank");
        Objects.requireNonNull(
                request.getChangeNotebookSessionCompartmentDetails(),
                "changeNotebookSessionCompartmentDetails is required");

        return clientCall(request, ChangeNotebookSessionCompartmentResponse::builder)
                .logger(LOG, "changeNotebookSessionCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeNotebookSessionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/ChangeNotebookSessionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNotebookSessionCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("notebookSessions")
                .appendPathParam(request.getNotebookSessionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNotebookSessionCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePipelineCompartmentResponse changePipelineCompartment(
            ChangePipelineCompartmentRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");
        Objects.requireNonNull(
                request.getChangePipelineCompartmentDetails(),
                "changePipelineCompartmentDetails is required");

        return clientCall(request, ChangePipelineCompartmentResponse::builder)
                .logger(LOG, "changePipelineCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangePipelineCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/ChangePipelineCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePipelineCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangePipelineCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePipelineRunCompartmentResponse changePipelineRunCompartment(
            ChangePipelineRunCompartmentRequest request) {

        Validate.notBlank(request.getPipelineRunId(), "pipelineRunId must not be blank");
        Objects.requireNonNull(
                request.getChangePipelineRunCompartmentDetails(),
                "changePipelineRunCompartmentDetails is required");

        return clientCall(request, ChangePipelineRunCompartmentResponse::builder)
                .logger(LOG, "changePipelineRunCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangePipelineRunCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/ChangePipelineRunCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePipelineRunCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelineRuns")
                .appendPathParam(request.getPipelineRunId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePipelineRunCompartmentResponse.Builder::opcRequestId)
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
                .serviceDetails(
                        "DataScience",
                        "ChangeProjectCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/ChangeProjectCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProjectCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeProjectCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeScheduleCompartmentResponse changeScheduleCompartment(
            ChangeScheduleCompartmentRequest request) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");
        Objects.requireNonNull(
                request.getChangeScheduleCompartmentDetails(),
                "changeScheduleCompartmentDetails is required");

        return clientCall(request, ChangeScheduleCompartmentResponse::builder)
                .logger(LOG, "changeScheduleCompartment")
                .serviceDetails(
                        "DataScience",
                        "ChangeScheduleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/ChangeScheduleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeScheduleCompartmentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeScheduleCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeScheduleCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDataSciencePrivateEndpointResponse createDataSciencePrivateEndpoint(
            CreateDataSciencePrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreateDataSciencePrivateEndpointDetails(),
                "createDataSciencePrivateEndpointDetails is required");

        return clientCall(request, CreateDataSciencePrivateEndpointResponse::builder)
                .logger(LOG, "createDataSciencePrivateEndpoint")
                .serviceDetails("DataScience", "CreateDataSciencePrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataSciencePrivateEndpointRequest::builder)
                .basePath("/20190101")
                .appendPathParam("dataSciencePrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.DataSciencePrivateEndpoint.class,
                        CreateDataSciencePrivateEndpointResponse.Builder
                                ::dataSciencePrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", CreateDataSciencePrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDataSciencePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDataSciencePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "Location", CreateDataSciencePrivateEndpointResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateJobResponse createJob(CreateJobRequest request) {
        Objects.requireNonNull(request.getCreateJobDetails(), "createJobDetails is required");

        return clientCall(request, CreateJobResponse::builder)
                .logger(LOG, "createJob")
                .serviceDetails(
                        "DataScience",
                        "CreateJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/CreateJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJobRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Job.class, CreateJobResponse.Builder::job)
                .handleResponseHeaderString("etag", CreateJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateJobArtifactResponse createJobArtifact(CreateJobArtifactRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");
        Objects.requireNonNull(request.getJobArtifact(), "jobArtifact is required");

        return clientCall(request, CreateJobArtifactResponse::builder)
                .logger(LOG, "createJobArtifact")
                .serviceDetails(
                        "DataScience",
                        "CreateJobArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/CreateJobArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJobArtifactRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20190101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("artifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("content-disposition", request.getContentDisposition())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString("etag", CreateJobArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateJobRunResponse createJobRun(CreateJobRunRequest request) {
        Objects.requireNonNull(request.getCreateJobRunDetails(), "createJobRunDetails is required");

        return clientCall(request, CreateJobRunResponse::builder)
                .logger(LOG, "createJobRun")
                .serviceDetails(
                        "DataScience",
                        "CreateJobRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/CreateJobRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJobRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobRuns")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-parent-rpt-url", request.getOpcParentRptUrl())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.JobRun.class,
                        CreateJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("etag", CreateJobRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateMlApplicationResponse createMlApplication(CreateMlApplicationRequest request) {
        Objects.requireNonNull(
                request.getCreateMlApplicationDetails(), "createMlApplicationDetails is required");

        return clientCall(request, CreateMlApplicationResponse::builder)
                .logger(LOG, "createMlApplication")
                .serviceDetails(
                        "DataScience",
                        "CreateMlApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/CreateMlApplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMlApplicationRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplications")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplication.class,
                        CreateMlApplicationResponse.Builder::mlApplication)
                .handleResponseHeaderString("etag", CreateMlApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMlApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateMlApplicationImplementationResponse createMlApplicationImplementation(
            CreateMlApplicationImplementationRequest request) {
        Objects.requireNonNull(
                request.getCreateMlApplicationImplementationDetails(),
                "createMlApplicationImplementationDetails is required");

        return clientCall(request, CreateMlApplicationImplementationResponse::builder)
                .logger(LOG, "createMlApplicationImplementation")
                .serviceDetails(
                        "DataScience",
                        "CreateMlApplicationImplementation",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/CreateMlApplicationImplementation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMlApplicationImplementationRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationImplementation.class,
                        CreateMlApplicationImplementationResponse.Builder
                                ::mlApplicationImplementation)
                .handleResponseHeaderString(
                        "etag", CreateMlApplicationImplementationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateMlApplicationImplementationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateMlApplicationInstanceResponse createMlApplicationInstance(
            CreateMlApplicationInstanceRequest request) {
        Objects.requireNonNull(
                request.getCreateMlApplicationInstanceDetails(),
                "createMlApplicationInstanceDetails is required");

        return clientCall(request, CreateMlApplicationInstanceResponse::builder)
                .logger(LOG, "createMlApplicationInstance")
                .serviceDetails(
                        "DataScience",
                        "CreateMlApplicationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/CreateMlApplicationInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMlApplicationInstanceRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationInstance.class,
                        CreateMlApplicationInstanceResponse.Builder::mlApplicationInstance)
                .handleResponseHeaderString(
                        "etag", CreateMlApplicationInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", CreateMlApplicationInstanceResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateMlApplicationInstanceResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMlApplicationInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMlApplicationInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateModelResponse createModel(CreateModelRequest request) {
        Objects.requireNonNull(request.getCreateModelDetails(), "createModelDetails is required");

        return clientCall(request, CreateModelResponse::builder)
                .logger(LOG, "createModel")
                .serviceDetails(
                        "DataScience",
                        "CreateModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        CreateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", CreateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateModelArtifactResponse createModelArtifact(CreateModelArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(request.getModelArtifact(), "modelArtifact is required");

        return clientCall(request, CreateModelArtifactResponse::builder)
                .logger(LOG, "createModelArtifact")
                .serviceDetails(
                        "DataScience",
                        "CreateModelArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelArtifactRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("artifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("content-disposition", request.getContentDisposition())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString("etag", CreateModelArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateModelCustomMetadatumArtifactResponse createModelCustomMetadatumArtifact(
            CreateModelCustomMetadatumArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");
        Objects.requireNonNull(
                request.getModelCustomMetadatumArtifact(),
                "modelCustomMetadatumArtifact is required");

        return clientCall(request, CreateModelCustomMetadatumArtifactResponse::builder)
                .logger(LOG, "createModelCustomMetadatumArtifact")
                .serviceDetails(
                        "DataScience",
                        "CreateModelCustomMetadatumArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelCustomMetadatumArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelCustomMetadatumArtifactRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("customMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("content-disposition", request.getContentDisposition())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "etag", CreateModelCustomMetadatumArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateModelCustomMetadatumArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateModelDefinedMetadatumArtifactResponse createModelDefinedMetadatumArtifact(
            CreateModelDefinedMetadatumArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");
        Objects.requireNonNull(
                request.getModelDefinedMetadatumArtifact(),
                "modelDefinedMetadatumArtifact is required");

        return clientCall(request, CreateModelDefinedMetadatumArtifactResponse::builder)
                .logger(LOG, "createModelDefinedMetadatumArtifact")
                .serviceDetails(
                        "DataScience",
                        "CreateModelDefinedMetadatumArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelDefinedMetadatumArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelDefinedMetadatumArtifactRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("definedMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("content-disposition", request.getContentDisposition())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "etag", CreateModelDefinedMetadatumArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateModelDefinedMetadatumArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateModelDeploymentResponse createModelDeployment(
            CreateModelDeploymentRequest request) {
        Objects.requireNonNull(
                request.getCreateModelDeploymentDetails(),
                "createModelDeploymentDetails is required");

        return clientCall(request, CreateModelDeploymentResponse::builder)
                .logger(LOG, "createModelDeployment")
                .serviceDetails(
                        "DataScience",
                        "CreateModelDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/CreateModelDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelDeploymentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelDeployments")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-parent-rpt-url", request.getOpcParentRptUrl())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelDeployment.class,
                        CreateModelDeploymentResponse.Builder::modelDeployment)
                .handleResponseHeaderString("etag", CreateModelDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", CreateModelDeploymentResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateModelDeploymentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateModelProvenanceResponse createModelProvenance(
            CreateModelProvenanceRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(
                request.getCreateModelProvenanceDetails(),
                "createModelProvenanceDetails is required");

        return clientCall(request, CreateModelProvenanceResponse::builder)
                .logger(LOG, "createModelProvenance")
                .serviceDetails(
                        "DataScience",
                        "CreateModelProvenance",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/CreateModelProvenance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelProvenanceRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("provenance")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelProvenance.class,
                        CreateModelProvenanceResponse.Builder::modelProvenance)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelProvenanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateModelProvenanceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateModelVersionSetResponse createModelVersionSet(
            CreateModelVersionSetRequest request) {
        Objects.requireNonNull(
                request.getCreateModelVersionSetDetails(),
                "createModelVersionSetDetails is required");

        return clientCall(request, CreateModelVersionSetResponse::builder)
                .logger(LOG, "createModelVersionSet")
                .serviceDetails(
                        "DataScience",
                        "CreateModelVersionSet",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/CreateModelVersionSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelVersionSetRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelVersionSets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelVersionSet.class,
                        CreateModelVersionSetResponse.Builder::modelVersionSet)
                .handleResponseHeaderString("etag", CreateModelVersionSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelVersionSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateNotebookSessionResponse createNotebookSession(
            CreateNotebookSessionRequest request) {
        Objects.requireNonNull(
                request.getCreateNotebookSessionDetails(),
                "createNotebookSessionDetails is required");

        return clientCall(request, CreateNotebookSessionResponse::builder)
                .logger(LOG, "createNotebookSession")
                .serviceDetails(
                        "DataScience",
                        "CreateNotebookSession",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/CreateNotebookSession")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNotebookSessionRequest::builder)
                .basePath("/20190101")
                .appendPathParam("notebookSessions")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.NotebookSession.class,
                        CreateNotebookSessionResponse.Builder::notebookSession)
                .handleResponseHeaderString("etag", CreateNotebookSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "location", CreateNotebookSessionResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNotebookSessionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateNotebookSessionResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreatePipelineResponse createPipeline(CreatePipelineRequest request) {
        Objects.requireNonNull(
                request.getCreatePipelineDetails(), "createPipelineDetails is required");

        return clientCall(request, CreatePipelineResponse::builder)
                .logger(LOG, "createPipeline")
                .serviceDetails(
                        "DataScience",
                        "CreatePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/CreatePipeline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePipelineRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelines")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Pipeline.class,
                        CreatePipelineResponse.Builder::pipeline)
                .handleResponseHeaderString("etag", CreatePipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePipelineRunResponse createPipelineRun(CreatePipelineRunRequest request) {
        Objects.requireNonNull(
                request.getCreatePipelineRunDetails(), "createPipelineRunDetails is required");

        return clientCall(request, CreatePipelineRunResponse::builder)
                .logger(LOG, "createPipelineRun")
                .serviceDetails(
                        "DataScience",
                        "CreatePipelineRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/CreatePipelineRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePipelineRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelineRuns")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-parent-rpt-url", request.getOpcParentRptUrl())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.PipelineRun.class,
                        CreatePipelineRunResponse.Builder::pipelineRun)
                .handleResponseHeaderString("etag", CreatePipelineRunResponse.Builder::etag)
                .handleResponseHeaderString("location", CreatePipelineRunResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePipelineRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        Objects.requireNonNull(
                request.getCreateProjectDetails(), "createProjectDetails is required");

        return clientCall(request, CreateProjectResponse::builder)
                .logger(LOG, "createProject")
                .serviceDetails(
                        "DataScience",
                        "CreateProject",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/CreateProject")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProjectRequest::builder)
                .basePath("/20190101")
                .appendPathParam("projects")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Project.class,
                        CreateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", CreateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateScheduleResponse createSchedule(CreateScheduleRequest request) {
        Objects.requireNonNull(
                request.getCreateScheduleDetails(), "createScheduleDetails is required");

        return clientCall(request, CreateScheduleResponse::builder)
                .logger(LOG, "createSchedule")
                .serviceDetails(
                        "DataScience",
                        "CreateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/CreateSchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScheduleRequest::builder)
                .basePath("/20190101")
                .appendPathParam("schedules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Schedule.class,
                        CreateScheduleResponse.Builder::schedule)
                .handleResponseHeaderString("location", CreateScheduleResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateScheduleResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateScheduleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScheduleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateStepArtifactResponse createStepArtifact(CreateStepArtifactRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        Validate.notBlank(request.getStepName(), "stepName must not be blank");
        Objects.requireNonNull(request.getStepArtifact(), "stepArtifact is required");

        return clientCall(request, CreateStepArtifactResponse::builder)
                .logger(LOG, "createStepArtifact")
                .serviceDetails(
                        "DataScience",
                        "CreateStepArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/CreateStepArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStepArtifactRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20190101")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("steps")
                .appendPathParam(request.getStepName())
                .appendPathParam("artifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("content-disposition", request.getContentDisposition())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateStepArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeactivateModelResponse deactivateModel(DeactivateModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, DeactivateModelResponse::builder)
                .logger(LOG, "deactivateModel")
                .serviceDetails(
                        "DataScience",
                        "DeactivateModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeactivateModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateModelRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("deactivate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        DeactivateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", DeactivateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeactivateModelDeploymentResponse deactivateModelDeployment(
            DeactivateModelDeploymentRequest request) {

        Validate.notBlank(request.getModelDeploymentId(), "modelDeploymentId must not be blank");

        return clientCall(request, DeactivateModelDeploymentResponse::builder)
                .logger(LOG, "deactivateModelDeployment")
                .serviceDetails(
                        "DataScience",
                        "DeactivateModelDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/DeactivateModelDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateModelDeploymentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelDeployments")
                .appendPathParam(request.getModelDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("deactivate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeactivateModelDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateModelDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeactivateNotebookSessionResponse deactivateNotebookSession(
            DeactivateNotebookSessionRequest request) {

        Validate.notBlank(request.getNotebookSessionId(), "notebookSessionId must not be blank");

        return clientCall(request, DeactivateNotebookSessionResponse::builder)
                .logger(LOG, "deactivateNotebookSession")
                .serviceDetails(
                        "DataScience",
                        "DeactivateNotebookSession",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/DeactivateNotebookSession")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateNotebookSessionRequest::builder)
                .basePath("/20190101")
                .appendPathParam("notebookSessions")
                .appendPathParam(request.getNotebookSessionId())
                .appendPathParam("actions")
                .appendPathParam("deactivate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeactivateNotebookSessionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateNotebookSessionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeactivateScheduleResponse deactivateSchedule(DeactivateScheduleRequest request) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, DeactivateScheduleResponse::builder)
                .logger(LOG, "deactivateSchedule")
                .serviceDetails(
                        "DataScience",
                        "DeactivateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/DeactivateSchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateScheduleRequest::builder)
                .basePath("/20190101")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .appendPathParam("actions")
                .appendPathParam("deactivate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeactivateScheduleResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteDataSciencePrivateEndpointResponse deleteDataSciencePrivateEndpoint(
            DeleteDataSciencePrivateEndpointRequest request) {

        Validate.notBlank(
                request.getDataSciencePrivateEndpointId(),
                "dataSciencePrivateEndpointId must not be blank");

        return clientCall(request, DeleteDataSciencePrivateEndpointResponse::builder)
                .logger(LOG, "deleteDataSciencePrivateEndpoint")
                .serviceDetails(
                        "DataScience",
                        "DeleteDataSciencePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/DeleteDataSciencePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataSciencePrivateEndpointRequest::builder)
                .basePath("/20190101")
                .appendPathParam("dataSciencePrivateEndpoints")
                .appendPathParam(request.getDataSciencePrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDataSciencePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDataSciencePrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, DeleteJobResponse::builder)
                .logger(LOG, "deleteJob")
                .serviceDetails(
                        "DataScience",
                        "DeleteJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/DeleteJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJobRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendQueryParam("deleteRelatedJobRuns", request.getDeleteRelatedJobRuns())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteJobRunResponse deleteJobRun(DeleteJobRunRequest request) {

        Validate.notBlank(request.getJobRunId(), "jobRunId must not be blank");

        return clientCall(request, DeleteJobRunResponse::builder)
                .logger(LOG, "deleteJobRun")
                .serviceDetails(
                        "DataScience",
                        "DeleteJobRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/DeleteJobRun")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJobRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobRuns")
                .appendPathParam(request.getJobRunId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJobRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMlApplicationResponse deleteMlApplication(DeleteMlApplicationRequest request) {

        Validate.notBlank(request.getMlApplicationId(), "mlApplicationId must not be blank");

        return clientCall(request, DeleteMlApplicationResponse::builder)
                .logger(LOG, "deleteMlApplication")
                .serviceDetails(
                        "DataScience",
                        "DeleteMlApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/DeleteMlApplication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMlApplicationRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplications")
                .appendPathParam(request.getMlApplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMlApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMlApplicationImplementationResponse deleteMlApplicationImplementation(
            DeleteMlApplicationImplementationRequest request) {

        Validate.notBlank(
                request.getMlApplicationImplementationId(),
                "mlApplicationImplementationId must not be blank");

        return clientCall(request, DeleteMlApplicationImplementationResponse::builder)
                .logger(LOG, "deleteMlApplicationImplementation")
                .serviceDetails(
                        "DataScience",
                        "DeleteMlApplicationImplementation",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/DeleteMlApplicationImplementation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMlApplicationImplementationRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementations")
                .appendPathParam(request.getMlApplicationImplementationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMlApplicationImplementationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteMlApplicationImplementationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMlApplicationInstanceResponse deleteMlApplicationInstance(
            DeleteMlApplicationInstanceRequest request) {

        Validate.notBlank(
                request.getMlApplicationInstanceId(), "mlApplicationInstanceId must not be blank");

        return clientCall(request, DeleteMlApplicationInstanceResponse::builder)
                .logger(LOG, "deleteMlApplicationInstance")
                .serviceDetails(
                        "DataScience",
                        "DeleteMlApplicationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/DeleteMlApplicationInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMlApplicationInstanceRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstances")
                .appendPathParam(request.getMlApplicationInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMlApplicationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMlApplicationInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteModelResponse deleteModel(DeleteModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, DeleteModelResponse::builder)
                .logger(LOG, "deleteModel")
                .serviceDetails(
                        "DataScience",
                        "DeleteModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeleteModel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteModelRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteModelCustomMetadatumArtifactResponse deleteModelCustomMetadatumArtifact(
            DeleteModelCustomMetadatumArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");

        return clientCall(request, DeleteModelCustomMetadatumArtifactResponse::builder)
                .logger(LOG, "deleteModelCustomMetadatumArtifact")
                .serviceDetails(
                        "DataScience",
                        "DeleteModelCustomMetadatumArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeleteModelCustomMetadatumArtifact")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteModelCustomMetadatumArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("customMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteModelCustomMetadatumArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteModelDefinedMetadatumArtifactResponse deleteModelDefinedMetadatumArtifact(
            DeleteModelDefinedMetadatumArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");

        return clientCall(request, DeleteModelDefinedMetadatumArtifactResponse::builder)
                .logger(LOG, "deleteModelDefinedMetadatumArtifact")
                .serviceDetails(
                        "DataScience",
                        "DeleteModelDefinedMetadatumArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/DeleteModelDefinedMetadatumArtifact")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteModelDefinedMetadatumArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("definedMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteModelDefinedMetadatumArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteModelDeploymentResponse deleteModelDeployment(
            DeleteModelDeploymentRequest request) {

        Validate.notBlank(request.getModelDeploymentId(), "modelDeploymentId must not be blank");

        return clientCall(request, DeleteModelDeploymentResponse::builder)
                .logger(LOG, "deleteModelDeployment")
                .serviceDetails(
                        "DataScience",
                        "DeleteModelDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/DeleteModelDeployment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteModelDeploymentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelDeployments")
                .appendPathParam(request.getModelDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteModelDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteModelDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteModelVersionSetResponse deleteModelVersionSet(
            DeleteModelVersionSetRequest request) {

        Validate.notBlank(request.getModelVersionSetId(), "modelVersionSetId must not be blank");

        return clientCall(request, DeleteModelVersionSetResponse::builder)
                .logger(LOG, "deleteModelVersionSet")
                .serviceDetails(
                        "DataScience",
                        "DeleteModelVersionSet",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/DeleteModelVersionSet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteModelVersionSetRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelVersionSets")
                .appendPathParam(request.getModelVersionSetId())
                .appendQueryParam("isDeleteRelatedModels", request.getIsDeleteRelatedModels())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteModelVersionSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteModelVersionSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteNotebookSessionResponse deleteNotebookSession(
            DeleteNotebookSessionRequest request) {

        Validate.notBlank(request.getNotebookSessionId(), "notebookSessionId must not be blank");

        return clientCall(request, DeleteNotebookSessionResponse::builder)
                .logger(LOG, "deleteNotebookSession")
                .serviceDetails(
                        "DataScience",
                        "DeleteNotebookSession",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/DeleteNotebookSession")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNotebookSessionRequest::builder)
                .basePath("/20190101")
                .appendPathParam("notebookSessions")
                .appendPathParam(request.getNotebookSessionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNotebookSessionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNotebookSessionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePipelineResponse deletePipeline(DeletePipelineRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        return clientCall(request, DeletePipelineResponse::builder)
                .logger(LOG, "deletePipeline")
                .serviceDetails(
                        "DataScience",
                        "DeletePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/DeletePipeline")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePipelineRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendQueryParam(
                        "deleteRelatedPipelineRuns", request.getDeleteRelatedPipelineRuns())
                .appendQueryParam("deleteRelatedJobRuns", request.getDeleteRelatedJobRuns())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeletePipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePipelineRunResponse deletePipelineRun(DeletePipelineRunRequest request) {

        Validate.notBlank(request.getPipelineRunId(), "pipelineRunId must not be blank");

        return clientCall(request, DeletePipelineRunResponse::builder)
                .logger(LOG, "deletePipelineRun")
                .serviceDetails(
                        "DataScience",
                        "DeletePipelineRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/DeletePipelineRun")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePipelineRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelineRuns")
                .appendPathParam(request.getPipelineRunId())
                .appendQueryParam("deleteRelatedJobRuns", request.getDeleteRelatedJobRuns())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePipelineRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, DeleteProjectResponse::builder)
                .logger(LOG, "deleteProject")
                .serviceDetails(
                        "DataScience",
                        "DeleteProject",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/DeleteProject")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProjectRequest::builder)
                .basePath("/20190101")
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
    public DeleteScheduleResponse deleteSchedule(DeleteScheduleRequest request) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, DeleteScheduleResponse::builder)
                .logger(LOG, "deleteSchedule")
                .serviceDetails(
                        "DataScience",
                        "DeleteSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/DeleteSchedule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScheduleRequest::builder)
                .basePath("/20190101")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteScheduleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScheduleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableMlApplicationInstanceViewTriggerResponse disableMlApplicationInstanceViewTrigger(
            DisableMlApplicationInstanceViewTriggerRequest request) {
        Objects.requireNonNull(
                request.getDisableMlApplicationInstanceViewTriggerDetails(),
                "disableMlApplicationInstanceViewTriggerDetails is required");

        Validate.notBlank(
                request.getMlApplicationInstanceViewId(),
                "mlApplicationInstanceViewId must not be blank");

        return clientCall(request, DisableMlApplicationInstanceViewTriggerResponse::builder)
                .logger(LOG, "disableMlApplicationInstanceViewTrigger")
                .serviceDetails(
                        "DataScience",
                        "DisableMlApplicationInstanceViewTrigger",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/DisableMlApplicationInstanceViewTrigger")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableMlApplicationInstanceViewTriggerRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstanceViews")
                .appendPathParam(request.getMlApplicationInstanceViewId())
                .appendPathParam("actions")
                .appendPathParam("disableTrigger")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationInstanceView.class,
                        DisableMlApplicationInstanceViewTriggerResponse.Builder
                                ::mlApplicationInstanceView)
                .handleResponseHeaderString(
                        "etag", DisableMlApplicationInstanceViewTriggerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableMlApplicationInstanceViewTriggerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableMlApplicationInstanceViewTriggerResponse enableMlApplicationInstanceViewTrigger(
            EnableMlApplicationInstanceViewTriggerRequest request) {
        Objects.requireNonNull(
                request.getEnableMlApplicationInstanceViewTriggerDetails(),
                "enableMlApplicationInstanceViewTriggerDetails is required");

        Validate.notBlank(
                request.getMlApplicationInstanceViewId(),
                "mlApplicationInstanceViewId must not be blank");

        return clientCall(request, EnableMlApplicationInstanceViewTriggerResponse::builder)
                .logger(LOG, "enableMlApplicationInstanceViewTrigger")
                .serviceDetails(
                        "DataScience",
                        "EnableMlApplicationInstanceViewTrigger",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/EnableMlApplicationInstanceViewTrigger")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableMlApplicationInstanceViewTriggerRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstanceViews")
                .appendPathParam(request.getMlApplicationInstanceViewId())
                .appendPathParam("actions")
                .appendPathParam("enableTrigger")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationInstanceView.class,
                        EnableMlApplicationInstanceViewTriggerResponse.Builder
                                ::mlApplicationInstanceView)
                .handleResponseHeaderString(
                        "etag", EnableMlApplicationInstanceViewTriggerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableMlApplicationInstanceViewTriggerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ExportModelArtifactResponse exportModelArtifact(ExportModelArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(
                request.getExportModelArtifactDetails(), "exportModelArtifactDetails is required");

        return clientCall(request, ExportModelArtifactResponse::builder)
                .logger(LOG, "exportModelArtifact")
                .serviceDetails(
                        "DataScience",
                        "ExportModelArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ExportModelArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportModelArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("exportArtifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ExportModelArtifactResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExportModelArtifactResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetDataSciencePrivateEndpointResponse getDataSciencePrivateEndpoint(
            GetDataSciencePrivateEndpointRequest request) {

        Validate.notBlank(
                request.getDataSciencePrivateEndpointId(),
                "dataSciencePrivateEndpointId must not be blank");

        return clientCall(request, GetDataSciencePrivateEndpointResponse::builder)
                .logger(LOG, "getDataSciencePrivateEndpoint")
                .serviceDetails(
                        "DataScience",
                        "GetDataSciencePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/GetDataSciencePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataSciencePrivateEndpointRequest::builder)
                .basePath("/20190101")
                .appendPathParam("dataSciencePrivateEndpoints")
                .appendPathParam(request.getDataSciencePrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.DataSciencePrivateEndpoint.class,
                        GetDataSciencePrivateEndpointResponse.Builder::dataSciencePrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", GetDataSciencePrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDataSciencePrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJobResponse getJob(GetJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobResponse::builder)
                .logger(LOG, "getJob")
                .serviceDetails(
                        "DataScience",
                        "GetJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/GetJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(com.oracle.bmc.datascience.model.Job.class, GetJobResponse.Builder::job)
                .handleResponseHeaderString("etag", GetJobResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJobArtifactContentResponse getJobArtifactContent(
            GetJobArtifactContentRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobArtifactContentResponse::builder)
                .logger(LOG, "getJobArtifactContent")
                .serviceDetails(
                        "DataScience",
                        "GetJobArtifactContent",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/GetJobArtifactContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobArtifactContentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("range", request.getRange())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetJobArtifactContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetJobArtifactContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobArtifactContentResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", GetJobArtifactContentResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-md5", GetJobArtifactContentResponse.Builder::contentMd5)
                .handleResponseHeaderDate(
                        "last-modified", GetJobArtifactContentResponse.Builder::lastModified)
                .handleResponseHeaderString(
                        "content-disposition",
                        GetJobArtifactContentResponse.Builder::contentDisposition)
                .callSync();
    }

    @Override
    public GetJobRunResponse getJobRun(GetJobRunRequest request) {

        Validate.notBlank(request.getJobRunId(), "jobRunId must not be blank");

        return clientCall(request, GetJobRunResponse::builder)
                .logger(LOG, "getJobRun")
                .serviceDetails(
                        "DataScience",
                        "GetJobRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/GetJobRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobRuns")
                .appendPathParam(request.getJobRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.JobRun.class,
                        GetJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("etag", GetJobRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMlApplicationResponse getMlApplication(GetMlApplicationRequest request) {

        Validate.notBlank(request.getMlApplicationId(), "mlApplicationId must not be blank");

        return clientCall(request, GetMlApplicationResponse::builder)
                .logger(LOG, "getMlApplication")
                .serviceDetails(
                        "DataScience",
                        "GetMlApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/GetMlApplication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMlApplicationRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplications")
                .appendPathParam(request.getMlApplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplication.class,
                        GetMlApplicationResponse.Builder::mlApplication)
                .handleResponseHeaderString("etag", GetMlApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMlApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMlApplicationHistoricalPackageContentResponse
            getMlApplicationHistoricalPackageContent(
                    GetMlApplicationHistoricalPackageContentRequest request) {

        Validate.notBlank(
                request.getMlApplicationImplementationVersionId(),
                "mlApplicationImplementationVersionId must not be blank");

        return clientCall(request, GetMlApplicationHistoricalPackageContentResponse::builder)
                .logger(LOG, "getMlApplicationHistoricalPackageContent")
                .serviceDetails(
                        "DataScience",
                        "GetMlApplicationHistoricalPackageContent",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementationVersion/GetMlApplicationHistoricalPackageContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMlApplicationHistoricalPackageContentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementationVersions")
                .appendPathParam(request.getMlApplicationImplementationVersionId())
                .appendPathParam("mlApplicationHistoricalPackage")
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetMlApplicationHistoricalPackageContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", GetMlApplicationHistoricalPackageContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMlApplicationHistoricalPackageContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMlApplicationImplementationResponse getMlApplicationImplementation(
            GetMlApplicationImplementationRequest request) {

        Validate.notBlank(
                request.getMlApplicationImplementationId(),
                "mlApplicationImplementationId must not be blank");

        return clientCall(request, GetMlApplicationImplementationResponse::builder)
                .logger(LOG, "getMlApplicationImplementation")
                .serviceDetails(
                        "DataScience",
                        "GetMlApplicationImplementation",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/GetMlApplicationImplementation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMlApplicationImplementationRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementations")
                .appendPathParam(request.getMlApplicationImplementationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationImplementation.class,
                        GetMlApplicationImplementationResponse.Builder::mlApplicationImplementation)
                .handleResponseHeaderString(
                        "etag", GetMlApplicationImplementationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMlApplicationImplementationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMlApplicationImplementationVersionResponse getMlApplicationImplementationVersion(
            GetMlApplicationImplementationVersionRequest request) {

        Validate.notBlank(
                request.getMlApplicationImplementationVersionId(),
                "mlApplicationImplementationVersionId must not be blank");

        return clientCall(request, GetMlApplicationImplementationVersionResponse::builder)
                .logger(LOG, "getMlApplicationImplementationVersion")
                .serviceDetails(
                        "DataScience",
                        "GetMlApplicationImplementationVersion",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementationVersion/GetMlApplicationImplementationVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMlApplicationImplementationVersionRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementationVersions")
                .appendPathParam(request.getMlApplicationImplementationVersionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationImplementationVersion.class,
                        GetMlApplicationImplementationVersionResponse.Builder
                                ::mlApplicationImplementationVersion)
                .handleResponseHeaderString(
                        "etag", GetMlApplicationImplementationVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMlApplicationImplementationVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMlApplicationInstanceResponse getMlApplicationInstance(
            GetMlApplicationInstanceRequest request) {

        Validate.notBlank(
                request.getMlApplicationInstanceId(), "mlApplicationInstanceId must not be blank");

        return clientCall(request, GetMlApplicationInstanceResponse::builder)
                .logger(LOG, "getMlApplicationInstance")
                .serviceDetails(
                        "DataScience",
                        "GetMlApplicationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/GetMlApplicationInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMlApplicationInstanceRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstances")
                .appendPathParam(request.getMlApplicationInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationInstance.class,
                        GetMlApplicationInstanceResponse.Builder::mlApplicationInstance)
                .handleResponseHeaderString("etag", GetMlApplicationInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMlApplicationInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMlApplicationInstanceViewResponse getMlApplicationInstanceView(
            GetMlApplicationInstanceViewRequest request) {

        Validate.notBlank(
                request.getMlApplicationInstanceViewId(),
                "mlApplicationInstanceViewId must not be blank");

        return clientCall(request, GetMlApplicationInstanceViewResponse::builder)
                .logger(LOG, "getMlApplicationInstanceView")
                .serviceDetails(
                        "DataScience",
                        "GetMlApplicationInstanceView",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/GetMlApplicationInstanceView")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMlApplicationInstanceViewRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstanceViews")
                .appendPathParam(request.getMlApplicationInstanceViewId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationInstanceView.class,
                        GetMlApplicationInstanceViewResponse.Builder::mlApplicationInstanceView)
                .handleResponseHeaderString(
                        "etag", GetMlApplicationInstanceViewResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMlApplicationInstanceViewResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMlApplicationPackageContentResponse getMlApplicationPackageContent(
            GetMlApplicationPackageContentRequest request) {

        Validate.notBlank(
                request.getMlApplicationImplementationId(),
                "mlApplicationImplementationId must not be blank");

        return clientCall(request, GetMlApplicationPackageContentResponse::builder)
                .logger(LOG, "getMlApplicationPackageContent")
                .serviceDetails(
                        "DataScience",
                        "GetMlApplicationPackageContent",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/GetMlApplicationPackageContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMlApplicationPackageContentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementations")
                .appendPathParam(request.getMlApplicationImplementationId())
                .appendPathParam("mlApplicationPackage")
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetMlApplicationPackageContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMlApplicationPackageContentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-ml-app-package-args",
                        GetMlApplicationPackageContentResponse.Builder::opcMlAppPackageArgs)
                .callSync();
    }

    @Override
    public GetModelResponse getModel(GetModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, GetModelResponse::builder)
                .logger(LOG, "getModel")
                .serviceDetails(
                        "DataScience",
                        "GetModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        GetModelResponse.Builder::model)
                .handleResponseHeaderString("etag", GetModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetModelArtifactContentResponse getModelArtifactContent(
            GetModelArtifactContentRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, GetModelArtifactContentResponse::builder)
                .logger(LOG, "getModelArtifactContent")
                .serviceDetails(
                        "DataScience",
                        "GetModelArtifactContent",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelArtifactContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelArtifactContentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("range", request.getRange())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetModelArtifactContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetModelArtifactContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelArtifactContentResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", GetModelArtifactContentResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-disposition",
                        GetModelArtifactContentResponse.Builder::contentDisposition)
                .handleResponseHeaderString(
                        "content-md5", GetModelArtifactContentResponse.Builder::contentMd5)
                .handleResponseHeaderDate(
                        "last-modified", GetModelArtifactContentResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public GetModelCustomMetadatumArtifactContentResponse getModelCustomMetadatumArtifactContent(
            GetModelCustomMetadatumArtifactContentRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");

        return clientCall(request, GetModelCustomMetadatumArtifactContentResponse::builder)
                .logger(LOG, "getModelCustomMetadatumArtifactContent")
                .serviceDetails(
                        "DataScience",
                        "GetModelCustomMetadatumArtifactContent",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelCustomMetadatumArtifactContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelCustomMetadatumArtifactContentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("customMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("range", request.getRange())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetModelCustomMetadatumArtifactContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", GetModelCustomMetadatumArtifactContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetModelCustomMetadatumArtifactContentResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        GetModelCustomMetadatumArtifactContentResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-disposition",
                        GetModelCustomMetadatumArtifactContentResponse.Builder::contentDisposition)
                .handleResponseHeaderString(
                        "content-md5",
                        GetModelCustomMetadatumArtifactContentResponse.Builder::contentMd5)
                .handleResponseHeaderDate(
                        "last-modified",
                        GetModelCustomMetadatumArtifactContentResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public GetModelDefinedMetadatumArtifactContentResponse getModelDefinedMetadatumArtifactContent(
            GetModelDefinedMetadatumArtifactContentRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");

        return clientCall(request, GetModelDefinedMetadatumArtifactContentResponse::builder)
                .logger(LOG, "getModelDefinedMetadatumArtifactContent")
                .serviceDetails(
                        "DataScience",
                        "GetModelDefinedMetadatumArtifactContent",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelDefinedMetadatumArtifactContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelDefinedMetadatumArtifactContentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("definedMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("range", request.getRange())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetModelDefinedMetadatumArtifactContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", GetModelDefinedMetadatumArtifactContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetModelDefinedMetadatumArtifactContentResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        GetModelDefinedMetadatumArtifactContentResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-disposition",
                        GetModelDefinedMetadatumArtifactContentResponse.Builder::contentDisposition)
                .handleResponseHeaderString(
                        "content-md5",
                        GetModelDefinedMetadatumArtifactContentResponse.Builder::contentMd5)
                .handleResponseHeaderDate(
                        "last-modified",
                        GetModelDefinedMetadatumArtifactContentResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public GetModelDeploymentResponse getModelDeployment(GetModelDeploymentRequest request) {

        Validate.notBlank(request.getModelDeploymentId(), "modelDeploymentId must not be blank");

        return clientCall(request, GetModelDeploymentResponse::builder)
                .logger(LOG, "getModelDeployment")
                .serviceDetails(
                        "DataScience",
                        "GetModelDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/GetModelDeployment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelDeploymentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelDeployments")
                .appendPathParam(request.getModelDeploymentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelDeployment.class,
                        GetModelDeploymentResponse.Builder::modelDeployment)
                .handleResponseHeaderString("etag", GetModelDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetModelProvenanceResponse getModelProvenance(GetModelProvenanceRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, GetModelProvenanceResponse::builder)
                .logger(LOG, "getModelProvenance")
                .serviceDetails(
                        "DataScience",
                        "GetModelProvenance",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/GetModelProvenance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelProvenanceRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("provenance")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelProvenance.class,
                        GetModelProvenanceResponse.Builder::modelProvenance)
                .handleResponseHeaderString("etag", GetModelProvenanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelProvenanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetModelVersionSetResponse getModelVersionSet(GetModelVersionSetRequest request) {

        Validate.notBlank(request.getModelVersionSetId(), "modelVersionSetId must not be blank");

        return clientCall(request, GetModelVersionSetResponse::builder)
                .logger(LOG, "getModelVersionSet")
                .serviceDetails(
                        "DataScience",
                        "GetModelVersionSet",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/GetModelVersionSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelVersionSetRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelVersionSets")
                .appendPathParam(request.getModelVersionSetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelVersionSet.class,
                        GetModelVersionSetResponse.Builder::modelVersionSet)
                .handleResponseHeaderString("etag", GetModelVersionSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelVersionSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetNotebookSessionResponse getNotebookSession(GetNotebookSessionRequest request) {

        Validate.notBlank(request.getNotebookSessionId(), "notebookSessionId must not be blank");

        return clientCall(request, GetNotebookSessionResponse::builder)
                .logger(LOG, "getNotebookSession")
                .serviceDetails(
                        "DataScience",
                        "GetNotebookSession",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/GetNotebookSession")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNotebookSessionRequest::builder)
                .basePath("/20190101")
                .appendPathParam("notebookSessions")
                .appendPathParam(request.getNotebookSessionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.NotebookSession.class,
                        GetNotebookSessionResponse.Builder::notebookSession)
                .handleResponseHeaderString("etag", GetNotebookSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNotebookSessionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPipelineResponse getPipeline(GetPipelineRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        return clientCall(request, GetPipelineResponse::builder)
                .logger(LOG, "getPipeline")
                .serviceDetails(
                        "DataScience",
                        "GetPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/GetPipeline")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPipelineRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.Pipeline.class,
                        GetPipelineResponse.Builder::pipeline)
                .handleResponseHeaderString("etag", GetPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPipelineRunResponse getPipelineRun(GetPipelineRunRequest request) {

        Validate.notBlank(request.getPipelineRunId(), "pipelineRunId must not be blank");

        return clientCall(request, GetPipelineRunResponse::builder)
                .logger(LOG, "getPipelineRun")
                .serviceDetails(
                        "DataScience",
                        "GetPipelineRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/GetPipelineRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPipelineRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelineRuns")
                .appendPathParam(request.getPipelineRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.PipelineRun.class,
                        GetPipelineRunResponse.Builder::pipelineRun)
                .handleResponseHeaderString("etag", GetPipelineRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPipelineRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetProjectResponse getProject(GetProjectRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, GetProjectResponse::builder)
                .logger(LOG, "getProject")
                .serviceDetails(
                        "DataScience",
                        "GetProject",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/GetProject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProjectRequest::builder)
                .basePath("/20190101")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.Project.class,
                        GetProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", GetProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetScheduleResponse getSchedule(GetScheduleRequest request) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, GetScheduleResponse::builder)
                .logger(LOG, "getSchedule")
                .serviceDetails(
                        "DataScience",
                        "GetSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/GetSchedule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduleRequest::builder)
                .basePath("/20190101")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.Schedule.class,
                        GetScheduleResponse.Builder::schedule)
                .handleResponseHeaderString("etag", GetScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetStepArtifactContentResponse getStepArtifactContent(
            GetStepArtifactContentRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        Validate.notBlank(request.getStepName(), "stepName must not be blank");

        return clientCall(request, GetStepArtifactContentResponse::builder)
                .logger(LOG, "getStepArtifactContent")
                .serviceDetails(
                        "DataScience",
                        "GetStepArtifactContent",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/GetStepArtifactContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStepArtifactContentRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20190101")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("steps")
                .appendPathParam(request.getStepName())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("range", request.getRange())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetStepArtifactContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetStepArtifactContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetStepArtifactContentResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", GetStepArtifactContentResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-md5", GetStepArtifactContentResponse.Builder::contentMd5)
                .handleResponseHeaderDate(
                        "last-modified", GetStepArtifactContentResponse.Builder::lastModified)
                .handleResponseHeaderString(
                        "content-disposition",
                        GetStepArtifactContentResponse.Builder::contentDisposition)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "DataScience",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20190101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public HeadJobArtifactResponse headJobArtifact(HeadJobArtifactRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, HeadJobArtifactResponse::builder)
                .logger(LOG, "headJobArtifact")
                .serviceDetails(
                        "DataScience",
                        "HeadJobArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/HeadJobArtifact")
                .method(com.oracle.bmc.http.client.Method.HEAD)
                .requestBuilder(HeadJobArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString("etag", HeadJobArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", HeadJobArtifactResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", HeadJobArtifactResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-md5", HeadJobArtifactResponse.Builder::contentMd5)
                .handleResponseHeaderString(
                        "content-disposition", HeadJobArtifactResponse.Builder::contentDisposition)
                .handleResponseHeaderDate(
                        "last-modified", HeadJobArtifactResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public HeadModelArtifactResponse headModelArtifact(HeadModelArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, HeadModelArtifactResponse::builder)
                .logger(LOG, "headModelArtifact")
                .serviceDetails(
                        "DataScience",
                        "HeadModelArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/HeadModelArtifact")
                .method(com.oracle.bmc.http.client.Method.HEAD)
                .requestBuilder(HeadModelArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString("etag", HeadModelArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", HeadModelArtifactResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", HeadModelArtifactResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-disposition",
                        HeadModelArtifactResponse.Builder::contentDisposition)
                .handleResponseHeaderString(
                        "content-md5", HeadModelArtifactResponse.Builder::contentMd5)
                .handleResponseHeaderDate(
                        "last-modified", HeadModelArtifactResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public HeadModelCustomMetadatumArtifactResponse headModelCustomMetadatumArtifact(
            HeadModelCustomMetadatumArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");

        return clientCall(request, HeadModelCustomMetadatumArtifactResponse::builder)
                .logger(LOG, "headModelCustomMetadatumArtifact")
                .serviceDetails(
                        "DataScience",
                        "HeadModelCustomMetadatumArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/HeadModelCustomMetadatumArtifact")
                .method(com.oracle.bmc.http.client.Method.HEAD)
                .requestBuilder(HeadModelCustomMetadatumArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("customMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "etag", HeadModelCustomMetadatumArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        HeadModelCustomMetadatumArtifactResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        HeadModelCustomMetadatumArtifactResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-disposition",
                        HeadModelCustomMetadatumArtifactResponse.Builder::contentDisposition)
                .handleResponseHeaderString(
                        "content-md5", HeadModelCustomMetadatumArtifactResponse.Builder::contentMd5)
                .handleResponseHeaderDate(
                        "last-modified",
                        HeadModelCustomMetadatumArtifactResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public HeadModelDefinedMetadatumArtifactResponse headModelDefinedMetadatumArtifact(
            HeadModelDefinedMetadatumArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");

        return clientCall(request, HeadModelDefinedMetadatumArtifactResponse::builder)
                .logger(LOG, "headModelDefinedMetadatumArtifact")
                .serviceDetails(
                        "DataScience",
                        "HeadModelDefinedMetadatumArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/HeadModelDefinedMetadatumArtifact")
                .method(com.oracle.bmc.http.client.Method.HEAD)
                .requestBuilder(HeadModelDefinedMetadatumArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("definedMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "etag", HeadModelDefinedMetadatumArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        HeadModelDefinedMetadatumArtifactResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        HeadModelDefinedMetadatumArtifactResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-disposition",
                        HeadModelDefinedMetadatumArtifactResponse.Builder::contentDisposition)
                .handleResponseHeaderString(
                        "content-md5",
                        HeadModelDefinedMetadatumArtifactResponse.Builder::contentMd5)
                .handleResponseHeaderDate(
                        "last-modified",
                        HeadModelDefinedMetadatumArtifactResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public HeadStepArtifactResponse headStepArtifact(HeadStepArtifactRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        Validate.notBlank(request.getStepName(), "stepName must not be blank");

        return clientCall(request, HeadStepArtifactResponse::builder)
                .logger(LOG, "headStepArtifact")
                .serviceDetails(
                        "DataScience",
                        "HeadStepArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/HeadStepArtifact")
                .method(com.oracle.bmc.http.client.Method.HEAD)
                .requestBuilder(HeadStepArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("steps")
                .appendPathParam(request.getStepName())
                .appendPathParam("artifact")
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString("etag", HeadStepArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", HeadStepArtifactResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", HeadStepArtifactResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-md5", HeadStepArtifactResponse.Builder::contentMd5)
                .handleResponseHeaderString(
                        "content-disposition", HeadStepArtifactResponse.Builder::contentDisposition)
                .handleResponseHeaderDate(
                        "last-modified", HeadStepArtifactResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public ImportModelArtifactResponse importModelArtifact(ImportModelArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(
                request.getImportModelArtifactDetails(), "importModelArtifactDetails is required");

        return clientCall(request, ImportModelArtifactResponse::builder)
                .logger(LOG, "importModelArtifact")
                .serviceDetails(
                        "DataScience",
                        "ImportModelArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/ImportModelArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportModelArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("importArtifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ImportModelArtifactResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ImportModelArtifactResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ListContainersResponse listContainers(ListContainersRequest request) {

        return clientCall(request, ListContainersResponse::builder)
                .logger(LOG, "listContainers")
                .serviceDetails(
                        "DataScience",
                        "ListContainers",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ContainerSummary/ListContainers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListContainersRequest::builder)
                .basePath("/20190101")
                .appendPathParam("containers")
                .appendQueryParam("isLatest", request.getIsLatest())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("containerName", request.getContainerName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("targetWorkload", request.getTargetWorkload())
                .appendEnumQueryParam("usageQueryParam", request.getUsageQueryParam())
                .appendQueryParam("tagQueryParam", request.getTagQueryParam())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ContainerSummary.class,
                        ListContainersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListContainersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListContainersResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListContainersResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDataSciencePrivateEndpointsResponse listDataSciencePrivateEndpoints(
            ListDataSciencePrivateEndpointsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDataSciencePrivateEndpointsResponse::builder)
                .logger(LOG, "listDataSciencePrivateEndpoints")
                .serviceDetails(
                        "DataScience",
                        "ListDataSciencePrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/ListDataSciencePrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataSciencePrivateEndpointsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("dataSciencePrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendEnumQueryParam(
                        "dataScienceResourceType", request.getDataScienceResourceType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.DataSciencePrivateEndpointSummary.class,
                        ListDataSciencePrivateEndpointsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListDataSciencePrivateEndpointsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDataSciencePrivateEndpointsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDataSciencePrivateEndpointsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListFastLaunchJobConfigsResponse listFastLaunchJobConfigs(
            ListFastLaunchJobConfigsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFastLaunchJobConfigsResponse::builder)
                .logger(LOG, "listFastLaunchJobConfigs")
                .serviceDetails(
                        "DataScience",
                        "ListFastLaunchJobConfigs",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/FastLaunchJobConfigSummary/ListFastLaunchJobConfigs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFastLaunchJobConfigsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("fastLaunchJobConfigs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.FastLaunchJobConfigSummary.class,
                        ListFastLaunchJobConfigsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListFastLaunchJobConfigsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListFastLaunchJobConfigsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListFastLaunchJobConfigsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListJobRunsResponse listJobRuns(ListJobRunsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJobRunsResponse::builder)
                .logger(LOG, "listJobRuns")
                .serviceDetails(
                        "DataScience",
                        "ListJobRuns",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRunSummary/ListJobRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobRunsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobRuns")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("jobId", request.getJobId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.JobRunSummary.class,
                        ListJobRunsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobRunsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListJobRunsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobRunsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListJobShapesResponse listJobShapes(ListJobShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJobShapesResponse::builder)
                .logger(LOG, "listJobShapes")
                .serviceDetails(
                        "DataScience",
                        "ListJobShapes",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobShapeSummary/ListJobShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobShapesRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.JobShapeSummary.class,
                        ListJobShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListJobShapesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobShapesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListJobsResponse listJobs(ListJobsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJobsResponse::builder)
                .logger(LOG, "listJobs")
                .serviceDetails(
                        "DataScience",
                        "ListJobs",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobSummary/ListJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.JobSummary.class,
                        ListJobsResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", ListJobsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListMlApplicationImplementationVersionsResponse listMlApplicationImplementationVersions(
            ListMlApplicationImplementationVersionsRequest request) {
        Objects.requireNonNull(
                request.getMlApplicationImplementationId(),
                "mlApplicationImplementationId is required");

        return clientCall(request, ListMlApplicationImplementationVersionsResponse::builder)
                .logger(LOG, "listMlApplicationImplementationVersions")
                .serviceDetails(
                        "DataScience",
                        "ListMlApplicationImplementationVersions",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementationVersion/ListMlApplicationImplementationVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMlApplicationImplementationVersionsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementationVersions")
                .appendQueryParam(
                        "mlApplicationImplementationId", request.getMlApplicationImplementationId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model
                                .MlApplicationImplementationVersionCollection.class,
                        ListMlApplicationImplementationVersionsResponse.Builder
                                ::mlApplicationImplementationVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMlApplicationImplementationVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMlApplicationImplementationVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMlApplicationImplementationsResponse listMlApplicationImplementations(
            ListMlApplicationImplementationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMlApplicationImplementationsResponse::builder)
                .logger(LOG, "listMlApplicationImplementations")
                .serviceDetails(
                        "DataScience",
                        "ListMlApplicationImplementations",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/ListMlApplicationImplementations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMlApplicationImplementationsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementations")
                .appendQueryParam(
                        "mlApplicationImplementationId", request.getMlApplicationImplementationId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("mlApplicationId", request.getMlApplicationId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationImplementationCollection
                                .class,
                        ListMlApplicationImplementationsResponse.Builder
                                ::mlApplicationImplementationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMlApplicationImplementationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMlApplicationImplementationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMlApplicationInstanceViewsResponse listMlApplicationInstanceViews(
            ListMlApplicationInstanceViewsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMlApplicationInstanceViewsResponse::builder)
                .logger(LOG, "listMlApplicationInstanceViews")
                .serviceDetails(
                        "DataScience",
                        "ListMlApplicationInstanceViews",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/ListMlApplicationInstanceViews")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMlApplicationInstanceViewsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstanceViews")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("mlApplicationId", request.getMlApplicationId())
                .appendQueryParam(
                        "mlApplicationImplementationId", request.getMlApplicationImplementationId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationInstanceViewCollection.class,
                        ListMlApplicationInstanceViewsResponse.Builder
                                ::mlApplicationInstanceViewCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMlApplicationInstanceViewsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMlApplicationInstanceViewsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMlApplicationInstancesResponse listMlApplicationInstances(
            ListMlApplicationInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMlApplicationInstancesResponse::builder)
                .logger(LOG, "listMlApplicationInstances")
                .serviceDetails(
                        "DataScience",
                        "ListMlApplicationInstances",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/ListMlApplicationInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMlApplicationInstancesRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("mlApplicationId", request.getMlApplicationId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationInstanceCollection.class,
                        ListMlApplicationInstancesResponse.Builder::mlApplicationInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMlApplicationInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMlApplicationInstancesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMlApplicationsResponse listMlApplications(ListMlApplicationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMlApplicationsResponse::builder)
                .logger(LOG, "listMlApplications")
                .serviceDetails(
                        "DataScience",
                        "ListMlApplications",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/ListMlApplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMlApplicationsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplications")
                .appendQueryParam("mlApplicationId", request.getMlApplicationId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationCollection.class,
                        ListMlApplicationsResponse.Builder::mlApplicationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMlApplicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMlApplicationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListModelDeploymentShapesResponse listModelDeploymentShapes(
            ListModelDeploymentShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListModelDeploymentShapesResponse::builder)
                .logger(LOG, "listModelDeploymentShapes")
                .serviceDetails(
                        "DataScience",
                        "ListModelDeploymentShapes",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeploymentShapeSummary/ListModelDeploymentShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModelDeploymentShapesRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelDeploymentShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary.class,
                        ListModelDeploymentShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelDeploymentShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListModelDeploymentShapesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelDeploymentShapesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListModelDeploymentsResponse listModelDeployments(ListModelDeploymentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListModelDeploymentsResponse::builder)
                .logger(LOG, "listModelDeployments")
                .serviceDetails(
                        "DataScience",
                        "ListModelDeployments",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeploymentSummary/ListModelDeployments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModelDeploymentsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelDeployments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ModelDeploymentSummary.class,
                        ListModelDeploymentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelDeploymentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListModelDeploymentsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelDeploymentsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListModelVersionSetsResponse listModelVersionSets(ListModelVersionSetsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListModelVersionSetsResponse::builder)
                .logger(LOG, "listModelVersionSets")
                .serviceDetails(
                        "DataScience",
                        "ListModelVersionSets",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSetSummary/ListModelVersionSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModelVersionSetsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelVersionSets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("category", request.getCategory())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ModelVersionSetSummary.class,
                        ListModelVersionSetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelVersionSetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListModelVersionSetsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelVersionSetsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListModelsResponse listModels(ListModelsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListModelsResponse::builder)
                .logger(LOG, "listModels")
                .serviceDetails(
                        "DataScience",
                        "ListModels",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelSummary/ListModels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModelsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("modelVersionSetName", request.getModelVersionSetName())
                .appendQueryParam("versionLabel", request.getVersionLabel())
                .appendEnumQueryParam("category", request.getCategory())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ModelSummary.class,
                        ListModelsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListModelsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListNotebookSessionShapesResponse listNotebookSessionShapes(
            ListNotebookSessionShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNotebookSessionShapesResponse::builder)
                .logger(LOG, "listNotebookSessionShapes")
                .serviceDetails(
                        "DataScience",
                        "ListNotebookSessionShapes",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSessionShapeSummary/ListNotebookSessionShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNotebookSessionShapesRequest::builder)
                .basePath("/20190101")
                .appendPathParam("notebookSessionShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.NotebookSessionShapeSummary.class,
                        ListNotebookSessionShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListNotebookSessionShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListNotebookSessionShapesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListNotebookSessionShapesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListNotebookSessionsResponse listNotebookSessions(ListNotebookSessionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNotebookSessionsResponse::builder)
                .logger(LOG, "listNotebookSessions")
                .serviceDetails(
                        "DataScience",
                        "ListNotebookSessions",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSessionSummary/ListNotebookSessions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNotebookSessionsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("notebookSessions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.NotebookSessionSummary.class,
                        ListNotebookSessionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListNotebookSessionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListNotebookSessionsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListNotebookSessionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPipelineRunsResponse listPipelineRuns(ListPipelineRunsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPipelineRunsResponse::builder)
                .logger(LOG, "listPipelineRuns")
                .serviceDetails(
                        "DataScience",
                        "ListPipelineRuns",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/ListPipelineRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPipelineRunsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelineRuns")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("pipelineId", request.getPipelineId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.PipelineRunSummary.class,
                        ListPipelineRunsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPipelineRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelineRunsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPipelineRunsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPipelinesResponse::builder)
                .logger(LOG, "listPipelines")
                .serviceDetails(
                        "DataScience",
                        "ListPipelines",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/ListPipelines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPipelinesRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelines")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.PipelineSummary.class,
                        ListPipelinesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelinesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPipelinesResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListProjectsResponse listProjects(ListProjectsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProjectsResponse::builder)
                .logger(LOG, "listProjects")
                .serviceDetails(
                        "DataScience",
                        "ListProjects",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ProjectSummary/ListProjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProjectsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("projects")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ProjectSummary.class,
                        ListProjectsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListProjectsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListProjectsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListProjectsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSchedulesResponse listSchedules(ListSchedulesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSchedulesResponse::builder)
                .logger(LOG, "listSchedules")
                .serviceDetails(
                        "DataScience",
                        "ListSchedules",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/ListSchedules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchedulesRequest::builder)
                .basePath("/20190101")
                .appendPathParam("schedules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("projectId", request.getProjectId())
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ScheduleSummary.class,
                        ListSchedulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchedulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchedulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "DataScience",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestErrorsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "DataScience",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequest/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestLogsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "DataScience",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20190101")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("operationType", request.getOperationType())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.datascience.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PutMlApplicationPackageResponse putMlApplicationPackage(
            PutMlApplicationPackageRequest request) {

        Validate.notBlank(
                request.getMlApplicationImplementationId(),
                "mlApplicationImplementationId must not be blank");
        Objects.requireNonNull(
                request.getPutMlApplicationPackage(), "putMlApplicationPackage is required");

        return clientCall(request, PutMlApplicationPackageResponse::builder)
                .logger(LOG, "putMlApplicationPackage")
                .serviceDetails(
                        "DataScience",
                        "PutMlApplicationPackage",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/PutMlApplicationPackage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutMlApplicationPackageRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementations")
                .appendPathParam(request.getMlApplicationImplementationId())
                .appendPathParam("mlApplicationPackage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("content-disposition", request.getContentDisposition())
                .appendHeader("opc-ml-app-package-args", request.getOpcMlAppPackageArgs())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PutMlApplicationPackageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PutMlApplicationPackageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RecoverMlApplicationInstanceViewResponse recoverMlApplicationInstanceView(
            RecoverMlApplicationInstanceViewRequest request) {

        Validate.notBlank(
                request.getMlApplicationInstanceViewId(),
                "mlApplicationInstanceViewId must not be blank");

        return clientCall(request, RecoverMlApplicationInstanceViewResponse::builder)
                .logger(LOG, "recoverMlApplicationInstanceView")
                .serviceDetails(
                        "DataScience",
                        "RecoverMlApplicationInstanceView",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/RecoverMlApplicationInstanceView")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RecoverMlApplicationInstanceViewRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstanceViews")
                .appendPathParam(request.getMlApplicationInstanceViewId())
                .appendPathParam("actions")
                .appendPathParam("recover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RecoverMlApplicationInstanceViewResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RecoverMlApplicationInstanceViewResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RegisterModelArtifactReferenceResponse registerModelArtifactReference(
            RegisterModelArtifactReferenceRequest request) {
        Objects.requireNonNull(
                request.getRegisterModelArtifactReferenceDetails(),
                "registerModelArtifactReferenceDetails is required");

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, RegisterModelArtifactReferenceResponse::builder)
                .logger(LOG, "registerModelArtifactReference")
                .serviceDetails(
                        "DataScience",
                        "RegisterModelArtifactReference",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/RegisterModelArtifactReferenceDetails/RegisterModelArtifactReference")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RegisterModelArtifactReferenceRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("registerArtifactReference")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RegisterModelArtifactReferenceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RegisterModelArtifactReferenceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RestoreArchivedModelArtifactResponse restoreArchivedModelArtifact(
            RestoreArchivedModelArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, RestoreArchivedModelArtifactResponse::builder)
                .logger(LOG, "restoreArchivedModelArtifact")
                .serviceDetails(
                        "DataScience",
                        "RestoreArchivedModelArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/RestoreArchivedModelArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreArchivedModelArtifactRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .appendQueryParam(
                        "restoreModelForHoursSpecified", request.getRestoreModelForHoursSpecified())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RestoreArchivedModelArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public TriggerMlApplicationInstanceFlowResponse triggerMlApplicationInstanceFlow(
            TriggerMlApplicationInstanceFlowRequest request) {
        Objects.requireNonNull(
                request.getTriggerMlApplicationInstanceFlowDetails(),
                "triggerMlApplicationInstanceFlowDetails is required");

        Validate.notBlank(
                request.getMlApplicationInstanceId(), "mlApplicationInstanceId must not be blank");

        return clientCall(request, TriggerMlApplicationInstanceFlowResponse::builder)
                .logger(LOG, "triggerMlApplicationInstanceFlow")
                .serviceDetails(
                        "DataScience",
                        "TriggerMlApplicationInstanceFlow",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/TriggerMlApplicationInstanceFlow")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TriggerMlApplicationInstanceFlowRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstances")
                .appendPathParam(request.getMlApplicationInstanceId())
                .appendPathParam("actions")
                .appendPathParam("trigger")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TriggerMlApplicationInstanceFlowResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        TriggerMlApplicationInstanceFlowResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public TriggerMlApplicationInstanceViewFlowResponse triggerMlApplicationInstanceViewFlow(
            TriggerMlApplicationInstanceViewFlowRequest request) {
        Objects.requireNonNull(
                request.getTriggerMlApplicationInstanceViewFlowDetails(),
                "triggerMlApplicationInstanceViewFlowDetails is required");

        Validate.notBlank(
                request.getMlApplicationInstanceViewId(),
                "mlApplicationInstanceViewId must not be blank");

        return clientCall(request, TriggerMlApplicationInstanceViewFlowResponse::builder)
                .logger(LOG, "triggerMlApplicationInstanceViewFlow")
                .serviceDetails(
                        "DataScience",
                        "TriggerMlApplicationInstanceViewFlow",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/TriggerMlApplicationInstanceViewFlow")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TriggerMlApplicationInstanceViewFlowRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstanceViews")
                .appendPathParam(request.getMlApplicationInstanceViewId())
                .appendPathParam("actions")
                .appendPathParam("trigger")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TriggerMlApplicationInstanceViewFlowResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        TriggerMlApplicationInstanceViewFlowResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDataSciencePrivateEndpointResponse updateDataSciencePrivateEndpoint(
            UpdateDataSciencePrivateEndpointRequest request) {

        Validate.notBlank(
                request.getDataSciencePrivateEndpointId(),
                "dataSciencePrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataSciencePrivateEndpointDetails(),
                "updateDataSciencePrivateEndpointDetails is required");

        return clientCall(request, UpdateDataSciencePrivateEndpointResponse::builder)
                .logger(LOG, "updateDataSciencePrivateEndpoint")
                .serviceDetails(
                        "DataScience",
                        "UpdateDataSciencePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/DataSciencePrivateEndpoint/UpdateDataSciencePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataSciencePrivateEndpointRequest::builder)
                .basePath("/20190101")
                .appendPathParam("dataSciencePrivateEndpoints")
                .appendPathParam(request.getDataSciencePrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.DataSciencePrivateEndpoint.class,
                        UpdateDataSciencePrivateEndpointResponse.Builder
                                ::dataSciencePrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", UpdateDataSciencePrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDataSciencePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDataSciencePrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateJobResponse updateJob(UpdateJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");
        Objects.requireNonNull(request.getUpdateJobDetails(), "updateJobDetails is required");

        return clientCall(request, UpdateJobResponse::builder)
                .logger(LOG, "updateJob")
                .serviceDetails(
                        "DataScience",
                        "UpdateJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Job/UpdateJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJobRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Job.class, UpdateJobResponse.Builder::job)
                .handleResponseHeaderString("etag", UpdateJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateJobRunResponse updateJobRun(UpdateJobRunRequest request) {

        Validate.notBlank(request.getJobRunId(), "jobRunId must not be blank");
        Objects.requireNonNull(request.getUpdateJobRunDetails(), "updateJobRunDetails is required");

        return clientCall(request, UpdateJobRunResponse::builder)
                .logger(LOG, "updateJobRun")
                .serviceDetails(
                        "DataScience",
                        "UpdateJobRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/JobRun/UpdateJobRun")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJobRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("jobRuns")
                .appendPathParam(request.getJobRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.JobRun.class,
                        UpdateJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("etag", UpdateJobRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMlApplicationResponse updateMlApplication(UpdateMlApplicationRequest request) {

        Validate.notBlank(request.getMlApplicationId(), "mlApplicationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMlApplicationDetails(), "updateMlApplicationDetails is required");

        return clientCall(request, UpdateMlApplicationResponse::builder)
                .logger(LOG, "updateMlApplication")
                .serviceDetails(
                        "DataScience",
                        "UpdateMlApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplication/UpdateMlApplication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMlApplicationRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplications")
                .appendPathParam(request.getMlApplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplication.class,
                        UpdateMlApplicationResponse.Builder::mlApplication)
                .handleResponseHeaderString("etag", UpdateMlApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMlApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMlApplicationImplementationResponse updateMlApplicationImplementation(
            UpdateMlApplicationImplementationRequest request) {

        Validate.notBlank(
                request.getMlApplicationImplementationId(),
                "mlApplicationImplementationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMlApplicationImplementationDetails(),
                "updateMlApplicationImplementationDetails is required");

        return clientCall(request, UpdateMlApplicationImplementationResponse::builder)
                .logger(LOG, "updateMlApplicationImplementation")
                .serviceDetails(
                        "DataScience",
                        "UpdateMlApplicationImplementation",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementation/UpdateMlApplicationImplementation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMlApplicationImplementationRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementations")
                .appendPathParam(request.getMlApplicationImplementationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMlApplicationImplementationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateMlApplicationImplementationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMlApplicationImplementationVersionResponse
            updateMlApplicationImplementationVersion(
                    UpdateMlApplicationImplementationVersionRequest request) {

        Validate.notBlank(
                request.getMlApplicationImplementationVersionId(),
                "mlApplicationImplementationVersionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMlApplicationImplementationVersionDetails(),
                "updateMlApplicationImplementationVersionDetails is required");

        return clientCall(request, UpdateMlApplicationImplementationVersionResponse::builder)
                .logger(LOG, "updateMlApplicationImplementationVersion")
                .serviceDetails(
                        "DataScience",
                        "UpdateMlApplicationImplementationVersion",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationImplementationVersion/UpdateMlApplicationImplementationVersion")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMlApplicationImplementationVersionRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationImplementationVersions")
                .appendPathParam(request.getMlApplicationImplementationVersionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationImplementationVersion.class,
                        UpdateMlApplicationImplementationVersionResponse.Builder
                                ::mlApplicationImplementationVersion)
                .handleResponseHeaderString(
                        "etag", UpdateMlApplicationImplementationVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateMlApplicationImplementationVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMlApplicationInstanceResponse updateMlApplicationInstance(
            UpdateMlApplicationInstanceRequest request) {

        Validate.notBlank(
                request.getMlApplicationInstanceId(), "mlApplicationInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMlApplicationInstanceDetails(),
                "updateMlApplicationInstanceDetails is required");

        return clientCall(request, UpdateMlApplicationInstanceResponse::builder)
                .logger(LOG, "updateMlApplicationInstance")
                .serviceDetails(
                        "DataScience",
                        "UpdateMlApplicationInstance",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstance/UpdateMlApplicationInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMlApplicationInstanceRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstances")
                .appendPathParam(request.getMlApplicationInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMlApplicationInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMlApplicationInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMlApplicationInstanceViewResponse updateMlApplicationInstanceView(
            UpdateMlApplicationInstanceViewRequest request) {

        Validate.notBlank(
                request.getMlApplicationInstanceViewId(),
                "mlApplicationInstanceViewId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMlApplicationInstanceViewDetails(),
                "updateMlApplicationInstanceViewDetails is required");

        return clientCall(request, UpdateMlApplicationInstanceViewResponse::builder)
                .logger(LOG, "updateMlApplicationInstanceView")
                .serviceDetails(
                        "DataScience",
                        "UpdateMlApplicationInstanceView",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/MlApplicationInstanceView/UpdateMlApplicationInstanceView")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMlApplicationInstanceViewRequest::builder)
                .basePath("/20190101")
                .appendPathParam("mlApplicationInstanceViews")
                .appendPathParam(request.getMlApplicationInstanceViewId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.MlApplicationInstanceView.class,
                        UpdateMlApplicationInstanceViewResponse.Builder::mlApplicationInstanceView)
                .handleResponseHeaderString(
                        "etag", UpdateMlApplicationInstanceViewResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateMlApplicationInstanceViewResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateModelResponse updateModel(UpdateModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(request.getUpdateModelDetails(), "updateModelDetails is required");

        return clientCall(request, UpdateModelResponse::builder)
                .logger(LOG, "updateModel")
                .serviceDetails(
                        "DataScience",
                        "UpdateModel",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        UpdateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", UpdateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateModelCustomMetadatumArtifactResponse updateModelCustomMetadatumArtifact(
            UpdateModelCustomMetadatumArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");
        Objects.requireNonNull(
                request.getModelCustomMetadatumArtifact(),
                "modelCustomMetadatumArtifact is required");

        return clientCall(request, UpdateModelCustomMetadatumArtifactResponse::builder)
                .logger(LOG, "updateModelCustomMetadatumArtifact")
                .serviceDetails(
                        "DataScience",
                        "UpdateModelCustomMetadatumArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModelCustomMetadatumArtifact")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelCustomMetadatumArtifactRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("customMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("content-disposition", request.getContentDisposition())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "etag", UpdateModelCustomMetadatumArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateModelCustomMetadatumArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateModelDefinedMetadatumArtifactResponse updateModelDefinedMetadatumArtifact(
            UpdateModelDefinedMetadatumArtifactRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        Validate.notBlank(request.getMetadatumKeyName(), "metadatumKeyName must not be blank");
        Objects.requireNonNull(
                request.getModelDefinedMetadatumArtifact(),
                "modelDefinedMetadatumArtifact is required");

        return clientCall(request, UpdateModelDefinedMetadatumArtifactResponse::builder)
                .logger(LOG, "updateModelDefinedMetadatumArtifact")
                .serviceDetails(
                        "DataScience",
                        "UpdateModelDefinedMetadatumArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModelDefinedMetadatumArtifact")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelDefinedMetadatumArtifactRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("definedMetadata")
                .appendPathParam(request.getMetadatumKeyName())
                .appendPathParam("artifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("content-disposition", request.getContentDisposition())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "etag", UpdateModelDefinedMetadatumArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateModelDefinedMetadatumArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateModelDeploymentResponse updateModelDeployment(
            UpdateModelDeploymentRequest request) {

        Validate.notBlank(request.getModelDeploymentId(), "modelDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateModelDeploymentDetails(),
                "updateModelDeploymentDetails is required");

        return clientCall(request, UpdateModelDeploymentResponse::builder)
                .logger(LOG, "updateModelDeployment")
                .serviceDetails(
                        "DataScience",
                        "UpdateModelDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelDeployment/UpdateModelDeployment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelDeploymentRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelDeployments")
                .appendPathParam(request.getModelDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateModelDeploymentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateModelProvenanceResponse updateModelProvenance(
            UpdateModelProvenanceRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateModelProvenanceDetails(),
                "updateModelProvenanceDetails is required");

        return clientCall(request, UpdateModelProvenanceResponse::builder)
                .logger(LOG, "updateModelProvenance")
                .serviceDetails(
                        "DataScience",
                        "UpdateModelProvenance",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Model/UpdateModelProvenance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelProvenanceRequest::builder)
                .basePath("/20190101")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("provenance")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelProvenance.class,
                        UpdateModelProvenanceResponse.Builder::modelProvenance)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelProvenanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateModelProvenanceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateModelVersionSetResponse updateModelVersionSet(
            UpdateModelVersionSetRequest request) {

        Validate.notBlank(request.getModelVersionSetId(), "modelVersionSetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateModelVersionSetDetails(),
                "updateModelVersionSetDetails is required");

        return clientCall(request, UpdateModelVersionSetResponse::builder)
                .logger(LOG, "updateModelVersionSet")
                .serviceDetails(
                        "DataScience",
                        "UpdateModelVersionSet",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/ModelVersionSet/UpdateModelVersionSet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelVersionSetRequest::builder)
                .basePath("/20190101")
                .appendPathParam("modelVersionSets")
                .appendPathParam(request.getModelVersionSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelVersionSet.class,
                        UpdateModelVersionSetResponse.Builder::modelVersionSet)
                .handleResponseHeaderString("etag", UpdateModelVersionSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelVersionSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateNotebookSessionResponse updateNotebookSession(
            UpdateNotebookSessionRequest request) {

        Validate.notBlank(request.getNotebookSessionId(), "notebookSessionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNotebookSessionDetails(),
                "updateNotebookSessionDetails is required");

        return clientCall(request, UpdateNotebookSessionResponse::builder)
                .logger(LOG, "updateNotebookSession")
                .serviceDetails(
                        "DataScience",
                        "UpdateNotebookSession",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/NotebookSession/UpdateNotebookSession")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNotebookSessionRequest::builder)
                .basePath("/20190101")
                .appendPathParam("notebookSessions")
                .appendPathParam(request.getNotebookSessionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.NotebookSession.class,
                        UpdateNotebookSessionResponse.Builder::notebookSession)
                .handleResponseHeaderString("etag", UpdateNotebookSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNotebookSessionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePipelineResponse updatePipeline(UpdatePipelineRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePipelineDetails(), "updatePipelineDetails is required");

        return clientCall(request, UpdatePipelineResponse::builder)
                .logger(LOG, "updatePipeline")
                .serviceDetails(
                        "DataScience",
                        "UpdatePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Pipeline/UpdatePipeline")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePipelineRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Pipeline.class,
                        UpdatePipelineResponse.Builder::pipeline)
                .handleResponseHeaderString("etag", UpdatePipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePipelineRunResponse updatePipelineRun(UpdatePipelineRunRequest request) {

        Validate.notBlank(request.getPipelineRunId(), "pipelineRunId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePipelineRunDetails(), "updatePipelineRunDetails is required");

        return clientCall(request, UpdatePipelineRunResponse::builder)
                .logger(LOG, "updatePipelineRun")
                .serviceDetails(
                        "DataScience",
                        "UpdatePipelineRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/PipelineRun/UpdatePipelineRun")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePipelineRunRequest::builder)
                .basePath("/20190101")
                .appendPathParam("pipelineRuns")
                .appendPathParam(request.getPipelineRunId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.PipelineRun.class,
                        UpdatePipelineRunResponse.Builder::pipelineRun)
                .handleResponseHeaderString("etag", UpdatePipelineRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePipelineRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProjectDetails(), "updateProjectDetails is required");

        return clientCall(request, UpdateProjectResponse::builder)
                .logger(LOG, "updateProject")
                .serviceDetails(
                        "DataScience",
                        "UpdateProject",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Project/UpdateProject")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProjectRequest::builder)
                .basePath("/20190101")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Project.class,
                        UpdateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", UpdateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateScheduleResponse updateSchedule(UpdateScheduleRequest request) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateScheduleDetails(), "updateScheduleDetails is required");

        return clientCall(request, UpdateScheduleResponse::builder)
                .logger(LOG, "updateSchedule")
                .serviceDetails(
                        "DataScience",
                        "UpdateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-science/20190101/Schedule/UpdateSchedule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScheduleRequest::builder)
                .basePath("/20190101")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateScheduleResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DataScienceWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DataSciencePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataScienceClient(
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
    public DataScienceClient(
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
    public DataScienceClient(
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
    public DataScienceClient(
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
    public DataScienceClient(
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
    public DataScienceClient(
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
    public DataScienceClient(
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
    public DataScienceClient(
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
