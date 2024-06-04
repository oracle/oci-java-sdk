/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * A message that represents a single chat dialog as TOOL role. <br>
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
        builder = CohereToolMessage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "role")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereToolMessage extends CohereMessage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of results from invoking tools recommended by the model in the previous chat turn.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toolResults")
        private java.util.List<CohereToolResult> toolResults;

        /**
         * A list of results from invoking tools recommended by the model in the previous chat turn.
         *
         * @param toolResults the value to set
         * @return this builder
         */
        public Builder toolResults(java.util.List<CohereToolResult> toolResults) {
            this.toolResults = toolResults;
            this.__explicitlySet__.add("toolResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereToolMessage build() {
            CohereToolMessage model = new CohereToolMessage(this.toolResults);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereToolMessage model) {
            if (model.wasPropertyExplicitlySet("toolResults")) {
                this.toolResults(model.getToolResults());
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
    public CohereToolMessage(java.util.List<CohereToolResult> toolResults) {
        super();
        this.toolResults = toolResults;
    }

    /** A list of results from invoking tools recommended by the model in the previous chat turn. */
    @com.fasterxml.jackson.annotation.JsonProperty("toolResults")
    private final java.util.List<CohereToolResult> toolResults;

    /**
     * A list of results from invoking tools recommended by the model in the previous chat turn.
     *
     * @return the value
     */
    public java.util.List<CohereToolResult> getToolResults() {
        return toolResults;
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
        sb.append("CohereToolMessage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", toolResults=").append(String.valueOf(this.toolResults));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereToolMessage)) {
            return false;
        }

        CohereToolMessage other = (CohereToolMessage) o;
        return java.util.Objects.equals(this.toolResults, other.toolResults) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.toolResults == null ? 43 : this.toolResults.hashCode());
        return result;
    }
}
