/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.generativeaiinference.requests.*;
import com.oracle.bmc.generativeaiinference.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class GenerativeAiInferenceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements GenerativeAiInference {
    /** Service instance for GenerativeAiInference. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(GenerativeAiInferenceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://inference.generativeai.{region}.{dualStack?ds.:}oci.{secondLevelDomain}")
                    .endpointServiceName("inference.generativeai")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenerativeAiInferenceClient.class);

    private final GenerativeAiInferencePaginators paginators;

    GenerativeAiInferenceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new GenerativeAiInferencePaginators(this);
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
                    Builder, GenerativeAiInferenceClient> {
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
        public GenerativeAiInferenceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GenerativeAiInferenceClient(this, authenticationDetailsProvider);
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
    public ApplyGuardrailsResponse applyGuardrails(ApplyGuardrailsRequest request) {
        Objects.requireNonNull(
                request.getApplyGuardrailsDetails(), "applyGuardrailsDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, ApplyGuardrailsResponse::builder)
                .logger(LOG, "applyGuardrails")
                .serviceDetails(
                        "GenerativeAiInference",
                        "ApplyGuardrails",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/ApplyGuardrailsResult/ApplyGuardrails")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApplyGuardrailsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("applyGuardrails")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.ApplyGuardrailsResult.class,
                        ApplyGuardrailsResponse.Builder::applyGuardrailsResult)
                .handleResponseHeaderString(
                        "opc-request-id", ApplyGuardrailsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChatResponse chat(ChatRequest request) {
        Objects.requireNonNull(request.getChatDetails(), "chatDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, ChatResponse::builder)
                .logger(LOG, "chat")
                .serviceDetails(
                        "GenerativeAiInference",
                        "Chat",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/ChatResult/Chat")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChatRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("chat")
                .accept("application/json, text/event-stream")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.ChatResult.class,
                        ChatResponse.Builder::chatResult)
                .handleEventStream(ChatResponse.Builder::eventStream)
                .handleResponseHeaderString("etag", ChatResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", ChatResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "model-deprecation-info", ChatResponse.Builder::modelDeprecationInfo)
                .callSync();
    }

    @Override
    public EmbedTextResponse embedText(EmbedTextRequest request) {
        Objects.requireNonNull(request.getEmbedTextDetails(), "embedTextDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, EmbedTextResponse::builder)
                .logger(LOG, "embedText")
                .serviceDetails(
                        "GenerativeAiInference",
                        "EmbedText",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/EmbedTextResult/EmbedText")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EmbedTextRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("embedText")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.EmbedTextResult.class,
                        EmbedTextResponse.Builder::embedTextResult)
                .handleResponseHeaderString("etag", EmbedTextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", EmbedTextResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "model-deprecation-info", EmbedTextResponse.Builder::modelDeprecationInfo)
                .callSync();
    }

    @Override
    public GenerateTextResponse generateText(GenerateTextRequest request) {
        Objects.requireNonNull(request.getGenerateTextDetails(), "generateTextDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, GenerateTextResponse::builder)
                .logger(LOG, "generateText")
                .serviceDetails(
                        "GenerativeAiInference",
                        "GenerateText",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/GenerateTextResult/GenerateText")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateTextRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("generateText")
                .accept("application/json, text/event-stream")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.GenerateTextResult.class,
                        GenerateTextResponse.Builder::generateTextResult)
                .handleEventStream(GenerateTextResponse.Builder::eventStream)
                .handleResponseHeaderString("etag", GenerateTextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateTextResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "model-deprecation-info",
                        GenerateTextResponse.Builder::modelDeprecationInfo)
                .callSync();
    }

    @Override
    public ListGuardrailVersionsResponse listGuardrailVersions(
            ListGuardrailVersionsRequest request) {
        Objects.requireNonNull(request.getOpcCompartmentId(), "opcCompartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, ListGuardrailVersionsResponse::builder)
                .logger(LOG, "listGuardrailVersions")
                .serviceDetails(
                        "GenerativeAiInference",
                        "ListGuardrailVersions",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/GuardrailVersionCollection/ListGuardrailVersions")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGuardrailVersionsRequest::builder)
                .basePath("/20231130")
                .appendPathParam("guardrailVersions")
                .appendEnumQueryParam("state", request.getState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-compartment-id", request.getOpcCompartmentId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.GuardrailVersionCollection.class,
                        ListGuardrailVersionsResponse.Builder::guardrailVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGuardrailVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGuardrailVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RerankTextResponse rerankText(RerankTextRequest request) {
        Objects.requireNonNull(request.getRerankTextDetails(), "rerankTextDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, RerankTextResponse::builder)
                .logger(LOG, "rerankText")
                .serviceDetails(
                        "GenerativeAiInference",
                        "RerankText",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/RerankTextResult/RerankText")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RerankTextRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("rerankText")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.RerankTextResult.class,
                        RerankTextResponse.Builder::rerankTextResult)
                .handleResponseHeaderString("etag", RerankTextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RerankTextResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "model-deprecation-info", RerankTextResponse.Builder::modelDeprecationInfo)
                .callSync();
    }

    @Override
    public SummarizeTextResponse summarizeText(SummarizeTextRequest request) {
        Objects.requireNonNull(
                request.getSummarizeTextDetails(), "summarizeTextDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, SummarizeTextResponse::builder)
                .logger(LOG, "summarizeText")
                .serviceDetails(
                        "GenerativeAiInference",
                        "SummarizeText",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-inference/20231130/SummarizeTextResult/SummarizeText")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SummarizeTextRequest::builder)
                .basePath("/20231130")
                .appendPathParam("actions")
                .appendPathParam("summarizeText")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaiinference.model.SummarizeTextResult.class,
                        SummarizeTextResponse.Builder::summarizeTextResult)
                .handleResponseHeaderString("etag", SummarizeTextResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeTextResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "model-deprecation-info",
                        SummarizeTextResponse.Builder::modelDeprecationInfo)
                .callSync();
    }

    @Override
    public GenerativeAiInferencePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GenerativeAiInferenceClient(
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
    public GenerativeAiInferenceClient(
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
    public GenerativeAiInferenceClient(
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
    public GenerativeAiInferenceClient(
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
    public GenerativeAiInferenceClient(
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
    public GenerativeAiInferenceClient(
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
    public GenerativeAiInferenceClient(
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
