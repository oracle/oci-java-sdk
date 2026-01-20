/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The response to the chat conversation. <br>
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
        builder = CohereChatResponseV2.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "apiFormat")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereChatResponseV2 extends BaseChatResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the generated reply */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the generated reply
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private CohereAssistantMessageV2 message;

        public Builder message(CohereAssistantMessageV2 message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** Why the generation stopped. */
        @com.fasterxml.jackson.annotation.JsonProperty("finishReason")
        private FinishReason finishReason;

        /**
         * Why the generation stopped.
         *
         * @param finishReason the value to set
         * @return this builder
         */
        public Builder finishReason(FinishReason finishReason) {
            this.finishReason = finishReason;
            this.__explicitlySet__.add("finishReason");
            return this;
        }
        /** The log probabilities of the generated tokens. */
        @com.fasterxml.jackson.annotation.JsonProperty("logProbabilities")
        private java.util.List<LogProbability> logProbabilities;

        /**
         * The log probabilities of the generated tokens.
         *
         * @param logProbabilities the value to set
         * @return this builder
         */
        public Builder logProbabilities(java.util.List<LogProbability> logProbabilities) {
            this.logProbabilities = logProbabilities;
            this.__explicitlySet__.add("logProbabilities");
            return this;
        }
        /**
         * If there is an error during the streaming scenario, then the {@code errorMessage}
         * parameter contains details for the error.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * If there is an error during the streaming scenario, then the {@code errorMessage}
         * parameter contains details for the error.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Usage usage;

        public Builder usage(Usage usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereChatResponseV2 build() {
            CohereChatResponseV2 model =
                    new CohereChatResponseV2(
                            this.id,
                            this.message,
                            this.finishReason,
                            this.logProbabilities,
                            this.errorMessage,
                            this.usage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereChatResponseV2 model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("finishReason")) {
                this.finishReason(model.getFinishReason());
            }
            if (model.wasPropertyExplicitlySet("logProbabilities")) {
                this.logProbabilities(model.getLogProbabilities());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
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
    public CohereChatResponseV2(
            String id,
            CohereAssistantMessageV2 message,
            FinishReason finishReason,
            java.util.List<LogProbability> logProbabilities,
            String errorMessage,
            Usage usage) {
        super();
        this.id = id;
        this.message = message;
        this.finishReason = finishReason;
        this.logProbabilities = logProbabilities;
        this.errorMessage = errorMessage;
        this.usage = usage;
    }

    /** Unique identifier for the generated reply */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the generated reply
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final CohereAssistantMessageV2 message;

    public CohereAssistantMessageV2 getMessage() {
        return message;
    }

    /** Why the generation stopped. */
    public enum FinishReason implements com.oracle.bmc.http.internal.BmcEnum {
        Complete("COMPLETE"),
        StopSequence("STOP_SEQUENCE"),
        MaxTokens("MAX_TOKENS"),
        ToolCall("TOOL_CALL"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Why the generation stopped. */
    @com.fasterxml.jackson.annotation.JsonProperty("finishReason")
    private final FinishReason finishReason;

    /**
     * Why the generation stopped.
     *
     * @return the value
     */
    public FinishReason getFinishReason() {
        return finishReason;
    }

    /** The log probabilities of the generated tokens. */
    @com.fasterxml.jackson.annotation.JsonProperty("logProbabilities")
    private final java.util.List<LogProbability> logProbabilities;

    /**
     * The log probabilities of the generated tokens.
     *
     * @return the value
     */
    public java.util.List<LogProbability> getLogProbabilities() {
        return logProbabilities;
    }

    /**
     * If there is an error during the streaming scenario, then the {@code errorMessage} parameter
     * contains details for the error.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * If there is an error during the streaming scenario, then the {@code errorMessage} parameter
     * contains details for the error.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final Usage usage;

    public Usage getUsage() {
        return usage;
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
        sb.append("CohereChatResponseV2(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", finishReason=").append(String.valueOf(this.finishReason));
        sb.append(", logProbabilities=").append(String.valueOf(this.logProbabilities));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereChatResponseV2)) {
            return false;
        }

        CohereChatResponseV2 other = (CohereChatResponseV2) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.finishReason, other.finishReason)
                && java.util.Objects.equals(this.logProbabilities, other.logProbabilities)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.usage, other.usage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.finishReason == null ? 43 : this.finishReason.hashCode());
        result =
                (result * PRIME)
                        + (this.logProbabilities == null ? 43 : this.logProbabilities.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        return result;
    }
}
