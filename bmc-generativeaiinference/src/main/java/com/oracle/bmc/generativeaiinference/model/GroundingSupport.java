/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * chunk to connect model response text to the source in groundingChunk <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GroundingSupport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GroundingSupport
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"segment", "groundingChunkIndices"})
    public GroundingSupport(
            GroundingSupportSegment segment, java.util.List<Integer> groundingChunkIndices) {
        super();
        this.segment = segment;
        this.groundingChunkIndices = groundingChunkIndices;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("segment")
        private GroundingSupportSegment segment;

        public Builder segment(GroundingSupportSegment segment) {
            this.segment = segment;
            this.__explicitlySet__.add("segment");
            return this;
        }
        /** The grounding chunk indices */
        @com.fasterxml.jackson.annotation.JsonProperty("groundingChunkIndices")
        private java.util.List<Integer> groundingChunkIndices;

        /**
         * The grounding chunk indices
         *
         * @param groundingChunkIndices the value to set
         * @return this builder
         */
        public Builder groundingChunkIndices(java.util.List<Integer> groundingChunkIndices) {
            this.groundingChunkIndices = groundingChunkIndices;
            this.__explicitlySet__.add("groundingChunkIndices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GroundingSupport build() {
            GroundingSupport model = new GroundingSupport(this.segment, this.groundingChunkIndices);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GroundingSupport model) {
            if (model.wasPropertyExplicitlySet("segment")) {
                this.segment(model.getSegment());
            }
            if (model.wasPropertyExplicitlySet("groundingChunkIndices")) {
                this.groundingChunkIndices(model.getGroundingChunkIndices());
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

    @com.fasterxml.jackson.annotation.JsonProperty("segment")
    private final GroundingSupportSegment segment;

    public GroundingSupportSegment getSegment() {
        return segment;
    }

    /** The grounding chunk indices */
    @com.fasterxml.jackson.annotation.JsonProperty("groundingChunkIndices")
    private final java.util.List<Integer> groundingChunkIndices;

    /**
     * The grounding chunk indices
     *
     * @return the value
     */
    public java.util.List<Integer> getGroundingChunkIndices() {
        return groundingChunkIndices;
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
        sb.append("GroundingSupport(");
        sb.append("super=").append(super.toString());
        sb.append("segment=").append(String.valueOf(this.segment));
        sb.append(", groundingChunkIndices=").append(String.valueOf(this.groundingChunkIndices));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroundingSupport)) {
            return false;
        }

        GroundingSupport other = (GroundingSupport) o;
        return java.util.Objects.equals(this.segment, other.segment)
                && java.util.Objects.equals(this.groundingChunkIndices, other.groundingChunkIndices)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.segment == null ? 43 : this.segment.hashCode());
        result =
                (result * PRIME)
                        + (this.groundingChunkIndices == null
                                ? 43
                                : this.groundingChunkIndices.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
