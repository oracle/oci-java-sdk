/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Configuration to customize LLM. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LlmCustomization.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LlmCustomization
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"instruction"})
    public LlmCustomization(String instruction) {
        super();
        this.instruction = instruction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** If specified, the default instruction is replaced with provided instruction. */
        @com.fasterxml.jackson.annotation.JsonProperty("instruction")
        private String instruction;

        /**
         * If specified, the default instruction is replaced with provided instruction.
         *
         * @param instruction the value to set
         * @return this builder
         */
        public Builder instruction(String instruction) {
            this.instruction = instruction;
            this.__explicitlySet__.add("instruction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LlmCustomization build() {
            LlmCustomization model = new LlmCustomization(this.instruction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LlmCustomization model) {
            if (model.wasPropertyExplicitlySet("instruction")) {
                this.instruction(model.getInstruction());
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

    /** If specified, the default instruction is replaced with provided instruction. */
    @com.fasterxml.jackson.annotation.JsonProperty("instruction")
    private final String instruction;

    /**
     * If specified, the default instruction is replaced with provided instruction.
     *
     * @return the value
     */
    public String getInstruction() {
        return instruction;
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
        sb.append("LlmCustomization(");
        sb.append("super=").append(super.toString());
        sb.append("instruction=").append(String.valueOf(this.instruction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LlmCustomization)) {
            return false;
        }

        LlmCustomization other = (LlmCustomization) o;
        return java.util.Objects.equals(this.instruction, other.instruction) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instruction == null ? 43 : this.instruction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
