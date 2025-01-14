/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details for the text generation request for Cohere models. <br>
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
        builder = CohereLlmInferenceRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "runtimeType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereLlmInferenceRequest extends LlmInferenceRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Represents the prompt to be completed. The trailing white spaces are trimmed before
         * completion.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("prompt")
        private String prompt;

        /**
         * Represents the prompt to be completed. The trailing white spaces are trimmed before
         * completion.
         *
         * @param prompt the value to set
         * @return this builder
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            this.__explicitlySet__.add("prompt");
            return this;
        }
        /**
         * Whether to stream back partial progress. If set, tokens are sent as data-only server-sent
         * events as they become available.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStream")
        private Boolean isStream;

        /**
         * Whether to stream back partial progress. If set, tokens are sent as data-only server-sent
         * events as they become available.
         *
         * @param isStream the value to set
         * @return this builder
         */
        public Builder isStream(Boolean isStream) {
            this.isStream = isStream;
            this.__explicitlySet__.add("isStream");
            return this;
        }
        /** The number of generated texts that will be returned. */
        @com.fasterxml.jackson.annotation.JsonProperty("numGenerations")
        private Integer numGenerations;

        /**
         * The number of generated texts that will be returned.
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
         * Whether or not to return the user prompt in the response. This option only applies to
         * non-stream results.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
        private Boolean isEcho;

        /**
         * Whether or not to return the user prompt in the response. This option only applies to
         * non-stream results.
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
         * The maximum number of tokens to predict for each response. Includes input plus output
         * tokens.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
        private Integer maxTokens;

        /**
         * The maximum number of tokens to predict for each response. Includes input plus output
         * tokens.
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
         * An integer that sets up the model to use only the top k most likely tokens in the
         * generated output. A higher k introduces more randomness into the output making the output
         * text sound more natural. Default value is 0 which disables this method and considers all
         * tokens. To set a number for the likely tokens, choose an integer between 1 and 500.
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
         * text sound more natural. Default value is 0 which disables this method and considers all
         * tokens. To set a number for the likely tokens, choose an integer between 1 and 500.
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
         * The generated text is cut at the end of the earliest occurrence of this stop sequence.
         * The generated text will include this stop sequence.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stopSequences")
        private java.util.List<String> stopSequences;

        /**
         * The generated text is cut at the end of the earliest occurrence of this stop sequence.
         * The generated text will include this stop sequence.
         *
         * @param stopSequences the value to set
         * @return this builder
         */
        public Builder stopSequences(java.util.List<String> stopSequences) {
            this.stopSequences = stopSequences;
            this.__explicitlySet__.add("stopSequences");
            return this;
        }
        /** Specifies how and if the token likelihoods are returned with the response. */
        @com.fasterxml.jackson.annotation.JsonProperty("returnLikelihoods")
        private ReturnLikelihoods returnLikelihoods;

        /**
         * Specifies how and if the token likelihoods are returned with the response.
         *
         * @param returnLikelihoods the value to set
         * @return this builder
         */
        public Builder returnLikelihoods(ReturnLikelihoods returnLikelihoods) {
            this.returnLikelihoods = returnLikelihoods;
            this.__explicitlySet__.add("returnLikelihoods");
            return this;
        }
        /**
         * For an input that's longer than the maximum token length, specifies which part of the
         * input text will be truncated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("truncate")
        private Truncate truncate;

        /**
         * For an input that's longer than the maximum token length, specifies which part of the
         * input text will be truncated.
         *
         * @param truncate the value to set
         * @return this builder
         */
        public Builder truncate(Truncate truncate) {
            this.truncate = truncate;
            this.__explicitlySet__.add("truncate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereLlmInferenceRequest build() {
            CohereLlmInferenceRequest model =
                    new CohereLlmInferenceRequest(
                            this.prompt,
                            this.isStream,
                            this.numGenerations,
                            this.isEcho,
                            this.maxTokens,
                            this.temperature,
                            this.topK,
                            this.topP,
                            this.frequencyPenalty,
                            this.presencePenalty,
                            this.stopSequences,
                            this.returnLikelihoods,
                            this.truncate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereLlmInferenceRequest model) {
            if (model.wasPropertyExplicitlySet("prompt")) {
                this.prompt(model.getPrompt());
            }
            if (model.wasPropertyExplicitlySet("isStream")) {
                this.isStream(model.getIsStream());
            }
            if (model.wasPropertyExplicitlySet("numGenerations")) {
                this.numGenerations(model.getNumGenerations());
            }
            if (model.wasPropertyExplicitlySet("isEcho")) {
                this.isEcho(model.getIsEcho());
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
            if (model.wasPropertyExplicitlySet("stopSequences")) {
                this.stopSequences(model.getStopSequences());
            }
            if (model.wasPropertyExplicitlySet("returnLikelihoods")) {
                this.returnLikelihoods(model.getReturnLikelihoods());
            }
            if (model.wasPropertyExplicitlySet("truncate")) {
                this.truncate(model.getTruncate());
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
    public CohereLlmInferenceRequest(
            String prompt,
            Boolean isStream,
            Integer numGenerations,
            Boolean isEcho,
            Integer maxTokens,
            Double temperature,
            Integer topK,
            Double topP,
            Double frequencyPenalty,
            Double presencePenalty,
            java.util.List<String> stopSequences,
            ReturnLikelihoods returnLikelihoods,
            Truncate truncate) {
        super();
        this.prompt = prompt;
        this.isStream = isStream;
        this.numGenerations = numGenerations;
        this.isEcho = isEcho;
        this.maxTokens = maxTokens;
        this.temperature = temperature;
        this.topK = topK;
        this.topP = topP;
        this.frequencyPenalty = frequencyPenalty;
        this.presencePenalty = presencePenalty;
        this.stopSequences = stopSequences;
        this.returnLikelihoods = returnLikelihoods;
        this.truncate = truncate;
    }

    /**
     * Represents the prompt to be completed. The trailing white spaces are trimmed before
     * completion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prompt")
    private final String prompt;

    /**
     * Represents the prompt to be completed. The trailing white spaces are trimmed before
     * completion.
     *
     * @return the value
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Whether to stream back partial progress. If set, tokens are sent as data-only server-sent
     * events as they become available.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStream")
    private final Boolean isStream;

    /**
     * Whether to stream back partial progress. If set, tokens are sent as data-only server-sent
     * events as they become available.
     *
     * @return the value
     */
    public Boolean getIsStream() {
        return isStream;
    }

    /** The number of generated texts that will be returned. */
    @com.fasterxml.jackson.annotation.JsonProperty("numGenerations")
    private final Integer numGenerations;

    /**
     * The number of generated texts that will be returned.
     *
     * @return the value
     */
    public Integer getNumGenerations() {
        return numGenerations;
    }

    /**
     * Whether or not to return the user prompt in the response. This option only applies to
     * non-stream results.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
    private final Boolean isEcho;

    /**
     * Whether or not to return the user prompt in the response. This option only applies to
     * non-stream results.
     *
     * @return the value
     */
    public Boolean getIsEcho() {
        return isEcho;
    }

    /**
     * The maximum number of tokens to predict for each response. Includes input plus output tokens.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
    private final Integer maxTokens;

    /**
     * The maximum number of tokens to predict for each response. Includes input plus output tokens.
     *
     * @return the value
     */
    public Integer getMaxTokens() {
        return maxTokens;
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
     * An integer that sets up the model to use only the top k most likely tokens in the generated
     * output. A higher k introduces more randomness into the output making the output text sound
     * more natural. Default value is 0 which disables this method and considers all tokens. To set
     * a number for the likely tokens, choose an integer between 1 and 500.
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
     * more natural. Default value is 0 which disables this method and considers all tokens. To set
     * a number for the likely tokens, choose an integer between 1 and 500.
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
     * The generated text is cut at the end of the earliest occurrence of this stop sequence. The
     * generated text will include this stop sequence.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stopSequences")
    private final java.util.List<String> stopSequences;

    /**
     * The generated text is cut at the end of the earliest occurrence of this stop sequence. The
     * generated text will include this stop sequence.
     *
     * @return the value
     */
    public java.util.List<String> getStopSequences() {
        return stopSequences;
    }

    /** Specifies how and if the token likelihoods are returned with the response. */
    public enum ReturnLikelihoods implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        All("ALL"),
        Generation("GENERATION"),
        ;

        private final String value;
        private static java.util.Map<String, ReturnLikelihoods> map;

        static {
            map = new java.util.HashMap<>();
            for (ReturnLikelihoods v : ReturnLikelihoods.values()) {
                map.put(v.getValue(), v);
            }
        }

        ReturnLikelihoods(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReturnLikelihoods create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ReturnLikelihoods: " + key);
        }
    };
    /** Specifies how and if the token likelihoods are returned with the response. */
    @com.fasterxml.jackson.annotation.JsonProperty("returnLikelihoods")
    private final ReturnLikelihoods returnLikelihoods;

    /**
     * Specifies how and if the token likelihoods are returned with the response.
     *
     * @return the value
     */
    public ReturnLikelihoods getReturnLikelihoods() {
        return returnLikelihoods;
    }

    /**
     * For an input that's longer than the maximum token length, specifies which part of the input
     * text will be truncated.
     */
    public enum Truncate implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Start("START"),
        End("END"),
        ;

        private final String value;
        private static java.util.Map<String, Truncate> map;

        static {
            map = new java.util.HashMap<>();
            for (Truncate v : Truncate.values()) {
                map.put(v.getValue(), v);
            }
        }

        Truncate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Truncate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Truncate: " + key);
        }
    };
    /**
     * For an input that's longer than the maximum token length, specifies which part of the input
     * text will be truncated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("truncate")
    private final Truncate truncate;

    /**
     * For an input that's longer than the maximum token length, specifies which part of the input
     * text will be truncated.
     *
     * @return the value
     */
    public Truncate getTruncate() {
        return truncate;
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
        sb.append("CohereLlmInferenceRequest(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", prompt=").append(String.valueOf(this.prompt));
        sb.append(", isStream=").append(String.valueOf(this.isStream));
        sb.append(", numGenerations=").append(String.valueOf(this.numGenerations));
        sb.append(", isEcho=").append(String.valueOf(this.isEcho));
        sb.append(", maxTokens=").append(String.valueOf(this.maxTokens));
        sb.append(", temperature=").append(String.valueOf(this.temperature));
        sb.append(", topK=").append(String.valueOf(this.topK));
        sb.append(", topP=").append(String.valueOf(this.topP));
        sb.append(", frequencyPenalty=").append(String.valueOf(this.frequencyPenalty));
        sb.append(", presencePenalty=").append(String.valueOf(this.presencePenalty));
        sb.append(", stopSequences=").append(String.valueOf(this.stopSequences));
        sb.append(", returnLikelihoods=").append(String.valueOf(this.returnLikelihoods));
        sb.append(", truncate=").append(String.valueOf(this.truncate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereLlmInferenceRequest)) {
            return false;
        }

        CohereLlmInferenceRequest other = (CohereLlmInferenceRequest) o;
        return java.util.Objects.equals(this.prompt, other.prompt)
                && java.util.Objects.equals(this.isStream, other.isStream)
                && java.util.Objects.equals(this.numGenerations, other.numGenerations)
                && java.util.Objects.equals(this.isEcho, other.isEcho)
                && java.util.Objects.equals(this.maxTokens, other.maxTokens)
                && java.util.Objects.equals(this.temperature, other.temperature)
                && java.util.Objects.equals(this.topK, other.topK)
                && java.util.Objects.equals(this.topP, other.topP)
                && java.util.Objects.equals(this.frequencyPenalty, other.frequencyPenalty)
                && java.util.Objects.equals(this.presencePenalty, other.presencePenalty)
                && java.util.Objects.equals(this.stopSequences, other.stopSequences)
                && java.util.Objects.equals(this.returnLikelihoods, other.returnLikelihoods)
                && java.util.Objects.equals(this.truncate, other.truncate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.prompt == null ? 43 : this.prompt.hashCode());
        result = (result * PRIME) + (this.isStream == null ? 43 : this.isStream.hashCode());
        result =
                (result * PRIME)
                        + (this.numGenerations == null ? 43 : this.numGenerations.hashCode());
        result = (result * PRIME) + (this.isEcho == null ? 43 : this.isEcho.hashCode());
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
        result =
                (result * PRIME)
                        + (this.stopSequences == null ? 43 : this.stopSequences.hashCode());
        result =
                (result * PRIME)
                        + (this.returnLikelihoods == null ? 43 : this.returnLikelihoods.hashCode());
        result = (result * PRIME) + (this.truncate == null ? 43 : this.truncate.hashCode());
        return result;
    }
}
