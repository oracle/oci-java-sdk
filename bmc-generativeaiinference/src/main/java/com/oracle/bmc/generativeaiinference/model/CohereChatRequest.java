/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details for the chat request for Cohere models.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CohereChatRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "apiFormat"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CohereChatRequest extends BaseChatRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Text input for the model to respond to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Text input for the model to respond to.
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * A list of previous messages between the user and the model, meant to give the model conversational context for responding to the user's message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chatHistory")
        private java.util.List<CohereMessage> chatHistory;

        /**
         * A list of previous messages between the user and the model, meant to give the model conversational context for responding to the user's message.
         * @param chatHistory the value to set
         * @return this builder
         **/
        public Builder chatHistory(java.util.List<CohereMessage> chatHistory) {
            this.chatHistory = chatHistory;
            this.__explicitlySet__.add("chatHistory");
            return this;
        }
        /**
         * list of relevant documents that the model can cite to generate a more accurate reply.
         * Some suggested keys are "text", "author", and "date". For better generation quality, it is
         * recommended to keep the total word count of the strings in the dictionary to under 300
         * words.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<Object> documents;

        /**
         * list of relevant documents that the model can cite to generate a more accurate reply.
         * Some suggested keys are "text", "author", and "date". For better generation quality, it is
         * recommended to keep the total word count of the strings in the dictionary to under 300
         * words.
         *
         * @param documents the value to set
         * @return this builder
         **/
        public Builder documents(java.util.List<Object> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }
        /**
         * When true, the response will only contain a list of generated search queries, but no search will take place, and no reply from the model to the user's message will be generated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSearchQueriesOnly")
        private Boolean isSearchQueriesOnly;

        /**
         * When true, the response will only contain a list of generated search queries, but no search will take place, and no reply from the model to the user's message will be generated.
         * @param isSearchQueriesOnly the value to set
         * @return this builder
         **/
        public Builder isSearchQueriesOnly(Boolean isSearchQueriesOnly) {
            this.isSearchQueriesOnly = isSearchQueriesOnly;
            this.__explicitlySet__.add("isSearchQueriesOnly");
            return this;
        }
        /**
         * When specified, the default Cohere preamble will be replaced with the provided one. Preambles are a part of the prompt used to adjust the model's overall behavior and conversation style. Default preambles vary for different models.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preambleOverride")
        private String preambleOverride;

        /**
         * When specified, the default Cohere preamble will be replaced with the provided one. Preambles are a part of the prompt used to adjust the model's overall behavior and conversation style. Default preambles vary for different models.
         * @param preambleOverride the value to set
         * @return this builder
         **/
        public Builder preambleOverride(String preambleOverride) {
            this.preambleOverride = preambleOverride;
            this.__explicitlySet__.add("preambleOverride");
            return this;
        }
        /**
         * Whether to stream back partial progress. If set, tokens are sent as data-only server-sent events as they become available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isStream")
        private Boolean isStream;

        /**
         * Whether to stream back partial progress. If set, tokens are sent as data-only server-sent events as they become available.
         * @param isStream the value to set
         * @return this builder
         **/
        public Builder isStream(Boolean isStream) {
            this.isStream = isStream;
            this.__explicitlySet__.add("isStream");
            return this;
        }
        /**
         * The maximum number of tokens to predict for each response. Includes input plus output tokens.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
        private Integer maxTokens;

        /**
         * The maximum number of tokens to predict for each response. Includes input plus output tokens.
         * @param maxTokens the value to set
         * @return this builder
         **/
        public Builder maxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            this.__explicitlySet__.add("maxTokens");
            return this;
        }
        /**
         * A number that sets the randomness of the generated output. A lower temperature means a less random generations.
         * Use lower numbers for tasks with a correct answer such as question answering or summarizing. High temperatures can generate hallucinations or factually incorrect information. Start with temperatures lower than 1.0 and increase the temperature for more creative outputs, as you regenerate the prompts to refine the outputs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("temperature")
        private Double temperature;

        /**
         * A number that sets the randomness of the generated output. A lower temperature means a less random generations.
         * Use lower numbers for tasks with a correct answer such as question answering or summarizing. High temperatures can generate hallucinations or factually incorrect information. Start with temperatures lower than 1.0 and increase the temperature for more creative outputs, as you regenerate the prompts to refine the outputs.
         *
         * @param temperature the value to set
         * @return this builder
         **/
        public Builder temperature(Double temperature) {
            this.temperature = temperature;
            this.__explicitlySet__.add("temperature");
            return this;
        }
        /**
         * An integer that sets up the model to use only the top k most likely tokens in the generated output. A higher k introduces more randomness into the output making the output text sound more natural. Default value is 0 which disables this method and considers all tokens. To set a number for the likely tokens, choose an integer between 1 and 500.
         * <p>
         * If also using top p, then the model considers only the top tokens whose probabilities add up to p percent and ignores the rest of the k tokens. For example, if k is 20, but the probabilities of the top 10 add up to .75, then only the top 10 tokens are chosen.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("topK")
        private Integer topK;

        /**
         * An integer that sets up the model to use only the top k most likely tokens in the generated output. A higher k introduces more randomness into the output making the output text sound more natural. Default value is 0 which disables this method and considers all tokens. To set a number for the likely tokens, choose an integer between 1 and 500.
         * <p>
         * If also using top p, then the model considers only the top tokens whose probabilities add up to p percent and ignores the rest of the k tokens. For example, if k is 20, but the probabilities of the top 10 add up to .75, then only the top 10 tokens are chosen.
         *
         * @param topK the value to set
         * @return this builder
         **/
        public Builder topK(Integer topK) {
            this.topK = topK;
            this.__explicitlySet__.add("topK");
            return this;
        }
        /**
         * If set to a probability 0.0 < p < 1.0, it ensures that only the most likely tokens, with total probability mass of p, are considered for generation at each step.
         * <p>
         * To eliminate tokens with low likelihood, assign p a minimum percentage for the next token's likelihood. For example, when p is set to 0.75, the model eliminates the bottom 25 percent for the next token. Set to 1.0 to consider all tokens and set to 0 to disable. If both k and p are enabled, p acts after k.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("topP")
        private Double topP;

        /**
         * If set to a probability 0.0 < p < 1.0, it ensures that only the most likely tokens, with total probability mass of p, are considered for generation at each step.
         * <p>
         * To eliminate tokens with low likelihood, assign p a minimum percentage for the next token's likelihood. For example, when p is set to 0.75, the model eliminates the bottom 25 percent for the next token. Set to 1.0 to consider all tokens and set to 0 to disable. If both k and p are enabled, p acts after k.
         *
         * @param topP the value to set
         * @return this builder
         **/
        public Builder topP(Double topP) {
            this.topP = topP;
            this.__explicitlySet__.add("topP");
            return this;
        }
        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on their frequency in the generated text so far. Greater numbers encourage the model to use new tokens, while lower numbers encourage the model to repeat the tokens. Set to 0 to disable.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
        private Double frequencyPenalty;

        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on their frequency in the generated text so far. Greater numbers encourage the model to use new tokens, while lower numbers encourage the model to repeat the tokens. Set to 0 to disable.
         *
         * @param frequencyPenalty the value to set
         * @return this builder
         **/
        public Builder frequencyPenalty(Double frequencyPenalty) {
            this.frequencyPenalty = frequencyPenalty;
            this.__explicitlySet__.add("frequencyPenalty");
            return this;
        }
        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on whether they've appeared in the generated text so far. Greater numbers encourage the model to use new tokens, while lower numbers encourage the model to repeat the tokens.
         * <p>
         * Similar to frequency penalty, a penalty is applied to previously present tokens, except that this penalty is applied equally to all tokens that have already appeared, regardless of how many times they've appeared. Set to 0 to disable.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
        private Double presencePenalty;

        /**
         * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on whether they've appeared in the generated text so far. Greater numbers encourage the model to use new tokens, while lower numbers encourage the model to repeat the tokens.
         * <p>
         * Similar to frequency penalty, a penalty is applied to previously present tokens, except that this penalty is applied equally to all tokens that have already appeared, regardless of how many times they've appeared. Set to 0 to disable.
         *
         * @param presencePenalty the value to set
         * @return this builder
         **/
        public Builder presencePenalty(Double presencePenalty) {
            this.presencePenalty = presencePenalty;
            this.__explicitlySet__.add("presencePenalty");
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
                            this.isSearchQueriesOnly,
                            this.preambleOverride,
                            this.isStream,
                            this.maxTokens,
                            this.temperature,
                            this.topK,
                            this.topP,
                            this.frequencyPenalty,
                            this.presencePenalty);
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
            if (model.wasPropertyExplicitlySet("isSearchQueriesOnly")) {
                this.isSearchQueriesOnly(model.getIsSearchQueriesOnly());
            }
            if (model.wasPropertyExplicitlySet("preambleOverride")) {
                this.preambleOverride(model.getPreambleOverride());
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
            return this;
        }
    }

    /**
     * Create a new builder.
     */
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
            Boolean isSearchQueriesOnly,
            String preambleOverride,
            Boolean isStream,
            Integer maxTokens,
            Double temperature,
            Integer topK,
            Double topP,
            Double frequencyPenalty,
            Double presencePenalty) {
        super();
        this.message = message;
        this.chatHistory = chatHistory;
        this.documents = documents;
        this.isSearchQueriesOnly = isSearchQueriesOnly;
        this.preambleOverride = preambleOverride;
        this.isStream = isStream;
        this.maxTokens = maxTokens;
        this.temperature = temperature;
        this.topK = topK;
        this.topP = topP;
        this.frequencyPenalty = frequencyPenalty;
        this.presencePenalty = presencePenalty;
    }

    /**
     * Text input for the model to respond to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Text input for the model to respond to.
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * A list of previous messages between the user and the model, meant to give the model conversational context for responding to the user's message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chatHistory")
    private final java.util.List<CohereMessage> chatHistory;

    /**
     * A list of previous messages between the user and the model, meant to give the model conversational context for responding to the user's message.
     * @return the value
     **/
    public java.util.List<CohereMessage> getChatHistory() {
        return chatHistory;
    }

    /**
     * list of relevant documents that the model can cite to generate a more accurate reply.
     * Some suggested keys are "text", "author", and "date". For better generation quality, it is
     * recommended to keep the total word count of the strings in the dictionary to under 300
     * words.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<Object> documents;

    /**
     * list of relevant documents that the model can cite to generate a more accurate reply.
     * Some suggested keys are "text", "author", and "date". For better generation quality, it is
     * recommended to keep the total word count of the strings in the dictionary to under 300
     * words.
     *
     * @return the value
     **/
    public java.util.List<Object> getDocuments() {
        return documents;
    }

    /**
     * When true, the response will only contain a list of generated search queries, but no search will take place, and no reply from the model to the user's message will be generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSearchQueriesOnly")
    private final Boolean isSearchQueriesOnly;

    /**
     * When true, the response will only contain a list of generated search queries, but no search will take place, and no reply from the model to the user's message will be generated.
     * @return the value
     **/
    public Boolean getIsSearchQueriesOnly() {
        return isSearchQueriesOnly;
    }

    /**
     * When specified, the default Cohere preamble will be replaced with the provided one. Preambles are a part of the prompt used to adjust the model's overall behavior and conversation style. Default preambles vary for different models.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preambleOverride")
    private final String preambleOverride;

    /**
     * When specified, the default Cohere preamble will be replaced with the provided one. Preambles are a part of the prompt used to adjust the model's overall behavior and conversation style. Default preambles vary for different models.
     * @return the value
     **/
    public String getPreambleOverride() {
        return preambleOverride;
    }

    /**
     * Whether to stream back partial progress. If set, tokens are sent as data-only server-sent events as they become available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStream")
    private final Boolean isStream;

    /**
     * Whether to stream back partial progress. If set, tokens are sent as data-only server-sent events as they become available.
     * @return the value
     **/
    public Boolean getIsStream() {
        return isStream;
    }

    /**
     * The maximum number of tokens to predict for each response. Includes input plus output tokens.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
    private final Integer maxTokens;

    /**
     * The maximum number of tokens to predict for each response. Includes input plus output tokens.
     * @return the value
     **/
    public Integer getMaxTokens() {
        return maxTokens;
    }

    /**
     * A number that sets the randomness of the generated output. A lower temperature means a less random generations.
     * Use lower numbers for tasks with a correct answer such as question answering or summarizing. High temperatures can generate hallucinations or factually incorrect information. Start with temperatures lower than 1.0 and increase the temperature for more creative outputs, as you regenerate the prompts to refine the outputs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("temperature")
    private final Double temperature;

    /**
     * A number that sets the randomness of the generated output. A lower temperature means a less random generations.
     * Use lower numbers for tasks with a correct answer such as question answering or summarizing. High temperatures can generate hallucinations or factually incorrect information. Start with temperatures lower than 1.0 and increase the temperature for more creative outputs, as you regenerate the prompts to refine the outputs.
     *
     * @return the value
     **/
    public Double getTemperature() {
        return temperature;
    }

    /**
     * An integer that sets up the model to use only the top k most likely tokens in the generated output. A higher k introduces more randomness into the output making the output text sound more natural. Default value is 0 which disables this method and considers all tokens. To set a number for the likely tokens, choose an integer between 1 and 500.
     * <p>
     * If also using top p, then the model considers only the top tokens whose probabilities add up to p percent and ignores the rest of the k tokens. For example, if k is 20, but the probabilities of the top 10 add up to .75, then only the top 10 tokens are chosen.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("topK")
    private final Integer topK;

    /**
     * An integer that sets up the model to use only the top k most likely tokens in the generated output. A higher k introduces more randomness into the output making the output text sound more natural. Default value is 0 which disables this method and considers all tokens. To set a number for the likely tokens, choose an integer between 1 and 500.
     * <p>
     * If also using top p, then the model considers only the top tokens whose probabilities add up to p percent and ignores the rest of the k tokens. For example, if k is 20, but the probabilities of the top 10 add up to .75, then only the top 10 tokens are chosen.
     *
     * @return the value
     **/
    public Integer getTopK() {
        return topK;
    }

    /**
     * If set to a probability 0.0 < p < 1.0, it ensures that only the most likely tokens, with total probability mass of p, are considered for generation at each step.
     * <p>
     * To eliminate tokens with low likelihood, assign p a minimum percentage for the next token's likelihood. For example, when p is set to 0.75, the model eliminates the bottom 25 percent for the next token. Set to 1.0 to consider all tokens and set to 0 to disable. If both k and p are enabled, p acts after k.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("topP")
    private final Double topP;

    /**
     * If set to a probability 0.0 < p < 1.0, it ensures that only the most likely tokens, with total probability mass of p, are considered for generation at each step.
     * <p>
     * To eliminate tokens with low likelihood, assign p a minimum percentage for the next token's likelihood. For example, when p is set to 0.75, the model eliminates the bottom 25 percent for the next token. Set to 1.0 to consider all tokens and set to 0 to disable. If both k and p are enabled, p acts after k.
     *
     * @return the value
     **/
    public Double getTopP() {
        return topP;
    }

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on their frequency in the generated text so far. Greater numbers encourage the model to use new tokens, while lower numbers encourage the model to repeat the tokens. Set to 0 to disable.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
    private final Double frequencyPenalty;

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on their frequency in the generated text so far. Greater numbers encourage the model to use new tokens, while lower numbers encourage the model to repeat the tokens. Set to 0 to disable.
     *
     * @return the value
     **/
    public Double getFrequencyPenalty() {
        return frequencyPenalty;
    }

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on whether they've appeared in the generated text so far. Greater numbers encourage the model to use new tokens, while lower numbers encourage the model to repeat the tokens.
     * <p>
     * Similar to frequency penalty, a penalty is applied to previously present tokens, except that this penalty is applied equally to all tokens that have already appeared, regardless of how many times they've appeared. Set to 0 to disable.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
    private final Double presencePenalty;

    /**
     * To reduce repetitiveness of generated tokens, this number penalizes new tokens based on whether they've appeared in the generated text so far. Greater numbers encourage the model to use new tokens, while lower numbers encourage the model to repeat the tokens.
     * <p>
     * Similar to frequency penalty, a penalty is applied to previously present tokens, except that this penalty is applied equally to all tokens that have already appeared, regardless of how many times they've appeared. Set to 0 to disable.
     *
     * @return the value
     **/
    public Double getPresencePenalty() {
        return presencePenalty;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
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
        sb.append(", isSearchQueriesOnly=").append(String.valueOf(this.isSearchQueriesOnly));
        sb.append(", preambleOverride=").append(String.valueOf(this.preambleOverride));
        sb.append(", isStream=").append(String.valueOf(this.isStream));
        sb.append(", maxTokens=").append(String.valueOf(this.maxTokens));
        sb.append(", temperature=").append(String.valueOf(this.temperature));
        sb.append(", topK=").append(String.valueOf(this.topK));
        sb.append(", topP=").append(String.valueOf(this.topP));
        sb.append(", frequencyPenalty=").append(String.valueOf(this.frequencyPenalty));
        sb.append(", presencePenalty=").append(String.valueOf(this.presencePenalty));
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
                && java.util.Objects.equals(this.isSearchQueriesOnly, other.isSearchQueriesOnly)
                && java.util.Objects.equals(this.preambleOverride, other.preambleOverride)
                && java.util.Objects.equals(this.isStream, other.isStream)
                && java.util.Objects.equals(this.maxTokens, other.maxTokens)
                && java.util.Objects.equals(this.temperature, other.temperature)
                && java.util.Objects.equals(this.topK, other.topK)
                && java.util.Objects.equals(this.topP, other.topP)
                && java.util.Objects.equals(this.frequencyPenalty, other.frequencyPenalty)
                && java.util.Objects.equals(this.presencePenalty, other.presencePenalty)
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
                        + (this.isSearchQueriesOnly == null
                                ? 43
                                : this.isSearchQueriesOnly.hashCode());
        result =
                (result * PRIME)
                        + (this.preambleOverride == null ? 43 : this.preambleOverride.hashCode());
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
        return result;
    }
}
