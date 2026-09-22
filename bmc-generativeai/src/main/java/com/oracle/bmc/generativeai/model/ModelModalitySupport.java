/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * A supported input-to-output modality transformation for a model.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModelModalitySupport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModelModalitySupport extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"input", "output"})
    public ModelModalitySupport(ModelModality input, ModelModality output) {
        super();
        this.input = input;
        this.output = output;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The source modality accepted by the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("input")
        private ModelModality input;

        /**
         * The source modality accepted by the model.
         * @param input the value to set
         * @return this builder
         **/
        public Builder input(ModelModality input) {
            this.input = input;
            this.__explicitlySet__.add("input");
            return this;
        }
        /**
         * The target modality produced by the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("output")
        private ModelModality output;

        /**
         * The target modality produced by the model.
         * @param output the value to set
         * @return this builder
         **/
        public Builder output(ModelModality output) {
            this.output = output;
            this.__explicitlySet__.add("output");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelModalitySupport build() {
            ModelModalitySupport model = new ModelModalitySupport(this.input, this.output);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelModalitySupport model) {
            if (model.wasPropertyExplicitlySet("input")) {
                this.input(model.getInput());
            }
            if (model.wasPropertyExplicitlySet("output")) {
                this.output(model.getOutput());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The source modality accepted by the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    private final ModelModality input;

    /**
     * The source modality accepted by the model.
     * @return the value
     **/
    public ModelModality getInput() {
        return input;
    }

    /**
     * The target modality produced by the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    private final ModelModality output;

    /**
     * The target modality produced by the model.
     * @return the value
     **/
    public ModelModality getOutput() {
        return output;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ModelModalitySupport(");
        sb.append("super=").append(super.toString());
        sb.append("input=").append(String.valueOf(this.input));
        sb.append(", output=").append(String.valueOf(this.output));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelModalitySupport)) {
            return false;
        }

        ModelModalitySupport other = (ModelModalitySupport) o;
        return java.util.Objects.equals(this.input, other.input)
                && java.util.Objects.equals(this.output, other.output)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.input == null ? 43 : this.input.hashCode());
        result = (result * PRIME) + (this.output == null ? 43 : this.output.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
