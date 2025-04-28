/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration details for Prompt Injection. <br>
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
        builder = PromptInjectionGuardrailConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PromptInjectionGuardrailConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"inputGuardrailMode"})
    public PromptInjectionGuardrailConfig(GuardrailMode inputGuardrailMode) {
        super();
        this.inputGuardrailMode = inputGuardrailMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An input guardrail mode for prompt injection. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputGuardrailMode")
        private GuardrailMode inputGuardrailMode;

        /**
         * An input guardrail mode for prompt injection.
         *
         * @param inputGuardrailMode the value to set
         * @return this builder
         */
        public Builder inputGuardrailMode(GuardrailMode inputGuardrailMode) {
            this.inputGuardrailMode = inputGuardrailMode;
            this.__explicitlySet__.add("inputGuardrailMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PromptInjectionGuardrailConfig build() {
            PromptInjectionGuardrailConfig model =
                    new PromptInjectionGuardrailConfig(this.inputGuardrailMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PromptInjectionGuardrailConfig model) {
            if (model.wasPropertyExplicitlySet("inputGuardrailMode")) {
                this.inputGuardrailMode(model.getInputGuardrailMode());
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

    /** An input guardrail mode for prompt injection. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputGuardrailMode")
    private final GuardrailMode inputGuardrailMode;

    /**
     * An input guardrail mode for prompt injection.
     *
     * @return the value
     */
    public GuardrailMode getInputGuardrailMode() {
        return inputGuardrailMode;
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
        sb.append("PromptInjectionGuardrailConfig(");
        sb.append("super=").append(super.toString());
        sb.append("inputGuardrailMode=").append(String.valueOf(this.inputGuardrailMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PromptInjectionGuardrailConfig)) {
            return false;
        }

        PromptInjectionGuardrailConfig other = (PromptInjectionGuardrailConfig) o;
        return java.util.Objects.equals(this.inputGuardrailMode, other.inputGuardrailMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inputGuardrailMode == null
                                ? 43
                                : this.inputGuardrailMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
