/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * An object segment in a video. <br>
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
        builder = VideoObjectSegment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VideoObjectSegment
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"videoSegment", "confidence", "frames"})
    public VideoObjectSegment(
            VideoSegment videoSegment, Float confidence, java.util.List<VideoObjectFrame> frames) {
        super();
        this.videoSegment = videoSegment;
        this.confidence = confidence;
        this.frames = frames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("videoSegment")
        private VideoSegment videoSegment;

        public Builder videoSegment(VideoSegment videoSegment) {
            this.videoSegment = videoSegment;
            this.__explicitlySet__.add("videoSegment");
            return this;
        }
        /** The confidence score, between 0 and 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        /**
         * The confidence score, between 0 and 1.
         *
         * @param confidence the value to set
         * @return this builder
         */
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }
        /** Object frame in a segment. */
        @com.fasterxml.jackson.annotation.JsonProperty("frames")
        private java.util.List<VideoObjectFrame> frames;

        /**
         * Object frame in a segment.
         *
         * @param frames the value to set
         * @return this builder
         */
        public Builder frames(java.util.List<VideoObjectFrame> frames) {
            this.frames = frames;
            this.__explicitlySet__.add("frames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoObjectSegment build() {
            VideoObjectSegment model =
                    new VideoObjectSegment(this.videoSegment, this.confidence, this.frames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoObjectSegment model) {
            if (model.wasPropertyExplicitlySet("videoSegment")) {
                this.videoSegment(model.getVideoSegment());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("frames")) {
                this.frames(model.getFrames());
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

    @com.fasterxml.jackson.annotation.JsonProperty("videoSegment")
    private final VideoSegment videoSegment;

    public VideoSegment getVideoSegment() {
        return videoSegment;
    }

    /** The confidence score, between 0 and 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * The confidence score, between 0 and 1.
     *
     * @return the value
     */
    public Float getConfidence() {
        return confidence;
    }

    /** Object frame in a segment. */
    @com.fasterxml.jackson.annotation.JsonProperty("frames")
    private final java.util.List<VideoObjectFrame> frames;

    /**
     * Object frame in a segment.
     *
     * @return the value
     */
    public java.util.List<VideoObjectFrame> getFrames() {
        return frames;
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
        sb.append("VideoObjectSegment(");
        sb.append("super=").append(super.toString());
        sb.append("videoSegment=").append(String.valueOf(this.videoSegment));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", frames=").append(String.valueOf(this.frames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoObjectSegment)) {
            return false;
        }

        VideoObjectSegment other = (VideoObjectSegment) o;
        return java.util.Objects.equals(this.videoSegment, other.videoSegment)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.frames, other.frames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.videoSegment == null ? 43 : this.videoSegment.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result = (result * PRIME) + (this.frames == null ? 43 : this.frames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
