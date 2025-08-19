/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details for the chat request for Cohere models. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CohereChatRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "apiFormat")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereChatRequest extends BaseChatRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The text that the user inputs for the model to respond to. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The text that the user inputs for the model to respond to.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * The list of previous messages between the user and the model. The chat history gives the
         * model context for responding to the user's inputs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("chatHistory")
        private java.util.List<CohereMessage> chatHistory;

        /**
         * The list of previous messages between the user and the model. The chat history gives the
         * model context for responding to the user's inputs.
         *
         * @param chatHistory the value to set
         * @return this builder
         */
        public Builder chatHistory(java.util.List<CohereMessage> chatHistory) {
            this.chatHistory = chatHistory;
            this.__explicitlySet__.add("chatHistory");
            return this;
        }
        /**
         * A list of relevant documents that the model can refer to for generating grounded
         * responses to the user's requests. Some example keys that you can add to the dictionary
         * are "text", "author", and "date". Keep the total word count of the strings in the
         * dictionary to 300 words or less.
         *
         * <p>Example: {@code [ { "title": "Tall penguins", "snippet": "Emperor penguins are the
         * tallest." }, { "title": "Penguin habitats", "snippet": "Emperor penguins only live in
         * Antarctica." } ]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<Object> documents;

        /**
         * A list of relevant documents that the model can refer to for generating grounded
         * responses to the user's requests. Some example keys that you can add to the dictionary
         * are "text", "author", and "date". Keep the total word count of the strings in the
         * dictionary to 300 words or less.
         *
         * <p>Example: {@code [ { "title": "Tall penguins", "snippet": "Emperor penguins are the
         * tallest." }, { "title": "Penguin habitats", "snippet": "Emperor penguins only live in
         * Antarctica." } ]}
         *
         * @param documents the value to set
         * @return this builder
         */
        public Builder documents(java.util.List<Object> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseFormat")
        private CohereResponseFormat responseFormat;

        public Builder responseFormat(CohereResponseFormat responseFormat) {
            this.responseFormat = responseFormat;
            this.__explicitlySet__.add("responseFormat");
            return this;
        }
        /**
         * When set to true, the response contains only a list of generated search queries without
         * the search results and the model will not respond to the user's message.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSearchQueriesOnly")
        private Boolean isSearchQueriesOnly;

        /**
         * When set to true, the response contains only a list of generated search queries without
         * the search results and the model will not respond to the user's message.
         *
         * @param isSearchQueriesOnly the value to set
         * @return this builder
         */
        public Builder isSearchQueriesOnly(Boolean isSearchQueriesOnly) {
            this.isSearchQueriesOnly = isSearchQueriesOnly;
            this.__explicitlySet__.add("isSearchQueriesOnly");
            return this;
        }
        /**
         * If specified, the default Cohere preamble is replaced with the provided preamble. A
         * preamble is an initial guideline message that can change the model's overall chat
         * behavior and conversation style. Default preambles vary for different models.
         *
         * <p>Example: {@code You are a travel advisor. Answer with a pirate tone.}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preambleOverride")
        private String preambleOverride;

        /**
         * If specified, the default Cohere preamble is replaced with the provided preamble. A
         * preamble is an initial guideline message that can change the model's overall chat
         * behavior and conversation style. Default preambles vary for different models.
         *
         * <p>Example: {@code You are a travel advisor. Answer with a pirate tone.}
         *
         * @param preambleOverride the value to set
         * @return this builder
         */
        public Builder preambleOverride(String preambleOverride) {
            this.preambleOverride = preambleOverride;
            this.__explicitlySet__.add("preambleOverride");
            return this;
        }
        /**
         * Whether to stream the partial progress of the model's response. When set to true, as
         * tokens become available, they are sent as data-only server-sent events.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStream")
        private Boolean isStream;

        /**
         * Whether to stream the partial progress of the model's response. When set to true, as
         * tokens become available, they are sent as data-only server-sent events.
         *
         * @param isStream the value to set
         * @return this builder
         */
        public Builder isStream(Boolean isStream) {
            this.isStream = isStream;
            this.__explicitlySet__.add("isStream");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("streamOptions")
        private StreamOptions streamOptions;

        public Builder streamOptions(StreamOptions streamOptions) {
            this.streamOptions = streamOptions;
            this.__explicitlySet__.add("streamOptions");
            return this;
        }
        /**
         * The maximum number of output tokens that the model will generate for the response. The
         * token count of your prompt plus maxTokens must not exceed the model's context length. For
         * on-demand inferencing, the response length is capped at 4,000 tokens for each run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
        private Integer maxTokens;

        /**
         * The maximum number of output tokens that the model will generate for the response. The
         * token count of your prompt plus maxTokens must not exceed the model's context length. For
         * on-demand inferencing, the response length is capped at 4,000 tokens for each run.
         *
         * @param maxTokens the value to set
         * @return this builder
         */
        public Builder maxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            this.__explicitlySet__.add("maxTokens");
            return this;
        }
        /**
         * The maximum number of input tokens to send to the model. If not specified,
         * max_input_tokens is the model's context length limit minus a small buffer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxInputTokens")
        private Integer maxInputTokens;

        /**
         * The maximum number of input tokens to send to the model. If not specified,
         * max_input_tokens is the model's context length limit minus a small buffer.
         *
         * @param maxInputTokens the value to set
         * @return this builder
         */
        public Builder maxInputTokens(Integer maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            this.__explicitlySet__.add("maxInputTokens");
            return this;
        }
        /**
         * A number that sets the randomness of the generated output. A lower temperature means less
         * random generations. Use lower numbers for tasks such as question answering or
         * summarizing. High temperatures can generate hallucinations or factually incorrect
         * information. Start with temperatures lower than 1.0 and increase the temperature for more
         * creative outputs, as you regenerate the prompts to refine the outputs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("temperature")
        private Double temperature;

        /**
         * A number that sets the randomness of the generated output. A lower temperature means less
         * random generations. Use lower numbers for tasks such as question answering or
         * summarizing. High temperatures can generate hallucinations or factually incorrect
         * information. Start with temperatures lower than 1.0 and increase the temperature for more
         * creative outputs, as you regenerate the prompts to refine the outputs.
         *
         * @param temperature the value to set
         * @return this builder
         */
        public Builder temperature(Double temperature) {
            this.temperature = temperature;
            this.__explicitlySet__.add("temperature");
            return this;
        }
        /**
         * A sampling method in which the model chooses the next token randomly from the top k most
         * likely tokens. A higher value for k generates more random output, which makes the output
         * text sound more natural. The default value for k is 0 which disables this method and
         * considers all tokens. To set a number for the likely tokens, choose an integer between 1
         * and 500.
         *
         * <p>If also using top p, then the model considers only the top tokens whose probabilities
         * add up to p percent and ignores the rest of the k tokens. For example, if k is 20 but
         * only the probabilities of the top 10 add up to the value of p, then only the top 10
         * tokens are chosen.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("topK")
        private Integer topK;

        /**
         * A sampling method in which the model chooses the next token randomly from the top k most
         * likely tokens. A higher value for k generates more random output, which makes the output
         * text sound more natural. The default value for k is 0 which disables this method and
         * considers all tokens. To set a number for the likely tokens, choose an integer between 1
         * and 500.
         *
         * <p>If also using top p, then the model considers only the top tokens whose probabilities
         * add up to p percent and ignores the rest of the k tokens. For example, if k is 20 but
         * only the probabilities of the top 10 add up to the value of p, then only the top 10
         * tokens are chosen.
         *
         * @param topK the value to set
         * @return this builder
         */
        public Builder topK(Integer topK) {
            this.topK = topK;
            this.__explicitlySet__.add("topK");
            return this;
        }
        /**
         * If set to a probability 0.0 < p < 1.0, it ensures that only the most likely tokens, with
         * total probability mass of p, are considered for generation at each step.
         *
         * <p>To eliminate tokens with low likelihood, assign p a minimum percentage for the next
         * token's likelihood. For example, when p is set to 0.75, the model eliminates the bottom
         * 25 percent for the next token. Set to 1.0 to consider all tokens and set to 0 to disable.
         * If both k and p are enabled, p acts after k.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("topP")
        private Double topP;

        /**
         * If set to a probability 0.0 < p < 1.0, it ensures that only the most likely tokens, with
         * total probability mass of p, are considered for generation at each step.
         *
         * <p>To eliminate tokens with low likelihood, assign p a minimum percentage for the next
         * token's likelihood. For example, when p is set to 0.75, the model eliminates the bottom
         * 25 percent for the next token. Set to 1.0 to consider all tokens and set to 0 to disable.
         * If both k and p are enabled, p acts after k.
         *
         * @param topP the value to set
         * @return this builder
         */
        public Builder topP(Double topP) {
            this.topP = topP;
            this.__explicitlySet__.add("topP");
            return this;
        }
        /**
         * Defaults to OFF. Dictates how the prompt will be constructed. With {@code
         * promptTruncation} set to AUTO_PRESERVE_ORDER, some elements from {@code chatHistory} and
         * {@code documents} will be dropped to construct a prompt that fits within the model's
         * context length limit. During this process the order of the documents and chat history
         * will be preserved. With {@code prompt_truncation} set to OFF, no elements will be
         * dropped.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("promptTruncation")
        private PromptTruncation promptTruncation;

        /**
         * Defaults to OFF. Dictates how the prompt will be constructed. With {@code
         * promptTruncation} set to AUTO_PRESERVE_ORDER, some elements from {@code chatHistory} and
         * {@code documents} will be dropped to construct a prompt that fits within the model's
         * context length limit. During this process the order of the documents and chat history
         * will be preserved. With {@code prompt_truncation} set to OFF, no elements will be
         * dropped.
         *
         * @param promptTruncation the value to set
         * @return this builder
         */
        public Builder promptTruncation(PromptTruncation promptTruncation) {
            this.promptTruncation = promptTruncation;
            this.__explicitlySet__.add("promptTruncation");
            return this;
        }
        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
         * their frequency in the generated text so far. Greater numbers encourage the model to use
         * new tokens, while lower numbers encourage the model to repeat the tokens. Set to 0 to
         * disable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
        private Double frequencyPenalty;

        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
         * their frequency in the generated text so far. Greater numbers encourage the model to use
         * new tokens, while lower numbers encourage the model to repeat the tokens. Set to 0 to
         * disable.
         *
         * @param frequencyPenalty the value to set
         * @return this builder
         */
        public Builder frequencyPenalty(Double frequencyPenalty) {
            this.frequencyPenalty = frequencyPenalty;
            this.__explicitlySet__.add("frequencyPenalty");
            return this;
        }
        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
         * whether they've appeared in the generated text so far. Greater numbers encourage the
         * model to use new tokens, while lower numbers encourage the model to repeat the tokens.
         *
         * <p>Similar to frequency penalty, a penalty is applied to previously present tokens,
         * except that this penalty is applied equally to all tokens that have already appeared,
         * regardless of how many times they've appeared. Set to 0 to disable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
        private Double presencePenalty;

        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
         * whether they've appeared in the generated text so far. Greater numbers encourage the
         * model to use new tokens, while lower numbers encourage the model to repeat the tokens.
         *
         * <p>Similar to frequency penalty, a penalty is applied to previously present tokens,
         * except that this penalty is applied equally to all tokens that have already appeared,
         * regardless of how many times they've appeared. Set to 0 to disable.
         *
         * @param presencePenalty the value to set
         * @return this builder
         */
        public Builder presencePenalty(Double presencePenalty) {
            this.presencePenalty = presencePenalty;
            this.__explicitlySet__.add("presencePenalty");
            return this;
        }
        /**
         * If specified, the backend will make a best effort to sample tokens deterministically, so
         * that repeated requests with the same seed and parameters yield the same result. However,
         * determinism cannot be fully guaranteed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("seed")
        private Integer seed;

        /**
         * If specified, the backend will make a best effort to sample tokens deterministically, so
         * that repeated requests with the same seed and parameters yield the same result. However,
         * determinism cannot be fully guaranteed.
         *
         * @param seed the value to set
         * @return this builder
         */
        public Builder seed(Integer seed) {
            this.seed = seed;
            this.__explicitlySet__.add("seed");
            return this;
        }
        /** Returns the full prompt that was sent to the model when True. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
        private Boolean isEcho;

        /**
         * Returns the full prompt that was sent to the model when True.
         *
         * @param isEcho the value to set
         * @return this builder
         */
        public Builder isEcho(Boolean isEcho) {
            this.isEcho = isEcho;
            this.__explicitlySet__.add("isEcho");
            return this;
        }
        /**
         * A list of available tools (functions) that the model may suggest invoking before
         * producing a text response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tools")
        private java.util.List<CohereTool> tools;

        /**
         * A list of available tools (functions) that the model may suggest invoking before
         * producing a text response.
         *
         * @param tools the value to set
         * @return this builder
         */
        public Builder tools(java.util.List<CohereTool> tools) {
            this.tools = tools;
            this.__explicitlySet__.add("tools");
            return this;
        }
        /**
         * A list of results from invoking tools recommended by the model in the previous chat turn.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toolResults")
        private java.util.List<CohereToolResult> toolResults;

        /**
         * A list of results from invoking tools recommended by the model in the previous chat turn.
         *
         * @param toolResults the value to set
         * @return this builder
         */
        public Builder toolResults(java.util.List<CohereToolResult> toolResults) {
            this.toolResults = toolResults;
            this.__explicitlySet__.add("toolResults");
            return this;
        }
        /**
         * When enabled, the model will issue (potentially multiple) tool calls in a single step,
         * before it receives the tool responses and directly answers the user's original message.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceSingleStep")
        private Boolean isForceSingleStep;

        /**
         * When enabled, the model will issue (potentially multiple) tool calls in a single step,
         * before it receives the tool responses and directly answers the user's original message.
         *
         * @param isForceSingleStep the value to set
         * @return this builder
         */
        public Builder isForceSingleStep(Boolean isForceSingleStep) {
            this.isForceSingleStep = isForceSingleStep;
            this.__explicitlySet__.add("isForceSingleStep");
            return this;
        }
        /** Stop the model generation when it reaches a stop sequence defined in this parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("stopSequences")
        private java.util.List<String> stopSequences;

        /**
         * Stop the model generation when it reaches a stop sequence defined in this parameter.
         *
         * @param stopSequences the value to set
         * @return this builder
         */
        public Builder stopSequences(java.util.List<String> stopSequences) {
            this.stopSequences = stopSequences;
            this.__explicitlySet__.add("stopSequences");
            return this;
        }
        /**
         * When enabled, the user\u2019s {@code message} will be sent to the model without any
         * preprocessing.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRawPrompting")
        private Boolean isRawPrompting;

        /**
         * When enabled, the user\u2019s {@code message} will be sent to the model without any
         * preprocessing.
         *
         * @param isRawPrompting the value to set
         * @return this builder
         */
        public Builder isRawPrompting(Boolean isRawPrompting) {
            this.isRawPrompting = isRawPrompting;
            this.__explicitlySet__.add("isRawPrompting");
            return this;
        }
        /**
         * When FAST is selected, citations are generated at the same time as the text output and
         * the request will be completed sooner. May result in less accurate citations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("citationQuality")
        private CitationQuality citationQuality;

        /**
         * When FAST is selected, citations are generated at the same time as the text output and
         * the request will be completed sooner. May result in less accurate citations.
         *
         * @param citationQuality the value to set
         * @return this builder
         */
        public Builder citationQuality(CitationQuality citationQuality) {
            this.citationQuality = citationQuality;
            this.__explicitlySet__.add("citationQuality");
            return this;
        }
        /**
         * Safety mode: Adds a safety instruction for the model to use when generating responses.
         * Contextual: (Default) Puts fewer constraints on the output. It maintains core protections
         * by aiming to reject harmful or illegal suggestions, but it allows profanity and some
         * toxic content, sexually explicit and violent content, and content that contains medical,
         * financial, or legal information. Contextual mode is suited for entertainment, creative,
         * or academic use. Strict: Aims to avoid sensitive topics, such as violent or sexual acts
         * and profanity. This mode aims to provide a safer experience by prohibiting responses or
         * recommendations that it finds inappropriate. Strict mode is suited for corporate use,
         * such as for corporate communications and customer service. Off: No safety mode is
         * applied. Note: This parameter is only compatible with models cohere.command-r-08-2024,
         * cohere.command-r-plus-08-2024 and Cohere models released after these models. See [release
         * dates](https://docs.oracle.com/iaas/Content/generative-ai/deprecating.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("safetyMode")
        private SafetyMode safetyMode;

        /**
         * Safety mode: Adds a safety instruction for the model to use when generating responses.
         * Contextual: (Default) Puts fewer constraints on the output. It maintains core protections
         * by aiming to reject harmful or illegal suggestions, but it allows profanity and some
         * toxic content, sexually explicit and violent content, and content that contains medical,
         * financial, or legal information. Contextual mode is suited for entertainment, creative,
         * or academic use. Strict: Aims to avoid sensitive topics, such as violent or sexual acts
         * and profanity. This mode aims to provide a safer experience by prohibiting responses or
         * recommendations that it finds inappropriate. Strict mode is suited for corporate use,
         * such as for corporate communications and customer service. Off: No safety mode is
         * applied. Note: This parameter is only compatible with models cohere.command-r-08-2024,
         * cohere.command-r-plus-08-2024 and Cohere models released after these models. See [release
         * dates](https://docs.oracle.com/iaas/Content/generative-ai/deprecating.htm).
         *
         * @param safetyMode the value to set
         * @return this builder
         */
        public Builder safetyMode(SafetyMode safetyMode) {
            this.safetyMode = safetyMode;
            this.__explicitlySet__.add("safetyMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereChatRequest build() {
            CohereChatRequest model =
                    new CohereChatRequest(
                            this.message,
                            this.chatHistory,
                            this.documents,
                            this.responseFormat,
                            this.isSearchQueriesOnly,
                            this.preambleOverride,
                            this.isStream,
                            this.streamOptions,
                            this.maxTokens,
                            this.maxInputTokens,
                            this.temperature,
                            this.topK,
                            this.topP,
                            this.promptTruncation,
                            this.frequencyPenalty,
                            this.presencePenalty,
                            this.seed,
                            this.isEcho,
                            this.tools,
                            this.toolResults,
                            this.isForceSingleStep,
                            this.stopSequences,
                            this.isRawPrompting,
                            this.citationQuality,
                            this.safetyMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereChatRequest model) {
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("chatHistory")) {
                this.chatHistory(model.getChatHistory());
            }
            if (model.wasPropertyExplicitlySet("documents")) {
                this.documents(model.getDocuments());
            }
            if (model.wasPropertyExplicitlySet("responseFormat")) {
                this.responseFormat(model.getResponseFormat());
            }
            if (model.wasPropertyExplicitlySet("isSearchQueriesOnly")) {
                this.isSearchQueriesOnly(model.getIsSearchQueriesOnly());
            }
            if (model.wasPropertyExplicitlySet("preambleOverride")) {
                this.preambleOverride(model.getPreambleOverride());
            }
            if (model.wasPropertyExplicitlySet("isStream")) {
                this.isStream(model.getIsStream());
            }
            if (model.wasPropertyExplicitlySet("streamOptions")) {
                this.streamOptions(model.getStreamOptions());
            }
            if (model.wasPropertyExplicitlySet("maxTokens")) {
                this.maxTokens(model.getMaxTokens());
            }
            if (model.wasPropertyExplicitlySet("maxInputTokens")) {
                this.maxInputTokens(model.getMaxInputTokens());
            }
            if (model.wasPropertyExplicitlySet("temperature")) {
                this.temperature(model.getTemperature());
            }
            if (model.wasPropertyExplicitlySet("topK")) {
                this.topK(model.getTopK());
            }
            if (model.wasPropertyExplicitlySet("topP")) {
                this.topP(model.getTopP());
            }
            if (model.wasPropertyExplicitlySet("promptTruncation")) {
                this.promptTruncation(model.getPromptTruncation());
            }
            if (model.wasPropertyExplicitlySet("frequencyPenalty")) {
                this.frequencyPenalty(model.getFrequencyPenalty());
            }
            if (model.wasPropertyExplicitlySet("presencePenalty")) {
                this.presencePenalty(model.getPresencePenalty());
            }
            if (model.wasPropertyExplicitlySet("seed")) {
                this.seed(model.getSeed());
            }
            if (model.wasPropertyExplicitlySet("isEcho")) {
                this.isEcho(model.getIsEcho());
            }
            if (model.wasPropertyExplicitlySet("tools")) {
                this.tools(model.getTools());
            }
            if (model.wasPropertyExplicitlySet("toolResults")) {
                this.toolResults(model.getToolResults());
            }
            if (model.wasPropertyExplicitlySet("isForceSingleStep")) {
                this.isForceSingleStep(model.getIsForceSingleStep());
            }
            if (model.wasPropertyExplicitlySet("stopSequences")) {
                this.stopSequences(model.getStopSequences());
            }
            if (model.wasPropertyExplicitlySet("isRawPrompting")) {
                this.isRawPrompting(model.getIsRawPrompting());
            }
            if (model.wasPropertyExplicitlySet("citationQuality")) {
                this.citationQuality(model.getCitationQuality());
            }
            if (model.wasPropertyExplicitlySet("safetyMode")) {
                this.safetyMode(model.getSafetyMode());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CohereChatRequest(
            String message,
            java.util.List<CohereMessage> chatHistory,
            java.util.List<Object> documents,
            CohereResponseFormat responseFormat,
            Boolean isSearchQueriesOnly,
            String preambleOverride,
            Boolean isStream,
            StreamOptions streamOptions,
            Integer maxTokens,
            Integer maxInputTokens,
            Double temperature,
            Integer topK,
            Double topP,
            PromptTruncation promptTruncation,
            Double frequencyPenalty,
            Double presencePenalty,
            Integer seed,
            Boolean isEcho,
            java.util.List<CohereTool> tools,
            java.util.List<CohereToolResult> toolResults,
            Boolean isForceSingleStep,
            java.util.List<String> stopSequences,
            Boolean isRawPrompting,
            CitationQuality citationQuality,
            SafetyMode safetyMode) {
        super();
        this.message = message;
        this.chatHistory = chatHistory;
        this.documents = documents;
        this.responseFormat = responseFormat;
        this.isSearchQueriesOnly = isSearchQueriesOnly;
        this.preambleOverride = preambleOverride;
        this.isStream = isStream;
        this.streamOptions = streamOptions;
        this.maxTokens = maxTokens;
        this.maxInputTokens = maxInputTokens;
        this.temperature = temperature;
        this.topK = topK;
        this.topP = topP;
        this.promptTruncation = promptTruncation;
        this.frequencyPenalty = frequencyPenalty;
        this.presencePenalty = presencePenalty;
        this.seed = seed;
        this.isEcho = isEcho;
        this.tools = tools;
        this.toolResults = toolResults;
        this.isForceSingleStep = isForceSingleStep;
        this.stopSequences = stopSequences;
        this.isRawPrompting = isRawPrompting;
        this.citationQuality = citationQuality;
        this.safetyMode = safetyMode;
    }

    /** The text that the user inputs for the model to respond to. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The text that the user inputs for the model to respond to.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /**
     * The list of previous messages between the user and the model. The chat history gives the
     * model context for responding to the user's inputs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chatHistory")
    private final java.util.List<CohereMessage> chatHistory;

    /**
     * The list of previous messages between the user and the model. The chat history gives the
     * model context for responding to the user's inputs.
     *
     * @return the value
     */
    public java.util.List<CohereMessage> getChatHistory() {
        return chatHistory;
    }

    /**
     * A list of relevant documents that the model can refer to for generating grounded responses to
     * the user's requests. Some example keys that you can add to the dictionary are "text",
     * "author", and "date". Keep the total word count of the strings in the dictionary to 300 words
     * or less.
     *
     * <p>Example: {@code [ { "title": "Tall penguins", "snippet": "Emperor penguins are the
     * tallest." }, { "title": "Penguin habitats", "snippet": "Emperor penguins only live in
     * Antarctica." } ]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<Object> documents;

    /**
     * A list of relevant documents that the model can refer to for generating grounded responses to
     * the user's requests. Some example keys that you can add to the dictionary are "text",
     * "author", and "date". Keep the total word count of the strings in the dictionary to 300 words
     * or less.
     *
     * <p>Example: {@code [ { "title": "Tall penguins", "snippet": "Emperor penguins are the
     * tallest." }, { "title": "Penguin habitats", "snippet": "Emperor penguins only live in
     * Antarctica." } ]}
     *
     * @return the value
     */
    public java.util.List<Object> getDocuments() {
        return documents;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responseFormat")
    private final CohereResponseFormat responseFormat;

    public CohereResponseFormat getResponseFormat() {
        return responseFormat;
    }

    /**
     * When set to true, the response contains only a list of generated search queries without the
     * search results and the model will not respond to the user's message.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSearchQueriesOnly")
    private final Boolean isSearchQueriesOnly;

    /**
     * When set to true, the response contains only a list of generated search queries without the
     * search results and the model will not respond to the user's message.
     *
     * @return the value
     */
    public Boolean getIsSearchQueriesOnly() {
        return isSearchQueriesOnly;
    }

    /**
     * If specified, the default Cohere preamble is replaced with the provided preamble. A preamble
     * is an initial guideline message that can change the model's overall chat behavior and
     * conversation style. Default preambles vary for different models.
     *
     * <p>Example: {@code You are a travel advisor. Answer with a pirate tone.}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preambleOverride")
    private final String preambleOverride;

    /**
     * If specified, the default Cohere preamble is replaced with the provided preamble. A preamble
     * is an initial guideline message that can change the model's overall chat behavior and
     * conversation style. Default preambles vary for different models.
     *
     * <p>Example: {@code You are a travel advisor. Answer with a pirate tone.}
     *
     * @return the value
     */
    public String getPreambleOverride() {
        return preambleOverride;
    }

    /**
     * Whether to stream the partial progress of the model's response. When set to true, as tokens
     * become available, they are sent as data-only server-sent events.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStream")
    private final Boolean isStream;

    /**
     * Whether to stream the partial progress of the model's response. When set to true, as tokens
     * become available, they are sent as data-only server-sent events.
     *
     * @return the value
     */
    public Boolean getIsStream() {
        return isStream;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("streamOptions")
    private final StreamOptions streamOptions;

    public StreamOptions getStreamOptions() {
        return streamOptions;
    }

    /**
     * The maximum number of output tokens that the model will generate for the response. The token
     * count of your prompt plus maxTokens must not exceed the model's context length. For on-demand
     * inferencing, the response length is capped at 4,000 tokens for each run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
    private final Integer maxTokens;

    /**
     * The maximum number of output tokens that the model will generate for the response. The token
     * count of your prompt plus maxTokens must not exceed the model's context length. For on-demand
     * inferencing, the response length is capped at 4,000 tokens for each run.
     *
     * @return the value
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    /**
     * The maximum number of input tokens to send to the model. If not specified, max_input_tokens
     * is the model's context length limit minus a small buffer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxInputTokens")
    private final Integer maxInputTokens;

    /**
     * The maximum number of input tokens to send to the model. If not specified, max_input_tokens
     * is the model's context length limit minus a small buffer.
     *
     * @return the value
     */
    public Integer getMaxInputTokens() {
        return maxInputTokens;
    }

    /**
     * A number that sets the randomness of the generated output. A lower temperature means less
     * random generations. Use lower numbers for tasks such as question answering or summarizing.
     * High temperatures can generate hallucinations or factually incorrect information. Start with
     * temperatures lower than 1.0 and increase the temperature for more creative outputs, as you
     * regenerate the prompts to refine the outputs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("temperature")
    private final Double temperature;

    /**
     * A number that sets the randomness of the generated output. A lower temperature means less
     * random generations. Use lower numbers for tasks such as question answering or summarizing.
     * High temperatures can generate hallucinations or factually incorrect information. Start with
     * temperatures lower than 1.0 and increase the temperature for more creative outputs, as you
     * regenerate the prompts to refine the outputs.
     *
     * @return the value
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * A sampling method in which the model chooses the next token randomly from the top k most
     * likely tokens. A higher value for k generates more random output, which makes the output text
     * sound more natural. The default value for k is 0 which disables this method and considers all
     * tokens. To set a number for the likely tokens, choose an integer between 1 and 500.
     *
     * <p>If also using top p, then the model considers only the top tokens whose probabilities add
     * up to p percent and ignores the rest of the k tokens. For example, if k is 20 but only the
     * probabilities of the top 10 add up to the value of p, then only the top 10 tokens are chosen.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topK")
    private final Integer topK;

    /**
     * A sampling method in which the model chooses the next token randomly from the top k most
     * likely tokens. A higher value for k generates more random output, which makes the output text
     * sound more natural. The default value for k is 0 which disables this method and considers all
     * tokens. To set a number for the likely tokens, choose an integer between 1 and 500.
     *
     * <p>If also using top p, then the model considers only the top tokens whose probabilities add
     * up to p percent and ignores the rest of the k tokens. For example, if k is 20 but only the
     * probabilities of the top 10 add up to the value of p, then only the top 10 tokens are chosen.
     *
     * @return the value
     */
    public Integer getTopK() {
        return topK;
    }

    /**
     * If set to a probability 0.0 < p < 1.0, it ensures that only the most likely tokens, with
     * total probability mass of p, are considered for generation at each step.
     *
     * <p>To eliminate tokens with low likelihood, assign p a minimum percentage for the next
     * token's likelihood. For example, when p is set to 0.75, the model eliminates the bottom 25
     * percent for the next token. Set to 1.0 to consider all tokens and set to 0 to disable. If
     * both k and p are enabled, p acts after k.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topP")
    private final Double topP;

    /**
     * If set to a probability 0.0 < p < 1.0, it ensures that only the most likely tokens, with
     * total probability mass of p, are considered for generation at each step.
     *
     * <p>To eliminate tokens with low likelihood, assign p a minimum percentage for the next
     * token's likelihood. For example, when p is set to 0.75, the model eliminates the bottom 25
     * percent for the next token. Set to 1.0 to consider all tokens and set to 0 to disable. If
     * both k and p are enabled, p acts after k.
     *
     * @return the value
     */
    public Double getTopP() {
        return topP;
    }

    /**
     * Defaults to OFF. Dictates how the prompt will be constructed. With {@code promptTruncation}
     * set to AUTO_PRESERVE_ORDER, some elements from {@code chatHistory} and {@code documents} will
     * be dropped to construct a prompt that fits within the model's context length limit. During
     * this process the order of the documents and chat history will be preserved. With {@code
     * prompt_truncation} set to OFF, no elements will be dropped.
     */
    public enum PromptTruncation implements com.oracle.bmc.http.internal.BmcEnum {
        Off("OFF"),
        AutoPreserveOrder("AUTO_PRESERVE_ORDER"),
        ;

        private final String value;
        private static java.util.Map<String, PromptTruncation> map;

        static {
            map = new java.util.HashMap<>();
            for (PromptTruncation v : PromptTruncation.values()) {
                map.put(v.getValue(), v);
            }
        }

        PromptTruncation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PromptTruncation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PromptTruncation: " + key);
        }
    };
    /**
     * Defaults to OFF. Dictates how the prompt will be constructed. With {@code promptTruncation}
     * set to AUTO_PRESERVE_ORDER, some elements from {@code chatHistory} and {@code documents} will
     * be dropped to construct a prompt that fits within the model's context length limit. During
     * this process the order of the documents and chat history will be preserved. With {@code
     * prompt_truncation} set to OFF, no elements will be dropped.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("promptTruncation")
    private final PromptTruncation promptTruncation;

    /**
     * Defaults to OFF. Dictates how the prompt will be constructed. With {@code promptTruncation}
     * set to AUTO_PRESERVE_ORDER, some elements from {@code chatHistory} and {@code documents} will
     * be dropped to construct a prompt that fits within the model's context length limit. During
     * this process the order of the documents and chat history will be preserved. With {@code
     * prompt_truncation} set to OFF, no elements will be dropped.
     *
     * @return the value
     */
    public PromptTruncation getPromptTruncation() {
        return promptTruncation;
    }

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on their
     * frequency in the generated text so far. Greater numbers encourage the model to use new
     * tokens, while lower numbers encourage the model to repeat the tokens. Set to 0 to disable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
    private final Double frequencyPenalty;

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on their
     * frequency in the generated text so far. Greater numbers encourage the model to use new
     * tokens, while lower numbers encourage the model to repeat the tokens. Set to 0 to disable.
     *
     * @return the value
     */
    public Double getFrequencyPenalty() {
        return frequencyPenalty;
    }

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
     * whether they've appeared in the generated text so far. Greater numbers encourage the model to
     * use new tokens, while lower numbers encourage the model to repeat the tokens.
     *
     * <p>Similar to frequency penalty, a penalty is applied to previously present tokens, except
     * that this penalty is applied equally to all tokens that have already appeared, regardless of
     * how many times they've appeared. Set to 0 to disable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
    private final Double presencePenalty;

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
     * whether they've appeared in the generated text so far. Greater numbers encourage the model to
     * use new tokens, while lower numbers encourage the model to repeat the tokens.
     *
     * <p>Similar to frequency penalty, a penalty is applied to previously present tokens, except
     * that this penalty is applied equally to all tokens that have already appeared, regardless of
     * how many times they've appeared. Set to 0 to disable.
     *
     * @return the value
     */
    public Double getPresencePenalty() {
        return presencePenalty;
    }

    /**
     * If specified, the backend will make a best effort to sample tokens deterministically, so that
     * repeated requests with the same seed and parameters yield the same result. However,
     * determinism cannot be fully guaranteed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("seed")
    private final Integer seed;

    /**
     * If specified, the backend will make a best effort to sample tokens deterministically, so that
     * repeated requests with the same seed and parameters yield the same result. However,
     * determinism cannot be fully guaranteed.
     *
     * @return the value
     */
    public Integer getSeed() {
        return seed;
    }

    /** Returns the full prompt that was sent to the model when True. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
    private final Boolean isEcho;

    /**
     * Returns the full prompt that was sent to the model when True.
     *
     * @return the value
     */
    public Boolean getIsEcho() {
        return isEcho;
    }

    /**
     * A list of available tools (functions) that the model may suggest invoking before producing a
     * text response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tools")
    private final java.util.List<CohereTool> tools;

    /**
     * A list of available tools (functions) that the model may suggest invoking before producing a
     * text response.
     *
     * @return the value
     */
    public java.util.List<CohereTool> getTools() {
        return tools;
    }

    /** A list of results from invoking tools recommended by the model in the previous chat turn. */
    @com.fasterxml.jackson.annotation.JsonProperty("toolResults")
    private final java.util.List<CohereToolResult> toolResults;

    /**
     * A list of results from invoking tools recommended by the model in the previous chat turn.
     *
     * @return the value
     */
    public java.util.List<CohereToolResult> getToolResults() {
        return toolResults;
    }

    /**
     * When enabled, the model will issue (potentially multiple) tool calls in a single step, before
     * it receives the tool responses and directly answers the user's original message.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceSingleStep")
    private final Boolean isForceSingleStep;

    /**
     * When enabled, the model will issue (potentially multiple) tool calls in a single step, before
     * it receives the tool responses and directly answers the user's original message.
     *
     * @return the value
     */
    public Boolean getIsForceSingleStep() {
        return isForceSingleStep;
    }

    /** Stop the model generation when it reaches a stop sequence defined in this parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("stopSequences")
    private final java.util.List<String> stopSequences;

    /**
     * Stop the model generation when it reaches a stop sequence defined in this parameter.
     *
     * @return the value
     */
    public java.util.List<String> getStopSequences() {
        return stopSequences;
    }

    /**
     * When enabled, the user\u2019s {@code message} will be sent to the model without any
     * preprocessing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRawPrompting")
    private final Boolean isRawPrompting;

    /**
     * When enabled, the user\u2019s {@code message} will be sent to the model without any
     * preprocessing.
     *
     * @return the value
     */
    public Boolean getIsRawPrompting() {
        return isRawPrompting;
    }

    /**
     * When FAST is selected, citations are generated at the same time as the text output and the
     * request will be completed sooner. May result in less accurate citations.
     */
    public enum CitationQuality implements com.oracle.bmc.http.internal.BmcEnum {
        Accurate("ACCURATE"),
        Fast("FAST"),
        ;

        private final String value;
        private static java.util.Map<String, CitationQuality> map;

        static {
            map = new java.util.HashMap<>();
            for (CitationQuality v : CitationQuality.values()) {
                map.put(v.getValue(), v);
            }
        }

        CitationQuality(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CitationQuality create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CitationQuality: " + key);
        }
    };
    /**
     * When FAST is selected, citations are generated at the same time as the text output and the
     * request will be completed sooner. May result in less accurate citations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("citationQuality")
    private final CitationQuality citationQuality;

    /**
     * When FAST is selected, citations are generated at the same time as the text output and the
     * request will be completed sooner. May result in less accurate citations.
     *
     * @return the value
     */
    public CitationQuality getCitationQuality() {
        return citationQuality;
    }

    /**
     * Safety mode: Adds a safety instruction for the model to use when generating responses.
     * Contextual: (Default) Puts fewer constraints on the output. It maintains core protections by
     * aiming to reject harmful or illegal suggestions, but it allows profanity and some toxic
     * content, sexually explicit and violent content, and content that contains medical, financial,
     * or legal information. Contextual mode is suited for entertainment, creative, or academic use.
     * Strict: Aims to avoid sensitive topics, such as violent or sexual acts and profanity. This
     * mode aims to provide a safer experience by prohibiting responses or recommendations that it
     * finds inappropriate. Strict mode is suited for corporate use, such as for corporate
     * communications and customer service. Off: No safety mode is applied. Note: This parameter is
     * only compatible with models cohere.command-r-08-2024, cohere.command-r-plus-08-2024 and
     * Cohere models released after these models. See [release
     * dates](https://docs.oracle.com/iaas/Content/generative-ai/deprecating.htm).
     */
    public enum SafetyMode implements com.oracle.bmc.http.internal.BmcEnum {
        Contextual("CONTEXTUAL"),
        Strict("STRICT"),
        Off("OFF"),
        ;

        private final String value;
        private static java.util.Map<String, SafetyMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SafetyMode v : SafetyMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        SafetyMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SafetyMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SafetyMode: " + key);
        }
    };
    /**
     * Safety mode: Adds a safety instruction for the model to use when generating responses.
     * Contextual: (Default) Puts fewer constraints on the output. It maintains core protections by
     * aiming to reject harmful or illegal suggestions, but it allows profanity and some toxic
     * content, sexually explicit and violent content, and content that contains medical, financial,
     * or legal information. Contextual mode is suited for entertainment, creative, or academic use.
     * Strict: Aims to avoid sensitive topics, such as violent or sexual acts and profanity. This
     * mode aims to provide a safer experience by prohibiting responses or recommendations that it
     * finds inappropriate. Strict mode is suited for corporate use, such as for corporate
     * communications and customer service. Off: No safety mode is applied. Note: This parameter is
     * only compatible with models cohere.command-r-08-2024, cohere.command-r-plus-08-2024 and
     * Cohere models released after these models. See [release
     * dates](https://docs.oracle.com/iaas/Content/generative-ai/deprecating.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("safetyMode")
    private final SafetyMode safetyMode;

    /**
     * Safety mode: Adds a safety instruction for the model to use when generating responses.
     * Contextual: (Default) Puts fewer constraints on the output. It maintains core protections by
     * aiming to reject harmful or illegal suggestions, but it allows profanity and some toxic
     * content, sexually explicit and violent content, and content that contains medical, financial,
     * or legal information. Contextual mode is suited for entertainment, creative, or academic use.
     * Strict: Aims to avoid sensitive topics, such as violent or sexual acts and profanity. This
     * mode aims to provide a safer experience by prohibiting responses or recommendations that it
     * finds inappropriate. Strict mode is suited for corporate use, such as for corporate
     * communications and customer service. Off: No safety mode is applied. Note: This parameter is
     * only compatible with models cohere.command-r-08-2024, cohere.command-r-plus-08-2024 and
     * Cohere models released after these models. See [release
     * dates](https://docs.oracle.com/iaas/Content/generative-ai/deprecating.htm).
     *
     * @return the value
     */
    public SafetyMode getSafetyMode() {
        return safetyMode;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CohereChatRequest(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", chatHistory=").append(String.valueOf(this.chatHistory));
        sb.append(", documents=").append(String.valueOf(this.documents));
        sb.append(", responseFormat=").append(String.valueOf(this.responseFormat));
        sb.append(", isSearchQueriesOnly=").append(String.valueOf(this.isSearchQueriesOnly));
        sb.append(", preambleOverride=").append(String.valueOf(this.preambleOverride));
        sb.append(", isStream=").append(String.valueOf(this.isStream));
        sb.append(", streamOptions=").append(String.valueOf(this.streamOptions));
        sb.append(", maxTokens=").append(String.valueOf(this.maxTokens));
        sb.append(", maxInputTokens=").append(String.valueOf(this.maxInputTokens));
        sb.append(", temperature=").append(String.valueOf(this.temperature));
        sb.append(", topK=").append(String.valueOf(this.topK));
        sb.append(", topP=").append(String.valueOf(this.topP));
        sb.append(", promptTruncation=").append(String.valueOf(this.promptTruncation));
        sb.append(", frequencyPenalty=").append(String.valueOf(this.frequencyPenalty));
        sb.append(", presencePenalty=").append(String.valueOf(this.presencePenalty));
        sb.append(", seed=").append(String.valueOf(this.seed));
        sb.append(", isEcho=").append(String.valueOf(this.isEcho));
        sb.append(", tools=").append(String.valueOf(this.tools));
        sb.append(", toolResults=").append(String.valueOf(this.toolResults));
        sb.append(", isForceSingleStep=").append(String.valueOf(this.isForceSingleStep));
        sb.append(", stopSequences=").append(String.valueOf(this.stopSequences));
        sb.append(", isRawPrompting=").append(String.valueOf(this.isRawPrompting));
        sb.append(", citationQuality=").append(String.valueOf(this.citationQuality));
        sb.append(", safetyMode=").append(String.valueOf(this.safetyMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereChatRequest)) {
            return false;
        }

        CohereChatRequest other = (CohereChatRequest) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.chatHistory, other.chatHistory)
                && java.util.Objects.equals(this.documents, other.documents)
                && java.util.Objects.equals(this.responseFormat, other.responseFormat)
                && java.util.Objects.equals(this.isSearchQueriesOnly, other.isSearchQueriesOnly)
                && java.util.Objects.equals(this.preambleOverride, other.preambleOverride)
                && java.util.Objects.equals(this.isStream, other.isStream)
                && java.util.Objects.equals(this.streamOptions, other.streamOptions)
                && java.util.Objects.equals(this.maxTokens, other.maxTokens)
                && java.util.Objects.equals(this.maxInputTokens, other.maxInputTokens)
                && java.util.Objects.equals(this.temperature, other.temperature)
                && java.util.Objects.equals(this.topK, other.topK)
                && java.util.Objects.equals(this.topP, other.topP)
                && java.util.Objects.equals(this.promptTruncation, other.promptTruncation)
                && java.util.Objects.equals(this.frequencyPenalty, other.frequencyPenalty)
                && java.util.Objects.equals(this.presencePenalty, other.presencePenalty)
                && java.util.Objects.equals(this.seed, other.seed)
                && java.util.Objects.equals(this.isEcho, other.isEcho)
                && java.util.Objects.equals(this.tools, other.tools)
                && java.util.Objects.equals(this.toolResults, other.toolResults)
                && java.util.Objects.equals(this.isForceSingleStep, other.isForceSingleStep)
                && java.util.Objects.equals(this.stopSequences, other.stopSequences)
                && java.util.Objects.equals(this.isRawPrompting, other.isRawPrompting)
                && java.util.Objects.equals(this.citationQuality, other.citationQuality)
                && java.util.Objects.equals(this.safetyMode, other.safetyMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.chatHistory == null ? 43 : this.chatHistory.hashCode());
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result =
                (result * PRIME)
                        + (this.responseFormat == null ? 43 : this.responseFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.isSearchQueriesOnly == null
                                ? 43
                                : this.isSearchQueriesOnly.hashCode());
        result =
                (result * PRIME)
                        + (this.preambleOverride == null ? 43 : this.preambleOverride.hashCode());
        result = (result * PRIME) + (this.isStream == null ? 43 : this.isStream.hashCode());
        result =
                (result * PRIME)
                        + (this.streamOptions == null ? 43 : this.streamOptions.hashCode());
        result = (result * PRIME) + (this.maxTokens == null ? 43 : this.maxTokens.hashCode());
        result =
                (result * PRIME)
                        + (this.maxInputTokens == null ? 43 : this.maxInputTokens.hashCode());
        result = (result * PRIME) + (this.temperature == null ? 43 : this.temperature.hashCode());
        result = (result * PRIME) + (this.topK == null ? 43 : this.topK.hashCode());
        result = (result * PRIME) + (this.topP == null ? 43 : this.topP.hashCode());
        result =
                (result * PRIME)
                        + (this.promptTruncation == null ? 43 : this.promptTruncation.hashCode());
        result =
                (result * PRIME)
                        + (this.frequencyPenalty == null ? 43 : this.frequencyPenalty.hashCode());
        result =
                (result * PRIME)
                        + (this.presencePenalty == null ? 43 : this.presencePenalty.hashCode());
        result = (result * PRIME) + (this.seed == null ? 43 : this.seed.hashCode());
        result = (result * PRIME) + (this.isEcho == null ? 43 : this.isEcho.hashCode());
        result = (result * PRIME) + (this.tools == null ? 43 : this.tools.hashCode());
        result = (result * PRIME) + (this.toolResults == null ? 43 : this.toolResults.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceSingleStep == null ? 43 : this.isForceSingleStep.hashCode());
        result =
                (result * PRIME)
                        + (this.stopSequences == null ? 43 : this.stopSequences.hashCode());
        result =
                (result * PRIME)
                        + (this.isRawPrompting == null ? 43 : this.isRawPrompting.hashCode());
        result =
                (result * PRIME)
                        + (this.citationQuality == null ? 43 : this.citationQuality.hashCode());
        result = (result * PRIME) + (this.safetyMode == null ? 43 : this.safetyMode.hashCode());
        return result;
    }
}
