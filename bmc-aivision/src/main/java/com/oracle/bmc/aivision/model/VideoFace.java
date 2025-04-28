/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Detected face in a video. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VideoFace.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VideoFace extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"segments"})
    public VideoFace(java.util.List<VideoFaceSegment> segments) {
        super();
        this.segments = segments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Face segments in a video. */
        @com.fasterxml.jackson.annotation.JsonProperty("segments")
        private java.util.List<VideoFaceSegment> segments;

        /**
         * Face segments in a video.
         *
         * @param segments the value to set
         * @return this builder
         */
        public Builder segments(java.util.List<VideoFaceSegment> segments) {
            this.segments = segments;
            this.__explicitlySet__.add("segments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoFace build() {
            VideoFace model = new VideoFace(this.segments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoFace model) {
            if (model.wasPropertyExplicitlySet("segments")) {
                this.segments(model.getSegments());
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

    /** Face segments in a video. */
    @com.fasterxml.jackson.annotation.JsonProperty("segments")
    private final java.util.List<VideoFaceSegment> segments;

    /**
     * Face segments in a video.
     *
     * @return the value
     */
    public java.util.List<VideoFaceSegment> getSegments() {
        return segments;
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
        sb.append("VideoFace(");
        sb.append("super=").append(super.toString());
        sb.append("segments=").append(String.valueOf(this.segments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoFace)) {
            return false;
        }

        VideoFace other = (VideoFace) o;
        return java.util.Objects.equals(this.segments, other.segments) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.segments == null ? 43 : this.segments.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
