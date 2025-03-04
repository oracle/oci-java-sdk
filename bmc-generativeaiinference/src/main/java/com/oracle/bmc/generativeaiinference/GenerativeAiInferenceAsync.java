/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference;

import com.oracle.bmc.generativeaiinference.requests.*;
import com.oracle.bmc.generativeaiinference.responses.*;

/**
 * OCI Generative AI is a fully managed service that provides a set of state-of-the-art,
 * customizable large language models (LLMs) that cover a wide range of use cases for text
 * generation, summarization, and text embeddings.
 *
 * <p>Use the Generative AI service inference API to access your custom model endpoints, or to try
 * the out-of-the-box models to {@link
 * #eNGenerative-ai-inferenceLatestChatResultChat(ENGenerative-ai-inferenceLatestChatResultChatRequest)
 * eNGenerative-ai-inferenceLatestChatResultChat}, {@link
 * #eNGenerative-ai-inferenceLatestGenerateTextResultGenerateText(ENGenerative-ai-inferenceLatestGenerateTextResultGenerateTextRequest)
 * eNGenerative-ai-inferenceLatestGenerateTextResultGenerateText}, {@link
 * #eNGenerative-ai-inferenceLatestSummarizeTextResultSummarizeText(ENGenerative-ai-inferenceLatestSummarizeTextResultSummarizeTextRequest)
 * eNGenerative-ai-inferenceLatestSummarizeTextResultSummarizeText}, and {@link
 * #eNGenerative-ai-inferenceLatestEmbedTextResultEmbedText(ENGenerative-ai-inferenceLatestEmbedTextResultEmbedTextRequest)
 * eNGenerative-ai-inferenceLatestEmbedTextResultEmbedText}.
 *
 * <p>To use a Generative AI custom model for inference, you must first create an endpoint for that
 * model. Use the {@link #eNGenerative-aiLatest(ENGenerative-aiLatestRequest) eNGenerative-aiLatest}
 * to {@link #eNGenerative-aiLatestModel(ENGenerative-aiLatestModelRequest)
 * eNGenerative-aiLatestModel} by fine-tuning an out-of-the-box model, or a previous version of a
 * custom model, using your own data. Fine-tune the custom model on a {@link
 * #eNGenerative-aiLatestDedicatedAiCluster(ENGenerative-aiLatestDedicatedAiClusterRequest)
 * eNGenerative-aiLatestDedicatedAiCluster}. Then, create a {@link
 * #eNGenerative-aiLatestDedicatedAiCluster(ENGenerative-aiLatestDedicatedAiClusterRequest)
 * eNGenerative-aiLatestDedicatedAiCluster} with an {@link Endpoint} to host your custom model. For
 * resource management in the Generative AI service, use the {@link
 * #eNGenerative-aiLatest(ENGenerative-aiLatestRequest) eNGenerative-aiLatest}.
 *
 * <p>To learn more about the service, see the [Generative AI
 * documentation](https://docs.oracle.com/iaas/Content/generative-ai/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public interface GenerativeAiInferenceAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Creates a response for the given conversation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChatResponse> chat(
            ChatRequest request,
            com.oracle.bmc.responses.AsyncHandler<ChatRequest, ChatResponse> handler);

    /**
     * Produces embeddings for the inputs.
     *
     * <p>An embedding is numeric representation of a piece of text. This text can be a phrase, a
     * sentence, or one or more paragraphs. The Generative AI embedding model transforms each
     * phrase, sentence, or paragraph that you input, into an array with 1024 numbers. You can use
     * these embeddings for finding similarity in your input text such as finding phrases that are
     * similar in context or category. Embeddings are mostly used for semantic searches where the
     * search function focuses on the meaning of the text that it's searching through rather than
     * finding results based on keywords.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EmbedTextResponse> embedText(
            EmbedTextRequest request,
            com.oracle.bmc.responses.AsyncHandler<EmbedTextRequest, EmbedTextResponse> handler);

    /**
     * Generates a text response based on the user prompt.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateTextResponse> generateText(
            GenerateTextRequest request,
            com.oracle.bmc.responses.AsyncHandler<GenerateTextRequest, GenerateTextResponse>
                    handler);

    /**
     * Reranks the text responses based on the input documents and a prompt.
     *
     * <p>Rerank assigns an index and a relevance score to each document, indicating which document
     * is most related to the prompt.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RerankTextResponse> rerankText(
            RerankTextRequest request,
            com.oracle.bmc.responses.AsyncHandler<RerankTextRequest, RerankTextResponse> handler);

    /**
     * Summarizes the input text.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeTextResponse> summarizeText(
            SummarizeTextRequest request,
            com.oracle.bmc.responses.AsyncHandler<SummarizeTextRequest, SummarizeTextResponse>
                    handler);
}
