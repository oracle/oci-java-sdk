/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The generated text result to return. <br>
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
        builder = CohereLlmInferenceResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "runtimeType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereLlmInferenceResponse extends LlmInferenceResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Each prompt in the input array has an array of GeneratedText, controlled by
         * numGenerations parameter in the request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("generatedTexts")
        private java.util.List<GeneratedText> generatedTexts;

        /**
         * Each prompt in the input array has an array of GeneratedText, controlled by
         * numGenerations parameter in the request.
         *
         * @param generatedTexts the value to set
         * @return this builder
         */
        public Builder generatedTexts(java.util.List<GeneratedText> generatedTexts) {
            this.generatedTexts = generatedTexts;
            this.__explicitlySet__.add("generatedTexts");
            return this;
        }
        /** The date and time that the model was created in an RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the model was created in an RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Represents the original prompt. Applies only to non-stream responses. */
        @com.fasterxml.jackson.annotation.JsonProperty("prompt")
        private String prompt;

        /**
         * Represents the original prompt. Applies only to non-stream responses.
         *
         * @param prompt the value to set
         * @return this builder
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            this.__explicitlySet__.add("prompt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereLlmInferenceResponse build() {
            CohereLlmInferenceResponse model =
                    new CohereLlmInferenceResponse(
                            this.generatedTexts, this.timeCreated, this.prompt);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereLlmInferenceResponse model) {
            if (model.wasPropertyExplicitlySet("generatedTexts")) {
                this.generatedTexts(model.getGeneratedTexts());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("prompt")) {
                this.prompt(model.getPrompt());
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
    public CohereLlmInferenceResponse(
            java.util.List<GeneratedText> generatedTexts,
            java.util.Date timeCreated,
            String prompt) {
        super();
        this.generatedTexts = generatedTexts;
        this.timeCreated = timeCreated;
        this.prompt = prompt;
    }

    /**
     * Each prompt in the input array has an array of GeneratedText, controlled by numGenerations
     * parameter in the request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("generatedTexts")
    private final java.util.List<GeneratedText> generatedTexts;

    /**
     * Each prompt in the input array has an array of GeneratedText, controlled by numGenerations
     * parameter in the request.
     *
     * @return the value
     */
    public java.util.List<GeneratedText> getGeneratedTexts() {
        return generatedTexts;
    }

    /** The date and time that the model was created in an RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the model was created in an RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Represents the original prompt. Applies only to non-stream responses. */
    @com.fasterxml.jackson.annotation.JsonProperty("prompt")
    private final String prompt;

    /**
     * Represents the original prompt. Applies only to non-stream responses.
     *
     * @return the value
     */
    public String getPrompt() {
        return prompt;
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
        sb.append("CohereLlmInferenceResponse(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", generatedTexts=").append(String.valueOf(this.generatedTexts));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", prompt=").append(String.valueOf(this.prompt));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereLlmInferenceResponse)) {
            return false;
        }

        CohereLlmInferenceResponse other = (CohereLlmInferenceResponse) o;
        return java.util.Objects.equals(this.generatedTexts, other.generatedTexts)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.prompt, other.prompt)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.generatedTexts == null ? 43 : this.generatedTexts.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.prompt == null ? 43 : this.prompt.hashCode());
        return result;
    }
}
