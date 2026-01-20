/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * List of streamSource OCIDs that have overlapping fields of view <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StreamGroupOverlap.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StreamGroupOverlap
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"overlappingStreams"})
    public StreamGroupOverlap(java.util.List<String> overlappingStreams) {
        super();
        this.overlappingStreams = overlappingStreams;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of streamSource OCIDs. */
        @com.fasterxml.jackson.annotation.JsonProperty("overlappingStreams")
        private java.util.List<String> overlappingStreams;

        /**
         * List of streamSource OCIDs.
         *
         * @param overlappingStreams the value to set
         * @return this builder
         */
        public Builder overlappingStreams(java.util.List<String> overlappingStreams) {
            this.overlappingStreams = overlappingStreams;
            this.__explicitlySet__.add("overlappingStreams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StreamGroupOverlap build() {
            StreamGroupOverlap model = new StreamGroupOverlap(this.overlappingStreams);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StreamGroupOverlap model) {
            if (model.wasPropertyExplicitlySet("overlappingStreams")) {
                this.overlappingStreams(model.getOverlappingStreams());
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

    /** List of streamSource OCIDs. */
    @com.fasterxml.jackson.annotation.JsonProperty("overlappingStreams")
    private final java.util.List<String> overlappingStreams;

    /**
     * List of streamSource OCIDs.
     *
     * @return the value
     */
    public java.util.List<String> getOverlappingStreams() {
        return overlappingStreams;
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
        sb.append("StreamGroupOverlap(");
        sb.append("super=").append(super.toString());
        sb.append("overlappingStreams=").append(String.valueOf(this.overlappingStreams));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamGroupOverlap)) {
            return false;
        }

        StreamGroupOverlap other = (StreamGroupOverlap) o;
        return java.util.Objects.equals(this.overlappingStreams, other.overlappingStreams)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.overlappingStreams == null
                                ? 43
                                : this.overlappingStreams.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
