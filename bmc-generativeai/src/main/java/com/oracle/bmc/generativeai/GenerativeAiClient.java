/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.generativeai.requests.*;
import com.oracle.bmc.generativeai.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class GenerativeAiClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements GenerativeAi {
    /** Service instance for GenerativeAi. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("GENERATIVEAI")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://generativeai.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenerativeAiClient.class);

    private final GenerativeAiWaiters waiters;

    private final GenerativeAiPaginators paginators;

    GenerativeAiClient(
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
                                    .nameFormat("GenerativeAi-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new GenerativeAiWaiters(executorService, this);

        this.paginators = new GenerativeAiPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, GenerativeAiClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "generativeai";
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
        public GenerativeAiClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GenerativeAiClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeDedicatedAiClusterCompartmentResponse changeDedicatedAiClusterCompartment(
            ChangeDedicatedAiClusterCompartmentRequest request) {

        Validate.notBlank(
                request.getDedicatedAiClusterId(), "dedicatedAiClusterId must not be blank");
        Objects.requireNonNull(
                request.getChangeDedicatedAiClusterCompartmentDetails(),
                "changeDedicatedAiClusterCompartmentDetails is required");

        return clientCall(request, ChangeDedicatedAiClusterCompartmentResponse::builder)
                .logger(LOG, "changeDedicatedAiClusterCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeDedicatedAiClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/ChangeDedicatedAiClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDedicatedAiClusterCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("dedicatedAiClusters")
                .appendPathParam(request.getDedicatedAiClusterId())
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
                        ChangeDedicatedAiClusterCompartmentResponse.Builder::opcRequestId)
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
                        "GenerativeAi",
                        "ChangeEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/ChangeEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeEndpointCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeEndpointCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeGenerativeAiPrivateEndpointCompartmentResponse
            changeGenerativeAiPrivateEndpointCompartment(
                    ChangeGenerativeAiPrivateEndpointCompartmentRequest request) {

        Validate.notBlank(
                request.getGenerativeAiPrivateEndpointId(),
                "generativeAiPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeGenerativeAiPrivateEndpointCompartmentDetails(),
                "changeGenerativeAiPrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangeGenerativeAiPrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeGenerativeAiPrivateEndpointCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeGenerativeAiPrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/ChangeGenerativeAiPrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeGenerativeAiPrivateEndpointCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiPrivateEndpoints")
                .appendPathParam(request.getGenerativeAiPrivateEndpointId())
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
                        ChangeGenerativeAiPrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeGenerativeAiPrivateEndpointCompartmentResponse.Builder
                                ::opcWorkRequestId)
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
                        "GenerativeAi",
                        "ChangeModelCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/ChangeModelCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeModelCompartmentRequest::builder)
                .basePath("/20231130")
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
    public CreateDedicatedAiClusterResponse createDedicatedAiCluster(
            CreateDedicatedAiClusterRequest request) {
        Objects.requireNonNull(
                request.getCreateDedicatedAiClusterDetails(),
                "createDedicatedAiClusterDetails is required");

        return clientCall(request, CreateDedicatedAiClusterResponse::builder)
                .logger(LOG, "createDedicatedAiCluster")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateDedicatedAiCluster",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/CreateDedicatedAiCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDedicatedAiClusterRequest::builder)
                .basePath("/20231130")
                .appendPathParam("dedicatedAiClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.DedicatedAiCluster.class,
                        CreateDedicatedAiClusterResponse.Builder::dedicatedAiCluster)
                .handleResponseHeaderString("etag", CreateDedicatedAiClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDedicatedAiClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDedicatedAiClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "model-deprecation-info",
                        CreateDedicatedAiClusterResponse.Builder::modelDeprecationInfo)
                .callSync();
    }

    @Override
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreateEndpointDetails(), "createEndpointDetails is required");

        return clientCall(request, CreateEndpointResponse::builder)
                .logger(LOG, "createEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/CreateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEndpointRequest::builder)
                .basePath("/20231130")
                .appendPathParam("endpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.Endpoint.class,
                        CreateEndpointResponse.Builder::endpoint)
                .handleResponseHeaderString("etag", CreateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "model-deprecation-info",
                        CreateEndpointResponse.Builder::modelDeprecationInfo)
                .callSync();
    }

    @Override
    public CreateGenerativeAiPrivateEndpointResponse createGenerativeAiPrivateEndpoint(
            CreateGenerativeAiPrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreateGenerativeAiPrivateEndpointDetails(),
                "createGenerativeAiPrivateEndpointDetails is required");

        return clientCall(request, CreateGenerativeAiPrivateEndpointResponse::builder)
                .logger(LOG, "createGenerativeAiPrivateEndpoint")
                .serviceDetails("GenerativeAi", "CreateGenerativeAiPrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGenerativeAiPrivateEndpointRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiPrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpoint.class,
                        CreateGenerativeAiPrivateEndpointResponse.Builder
                                ::generativeAiPrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", CreateGenerativeAiPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateGenerativeAiPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateGenerativeAiPrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateModelResponse createModel(CreateModelRequest request) {
        Objects.requireNonNull(request.getCreateModelDetails(), "createModelDetails is required");

        return clientCall(request, CreateModelResponse::builder)
                .logger(LOG, "createModel")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/CreateModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateModelRequest::builder)
                .basePath("/20231130")
                .appendPathParam("models")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.Model.class,
                        CreateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", CreateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateModelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "model-deprecation-info", CreateModelResponse.Builder::modelDeprecationInfo)
                .callSync();
    }

    @Override
    public DeleteDedicatedAiClusterResponse deleteDedicatedAiCluster(
            DeleteDedicatedAiClusterRequest request) {

        Validate.notBlank(
                request.getDedicatedAiClusterId(), "dedicatedAiClusterId must not be blank");

        return clientCall(request, DeleteDedicatedAiClusterResponse::builder)
                .logger(LOG, "deleteDedicatedAiCluster")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteDedicatedAiCluster",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/DeleteDedicatedAiCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDedicatedAiClusterRequest::builder)
                .basePath("/20231130")
                .appendPathParam("dedicatedAiClusters")
                .appendPathParam(request.getDedicatedAiClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDedicatedAiClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDedicatedAiClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");

        return clientCall(request, DeleteEndpointResponse::builder)
                .logger(LOG, "deleteEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/DeleteEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEndpointRequest::builder)
                .basePath("/20231130")
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
    public DeleteGenerativeAiPrivateEndpointResponse deleteGenerativeAiPrivateEndpoint(
            DeleteGenerativeAiPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getGenerativeAiPrivateEndpointId(),
                "generativeAiPrivateEndpointId must not be blank");

        return clientCall(request, DeleteGenerativeAiPrivateEndpointResponse::builder)
                .logger(LOG, "deleteGenerativeAiPrivateEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteGenerativeAiPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/DeleteGenerativeAiPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGenerativeAiPrivateEndpointRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiPrivateEndpoints")
                .appendPathParam(request.getGenerativeAiPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteGenerativeAiPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteGenerativeAiPrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteModelResponse deleteModel(DeleteModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, DeleteModelResponse::builder)
                .logger(LOG, "deleteModel")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/DeleteModel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteModelRequest::builder)
                .basePath("/20231130")
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
    public GetDedicatedAiClusterResponse getDedicatedAiCluster(
            GetDedicatedAiClusterRequest request) {

        Validate.notBlank(
                request.getDedicatedAiClusterId(), "dedicatedAiClusterId must not be blank");

        return clientCall(request, GetDedicatedAiClusterResponse::builder)
                .logger(LOG, "getDedicatedAiCluster")
                .serviceDetails(
                        "GenerativeAi",
                        "GetDedicatedAiCluster",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/GetDedicatedAiCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDedicatedAiClusterRequest::builder)
                .basePath("/20231130")
                .appendPathParam("dedicatedAiClusters")
                .appendPathParam(request.getDedicatedAiClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.DedicatedAiCluster.class,
                        GetDedicatedAiClusterResponse.Builder::dedicatedAiCluster)
                .handleResponseHeaderString("etag", GetDedicatedAiClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDedicatedAiClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetEndpointResponse getEndpoint(GetEndpointRequest request) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");

        return clientCall(request, GetEndpointResponse::builder)
                .logger(LOG, "getEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "GetEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/GetEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEndpointRequest::builder)
                .basePath("/20231130")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.Endpoint.class,
                        GetEndpointResponse.Builder::endpoint)
                .handleResponseHeaderString("etag", GetEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetGenerativeAiPrivateEndpointResponse getGenerativeAiPrivateEndpoint(
            GetGenerativeAiPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getGenerativeAiPrivateEndpointId(),
                "generativeAiPrivateEndpointId must not be blank");

        return clientCall(request, GetGenerativeAiPrivateEndpointResponse::builder)
                .logger(LOG, "getGenerativeAiPrivateEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "GetGenerativeAiPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/GetGenerativeAiPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGenerativeAiPrivateEndpointRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiPrivateEndpoints")
                .appendPathParam(request.getGenerativeAiPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpoint.class,
                        GetGenerativeAiPrivateEndpointResponse.Builder::generativeAiPrivateEndpoint)
                .handleResponseHeaderString(
                        "etag", GetGenerativeAiPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetGenerativeAiPrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetModelResponse getModel(GetModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        return clientCall(request, GetModelResponse::builder)
                .logger(LOG, "getModel")
                .serviceDetails(
                        "GenerativeAi",
                        "GetModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/GetModel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetModelRequest::builder)
                .basePath("/20231130")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.Model.class,
                        GetModelResponse.Builder::model)
                .handleResponseHeaderString("etag", GetModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "GenerativeAi",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20231130")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListDedicatedAiClustersResponse listDedicatedAiClusters(
            ListDedicatedAiClustersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDedicatedAiClustersResponse::builder)
                .logger(LOG, "listDedicatedAiClusters")
                .serviceDetails(
                        "GenerativeAi",
                        "ListDedicatedAiClusters",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiClusterCollection/ListDedicatedAiClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDedicatedAiClustersRequest::builder)
                .basePath("/20231130")
                .appendPathParam("dedicatedAiClusters")
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
                        com.oracle.bmc.generativeai.model.DedicatedAiClusterCollection.class,
                        ListDedicatedAiClustersResponse.Builder::dedicatedAiClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDedicatedAiClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDedicatedAiClustersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEndpointsResponse::builder)
                .logger(LOG, "listEndpoints")
                .serviceDetails(
                        "GenerativeAi",
                        "ListEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/EndpointCollection/ListEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEndpointsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("endpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam(
                        "generativeAiPrivateEndpointId", request.getGenerativeAiPrivateEndpointId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.EndpointCollection.class,
                        ListEndpointsResponse.Builder::endpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEndpointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListGenerativeAiPrivateEndpointsResponse listGenerativeAiPrivateEndpoints(
            ListGenerativeAiPrivateEndpointsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListGenerativeAiPrivateEndpointsResponse::builder)
                .logger(LOG, "listGenerativeAiPrivateEndpoints")
                .serviceDetails(
                        "GenerativeAi",
                        "ListGenerativeAiPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpointCollection/ListGenerativeAiPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGenerativeAiPrivateEndpointsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiPrivateEndpoints")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpointCollection
                                .class,
                        ListGenerativeAiPrivateEndpointsResponse.Builder
                                ::generativeAiPrivateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListGenerativeAiPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListGenerativeAiPrivateEndpointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListModelsResponse listModels(ListModelsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListModelsResponse::builder)
                .logger(LOG, "listModels")
                .serviceDetails(
                        "GenerativeAi",
                        "ListModels",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ModelCollection/ListModels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListModelsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("models")
                .appendQueryParam("vendor", request.getVendor())
                .appendListQueryParam(
                        "capability",
                        request.getCapability(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
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
                        com.oracle.bmc.generativeai.model.ModelCollection.class,
                        ListModelsResponse.Builder::modelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListModelsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "GenerativeAi",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.WorkRequestErrorCollection.class,
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
                        "GenerativeAi",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.WorkRequestLogEntryCollection.class,
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
                .serviceDetails(
                        "GenerativeAi",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20231130")
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateDedicatedAiClusterResponse updateDedicatedAiCluster(
            UpdateDedicatedAiClusterRequest request) {

        Validate.notBlank(
                request.getDedicatedAiClusterId(), "dedicatedAiClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDedicatedAiClusterDetails(),
                "updateDedicatedAiClusterDetails is required");

        return clientCall(request, UpdateDedicatedAiClusterResponse::builder)
                .logger(LOG, "updateDedicatedAiCluster")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateDedicatedAiCluster",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/UpdateDedicatedAiCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDedicatedAiClusterRequest::builder)
                .basePath("/20231130")
                .appendPathParam("dedicatedAiClusters")
                .appendPathParam(request.getDedicatedAiClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.DedicatedAiCluster.class,
                        UpdateDedicatedAiClusterResponse.Builder::dedicatedAiCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDedicatedAiClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDedicatedAiClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateDedicatedAiClusterResponse.Builder::etag)
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
                        "GenerativeAi",
                        "UpdateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/UpdateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEndpointRequest::builder)
                .basePath("/20231130")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.Endpoint.class,
                        UpdateEndpointResponse.Builder::endpoint)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateEndpointResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateGenerativeAiPrivateEndpointResponse updateGenerativeAiPrivateEndpoint(
            UpdateGenerativeAiPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getGenerativeAiPrivateEndpointId(),
                "generativeAiPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateGenerativeAiPrivateEndpointDetails(),
                "updateGenerativeAiPrivateEndpointDetails is required");

        return clientCall(request, UpdateGenerativeAiPrivateEndpointResponse::builder)
                .logger(LOG, "updateGenerativeAiPrivateEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateGenerativeAiPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/UpdateGenerativeAiPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGenerativeAiPrivateEndpointRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiPrivateEndpoints")
                .appendPathParam(request.getGenerativeAiPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpoint.class,
                        UpdateGenerativeAiPrivateEndpointResponse.Builder
                                ::generativeAiPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateGenerativeAiPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateGenerativeAiPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateGenerativeAiPrivateEndpointResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateModelResponse updateModel(UpdateModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(request.getUpdateModelDetails(), "updateModelDetails is required");

        return clientCall(request, UpdateModelResponse::builder)
                .logger(LOG, "updateModel")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/UpdateModel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateModelRequest::builder)
                .basePath("/20231130")
                .appendPathParam("models")
                .appendPathParam(request.getModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.Model.class,
                        UpdateModelResponse.Builder::model)
                .handleResponseHeaderString("etag", UpdateModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GenerativeAiWaiters getWaiters() {
        return waiters;
    }

    @Override
    public GenerativeAiPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GenerativeAiClient(
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
    public GenerativeAiClient(
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
    public GenerativeAiClient(
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
    public GenerativeAiClient(
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
    public GenerativeAiClient(
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
    public GenerativeAiClient(
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
    public GenerativeAiClient(
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
    public GenerativeAiClient(
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
