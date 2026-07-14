/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
                    .serviceName(GenerativeAiClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://generativeai.{region}.{dualStack?ds.:}oci.{secondLevelDomain}")
                    .endpointServiceName("generativeai")
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
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
    public AddArtifactResponse addArtifact(AddArtifactRequest request) {
        Objects.requireNonNull(request.getAddArtifactDetails(), "addArtifactDetails is required");

        Validate.notBlank(request.getHostedDeploymentId(), "hostedDeploymentId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedDeploymentId", request.getHostedDeploymentId());

        return clientCall(request, AddArtifactResponse::builder)
                .logger(LOG, "addArtifact")
                .serviceDetails(
                        "GenerativeAi",
                        "AddArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/AddArtifact")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddArtifactRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedDeployments")
                .appendPathParam(request.getHostedDeploymentId())
                .appendPathParam("artifacts")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", AddArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelVectorStoreConnectorFileSyncResponse cancelVectorStoreConnectorFileSync(
            CancelVectorStoreConnectorFileSyncRequest request) {

        Validate.notBlank(
                request.getVectorStoreConnectorFileSyncId(),
                "vectorStoreConnectorFileSyncId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "vectorStoreConnectorFileSyncId", request.getVectorStoreConnectorFileSyncId());

        return clientCall(request, CancelVectorStoreConnectorFileSyncResponse::builder)
                .logger(LOG, "cancelVectorStoreConnectorFileSync")
                .serviceDetails(
                        "GenerativeAi",
                        "CancelVectorStoreConnectorFileSync",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorFileSync/CancelVectorStoreConnectorFileSync")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelVectorStoreConnectorFileSyncRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectorFileSyncs")
                .appendPathParam(request.getVectorStoreConnectorFileSyncId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelVectorStoreConnectorFileSyncResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelVectorStoreConnectorFileSyncResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeApiKeyCompartmentResponse changeApiKeyCompartment(
            ChangeApiKeyCompartmentRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");
        Objects.requireNonNull(
                request.getChangeApiKeyCompartmentDetails(),
                "changeApiKeyCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("apiKeyId", request.getApiKeyId());

        return clientCall(request, ChangeApiKeyCompartmentResponse::builder)
                .logger(LOG, "changeApiKeyCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeApiKeyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/ChangeApiKeyCompartment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeApiKeyCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("apikeys")
                .appendPathParam(request.getApiKeyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeApiKeyCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDedicatedAiClusterCompartmentResponse changeDedicatedAiClusterCompartment(
            ChangeDedicatedAiClusterCompartmentRequest request) {

        Validate.notBlank(
                request.getDedicatedAiClusterId(), "dedicatedAiClusterId must not be blank");
        Objects.requireNonNull(
                request.getChangeDedicatedAiClusterCompartmentDetails(),
                "changeDedicatedAiClusterCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("dedicatedAiClusterId", request.getDedicatedAiClusterId());

        return clientCall(request, ChangeDedicatedAiClusterCompartmentResponse::builder)
                .logger(LOG, "changeDedicatedAiClusterCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeDedicatedAiClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/ChangeDedicatedAiClusterCompartment")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("endpointId", request.getEndpointId());

        return clientCall(request, ChangeEndpointCompartmentResponse::builder)
                .logger(LOG, "changeEndpointCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/ChangeEndpointCompartment")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "generativeAiPrivateEndpointId", request.getGenerativeAiPrivateEndpointId());

        return clientCall(request, ChangeGenerativeAiPrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeGenerativeAiPrivateEndpointCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeGenerativeAiPrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/ChangeGenerativeAiPrivateEndpointCompartment")
                .requiredParametersMap(requiredParametersMap)
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
    public ChangeGenerativeAiProjectCompartmentResponse changeGenerativeAiProjectCompartment(
            ChangeGenerativeAiProjectCompartmentRequest request) {

        Validate.notBlank(
                request.getGenerativeAiProjectId(), "generativeAiProjectId must not be blank");
        Objects.requireNonNull(
                request.getChangeGenerativeAiProjectCompartmentDetails(),
                "changeGenerativeAiProjectCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("generativeAiProjectId", request.getGenerativeAiProjectId());

        return clientCall(request, ChangeGenerativeAiProjectCompartmentResponse::builder)
                .logger(LOG, "changeGenerativeAiProjectCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeGenerativeAiProjectCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/ChangeGenerativeAiProjectCompartment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeGenerativeAiProjectCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiProjects")
                .appendPathParam(request.getGenerativeAiProjectId())
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
                        ChangeGenerativeAiProjectCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeHostedApplicationCompartmentResponse changeHostedApplicationCompartment(
            ChangeHostedApplicationCompartmentRequest request) {

        Validate.notBlank(
                request.getHostedApplicationId(), "hostedApplicationId must not be blank");
        Objects.requireNonNull(
                request.getChangeHostedApplicationCompartmentDetails(),
                "changeHostedApplicationCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedApplicationId", request.getHostedApplicationId());

        return clientCall(request, ChangeHostedApplicationCompartmentResponse::builder)
                .logger(LOG, "changeHostedApplicationCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeHostedApplicationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/ChangeHostedApplicationCompartment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeHostedApplicationCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplications")
                .appendPathParam(request.getHostedApplicationId())
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
                        ChangeHostedApplicationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeHostedApplicationIamCompartmentResponse changeHostedApplicationIamCompartment(
            ChangeHostedApplicationIamCompartmentRequest request) {

        Validate.notBlank(
                request.getHostedApplicationIamId(), "hostedApplicationIamId must not be blank");
        Objects.requireNonNull(
                request.getChangeHostedApplicationCompartmentDetails(),
                "changeHostedApplicationCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedApplicationIamId", request.getHostedApplicationIamId());

        return clientCall(request, ChangeHostedApplicationIamCompartmentResponse::builder)
                .logger(LOG, "changeHostedApplicationIamCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeHostedApplicationIamCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationIam/ChangeHostedApplicationIamCompartment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeHostedApplicationIamCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationsIam")
                .appendPathParam(request.getHostedApplicationIamId())
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
                        ChangeHostedApplicationIamCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeHostedApplicationStorageCompartmentResponse
            changeHostedApplicationStorageCompartment(
                    ChangeHostedApplicationStorageCompartmentRequest request) {

        Validate.notBlank(
                request.getHostedApplicationStorageId(),
                "hostedApplicationStorageId must not be blank");
        Objects.requireNonNull(
                request.getChangeHostedApplicationStorageCompartmentDetails(),
                "changeHostedApplicationStorageCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "hostedApplicationStorageId", request.getHostedApplicationStorageId());

        return clientCall(request, ChangeHostedApplicationStorageCompartmentResponse::builder)
                .logger(LOG, "changeHostedApplicationStorageCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeHostedApplicationStorageCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorage/ChangeHostedApplicationStorageCompartment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeHostedApplicationStorageCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationStorages")
                .appendPathParam(request.getHostedApplicationStorageId())
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
                        ChangeHostedApplicationStorageCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeImportedModelCompartmentResponse changeImportedModelCompartment(
            ChangeImportedModelCompartmentRequest request) {

        Validate.notBlank(request.getImportedModelId(), "importedModelId must not be blank");
        Objects.requireNonNull(
                request.getChangeImportedModelCompartmentDetails(),
                "changeImportedModelCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("importedModelId", request.getImportedModelId());

        return clientCall(request, ChangeImportedModelCompartmentResponse::builder)
                .logger(LOG, "changeImportedModelCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeImportedModelCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/ChangeImportedModelCompartment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeImportedModelCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("importedModels")
                .appendPathParam(request.getImportedModelId())
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
                        ChangeImportedModelCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeModelCompartmentResponse changeModelCompartment(
            ChangeModelCompartmentRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(
                request.getChangeModelCompartmentDetails(),
                "changeModelCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("modelId", request.getModelId());

        return clientCall(request, ChangeModelCompartmentResponse::builder)
                .logger(LOG, "changeModelCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeModelCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/ChangeModelCompartment")
                .requiredParametersMap(requiredParametersMap)
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
    public ChangeSemanticStoreCompartmentResponse changeSemanticStoreCompartment(
            ChangeSemanticStoreCompartmentRequest request) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");
        Objects.requireNonNull(
                request.getChangeSemanticStoreCompartmentDetails(),
                "changeSemanticStoreCompartmentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("semanticStoreId", request.getSemanticStoreId());

        return clientCall(request, ChangeSemanticStoreCompartmentResponse::builder)
                .logger(LOG, "changeSemanticStoreCompartment")
                .serviceDetails(
                        "GenerativeAi",
                        "ChangeSemanticStoreCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/ChangeSemanticStoreCompartment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSemanticStoreCompartmentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
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
                        ChangeSemanticStoreCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSemanticStoreCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) {
        Objects.requireNonNull(request.getCreateApiKeyDetails(), "createApiKeyDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateApiKeyResponse::builder)
                .logger(LOG, "createApiKey")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/CreateApiKey")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApiKeyRequest::builder)
                .basePath("/20231130")
                .appendPathParam("apikeys")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.ApiKey.class,
                        CreateApiKeyResponse.Builder::apiKey)
                .handleResponseHeaderString("etag", CreateApiKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApiKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDedicatedAiClusterResponse createDedicatedAiCluster(
            CreateDedicatedAiClusterRequest request) {
        Objects.requireNonNull(
                request.getCreateDedicatedAiClusterDetails(),
                "createDedicatedAiClusterDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateDedicatedAiClusterResponse::builder)
                .logger(LOG, "createDedicatedAiCluster")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateDedicatedAiCluster",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/CreateDedicatedAiCluster")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateEndpointResponse::builder)
                .logger(LOG, "createEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/CreateEndpoint")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateGenerativeAiPrivateEndpointResponse::builder)
                .logger(LOG, "createGenerativeAiPrivateEndpoint")
                .serviceDetails("GenerativeAi", "CreateGenerativeAiPrivateEndpoint", "")
                .requiredParametersMap(requiredParametersMap)
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
    public CreateGenerativeAiProjectResponse createGenerativeAiProject(
            CreateGenerativeAiProjectRequest request) {
        Objects.requireNonNull(
                request.getCreateGenerativeAiProjectDetails(),
                "createGenerativeAiProjectDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateGenerativeAiProjectResponse::builder)
                .logger(LOG, "createGenerativeAiProject")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateGenerativeAiProject",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/CreateGenerativeAiProject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGenerativeAiProjectRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiProjects")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.GenerativeAiProject.class,
                        CreateGenerativeAiProjectResponse.Builder::generativeAiProject)
                .handleResponseHeaderString("etag", CreateGenerativeAiProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateGenerativeAiProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGenerativeAiProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateHostedApplicationResponse createHostedApplication(
            CreateHostedApplicationRequest request) {
        Objects.requireNonNull(
                request.getCreateHostedApplicationDetails(),
                "createHostedApplicationDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateHostedApplicationResponse::builder)
                .logger(LOG, "createHostedApplication")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateHostedApplication",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/CreateHostedApplication")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateHostedApplicationRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplications")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.HostedApplication.class,
                        CreateHostedApplicationResponse.Builder::hostedApplication)
                .handleResponseHeaderString("etag", CreateHostedApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateHostedApplicationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateHostedApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateHostedApplicationIamResponse createHostedApplicationIam(
            CreateHostedApplicationIamRequest request) {
        Objects.requireNonNull(
                request.getCreateHostedApplicationIamDetails(),
                "createHostedApplicationIamDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateHostedApplicationIamResponse::builder)
                .logger(LOG, "createHostedApplicationIam")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateHostedApplicationIam",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationIam/CreateHostedApplicationIam")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateHostedApplicationIamRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationsIam")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.HostedApplicationIam.class,
                        CreateHostedApplicationIamResponse.Builder::hostedApplicationIam)
                .handleResponseHeaderString(
                        "etag", CreateHostedApplicationIamResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateHostedApplicationIamResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateHostedApplicationIamResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateHostedApplicationStorageResponse createHostedApplicationStorage(
            CreateHostedApplicationStorageRequest request) {
        Objects.requireNonNull(
                request.getCreateHostedApplicationStorageDetails(),
                "createHostedApplicationStorageDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateHostedApplicationStorageResponse::builder)
                .logger(LOG, "createHostedApplicationStorage")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateHostedApplicationStorage",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorage/CreateHostedApplicationStorage")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateHostedApplicationStorageRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationStorages")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.HostedApplicationStorage.class,
                        CreateHostedApplicationStorageResponse.Builder::hostedApplicationStorage)
                .handleResponseHeaderString(
                        "etag", CreateHostedApplicationStorageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateHostedApplicationStorageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateHostedApplicationStorageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateHostedDeploymentResponse createHostedDeployment(
            CreateHostedDeploymentRequest request) {
        Objects.requireNonNull(
                request.getCreateHostedDeploymentDetails(),
                "createHostedDeploymentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateHostedDeploymentResponse::builder)
                .logger(LOG, "createHostedDeployment")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateHostedDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/CreateHostedDeployment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateHostedDeploymentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedDeployments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.HostedDeployment.class,
                        CreateHostedDeploymentResponse.Builder::hostedDeployment)
                .handleResponseHeaderString("etag", CreateHostedDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateHostedDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateHostedDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateImportedModelResponse createImportedModel(CreateImportedModelRequest request) {
        Objects.requireNonNull(
                request.getCreateImportedModelDetails(), "createImportedModelDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateImportedModelResponse::builder)
                .logger(LOG, "createImportedModel")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateImportedModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/CreateImportedModel")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateImportedModelRequest::builder)
                .basePath("/20231130")
                .appendPathParam("importedModels")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.ImportedModel.class,
                        CreateImportedModelResponse.Builder::importedModel)
                .handleResponseHeaderString("etag", CreateImportedModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateImportedModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateImportedModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateModelResponse createModel(CreateModelRequest request) {
        Objects.requireNonNull(request.getCreateModelDetails(), "createModelDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateModelResponse::builder)
                .logger(LOG, "createModel")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/CreateModel")
                .requiredParametersMap(requiredParametersMap)
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
    public CreateSemanticStoreResponse createSemanticStore(CreateSemanticStoreRequest request) {
        Objects.requireNonNull(
                request.getCreateSemanticStoreDetails(), "createSemanticStoreDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateSemanticStoreResponse::builder)
                .logger(LOG, "createSemanticStore")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateSemanticStore",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/CreateSemanticStore")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSemanticStoreRequest::builder)
                .basePath("/20231130")
                .appendPathParam("semanticStores")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.SemanticStore.class,
                        CreateSemanticStoreResponse.Builder::semanticStore)
                .handleResponseHeaderString("etag", CreateSemanticStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSemanticStoreResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSemanticStoreResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateVectorStoreConnectorResponse createVectorStoreConnector(
            CreateVectorStoreConnectorRequest request) {
        Objects.requireNonNull(
                request.getCreateVectorStoreConnectorDetails(),
                "createVectorStoreConnectorDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateVectorStoreConnectorResponse::builder)
                .logger(LOG, "createVectorStoreConnector")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateVectorStoreConnector",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnector/CreateVectorStoreConnector")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVectorStoreConnectorRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectors")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.VectorStoreConnector.class,
                        CreateVectorStoreConnectorResponse.Builder::vectorStoreConnector)
                .handleResponseHeaderString(
                        "etag", CreateVectorStoreConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVectorStoreConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVectorStoreConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVectorStoreConnectorFileSyncResponse createVectorStoreConnectorFileSync(
            CreateVectorStoreConnectorFileSyncRequest request) {
        Objects.requireNonNull(
                request.getCreateVectorStoreConnectorFileSyncDetails(),
                "createVectorStoreConnectorFileSyncDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, CreateVectorStoreConnectorFileSyncResponse::builder)
                .logger(LOG, "createVectorStoreConnectorFileSync")
                .serviceDetails(
                        "GenerativeAi",
                        "CreateVectorStoreConnectorFileSync",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorFileSync/CreateVectorStoreConnectorFileSync")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVectorStoreConnectorFileSyncRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectorFileSyncs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSync.class,
                        CreateVectorStoreConnectorFileSyncResponse.Builder
                                ::vectorStoreConnectorFileSync)
                .handleResponseHeaderString(
                        "etag", CreateVectorStoreConnectorFileSyncResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVectorStoreConnectorFileSyncResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateVectorStoreConnectorFileSyncResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("apiKeyId", request.getApiKeyId());

        return clientCall(request, DeleteApiKeyResponse::builder)
                .logger(LOG, "deleteApiKey")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/DeleteApiKey")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApiKeyRequest::builder)
                .basePath("/20231130")
                .appendPathParam("apikeys")
                .appendPathParam(request.getApiKeyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApiKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDedicatedAiClusterResponse deleteDedicatedAiCluster(
            DeleteDedicatedAiClusterRequest request) {

        Validate.notBlank(
                request.getDedicatedAiClusterId(), "dedicatedAiClusterId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("dedicatedAiClusterId", request.getDedicatedAiClusterId());

        return clientCall(request, DeleteDedicatedAiClusterResponse::builder)
                .logger(LOG, "deleteDedicatedAiCluster")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteDedicatedAiCluster",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/DeleteDedicatedAiCluster")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("endpointId", request.getEndpointId());

        return clientCall(request, DeleteEndpointResponse::builder)
                .logger(LOG, "deleteEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/DeleteEndpoint")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "generativeAiPrivateEndpointId", request.getGenerativeAiPrivateEndpointId());

        return clientCall(request, DeleteGenerativeAiPrivateEndpointResponse::builder)
                .logger(LOG, "deleteGenerativeAiPrivateEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteGenerativeAiPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/DeleteGenerativeAiPrivateEndpoint")
                .requiredParametersMap(requiredParametersMap)
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
    public DeleteGenerativeAiProjectResponse deleteGenerativeAiProject(
            DeleteGenerativeAiProjectRequest request) {

        Validate.notBlank(
                request.getGenerativeAiProjectId(), "generativeAiProjectId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("generativeAiProjectId", request.getGenerativeAiProjectId());

        return clientCall(request, DeleteGenerativeAiProjectResponse::builder)
                .logger(LOG, "deleteGenerativeAiProject")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteGenerativeAiProject",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/DeleteGenerativeAiProject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGenerativeAiProjectRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiProjects")
                .appendPathParam(request.getGenerativeAiProjectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteGenerativeAiProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGenerativeAiProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteHostedApplicationResponse deleteHostedApplication(
            DeleteHostedApplicationRequest request) {

        Validate.notBlank(
                request.getHostedApplicationId(), "hostedApplicationId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedApplicationId", request.getHostedApplicationId());

        return clientCall(request, DeleteHostedApplicationResponse::builder)
                .logger(LOG, "deleteHostedApplication")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteHostedApplication",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/DeleteHostedApplication")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHostedApplicationRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplications")
                .appendPathParam(request.getHostedApplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteHostedApplicationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteHostedApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteHostedApplicationIamResponse deleteHostedApplicationIam(
            DeleteHostedApplicationIamRequest request) {

        Validate.notBlank(
                request.getHostedApplicationIamId(), "hostedApplicationIamId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedApplicationIamId", request.getHostedApplicationIamId());

        return clientCall(request, DeleteHostedApplicationIamResponse::builder)
                .logger(LOG, "deleteHostedApplicationIam")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteHostedApplicationIam",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationIam/DeleteHostedApplicationIam")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHostedApplicationIamRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationsIam")
                .appendPathParam(request.getHostedApplicationIamId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteHostedApplicationIamResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteHostedApplicationIamResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteHostedApplicationStorageResponse deleteHostedApplicationStorage(
            DeleteHostedApplicationStorageRequest request) {

        Validate.notBlank(
                request.getHostedApplicationStorageId(),
                "hostedApplicationStorageId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "hostedApplicationStorageId", request.getHostedApplicationStorageId());

        return clientCall(request, DeleteHostedApplicationStorageResponse::builder)
                .logger(LOG, "deleteHostedApplicationStorage")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteHostedApplicationStorage",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorage/DeleteHostedApplicationStorage")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHostedApplicationStorageRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationStorages")
                .appendPathParam(request.getHostedApplicationStorageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteHostedApplicationStorageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteHostedApplicationStorageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteHostedDeploymentResponse deleteHostedDeployment(
            DeleteHostedDeploymentRequest request) {

        Validate.notBlank(request.getHostedDeploymentId(), "hostedDeploymentId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedDeploymentId", request.getHostedDeploymentId());

        return clientCall(request, DeleteHostedDeploymentResponse::builder)
                .logger(LOG, "deleteHostedDeployment")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteHostedDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/DeleteHostedDeployment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHostedDeploymentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedDeployments")
                .appendPathParam(request.getHostedDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteHostedDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteHostedDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteHostedDeploymentArtifactResponse deleteHostedDeploymentArtifact(
            DeleteHostedDeploymentArtifactRequest request) {

        Validate.notBlank(request.getHostedDeploymentId(), "hostedDeploymentId must not be blank");

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedDeploymentId", request.getHostedDeploymentId());
        requiredParametersMap.put("artifactId", request.getArtifactId());

        return clientCall(request, DeleteHostedDeploymentArtifactResponse::builder)
                .logger(LOG, "deleteHostedDeploymentArtifact")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteHostedDeploymentArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/DeleteHostedDeploymentArtifact")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHostedDeploymentArtifactRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedDeployments")
                .appendPathParam(request.getHostedDeploymentId())
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteHostedDeploymentArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteHostedDeploymentArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteImportedModelResponse deleteImportedModel(DeleteImportedModelRequest request) {

        Validate.notBlank(request.getImportedModelId(), "importedModelId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("importedModelId", request.getImportedModelId());

        return clientCall(request, DeleteImportedModelResponse::builder)
                .logger(LOG, "deleteImportedModel")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteImportedModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/DeleteImportedModel")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteImportedModelRequest::builder)
                .basePath("/20231130")
                .appendPathParam("importedModels")
                .appendPathParam(request.getImportedModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteImportedModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteImportedModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteModelResponse deleteModel(DeleteModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("modelId", request.getModelId());

        return clientCall(request, DeleteModelResponse::builder)
                .logger(LOG, "deleteModel")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/DeleteModel")
                .requiredParametersMap(requiredParametersMap)
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
    public DeleteSemanticStoreResponse deleteSemanticStore(DeleteSemanticStoreRequest request) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("semanticStoreId", request.getSemanticStoreId());

        return clientCall(request, DeleteSemanticStoreResponse::builder)
                .logger(LOG, "deleteSemanticStore")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteSemanticStore",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/DeleteSemanticStore")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSemanticStoreRequest::builder)
                .basePath("/20231130")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteSemanticStoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSemanticStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVectorStoreConnectorResponse deleteVectorStoreConnector(
            DeleteVectorStoreConnectorRequest request) {

        Validate.notBlank(
                request.getVectorStoreConnectorId(), "vectorStoreConnectorId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("vectorStoreConnectorId", request.getVectorStoreConnectorId());

        return clientCall(request, DeleteVectorStoreConnectorResponse::builder)
                .logger(LOG, "deleteVectorStoreConnector")
                .serviceDetails(
                        "GenerativeAi",
                        "DeleteVectorStoreConnector",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnector/DeleteVectorStoreConnector")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVectorStoreConnectorRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectors")
                .appendPathParam(request.getVectorStoreConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteVectorStoreConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVectorStoreConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetApiKeyResponse getApiKey(GetApiKeyRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("apiKeyId", request.getApiKeyId());

        return clientCall(request, GetApiKeyResponse::builder)
                .logger(LOG, "getApiKey")
                .serviceDetails(
                        "GenerativeAi",
                        "GetApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/GetApiKey")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApiKeyRequest::builder)
                .basePath("/20231130")
                .appendPathParam("apikeys")
                .appendPathParam(request.getApiKeyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.ApiKey.class,
                        GetApiKeyResponse.Builder::apiKey)
                .handleResponseHeaderString("etag", GetApiKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApiKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDedicatedAiClusterResponse getDedicatedAiCluster(
            GetDedicatedAiClusterRequest request) {

        Validate.notBlank(
                request.getDedicatedAiClusterId(), "dedicatedAiClusterId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("dedicatedAiClusterId", request.getDedicatedAiClusterId());

        return clientCall(request, GetDedicatedAiClusterResponse::builder)
                .logger(LOG, "getDedicatedAiCluster")
                .serviceDetails(
                        "GenerativeAi",
                        "GetDedicatedAiCluster",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/GetDedicatedAiCluster")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("endpointId", request.getEndpointId());

        return clientCall(request, GetEndpointResponse::builder)
                .logger(LOG, "getEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "GetEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/GetEndpoint")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "generativeAiPrivateEndpointId", request.getGenerativeAiPrivateEndpointId());

        return clientCall(request, GetGenerativeAiPrivateEndpointResponse::builder)
                .logger(LOG, "getGenerativeAiPrivateEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "GetGenerativeAiPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/GetGenerativeAiPrivateEndpoint")
                .requiredParametersMap(requiredParametersMap)
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
    public GetGenerativeAiProjectResponse getGenerativeAiProject(
            GetGenerativeAiProjectRequest request) {

        Validate.notBlank(
                request.getGenerativeAiProjectId(), "generativeAiProjectId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("generativeAiProjectId", request.getGenerativeAiProjectId());

        return clientCall(request, GetGenerativeAiProjectResponse::builder)
                .logger(LOG, "getGenerativeAiProject")
                .serviceDetails(
                        "GenerativeAi",
                        "GetGenerativeAiProject",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/GetGenerativeAiProject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGenerativeAiProjectRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiProjects")
                .appendPathParam(request.getGenerativeAiProjectId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.GenerativeAiProject.class,
                        GetGenerativeAiProjectResponse.Builder::generativeAiProject)
                .handleResponseHeaderString("etag", GetGenerativeAiProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGenerativeAiProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetHostedApplicationResponse getHostedApplication(GetHostedApplicationRequest request) {

        Validate.notBlank(
                request.getHostedApplicationId(), "hostedApplicationId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedApplicationId", request.getHostedApplicationId());

        return clientCall(request, GetHostedApplicationResponse::builder)
                .logger(LOG, "getHostedApplication")
                .serviceDetails(
                        "GenerativeAi",
                        "GetHostedApplication",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/GetHostedApplication")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHostedApplicationRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplications")
                .appendPathParam(request.getHostedApplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.HostedApplication.class,
                        GetHostedApplicationResponse.Builder::hostedApplication)
                .handleResponseHeaderString("etag", GetHostedApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetHostedApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetHostedApplicationIamResponse getHostedApplicationIam(
            GetHostedApplicationIamRequest request) {

        Validate.notBlank(
                request.getHostedApplicationIamId(), "hostedApplicationIamId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedApplicationIamId", request.getHostedApplicationIamId());

        return clientCall(request, GetHostedApplicationIamResponse::builder)
                .logger(LOG, "getHostedApplicationIam")
                .serviceDetails(
                        "GenerativeAi",
                        "GetHostedApplicationIam",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationIam/GetHostedApplicationIam")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHostedApplicationIamRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationsIam")
                .appendPathParam(request.getHostedApplicationIamId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.HostedApplicationIam.class,
                        GetHostedApplicationIamResponse.Builder::hostedApplicationIam)
                .handleResponseHeaderString("etag", GetHostedApplicationIamResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetHostedApplicationIamResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetHostedApplicationStorageResponse getHostedApplicationStorage(
            GetHostedApplicationStorageRequest request) {

        Validate.notBlank(
                request.getHostedApplicationStorageId(),
                "hostedApplicationStorageId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "hostedApplicationStorageId", request.getHostedApplicationStorageId());

        return clientCall(request, GetHostedApplicationStorageResponse::builder)
                .logger(LOG, "getHostedApplicationStorage")
                .serviceDetails(
                        "GenerativeAi",
                        "GetHostedApplicationStorage",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorage/GetHostedApplicationStorage")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHostedApplicationStorageRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationStorages")
                .appendPathParam(request.getHostedApplicationStorageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.HostedApplicationStorage.class,
                        GetHostedApplicationStorageResponse.Builder::hostedApplicationStorage)
                .handleResponseHeaderString(
                        "etag", GetHostedApplicationStorageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetHostedApplicationStorageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetHostedDeploymentResponse getHostedDeployment(GetHostedDeploymentRequest request) {

        Validate.notBlank(request.getHostedDeploymentId(), "hostedDeploymentId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedDeploymentId", request.getHostedDeploymentId());

        return clientCall(request, GetHostedDeploymentResponse::builder)
                .logger(LOG, "getHostedDeployment")
                .serviceDetails(
                        "GenerativeAi",
                        "GetHostedDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/GetHostedDeployment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHostedDeploymentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedDeployments")
                .appendPathParam(request.getHostedDeploymentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.HostedDeployment.class,
                        GetHostedDeploymentResponse.Builder::hostedDeployment)
                .handleResponseHeaderString("etag", GetHostedDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetHostedDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetImportedModelResponse getImportedModel(GetImportedModelRequest request) {

        Validate.notBlank(request.getImportedModelId(), "importedModelId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("importedModelId", request.getImportedModelId());

        return clientCall(request, GetImportedModelResponse::builder)
                .logger(LOG, "getImportedModel")
                .serviceDetails(
                        "GenerativeAi",
                        "GetImportedModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/GetImportedModel")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetImportedModelRequest::builder)
                .basePath("/20231130")
                .appendPathParam("importedModels")
                .appendPathParam(request.getImportedModelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.ImportedModel.class,
                        GetImportedModelResponse.Builder::importedModel)
                .handleResponseHeaderString("etag", GetImportedModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetImportedModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetModelResponse getModel(GetModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("modelId", request.getModelId());

        return clientCall(request, GetModelResponse::builder)
                .logger(LOG, "getModel")
                .serviceDetails(
                        "GenerativeAi",
                        "GetModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/GetModel")
                .requiredParametersMap(requiredParametersMap)
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
    public GetSemanticStoreResponse getSemanticStore(GetSemanticStoreRequest request) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("semanticStoreId", request.getSemanticStoreId());

        return clientCall(request, GetSemanticStoreResponse::builder)
                .logger(LOG, "getSemanticStore")
                .serviceDetails(
                        "GenerativeAi",
                        "GetSemanticStore",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/GetSemanticStore")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSemanticStoreRequest::builder)
                .basePath("/20231130")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.SemanticStore.class,
                        GetSemanticStoreResponse.Builder::semanticStore)
                .handleResponseHeaderString("etag", GetSemanticStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSemanticStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVectorStoreConnectorResponse getVectorStoreConnector(
            GetVectorStoreConnectorRequest request) {

        Validate.notBlank(
                request.getVectorStoreConnectorId(), "vectorStoreConnectorId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("vectorStoreConnectorId", request.getVectorStoreConnectorId());

        return clientCall(request, GetVectorStoreConnectorResponse::builder)
                .logger(LOG, "getVectorStoreConnector")
                .serviceDetails(
                        "GenerativeAi",
                        "GetVectorStoreConnector",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnector/GetVectorStoreConnector")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVectorStoreConnectorRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectors")
                .appendPathParam(request.getVectorStoreConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.VectorStoreConnector.class,
                        GetVectorStoreConnectorResponse.Builder::vectorStoreConnector)
                .handleResponseHeaderString("etag", GetVectorStoreConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVectorStoreConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVectorStoreConnectorFileSyncResponse getVectorStoreConnectorFileSync(
            GetVectorStoreConnectorFileSyncRequest request) {

        Validate.notBlank(
                request.getVectorStoreConnectorFileSyncId(),
                "vectorStoreConnectorFileSyncId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "vectorStoreConnectorFileSyncId", request.getVectorStoreConnectorFileSyncId());

        return clientCall(request, GetVectorStoreConnectorFileSyncResponse::builder)
                .logger(LOG, "getVectorStoreConnectorFileSync")
                .serviceDetails(
                        "GenerativeAi",
                        "GetVectorStoreConnectorFileSync",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorFileSync/GetVectorStoreConnectorFileSync")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVectorStoreConnectorFileSyncRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectorFileSyncs")
                .appendPathParam(request.getVectorStoreConnectorFileSyncId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSync.class,
                        GetVectorStoreConnectorFileSyncResponse.Builder
                                ::vectorStoreConnectorFileSync)
                .handleResponseHeaderString(
                        "etag", GetVectorStoreConnectorFileSyncResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetVectorStoreConnectorFileSyncResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVectorStoreConnectorStatsResponse getVectorStoreConnectorStats(
            GetVectorStoreConnectorStatsRequest request) {

        Validate.notBlank(
                request.getVectorStoreConnectorId(), "vectorStoreConnectorId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("vectorStoreConnectorId", request.getVectorStoreConnectorId());

        return clientCall(request, GetVectorStoreConnectorStatsResponse::builder)
                .logger(LOG, "getVectorStoreConnectorStats")
                .serviceDetails(
                        "GenerativeAi",
                        "GetVectorStoreConnectorStats",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorStats/GetVectorStoreConnectorStats")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVectorStoreConnectorStatsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectors")
                .appendPathParam(request.getVectorStoreConnectorId())
                .appendPathParam("stats")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.VectorStoreConnectorStats.class,
                        GetVectorStoreConnectorStatsResponse.Builder::vectorStoreConnectorStats)
                .handleResponseHeaderString(
                        "etag", GetVectorStoreConnectorStatsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetVectorStoreConnectorStatsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "GenerativeAi",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequest/GetWorkRequest")
                .requiredParametersMap(requiredParametersMap)
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
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListApiKeysResponse::builder)
                .logger(LOG, "listApiKeys")
                .serviceDetails(
                        "GenerativeAi",
                        "ListApiKeys",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKeyCollection/ListApiKeys")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApiKeysRequest::builder)
                .basePath("/20231130")
                .appendPathParam("apikeys")
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
                        com.oracle.bmc.generativeai.model.ApiKeyCollection.class,
                        ListApiKeysResponse.Builder::apiKeyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApiKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApiKeysResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDedicatedAiClustersResponse listDedicatedAiClusters(
            ListDedicatedAiClustersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListDedicatedAiClustersResponse::builder)
                .logger(LOG, "listDedicatedAiClusters")
                .serviceDetails(
                        "GenerativeAi",
                        "ListDedicatedAiClusters",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiClusterCollection/ListDedicatedAiClusters")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListEndpointsResponse::builder)
                .logger(LOG, "listEndpoints")
                .serviceDetails(
                        "GenerativeAi",
                        "ListEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/EndpointCollection/ListEndpoints")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListGenerativeAiPrivateEndpointsResponse::builder)
                .logger(LOG, "listGenerativeAiPrivateEndpoints")
                .serviceDetails(
                        "GenerativeAi",
                        "ListGenerativeAiPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpointCollection/ListGenerativeAiPrivateEndpoints")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGenerativeAiPrivateEndpointsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiPrivateEndpoints")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("resourceType", request.getResourceType())
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
    public ListGenerativeAiProjectsResponse listGenerativeAiProjects(
            ListGenerativeAiProjectsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListGenerativeAiProjectsResponse::builder)
                .logger(LOG, "listGenerativeAiProjects")
                .serviceDetails(
                        "GenerativeAi",
                        "ListGenerativeAiProjects",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProjectCollection/ListGenerativeAiProjects")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGenerativeAiProjectsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiProjects")
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
                        com.oracle.bmc.generativeai.model.GenerativeAiProjectCollection.class,
                        ListGenerativeAiProjectsResponse.Builder::generativeAiProjectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGenerativeAiProjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGenerativeAiProjectsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListHostedApplicationStoragesResponse listHostedApplicationStorages(
            ListHostedApplicationStoragesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListHostedApplicationStoragesResponse::builder)
                .logger(LOG, "listHostedApplicationStorages")
                .serviceDetails(
                        "GenerativeAi",
                        "ListHostedApplicationStorages",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationStorageCollection/ListHostedApplicationStorages")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHostedApplicationStoragesRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationStorages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam(
                        "hostedApplicationStorageType", request.getHostedApplicationStorageType())
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
                        com.oracle.bmc.generativeai.model.HostedApplicationStorageCollection.class,
                        ListHostedApplicationStoragesResponse.Builder
                                ::hostedApplicationStorageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListHostedApplicationStoragesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHostedApplicationStoragesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListHostedApplicationsResponse listHostedApplications(
            ListHostedApplicationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListHostedApplicationsResponse::builder)
                .logger(LOG, "listHostedApplications")
                .serviceDetails(
                        "GenerativeAi",
                        "ListHostedApplications",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationCollection/ListHostedApplications")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHostedApplicationsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplications")
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
                        com.oracle.bmc.generativeai.model.HostedApplicationCollection.class,
                        ListHostedApplicationsResponse.Builder::hostedApplicationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHostedApplicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHostedApplicationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListHostedApplicationsIamResponse listHostedApplicationsIam(
            ListHostedApplicationsIamRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListHostedApplicationsIamResponse::builder)
                .logger(LOG, "listHostedApplicationsIam")
                .serviceDetails(
                        "GenerativeAi",
                        "ListHostedApplicationsIam",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationCollection/ListHostedApplicationsIam")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHostedApplicationsIamRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationsIam")
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
                        com.oracle.bmc.generativeai.model.HostedApplicationCollection.class,
                        ListHostedApplicationsIamResponse.Builder::hostedApplicationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHostedApplicationsIamResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHostedApplicationsIamResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListHostedDeploymentsResponse listHostedDeployments(
            ListHostedDeploymentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListHostedDeploymentsResponse::builder)
                .logger(LOG, "listHostedDeployments")
                .serviceDetails(
                        "GenerativeAi",
                        "ListHostedDeployments",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeploymentCollection/ListHostedDeployments")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHostedDeploymentsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedDeployments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("applicationId", request.getApplicationId())
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
                        com.oracle.bmc.generativeai.model.HostedDeploymentCollection.class,
                        ListHostedDeploymentsResponse.Builder::hostedDeploymentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHostedDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHostedDeploymentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListImportedModelsResponse listImportedModels(ListImportedModelsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListImportedModelsResponse::builder)
                .logger(LOG, "listImportedModels")
                .serviceDetails(
                        "GenerativeAi",
                        "ListImportedModels",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModelCollection/ListImportedModels")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListImportedModelsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("importedModels")
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
                        com.oracle.bmc.generativeai.model.ImportedModelCollection.class,
                        ListImportedModelsResponse.Builder::importedModelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListImportedModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListImportedModelsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListModelsResponse listModels(ListModelsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListModelsResponse::builder)
                .logger(LOG, "listModels")
                .serviceDetails(
                        "GenerativeAi",
                        "ListModels",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ModelCollection/ListModels")
                .requiredParametersMap(requiredParametersMap)
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
    public ListSemanticStoresResponse listSemanticStores(ListSemanticStoresRequest request) {

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, ListSemanticStoresResponse::builder)
                .logger(LOG, "listSemanticStores")
                .serviceDetails(
                        "GenerativeAi",
                        "ListSemanticStores",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStoreCollection/ListSemanticStores")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSemanticStoresRequest::builder)
                .basePath("/20231130")
                .appendPathParam("semanticStores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam(
                        "dataSourceQueryingConnectionId",
                        request.getDataSourceQueryingConnectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.SemanticStoreCollection.class,
                        ListSemanticStoresResponse.Builder::semanticStoreCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSemanticStoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSemanticStoresResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVectorStoreConnectorFileSyncIngestionLogsResponse
            listVectorStoreConnectorFileSyncIngestionLogs(
                    ListVectorStoreConnectorFileSyncIngestionLogsRequest request) {

        Validate.notBlank(
                request.getVectorStoreConnectorFileSyncId(),
                "vectorStoreConnectorFileSyncId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "vectorStoreConnectorFileSyncId", request.getVectorStoreConnectorFileSyncId());

        return clientCall(request, ListVectorStoreConnectorFileSyncIngestionLogsResponse::builder)
                .logger(LOG, "listVectorStoreConnectorFileSyncIngestionLogs")
                .serviceDetails(
                        "GenerativeAi",
                        "ListVectorStoreConnectorFileSyncIngestionLogs",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/FileSyncIngestionLogsCollection/ListVectorStoreConnectorFileSyncIngestionLogs")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVectorStoreConnectorFileSyncIngestionLogsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectorFileSyncs")
                .appendPathParam(request.getVectorStoreConnectorFileSyncId())
                .appendPathParam("ingestionLogs")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.FileSyncIngestionLogsCollection.class,
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse.Builder
                                ::fileSyncIngestionLogsCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVectorStoreConnectorFileSyncIngestionLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVectorStoreConnectorFileSyncsResponse listVectorStoreConnectorFileSyncs(
            ListVectorStoreConnectorFileSyncsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListVectorStoreConnectorFileSyncsResponse::builder)
                .logger(LOG, "listVectorStoreConnectorFileSyncs")
                .serviceDetails(
                        "GenerativeAi",
                        "ListVectorStoreConnectorFileSyncs",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorFileSyncCollection/ListVectorStoreConnectorFileSyncs")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVectorStoreConnectorFileSyncsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectorFileSyncs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("vectorStoreConnectorId", request.getVectorStoreConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSyncCollection
                                .class,
                        ListVectorStoreConnectorFileSyncsResponse.Builder
                                ::vectorStoreConnectorFileSyncCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVectorStoreConnectorFileSyncsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListVectorStoreConnectorFileSyncsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVectorStoreConnectorIngestionLogsResponse listVectorStoreConnectorIngestionLogs(
            ListVectorStoreConnectorIngestionLogsRequest request) {

        Validate.notBlank(
                request.getVectorStoreConnectorId(), "vectorStoreConnectorId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("vectorStoreConnectorId", request.getVectorStoreConnectorId());

        return clientCall(request, ListVectorStoreConnectorIngestionLogsResponse::builder)
                .logger(LOG, "listVectorStoreConnectorIngestionLogs")
                .serviceDetails(
                        "GenerativeAi",
                        "ListVectorStoreConnectorIngestionLogs",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorIngestionLogsCollection/ListVectorStoreConnectorIngestionLogs")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVectorStoreConnectorIngestionLogsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectors")
                .appendPathParam(request.getVectorStoreConnectorId())
                .appendPathParam("ingestionLogs")
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeai.model
                                .VectorStoreConnectorIngestionLogsCollection.class,
                        ListVectorStoreConnectorIngestionLogsResponse.Builder
                                ::vectorStoreConnectorIngestionLogsCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListVectorStoreConnectorIngestionLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVectorStoreConnectorIngestionLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVectorStoreConnectorsResponse listVectorStoreConnectors(
            ListVectorStoreConnectorsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListVectorStoreConnectorsResponse::builder)
                .logger(LOG, "listVectorStoreConnectors")
                .serviceDetails(
                        "GenerativeAi",
                        "ListVectorStoreConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnectorCollection/ListVectorStoreConnectors")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVectorStoreConnectorsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("vectorStoreId", request.getVectorStoreId())
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
                        com.oracle.bmc.generativeai.model.VectorStoreConnectorCollection.class,
                        ListVectorStoreConnectorsResponse.Builder::vectorStoreConnectorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVectorStoreConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVectorStoreConnectorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "GenerativeAi",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequestError/ListWorkRequestErrors")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "GenerativeAi",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequestLogEntry/ListWorkRequestLogs")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "GenerativeAi",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/WorkRequest/ListWorkRequests")
                .requiredParametersMap(requiredParametersMap)
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
    public RenewApiKeyResponse renewApiKey(RenewApiKeyRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");
        Objects.requireNonNull(request.getRenewApiKeyDetails(), "renewApiKeyDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("apiKeyId", request.getApiKeyId());

        return clientCall(request, RenewApiKeyResponse::builder)
                .logger(LOG, "renewApiKey")
                .serviceDetails(
                        "GenerativeAi",
                        "RenewApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/RenewApiKey")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RenewApiKeyRequest::builder)
                .basePath("/20231130")
                .appendPathParam("apikeys")
                .appendPathParam(request.getApiKeyId())
                .appendPathParam("actions")
                .appendPathParam("renew")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.ApiKey.class,
                        RenewApiKeyResponse.Builder::apiKey)
                .handleResponseHeaderString(
                        "opc-request-id", RenewApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RenewApiKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public SetApiKeyStateResponse setApiKeyState(SetApiKeyStateRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");
        Objects.requireNonNull(
                request.getSetApiKeyStateDetails(), "setApiKeyStateDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("apiKeyId", request.getApiKeyId());

        return clientCall(request, SetApiKeyStateResponse::builder)
                .logger(LOG, "setApiKeyState")
                .serviceDetails(
                        "GenerativeAi",
                        "SetApiKeyState",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/SetApiKeyState")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SetApiKeyStateRequest::builder)
                .basePath("/20231130")
                .appendPathParam("apikeys")
                .appendPathParam(request.getApiKeyId())
                .appendPathParam("actions")
                .appendPathParam("setstate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.ApiKey.class,
                        SetApiKeyStateResponse.Builder::apiKey)
                .handleResponseHeaderString(
                        "opc-request-id", SetApiKeyStateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", SetApiKeyStateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateApiKeyResponse updateApiKey(UpdateApiKeyRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");
        Objects.requireNonNull(request.getUpdateApiKeyDetails(), "updateApiKeyDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("apiKeyId", request.getApiKeyId());

        return clientCall(request, UpdateApiKeyResponse::builder)
                .logger(LOG, "updateApiKey")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ApiKey/UpdateApiKey")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApiKeyRequest::builder)
                .basePath("/20231130")
                .appendPathParam("apikeys")
                .appendPathParam(request.getApiKeyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.ApiKey.class,
                        UpdateApiKeyResponse.Builder::apiKey)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateApiKeyResponse.Builder::etag)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("dedicatedAiClusterId", request.getDedicatedAiClusterId());

        return clientCall(request, UpdateDedicatedAiClusterResponse::builder)
                .logger(LOG, "updateDedicatedAiCluster")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateDedicatedAiCluster",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/DedicatedAiCluster/UpdateDedicatedAiCluster")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("endpointId", request.getEndpointId());

        return clientCall(request, UpdateEndpointResponse::builder)
                .logger(LOG, "updateEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Endpoint/UpdateEndpoint")
                .requiredParametersMap(requiredParametersMap)
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

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put(
                "generativeAiPrivateEndpointId", request.getGenerativeAiPrivateEndpointId());

        return clientCall(request, UpdateGenerativeAiPrivateEndpointResponse::builder)
                .logger(LOG, "updateGenerativeAiPrivateEndpoint")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateGenerativeAiPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiPrivateEndpoint/UpdateGenerativeAiPrivateEndpoint")
                .requiredParametersMap(requiredParametersMap)
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
    public UpdateGenerativeAiProjectResponse updateGenerativeAiProject(
            UpdateGenerativeAiProjectRequest request) {

        Validate.notBlank(
                request.getGenerativeAiProjectId(), "generativeAiProjectId must not be blank");
        Objects.requireNonNull(
                request.getUpdateGenerativeAiProjectDetails(),
                "updateGenerativeAiProjectDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("generativeAiProjectId", request.getGenerativeAiProjectId());

        return clientCall(request, UpdateGenerativeAiProjectResponse::builder)
                .logger(LOG, "updateGenerativeAiProject")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateGenerativeAiProject",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/GenerativeAiProject/UpdateGenerativeAiProject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGenerativeAiProjectRequest::builder)
                .basePath("/20231130")
                .appendPathParam("generativeAiProjects")
                .appendPathParam(request.getGenerativeAiProjectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.GenerativeAiProject.class,
                        UpdateGenerativeAiProjectResponse.Builder::generativeAiProject)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateGenerativeAiProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGenerativeAiProjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateGenerativeAiProjectResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateHostedApplicationResponse updateHostedApplication(
            UpdateHostedApplicationRequest request) {

        Validate.notBlank(
                request.getHostedApplicationId(), "hostedApplicationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHostedApplicationDetails(),
                "updateHostedApplicationDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedApplicationId", request.getHostedApplicationId());

        return clientCall(request, UpdateHostedApplicationResponse::builder)
                .logger(LOG, "updateHostedApplication")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateHostedApplication",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplication/UpdateHostedApplication")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHostedApplicationRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplications")
                .appendPathParam(request.getHostedApplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateHostedApplicationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHostedApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateHostedApplicationIamResponse updateHostedApplicationIam(
            UpdateHostedApplicationIamRequest request) {

        Validate.notBlank(
                request.getHostedApplicationIamId(), "hostedApplicationIamId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHostedApplicationIamDetails(),
                "updateHostedApplicationIamDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedApplicationIamId", request.getHostedApplicationIamId());

        return clientCall(request, UpdateHostedApplicationIamResponse::builder)
                .logger(LOG, "updateHostedApplicationIam")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateHostedApplicationIam",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedApplicationIam/UpdateHostedApplicationIam")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHostedApplicationIamRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedApplicationsIam")
                .appendPathParam(request.getHostedApplicationIamId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateHostedApplicationIamResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHostedApplicationIamResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateHostedDeploymentResponse updateHostedDeployment(
            UpdateHostedDeploymentRequest request) {

        Validate.notBlank(request.getHostedDeploymentId(), "hostedDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHostedDeploymentDetails(),
                "updateHostedDeploymentDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("hostedDeploymentId", request.getHostedDeploymentId());

        return clientCall(request, UpdateHostedDeploymentResponse::builder)
                .logger(LOG, "updateHostedDeployment")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateHostedDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/HostedDeployment/UpdateHostedDeployment")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHostedDeploymentRequest::builder)
                .basePath("/20231130")
                .appendPathParam("hostedDeployments")
                .appendPathParam(request.getHostedDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.HostedDeployment.class,
                        UpdateHostedDeploymentResponse.Builder::hostedDeployment)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateHostedDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHostedDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateHostedDeploymentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateImportedModelResponse updateImportedModel(UpdateImportedModelRequest request) {

        Validate.notBlank(request.getImportedModelId(), "importedModelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateImportedModelDetails(), "updateImportedModelDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("importedModelId", request.getImportedModelId());

        return clientCall(request, UpdateImportedModelResponse::builder)
                .logger(LOG, "updateImportedModel")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateImportedModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/ImportedModel/UpdateImportedModel")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateImportedModelRequest::builder)
                .basePath("/20231130")
                .appendPathParam("importedModels")
                .appendPathParam(request.getImportedModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.ImportedModel.class,
                        UpdateImportedModelResponse.Builder::importedModel)
                .handleResponseHeaderString("etag", UpdateImportedModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateImportedModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateImportedModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateModelResponse updateModel(UpdateModelRequest request) {

        Validate.notBlank(request.getModelId(), "modelId must not be blank");
        Objects.requireNonNull(request.getUpdateModelDetails(), "updateModelDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("modelId", request.getModelId());

        return clientCall(request, UpdateModelResponse::builder)
                .logger(LOG, "updateModel")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateModel",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/Model/UpdateModel")
                .requiredParametersMap(requiredParametersMap)
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
    public UpdateSemanticStoreResponse updateSemanticStore(UpdateSemanticStoreRequest request) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSemanticStoreDetails(), "updateSemanticStoreDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("semanticStoreId", request.getSemanticStoreId());

        return clientCall(request, UpdateSemanticStoreResponse::builder)
                .logger(LOG, "updateSemanticStore")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateSemanticStore",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/SemanticStore/UpdateSemanticStore")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSemanticStoreRequest::builder)
                .basePath("/20231130")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.SemanticStore.class,
                        UpdateSemanticStoreResponse.Builder::semanticStore)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSemanticStoreResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateSemanticStoreResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateVectorStoreConnectorResponse updateVectorStoreConnector(
            UpdateVectorStoreConnectorRequest request) {

        Validate.notBlank(
                request.getVectorStoreConnectorId(), "vectorStoreConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVectorStoreConnectorDetails(),
                "updateVectorStoreConnectorDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("vectorStoreConnectorId", request.getVectorStoreConnectorId());

        return clientCall(request, UpdateVectorStoreConnectorResponse::builder)
                .logger(LOG, "updateVectorStoreConnector")
                .serviceDetails(
                        "GenerativeAi",
                        "UpdateVectorStoreConnector",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai/20231130/VectorStoreConnector/UpdateVectorStoreConnector")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVectorStoreConnectorRequest::builder)
                .basePath("/20231130")
                .appendPathParam("vectorStoreConnectors")
                .appendPathParam(request.getVectorStoreConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeai.model.VectorStoreConnector.class,
                        UpdateVectorStoreConnectorResponse.Builder::vectorStoreConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateVectorStoreConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVectorStoreConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateVectorStoreConnectorResponse.Builder::etag)
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
