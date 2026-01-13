/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Specifies an output format for tools that return freeform or unstructured JSON content. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenericToolOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "toolOutputType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenericToolOutput extends ToolOutput {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("toolId")
        private String toolId;

        public Builder toolId(String toolId) {
            this.toolId = toolId;
            this.__explicitlySet__.add("toolId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("toolName")
        private String toolName;

        public Builder toolName(String toolName) {
            this.toolName = toolName;
            this.__explicitlySet__.add("toolName");
            return this;
        }
        /** Specifies the freeform JSON object containing the tool\u2019s output. */
        @com.fasterxml.jackson.annotation.JsonProperty("output")
        private Object output;

        /**
         * Specifies the freeform JSON object containing the tool\u2019s output.
         *
         * @param output the value to set
         * @return this builder
         */
        public Builder output(Object output) {
            this.output = output;
            this.__explicitlySet__.add("output");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericToolOutput build() {
            GenericToolOutput model =
                    new GenericToolOutput(this.toolId, this.toolName, this.output);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericToolOutput model) {
            if (model.wasPropertyExplicitlySet("toolId")) {
                this.toolId(model.getToolId());
            }
            if (model.wasPropertyExplicitlySet("toolName")) {
                this.toolName(model.getToolName());
            }
            if (model.wasPropertyExplicitlySet("output")) {
                this.output(model.getOutput());
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
    public GenericToolOutput(String toolId, String toolName, Object output) {
        super(toolId, toolName);
        this.output = output;
    }

    /** Specifies the freeform JSON object containing the tool\u2019s output. */
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    private final Object output;

    /**
     * Specifies the freeform JSON object containing the tool\u2019s output.
     *
     * @return the value
     */
    public Object getOutput() {
        return output;
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
        sb.append("GenericToolOutput(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", output=").append(String.valueOf(this.output));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericToolOutput)) {
            return false;
        }

        GenericToolOutput other = (GenericToolOutput) o;
        return java.util.Objects.equals(this.output, other.output) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.output == null ? 43 : this.output.hashCode());
        return result;
    }
}
