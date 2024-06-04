/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The result from invoking tools recommended by the model in the previous chat turn. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CohereToolResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereToolResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"call", "outputs"})
    public CohereToolResult(CohereToolCall call, java.util.List<Object> outputs) {
        super();
        this.call = call;
        this.outputs = outputs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("call")
        private CohereToolCall call;

        public Builder call(CohereToolCall call) {
            this.call = call;
            this.__explicitlySet__.add("call");
            return this;
        }
        /** An array of objects returned by tool. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputs")
        private java.util.List<Object> outputs;

        /**
         * An array of objects returned by tool.
         *
         * @param outputs the value to set
         * @return this builder
         */
        public Builder outputs(java.util.List<Object> outputs) {
            this.outputs = outputs;
            this.__explicitlySet__.add("outputs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereToolResult build() {
            CohereToolResult model = new CohereToolResult(this.call, this.outputs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereToolResult model) {
            if (model.wasPropertyExplicitlySet("call")) {
                this.call(model.getCall());
            }
            if (model.wasPropertyExplicitlySet("outputs")) {
                this.outputs(model.getOutputs());
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

    @com.fasterxml.jackson.annotation.JsonProperty("call")
    private final CohereToolCall call;

    public CohereToolCall getCall() {
        return call;
    }

    /** An array of objects returned by tool. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    private final java.util.List<Object> outputs;

    /**
     * An array of objects returned by tool.
     *
     * @return the value
     */
    public java.util.List<Object> getOutputs() {
        return outputs;
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
        sb.append("CohereToolResult(");
        sb.append("super=").append(super.toString());
        sb.append("call=").append(String.valueOf(this.call));
        sb.append(", outputs=").append(String.valueOf(this.outputs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereToolResult)) {
            return false;
        }

        CohereToolResult other = (CohereToolResult) o;
        return java.util.Objects.equals(this.call, other.call)
                && java.util.Objects.equals(this.outputs, other.outputs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.call == null ? 43 : this.call.hashCode());
        result = (result * PRIME) + (this.outputs == null ? 43 : this.outputs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
