/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * A sequence of frames that was (or appears to be) continuously captured for a label/object/text?.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VideoSegment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VideoSegment extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"startTimeOffsetMs", "endTimeOffsetMs"})
    public VideoSegment(Integer startTimeOffsetMs, Integer endTimeOffsetMs) {
        super();
        this.startTimeOffsetMs = startTimeOffsetMs;
        this.endTimeOffsetMs = endTimeOffsetMs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Video start time offset(Milliseconds).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTimeOffsetMs")
        private Integer startTimeOffsetMs;

        /**
         * Video start time offset(Milliseconds).
         * @param startTimeOffsetMs the value to set
         * @return this builder
         **/
        public Builder startTimeOffsetMs(Integer startTimeOffsetMs) {
            this.startTimeOffsetMs = startTimeOffsetMs;
            this.__explicitlySet__.add("startTimeOffsetMs");
            return this;
        }
        /**
         * Video end time offset(Milliseconds).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTimeOffsetMs")
        private Integer endTimeOffsetMs;

        /**
         * Video end time offset(Milliseconds).
         * @param endTimeOffsetMs the value to set
         * @return this builder
         **/
        public Builder endTimeOffsetMs(Integer endTimeOffsetMs) {
            this.endTimeOffsetMs = endTimeOffsetMs;
            this.__explicitlySet__.add("endTimeOffsetMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoSegment build() {
            VideoSegment model = new VideoSegment(this.startTimeOffsetMs, this.endTimeOffsetMs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoSegment model) {
            if (model.wasPropertyExplicitlySet("startTimeOffsetMs")) {
                this.startTimeOffsetMs(model.getStartTimeOffsetMs());
            }
            if (model.wasPropertyExplicitlySet("endTimeOffsetMs")) {
                this.endTimeOffsetMs(model.getEndTimeOffsetMs());
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
     * Video start time offset(Milliseconds).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeOffsetMs")
    private final Integer startTimeOffsetMs;

    /**
     * Video start time offset(Milliseconds).
     * @return the value
     **/
    public Integer getStartTimeOffsetMs() {
        return startTimeOffsetMs;
    }

    /**
     * Video end time offset(Milliseconds).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeOffsetMs")
    private final Integer endTimeOffsetMs;

    /**
     * Video end time offset(Milliseconds).
     * @return the value
     **/
    public Integer getEndTimeOffsetMs() {
        return endTimeOffsetMs;
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
        sb.append("VideoSegment(");
        sb.append("super=").append(super.toString());
        sb.append("startTimeOffsetMs=").append(String.valueOf(this.startTimeOffsetMs));
        sb.append(", endTimeOffsetMs=").append(String.valueOf(this.endTimeOffsetMs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoSegment)) {
            return false;
        }

        VideoSegment other = (VideoSegment) o;
        return java.util.Objects.equals(this.startTimeOffsetMs, other.startTimeOffsetMs)
                && java.util.Objects.equals(this.endTimeOffsetMs, other.endTimeOffsetMs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.startTimeOffsetMs == null ? 43 : this.startTimeOffsetMs.hashCode());
        result =
                (result * PRIME)
                        + (this.endTimeOffsetMs == null ? 43 : this.endTimeOffsetMs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
