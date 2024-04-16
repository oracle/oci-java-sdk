/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ailanguage.requests.*;
import com.oracle.bmc.ailanguage.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class AIServiceLanguageClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements AIServiceLanguage {
    /** Service instance for AIServiceLanguage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("AISERVICELANGUAGE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://language.aiservice.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AIServiceLanguageClient.class);

    private final AIServiceLanguageWaiters waiters;

    private final AIServiceLanguagePaginators paginators;

    AIServiceLanguageClient(
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
                                    .nameFormat("AIServiceLanguage-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new AIServiceLanguageWaiters(executorService, this);

        this.paginators = new AIServiceLanguagePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AIServiceLanguageClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ailanguage";
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
        public AIServiceLanguageClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AIServiceLanguageClient(
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
    public BatchDetectDominantLanguageResponse batchDetectDominantLanguage(
            BatchDetectDominantLanguageRequest request) {
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
                .callSync();
    }

    @Override
    public BatchDetectHealthEntityResponse batchDetectHealthEntity(
            BatchDetectHealthEntityRequest request) {
        Objects.requireNonNull(
                request.getBatchDetectHealthEntityDetails(),
                "batchDetectHealthEntityDetails is required");

        return clientCall(request, BatchDetectHealthEntityResponse::builder)
                .logger(LOG, "batchDetectHealthEntity")
                .serviceDetails(
                        "AIServiceLanguage",
                        "BatchDetectHealthEntity",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/BatchDetectHealthEntityDetails/BatchDetectHealthEntity")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchDetectHealthEntityRequest::builder)
                .basePath("/20221001")
                .appendPathParam("actions")
                .appendPathParam("batchDetectHealthEntities")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.BatchDetectHealthEntityResult.class,
                        BatchDetectHealthEntityResponse.Builder::batchDetectHealthEntityResult)
                .handleResponseHeaderString(
                        "opc-request-id", BatchDetectHealthEntityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BatchDetectLanguageEntitiesResponse batchDetectLanguageEntities(
            BatchDetectLanguageEntitiesRequest request) {
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
                .callSync();
    }

    @Override
    public BatchDetectLanguageKeyPhrasesResponse batchDetectLanguageKeyPhrases(
            BatchDetectLanguageKeyPhrasesRequest request) {
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
                .callSync();
    }

    @Override
    public BatchDetectLanguagePiiEntitiesResponse batchDetectLanguagePiiEntities(
            BatchDetectLanguagePiiEntitiesRequest request) {
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
                .callSync();
    }

    @Override
    public BatchDetectLanguageSentimentsResponse batchDetectLanguageSentiments(
            BatchDetectLanguageSentimentsRequest request) {
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
                .callSync();
    }

    @Override
    public BatchDetectLanguageTextClassificationResponse batchDetectLanguageTextClassification(
            BatchDetectLanguageTextClassificationRequest request) {
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
                .callSync();
    }

    @Override
    public BatchLanguageTranslationResponse batchLanguageTranslation(
            BatchLanguageTranslationRequest request) {
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
                .callSync();
    }

    @Override
    public CancelJobResponse cancelJob(CancelJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, CancelJobResponse::builder)
                .logger(LOG, "cancelJob")
                .serviceDetails(
                        "AIServiceLanguage",
                        "CancelJob",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Job/CancelJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelJobRequest::builder)
                .basePath("/20221001")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeEndpointCompartmentResponse changeEndpointCompartment(
            ChangeEndpointCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeEndpointCompartmentResponse.Builder::opcRequestId)
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
                        "AIServiceLanguage",
                        "ChangeJobCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Job/ChangeJobCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeJobCompartmentRequest::builder)
                .basePath("/20221001")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeJobCompartmentResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeProjectCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateJobResponse createJob(CreateJobRequest request) {
        Objects.requireNonNull(request.getCreateJobDetails(), "createJobDetails is required");

        return clientCall(request, CreateJobResponse::builder)
                .logger(LOG, "createJob")
                .serviceDetails(
                        "AIServiceLanguage",
                        "CreateJob",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Job/CreateJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJobRequest::builder)
                .basePath("/20221001")
                .appendPathParam("jobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Job.class, CreateJobResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateJobResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateModelResponse createModel(CreateModelRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateProjectResponse createProject(CreateProjectRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Project.class,
                        CreateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", CreateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateProjectResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, DeleteJobResponse::builder)
                .logger(LOG, "deleteJob")
                .serviceDetails(
                        "AIServiceLanguage",
                        "DeleteJob",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Job/DeleteJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJobRequest::builder)
                .basePath("/20221001")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
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
    public DeleteModelResponse deleteModel(DeleteModelRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetectDominantLanguageResponse detectDominantLanguage(
            DetectDominantLanguageRequest request) {
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
                .callSync();
    }

    @Override
    public DetectLanguageEntitiesResponse detectLanguageEntities(
            DetectLanguageEntitiesRequest request) {
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
                .callSync();
    }

    @Override
    public DetectLanguageKeyPhrasesResponse detectLanguageKeyPhrases(
            DetectLanguageKeyPhrasesRequest request) {
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
                .callSync();
    }

    @Override
    public DetectLanguageSentimentsResponse detectLanguageSentiments(
            DetectLanguageSentimentsRequest request) {
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
                .callSync();
    }

    @Override
    public DetectLanguageTextClassificationResponse detectLanguageTextClassification(
            DetectLanguageTextClassificationRequest request) {
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
                .callSync();
    }

    @Override
    public GetEndpointResponse getEndpoint(GetEndpointRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Endpoint.class,
                        GetEndpointResponse.Builder::endpoint)
                .handleResponseHeaderString("etag", GetEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJobResponse getJob(GetJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobResponse::builder)
                .logger(LOG, "getJob")
                .serviceDetails(
                        "AIServiceLanguage",
                        "GetJob",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Job/GetJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobRequest::builder)
                .basePath("/20221001")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(com.oracle.bmc.ailanguage.model.Job.class, GetJobResponse.Builder::job)
                .handleResponseHeaderString("etag", GetJobResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetModelResponse getModel(GetModelRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Model.class,
                        GetModelResponse.Builder::model)
                .handleResponseHeaderString("etag", GetModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetModelTypeResponse getModelType(GetModelTypeRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.ModelTypeInfo.class,
                        GetModelTypeResponse.Builder::modelTypeInfo)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelTypeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetProjectResponse getProject(GetProjectRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Project.class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.EndpointCollection.class,
                        ListEndpointsResponse.Builder::endpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEndpointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListEvaluationResultsResponse listEvaluationResults(
            ListEvaluationResultsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.EvaluationResultCollection.class,
                        ListEvaluationResultsResponse.Builder::evaluationResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEvaluationResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEvaluationResultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJobsResponse listJobs(ListJobsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJobsResponse::builder)
                .logger(LOG, "listJobs")
                .serviceDetails(
                        "AIServiceLanguage",
                        "ListJobs",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Job/ListJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobsRequest::builder)
                .basePath("/20221001")
                .appendPathParam("jobs")
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
                        com.oracle.bmc.ailanguage.model.JobCollection.class,
                        ListJobsResponse.Builder::jobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListJobsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListModelsResponse listModels(ListModelsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.ModelCollection.class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.ProjectCollection.class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.WorkRequestErrorCollection.class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.WorkRequestLogCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogCollection)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateEndpointResponse updateEndpoint(UpdateEndpointRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateJobResponse updateJob(UpdateJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");
        Objects.requireNonNull(request.getUpdateJobDetails(), "updateJobDetails is required");

        return clientCall(request, UpdateJobResponse::builder)
                .logger(LOG, "updateJob")
                .serviceDetails(
                        "AIServiceLanguage",
                        "UpdateJob",
                        "https://docs.oracle.com/iaas/api/#/en/language/20221001/Job/UpdateJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJobRequest::builder)
                .basePath("/20221001")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ailanguage.model.Job.class, UpdateJobResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateJobResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateModelResponse updateModel(UpdateModelRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateModelResponse.Builder::opcWorkRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateProjectResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AIServiceLanguageWaiters getWaiters() {
        return waiters;
    }

    @Override
    public AIServiceLanguagePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceLanguageClient(
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
    public AIServiceLanguageClient(
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
    public AIServiceLanguageClient(
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
    public AIServiceLanguageClient(
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
    public AIServiceLanguageClient(
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
    public AIServiceLanguageClient(
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
    public AIServiceLanguageClient(
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
    public AIServiceLanguageClient(
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
