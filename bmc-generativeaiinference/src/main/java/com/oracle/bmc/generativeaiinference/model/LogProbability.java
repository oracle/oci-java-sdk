/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The log probabilities of the generated tokens. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LogProbability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogProbability
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tokenIds", "text", "logProbabilities"})
    public LogProbability(
            java.util.List<Integer> tokenIds,
            String text,
            java.util.List<Double> logProbabilities) {
        super();
        this.tokenIds = tokenIds;
        this.text = text;
        this.logProbabilities = logProbabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The token ids of each token used to construct the text chunk. */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenIds")
        private java.util.List<Integer> tokenIds;

        /**
         * The token ids of each token used to construct the text chunk.
         *
         * @param tokenIds the value to set
         * @return this builder
         */
        public Builder tokenIds(java.util.List<Integer> tokenIds) {
            this.tokenIds = tokenIds;
            this.__explicitlySet__.add("tokenIds");
            return this;
        }
        /** The text chunk for which the log probabilities was calculated. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The text chunk for which the log probabilities was calculated.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** The log probability of each token used to construct the text chunk. */
        @com.fasterxml.jackson.annotation.JsonProperty("logProbabilities")
        private java.util.List<Double> logProbabilities;

        /**
         * The log probability of each token used to construct the text chunk.
         *
         * @param logProbabilities the value to set
         * @return this builder
         */
        public Builder logProbabilities(java.util.List<Double> logProbabilities) {
            this.logProbabilities = logProbabilities;
            this.__explicitlySet__.add("logProbabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogProbability build() {
            LogProbability model =
                    new LogProbability(this.tokenIds, this.text, this.logProbabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogProbability model) {
            if (model.wasPropertyExplicitlySet("tokenIds")) {
                this.tokenIds(model.getTokenIds());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("logProbabilities")) {
                this.logProbabilities(model.getLogProbabilities());
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

    /** The token ids of each token used to construct the text chunk. */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenIds")
    private final java.util.List<Integer> tokenIds;

    /**
     * The token ids of each token used to construct the text chunk.
     *
     * @return the value
     */
    public java.util.List<Integer> getTokenIds() {
        return tokenIds;
    }

    /** The text chunk for which the log probabilities was calculated. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The text chunk for which the log probabilities was calculated.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** The log probability of each token used to construct the text chunk. */
    @com.fasterxml.jackson.annotation.JsonProperty("logProbabilities")
    private final java.util.List<Double> logProbabilities;

    /**
     * The log probability of each token used to construct the text chunk.
     *
     * @return the value
     */
    public java.util.List<Double> getLogProbabilities() {
        return logProbabilities;
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
        sb.append("LogProbability(");
        sb.append("super=").append(super.toString());
        sb.append("tokenIds=").append(String.valueOf(this.tokenIds));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", logProbabilities=").append(String.valueOf(this.logProbabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogProbability)) {
            return false;
        }

        LogProbability other = (LogProbability) o;
        return java.util.Objects.equals(this.tokenIds, other.tokenIds)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.logProbabilities, other.logProbabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tokenIds == null ? 43 : this.tokenIds.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result =
                (result * PRIME)
                        + (this.logProbabilities == null ? 43 : this.logProbabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
