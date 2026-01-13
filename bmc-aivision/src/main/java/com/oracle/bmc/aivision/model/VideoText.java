/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Detected text in a video. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VideoText.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VideoText extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"text", "segments"})
    public VideoText(String text, java.util.List<VideoTextSegment> segments) {
        super();
        this.text = text;
        this.segments = segments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Detected text. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * Detected text.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** Text segments in a video. */
        @com.fasterxml.jackson.annotation.JsonProperty("segments")
        private java.util.List<VideoTextSegment> segments;

        /**
         * Text segments in a video.
         *
         * @param segments the value to set
         * @return this builder
         */
        public Builder segments(java.util.List<VideoTextSegment> segments) {
            this.segments = segments;
            this.__explicitlySet__.add("segments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoText build() {
            VideoText model = new VideoText(this.text, this.segments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoText model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
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

    /** Detected text. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * Detected text.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** Text segments in a video. */
    @com.fasterxml.jackson.annotation.JsonProperty("segments")
    private final java.util.List<VideoTextSegment> segments;

    /**
     * Text segments in a video.
     *
     * @return the value
     */
    public java.util.List<VideoTextSegment> getSegments() {
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
        sb.append("VideoText(");
        sb.append("super=").append(super.toString());
        sb.append("text=").append(String.valueOf(this.text));
        sb.append(", segments=").append(String.valueOf(this.segments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoText)) {
            return false;
        }

        VideoText other = (VideoText) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.segments, other.segments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.segments == null ? 43 : this.segments.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
