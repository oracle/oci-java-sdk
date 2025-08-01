/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Represents a generic tool input schema that accepts flexible, freeform JSON parameters. This
 * structure is intended for tools that do not require a fixed input schema. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GenericToolInput.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "toolInputType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenericToolInput extends ToolInput {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("toolId")
        private String toolId;

        public Builder toolId(String toolId) {
            this.toolId = toolId;
            this.__explicitlySet__.add("toolId");
            return this;
        }
        /**
         * A freeform JSON object containing the input parameters to be passed to the tool during
         * execution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("input")
        private Object input;

        /**
         * A freeform JSON object containing the input parameters to be passed to the tool during
         * execution.
         *
         * @param input the value to set
         * @return this builder
         */
        public Builder input(Object input) {
            this.input = input;
            this.__explicitlySet__.add("input");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericToolInput build() {
            GenericToolInput model = new GenericToolInput(this.toolId, this.input);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericToolInput model) {
            if (model.wasPropertyExplicitlySet("toolId")) {
                this.toolId(model.getToolId());
            }
            if (model.wasPropertyExplicitlySet("input")) {
                this.input(model.getInput());
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
    public GenericToolInput(String toolId, Object input) {
        super(toolId);
        this.input = input;
    }

    /**
     * A freeform JSON object containing the input parameters to be passed to the tool during
     * execution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    private final Object input;

    /**
     * A freeform JSON object containing the input parameters to be passed to the tool during
     * execution.
     *
     * @return the value
     */
    public Object getInput() {
        return input;
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
        sb.append("GenericToolInput(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", input=").append(String.valueOf(this.input));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericToolInput)) {
            return false;
        }

        GenericToolInput other = (GenericToolInput) o;
        return java.util.Objects.equals(this.input, other.input) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.input == null ? 43 : this.input.hashCode());
        return result;
    }
}
