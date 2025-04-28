/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details for the chat request. <br>
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
        builder = GenericChatRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "apiFormat")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenericChatRequest extends BaseChatRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The series of messages in a chat request. Includes the previous messages in a
         * conversation. Each message includes a role ({@code USER} or the {@code CHATBOT}) and
         * content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("messages")
        private java.util.List<Message> messages;

        /**
         * The series of messages in a chat request. Includes the previous messages in a
         * conversation. Each message includes a role ({@code USER} or the {@code CHATBOT}) and
         * content.
         *
         * @param messages the value to set
         * @return this builder
         */
        public Builder messages(java.util.List<Message> messages) {
            this.messages = messages;
            this.__explicitlySet__.add("messages");
            return this;
        }
        /**
         * Whether to stream back partial progress. If set to true, as tokens become available, they
         * are sent as data-only server-sent events.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStream")
        private Boolean isStream;

        /**
         * Whether to stream back partial progress. If set to true, as tokens become available, they
         * are sent as data-only server-sent events.
         *
         * @param isStream the value to set
         * @return this builder
         */
        public Builder isStream(Boolean isStream) {
            this.isStream = isStream;
            this.__explicitlySet__.add("isStream");
            return this;
        }
        /** The number of of generated texts that will be returned. */
        @com.fasterxml.jackson.annotation.JsonProperty("numGenerations")
        private Integer numGenerations;

        /**
         * The number of of generated texts that will be returned.
         *
         * @param numGenerations the value to set
         * @return this builder
         */
        public Builder numGenerations(Integer numGenerations) {
            this.numGenerations = numGenerations;
            this.__explicitlySet__.add("numGenerations");
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
        /**
         * Whether to include the user prompt in the response. Applies only to non-stream results.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
        private Boolean isEcho;

        /**
         * Whether to include the user prompt in the response. Applies only to non-stream results.
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
         * An integer that sets up the model to use only the top k most likely tokens in the
         * generated output. A higher k introduces more randomness into the output making the output
         * text sound more natural. Default value is -1 which means to consider all tokens. Setting
         * to 0 disables this method and considers all tokens.
         *
         * <p>If also using top p, then the model considers only the top tokens whose probabilities
         * add up to p percent and ignores the rest of the k tokens. For example, if k is 20, but
         * the probabilities of the top 10 add up to .75, then only the top 10 tokens are chosen.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("topK")
        private Integer topK;

        /**
         * An integer that sets up the model to use only the top k most likely tokens in the
         * generated output. A higher k introduces more randomness into the output making the output
         * text sound more natural. Default value is -1 which means to consider all tokens. Setting
         * to 0 disables this method and considers all tokens.
         *
         * <p>If also using top p, then the model considers only the top tokens whose probabilities
         * add up to p percent and ignores the rest of the k tokens. For example, if k is 20, but
         * the probabilities of the top 10 add up to .75, then only the top 10 tokens are chosen.
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
         * 25 percent for the next token. Set to 1 to consider all tokens and set to 0 to disable.
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
         * 25 percent for the next token. Set to 1 to consider all tokens and set to 0 to disable.
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
         * A number that sets the randomness of the generated output. A lower temperature means a
         * less random generations.
         *
         * <p>Use lower numbers for tasks with a correct answer such as question answering or
         * summarizing. High temperatures can generate hallucinations or factually incorrect
         * information. Start with temperatures lower than 1.0 and increase the temperature for more
         * creative outputs, as you regenerate the prompts to refine the outputs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("temperature")
        private Double temperature;

        /**
         * A number that sets the randomness of the generated output. A lower temperature means a
         * less random generations.
         *
         * <p>Use lower numbers for tasks with a correct answer such as question answering or
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
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
         * their frequency in the generated text so far. Values > 0 encourage the model to use new
         * tokens and values < 0 encourage the model to repeat tokens. Set to 0 to disable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
        private Double frequencyPenalty;

        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
         * their frequency in the generated text so far. Values > 0 encourage the model to use new
         * tokens and values < 0 encourage the model to repeat tokens. Set to 0 to disable.
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
         * whether they've appeared in the generated text so far. Values > 0 encourage the model to
         * use new tokens and values < 0 encourage the model to repeat tokens.
         *
         * <p>Similar to frequency penalty, a penalty is applied to previously present tokens,
         * except that this penalty is applied equally to all tokens that have already appeared,
         * regardless of how many times they've appeared. Set to 0 to disable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
        private Double presencePenalty;

        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
         * whether they've appeared in the generated text so far. Values > 0 encourage the model to
         * use new tokens and values < 0 encourage the model to repeat tokens.
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
         * List of strings that stop the generation if they are generated for the response text. The
         * returned output will not contain the stop strings.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stop")
        private java.util.List<String> stop;

        /**
         * List of strings that stop the generation if they are generated for the response text. The
         * returned output will not contain the stop strings.
         *
         * @param stop the value to set
         * @return this builder
         */
        public Builder stop(java.util.List<String> stop) {
            this.stop = stop;
            this.__explicitlySet__.add("stop");
            return this;
        }
        /**
         * Includes the logarithmic probabilities for the most likely output tokens and the chosen
         * tokens.
         *
         * <p>For example, if the log probability is 5, the API returns a list of the 5 most likely
         * tokens. The API returns the log probability of the sampled token, so there might be up to
         * logprobs+1 elements in the response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logProbs")
        private Integer logProbs;

        /**
         * Includes the logarithmic probabilities for the most likely output tokens and the chosen
         * tokens.
         *
         * <p>For example, if the log probability is 5, the API returns a list of the 5 most likely
         * tokens. The API returns the log probability of the sampled token, so there might be up to
         * logprobs+1 elements in the response.
         *
         * @param logProbs the value to set
         * @return this builder
         */
        public Builder logProbs(Integer logProbs) {
            this.logProbs = logProbs;
            this.__explicitlySet__.add("logProbs");
            return this;
        }
        /**
         * The maximum number of tokens that can be generated per output sequence. The token count
         * of your prompt plus {@code maxTokens} must not exceed the model's context length. Not
         * setting a value for maxTokens results in the possible use of model's full context length.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
        private Integer maxTokens;

        /**
         * The maximum number of tokens that can be generated per output sequence. The token count
         * of your prompt plus {@code maxTokens} must not exceed the model's context length. Not
         * setting a value for maxTokens results in the possible use of model's full context length.
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
         * Modifies the likelihood of specified tokens that appear in the completion.
         *
         * <p>Example: '{"6395": 2, "8134": 1, "21943": 0.5, "5923": -100}'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logitBias")
        private Object logitBias;

        /**
         * Modifies the likelihood of specified tokens that appear in the completion.
         *
         * <p>Example: '{"6395": 2, "8134": 1, "21943": 0.5, "5923": -100}'
         *
         * @param logitBias the value to set
         * @return this builder
         */
        public Builder logitBias(Object logitBias) {
            this.logitBias = logitBias;
            this.__explicitlySet__.add("logitBias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("toolChoice")
        private ToolChoice toolChoice;

        public Builder toolChoice(ToolChoice toolChoice) {
            this.toolChoice = toolChoice;
            this.__explicitlySet__.add("toolChoice");
            return this;
        }
        /**
         * A list of tools the model may call. Use this to provide a list of functions the model may
         * generate JSON inputs for. A max of 128 functions are supported.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tools")
        private java.util.List<ToolDefinition> tools;

        /**
         * A list of tools the model may call. Use this to provide a list of functions the model may
         * generate JSON inputs for. A max of 128 functions are supported.
         *
         * @param tools the value to set
         * @return this builder
         */
        public Builder tools(java.util.List<ToolDefinition> tools) {
            this.tools = tools;
            this.__explicitlySet__.add("tools");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericChatRequest build() {
            GenericChatRequest model =
                    new GenericChatRequest(
                            this.messages,
                            this.isStream,
                            this.numGenerations,
                            this.seed,
                            this.isEcho,
                            this.topK,
                            this.topP,
                            this.temperature,
                            this.frequencyPenalty,
                            this.presencePenalty,
                            this.stop,
                            this.logProbs,
                            this.maxTokens,
                            this.logitBias,
                            this.toolChoice,
                            this.tools);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericChatRequest model) {
            if (model.wasPropertyExplicitlySet("messages")) {
                this.messages(model.getMessages());
            }
            if (model.wasPropertyExplicitlySet("isStream")) {
                this.isStream(model.getIsStream());
            }
            if (model.wasPropertyExplicitlySet("numGenerations")) {
                this.numGenerations(model.getNumGenerations());
            }
            if (model.wasPropertyExplicitlySet("seed")) {
                this.seed(model.getSeed());
            }
            if (model.wasPropertyExplicitlySet("isEcho")) {
                this.isEcho(model.getIsEcho());
            }
            if (model.wasPropertyExplicitlySet("topK")) {
                this.topK(model.getTopK());
            }
            if (model.wasPropertyExplicitlySet("topP")) {
                this.topP(model.getTopP());
            }
            if (model.wasPropertyExplicitlySet("temperature")) {
                this.temperature(model.getTemperature());
            }
            if (model.wasPropertyExplicitlySet("frequencyPenalty")) {
                this.frequencyPenalty(model.getFrequencyPenalty());
            }
            if (model.wasPropertyExplicitlySet("presencePenalty")) {
                this.presencePenalty(model.getPresencePenalty());
            }
            if (model.wasPropertyExplicitlySet("stop")) {
                this.stop(model.getStop());
            }
            if (model.wasPropertyExplicitlySet("logProbs")) {
                this.logProbs(model.getLogProbs());
            }
            if (model.wasPropertyExplicitlySet("maxTokens")) {
                this.maxTokens(model.getMaxTokens());
            }
            if (model.wasPropertyExplicitlySet("logitBias")) {
                this.logitBias(model.getLogitBias());
            }
            if (model.wasPropertyExplicitlySet("toolChoice")) {
                this.toolChoice(model.getToolChoice());
            }
            if (model.wasPropertyExplicitlySet("tools")) {
                this.tools(model.getTools());
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
    public GenericChatRequest(
            java.util.List<Message> messages,
            Boolean isStream,
            Integer numGenerations,
            Integer seed,
            Boolean isEcho,
            Integer topK,
            Double topP,
            Double temperature,
            Double frequencyPenalty,
            Double presencePenalty,
            java.util.List<String> stop,
            Integer logProbs,
            Integer maxTokens,
            Object logitBias,
            ToolChoice toolChoice,
            java.util.List<ToolDefinition> tools) {
        super();
        this.messages = messages;
        this.isStream = isStream;
        this.numGenerations = numGenerations;
        this.seed = seed;
        this.isEcho = isEcho;
        this.topK = topK;
        this.topP = topP;
        this.temperature = temperature;
        this.frequencyPenalty = frequencyPenalty;
        this.presencePenalty = presencePenalty;
        this.stop = stop;
        this.logProbs = logProbs;
        this.maxTokens = maxTokens;
        this.logitBias = logitBias;
        this.toolChoice = toolChoice;
        this.tools = tools;
    }

    /**
     * The series of messages in a chat request. Includes the previous messages in a conversation.
     * Each message includes a role ({@code USER} or the {@code CHATBOT}) and content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("messages")
    private final java.util.List<Message> messages;

    /**
     * The series of messages in a chat request. Includes the previous messages in a conversation.
     * Each message includes a role ({@code USER} or the {@code CHATBOT}) and content.
     *
     * @return the value
     */
    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * Whether to stream back partial progress. If set to true, as tokens become available, they are
     * sent as data-only server-sent events.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStream")
    private final Boolean isStream;

    /**
     * Whether to stream back partial progress. If set to true, as tokens become available, they are
     * sent as data-only server-sent events.
     *
     * @return the value
     */
    public Boolean getIsStream() {
        return isStream;
    }

    /** The number of of generated texts that will be returned. */
    @com.fasterxml.jackson.annotation.JsonProperty("numGenerations")
    private final Integer numGenerations;

    /**
     * The number of of generated texts that will be returned.
     *
     * @return the value
     */
    public Integer getNumGenerations() {
        return numGenerations;
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

    /** Whether to include the user prompt in the response. Applies only to non-stream results. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
    private final Boolean isEcho;

    /**
     * Whether to include the user prompt in the response. Applies only to non-stream results.
     *
     * @return the value
     */
    public Boolean getIsEcho() {
        return isEcho;
    }

    /**
     * An integer that sets up the model to use only the top k most likely tokens in the generated
     * output. A higher k introduces more randomness into the output making the output text sound
     * more natural. Default value is -1 which means to consider all tokens. Setting to 0 disables
     * this method and considers all tokens.
     *
     * <p>If also using top p, then the model considers only the top tokens whose probabilities add
     * up to p percent and ignores the rest of the k tokens. For example, if k is 20, but the
     * probabilities of the top 10 add up to .75, then only the top 10 tokens are chosen.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topK")
    private final Integer topK;

    /**
     * An integer that sets up the model to use only the top k most likely tokens in the generated
     * output. A higher k introduces more randomness into the output making the output text sound
     * more natural. Default value is -1 which means to consider all tokens. Setting to 0 disables
     * this method and considers all tokens.
     *
     * <p>If also using top p, then the model considers only the top tokens whose probabilities add
     * up to p percent and ignores the rest of the k tokens. For example, if k is 20, but the
     * probabilities of the top 10 add up to .75, then only the top 10 tokens are chosen.
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
     * percent for the next token. Set to 1 to consider all tokens and set to 0 to disable. If both
     * k and p are enabled, p acts after k.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topP")
    private final Double topP;

    /**
     * If set to a probability 0.0 < p < 1.0, it ensures that only the most likely tokens, with
     * total probability mass of p, are considered for generation at each step.
     *
     * <p>To eliminate tokens with low likelihood, assign p a minimum percentage for the next
     * token's likelihood. For example, when p is set to 0.75, the model eliminates the bottom 25
     * percent for the next token. Set to 1 to consider all tokens and set to 0 to disable. If both
     * k and p are enabled, p acts after k.
     *
     * @return the value
     */
    public Double getTopP() {
        return topP;
    }

    /**
     * A number that sets the randomness of the generated output. A lower temperature means a less
     * random generations.
     *
     * <p>Use lower numbers for tasks with a correct answer such as question answering or
     * summarizing. High temperatures can generate hallucinations or factually incorrect
     * information. Start with temperatures lower than 1.0 and increase the temperature for more
     * creative outputs, as you regenerate the prompts to refine the outputs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("temperature")
    private final Double temperature;

    /**
     * A number that sets the randomness of the generated output. A lower temperature means a less
     * random generations.
     *
     * <p>Use lower numbers for tasks with a correct answer such as question answering or
     * summarizing. High temperatures can generate hallucinations or factually incorrect
     * information. Start with temperatures lower than 1.0 and increase the temperature for more
     * creative outputs, as you regenerate the prompts to refine the outputs.
     *
     * @return the value
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on their
     * frequency in the generated text so far. Values > 0 encourage the model to use new tokens and
     * values < 0 encourage the model to repeat tokens. Set to 0 to disable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
    private final Double frequencyPenalty;

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on their
     * frequency in the generated text so far. Values > 0 encourage the model to use new tokens and
     * values < 0 encourage the model to repeat tokens. Set to 0 to disable.
     *
     * @return the value
     */
    public Double getFrequencyPenalty() {
        return frequencyPenalty;
    }

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
     * whether they've appeared in the generated text so far. Values > 0 encourage the model to use
     * new tokens and values < 0 encourage the model to repeat tokens.
     *
     * <p>Similar to frequency penalty, a penalty is applied to previously present tokens, except
     * that this penalty is applied equally to all tokens that have already appeared, regardless of
     * how many times they've appeared. Set to 0 to disable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
    private final Double presencePenalty;

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on
     * whether they've appeared in the generated text so far. Values > 0 encourage the model to use
     * new tokens and values < 0 encourage the model to repeat tokens.
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
     * List of strings that stop the generation if they are generated for the response text. The
     * returned output will not contain the stop strings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stop")
    private final java.util.List<String> stop;

    /**
     * List of strings that stop the generation if they are generated for the response text. The
     * returned output will not contain the stop strings.
     *
     * @return the value
     */
    public java.util.List<String> getStop() {
        return stop;
    }

    /**
     * Includes the logarithmic probabilities for the most likely output tokens and the chosen
     * tokens.
     *
     * <p>For example, if the log probability is 5, the API returns a list of the 5 most likely
     * tokens. The API returns the log probability of the sampled token, so there might be up to
     * logprobs+1 elements in the response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logProbs")
    private final Integer logProbs;

    /**
     * Includes the logarithmic probabilities for the most likely output tokens and the chosen
     * tokens.
     *
     * <p>For example, if the log probability is 5, the API returns a list of the 5 most likely
     * tokens. The API returns the log probability of the sampled token, so there might be up to
     * logprobs+1 elements in the response.
     *
     * @return the value
     */
    public Integer getLogProbs() {
        return logProbs;
    }

    /**
     * The maximum number of tokens that can be generated per output sequence. The token count of
     * your prompt plus {@code maxTokens} must not exceed the model's context length. Not setting a
     * value for maxTokens results in the possible use of model's full context length.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
    private final Integer maxTokens;

    /**
     * The maximum number of tokens that can be generated per output sequence. The token count of
     * your prompt plus {@code maxTokens} must not exceed the model's context length. Not setting a
     * value for maxTokens results in the possible use of model's full context length.
     *
     * @return the value
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    /**
     * Modifies the likelihood of specified tokens that appear in the completion.
     *
     * <p>Example: '{"6395": 2, "8134": 1, "21943": 0.5, "5923": -100}'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logitBias")
    private final Object logitBias;

    /**
     * Modifies the likelihood of specified tokens that appear in the completion.
     *
     * <p>Example: '{"6395": 2, "8134": 1, "21943": 0.5, "5923": -100}'
     *
     * @return the value
     */
    public Object getLogitBias() {
        return logitBias;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("toolChoice")
    private final ToolChoice toolChoice;

    public ToolChoice getToolChoice() {
        return toolChoice;
    }

    /**
     * A list of tools the model may call. Use this to provide a list of functions the model may
     * generate JSON inputs for. A max of 128 functions are supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tools")
    private final java.util.List<ToolDefinition> tools;

    /**
     * A list of tools the model may call. Use this to provide a list of functions the model may
     * generate JSON inputs for. A max of 128 functions are supported.
     *
     * @return the value
     */
    public java.util.List<ToolDefinition> getTools() {
        return tools;
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
        sb.append("GenericChatRequest(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", messages=").append(String.valueOf(this.messages));
        sb.append(", isStream=").append(String.valueOf(this.isStream));
        sb.append(", numGenerations=").append(String.valueOf(this.numGenerations));
        sb.append(", seed=").append(String.valueOf(this.seed));
        sb.append(", isEcho=").append(String.valueOf(this.isEcho));
        sb.append(", topK=").append(String.valueOf(this.topK));
        sb.append(", topP=").append(String.valueOf(this.topP));
        sb.append(", temperature=").append(String.valueOf(this.temperature));
        sb.append(", frequencyPenalty=").append(String.valueOf(this.frequencyPenalty));
        sb.append(", presencePenalty=").append(String.valueOf(this.presencePenalty));
        sb.append(", stop=").append(String.valueOf(this.stop));
        sb.append(", logProbs=").append(String.valueOf(this.logProbs));
        sb.append(", maxTokens=").append(String.valueOf(this.maxTokens));
        sb.append(", logitBias=").append(String.valueOf(this.logitBias));
        sb.append(", toolChoice=").append(String.valueOf(this.toolChoice));
        sb.append(", tools=").append(String.valueOf(this.tools));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericChatRequest)) {
            return false;
        }

        GenericChatRequest other = (GenericChatRequest) o;
        return java.util.Objects.equals(this.messages, other.messages)
                && java.util.Objects.equals(this.isStream, other.isStream)
                && java.util.Objects.equals(this.numGenerations, other.numGenerations)
                && java.util.Objects.equals(this.seed, other.seed)
                && java.util.Objects.equals(this.isEcho, other.isEcho)
                && java.util.Objects.equals(this.topK, other.topK)
                && java.util.Objects.equals(this.topP, other.topP)
                && java.util.Objects.equals(this.temperature, other.temperature)
                && java.util.Objects.equals(this.frequencyPenalty, other.frequencyPenalty)
                && java.util.Objects.equals(this.presencePenalty, other.presencePenalty)
                && java.util.Objects.equals(this.stop, other.stop)
                && java.util.Objects.equals(this.logProbs, other.logProbs)
                && java.util.Objects.equals(this.maxTokens, other.maxTokens)
                && java.util.Objects.equals(this.logitBias, other.logitBias)
                && java.util.Objects.equals(this.toolChoice, other.toolChoice)
                && java.util.Objects.equals(this.tools, other.tools)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.messages == null ? 43 : this.messages.hashCode());
        result = (result * PRIME) + (this.isStream == null ? 43 : this.isStream.hashCode());
        result =
                (result * PRIME)
                        + (this.numGenerations == null ? 43 : this.numGenerations.hashCode());
        result = (result * PRIME) + (this.seed == null ? 43 : this.seed.hashCode());
        result = (result * PRIME) + (this.isEcho == null ? 43 : this.isEcho.hashCode());
        result = (result * PRIME) + (this.topK == null ? 43 : this.topK.hashCode());
        result = (result * PRIME) + (this.topP == null ? 43 : this.topP.hashCode());
        result = (result * PRIME) + (this.temperature == null ? 43 : this.temperature.hashCode());
        result =
                (result * PRIME)
                        + (this.frequencyPenalty == null ? 43 : this.frequencyPenalty.hashCode());
        result =
                (result * PRIME)
                        + (this.presencePenalty == null ? 43 : this.presencePenalty.hashCode());
        result = (result * PRIME) + (this.stop == null ? 43 : this.stop.hashCode());
        result = (result * PRIME) + (this.logProbs == null ? 43 : this.logProbs.hashCode());
        result = (result * PRIME) + (this.maxTokens == null ? 43 : this.maxTokens.hashCode());
        result = (result * PRIME) + (this.logitBias == null ? 43 : this.logitBias.hashCode());
        result = (result * PRIME) + (this.toolChoice == null ? 43 : this.toolChoice.hashCode());
        result = (result * PRIME) + (this.tools == null ? 43 : this.tools.hashCode());
        return result;
    }
}
