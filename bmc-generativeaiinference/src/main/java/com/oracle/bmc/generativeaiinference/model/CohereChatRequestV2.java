/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
        builder = CohereChatRequestV2.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "apiFormat")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereChatRequestV2 extends BaseChatRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of chat messages in chronological order, representing a conversation between the
         * user and the model.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("messages")
        private java.util.List<CohereMessageV2> messages;

        /**
         * A list of chat messages in chronological order, representing a conversation between the
         * user and the model.
         *
         * @param messages the value to set
         * @return this builder
         */
        public Builder messages(java.util.List<CohereMessageV2> messages) {
            this.messages = messages;
            this.__explicitlySet__.add("messages");
            return this;
        }
        /**
         * A list of relevant documents that the model can refer to for generating grounded
         * responses to the user's requests. Some example keys that you can add to the dictionary
         * are "text", "author", and "date". Keep the total word count of the strings in the
         * dictionary to 300 words or less.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<Object> documents;

        /**
         * A list of relevant documents that the model can refer to for generating grounded
         * responses to the user's requests. Some example keys that you can add to the dictionary
         * are "text", "author", and "date". Keep the total word count of the strings in the
         * dictionary to 300 words or less.
         *
         * @param documents the value to set
         * @return this builder
         */
        public Builder documents(java.util.List<Object> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("citationOptions")
        private CitationOptionsV2 citationOptions;

        public Builder citationOptions(CitationOptionsV2 citationOptions) {
            this.citationOptions = citationOptions;
            this.__explicitlySet__.add("citationOptions");
            return this;
        }
        /**
         * Used to control whether or not the model will be forced to use a tool when answering.
         * When REQUIRED is specified, the model will be forced to use at least one of the
         * user-defined tools, and the tools parameter must be passed in the request. When NONE is
         * specified, the model will be forced not to use one of the specified tools, and give a
         * direct response. If tool_choice isn\u2019t specified, then the model is free to choose
         * whether to use the specified tools or not. Note:This parameter is only compatible with
         * models Command-r7b and newer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toolsChoice")
        private ToolsChoice toolsChoice;

        /**
         * Used to control whether or not the model will be forced to use a tool when answering.
         * When REQUIRED is specified, the model will be forced to use at least one of the
         * user-defined tools, and the tools parameter must be passed in the request. When NONE is
         * specified, the model will be forced not to use one of the specified tools, and give a
         * direct response. If tool_choice isn\u2019t specified, then the model is free to choose
         * whether to use the specified tools or not. Note:This parameter is only compatible with
         * models Command-r7b and newer.
         *
         * @param toolsChoice the value to set
         * @return this builder
         */
        public Builder toolsChoice(ToolsChoice toolsChoice) {
            this.toolsChoice = toolsChoice;
            this.__explicitlySet__.add("toolsChoice");
            return this;
        }
        /**
         * A list of available tools (functions) that the model may suggest invoking before
         * producing a text response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tools")
        private java.util.List<CohereToolV2> tools;

        /**
         * A list of available tools (functions) that the model may suggest invoking before
         * producing a text response.
         *
         * @param tools the value to set
         * @return this builder
         */
        public Builder tools(java.util.List<CohereToolV2> tools) {
            this.tools = tools;
            this.__explicitlySet__.add("tools");
            return this;
        }
        /**
         * When set to true, tool calls in the Assistant message will be forced to follow the tool
         * definition strictly. Note:The first few requests with a new set of tools will take longer
         * to process.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStrictToolsEnabled")
        private Boolean isStrictToolsEnabled;

        /**
         * When set to true, tool calls in the Assistant message will be forced to follow the tool
         * definition strictly. Note:The first few requests with a new set of tools will take longer
         * to process.
         *
         * @param isStrictToolsEnabled the value to set
         * @return this builder
         */
        public Builder isStrictToolsEnabled(Boolean isStrictToolsEnabled) {
            this.isStrictToolsEnabled = isStrictToolsEnabled;
            this.__explicitlySet__.add("isStrictToolsEnabled");
            return this;
        }
        /** The log probabilities of the generated tokens will be included in the response. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLogProbsEnabled")
        private Boolean isLogProbsEnabled;

        /**
         * The log probabilities of the generated tokens will be included in the response.
         *
         * @param isLogProbsEnabled the value to set
         * @return this builder
         */
        public Builder isLogProbsEnabled(Boolean isLogProbsEnabled) {
            this.isLogProbsEnabled = isLogProbsEnabled;
            this.__explicitlySet__.add("isLogProbsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("thinking")
        private CohereThinkingV2 thinking;

        public Builder thinking(CohereThinkingV2 thinking) {
            this.thinking = thinking;
            this.__explicitlySet__.add("thinking");
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

        @com.fasterxml.jackson.annotation.JsonProperty("streamOptions")
        private StreamOptions streamOptions;

        public Builder streamOptions(StreamOptions streamOptions) {
            this.streamOptions = streamOptions;
            this.__explicitlySet__.add("streamOptions");
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
         * The priority of the request (lower means earlier handling; default 0 highest priority).
         * Higher priority requests are handled first, and dropped last when the system is under
         * load.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * The priority of the request (lower means earlier handling; default 0 highest priority).
         * Higher priority requests are handled first, and dropped last when the system is under
         * load.
         *
         * @param priority the value to set
         * @return this builder
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
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

        public CohereChatRequestV2 build() {
            CohereChatRequestV2 model =
                    new CohereChatRequestV2(
                            this.messages,
                            this.documents,
                            this.citationOptions,
                            this.toolsChoice,
                            this.tools,
                            this.isStrictToolsEnabled,
                            this.isLogProbsEnabled,
                            this.thinking,
                            this.responseFormat,
                            this.isSearchQueriesOnly,
                            this.streamOptions,
                            this.isStream,
                            this.maxTokens,
                            this.temperature,
                            this.topK,
                            this.topP,
                            this.frequencyPenalty,
                            this.presencePenalty,
                            this.seed,
                            this.stopSequences,
                            this.priority,
                            this.isRawPrompting,
                            this.safetyMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereChatRequestV2 model) {
            if (model.wasPropertyExplicitlySet("messages")) {
                this.messages(model.getMessages());
            }
            if (model.wasPropertyExplicitlySet("documents")) {
                this.documents(model.getDocuments());
            }
            if (model.wasPropertyExplicitlySet("citationOptions")) {
                this.citationOptions(model.getCitationOptions());
            }
            if (model.wasPropertyExplicitlySet("toolsChoice")) {
                this.toolsChoice(model.getToolsChoice());
            }
            if (model.wasPropertyExplicitlySet("tools")) {
                this.tools(model.getTools());
            }
            if (model.wasPropertyExplicitlySet("isStrictToolsEnabled")) {
                this.isStrictToolsEnabled(model.getIsStrictToolsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isLogProbsEnabled")) {
                this.isLogProbsEnabled(model.getIsLogProbsEnabled());
            }
            if (model.wasPropertyExplicitlySet("thinking")) {
                this.thinking(model.getThinking());
            }
            if (model.wasPropertyExplicitlySet("responseFormat")) {
                this.responseFormat(model.getResponseFormat());
            }
            if (model.wasPropertyExplicitlySet("isSearchQueriesOnly")) {
                this.isSearchQueriesOnly(model.getIsSearchQueriesOnly());
            }
            if (model.wasPropertyExplicitlySet("streamOptions")) {
                this.streamOptions(model.getStreamOptions());
            }
            if (model.wasPropertyExplicitlySet("isStream")) {
                this.isStream(model.getIsStream());
            }
            if (model.wasPropertyExplicitlySet("maxTokens")) {
                this.maxTokens(model.getMaxTokens());
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
            if (model.wasPropertyExplicitlySet("frequencyPenalty")) {
                this.frequencyPenalty(model.getFrequencyPenalty());
            }
            if (model.wasPropertyExplicitlySet("presencePenalty")) {
                this.presencePenalty(model.getPresencePenalty());
            }
            if (model.wasPropertyExplicitlySet("seed")) {
                this.seed(model.getSeed());
            }
            if (model.wasPropertyExplicitlySet("stopSequences")) {
                this.stopSequences(model.getStopSequences());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("isRawPrompting")) {
                this.isRawPrompting(model.getIsRawPrompting());
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
    public CohereChatRequestV2(
            java.util.List<CohereMessageV2> messages,
            java.util.List<Object> documents,
            CitationOptionsV2 citationOptions,
            ToolsChoice toolsChoice,
            java.util.List<CohereToolV2> tools,
            Boolean isStrictToolsEnabled,
            Boolean isLogProbsEnabled,
            CohereThinkingV2 thinking,
            CohereResponseFormat responseFormat,
            Boolean isSearchQueriesOnly,
            StreamOptions streamOptions,
            Boolean isStream,
            Integer maxTokens,
            Double temperature,
            Integer topK,
            Double topP,
            Double frequencyPenalty,
            Double presencePenalty,
            Integer seed,
            java.util.List<String> stopSequences,
            Integer priority,
            Boolean isRawPrompting,
            SafetyMode safetyMode) {
        super();
        this.messages = messages;
        this.documents = documents;
        this.citationOptions = citationOptions;
        this.toolsChoice = toolsChoice;
        this.tools = tools;
        this.isStrictToolsEnabled = isStrictToolsEnabled;
        this.isLogProbsEnabled = isLogProbsEnabled;
        this.thinking = thinking;
        this.responseFormat = responseFormat;
        this.isSearchQueriesOnly = isSearchQueriesOnly;
        this.streamOptions = streamOptions;
        this.isStream = isStream;
        this.maxTokens = maxTokens;
        this.temperature = temperature;
        this.topK = topK;
        this.topP = topP;
        this.frequencyPenalty = frequencyPenalty;
        this.presencePenalty = presencePenalty;
        this.seed = seed;
        this.stopSequences = stopSequences;
        this.priority = priority;
        this.isRawPrompting = isRawPrompting;
        this.safetyMode = safetyMode;
    }

    /**
     * A list of chat messages in chronological order, representing a conversation between the user
     * and the model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("messages")
    private final java.util.List<CohereMessageV2> messages;

    /**
     * A list of chat messages in chronological order, representing a conversation between the user
     * and the model.
     *
     * @return the value
     */
    public java.util.List<CohereMessageV2> getMessages() {
        return messages;
    }

    /**
     * A list of relevant documents that the model can refer to for generating grounded responses to
     * the user's requests. Some example keys that you can add to the dictionary are "text",
     * "author", and "date". Keep the total word count of the strings in the dictionary to 300 words
     * or less.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<Object> documents;

    /**
     * A list of relevant documents that the model can refer to for generating grounded responses to
     * the user's requests. Some example keys that you can add to the dictionary are "text",
     * "author", and "date". Keep the total word count of the strings in the dictionary to 300 words
     * or less.
     *
     * @return the value
     */
    public java.util.List<Object> getDocuments() {
        return documents;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("citationOptions")
    private final CitationOptionsV2 citationOptions;

    public CitationOptionsV2 getCitationOptions() {
        return citationOptions;
    }

    /**
     * Used to control whether or not the model will be forced to use a tool when answering. When
     * REQUIRED is specified, the model will be forced to use at least one of the user-defined
     * tools, and the tools parameter must be passed in the request. When NONE is specified, the
     * model will be forced not to use one of the specified tools, and give a direct response. If
     * tool_choice isn\u2019t specified, then the model is free to choose whether to use the
     * specified tools or not. Note:This parameter is only compatible with models Command-r7b and
     * newer.
     */
    public enum ToolsChoice implements com.oracle.bmc.http.internal.BmcEnum {
        Required("REQUIRED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, ToolsChoice> map;

        static {
            map = new java.util.HashMap<>();
            for (ToolsChoice v : ToolsChoice.values()) {
                map.put(v.getValue(), v);
            }
        }

        ToolsChoice(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ToolsChoice create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ToolsChoice: " + key);
        }
    };
    /**
     * Used to control whether or not the model will be forced to use a tool when answering. When
     * REQUIRED is specified, the model will be forced to use at least one of the user-defined
     * tools, and the tools parameter must be passed in the request. When NONE is specified, the
     * model will be forced not to use one of the specified tools, and give a direct response. If
     * tool_choice isn\u2019t specified, then the model is free to choose whether to use the
     * specified tools or not. Note:This parameter is only compatible with models Command-r7b and
     * newer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toolsChoice")
    private final ToolsChoice toolsChoice;

    /**
     * Used to control whether or not the model will be forced to use a tool when answering. When
     * REQUIRED is specified, the model will be forced to use at least one of the user-defined
     * tools, and the tools parameter must be passed in the request. When NONE is specified, the
     * model will be forced not to use one of the specified tools, and give a direct response. If
     * tool_choice isn\u2019t specified, then the model is free to choose whether to use the
     * specified tools or not. Note:This parameter is only compatible with models Command-r7b and
     * newer.
     *
     * @return the value
     */
    public ToolsChoice getToolsChoice() {
        return toolsChoice;
    }

    /**
     * A list of available tools (functions) that the model may suggest invoking before producing a
     * text response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tools")
    private final java.util.List<CohereToolV2> tools;

    /**
     * A list of available tools (functions) that the model may suggest invoking before producing a
     * text response.
     *
     * @return the value
     */
    public java.util.List<CohereToolV2> getTools() {
        return tools;
    }

    /**
     * When set to true, tool calls in the Assistant message will be forced to follow the tool
     * definition strictly. Note:The first few requests with a new set of tools will take longer to
     * process.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStrictToolsEnabled")
    private final Boolean isStrictToolsEnabled;

    /**
     * When set to true, tool calls in the Assistant message will be forced to follow the tool
     * definition strictly. Note:The first few requests with a new set of tools will take longer to
     * process.
     *
     * @return the value
     */
    public Boolean getIsStrictToolsEnabled() {
        return isStrictToolsEnabled;
    }

    /** The log probabilities of the generated tokens will be included in the response. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLogProbsEnabled")
    private final Boolean isLogProbsEnabled;

    /**
     * The log probabilities of the generated tokens will be included in the response.
     *
     * @return the value
     */
    public Boolean getIsLogProbsEnabled() {
        return isLogProbsEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("thinking")
    private final CohereThinkingV2 thinking;

    public CohereThinkingV2 getThinking() {
        return thinking;
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

    @com.fasterxml.jackson.annotation.JsonProperty("streamOptions")
    private final StreamOptions streamOptions;

    public StreamOptions getStreamOptions() {
        return streamOptions;
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
     * The priority of the request (lower means earlier handling; default 0 highest priority).
     * Higher priority requests are handled first, and dropped last when the system is under load.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * The priority of the request (lower means earlier handling; default 0 highest priority).
     * Higher priority requests are handled first, and dropped last when the system is under load.
     *
     * @return the value
     */
    public Integer getPriority() {
        return priority;
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
        sb.append("CohereChatRequestV2(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", messages=").append(String.valueOf(this.messages));
        sb.append(", documents=").append(String.valueOf(this.documents));
        sb.append(", citationOptions=").append(String.valueOf(this.citationOptions));
        sb.append(", toolsChoice=").append(String.valueOf(this.toolsChoice));
        sb.append(", tools=").append(String.valueOf(this.tools));
        sb.append(", isStrictToolsEnabled=").append(String.valueOf(this.isStrictToolsEnabled));
        sb.append(", isLogProbsEnabled=").append(String.valueOf(this.isLogProbsEnabled));
        sb.append(", thinking=").append(String.valueOf(this.thinking));
        sb.append(", responseFormat=").append(String.valueOf(this.responseFormat));
        sb.append(", isSearchQueriesOnly=").append(String.valueOf(this.isSearchQueriesOnly));
        sb.append(", streamOptions=").append(String.valueOf(this.streamOptions));
        sb.append(", isStream=").append(String.valueOf(this.isStream));
        sb.append(", maxTokens=").append(String.valueOf(this.maxTokens));
        sb.append(", temperature=").append(String.valueOf(this.temperature));
        sb.append(", topK=").append(String.valueOf(this.topK));
        sb.append(", topP=").append(String.valueOf(this.topP));
        sb.append(", frequencyPenalty=").append(String.valueOf(this.frequencyPenalty));
        sb.append(", presencePenalty=").append(String.valueOf(this.presencePenalty));
        sb.append(", seed=").append(String.valueOf(this.seed));
        sb.append(", stopSequences=").append(String.valueOf(this.stopSequences));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", isRawPrompting=").append(String.valueOf(this.isRawPrompting));
        sb.append(", safetyMode=").append(String.valueOf(this.safetyMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereChatRequestV2)) {
            return false;
        }

        CohereChatRequestV2 other = (CohereChatRequestV2) o;
        return java.util.Objects.equals(this.messages, other.messages)
                && java.util.Objects.equals(this.documents, other.documents)
                && java.util.Objects.equals(this.citationOptions, other.citationOptions)
                && java.util.Objects.equals(this.toolsChoice, other.toolsChoice)
                && java.util.Objects.equals(this.tools, other.tools)
                && java.util.Objects.equals(this.isStrictToolsEnabled, other.isStrictToolsEnabled)
                && java.util.Objects.equals(this.isLogProbsEnabled, other.isLogProbsEnabled)
                && java.util.Objects.equals(this.thinking, other.thinking)
                && java.util.Objects.equals(this.responseFormat, other.responseFormat)
                && java.util.Objects.equals(this.isSearchQueriesOnly, other.isSearchQueriesOnly)
                && java.util.Objects.equals(this.streamOptions, other.streamOptions)
                && java.util.Objects.equals(this.isStream, other.isStream)
                && java.util.Objects.equals(this.maxTokens, other.maxTokens)
                && java.util.Objects.equals(this.temperature, other.temperature)
                && java.util.Objects.equals(this.topK, other.topK)
                && java.util.Objects.equals(this.topP, other.topP)
                && java.util.Objects.equals(this.frequencyPenalty, other.frequencyPenalty)
                && java.util.Objects.equals(this.presencePenalty, other.presencePenalty)
                && java.util.Objects.equals(this.seed, other.seed)
                && java.util.Objects.equals(this.stopSequences, other.stopSequences)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.isRawPrompting, other.isRawPrompting)
                && java.util.Objects.equals(this.safetyMode, other.safetyMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.messages == null ? 43 : this.messages.hashCode());
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result =
                (result * PRIME)
                        + (this.citationOptions == null ? 43 : this.citationOptions.hashCode());
        result = (result * PRIME) + (this.toolsChoice == null ? 43 : this.toolsChoice.hashCode());
        result = (result * PRIME) + (this.tools == null ? 43 : this.tools.hashCode());
        result =
                (result * PRIME)
                        + (this.isStrictToolsEnabled == null
                                ? 43
                                : this.isStrictToolsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isLogProbsEnabled == null ? 43 : this.isLogProbsEnabled.hashCode());
        result = (result * PRIME) + (this.thinking == null ? 43 : this.thinking.hashCode());
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
                        + (this.streamOptions == null ? 43 : this.streamOptions.hashCode());
        result = (result * PRIME) + (this.isStream == null ? 43 : this.isStream.hashCode());
        result = (result * PRIME) + (this.maxTokens == null ? 43 : this.maxTokens.hashCode());
        result = (result * PRIME) + (this.temperature == null ? 43 : this.temperature.hashCode());
        result = (result * PRIME) + (this.topK == null ? 43 : this.topK.hashCode());
        result = (result * PRIME) + (this.topP == null ? 43 : this.topP.hashCode());
        result =
                (result * PRIME)
                        + (this.frequencyPenalty == null ? 43 : this.frequencyPenalty.hashCode());
        result =
                (result * PRIME)
                        + (this.presencePenalty == null ? 43 : this.presencePenalty.hashCode());
        result = (result * PRIME) + (this.seed == null ? 43 : this.seed.hashCode());
        result =
                (result * PRIME)
                        + (this.stopSequences == null ? 43 : this.stopSequences.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result =
                (result * PRIME)
                        + (this.isRawPrompting == null ? 43 : this.isRawPrompting.hashCode());
        result = (result * PRIME) + (this.safetyMode == null ? 43 : this.safetyMode.hashCode());
        return result;
    }
}
