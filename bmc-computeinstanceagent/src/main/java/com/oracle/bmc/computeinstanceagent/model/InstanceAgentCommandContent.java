/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The contents of the command. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceAgentCommandContent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class InstanceAgentCommandContent
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"source", "output"})
    public InstanceAgentCommandContent(
            InstanceAgentCommandSourceDetails source, InstanceAgentCommandOutputDetails output) {
        super();
        this.source = source;
        this.output = output;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The source of the command. */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private InstanceAgentCommandSourceDetails source;

        /**
         * The source of the command.
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(InstanceAgentCommandSourceDetails source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** The output destination for the command. */
        @com.fasterxml.jackson.annotation.JsonProperty("output")
        private InstanceAgentCommandOutputDetails output;

        /**
         * The output destination for the command.
         *
         * @param output the value to set
         * @return this builder
         */
        public Builder output(InstanceAgentCommandOutputDetails output) {
            this.output = output;
            this.__explicitlySet__.add("output");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentCommandContent build() {
            InstanceAgentCommandContent model =
                    new InstanceAgentCommandContent(this.source, this.output);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommandContent model) {
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
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

    /** The source of the command. */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final InstanceAgentCommandSourceDetails source;

    /**
     * The source of the command.
     *
     * @return the value
     */
    public InstanceAgentCommandSourceDetails getSource() {
        return source;
    }

    /** The output destination for the command. */
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    private final InstanceAgentCommandOutputDetails output;

    /**
     * The output destination for the command.
     *
     * @return the value
     */
    public InstanceAgentCommandOutputDetails getOutput() {
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
        sb.append("InstanceAgentCommandContent(");
        sb.append("super=").append(super.toString());
        sb.append("source=").append(String.valueOf(this.source));
        sb.append(", output=").append(String.valueOf(this.output));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentCommandContent)) {
            return false;
        }

        InstanceAgentCommandContent other = (InstanceAgentCommandContent) o;
        return java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.output, other.output)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.output == null ? 43 : this.output.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
