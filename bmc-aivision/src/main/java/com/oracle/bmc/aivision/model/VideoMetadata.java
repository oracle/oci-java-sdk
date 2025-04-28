/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Video information. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VideoMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VideoMetadata extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"frameCount", "frameRate", "frameWidth", "frameHeight"})
    public VideoMetadata(
            Integer frameCount, Float frameRate, Integer frameWidth, Integer frameHeight) {
        super();
        this.frameCount = frameCount;
        this.frameRate = frameRate;
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of frames. */
        @com.fasterxml.jackson.annotation.JsonProperty("frameCount")
        private Integer frameCount;

        /**
         * Total number of frames.
         *
         * @param frameCount the value to set
         * @return this builder
         */
        public Builder frameCount(Integer frameCount) {
            this.frameCount = frameCount;
            this.__explicitlySet__.add("frameCount");
            return this;
        }
        /** Video framerate. */
        @com.fasterxml.jackson.annotation.JsonProperty("frameRate")
        private Float frameRate;

        /**
         * Video framerate.
         *
         * @param frameRate the value to set
         * @return this builder
         */
        public Builder frameRate(Float frameRate) {
            this.frameRate = frameRate;
            this.__explicitlySet__.add("frameRate");
            return this;
        }
        /** Width of each frame. */
        @com.fasterxml.jackson.annotation.JsonProperty("frameWidth")
        private Integer frameWidth;

        /**
         * Width of each frame.
         *
         * @param frameWidth the value to set
         * @return this builder
         */
        public Builder frameWidth(Integer frameWidth) {
            this.frameWidth = frameWidth;
            this.__explicitlySet__.add("frameWidth");
            return this;
        }
        /** Height of each frame. */
        @com.fasterxml.jackson.annotation.JsonProperty("frameHeight")
        private Integer frameHeight;

        /**
         * Height of each frame.
         *
         * @param frameHeight the value to set
         * @return this builder
         */
        public Builder frameHeight(Integer frameHeight) {
            this.frameHeight = frameHeight;
            this.__explicitlySet__.add("frameHeight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoMetadata build() {
            VideoMetadata model =
                    new VideoMetadata(
                            this.frameCount, this.frameRate, this.frameWidth, this.frameHeight);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoMetadata model) {
            if (model.wasPropertyExplicitlySet("frameCount")) {
                this.frameCount(model.getFrameCount());
            }
            if (model.wasPropertyExplicitlySet("frameRate")) {
                this.frameRate(model.getFrameRate());
            }
            if (model.wasPropertyExplicitlySet("frameWidth")) {
                this.frameWidth(model.getFrameWidth());
            }
            if (model.wasPropertyExplicitlySet("frameHeight")) {
                this.frameHeight(model.getFrameHeight());
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

    /** Total number of frames. */
    @com.fasterxml.jackson.annotation.JsonProperty("frameCount")
    private final Integer frameCount;

    /**
     * Total number of frames.
     *
     * @return the value
     */
    public Integer getFrameCount() {
        return frameCount;
    }

    /** Video framerate. */
    @com.fasterxml.jackson.annotation.JsonProperty("frameRate")
    private final Float frameRate;

    /**
     * Video framerate.
     *
     * @return the value
     */
    public Float getFrameRate() {
        return frameRate;
    }

    /** Width of each frame. */
    @com.fasterxml.jackson.annotation.JsonProperty("frameWidth")
    private final Integer frameWidth;

    /**
     * Width of each frame.
     *
     * @return the value
     */
    public Integer getFrameWidth() {
        return frameWidth;
    }

    /** Height of each frame. */
    @com.fasterxml.jackson.annotation.JsonProperty("frameHeight")
    private final Integer frameHeight;

    /**
     * Height of each frame.
     *
     * @return the value
     */
    public Integer getFrameHeight() {
        return frameHeight;
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
        sb.append("VideoMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("frameCount=").append(String.valueOf(this.frameCount));
        sb.append(", frameRate=").append(String.valueOf(this.frameRate));
        sb.append(", frameWidth=").append(String.valueOf(this.frameWidth));
        sb.append(", frameHeight=").append(String.valueOf(this.frameHeight));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoMetadata)) {
            return false;
        }

        VideoMetadata other = (VideoMetadata) o;
        return java.util.Objects.equals(this.frameCount, other.frameCount)
                && java.util.Objects.equals(this.frameRate, other.frameRate)
                && java.util.Objects.equals(this.frameWidth, other.frameWidth)
                && java.util.Objects.equals(this.frameHeight, other.frameHeight)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.frameCount == null ? 43 : this.frameCount.hashCode());
        result = (result * PRIME) + (this.frameRate == null ? 43 : this.frameRate.hashCode());
        result = (result * PRIME) + (this.frameWidth == null ? 43 : this.frameWidth.hashCode());
        result = (result * PRIME) + (this.frameHeight == null ? 43 : this.frameHeight.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
