/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Represents a single instance of generated text.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Choice.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Choice extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"index", "text", "finishReason", "logprobs"})
    public Choice(Integer index, String text, String finishReason, Logprobs logprobs) {
        super();
        this.index = index;
        this.text = text;
        this.finishReason = finishReason;
        this.logprobs = logprobs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The index of the generated text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("index")
        private Integer index;

        /**
         * The index of the generated text.
         * @param index the value to set
         * @return this builder
         **/
        public Builder index(Integer index) {
            this.index = index;
            this.__explicitlySet__.add("index");
            return this;
        }
        /**
         * The generated text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The generated text.
         * @param text the value to set
         * @return this builder
         **/
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /**
         * The reason why the model stopped generating tokens.
         * <p>
         * Stops if the model hits a natural stop point or a provided stop sequence. Returns the length if the tokens reach the specified maximum number of tokens.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("finishReason")
        private String finishReason;

        /**
         * The reason why the model stopped generating tokens.
         * <p>
         * Stops if the model hits a natural stop point or a provided stop sequence. Returns the length if the tokens reach the specified maximum number of tokens.
         *
         * @param finishReason the value to set
         * @return this builder
         **/
        public Builder finishReason(String finishReason) {
            this.finishReason = finishReason;
            this.__explicitlySet__.add("finishReason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logprobs")
        private Logprobs logprobs;

        public Builder logprobs(Logprobs logprobs) {
            this.logprobs = logprobs;
            this.__explicitlySet__.add("logprobs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Choice build() {
            Choice model = new Choice(this.index, this.text, this.finishReason, this.logprobs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Choice model) {
            if (model.wasPropertyExplicitlySet("index")) {
                this.index(model.getIndex());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("finishReason")) {
                this.finishReason(model.getFinishReason());
            }
            if (model.wasPropertyExplicitlySet("logprobs")) {
                this.logprobs(model.getLogprobs());
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

    /**
     * The index of the generated text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("index")
    private final Integer index;

    /**
     * The index of the generated text.
     * @return the value
     **/
    public Integer getIndex() {
        return index;
    }

    /**
     * The generated text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The generated text.
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * The reason why the model stopped generating tokens.
     * <p>
     * Stops if the model hits a natural stop point or a provided stop sequence. Returns the length if the tokens reach the specified maximum number of tokens.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("finishReason")
    private final String finishReason;

    /**
     * The reason why the model stopped generating tokens.
     * <p>
     * Stops if the model hits a natural stop point or a provided stop sequence. Returns the length if the tokens reach the specified maximum number of tokens.
     *
     * @return the value
     **/
    public String getFinishReason() {
        return finishReason;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logprobs")
    private final Logprobs logprobs;

    public Logprobs getLogprobs() {
        return logprobs;
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
        sb.append("Choice(");
        sb.append("super=").append(super.toString());
        sb.append("index=").append(String.valueOf(this.index));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", finishReason=").append(String.valueOf(this.finishReason));
        sb.append(", logprobs=").append(String.valueOf(this.logprobs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Choice)) {
            return false;
        }

        Choice other = (Choice) o;
        return java.util.Objects.equals(this.index, other.index)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.finishReason, other.finishReason)
                && java.util.Objects.equals(this.logprobs, other.logprobs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.index == null ? 43 : this.index.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.finishReason == null ? 43 : this.finishReason.hashCode());
        result = (result * PRIME) + (this.logprobs == null ? 43 : this.logprobs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
