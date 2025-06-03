/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Usage details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UsageDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "inputTokenCount",
        "outputTokenCount",
        "inputCharCount",
        "outputCharCount"
    })
    public UsageDetails(
            Integer inputTokenCount,
            Integer outputTokenCount,
            Integer inputCharCount,
            Integer outputCharCount) {
        super();
        this.inputTokenCount = inputTokenCount;
        this.outputTokenCount = outputTokenCount;
        this.inputCharCount = inputCharCount;
        this.outputCharCount = outputCharCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of input tokens. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputTokenCount")
        private Integer inputTokenCount;

        /**
         * Number of input tokens.
         *
         * @param inputTokenCount the value to set
         * @return this builder
         */
        public Builder inputTokenCount(Integer inputTokenCount) {
            this.inputTokenCount = inputTokenCount;
            this.__explicitlySet__.add("inputTokenCount");
            return this;
        }
        /** Number of output tokens. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputTokenCount")
        private Integer outputTokenCount;

        /**
         * Number of output tokens.
         *
         * @param outputTokenCount the value to set
         * @return this builder
         */
        public Builder outputTokenCount(Integer outputTokenCount) {
            this.outputTokenCount = outputTokenCount;
            this.__explicitlySet__.add("outputTokenCount");
            return this;
        }
        /** Number of input characters. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputCharCount")
        private Integer inputCharCount;

        /**
         * Number of input characters.
         *
         * @param inputCharCount the value to set
         * @return this builder
         */
        public Builder inputCharCount(Integer inputCharCount) {
            this.inputCharCount = inputCharCount;
            this.__explicitlySet__.add("inputCharCount");
            return this;
        }
        /** Number of output characters. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputCharCount")
        private Integer outputCharCount;

        /**
         * Number of output characters.
         *
         * @param outputCharCount the value to set
         * @return this builder
         */
        public Builder outputCharCount(Integer outputCharCount) {
            this.outputCharCount = outputCharCount;
            this.__explicitlySet__.add("outputCharCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageDetails build() {
            UsageDetails model =
                    new UsageDetails(
                            this.inputTokenCount,
                            this.outputTokenCount,
                            this.inputCharCount,
                            this.outputCharCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageDetails model) {
            if (model.wasPropertyExplicitlySet("inputTokenCount")) {
                this.inputTokenCount(model.getInputTokenCount());
            }
            if (model.wasPropertyExplicitlySet("outputTokenCount")) {
                this.outputTokenCount(model.getOutputTokenCount());
            }
            if (model.wasPropertyExplicitlySet("inputCharCount")) {
                this.inputCharCount(model.getInputCharCount());
            }
            if (model.wasPropertyExplicitlySet("outputCharCount")) {
                this.outputCharCount(model.getOutputCharCount());
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

    /** Number of input tokens. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputTokenCount")
    private final Integer inputTokenCount;

    /**
     * Number of input tokens.
     *
     * @return the value
     */
    public Integer getInputTokenCount() {
        return inputTokenCount;
    }

    /** Number of output tokens. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputTokenCount")
    private final Integer outputTokenCount;

    /**
     * Number of output tokens.
     *
     * @return the value
     */
    public Integer getOutputTokenCount() {
        return outputTokenCount;
    }

    /** Number of input characters. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputCharCount")
    private final Integer inputCharCount;

    /**
     * Number of input characters.
     *
     * @return the value
     */
    public Integer getInputCharCount() {
        return inputCharCount;
    }

    /** Number of output characters. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputCharCount")
    private final Integer outputCharCount;

    /**
     * Number of output characters.
     *
     * @return the value
     */
    public Integer getOutputCharCount() {
        return outputCharCount;
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
        sb.append("UsageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("inputTokenCount=").append(String.valueOf(this.inputTokenCount));
        sb.append(", outputTokenCount=").append(String.valueOf(this.outputTokenCount));
        sb.append(", inputCharCount=").append(String.valueOf(this.inputCharCount));
        sb.append(", outputCharCount=").append(String.valueOf(this.outputCharCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageDetails)) {
            return false;
        }

        UsageDetails other = (UsageDetails) o;
        return java.util.Objects.equals(this.inputTokenCount, other.inputTokenCount)
                && java.util.Objects.equals(this.outputTokenCount, other.outputTokenCount)
                && java.util.Objects.equals(this.inputCharCount, other.inputCharCount)
                && java.util.Objects.equals(this.outputCharCount, other.outputCharCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inputTokenCount == null ? 43 : this.inputTokenCount.hashCode());
        result =
                (result * PRIME)
                        + (this.outputTokenCount == null ? 43 : this.outputTokenCount.hashCode());
        result =
                (result * PRIME)
                        + (this.inputCharCount == null ? 43 : this.inputCharCount.hashCode());
        result =
                (result * PRIME)
                        + (this.outputCharCount == null ? 43 : this.outputCharCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
