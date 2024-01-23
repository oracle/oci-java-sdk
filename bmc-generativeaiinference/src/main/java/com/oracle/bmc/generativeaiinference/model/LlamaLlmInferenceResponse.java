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
        builder = LlamaLlmInferenceResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "runtimeType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LlamaLlmInferenceResponse extends LlmInferenceResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Unix timestamp (in seconds) of when the generation was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("created")
        private java.util.Date created;

        /**
         * The Unix timestamp (in seconds) of when the generation was created.
         *
         * @param created the value to set
         * @return this builder
         */
        public Builder created(java.util.Date created) {
            this.created = created;
            this.__explicitlySet__.add("created");
            return this;
        }
        /** A list of generated texts. Can be more than one if n is greater than 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("choices")
        private java.util.List<Choice> choices;

        /**
         * A list of generated texts. Can be more than one if n is greater than 1.
         *
         * @param choices the value to set
         * @return this builder
         */
        public Builder choices(java.util.List<Choice> choices) {
            this.choices = choices;
            this.__explicitlySet__.add("choices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LlamaLlmInferenceResponse build() {
            LlamaLlmInferenceResponse model =
                    new LlamaLlmInferenceResponse(this.created, this.choices);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LlamaLlmInferenceResponse model) {
            if (model.wasPropertyExplicitlySet("created")) {
                this.created(model.getCreated());
            }
            if (model.wasPropertyExplicitlySet("choices")) {
                this.choices(model.getChoices());
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
    public LlamaLlmInferenceResponse(java.util.Date created, java.util.List<Choice> choices) {
        super();
        this.created = created;
        this.choices = choices;
    }

    /** The Unix timestamp (in seconds) of when the generation was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    private final java.util.Date created;

    /**
     * The Unix timestamp (in seconds) of when the generation was created.
     *
     * @return the value
     */
    public java.util.Date getCreated() {
        return created;
    }

    /** A list of generated texts. Can be more than one if n is greater than 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("choices")
    private final java.util.List<Choice> choices;

    /**
     * A list of generated texts. Can be more than one if n is greater than 1.
     *
     * @return the value
     */
    public java.util.List<Choice> getChoices() {
        return choices;
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
        sb.append("LlamaLlmInferenceResponse(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", created=").append(String.valueOf(this.created));
        sb.append(", choices=").append(String.valueOf(this.choices));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LlamaLlmInferenceResponse)) {
            return false;
        }

        LlamaLlmInferenceResponse other = (LlamaLlmInferenceResponse) o;
        return java.util.Objects.equals(this.created, other.created)
                && java.util.Objects.equals(this.choices, other.choices)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.created == null ? 43 : this.created.hashCode());
        result = (result * PRIME) + (this.choices == null ? 43 : this.choices.hashCode());
        return result;
    }
}
