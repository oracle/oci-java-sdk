/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
    @java.beans.ConstructorProperties({"llmSelection", "llmHyperParameters", "instruction"})
    public LlmCustomization(
            LlmSelection llmSelection,
            java.util.Map<String, Object> llmHyperParameters,
            String instruction) {
        super();
        this.llmSelection = llmSelection;
        this.llmHyperParameters = llmHyperParameters;
        this.instruction = instruction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("llmSelection")
        private LlmSelection llmSelection;

        public Builder llmSelection(LlmSelection llmSelection) {
            this.llmSelection = llmSelection;
            this.__explicitlySet__.add("llmSelection");
            return this;
        }
        /**
         * Hyper parameters for LLM configuration. Accepts Key-value pairs to configure various
         * hyper parameters. Refer to the guide for examples and the JSON Schema documentation for
         * details on the format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("llmHyperParameters")
        private java.util.Map<String, Object> llmHyperParameters;

        /**
         * Hyper parameters for LLM configuration. Accepts Key-value pairs to configure various
         * hyper parameters. Refer to the guide for examples and the JSON Schema documentation for
         * details on the format.
         *
         * @param llmHyperParameters the value to set
         * @return this builder
         */
        public Builder llmHyperParameters(java.util.Map<String, Object> llmHyperParameters) {
            this.llmHyperParameters = llmHyperParameters;
            this.__explicitlySet__.add("llmHyperParameters");
            return this;
        }
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
            LlmCustomization model =
                    new LlmCustomization(
                            this.llmSelection, this.llmHyperParameters, this.instruction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LlmCustomization model) {
            if (model.wasPropertyExplicitlySet("llmSelection")) {
                this.llmSelection(model.getLlmSelection());
            }
            if (model.wasPropertyExplicitlySet("llmHyperParameters")) {
                this.llmHyperParameters(model.getLlmHyperParameters());
            }
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

    @com.fasterxml.jackson.annotation.JsonProperty("llmSelection")
    private final LlmSelection llmSelection;

    public LlmSelection getLlmSelection() {
        return llmSelection;
    }

    /**
     * Hyper parameters for LLM configuration. Accepts Key-value pairs to configure various hyper
     * parameters. Refer to the guide for examples and the JSON Schema documentation for details on
     * the format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("llmHyperParameters")
    private final java.util.Map<String, Object> llmHyperParameters;

    /**
     * Hyper parameters for LLM configuration. Accepts Key-value pairs to configure various hyper
     * parameters. Refer to the guide for examples and the JSON Schema documentation for details on
     * the format.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getLlmHyperParameters() {
        return llmHyperParameters;
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
        sb.append("llmSelection=").append(String.valueOf(this.llmSelection));
        sb.append(", llmHyperParameters=").append(String.valueOf(this.llmHyperParameters));
        sb.append(", instruction=").append(String.valueOf(this.instruction));
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
        return java.util.Objects.equals(this.llmSelection, other.llmSelection)
                && java.util.Objects.equals(this.llmHyperParameters, other.llmHyperParameters)
                && java.util.Objects.equals(this.instruction, other.instruction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.llmSelection == null ? 43 : this.llmSelection.hashCode());
        result =
                (result * PRIME)
                        + (this.llmHyperParameters == null
                                ? 43
                                : this.llmHyperParameters.hashCode());
        result = (result * PRIME) + (this.instruction == null ? 43 : this.instruction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
