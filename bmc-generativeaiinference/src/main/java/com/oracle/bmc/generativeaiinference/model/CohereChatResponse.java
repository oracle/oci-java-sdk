/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The response to the chat conversation.
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
    builder = CohereChatResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "apiFormat"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CohereChatResponse extends BaseChatResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Contents of the response that the model generates.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * Contents of the response that the model generates.
         * @param text the value to set
         * @return this builder
         **/
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /**
         * The list of previous messages between the user and the model. The chat history gives the model context for responding to the user's inputs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chatHistory")
        private java.util.List<CohereMessage> chatHistory;

        /**
         * The list of previous messages between the user and the model. The chat history gives the model context for responding to the user's inputs.
         * @param chatHistory the value to set
         * @return this builder
         **/
        public Builder chatHistory(java.util.List<CohereMessage> chatHistory) {
            this.chatHistory = chatHistory;
            this.__explicitlySet__.add("chatHistory");
            return this;
        }
        /**
         * Inline citations for the generated response.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("citations")
        private java.util.List<Citation> citations;

        /**
         * Inline citations for the generated response.
         * @param citations the value to set
         * @return this builder
         **/
        public Builder citations(java.util.List<Citation> citations) {
            this.citations = citations;
            this.__explicitlySet__.add("citations");
            return this;
        }
        /**
         * If set to true, a search for documents is required.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSearchRequired")
        private Boolean isSearchRequired;

        /**
         * If set to true, a search for documents is required.
         * @param isSearchRequired the value to set
         * @return this builder
         **/
        public Builder isSearchRequired(Boolean isSearchRequired) {
            this.isSearchRequired = isSearchRequired;
            this.__explicitlySet__.add("isSearchRequired");
            return this;
        }
        /**
         * Why the generation stopped.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("finishReason")
        private FinishReason finishReason;

        /**
         * Why the generation stopped.
         * @param finishReason the value to set
         * @return this builder
         **/
        public Builder finishReason(FinishReason finishReason) {
            this.finishReason = finishReason;
            this.__explicitlySet__.add("finishReason");
            return this;
        }
        /**
         * If there is an error during the streaming scenario, then the {@code errorMessage} parameter contains details for the error.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * If there is an error during the streaming scenario, then the {@code errorMessage} parameter contains details for the error.
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * The generated search queries.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("searchQueries")
        private java.util.List<SearchQuery> searchQueries;

        /**
         * The generated search queries.
         * @param searchQueries the value to set
         * @return this builder
         **/
        public Builder searchQueries(java.util.List<SearchQuery> searchQueries) {
            this.searchQueries = searchQueries;
            this.__explicitlySet__.add("searchQueries");
            return this;
        }
        /**
         * The documents that the model can refer to when generating a response. Each document is a JSON string that represents the field and values of the document.
         * <p>
         * Example:
         * '[
         *   {
         *     "id": "doc_0",
         *     "snippet": "Emperor penguins are the tallest.",
         *     "title": "Tall penguins"
         *   },
         *   {
         *     "id": "doc_1",
         *     "snippet": "Emperor penguins only live in Antarctica.",
         *     "title": "Penguin habitats"
         *   }
         * ]'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<Object> documents;

        /**
         * The documents that the model can refer to when generating a response. Each document is a JSON string that represents the field and values of the document.
         * <p>
         * Example:
         * '[
         *   {
         *     "id": "doc_0",
         *     "snippet": "Emperor penguins are the tallest.",
         *     "title": "Tall penguins"
         *   },
         *   {
         *     "id": "doc_1",
         *     "snippet": "Emperor penguins only live in Antarctica.",
         *     "title": "Penguin habitats"
         *   }
         * ]'
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
         * A list of tool calls generated by the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toolCalls")
        private java.util.List<CohereToolCall> toolCalls;

        /**
         * A list of tool calls generated by the model.
         * @param toolCalls the value to set
         * @return this builder
         **/
        public Builder toolCalls(java.util.List<CohereToolCall> toolCalls) {
            this.toolCalls = toolCalls;
            this.__explicitlySet__.add("toolCalls");
            return this;
        }
        /**
         * The full prompt that was sent to the model if isEcho is true when request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prompt")
        private String prompt;

        /**
         * The full prompt that was sent to the model if isEcho is true when request.
         * @param prompt the value to set
         * @return this builder
         **/
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            this.__explicitlySet__.add("prompt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereChatResponse build() {
            CohereChatResponse model =
                    new CohereChatResponse(
                            this.text,
                            this.chatHistory,
                            this.citations,
                            this.isSearchRequired,
                            this.finishReason,
                            this.errorMessage,
                            this.searchQueries,
                            this.documents,
                            this.toolCalls,
                            this.prompt);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereChatResponse model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("chatHistory")) {
                this.chatHistory(model.getChatHistory());
            }
            if (model.wasPropertyExplicitlySet("citations")) {
                this.citations(model.getCitations());
            }
            if (model.wasPropertyExplicitlySet("isSearchRequired")) {
                this.isSearchRequired(model.getIsSearchRequired());
            }
            if (model.wasPropertyExplicitlySet("finishReason")) {
                this.finishReason(model.getFinishReason());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("searchQueries")) {
                this.searchQueries(model.getSearchQueries());
            }
            if (model.wasPropertyExplicitlySet("documents")) {
                this.documents(model.getDocuments());
            }
            if (model.wasPropertyExplicitlySet("toolCalls")) {
                this.toolCalls(model.getToolCalls());
            }
            if (model.wasPropertyExplicitlySet("prompt")) {
                this.prompt(model.getPrompt());
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
    public CohereChatResponse(
            String text,
            java.util.List<CohereMessage> chatHistory,
            java.util.List<Citation> citations,
            Boolean isSearchRequired,
            FinishReason finishReason,
            String errorMessage,
            java.util.List<SearchQuery> searchQueries,
            java.util.List<Object> documents,
            java.util.List<CohereToolCall> toolCalls,
            String prompt) {
        super();
        this.text = text;
        this.chatHistory = chatHistory;
        this.citations = citations;
        this.isSearchRequired = isSearchRequired;
        this.finishReason = finishReason;
        this.errorMessage = errorMessage;
        this.searchQueries = searchQueries;
        this.documents = documents;
        this.toolCalls = toolCalls;
        this.prompt = prompt;
    }

    /**
     * Contents of the response that the model generates.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * Contents of the response that the model generates.
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * The list of previous messages between the user and the model. The chat history gives the model context for responding to the user's inputs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chatHistory")
    private final java.util.List<CohereMessage> chatHistory;

    /**
     * The list of previous messages between the user and the model. The chat history gives the model context for responding to the user's inputs.
     * @return the value
     **/
    public java.util.List<CohereMessage> getChatHistory() {
        return chatHistory;
    }

    /**
     * Inline citations for the generated response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("citations")
    private final java.util.List<Citation> citations;

    /**
     * Inline citations for the generated response.
     * @return the value
     **/
    public java.util.List<Citation> getCitations() {
        return citations;
    }

    /**
     * If set to true, a search for documents is required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSearchRequired")
    private final Boolean isSearchRequired;

    /**
     * If set to true, a search for documents is required.
     * @return the value
     **/
    public Boolean getIsSearchRequired() {
        return isSearchRequired;
    }

    /**
     * Why the generation stopped.
     **/
    public enum FinishReason {
        Complete("COMPLETE"),
        ErrorToxic("ERROR_TOXIC"),
        ErrorLimit("ERROR_LIMIT"),
        Error("ERROR"),
        UserCancel("USER_CANCEL"),
        MaxTokens("MAX_TOKENS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FinishReason.class);

        private final String value;
        private static java.util.Map<String, FinishReason> map;

        static {
            map = new java.util.HashMap<>();
            for (FinishReason v : FinishReason.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FinishReason(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FinishReason create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FinishReason', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Why the generation stopped.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("finishReason")
    private final FinishReason finishReason;

    /**
     * Why the generation stopped.
     * @return the value
     **/
    public FinishReason getFinishReason() {
        return finishReason;
    }

    /**
     * If there is an error during the streaming scenario, then the {@code errorMessage} parameter contains details for the error.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * If there is an error during the streaming scenario, then the {@code errorMessage} parameter contains details for the error.
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * The generated search queries.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchQueries")
    private final java.util.List<SearchQuery> searchQueries;

    /**
     * The generated search queries.
     * @return the value
     **/
    public java.util.List<SearchQuery> getSearchQueries() {
        return searchQueries;
    }

    /**
     * The documents that the model can refer to when generating a response. Each document is a JSON string that represents the field and values of the document.
     * <p>
     * Example:
     * '[
     *   {
     *     "id": "doc_0",
     *     "snippet": "Emperor penguins are the tallest.",
     *     "title": "Tall penguins"
     *   },
     *   {
     *     "id": "doc_1",
     *     "snippet": "Emperor penguins only live in Antarctica.",
     *     "title": "Penguin habitats"
     *   }
     * ]'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<Object> documents;

    /**
     * The documents that the model can refer to when generating a response. Each document is a JSON string that represents the field and values of the document.
     * <p>
     * Example:
     * '[
     *   {
     *     "id": "doc_0",
     *     "snippet": "Emperor penguins are the tallest.",
     *     "title": "Tall penguins"
     *   },
     *   {
     *     "id": "doc_1",
     *     "snippet": "Emperor penguins only live in Antarctica.",
     *     "title": "Penguin habitats"
     *   }
     * ]'
     *
     * @return the value
     **/
    public java.util.List<Object> getDocuments() {
        return documents;
    }

    /**
     * A list of tool calls generated by the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toolCalls")
    private final java.util.List<CohereToolCall> toolCalls;

    /**
     * A list of tool calls generated by the model.
     * @return the value
     **/
    public java.util.List<CohereToolCall> getToolCalls() {
        return toolCalls;
    }

    /**
     * The full prompt that was sent to the model if isEcho is true when request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prompt")
    private final String prompt;

    /**
     * The full prompt that was sent to the model if isEcho is true when request.
     * @return the value
     **/
    public String getPrompt() {
        return prompt;
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
        sb.append("CohereChatResponse(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", chatHistory=").append(String.valueOf(this.chatHistory));
        sb.append(", citations=").append(String.valueOf(this.citations));
        sb.append(", isSearchRequired=").append(String.valueOf(this.isSearchRequired));
        sb.append(", finishReason=").append(String.valueOf(this.finishReason));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", searchQueries=").append(String.valueOf(this.searchQueries));
        sb.append(", documents=").append(String.valueOf(this.documents));
        sb.append(", toolCalls=").append(String.valueOf(this.toolCalls));
        sb.append(", prompt=").append(String.valueOf(this.prompt));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereChatResponse)) {
            return false;
        }

        CohereChatResponse other = (CohereChatResponse) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.chatHistory, other.chatHistory)
                && java.util.Objects.equals(this.citations, other.citations)
                && java.util.Objects.equals(this.isSearchRequired, other.isSearchRequired)
                && java.util.Objects.equals(this.finishReason, other.finishReason)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.searchQueries, other.searchQueries)
                && java.util.Objects.equals(this.documents, other.documents)
                && java.util.Objects.equals(this.toolCalls, other.toolCalls)
                && java.util.Objects.equals(this.prompt, other.prompt)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.chatHistory == null ? 43 : this.chatHistory.hashCode());
        result = (result * PRIME) + (this.citations == null ? 43 : this.citations.hashCode());
        result =
                (result * PRIME)
                        + (this.isSearchRequired == null ? 43 : this.isSearchRequired.hashCode());
        result = (result * PRIME) + (this.finishReason == null ? 43 : this.finishReason.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.searchQueries == null ? 43 : this.searchQueries.hashCode());
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result = (result * PRIME) + (this.toolCalls == null ? 43 : this.toolCalls.hashCode());
        result = (result * PRIME) + (this.prompt == null ? 43 : this.prompt.hashCode());
        return result;
    }
}
