/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.generativeaiinference.requests.*;
import com.oracle.bmc.generativeaiinference.responses.*;

import java.util.Objects;

/**
 * Async client implementation for GenerativeAiInference service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class GenerativeAiInferenceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements GenerativeAiInferenceAsync {
    /** Service instance for GenerativeAiInference. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("GENERATIVEAIINFERENCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://inference.generativeai.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenerativeAiInferenceAsyncClient.class);

    GenerativeAiInferenceAsyncClient(
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
                    Builder, GenerativeAiInferenceAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "generativeaiinference";
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
        public GenerativeAiInferenceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GenerativeAiInferenceAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ApplyGuardrailsResponse> applyGuardrails(
            ApplyGuardrailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ApplyGuardrailsRequest, ApplyGuardrailsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getApplyGuardrailsDetails(), "applyGuardrailsDetails is required");

        return clientCall(request, ApplyGuardrailsResponse::builder)
                .logger(LOG, "applyGuardrails")
                .serviceDetails(
                        "GenerativeAiInference",
                        "ApplyGuardrails",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/ApplyGuardrailsResult/ApplyGuardrails")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApplyGuardrailsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("applyGuardrails")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.ApplyGuardrailsResult.class,
                        ApplyGuardrailsResponse.Builder::applyGuardrailsResult)
                .handleResponseHeaderString(
                        "opc-request-id", ApplyGuardrailsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChatResponse> chat(
            ChatRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ChatRequest, ChatResponse> handler) {
        Objects.requireNonNull(request.getChatDetails(), "chatDetails is required");

        return clientCall(request, ChatResponse::builder)
                .logger(LOG, "chat")
                .serviceDetails(
                        "GenerativeAiInference",
                        "Chat",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/ChatResult/Chat")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChatRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("chat")
                .accept("application/json, text/event-stream")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.ChatResult.class,
                        ChatResponse.Builder::chatResult)
                .handleEventStream(ChatResponse.Builder::eventStream)
                .handleResponseHeaderString("etag", ChatResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", ChatResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EmbedTextResponse> embedText(
            EmbedTextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<EmbedTextRequest, EmbedTextResponse>
                    handler) {
        Objects.requireNonNull(request.getEmbedTextDetails(), "embedTextDetails is required");

        return clientCall(request, EmbedTextResponse::builder)
                .logger(LOG, "embedText")
                .serviceDetails(
                        "GenerativeAiInference",
                        "EmbedText",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/EmbedTextResult/EmbedText")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EmbedTextRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("embedText")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.EmbedTextResult.class,
                        EmbedTextResponse.Builder::embedTextResult)
                .handleResponseHeaderString("etag", EmbedTextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", EmbedTextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateTextResponse> generateText(
            GenerateTextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GenerateTextRequest, GenerateTextResponse>
                    handler) {
        Objects.requireNonNull(request.getGenerateTextDetails(), "generateTextDetails is required");

        return clientCall(request, GenerateTextResponse::builder)
                .logger(LOG, "generateText")
                .serviceDetails(
                        "GenerativeAiInference",
                        "GenerateText",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/GenerateTextResult/GenerateText")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateTextRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("generateText")
                .accept("application/json, text/event-stream")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.GenerateTextResult.class,
                        GenerateTextResponse.Builder::generateTextResult)
                .handleEventStream(GenerateTextResponse.Builder::eventStream)
                .handleResponseHeaderString("etag", GenerateTextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateTextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RerankTextResponse> rerankText(
            RerankTextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RerankTextRequest, RerankTextResponse>
                    handler) {
        Objects.requireNonNull(request.getRerankTextDetails(), "rerankTextDetails is required");

        return clientCall(request, RerankTextResponse::builder)
                .logger(LOG, "rerankText")
                .serviceDetails(
                        "GenerativeAiInference",
                        "RerankText",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/RerankTextResult/RerankText")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RerankTextRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("rerankText")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.RerankTextResult.class,
                        RerankTextResponse.Builder::rerankTextResult)
                .handleResponseHeaderString("etag", RerankTextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RerankTextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeTextResponse> summarizeText(
            SummarizeTextRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SummarizeTextRequest, SummarizeTextResponse>
                    handler) {
        Objects.requireNonNull(
                request.getSummarizeTextDetails(), "summarizeTextDetails is required");

        return clientCall(request, SummarizeTextResponse::builder)
                .logger(LOG, "summarizeText")
                .serviceDetails(
                        "GenerativeAiInference",
                        "SummarizeText",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/SummarizeTextResult/SummarizeText")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SummarizeTextRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("summarizeText")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.SummarizeTextResult.class,
                        SummarizeTextResponse.Builder::summarizeTextResult)
                .handleResponseHeaderString("etag", SummarizeTextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeTextResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GenerativeAiInferenceAsyncClient(
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
    public GenerativeAiInferenceAsyncClient(
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
    public GenerativeAiInferenceAsyncClient(
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
    public GenerativeAiInferenceAsyncClient(
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
    public GenerativeAiInferenceAsyncClient(
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
    public GenerativeAiInferenceAsyncClient(
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
    public GenerativeAiInferenceAsyncClient(
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
