/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
 * the out-of-the-box models to {@link #generateText(GenerateTextRequest) generateText}, {@link
 * #summarizeText(SummarizeTextRequest) summarizeText}, and {@link #embedText(EmbedTextRequest)
 * embedText}.
 *
 * <p>To use a Generative AI custom model for inference, you must first create an endpoint for that
 * model. Use the [Generative AI service management
 * API](https://docs.cloud.oracle.com/#/en/generative-ai/latest/) to {@link Model} by fine-tuning an
 * out-of-the-box model, or a previous version of a custom model, using your own data. Fine-tune the
 * custom model on a {@link DedicatedAiCluster}. Then, create a {@link DedicatedAiCluster} with an
 * {@link Endpoint} to host your custom model. For resource management in the Generative AI service,
 * use the [Generative AI service management
 * API](https://docs.cloud.oracle.com/#/en/generative-ai/latest/).
 *
 * <p>To learn more about the service, see the [Generative AI
 * documentation](https://docs.cloud.oracle.com/iaas/Content/generative-ai/home.htm).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public interface GenerativeAiInference extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiinference/EmbedTextExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use EmbedText API.
     */
    EmbedTextResponse embedText(EmbedTextRequest request);

    /**
     * Generates a text response based on the user prompt.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiinference/GenerateTextExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateText API.
     */
    GenerateTextResponse generateText(GenerateTextRequest request);

    /**
     * Summarizes the input text.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiinference/SummarizeTextExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeText API.
     */
    SummarizeTextResponse summarizeText(SummarizeTextRequest request);
}
