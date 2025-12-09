/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.generativeaiagentruntime.requests.*;
import com.oracle.bmc.generativeaiagentruntime.responses.*;

import java.util.Objects;

/**
 * Async client implementation for GenerativeAiAgentRuntime service. <br>
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
public class GenerativeAiAgentRuntimeAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements GenerativeAiAgentRuntimeAsync {
    /** Service instance for GenerativeAiAgentRuntime. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(GenerativeAiAgentRuntimeClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://agent-runtime.generativeai.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenerativeAiAgentRuntimeAsyncClient.class);

    GenerativeAiAgentRuntimeAsyncClient(
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
                    Builder, GenerativeAiAgentRuntimeAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "generativeaiagentruntime";
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
        public GenerativeAiAgentRuntimeAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GenerativeAiAgentRuntimeAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChatResponse> chat(
            ChatRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ChatRequest, ChatResponse> handler) {

        Validate.notBlank(request.getAgentEndpointId(), "agentEndpointId must not be blank");
        Objects.requireNonNull(request.getChatDetails(), "chatDetails is required");

        return clientCall(request, ChatResponse::builder)
                .logger(LOG, "chat")
                .serviceDetails(
                        "GenerativeAiAgentRuntime",
                        "Chat",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents-client/20240531/AgentEndpoint/Chat")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChatRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendPathParam(request.getAgentEndpointId())
                .appendPathParam("actions")
                .appendPathParam("chat")
                .accept("application/json, text/event-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiagentruntime.model.ChatResult.class,
                        ChatResponse.Builder::chatResult)
                .handleEventStream(ChatResponse.Builder::eventStream)
                .handleResponseHeaderString("opc-request-id", ChatResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSessionResponse> createSession(
            CreateSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateSessionRequest, CreateSessionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSessionDetails(), "createSessionDetails is required");

        Validate.notBlank(request.getAgentEndpointId(), "agentEndpointId must not be blank");

        return clientCall(request, CreateSessionResponse::builder)
                .logger(LOG, "createSession")
                .serviceDetails(
                        "GenerativeAiAgentRuntime",
                        "CreateSession",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents-client/20240531/Session/CreateSession")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSessionRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendPathParam(request.getAgentEndpointId())
                .appendPathParam("sessions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiagentruntime.model.Session.class,
                        CreateSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", CreateSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSessionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSessionResponse> deleteSession(
            DeleteSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSessionRequest, DeleteSessionResponse>
                    handler) {

        Validate.notBlank(request.getAgentEndpointId(), "agentEndpointId must not be blank");

        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");

        return clientCall(request, DeleteSessionResponse::builder)
                .logger(LOG, "deleteSession")
                .serviceDetails(
                        "GenerativeAiAgentRuntime",
                        "DeleteSession",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents-client/20240531/Session/DeleteSession")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSessionRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendPathParam(request.getAgentEndpointId())
                .appendPathParam("sessions")
                .appendPathParam(request.getSessionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSessionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSessionResponse> getSession(
            GetSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSessionRequest, GetSessionResponse>
                    handler) {

        Validate.notBlank(request.getAgentEndpointId(), "agentEndpointId must not be blank");

        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");

        return clientCall(request, GetSessionResponse::builder)
                .logger(LOG, "getSession")
                .serviceDetails(
                        "GenerativeAiAgentRuntime",
                        "GetSession",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents-client/20240531/Session/GetSession")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSessionRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendPathParam(request.getAgentEndpointId())
                .appendPathParam("sessions")
                .appendPathParam(request.getSessionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaiagentruntime.model.Session.class,
                        GetSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", GetSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSessionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetrieveMetadataResponse> retrieveMetadata(
            RetrieveMetadataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetrieveMetadataRequest, RetrieveMetadataResponse>
                    handler) {

        Validate.notBlank(request.getKnowledgeBaseId(), "knowledgeBaseId must not be blank");
        Objects.requireNonNull(
                request.getRetrieveMetadataDetails(), "retrieveMetadataDetails is required");

        return clientCall(request, RetrieveMetadataResponse::builder)
                .logger(LOG, "retrieveMetadata")
                .serviceDetails(
                        "GenerativeAiAgentRuntime",
                        "RetrieveMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents-client/20240531/KnowledgeBaseMetadataSummary/RetrieveMetadata")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveMetadataRequest::builder)
                .basePath("/20240531")
                .appendPathParam("knowledgeBases")
                .appendPathParam(request.getKnowledgeBaseId())
                .appendPathParam("actions")
                .appendPathParam("retrieveMetadata")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.generativeaiagentruntime.model.KnowledgeBaseMetadataSummary
                                .class,
                        RetrieveMetadataResponse.Builder::items)
                .handleResponseHeaderString("etag", RetrieveMetadataResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RetrieveMetadataResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSessionResponse> updateSession(
            UpdateSessionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateSessionRequest, UpdateSessionResponse>
                    handler) {

        Validate.notBlank(request.getAgentEndpointId(), "agentEndpointId must not be blank");

        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSessionDetails(), "updateSessionDetails is required");

        return clientCall(request, UpdateSessionResponse::builder)
                .logger(LOG, "updateSession")
                .serviceDetails(
                        "GenerativeAiAgentRuntime",
                        "UpdateSession",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-agents-client/20240531/Session/UpdateSession")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSessionRequest::builder)
                .basePath("/20240531")
                .appendPathParam("agentEndpoints")
                .appendPathParam(request.getAgentEndpointId())
                .appendPathParam("sessions")
                .appendPathParam(request.getSessionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiagentruntime.model.Session.class,
                        UpdateSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", UpdateSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSessionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GenerativeAiAgentRuntimeAsyncClient(
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
    public GenerativeAiAgentRuntimeAsyncClient(
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
    public GenerativeAiAgentRuntimeAsyncClient(
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
    public GenerativeAiAgentRuntimeAsyncClient(
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
    public GenerativeAiAgentRuntimeAsyncClient(
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
    public GenerativeAiAgentRuntimeAsyncClient(
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
    public GenerativeAiAgentRuntimeAsyncClient(
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
