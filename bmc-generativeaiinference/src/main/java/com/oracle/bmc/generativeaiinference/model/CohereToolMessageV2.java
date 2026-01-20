/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
        builder = CohereToolMessageV2.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "role")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereToolMessageV2 extends CohereMessageV2 {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private java.util.List<CohereContentV2> content;

        public Builder content(java.util.List<CohereContentV2> content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /** The id of the associated tool call that has provided the given content */
        @com.fasterxml.jackson.annotation.JsonProperty("toolCallId")
        private String toolCallId;

        /**
         * The id of the associated tool call that has provided the given content
         *
         * @param toolCallId the value to set
         * @return this builder
         */
        public Builder toolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            this.__explicitlySet__.add("toolCallId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereToolMessageV2 build() {
            CohereToolMessageV2 model = new CohereToolMessageV2(this.content, this.toolCallId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereToolMessageV2 model) {
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("toolCallId")) {
                this.toolCallId(model.getToolCallId());
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
    public CohereToolMessageV2(java.util.List<CohereContentV2> content, String toolCallId) {
        super(content);
        this.toolCallId = toolCallId;
    }

    /** The id of the associated tool call that has provided the given content */
    @com.fasterxml.jackson.annotation.JsonProperty("toolCallId")
    private final String toolCallId;

    /**
     * The id of the associated tool call that has provided the given content
     *
     * @return the value
     */
    public String getToolCallId() {
        return toolCallId;
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
        sb.append("CohereToolMessageV2(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", toolCallId=").append(String.valueOf(this.toolCallId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereToolMessageV2)) {
            return false;
        }

        CohereToolMessageV2 other = (CohereToolMessageV2) o;
        return java.util.Objects.equals(this.toolCallId, other.toolCallId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.toolCallId == null ? 43 : this.toolCallId.hashCode());
        return result;
    }
}
