/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Includes the logarithmic probabilities for the most likely output tokens and the chosen tokens.
 *
 * <p>For example, if the log probability is 5, the API returns a list of the 5 most likely tokens.
 * The API returns the log probability of the sampled token, so there might be up to logprobs+1
 * elements in the response. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Logprobs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Logprobs extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"textOffset", "tokenLogprobs", "tokens", "topLogprobs"})
    public Logprobs(
            java.util.List<Integer> textOffset,
            java.util.List<Double> tokenLogprobs,
            java.util.List<String> tokens,
            java.util.List<java.util.Map<String, String>> topLogprobs) {
        super();
        this.textOffset = textOffset;
        this.tokenLogprobs = tokenLogprobs;
        this.tokens = tokens;
        this.topLogprobs = topLogprobs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The text offset. */
        @com.fasterxml.jackson.annotation.JsonProperty("textOffset")
        private java.util.List<Integer> textOffset;

        /**
         * The text offset.
         *
         * @param textOffset the value to set
         * @return this builder
         */
        public Builder textOffset(java.util.List<Integer> textOffset) {
            this.textOffset = textOffset;
            this.__explicitlySet__.add("textOffset");
            return this;
        }
        /** The logarithmic probabilites of the output token. */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenLogprobs")
        private java.util.List<Double> tokenLogprobs;

        /**
         * The logarithmic probabilites of the output token.
         *
         * @param tokenLogprobs the value to set
         * @return this builder
         */
        public Builder tokenLogprobs(java.util.List<Double> tokenLogprobs) {
            this.tokenLogprobs = tokenLogprobs;
            this.__explicitlySet__.add("tokenLogprobs");
            return this;
        }
        /** The list of output tokens. */
        @com.fasterxml.jackson.annotation.JsonProperty("tokens")
        private java.util.List<String> tokens;

        /**
         * The list of output tokens.
         *
         * @param tokens the value to set
         * @return this builder
         */
        public Builder tokens(java.util.List<String> tokens) {
            this.tokens = tokens;
            this.__explicitlySet__.add("tokens");
            return this;
        }
        /** The logarithmic probabilities of each of the top k tokens. */
        @com.fasterxml.jackson.annotation.JsonProperty("topLogprobs")
        private java.util.List<java.util.Map<String, String>> topLogprobs;

        /**
         * The logarithmic probabilities of each of the top k tokens.
         *
         * @param topLogprobs the value to set
         * @return this builder
         */
        public Builder topLogprobs(java.util.List<java.util.Map<String, String>> topLogprobs) {
            this.topLogprobs = topLogprobs;
            this.__explicitlySet__.add("topLogprobs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Logprobs build() {
            Logprobs model =
                    new Logprobs(
                            this.textOffset, this.tokenLogprobs, this.tokens, this.topLogprobs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Logprobs model) {
            if (model.wasPropertyExplicitlySet("textOffset")) {
                this.textOffset(model.getTextOffset());
            }
            if (model.wasPropertyExplicitlySet("tokenLogprobs")) {
                this.tokenLogprobs(model.getTokenLogprobs());
            }
            if (model.wasPropertyExplicitlySet("tokens")) {
                this.tokens(model.getTokens());
            }
            if (model.wasPropertyExplicitlySet("topLogprobs")) {
                this.topLogprobs(model.getTopLogprobs());
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

    /** The text offset. */
    @com.fasterxml.jackson.annotation.JsonProperty("textOffset")
    private final java.util.List<Integer> textOffset;

    /**
     * The text offset.
     *
     * @return the value
     */
    public java.util.List<Integer> getTextOffset() {
        return textOffset;
    }

    /** The logarithmic probabilites of the output token. */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenLogprobs")
    private final java.util.List<Double> tokenLogprobs;

    /**
     * The logarithmic probabilites of the output token.
     *
     * @return the value
     */
    public java.util.List<Double> getTokenLogprobs() {
        return tokenLogprobs;
    }

    /** The list of output tokens. */
    @com.fasterxml.jackson.annotation.JsonProperty("tokens")
    private final java.util.List<String> tokens;

    /**
     * The list of output tokens.
     *
     * @return the value
     */
    public java.util.List<String> getTokens() {
        return tokens;
    }

    /** The logarithmic probabilities of each of the top k tokens. */
    @com.fasterxml.jackson.annotation.JsonProperty("topLogprobs")
    private final java.util.List<java.util.Map<String, String>> topLogprobs;

    /**
     * The logarithmic probabilities of each of the top k tokens.
     *
     * @return the value
     */
    public java.util.List<java.util.Map<String, String>> getTopLogprobs() {
        return topLogprobs;
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
        sb.append("Logprobs(");
        sb.append("super=").append(super.toString());
        sb.append("textOffset=").append(String.valueOf(this.textOffset));
        sb.append(", tokenLogprobs=").append(String.valueOf(this.tokenLogprobs));
        sb.append(", tokens=").append(String.valueOf(this.tokens));
        sb.append(", topLogprobs=").append(String.valueOf(this.topLogprobs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Logprobs)) {
            return false;
        }

        Logprobs other = (Logprobs) o;
        return java.util.Objects.equals(this.textOffset, other.textOffset)
                && java.util.Objects.equals(this.tokenLogprobs, other.tokenLogprobs)
                && java.util.Objects.equals(this.tokens, other.tokens)
                && java.util.Objects.equals(this.topLogprobs, other.topLogprobs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.textOffset == null ? 43 : this.textOffset.hashCode());
        result =
                (result * PRIME)
                        + (this.tokenLogprobs == null ? 43 : this.tokenLogprobs.hashCode());
        result = (result * PRIME) + (this.tokens == null ? 43 : this.tokens.hashCode());
        result = (result * PRIME) + (this.topLogprobs == null ? 43 : this.topLogprobs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
