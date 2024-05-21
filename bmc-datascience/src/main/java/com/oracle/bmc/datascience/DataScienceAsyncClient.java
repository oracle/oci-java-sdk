/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DataScience service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class DataScienceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DataScienceAsync {
    /** Service instance for DataScience. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATASCIENCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datascience.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataScienceAsyncClient.class);

    DataScienceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    DataScienceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DataScienceAsyncClient",
                            "getJobArtifactContent,getModelArtifactContent,getStepArtifactContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataScienceAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "datascience";
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
        public DataScienceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataScienceAsyncClient(
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
    public java.util.concurrent.Future<ActivateModelResponse> activateModel(
            ActivateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ActivateModelRequest, ActivateModelResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        ActivateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", ActivateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ActivateModelDeploymentResponse> activateModelDeployment(
            ActivateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ActivateNotebookSessionResponse> activateNotebookSession(
            ActivateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelJobRunResponse> cancelJobRun(
            CancelJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CancelJobRunRequest, CancelJobRunResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", CancelJobRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelPipelineRunResponse> cancelPipelineRun(
            CancelPipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelPipelineRunRequest, CancelPipelineRunResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", CancelPipelineRunResponse.Builder::opcRequestId)
                .callAsync(handler);
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDataSciencePrivateEndpointCompartmentResponse>
            changeDataSciencePrivateEndpointCompartment(
                    ChangeDataSciencePrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDataSciencePrivateEndpointCompartmentRequest,
                                    ChangeDataSciencePrivateEndpointCompartmentResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDataSciencePrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDataSciencePrivateEndpointCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeJobCompartmentResponse> changeJobCompartment(
            ChangeJobCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeJobRunCompartmentResponse> changeJobRunCompartment(
            ChangeJobRunCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeModelCompartmentResponse> changeModelCompartment(
            ChangeModelCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeModelDeploymentCompartmentResponse>
            changeModelDeploymentCompartment(
                    ChangeModelDeploymentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeModelDeploymentCompartmentRequest,
                                    ChangeModelDeploymentCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeModelVersionSetCompartmentResponse>
            changeModelVersionSetCompartment(
                    ChangeModelVersionSetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeModelVersionSetCompartmentRequest,
                                    ChangeModelVersionSetCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeNotebookSessionCompartmentResponse>
            changeNotebookSessionCompartment(
                    ChangeNotebookSessionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNotebookSessionCompartmentRequest,
                                    ChangeNotebookSessionCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangePipelineCompartmentResponse> changePipelineCompartment(
            ChangePipelineCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangePipelineCompartmentRequest, ChangePipelineCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangePipelineRunCompartmentResponse>
            changePipelineRunCompartment(
                    ChangePipelineRunCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePipelineRunCompartmentRequest,
                                    ChangePipelineRunCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeProjectCompartmentResponse> changeProjectCompartment(
            ChangeProjectCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSciencePrivateEndpointResponse>
            createDataSciencePrivateEndpoint(
                    CreateDataSciencePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataSciencePrivateEndpointRequest,
                                    CreateDataSciencePrivateEndpointResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Job.class, CreateJobResponse.Builder::job)
                .handleResponseHeaderString("etag", CreateJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateJobArtifactResponse> createJobArtifact(
            CreateJobArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateJobArtifactRequest, CreateJobArtifactResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateJobRunResponse> createJobRun(
            CreateJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRunRequest, CreateJobRunResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.JobRun.class,
                        CreateJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("etag", CreateJobRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResponse> createModel(
            CreateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        CreateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", CreateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateModelArtifactResponse> createModelArtifact(
            CreateModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelArtifactRequest, CreateModelArtifactResponse>
                    handler) {

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
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString("etag", CreateModelArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelArtifactResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateModelDeploymentResponse> createModelDeployment(
            CreateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelDeploymentRequest, CreateModelDeploymentResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateModelProvenanceResponse> createModelProvenance(
            CreateModelProvenanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelProvenanceRequest, CreateModelProvenanceResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelProvenance.class,
                        CreateModelProvenanceResponse.Builder::modelProvenance)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelProvenanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateModelProvenanceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateModelVersionSetResponse> createModelVersionSet(
            CreateModelVersionSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateModelVersionSetRequest, CreateModelVersionSetResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelVersionSet.class,
                        CreateModelVersionSetResponse.Builder::modelVersionSet)
                .handleResponseHeaderString("etag", CreateModelVersionSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelVersionSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNotebookSessionResponse> createNotebookSession(
            CreateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNotebookSessionRequest, CreateNotebookSessionResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResponse> createPipeline(
            CreatePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineRequest, CreatePipelineResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Pipeline.class,
                        CreatePipelineResponse.Builder::pipeline)
                .handleResponseHeaderString("etag", CreatePipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineRunResponse> createPipelineRun(
            CreatePipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineRunRequest, CreatePipelineRunResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.PipelineRun.class,
                        CreatePipelineRunResponse.Builder::pipelineRun)
                .handleResponseHeaderString("etag", CreatePipelineRunResponse.Builder::etag)
                .handleResponseHeaderString("location", CreatePipelineRunResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePipelineRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Project.class,
                        CreateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", CreateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStepArtifactResponse> createStepArtifact(
            CreateStepArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateStepArtifactRequest, CreateStepArtifactResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeactivateModelResponse> deactivateModel(
            DeactivateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateModelRequest, DeactivateModelResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        DeactivateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", DeactivateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeactivateModelDeploymentResponse> deactivateModelDeployment(
            DeactivateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateModelDeploymentRequest, DeactivateModelDeploymentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeactivateNotebookSessionResponse> deactivateNotebookSession(
            DeactivateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeactivateNotebookSessionRequest, DeactivateNotebookSessionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSciencePrivateEndpointResponse>
            deleteDataSciencePrivateEndpoint(
                    DeleteDataSciencePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDataSciencePrivateEndpointRequest,
                                    DeleteDataSciencePrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobRunResponse> deleteJobRun(
            DeleteJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRunRequest, DeleteJobRunResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJobRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResponse> deleteModel(
            DeleteModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelDeploymentResponse> deleteModelDeployment(
            DeleteModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteModelDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteModelDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelVersionSetResponse> deleteModelVersionSet(
            DeleteModelVersionSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteModelVersionSetRequest, DeleteModelVersionSetResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteModelVersionSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteModelVersionSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotebookSessionResponse> deleteNotebookSession(
            DeleteNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNotebookSessionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNotebookSessionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResponse> deletePipeline(
            DeletePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineRequest, DeletePipelineResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineRunResponse> deletePipelineRun(
            DeletePipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineRunRequest, DeletePipelineRunResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportModelArtifactResponse> exportModelArtifact(
            ExportModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportModelArtifactRequest, ExportModelArtifactResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ExportModelArtifactResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExportModelArtifactResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataSciencePrivateEndpointResponse>
            getDataSciencePrivateEndpoint(
                    GetDataSciencePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDataSciencePrivateEndpointRequest,
                                    GetDataSciencePrivateEndpointResponse>
                            handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.DataSciencePrivateEndpoint.class,
                        GetDataSciencePrivateEndpointResponse.Builder::dataSciencePrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", GetDataSciencePrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDataSciencePrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler) {

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
                .handleBody(com.oracle.bmc.datascience.model.Job.class, GetJobResponse.Builder::job)
                .handleResponseHeaderString("etag", GetJobResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobArtifactContentResponse> getJobArtifactContent(
            GetJobArtifactContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobArtifactContentRequest, GetJobArtifactContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobRunResponse> getJobRun(
            GetJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.JobRun.class,
                        GetJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("etag", GetJobRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetModelResponse> getModel(
            GetModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        GetModelResponse.Builder::model)
                .handleResponseHeaderString("etag", GetModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetModelArtifactContentResponse> getModelArtifactContent(
            GetModelArtifactContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelArtifactContentRequest, GetModelArtifactContentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetModelDeploymentResponse> getModelDeployment(
            GetModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelDeploymentRequest, GetModelDeploymentResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelDeployment.class,
                        GetModelDeploymentResponse.Builder::modelDeployment)
                .handleResponseHeaderString("etag", GetModelDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetModelProvenanceResponse> getModelProvenance(
            GetModelProvenanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelProvenanceRequest, GetModelProvenanceResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelProvenance.class,
                        GetModelProvenanceResponse.Builder::modelProvenance)
                .handleResponseHeaderString("etag", GetModelProvenanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelProvenanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetModelVersionSetResponse> getModelVersionSet(
            GetModelVersionSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetModelVersionSetRequest, GetModelVersionSetResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelVersionSet.class,
                        GetModelVersionSetResponse.Builder::modelVersionSet)
                .handleResponseHeaderString("etag", GetModelVersionSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelVersionSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNotebookSessionResponse> getNotebookSession(
            GetNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNotebookSessionRequest, GetNotebookSessionResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.NotebookSession.class,
                        GetNotebookSessionResponse.Builder::notebookSession)
                .handleResponseHeaderString("etag", GetNotebookSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNotebookSessionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineResponse> getPipeline(
            GetPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPipelineRequest, GetPipelineResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.Pipeline.class,
                        GetPipelineResponse.Builder::pipeline)
                .handleResponseHeaderString("etag", GetPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineRunResponse> getPipelineRun(
            GetPipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPipelineRunRequest, GetPipelineRunResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.PipelineRun.class,
                        GetPipelineRunResponse.Builder::pipelineRun)
                .handleResponseHeaderString("etag", GetPipelineRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPipelineRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.Project.class,
                        GetProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", GetProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStepArtifactContentResponse> getStepArtifactContent(
            GetStepArtifactContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStepArtifactContentRequest, GetStepArtifactContentResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.datascience.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<HeadJobArtifactResponse> headJobArtifact(
            HeadJobArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadJobArtifactRequest, HeadJobArtifactResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<HeadModelArtifactResponse> headModelArtifact(
            HeadModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadModelArtifactRequest, HeadModelArtifactResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<HeadStepArtifactResponse> headStepArtifact(
            HeadStepArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            HeadStepArtifactRequest, HeadStepArtifactResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImportModelArtifactResponse> importModelArtifact(
            ImportModelArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportModelArtifactRequest, ImportModelArtifactResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataSciencePrivateEndpointsResponse>
            listDataSciencePrivateEndpoints(
                    ListDataSciencePrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDataSciencePrivateEndpointsRequest,
                                    ListDataSciencePrivateEndpointsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFastLaunchJobConfigsResponse> listFastLaunchJobConfigs(
            ListFastLaunchJobConfigsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.FastLaunchJobConfigSummary.class,
                        ListFastLaunchJobConfigsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListFastLaunchJobConfigsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListFastLaunchJobConfigsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListFastLaunchJobConfigsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResponse> listJobRuns(
            ListJobRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.JobRunSummary.class,
                        ListJobRunsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobRunsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListJobRunsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobRunsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobShapesResponse> listJobShapes(
            ListJobShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobShapesRequest, ListJobShapesResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.JobShapeSummary.class,
                        ListJobShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListJobShapesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobShapesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.JobSummary.class,
                        ListJobsResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", ListJobsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListModelDeploymentShapesResponse> listModelDeploymentShapes(
            ListModelDeploymentShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ModelDeploymentShapeSummary.class,
                        ListModelDeploymentShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelDeploymentShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListModelDeploymentShapesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelDeploymentShapesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListModelDeploymentsResponse> listModelDeployments(
            ListModelDeploymentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelDeploymentsRequest, ListModelDeploymentsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ModelDeploymentSummary.class,
                        ListModelDeploymentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelDeploymentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListModelDeploymentsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelDeploymentsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListModelVersionSetsResponse> listModelVersionSets(
            ListModelVersionSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListModelVersionSetsRequest, ListModelVersionSetsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ModelVersionSetSummary.class,
                        ListModelVersionSetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelVersionSetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListModelVersionSetsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelVersionSetsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListModelsResponse> listModels(
            ListModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ModelSummary.class,
                        ListModelsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListModelsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookSessionShapesResponse> listNotebookSessionShapes(
            ListNotebookSessionShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.NotebookSessionShapeSummary.class,
                        ListNotebookSessionShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListNotebookSessionShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListNotebookSessionShapesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListNotebookSessionShapesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNotebookSessionsResponse> listNotebookSessions(
            ListNotebookSessionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNotebookSessionsRequest, ListNotebookSessionsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.NotebookSessionSummary.class,
                        ListNotebookSessionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListNotebookSessionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListNotebookSessionsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListNotebookSessionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPipelineRunsResponse> listPipelineRuns(
            ListPipelineRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPipelineRunsRequest, ListPipelineRunsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.PipelineRunSummary.class,
                        ListPipelineRunsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPipelineRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelineRunsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPipelineRunsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResponse> listPipelines(
            ListPipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPipelinesRequest, ListPipelinesResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.PipelineSummary.class,
                        ListPipelinesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelinesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPipelinesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler) {
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.ProjectSummary.class,
                        ListProjectsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListProjectsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListProjectsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListProjectsResponse.Builder::opcRequestId)
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestErrorsResponse.Builder::opcPrevPage)
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestLogsResponse.Builder::opcPrevPage)
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
                .handleBodyList(
                        com.oracle.bmc.datascience.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSciencePrivateEndpointResponse>
            updateDataSciencePrivateEndpoint(
                    UpdateDataSciencePrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDataSciencePrivateEndpointRequest,
                                    UpdateDataSciencePrivateEndpointResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Job.class, UpdateJobResponse.Builder::job)
                .handleResponseHeaderString("etag", UpdateJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobRunResponse> updateJobRun(
            UpdateJobRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRunRequest, UpdateJobRunResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.JobRun.class,
                        UpdateJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("etag", UpdateJobRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResponse> updateModel(
            UpdateModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Model.class,
                        UpdateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", UpdateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelDeploymentResponse> updateModelDeployment(
            UpdateModelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateModelDeploymentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelProvenanceResponse> updateModelProvenance(
            UpdateModelProvenanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelProvenance.class,
                        UpdateModelProvenanceResponse.Builder::modelProvenance)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelProvenanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateModelProvenanceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelVersionSetResponse> updateModelVersionSet(
            UpdateModelVersionSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelVersionSetRequest, UpdateModelVersionSetResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.ModelVersionSet.class,
                        UpdateModelVersionSetResponse.Builder::modelVersionSet)
                .handleResponseHeaderString("etag", UpdateModelVersionSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelVersionSetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotebookSessionResponse> updateNotebookSession(
            UpdateNotebookSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.NotebookSession.class,
                        UpdateNotebookSessionResponse.Builder::notebookSession)
                .handleResponseHeaderString("etag", UpdateNotebookSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNotebookSessionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResponse> updatePipeline(
            UpdatePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePipelineRequest, UpdatePipelineResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineRunResponse> updatePipelineRun(
            UpdatePipelineRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePipelineRunRequest, UpdatePipelineRunResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datascience.model.Project.class,
                        UpdateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", UpdateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
    public DataScienceAsyncClient(
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
