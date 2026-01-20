/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Usage statistics for the completion request. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Usage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Usage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "completionTokens",
        "promptTokens",
        "totalTokens",
        "completionTokensDetails",
        "promptTokensDetails"
    })
    public Usage(
            Integer completionTokens,
            Integer promptTokens,
            Integer totalTokens,
            CompletionTokensDetails completionTokensDetails,
            PromptTokensDetails promptTokensDetails) {
        super();
        this.completionTokens = completionTokens;
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
        this.completionTokensDetails = completionTokensDetails;
        this.promptTokensDetails = promptTokensDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of tokens in the generated completion. */
        @com.fasterxml.jackson.annotation.JsonProperty("completionTokens")
        private Integer completionTokens;

        /**
         * Number of tokens in the generated completion.
         *
         * @param completionTokens the value to set
         * @return this builder
         */
        public Builder completionTokens(Integer completionTokens) {
            this.completionTokens = completionTokens;
            this.__explicitlySet__.add("completionTokens");
            return this;
        }
        /** Number of tokens in the prompt. */
        @com.fasterxml.jackson.annotation.JsonProperty("promptTokens")
        private Integer promptTokens;

        /**
         * Number of tokens in the prompt.
         *
         * @param promptTokens the value to set
         * @return this builder
         */
        public Builder promptTokens(Integer promptTokens) {
            this.promptTokens = promptTokens;
            this.__explicitlySet__.add("promptTokens");
            return this;
        }
        /** Total number of tokens used in the request (prompt + completion). */
        @com.fasterxml.jackson.annotation.JsonProperty("totalTokens")
        private Integer totalTokens;

        /**
         * Total number of tokens used in the request (prompt + completion).
         *
         * @param totalTokens the value to set
         * @return this builder
         */
        public Builder totalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            this.__explicitlySet__.add("totalTokens");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("completionTokensDetails")
        private CompletionTokensDetails completionTokensDetails;

        public Builder completionTokensDetails(CompletionTokensDetails completionTokensDetails) {
            this.completionTokensDetails = completionTokensDetails;
            this.__explicitlySet__.add("completionTokensDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("promptTokensDetails")
        private PromptTokensDetails promptTokensDetails;

        public Builder promptTokensDetails(PromptTokensDetails promptTokensDetails) {
            this.promptTokensDetails = promptTokensDetails;
            this.__explicitlySet__.add("promptTokensDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Usage build() {
            Usage model =
                    new Usage(
                            this.completionTokens,
                            this.promptTokens,
                            this.totalTokens,
                            this.completionTokensDetails,
                            this.promptTokensDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Usage model) {
            if (model.wasPropertyExplicitlySet("completionTokens")) {
                this.completionTokens(model.getCompletionTokens());
            }
            if (model.wasPropertyExplicitlySet("promptTokens")) {
                this.promptTokens(model.getPromptTokens());
            }
            if (model.wasPropertyExplicitlySet("totalTokens")) {
                this.totalTokens(model.getTotalTokens());
            }
            if (model.wasPropertyExplicitlySet("completionTokensDetails")) {
                this.completionTokensDetails(model.getCompletionTokensDetails());
            }
            if (model.wasPropertyExplicitlySet("promptTokensDetails")) {
                this.promptTokensDetails(model.getPromptTokensDetails());
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

    /** Number of tokens in the generated completion. */
    @com.fasterxml.jackson.annotation.JsonProperty("completionTokens")
    private final Integer completionTokens;

    /**
     * Number of tokens in the generated completion.
     *
     * @return the value
     */
    public Integer getCompletionTokens() {
        return completionTokens;
    }

    /** Number of tokens in the prompt. */
    @com.fasterxml.jackson.annotation.JsonProperty("promptTokens")
    private final Integer promptTokens;

    /**
     * Number of tokens in the prompt.
     *
     * @return the value
     */
    public Integer getPromptTokens() {
        return promptTokens;
    }

    /** Total number of tokens used in the request (prompt + completion). */
    @com.fasterxml.jackson.annotation.JsonProperty("totalTokens")
    private final Integer totalTokens;

    /**
     * Total number of tokens used in the request (prompt + completion).
     *
     * @return the value
     */
    public Integer getTotalTokens() {
        return totalTokens;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("completionTokensDetails")
    private final CompletionTokensDetails completionTokensDetails;

    public CompletionTokensDetails getCompletionTokensDetails() {
        return completionTokensDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("promptTokensDetails")
    private final PromptTokensDetails promptTokensDetails;

    public PromptTokensDetails getPromptTokensDetails() {
        return promptTokensDetails;
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
        sb.append("Usage(");
        sb.append("super=").append(super.toString());
        sb.append("completionTokens=").append(String.valueOf(this.completionTokens));
        sb.append(", promptTokens=").append(String.valueOf(this.promptTokens));
        sb.append(", totalTokens=").append(String.valueOf(this.totalTokens));
        sb.append(", completionTokensDetails=")
                .append(String.valueOf(this.completionTokensDetails));
        sb.append(", promptTokensDetails=").append(String.valueOf(this.promptTokensDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Usage)) {
            return false;
        }

        Usage other = (Usage) o;
        return java.util.Objects.equals(this.completionTokens, other.completionTokens)
                && java.util.Objects.equals(this.promptTokens, other.promptTokens)
                && java.util.Objects.equals(this.totalTokens, other.totalTokens)
                && java.util.Objects.equals(
                        this.completionTokensDetails, other.completionTokensDetails)
                && java.util.Objects.equals(this.promptTokensDetails, other.promptTokensDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.completionTokens == null ? 43 : this.completionTokens.hashCode());
        result = (result * PRIME) + (this.promptTokens == null ? 43 : this.promptTokens.hashCode());
        result = (result * PRIME) + (this.totalTokens == null ? 43 : this.totalTokens.hashCode());
        result =
                (result * PRIME)
                        + (this.completionTokensDetails == null
                                ? 43
                                : this.completionTokensDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.promptTokensDetails == null
                                ? 43
                                : this.promptTokensDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
