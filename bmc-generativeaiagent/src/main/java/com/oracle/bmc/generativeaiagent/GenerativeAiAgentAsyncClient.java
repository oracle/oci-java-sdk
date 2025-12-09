/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.generativeaiagent.requests.*;
import com.oracle.bmc.generativeaiagent.responses.*;

import java.util.Objects;

/**
 * Async client implementation for GenerativeAiAgent service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
public class GenerativeAiAgentAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements GenerativeAiAgentAsync {
    /** Service instance for GenerativeAiAgent. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(GenerativeAiAgentClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://agent.generativeai.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenerativeAiAgentAsyncClient.class);

    GenerativeAiAgentAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    GenerativeAiAgentAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "GenerativeAiAgentAsyncClient", "getDataIngestionJobLogContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, GenerativeAiAgentAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "generativeaiagent";
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
        public GenerativeAiAgentAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GenerativeAiAgentAsyncClient(
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
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20240531")
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
    public java.util.concurrent.Future<ChangeAgentCompartmentResponse> changeAgentCompartment(
            ChangeAgentCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeAgentCompartmentRequest, ChangeAgentCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");
        Objects.requireNonNull(
                request.getChangeAgentCompartmentDetails(),
                "changeAgentCompartmentDetails is required");

        return clientCall(request, ChangeAgentCompartmentResponse::builder)
                .logger(LOG, "changeAgentCompartment")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "ChangeAgentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Agent/ChangeAgentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAgentCompartmentRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAgentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeAgentCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAgentEndpointCompartmentResponse>
            changeAgentEndpointCompartment(
                    ChangeAgentEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAgentEndpointCompartmentRequest,
                                    ChangeAgentEndpointCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getAgentEndpointId(), "agentEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeAgentEndpointCompartmentDetails(),
                "changeAgentEndpointCompartmentDetails is required");

        return clientCall(request, ChangeAgentEndpointCompartmentResponse::builder)
                .logger(LOG, "changeAgentEndpointCompartment")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "ChangeAgentEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/AgentEndpoint/ChangeAgentEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAgentEndpointCompartmentRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendPathParam(request.getAgentEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAgentEndpointCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAgentEndpointCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeKnowledgeBaseCompartmentResponse>
            changeKnowledgeBaseCompartment(
                    ChangeKnowledgeBaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeKnowledgeBaseCompartmentRequest,
                                    ChangeKnowledgeBaseCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getKnowledgeBaseId(), "knowledgeBaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeKnowledgeBaseCompartmentDetails(),
                "changeKnowledgeBaseCompartmentDetails is required");

        return clientCall(request, ChangeKnowledgeBaseCompartmentResponse::builder)
                .logger(LOG, "changeKnowledgeBaseCompartment")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "ChangeKnowledgeBaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/KnowledgeBase/ChangeKnowledgeBaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeKnowledgeBaseCompartmentRequest::builder)
                .basePath("/20240531")
                .appendPathParam("knowledgeBases")
                .appendPathParam(request.getKnowledgeBaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeKnowledgeBaseCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeKnowledgeBaseCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentResponse> createAgent(
            CreateAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateAgentRequest, CreateAgentResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateAgentDetails(), "createAgentDetails is required");

        return clientCall(request, CreateAgentResponse::builder)
                .logger(LOG, "createAgent")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "CreateAgent",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Agent/CreateAgent")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAgentRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agents")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.Agent.class,
                        CreateAgentResponse.Builder::agent)
                .handleResponseHeaderString("location", CreateAgentResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateAgentResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateAgentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAgentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentEndpointResponse> createAgentEndpoint(
            CreateAgentEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAgentEndpointRequest, CreateAgentEndpointResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAgentEndpointDetails(), "createAgentEndpointDetails is required");

        return clientCall(request, CreateAgentEndpointResponse::builder)
                .logger(LOG, "createAgentEndpoint")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "CreateAgentEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/AgentEndpoint/CreateAgentEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAgentEndpointRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.AgentEndpoint.class,
                        CreateAgentEndpointResponse.Builder::agentEndpoint)
                .handleResponseHeaderString(
                        "location", CreateAgentEndpointResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateAgentEndpointResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateAgentEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAgentEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAgentEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataIngestionJobResponse> createDataIngestionJob(
            CreateDataIngestionJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataIngestionJobRequest, CreateDataIngestionJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDataIngestionJobDetails(),
                "createDataIngestionJobDetails is required");

        return clientCall(request, CreateDataIngestionJobResponse::builder)
                .logger(LOG, "createDataIngestionJob")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "CreateDataIngestionJob",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataIngestionJob/CreateDataIngestionJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataIngestionJobRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataIngestionJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.DataIngestionJob.class,
                        CreateDataIngestionJobResponse.Builder::dataIngestionJob)
                .handleResponseHeaderString(
                        "location", CreateDataIngestionJobResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateDataIngestionJobResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateDataIngestionJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDataIngestionJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataIngestionJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResponse> createDataSource(
            CreateDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataSourceRequest, CreateDataSourceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDataSourceDetails(), "createDataSourceDetails is required");

        return clientCall(request, CreateDataSourceResponse::builder)
                .logger(LOG, "createDataSource")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "CreateDataSource",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataSource/CreateDataSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataSourceRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataSources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.DataSource.class,
                        CreateDataSourceResponse.Builder::dataSource)
                .handleResponseHeaderString("location", CreateDataSourceResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateDataSourceResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateDataSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDataSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateKnowledgeBaseResponse> createKnowledgeBase(
            CreateKnowledgeBaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateKnowledgeBaseRequest, CreateKnowledgeBaseResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateKnowledgeBaseDetails(), "createKnowledgeBaseDetails is required");

        return clientCall(request, CreateKnowledgeBaseResponse::builder)
                .logger(LOG, "createKnowledgeBase")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "CreateKnowledgeBase",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/KnowledgeBase/CreateKnowledgeBase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateKnowledgeBaseRequest::builder)
                .basePath("/20240531")
                .appendPathParam("knowledgeBases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.KnowledgeBase.class,
                        CreateKnowledgeBaseResponse.Builder::knowledgeBase)
                .handleResponseHeaderString(
                        "location", CreateKnowledgeBaseResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateKnowledgeBaseResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateKnowledgeBaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateKnowledgeBaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKnowledgeBaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateToolResponse> createTool(
            CreateToolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateToolRequest, CreateToolResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateToolDetails(), "createToolDetails is required");

        return clientCall(request, CreateToolResponse::builder)
                .logger(LOG, "createTool")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "CreateTool",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Tool/CreateTool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateToolRequest::builder)
                .basePath("/20240531")
                .appendPathParam("tools")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.Tool.class,
                        CreateToolResponse.Builder::tool)
                .handleResponseHeaderString("location", CreateToolResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateToolResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateToolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateToolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateToolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentResponse> deleteAgent(
            DeleteAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteAgentRequest, DeleteAgentResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");

        return clientCall(request, DeleteAgentResponse::builder)
                .logger(LOG, "deleteAgent")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "DeleteAgent",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Agent/DeleteAgent")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAgentRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAgentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAgentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentEndpointResponse> deleteAgentEndpoint(
            DeleteAgentEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAgentEndpointRequest, DeleteAgentEndpointResponse>
                    handler) {

        Validate.notBlank(request.getAgentEndpointId(), "agentEndpointId must not be blank");

        return clientCall(request, DeleteAgentEndpointResponse::builder)
                .logger(LOG, "deleteAgentEndpoint")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "DeleteAgentEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/AgentEndpoint/DeleteAgentEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAgentEndpointRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendPathParam(request.getAgentEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAgentEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAgentEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataIngestionJobResponse> deleteDataIngestionJob(
            DeleteDataIngestionJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataIngestionJobRequest, DeleteDataIngestionJobResponse>
                    handler) {

        Validate.notBlank(request.getDataIngestionJobId(), "dataIngestionJobId must not be blank");

        return clientCall(request, DeleteDataIngestionJobResponse::builder)
                .logger(LOG, "deleteDataIngestionJob")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "DeleteDataIngestionJob",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataIngestionJob/DeleteDataIngestionJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataIngestionJobRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataIngestionJobs")
                .appendPathParam(request.getDataIngestionJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDataIngestionJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataIngestionJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResponse> deleteDataSource(
            DeleteDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataSourceRequest, DeleteDataSourceResponse>
                    handler) {

        Validate.notBlank(request.getDataSourceId(), "dataSourceId must not be blank");

        return clientCall(request, DeleteDataSourceResponse::builder)
                .logger(LOG, "deleteDataSource")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "DeleteDataSource",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataSource/DeleteDataSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataSourceRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataSources")
                .appendPathParam(request.getDataSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDataSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteKnowledgeBaseResponse> deleteKnowledgeBase(
            DeleteKnowledgeBaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteKnowledgeBaseRequest, DeleteKnowledgeBaseResponse>
                    handler) {

        Validate.notBlank(request.getKnowledgeBaseId(), "knowledgeBaseId must not be blank");

        return clientCall(request, DeleteKnowledgeBaseResponse::builder)
                .logger(LOG, "deleteKnowledgeBase")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "DeleteKnowledgeBase",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/KnowledgeBase/DeleteKnowledgeBase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteKnowledgeBaseRequest::builder)
                .basePath("/20240531")
                .appendPathParam("knowledgeBases")
                .appendPathParam(request.getKnowledgeBaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteKnowledgeBaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteKnowledgeBaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteToolResponse> deleteTool(
            DeleteToolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteToolRequest, DeleteToolResponse>
                    handler) {

        Validate.notBlank(request.getToolId(), "toolId must not be blank");

        return clientCall(request, DeleteToolResponse::builder)
                .logger(LOG, "deleteTool")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "DeleteTool",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Tool/DeleteTool")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteToolRequest::builder)
                .basePath("/20240531")
                .appendPathParam("tools")
                .appendPathParam(request.getToolId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteToolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteToolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAgentResponse> getAgent(
            GetAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAgentRequest, GetAgentResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");

        return clientCall(request, GetAgentResponse::builder)
                .logger(LOG, "getAgent")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "GetAgent",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Agent/GetAgent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAgentRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.Agent.class,
                        GetAgentResponse.Builder::agent)
                .handleResponseHeaderString("etag", GetAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAgentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAgentEndpointResponse> getAgentEndpoint(
            GetAgentEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAgentEndpointRequest, GetAgentEndpointResponse>
                    handler) {

        Validate.notBlank(request.getAgentEndpointId(), "agentEndpointId must not be blank");

        return clientCall(request, GetAgentEndpointResponse::builder)
                .logger(LOG, "getAgentEndpoint")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "GetAgentEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/AgentEndpoint/GetAgentEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAgentEndpointRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendPathParam(request.getAgentEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.AgentEndpoint.class,
                        GetAgentEndpointResponse.Builder::agentEndpoint)
                .handleResponseHeaderString("etag", GetAgentEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAgentEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataIngestionJobResponse> getDataIngestionJob(
            GetDataIngestionJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataIngestionJobRequest, GetDataIngestionJobResponse>
                    handler) {

        Validate.notBlank(request.getDataIngestionJobId(), "dataIngestionJobId must not be blank");

        return clientCall(request, GetDataIngestionJobResponse::builder)
                .logger(LOG, "getDataIngestionJob")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "GetDataIngestionJob",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataIngestionJob/GetDataIngestionJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataIngestionJobRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataIngestionJobs")
                .appendPathParam(request.getDataIngestionJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.DataIngestionJob.class,
                        GetDataIngestionJobResponse.Builder::dataIngestionJob)
                .handleResponseHeaderString("etag", GetDataIngestionJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataIngestionJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataIngestionJobLogContentResponse>
            getDataIngestionJobLogContent(
                    GetDataIngestionJobLogContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDataIngestionJobLogContentRequest,
                                    GetDataIngestionJobLogContentResponse>
                            handler) {

        Validate.notBlank(request.getDataIngestionJobId(), "dataIngestionJobId must not be blank");

        return clientCall(request, GetDataIngestionJobLogContentResponse::builder)
                .logger(LOG, "getDataIngestionJobLogContent")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "GetDataIngestionJobLogContent",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataIngestionJob/GetDataIngestionJobLogContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataIngestionJobLogContentRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataIngestionJobs")
                .appendPathParam(request.getDataIngestionJobId())
                .appendPathParam("logs")
                .appendPathParam("content")
                .accept("text/plain; charset=utf-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetDataIngestionJobLogContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDataIngestionJobLogContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResponse> getDataSource(
            GetDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataSourceRequest, GetDataSourceResponse>
                    handler) {

        Validate.notBlank(request.getDataSourceId(), "dataSourceId must not be blank");

        return clientCall(request, GetDataSourceResponse::builder)
                .logger(LOG, "getDataSource")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "GetDataSource",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataSource/GetDataSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataSourceRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataSources")
                .appendPathParam(request.getDataSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.DataSource.class,
                        GetDataSourceResponse.Builder::dataSource)
                .handleResponseHeaderString("etag", GetDataSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetKnowledgeBaseResponse> getKnowledgeBase(
            GetKnowledgeBaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetKnowledgeBaseRequest, GetKnowledgeBaseResponse>
                    handler) {

        Validate.notBlank(request.getKnowledgeBaseId(), "knowledgeBaseId must not be blank");

        return clientCall(request, GetKnowledgeBaseResponse::builder)
                .logger(LOG, "getKnowledgeBase")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "GetKnowledgeBase",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/KnowledgeBase/GetKnowledgeBase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKnowledgeBaseRequest::builder)
                .basePath("/20240531")
                .appendPathParam("knowledgeBases")
                .appendPathParam(request.getKnowledgeBaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.KnowledgeBase.class,
                        GetKnowledgeBaseResponse.Builder::knowledgeBase)
                .handleResponseHeaderString("etag", GetKnowledgeBaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetKnowledgeBaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetToolResponse> getTool(
            GetToolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetToolRequest, GetToolResponse> handler) {

        Validate.notBlank(request.getToolId(), "toolId must not be blank");

        return clientCall(request, GetToolResponse::builder)
                .logger(LOG, "getTool")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "GetTool",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Tool/GetTool")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetToolRequest::builder)
                .basePath("/20240531")
                .appendPathParam("tools")
                .appendPathParam(request.getToolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.Tool.class,
                        GetToolResponse.Builder::tool)
                .handleResponseHeaderString("etag", GetToolResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetToolResponse.Builder::opcRequestId)
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
                        "GenerativeAiAgent",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20240531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAgentEndpointsResponse> listAgentEndpoints(
            ListAgentEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAgentEndpointsRequest, ListAgentEndpointsResponse>
                    handler) {

        return clientCall(request, ListAgentEndpointsResponse::builder)
                .logger(LOG, "listAgentEndpoints")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "ListAgentEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/AgentEndpoint/ListAgentEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAgentEndpointsRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("agentId", request.getAgentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.AgentEndpointCollection.class,
                        ListAgentEndpointsResponse.Builder::agentEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgentEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgentEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAgentsResponse> listAgents(
            ListAgentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAgentsRequest, ListAgentsResponse>
                    handler) {

        return clientCall(request, ListAgentsResponse::builder)
                .logger(LOG, "listAgents")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "ListAgents",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Agent/ListAgents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAgentsRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agents")
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
                        com.oracle.bmc.generativeaiagent.model.AgentCollection.class,
                        ListAgentsResponse.Builder::agentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataIngestionJobsResponse> listDataIngestionJobs(
            ListDataIngestionJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataIngestionJobsRequest, ListDataIngestionJobsResponse>
                    handler) {

        return clientCall(request, ListDataIngestionJobsResponse::builder)
                .logger(LOG, "listDataIngestionJobs")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "ListDataIngestionJobs",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataIngestionJob/ListDataIngestionJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataIngestionJobsRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataIngestionJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dataSourceId", request.getDataSourceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.DataIngestionJobCollection.class,
                        ListDataIngestionJobsResponse.Builder::dataIngestionJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataIngestionJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataIngestionJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResponse> listDataSources(
            ListDataSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataSourcesRequest, ListDataSourcesResponse>
                    handler) {

        return clientCall(request, ListDataSourcesResponse::builder)
                .logger(LOG, "listDataSources")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "ListDataSources",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataSource/ListDataSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataSourcesRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataSources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("knowledgeBaseId", request.getKnowledgeBaseId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.DataSourceCollection.class,
                        ListDataSourcesResponse.Builder::dataSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataSourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListKnowledgeBasesResponse> listKnowledgeBases(
            ListKnowledgeBasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListKnowledgeBasesRequest, ListKnowledgeBasesResponse>
                    handler) {

        return clientCall(request, ListKnowledgeBasesResponse::builder)
                .logger(LOG, "listKnowledgeBases")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "ListKnowledgeBases",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/KnowledgeBase/ListKnowledgeBases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKnowledgeBasesRequest::builder)
                .basePath("/20240531")
                .appendPathParam("knowledgeBases")
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
                        com.oracle.bmc.generativeaiagent.model.KnowledgeBaseCollection.class,
                        ListKnowledgeBasesResponse.Builder::knowledgeBaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListKnowledgeBasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListKnowledgeBasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListToolsResponse> listTools(
            ListToolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListToolsRequest, ListToolsResponse>
                    handler) {

        return clientCall(request, ListToolsResponse::builder)
                .logger(LOG, "listTools")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "ListTools",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Tool/ListTools")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListToolsRequest::builder)
                .basePath("/20240531")
                .appendPathParam("tools")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("agentId", request.getAgentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagent.model.ToolCollection.class,
                        ListToolsResponse.Builder::toolCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListToolsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListToolsResponse.Builder::opcNextPage)
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
                        "GenerativeAiAgent",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20240531")
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
                        com.oracle.bmc.generativeaiagent.model.WorkRequestErrorCollection.class,
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
                        "GenerativeAiAgent",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20240531")
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
                        com.oracle.bmc.generativeaiagent.model.WorkRequestLogEntryCollection.class,
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
                        "GenerativeAiAgent",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20240531")
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
                        com.oracle.bmc.generativeaiagent.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentResponse> updateAgent(
            UpdateAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateAgentRequest, UpdateAgentResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");
        Objects.requireNonNull(request.getUpdateAgentDetails(), "updateAgentDetails is required");

        return clientCall(request, UpdateAgentResponse::builder)
                .logger(LOG, "updateAgent")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "UpdateAgent",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Agent/UpdateAgent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAgentRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAgentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAgentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentEndpointResponse> updateAgentEndpoint(
            UpdateAgentEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAgentEndpointRequest, UpdateAgentEndpointResponse>
                    handler) {

        Validate.notBlank(request.getAgentEndpointId(), "agentEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAgentEndpointDetails(), "updateAgentEndpointDetails is required");

        return clientCall(request, UpdateAgentEndpointResponse::builder)
                .logger(LOG, "updateAgentEndpoint")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "UpdateAgentEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/AgentEndpoint/UpdateAgentEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAgentEndpointRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendPathParam(request.getAgentEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAgentEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAgentEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResponse> updateDataSource(
            UpdateDataSourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataSourceRequest, UpdateDataSourceResponse>
                    handler) {

        Validate.notBlank(request.getDataSourceId(), "dataSourceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataSourceDetails(), "updateDataSourceDetails is required");

        return clientCall(request, UpdateDataSourceResponse::builder)
                .logger(LOG, "updateDataSource")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "UpdateDataSource",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/DataSource/UpdateDataSource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataSourceRequest::builder)
                .basePath("/20240531")
                .appendPathParam("dataSources")
                .appendPathParam(request.getDataSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDataSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataSourceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateKnowledgeBaseResponse> updateKnowledgeBase(
            UpdateKnowledgeBaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateKnowledgeBaseRequest, UpdateKnowledgeBaseResponse>
                    handler) {

        Validate.notBlank(request.getKnowledgeBaseId(), "knowledgeBaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateKnowledgeBaseDetails(), "updateKnowledgeBaseDetails is required");

        return clientCall(request, UpdateKnowledgeBaseResponse::builder)
                .logger(LOG, "updateKnowledgeBase")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "UpdateKnowledgeBase",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/KnowledgeBase/UpdateKnowledgeBase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateKnowledgeBaseRequest::builder)
                .basePath("/20240531")
                .appendPathParam("knowledgeBases")
                .appendPathParam(request.getKnowledgeBaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateKnowledgeBaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateKnowledgeBaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateToolResponse> updateTool(
            UpdateToolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateToolRequest, UpdateToolResponse>
                    handler) {

        Validate.notBlank(request.getToolId(), "toolId must not be blank");
        Objects.requireNonNull(request.getUpdateToolDetails(), "updateToolDetails is required");

        return clientCall(request, UpdateToolResponse::builder)
                .logger(LOG, "updateTool")
                .serviceDetails(
                        "GenerativeAiAgent",
                        "UpdateTool",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents/20240531/Tool/UpdateTool")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateToolRequest::builder)
                .basePath("/20240531")
                .appendPathParam("tools")
                .appendPathParam(request.getToolId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateToolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateToolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GenerativeAiAgentAsyncClient(
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
    public GenerativeAiAgentAsyncClient(
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
    public GenerativeAiAgentAsyncClient(
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
    public GenerativeAiAgentAsyncClient(
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
    public GenerativeAiAgentAsyncClient(
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
    public GenerativeAiAgentAsyncClient(
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
    public GenerativeAiAgentAsyncClient(
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
