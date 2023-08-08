/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ailanguage.requests.*;
import com.oracle.bmc.ailanguage.responses.*;

import java.util.Objects;

/**
 * Async client implementation for AIServiceLanguage service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class AIServiceLanguageAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements AIServiceLanguageAsync {
    /** Service instance for AIServiceLanguage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("AISERVICELANGUAGE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://language.aiservice.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AIServiceLanguageAsyncClient.class);

    AIServiceLanguageAsyncClient(
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
                    Builder, AIServiceLanguageAsyncClient> {
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
        public AIServiceLanguageAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AIServiceLanguageAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<BatchDetectDominantLanguageResponse>
            batchDetectDominantLanguage(
                    BatchDetectDominantLanguageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectDominantLanguageRequest,
                                    BatchDetectDominantLanguageResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBatchDetectDominantLanguageDetails(),
                "batchDetectDominantLanguageDetails is required");

        return clientCall(request, BatchDetectDominantLanguageResponse::builder)
                .logger(LOG, "batchDetectDominantLanguage")
                .serviceDetails(
                        "AIServiceLanguage",
                        "BatchDetectDominantLanguage",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/BatchDetectDominantLanguage/BatchDetectDominantLanguage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchDetectDominantLanguageRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("batchDetectDominantLanguage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.BatchDetectDominantLanguageResult.class,
                        BatchDetectDominantLanguageResponse.Builder
                                ::batchDetectDominantLanguageResult)
                .handleResponseHeaderString(
                        "opc-request-id", BatchDetectDominantLanguageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectLanguageEntitiesResponse>
            batchDetectLanguageEntities(
                    BatchDetectLanguageEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageEntitiesRequest,
                                    BatchDetectLanguageEntitiesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBatchDetectLanguageEntitiesDetails(),
                "batchDetectLanguageEntitiesDetails is required");

        return clientCall(request, BatchDetectLanguageEntitiesResponse::builder)
                .logger(LOG, "batchDetectLanguageEntities")
                .serviceDetails(
                        "AIServiceLanguage",
                        "BatchDetectLanguageEntities",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/BatchDetectLanguageEntities/BatchDetectLanguageEntities")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchDetectLanguageEntitiesRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("batchDetectLanguageEntities")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.BatchDetectLanguageEntitiesResult.class,
                        BatchDetectLanguageEntitiesResponse.Builder
                                ::batchDetectLanguageEntitiesResult)
                .handleResponseHeaderString(
                        "opc-request-id", BatchDetectLanguageEntitiesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectLanguageKeyPhrasesResponse>
            batchDetectLanguageKeyPhrases(
                    BatchDetectLanguageKeyPhrasesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageKeyPhrasesRequest,
                                    BatchDetectLanguageKeyPhrasesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBatchDetectLanguageKeyPhrasesDetails(),
                "batchDetectLanguageKeyPhrasesDetails is required");

        return clientCall(request, BatchDetectLanguageKeyPhrasesResponse::builder)
                .logger(LOG, "batchDetectLanguageKeyPhrases")
                .serviceDetails(
                        "AIServiceLanguage",
                        "BatchDetectLanguageKeyPhrases",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/BatchDetectLanguageKeyPhrases/BatchDetectLanguageKeyPhrases")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchDetectLanguageKeyPhrasesRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("batchDetectLanguageKeyPhrases")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.BatchDetectLanguageKeyPhrasesResult.class,
                        BatchDetectLanguageKeyPhrasesResponse.Builder
                                ::batchDetectLanguageKeyPhrasesResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        BatchDetectLanguageKeyPhrasesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectLanguagePiiEntitiesResponse>
            batchDetectLanguagePiiEntities(
                    BatchDetectLanguagePiiEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguagePiiEntitiesRequest,
                                    BatchDetectLanguagePiiEntitiesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBatchDetectLanguagePiiEntitiesDetails(),
                "batchDetectLanguagePiiEntitiesDetails is required");

        return clientCall(request, BatchDetectLanguagePiiEntitiesResponse::builder)
                .logger(LOG, "batchDetectLanguagePiiEntities")
                .serviceDetails(
                        "AIServiceLanguage",
                        "BatchDetectLanguagePiiEntities",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/BatchDetectLanguagePiiEntities/BatchDetectLanguagePiiEntities")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchDetectLanguagePiiEntitiesRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("batchDetectLanguagePiiEntities")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.BatchDetectLanguagePiiEntitiesResult.class,
                        BatchDetectLanguagePiiEntitiesResponse.Builder
                                ::batchDetectLanguagePiiEntitiesResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        BatchDetectLanguagePiiEntitiesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectLanguageSentimentsResponse>
            batchDetectLanguageSentiments(
                    BatchDetectLanguageSentimentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageSentimentsRequest,
                                    BatchDetectLanguageSentimentsResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBatchDetectLanguageSentimentsDetails(),
                "batchDetectLanguageSentimentsDetails is required");

        return clientCall(request, BatchDetectLanguageSentimentsResponse::builder)
                .logger(LOG, "batchDetectLanguageSentiments")
                .serviceDetails(
                        "AIServiceLanguage",
                        "BatchDetectLanguageSentiments",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/BatchDetectLanguageSentiments/BatchDetectLanguageSentiments")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchDetectLanguageSentimentsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("batchDetectLanguageSentiments")
                .appendListQueryParam(
                        "level",
                        request.getLevel(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsResult.class,
                        BatchDetectLanguageSentimentsResponse.Builder
                                ::batchDetectLanguageSentimentsResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        BatchDetectLanguageSentimentsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BatchDetectLanguageTextClassificationResponse>
            batchDetectLanguageTextClassification(
                    BatchDetectLanguageTextClassificationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BatchDetectLanguageTextClassificationRequest,
                                    BatchDetectLanguageTextClassificationResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBatchDetectLanguageTextClassificationDetails(),
                "batchDetectLanguageTextClassificationDetails is required");

        return clientCall(request, BatchDetectLanguageTextClassificationResponse::builder)
                .logger(LOG, "batchDetectLanguageTextClassification")
                .serviceDetails(
                        "AIServiceLanguage",
                        "BatchDetectLanguageTextClassification",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/BatchDetectLanguageTextClassification/BatchDetectLanguageTextClassification")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchDetectLanguageTextClassificationRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("batchDetectLanguageTextClassification")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.BatchDetectLanguageTextClassificationResult
                                .class,
                        BatchDetectLanguageTextClassificationResponse.Builder
                                ::batchDetectLanguageTextClassificationResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        BatchDetectLanguageTextClassificationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BatchLanguageTranslationResponse> batchLanguageTranslation(
            BatchLanguageTranslationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BatchLanguageTranslationRequest, BatchLanguageTranslationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getBatchLanguageTranslationDetails(),
                "batchLanguageTranslationDetails is required");

        return clientCall(request, BatchLanguageTranslationResponse::builder)
                .logger(LOG, "batchLanguageTranslation")
                .serviceDetails(
                        "AIServiceLanguage",
                        "BatchLanguageTranslation",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/BatchLanguageTranslation/BatchLanguageTranslation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchLanguageTranslationRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("batchLanguageTranslation")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.BatchLanguageTranslationResult.class,
                        BatchLanguageTranslationResponse.Builder::batchLanguageTranslationResult)
                .handleResponseHeaderString(
                        "opc-request-id", BatchLanguageTranslationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeEndpointCompartmentResponse> changeEndpointCompartment(
            ChangeEndpointCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeEndpointCompartmentRequest, ChangeEndpointCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeEndpointCompartmentDetails(),
                "changeEndpointCompartmentDetails is required");

        return clientCall(request, ChangeEndpointCompartmentResponse::builder)
                .logger(LOG, "changeEndpointCompartment")
                .serviceDetails(
                        "AIServiceLanguage",
                        "ChangeEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Endpoint/ChangeEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeEndpointCompartmentRequest::builder)
                .basePath("/20221001")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeEndpointCompartmentResponse.Builder::opcRequestId)
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
                        "AIServiceLanguage",
                        "ChangeModelCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Model/ChangeModelCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeModelCompartmentRequest::builder)
                .basePath("/20221001")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
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
                        "AIServiceLanguage",
                        "ChangeProjectCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Project/ChangeProjectCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProjectCompartmentRequest::builder)
                .basePath("/20221001")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeProjectCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResponse> createEndpoint(
            CreateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEndpointRequest, CreateEndpointResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateEndpointDetails(), "createEndpointDetails is required");

        return clientCall(request, CreateEndpointResponse::builder)
                .logger(LOG, "createEndpoint")
                .serviceDetails(
                        "AIServiceLanguage",
                        "CreateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Endpoint/CreateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEndpointRequest::builder)
                .basePath("/20221001")
                .appendPathParam("endpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Endpoint.class,
                        CreateEndpointResponse.Builder::endpoint)
                .handleResponseHeaderString("etag", CreateEndpointResponse.Builder::etag)
                .handleResponseHeaderString("location", CreateEndpointResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEndpointResponse.Builder::opcRequestId)
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
                        "AIServiceLanguage",
                        "CreateModel",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Model/CreateModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelRequest::builder)
                .basePath("/20221001")
                .appendPathParam("models")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Model.class,
                        CreateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", CreateModelResponse.Builder::etag)
                .handleResponseHeaderString("location", CreateModelResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelResponse.Builder::opcRequestId)
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
                        "AIServiceLanguage",
                        "CreateProject",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Project/CreateProject")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProjectRequest::builder)
                .basePath("/20221001")
                .appendPathParam("projects")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Project.class,
                        CreateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", CreateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateProjectResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResponse> deleteEndpoint(
            DeleteEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEndpointRequest, DeleteEndpointResponse>
                    handler) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");

        return clientCall(request, DeleteEndpointResponse::builder)
                .logger(LOG, "deleteEndpoint")
                .serviceDetails(
                        "AIServiceLanguage",
                        "DeleteEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Endpoint/DeleteEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEndpointRequest::builder)
                .basePath("/20221001")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEndpointResponse.Builder::opcRequestId)
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
                        "AIServiceLanguage",
                        "DeleteModel",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Model/DeleteModel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteModelRequest::builder)
                .basePath("/20221001")
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
                        "AIServiceLanguage",
                        "DeleteProject",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Project/DeleteProject")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProjectRequest::builder)
                .basePath("/20221001")
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
    public java.util.concurrent.Future<DetectDominantLanguageResponse> detectDominantLanguage(
            DetectDominantLanguageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetectDominantLanguageRequest, DetectDominantLanguageResponse>
                    handler) {
        Objects.requireNonNull(
                request.getDetectDominantLanguageDetails(),
                "detectDominantLanguageDetails is required");

        return clientCall(request, DetectDominantLanguageResponse::builder)
                .logger(LOG, "detectDominantLanguage")
                .serviceDetails(
                        "AIServiceLanguage",
                        "DetectDominantLanguage",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/DetectDominantLanguage/DetectDominantLanguage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetectDominantLanguageRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("detectDominantLanguage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.DetectDominantLanguageResult.class,
                        DetectDominantLanguageResponse.Builder::detectDominantLanguageResult)
                .handleResponseHeaderString(
                        "opc-request-id", DetectDominantLanguageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", DetectDominantLanguageResponse.Builder::sunset)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetectLanguageEntitiesResponse> detectLanguageEntities(
            DetectLanguageEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetectLanguageEntitiesRequest, DetectLanguageEntitiesResponse>
                    handler) {
        Objects.requireNonNull(
                request.getDetectLanguageEntitiesDetails(),
                "detectLanguageEntitiesDetails is required");

        return clientCall(request, DetectLanguageEntitiesResponse::builder)
                .logger(LOG, "detectLanguageEntities")
                .serviceDetails(
                        "AIServiceLanguage",
                        "DetectLanguageEntities",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/DetectLanguageEntities/DetectLanguageEntities")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetectLanguageEntitiesRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("detectLanguageEntities")
                .appendEnumQueryParam("modelVersion", request.getModelVersion())
                .appendQueryParam("isPii", request.getIsPii())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesResult.class,
                        DetectLanguageEntitiesResponse.Builder::detectLanguageEntitiesResult)
                .handleResponseHeaderString(
                        "opc-request-id", DetectLanguageEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", DetectLanguageEntitiesResponse.Builder::sunset)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetectLanguageKeyPhrasesResponse> detectLanguageKeyPhrases(
            DetectLanguageKeyPhrasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetectLanguageKeyPhrasesRequest, DetectLanguageKeyPhrasesResponse>
                    handler) {
        Objects.requireNonNull(
                request.getDetectLanguageKeyPhrasesDetails(),
                "detectLanguageKeyPhrasesDetails is required");

        return clientCall(request, DetectLanguageKeyPhrasesResponse::builder)
                .logger(LOG, "detectLanguageKeyPhrases")
                .serviceDetails(
                        "AIServiceLanguage",
                        "DetectLanguageKeyPhrases",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/DetectLanguageKeyPhrases/DetectLanguageKeyPhrases")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetectLanguageKeyPhrasesRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("detectLanguageKeyPhrases")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.DetectLanguageKeyPhrasesResult.class,
                        DetectLanguageKeyPhrasesResponse.Builder::detectLanguageKeyPhrasesResult)
                .handleResponseHeaderString(
                        "opc-request-id", DetectLanguageKeyPhrasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", DetectLanguageKeyPhrasesResponse.Builder::sunset)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetectLanguageSentimentsResponse> detectLanguageSentiments(
            DetectLanguageSentimentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetectLanguageSentimentsRequest, DetectLanguageSentimentsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getDetectLanguageSentimentsDetails(),
                "detectLanguageSentimentsDetails is required");

        return clientCall(request, DetectLanguageSentimentsResponse::builder)
                .logger(LOG, "detectLanguageSentiments")
                .serviceDetails(
                        "AIServiceLanguage",
                        "DetectLanguageSentiments",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/DetectLanguageSentiments/DetectLanguageSentiments")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetectLanguageSentimentsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("detectLanguageSentiments")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsResult.class,
                        DetectLanguageSentimentsResponse.Builder::detectLanguageSentimentsResult)
                .handleResponseHeaderString(
                        "opc-request-id", DetectLanguageSentimentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", DetectLanguageSentimentsResponse.Builder::sunset)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetectLanguageTextClassificationResponse>
            detectLanguageTextClassification(
                    DetectLanguageTextClassificationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetectLanguageTextClassificationRequest,
                                    DetectLanguageTextClassificationResponse>
                            handler) {
        Objects.requireNonNull(
                request.getDetectLanguageTextClassificationDetails(),
                "detectLanguageTextClassificationDetails is required");

        return clientCall(request, DetectLanguageTextClassificationResponse::builder)
                .logger(LOG, "detectLanguageTextClassification")
                .serviceDetails(
                        "AIServiceLanguage",
                        "DetectLanguageTextClassification",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/DetectLanguageTextClassification/DetectLanguageTextClassification")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetectLanguageTextClassificationRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("detectLanguageTextClassification")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.DetectLanguageTextClassificationResult
                                .class,
                        DetectLanguageTextClassificationResponse.Builder
                                ::detectLanguageTextClassificationResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetectLanguageTextClassificationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", DetectLanguageTextClassificationResponse.Builder::sunset)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointResponse> getEndpoint(
            GetEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetEndpointRequest, GetEndpointResponse>
                    handler) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");

        return clientCall(request, GetEndpointResponse::builder)
                .logger(LOG, "getEndpoint")
                .serviceDetails(
                        "AIServiceLanguage",
                        "GetEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Endpoint/GetEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEndpointRequest::builder)
                .basePath("/20221001")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Endpoint.class,
                        GetEndpointResponse.Builder::endpoint)
                .handleResponseHeaderString("etag", GetEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEndpointResponse.Builder::opcRequestId)
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
                        "AIServiceLanguage",
                        "GetModel",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Model/GetModel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelRequest::builder)
                .basePath("/20221001")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Model.class,
                        GetModelResponse.Builder::model)
                .handleResponseHeaderString("etag", GetModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetModelTypeResponse> getModelType(
            GetModelTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetModelTypeRequest, GetModelTypeResponse>
                    handler) {

        Validate.notBlank(request.getModelType(), "modelType must not be blank");

        return clientCall(request, GetModelTypeResponse::builder)
                .logger(LOG, "getModelType")
                .serviceDetails(
                        "AIServiceLanguage",
                        "GetModelType",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/ModelTypeInfo/GetModelType")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelTypeRequest::builder)
                .basePath("/20221001")
                .appendPathParam("modelTypes")
                .appendPathParam(request.getModelType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.ModelTypeInfo.class,
                        GetModelTypeResponse.Builder::modelTypeInfo)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelTypeResponse.Builder::opcRequestId)
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
                        "AIServiceLanguage",
                        "GetProject",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Project/GetProject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProjectRequest::builder)
                .basePath("/20221001")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Project.class,
                        GetProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", GetProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProjectResponse.Builder::opcRequestId)
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
                        "AIServiceLanguage",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20221001")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsResponse> listEndpoints(
            ListEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListEndpointsRequest, ListEndpointsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEndpointsResponse::builder)
                .logger(LOG, "listEndpoints")
                .serviceDetails(
                        "AIServiceLanguage",
                        "ListEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Endpoint/ListEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEndpointsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("endpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("endpointId", request.getEndpointId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("modelId", request.getModelId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.EndpointCollection.class,
                        ListEndpointsResponse.Builder::endpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEvaluationResultsResponse> listEvaluationResults(
            ListEvaluationResultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEvaluationResultsRequest, ListEvaluationResultsResponse>
                    handler) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, ListEvaluationResultsResponse::builder)
                .logger(LOG, "listEvaluationResults")
                .serviceDetails(
                        "AIServiceLanguage",
                        "ListEvaluationResults",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/EvaluationResultCollection/ListEvaluationResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEvaluationResultsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .appendPathParam("evaluationResults")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.EvaluationResultCollection.class,
                        ListEvaluationResultsResponse.Builder::evaluationResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEvaluationResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEvaluationResultsResponse.Builder::opcNextPage)
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
                        "AIServiceLanguage",
                        "ListModels",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Model/ListModels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModelsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("models")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("modelId", request.getModelId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.ModelCollection.class,
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
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProjectsResponse::builder)
                .logger(LOG, "listProjects")
                .serviceDetails(
                        "AIServiceLanguage",
                        "ListProjects",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Project/ListProjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProjectsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("projects")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("projectId", request.getProjectId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.ProjectCollection.class,
                        ListProjectsResponse.Builder::projectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProjectsResponse.Builder::opcNextPage)
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
                        "AIServiceLanguage",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.WorkRequestErrorCollection.class,
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
                        "AIServiceLanguage",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/WorkRequestLog/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.WorkRequestLogCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogCollection)
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
                        "AIServiceLanguage",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ailanguage.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResponse> updateEndpoint(
            UpdateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateEndpointRequest, UpdateEndpointResponse>
                    handler) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEndpointDetails(), "updateEndpointDetails is required");

        return clientCall(request, UpdateEndpointResponse::builder)
                .logger(LOG, "updateEndpoint")
                .serviceDetails(
                        "AIServiceLanguage",
                        "UpdateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Endpoint/UpdateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEndpointRequest::builder)
                .basePath("/20221001")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateEndpointResponse.Builder::opcWorkRequestId)
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
                        "AIServiceLanguage",
                        "UpdateModel",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Model/UpdateModel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelRequest::builder)
                .basePath("/20221001")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateModelResponse.Builder::opcWorkRequestId)
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
                        "AIServiceLanguage",
                        "UpdateProject",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Project/UpdateProject")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProjectRequest::builder)
                .basePath("/20221001")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateProjectResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
    public AIServiceLanguageAsyncClient(
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
