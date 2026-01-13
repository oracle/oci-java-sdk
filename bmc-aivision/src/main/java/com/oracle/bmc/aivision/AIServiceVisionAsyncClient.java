/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.aivision.requests.*;
import com.oracle.bmc.aivision.responses.*;

import java.util.Objects;

/**
 * Async client implementation for AIServiceVision service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class AIServiceVisionAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements AIServiceVisionAsync {
    /** Service instance for AIServiceVision. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(AIServiceVisionClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://vision.aiservice.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AIServiceVisionAsyncClient.class);

    AIServiceVisionAsyncClient(
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
                    Builder, AIServiceVisionAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "aivision";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public AIServiceVisionAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AIServiceVisionAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AnalyzeDocumentResponse> analyzeDocument(
            AnalyzeDocumentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AnalyzeDocumentRequest, AnalyzeDocumentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getAnalyzeDocumentDetails(), "analyzeDocumentDetails is required");

        return clientCall(request, AnalyzeDocumentResponse::builder)
                .logger(LOG, "analyzeDocument")
                .serviceDetails(
                        "AIServiceVision",
                        "AnalyzeDocument",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/AnalyzeDocumentResult/AnalyzeDocument")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AnalyzeDocumentRequest::builder)
                .basePath("/20220125")
                .appendPathParam("actions")
                .appendPathParam("analyzeDocument")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.AnalyzeDocumentResult.class,
                        AnalyzeDocumentResponse.Builder::analyzeDocumentResult)
                .handleResponseHeaderString("etag", AnalyzeDocumentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AnalyzeDocumentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AnalyzeImageResponse> analyzeImage(
            AnalyzeImageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AnalyzeImageRequest, AnalyzeImageResponse>
                    handler) {
        Objects.requireNonNull(request.getAnalyzeImageDetails(), "analyzeImageDetails is required");

        return clientCall(request, AnalyzeImageResponse::builder)
                .logger(LOG, "analyzeImage")
                .serviceDetails(
                        "AIServiceVision",
                        "AnalyzeImage",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/AnalyzeImageResult/AnalyzeImage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AnalyzeImageRequest::builder)
                .basePath("/20220125")
                .appendPathParam("actions")
                .appendPathParam("analyzeImage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.AnalyzeImageResult.class,
                        AnalyzeImageResponse.Builder::analyzeImageResult)
                .handleResponseHeaderString("etag", AnalyzeImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AnalyzeImageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelDocumentJobResponse> cancelDocumentJob(
            CancelDocumentJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelDocumentJobRequest, CancelDocumentJobResponse>
                    handler) {

        Validate.notBlank(request.getDocumentJobId(), "documentJobId must not be blank");

        return clientCall(request, CancelDocumentJobResponse::builder)
                .logger(LOG, "cancelDocumentJob")
                .serviceDetails(
                        "AIServiceVision",
                        "CancelDocumentJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/DocumentJob/CancelDocumentJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelDocumentJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("documentJobs")
                .appendPathParam(request.getDocumentJobId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelDocumentJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelImageJobResponse> cancelImageJob(
            CancelImageJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelImageJobRequest, CancelImageJobResponse>
                    handler) {

        Validate.notBlank(request.getImageJobId(), "imageJobId must not be blank");

        return clientCall(request, CancelImageJobResponse::builder)
                .logger(LOG, "cancelImageJob")
                .serviceDetails(
                        "AIServiceVision",
                        "CancelImageJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/ImageJob/CancelImageJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelImageJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("imageJobs")
                .appendPathParam(request.getImageJobId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelImageJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelVideoJobResponse> cancelVideoJob(
            CancelVideoJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelVideoJobRequest, CancelVideoJobResponse>
                    handler) {

        Validate.notBlank(request.getVideoJobId(), "videoJobId must not be blank");

        return clientCall(request, CancelVideoJobResponse::builder)
                .logger(LOG, "cancelVideoJob")
                .serviceDetails(
                        "AIServiceVision",
                        "CancelVideoJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/VideoJob/CancelVideoJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelVideoJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("videoJobs")
                .appendPathParam(request.getVideoJobId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelVideoJobResponse.Builder::opcRequestId)
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
                        "AIServiceVision",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20220125")
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
                        "AIServiceVision",
                        "ChangeModelCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/Model/ChangeModelCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeModelCompartmentRequest::builder)
                .basePath("/20220125")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeModelCompartmentResponse.Builder::opcRequestId)
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
                        "AIServiceVision",
                        "ChangeProjectCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/Project/ChangeProjectCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProjectCompartmentRequest::builder)
                .basePath("/20220125")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeProjectCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeStreamGroupCompartmentResponse>
            changeStreamGroupCompartment(
                    ChangeStreamGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeStreamGroupCompartmentRequest,
                                    ChangeStreamGroupCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getStreamGroupId(), "streamGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeStreamGroupCompartmentDetails(),
                "changeStreamGroupCompartmentDetails is required");

        return clientCall(request, ChangeStreamGroupCompartmentResponse::builder)
                .logger(LOG, "changeStreamGroupCompartment")
                .serviceDetails(
                        "AIServiceVision",
                        "ChangeStreamGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamGroup/ChangeStreamGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeStreamGroupCompartmentRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamGroups")
                .appendPathParam(request.getStreamGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeStreamGroupCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeStreamGroupCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeStreamJobCompartmentResponse>
            changeStreamJobCompartment(
                    ChangeStreamJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeStreamJobCompartmentRequest,
                                    ChangeStreamJobCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getStreamJobId(), "streamJobId must not be blank");
        Objects.requireNonNull(
                request.getChangeStreamJobCompartmentDetails(),
                "changeStreamJobCompartmentDetails is required");

        return clientCall(request, ChangeStreamJobCompartmentResponse::builder)
                .logger(LOG, "changeStreamJobCompartment")
                .serviceDetails(
                        "AIServiceVision",
                        "ChangeStreamJobCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamJob/ChangeStreamJobCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeStreamJobCompartmentRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamJobs")
                .appendPathParam(request.getStreamJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeStreamJobCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeStreamJobCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeStreamSourceCompartmentResponse>
            changeStreamSourceCompartment(
                    ChangeStreamSourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeStreamSourceCompartmentRequest,
                                    ChangeStreamSourceCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getStreamSourceId(), "streamSourceId must not be blank");
        Objects.requireNonNull(
                request.getChangeStreamSourceCompartmentDetails(),
                "changeStreamSourceCompartmentDetails is required");

        return clientCall(request, ChangeStreamSourceCompartmentResponse::builder)
                .logger(LOG, "changeStreamSourceCompartment")
                .serviceDetails(
                        "AIServiceVision",
                        "ChangeStreamSourceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamSource/ChangeStreamSourceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeStreamSourceCompartmentRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamSources")
                .appendPathParam(request.getStreamSourceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeStreamSourceCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeStreamSourceCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeVisionPrivateEndpointCompartmentResponse>
            changeVisionPrivateEndpointCompartment(
                    ChangeVisionPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVisionPrivateEndpointCompartmentRequest,
                                    ChangeVisionPrivateEndpointCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getVisionPrivateEndpointId(), "visionPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeVisionPrivateEndpointCompartmentDetails(),
                "changeVisionPrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangeVisionPrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeVisionPrivateEndpointCompartment")
                .serviceDetails(
                        "AIServiceVision",
                        "ChangeVisionPrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/VisionPrivateEndpoint/ChangeVisionPrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVisionPrivateEndpointCompartmentRequest::builder)
                .basePath("/20220125")
                .appendPathParam("visionPrivateEndpoints")
                .appendPathParam(request.getVisionPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVisionPrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentJobResponse> createDocumentJob(
            CreateDocumentJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDocumentJobRequest, CreateDocumentJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDocumentJobDetails(), "createDocumentJobDetails is required");

        return clientCall(request, CreateDocumentJobResponse::builder)
                .logger(LOG, "createDocumentJob")
                .serviceDetails(
                        "AIServiceVision",
                        "CreateDocumentJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/DocumentJob/CreateDocumentJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDocumentJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("documentJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.DocumentJob.class,
                        CreateDocumentJobResponse.Builder::documentJob)
                .handleResponseHeaderString("etag", CreateDocumentJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDocumentJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateImageJobResponse> createImageJob(
            CreateImageJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateImageJobRequest, CreateImageJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateImageJobDetails(), "createImageJobDetails is required");

        return clientCall(request, CreateImageJobResponse::builder)
                .logger(LOG, "createImageJob")
                .serviceDetails(
                        "AIServiceVision",
                        "CreateImageJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/ImageJob/CreateImageJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateImageJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("imageJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.ImageJob.class,
                        CreateImageJobResponse.Builder::imageJob)
                .handleResponseHeaderString("etag", CreateImageJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateImageJobResponse.Builder::opcRequestId)
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
                .serviceDetails("AIServiceVision", "CreateModel", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelRequest::builder)
                .basePath("/20220125")
                .appendPathParam("models")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.Model.class,
                        CreateModelResponse.Builder::model)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateModelResponse.Builder::etag)
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
                .serviceDetails("AIServiceVision", "CreateProject", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProjectRequest::builder)
                .basePath("/20220125")
                .appendPathParam("projects")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.Project.class,
                        CreateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", CreateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamGroupResponse> createStreamGroup(
            CreateStreamGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateStreamGroupRequest, CreateStreamGroupResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateStreamGroupDetails(), "createStreamGroupDetails is required");

        return clientCall(request, CreateStreamGroupResponse::builder)
                .logger(LOG, "createStreamGroup")
                .serviceDetails(
                        "AIServiceVision",
                        "CreateStreamGroup",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamGroup/CreateStreamGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStreamGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.StreamGroup.class,
                        CreateStreamGroupResponse.Builder::streamGroup)
                .handleResponseHeaderString("etag", CreateStreamGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateStreamGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStreamGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamJobResponse> createStreamJob(
            CreateStreamJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateStreamJobRequest, CreateStreamJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateStreamJobDetails(), "createStreamJobDetails is required");

        return clientCall(request, CreateStreamJobResponse::builder)
                .logger(LOG, "createStreamJob")
                .serviceDetails(
                        "AIServiceVision",
                        "CreateStreamJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamJob/CreateStreamJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStreamJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.StreamJob.class,
                        CreateStreamJobResponse.Builder::streamJob)
                .handleResponseHeaderString("etag", CreateStreamJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateStreamJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStreamJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamSourceResponse> createStreamSource(
            CreateStreamSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateStreamSourceRequest, CreateStreamSourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateStreamSourceDetails(), "createStreamSourceDetails is required");

        return clientCall(request, CreateStreamSourceResponse::builder)
                .logger(LOG, "createStreamSource")
                .serviceDetails(
                        "AIServiceVision",
                        "CreateStreamSource",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamSource/CreateStreamSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStreamSourceRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamSources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.StreamSource.class,
                        CreateStreamSourceResponse.Builder::streamSource)
                .handleResponseHeaderString("etag", CreateStreamSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateStreamSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStreamSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVideoJobResponse> createVideoJob(
            CreateVideoJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVideoJobRequest, CreateVideoJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateVideoJobDetails(), "createVideoJobDetails is required");

        return clientCall(request, CreateVideoJobResponse::builder)
                .logger(LOG, "createVideoJob")
                .serviceDetails(
                        "AIServiceVision",
                        "CreateVideoJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/VideoJob/CreateVideoJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVideoJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("videoJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.VideoJob.class,
                        CreateVideoJobResponse.Builder::videoJob)
                .handleResponseHeaderString("etag", CreateVideoJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVideoJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVisionPrivateEndpointResponse>
            createVisionPrivateEndpoint(
                    CreateVisionPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateVisionPrivateEndpointRequest,
                                    CreateVisionPrivateEndpointResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateVisionPrivateEndpointDetails(),
                "createVisionPrivateEndpointDetails is required");

        return clientCall(request, CreateVisionPrivateEndpointResponse::builder)
                .logger(LOG, "createVisionPrivateEndpoint")
                .serviceDetails("AIServiceVision", "CreateVisionPrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVisionPrivateEndpointRequest::builder)
                .basePath("/20220125")
                .appendPathParam("visionPrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aivision.model.VisionPrivateEndpoint.class,
                        CreateVisionPrivateEndpointResponse.Builder::visionPrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", CreateVisionPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVisionPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVisionPrivateEndpointResponse.Builder::opcRequestId)
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
                        "AIServiceVision",
                        "DeleteModel",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/Model/DeleteModel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteModelRequest::builder)
                .basePath("/20220125")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteModelResponse.Builder::opcRequestId)
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
                        "AIServiceVision",
                        "DeleteProject",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/Project/DeleteProject")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProjectRequest::builder)
                .basePath("/20220125")
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
    public java.util.concurrent.Future<DeleteStreamGroupResponse> deleteStreamGroup(
            DeleteStreamGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteStreamGroupRequest, DeleteStreamGroupResponse>
                    handler) {

        Validate.notBlank(request.getStreamGroupId(), "streamGroupId must not be blank");

        return clientCall(request, DeleteStreamGroupResponse::builder)
                .logger(LOG, "deleteStreamGroup")
                .serviceDetails(
                        "AIServiceVision",
                        "DeleteStreamGroup",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamGroup/DeleteStreamGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStreamGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamGroups")
                .appendPathParam(request.getStreamGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteStreamGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamJobResponse> deleteStreamJob(
            DeleteStreamJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteStreamJobRequest, DeleteStreamJobResponse>
                    handler) {

        Validate.notBlank(request.getStreamJobId(), "streamJobId must not be blank");

        return clientCall(request, DeleteStreamJobResponse::builder)
                .logger(LOG, "deleteStreamJob")
                .serviceDetails(
                        "AIServiceVision",
                        "DeleteStreamJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamJob/DeleteStreamJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStreamJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamJobs")
                .appendPathParam(request.getStreamJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteStreamJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamSourceResponse> deleteStreamSource(
            DeleteStreamSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteStreamSourceRequest, DeleteStreamSourceResponse>
                    handler) {

        Validate.notBlank(request.getStreamSourceId(), "streamSourceId must not be blank");

        return clientCall(request, DeleteStreamSourceResponse::builder)
                .logger(LOG, "deleteStreamSource")
                .serviceDetails(
                        "AIServiceVision",
                        "DeleteStreamSource",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamSource/DeleteStreamSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStreamSourceRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamSources")
                .appendPathParam(request.getStreamSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteStreamSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteVisionPrivateEndpointResponse>
            deleteVisionPrivateEndpoint(
                    DeleteVisionPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteVisionPrivateEndpointRequest,
                                    DeleteVisionPrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getVisionPrivateEndpointId(), "visionPrivateEndpointId must not be blank");

        return clientCall(request, DeleteVisionPrivateEndpointResponse::builder)
                .logger(LOG, "deleteVisionPrivateEndpoint")
                .serviceDetails(
                        "AIServiceVision",
                        "DeleteVisionPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/VisionPrivateEndpoint/DeleteVisionPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVisionPrivateEndpointRequest::builder)
                .basePath("/20220125")
                .appendPathParam("visionPrivateEndpoints")
                .appendPathParam(request.getVisionPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteVisionPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVisionPrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentJobResponse> getDocumentJob(
            GetDocumentJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDocumentJobRequest, GetDocumentJobResponse>
                    handler) {

        Validate.notBlank(request.getDocumentJobId(), "documentJobId must not be blank");

        return clientCall(request, GetDocumentJobResponse::builder)
                .logger(LOG, "getDocumentJob")
                .serviceDetails(
                        "AIServiceVision",
                        "GetDocumentJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/DocumentJob/GetDocumentJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDocumentJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("documentJobs")
                .appendPathParam(request.getDocumentJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.DocumentJob.class,
                        GetDocumentJobResponse.Builder::documentJob)
                .handleResponseHeaderString("etag", GetDocumentJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDocumentJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetImageJobResponse> getImageJob(
            GetImageJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetImageJobRequest, GetImageJobResponse>
                    handler) {

        Validate.notBlank(request.getImageJobId(), "imageJobId must not be blank");

        return clientCall(request, GetImageJobResponse::builder)
                .logger(LOG, "getImageJob")
                .serviceDetails(
                        "AIServiceVision",
                        "GetImageJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/ImageJob/GetImageJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetImageJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("imageJobs")
                .appendPathParam(request.getImageJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.ImageJob.class,
                        GetImageJobResponse.Builder::imageJob)
                .handleResponseHeaderString("etag", GetImageJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetImageJobResponse.Builder::opcRequestId)
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
                        "AIServiceVision",
                        "GetModel",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/Model/GetModel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelRequest::builder)
                .basePath("/20220125")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.Model.class, GetModelResponse.Builder::model)
                .handleResponseHeaderString("etag", GetModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelResponse.Builder::opcRequestId)
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
                        "AIServiceVision",
                        "GetProject",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/Project/GetProject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProjectRequest::builder)
                .basePath("/20220125")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.Project.class,
                        GetProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", GetProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStreamGroupResponse> getStreamGroup(
            GetStreamGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStreamGroupRequest, GetStreamGroupResponse>
                    handler) {

        Validate.notBlank(request.getStreamGroupId(), "streamGroupId must not be blank");

        return clientCall(request, GetStreamGroupResponse::builder)
                .logger(LOG, "getStreamGroup")
                .serviceDetails(
                        "AIServiceVision",
                        "GetStreamGroup",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamGroup/GetStreamGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStreamGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamGroups")
                .appendPathParam(request.getStreamGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.StreamGroup.class,
                        GetStreamGroupResponse.Builder::streamGroup)
                .handleResponseHeaderString("etag", GetStreamGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetStreamGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStreamJobResponse> getStreamJob(
            GetStreamJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetStreamJobRequest, GetStreamJobResponse>
                    handler) {

        Validate.notBlank(request.getStreamJobId(), "streamJobId must not be blank");

        return clientCall(request, GetStreamJobResponse::builder)
                .logger(LOG, "getStreamJob")
                .serviceDetails(
                        "AIServiceVision",
                        "GetStreamJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamJob/GetStreamJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStreamJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamJobs")
                .appendPathParam(request.getStreamJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.StreamJob.class,
                        GetStreamJobResponse.Builder::streamJob)
                .handleResponseHeaderString("etag", GetStreamJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetStreamJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStreamSourceResponse> getStreamSource(
            GetStreamSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetStreamSourceRequest, GetStreamSourceResponse>
                    handler) {

        Validate.notBlank(request.getStreamSourceId(), "streamSourceId must not be blank");

        return clientCall(request, GetStreamSourceResponse::builder)
                .logger(LOG, "getStreamSource")
                .serviceDetails(
                        "AIServiceVision",
                        "GetStreamSource",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamSource/GetStreamSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStreamSourceRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamSources")
                .appendPathParam(request.getStreamSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.StreamSource.class,
                        GetStreamSourceResponse.Builder::streamSource)
                .handleResponseHeaderString("etag", GetStreamSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetStreamSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVideoJobResponse> getVideoJob(
            GetVideoJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVideoJobRequest, GetVideoJobResponse>
                    handler) {

        Validate.notBlank(request.getVideoJobId(), "videoJobId must not be blank");

        return clientCall(request, GetVideoJobResponse::builder)
                .logger(LOG, "getVideoJob")
                .serviceDetails(
                        "AIServiceVision",
                        "GetVideoJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/VideoJob/GetVideoJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVideoJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("videoJobs")
                .appendPathParam(request.getVideoJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.VideoJob.class,
                        GetVideoJobResponse.Builder::videoJob)
                .handleResponseHeaderString("etag", GetVideoJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVideoJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVisionPrivateEndpointResponse> getVisionPrivateEndpoint(
            GetVisionPrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVisionPrivateEndpointRequest, GetVisionPrivateEndpointResponse>
                    handler) {

        Validate.notBlank(
                request.getVisionPrivateEndpointId(), "visionPrivateEndpointId must not be blank");

        return clientCall(request, GetVisionPrivateEndpointResponse::builder)
                .logger(LOG, "getVisionPrivateEndpoint")
                .serviceDetails(
                        "AIServiceVision",
                        "GetVisionPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/VisionPrivateEndpoint/GetVisionPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVisionPrivateEndpointRequest::builder)
                .basePath("/20220125")
                .appendPathParam("visionPrivateEndpoints")
                .appendPathParam(request.getVisionPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.VisionPrivateEndpoint.class,
                        GetVisionPrivateEndpointResponse.Builder::visionPrivateEndpoint)
                .handleResponseHeaderString("etag", GetVisionPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVisionPrivateEndpointResponse.Builder::opcRequestId)
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
                        "AIServiceVision",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20220125")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListModelsResponse> listModels(
            ListModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse>
                    handler) {

        return clientCall(request, ListModelsResponse::builder)
                .logger(LOG, "listModels")
                .serviceDetails(
                        "AIServiceVision",
                        "ListModels",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/ModelCollection/ListModels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModelsRequest::builder)
                .basePath("/20220125")
                .appendPathParam("models")
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
                .handleBody(
                        com.oracle.bmc.aivision.model.ModelCollection.class,
                        ListModelsResponse.Builder::modelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler) {

        return clientCall(request, ListProjectsResponse::builder)
                .logger(LOG, "listProjects")
                .serviceDetails(
                        "AIServiceVision",
                        "ListProjects",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/ProjectCollection/ListProjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProjectsRequest::builder)
                .basePath("/20220125")
                .appendPathParam("projects")
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
                .handleBody(
                        com.oracle.bmc.aivision.model.ProjectCollection.class,
                        ListProjectsResponse.Builder::projectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProjectsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStreamGroupsResponse> listStreamGroups(
            ListStreamGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStreamGroupsRequest, ListStreamGroupsResponse>
                    handler) {

        return clientCall(request, ListStreamGroupsResponse::builder)
                .logger(LOG, "listStreamGroups")
                .serviceDetails(
                        "AIServiceVision",
                        "ListStreamGroups",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamGroupCollection/ListStreamGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStreamGroupsRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.StreamGroupCollection.class,
                        ListStreamGroupsResponse.Builder::streamGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListStreamGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStreamGroupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStreamJobsResponse> listStreamJobs(
            ListStreamJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStreamJobsRequest, ListStreamJobsResponse>
                    handler) {

        return clientCall(request, ListStreamJobsResponse::builder)
                .logger(LOG, "listStreamJobs")
                .serviceDetails(
                        "AIServiceVision",
                        "ListStreamJobs",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamJobCollection/ListStreamJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStreamJobsRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.StreamJobCollection.class,
                        ListStreamJobsResponse.Builder::streamJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListStreamJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStreamJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStreamSourcesResponse> listStreamSources(
            ListStreamSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStreamSourcesRequest, ListStreamSourcesResponse>
                    handler) {

        return clientCall(request, ListStreamSourcesResponse::builder)
                .logger(LOG, "listStreamSources")
                .serviceDetails(
                        "AIServiceVision",
                        "ListStreamSources",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamSourceCollection/ListStreamSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStreamSourcesRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamSources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aivision.model.StreamSourceCollection.class,
                        ListStreamSourcesResponse.Builder::streamSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListStreamSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStreamSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVisionPrivateEndpointsResponse>
            listVisionPrivateEndpoints(
                    ListVisionPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVisionPrivateEndpointsRequest,
                                    ListVisionPrivateEndpointsResponse>
                            handler) {

        return clientCall(request, ListVisionPrivateEndpointsResponse::builder)
                .logger(LOG, "listVisionPrivateEndpoints")
                .serviceDetails(
                        "AIServiceVision",
                        "ListVisionPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/VisionPrivateEndpointCollection/ListVisionPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVisionPrivateEndpointsRequest::builder)
                .basePath("/20220125")
                .appendPathParam("visionPrivateEndpoints")
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
                .handleBody(
                        com.oracle.bmc.aivision.model.VisionPrivateEndpointCollection.class,
                        ListVisionPrivateEndpointsResponse.Builder::visionPrivateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVisionPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVisionPrivateEndpointsResponse.Builder::opcNextPage)
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
                        "AIServiceVision",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20220125")
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
                        com.oracle.bmc.aivision.model.WorkRequestErrorCollection.class,
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
                        "AIServiceVision",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20220125")
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
                        com.oracle.bmc.aivision.model.WorkRequestLogEntryCollection.class,
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
                .serviceDetails(
                        "AIServiceVision",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20220125")
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
                        com.oracle.bmc.aivision.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartStreamJobResponse> startStreamJob(
            StartStreamJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartStreamJobRequest, StartStreamJobResponse>
                    handler) {

        Validate.notBlank(request.getStreamJobId(), "streamJobId must not be blank");

        return clientCall(request, StartStreamJobResponse::builder)
                .logger(LOG, "startStreamJob")
                .serviceDetails(
                        "AIServiceVision",
                        "StartStreamJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamJob/StartStreamJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartStreamJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamJobs")
                .appendPathParam(request.getStreamJobId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", StartStreamJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartStreamJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopStreamJobResponse> stopStreamJob(
            StopStreamJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StopStreamJobRequest, StopStreamJobResponse>
                    handler) {

        Validate.notBlank(request.getStreamJobId(), "streamJobId must not be blank");

        return clientCall(request, StopStreamJobResponse::builder)
                .logger(LOG, "stopStreamJob")
                .serviceDetails(
                        "AIServiceVision",
                        "StopStreamJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamJob/StopStreamJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopStreamJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamJobs")
                .appendPathParam(request.getStreamJobId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", StopStreamJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopStreamJobResponse.Builder::opcRequestId)
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
                        "AIServiceVision",
                        "UpdateModel",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/Model/UpdateModel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelRequest::builder)
                .basePath("/20220125")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelResponse.Builder::opcRequestId)
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
                        "AIServiceVision",
                        "UpdateProject",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/Project/UpdateProject")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProjectRequest::builder)
                .basePath("/20220125")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamGroupResponse> updateStreamGroup(
            UpdateStreamGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateStreamGroupRequest, UpdateStreamGroupResponse>
                    handler) {

        Validate.notBlank(request.getStreamGroupId(), "streamGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateStreamGroupDetails(), "updateStreamGroupDetails is required");

        return clientCall(request, UpdateStreamGroupResponse::builder)
                .logger(LOG, "updateStreamGroup")
                .serviceDetails(
                        "AIServiceVision",
                        "UpdateStreamGroup",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamGroup/UpdateStreamGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStreamGroupRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamGroups")
                .appendPathParam(request.getStreamGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateStreamGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStreamGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamJobResponse> updateStreamJob(
            UpdateStreamJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateStreamJobRequest, UpdateStreamJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateStreamJobDetails(), "updateStreamJobDetails is required");

        Validate.notBlank(request.getStreamJobId(), "streamJobId must not be blank");

        return clientCall(request, UpdateStreamJobResponse::builder)
                .logger(LOG, "updateStreamJob")
                .serviceDetails(
                        "AIServiceVision",
                        "UpdateStreamJob",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamJob/UpdateStreamJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStreamJobRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamJobs")
                .appendPathParam(request.getStreamJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateStreamJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStreamJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamSourceResponse> updateStreamSource(
            UpdateStreamSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateStreamSourceRequest, UpdateStreamSourceResponse>
                    handler) {

        Validate.notBlank(request.getStreamSourceId(), "streamSourceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateStreamSourceDetails(), "updateStreamSourceDetails is required");

        return clientCall(request, UpdateStreamSourceResponse::builder)
                .logger(LOG, "updateStreamSource")
                .serviceDetails(
                        "AIServiceVision",
                        "UpdateStreamSource",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/StreamSource/UpdateStreamSource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStreamSourceRequest::builder)
                .basePath("/20220125")
                .appendPathParam("streamSources")
                .appendPathParam(request.getStreamSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateStreamSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStreamSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateVisionPrivateEndpointResponse>
            updateVisionPrivateEndpoint(
                    UpdateVisionPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateVisionPrivateEndpointRequest,
                                    UpdateVisionPrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getVisionPrivateEndpointId(), "visionPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVisionPrivateEndpointDetails(),
                "updateVisionPrivateEndpointDetails is required");

        return clientCall(request, UpdateVisionPrivateEndpointResponse::builder)
                .logger(LOG, "updateVisionPrivateEndpoint")
                .serviceDetails(
                        "AIServiceVision",
                        "UpdateVisionPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/vision/20220125/VisionPrivateEndpoint/UpdateVisionPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVisionPrivateEndpointRequest::builder)
                .basePath("/20220125")
                .appendPathParam("visionPrivateEndpoints")
                .appendPathParam(request.getVisionPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateVisionPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVisionPrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceVisionAsyncClient(
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
    public AIServiceVisionAsyncClient(
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
    public AIServiceVisionAsyncClient(
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
    public AIServiceVisionAsyncClient(
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
    public AIServiceVisionAsyncClient(
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
    public AIServiceVisionAsyncClient(
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
    public AIServiceVisionAsyncClient(
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
