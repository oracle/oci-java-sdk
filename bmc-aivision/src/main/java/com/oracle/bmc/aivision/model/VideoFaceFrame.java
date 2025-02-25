/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * A face frame.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VideoFaceFrame.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VideoFaceFrame extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeOffsetMs",
        "confidence",
        "qualityScore",
        "boundingPolygon",
        "landmarks"
    })
    public VideoFaceFrame(
            Integer timeOffsetMs,
            Float confidence,
            Float qualityScore,
            BoundingPolygon boundingPolygon,
            java.util.List<Landmark> landmarks) {
        super();
        this.timeOffsetMs = timeOffsetMs;
        this.confidence = confidence;
        this.qualityScore = qualityScore;
        this.boundingPolygon = boundingPolygon;
        this.landmarks = landmarks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Time offset(Milliseconds) in the video.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOffsetMs")
        private Integer timeOffsetMs;

        /**
         * Time offset(Milliseconds) in the video.
         * @param timeOffsetMs the value to set
         * @return this builder
         **/
        public Builder timeOffsetMs(Integer timeOffsetMs) {
            this.timeOffsetMs = timeOffsetMs;
            this.__explicitlySet__.add("timeOffsetMs");
            return this;
        }
        /**
         * The confidence score, between 0 and 1.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        /**
         * The confidence score, between 0 and 1.
         * @param confidence the value to set
         * @return this builder
         **/
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }
        /**
         * The quality score of the face detected, between 0 and 1.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("qualityScore")
        private Float qualityScore;

        /**
         * The quality score of the face detected, between 0 and 1.
         * @param qualityScore the value to set
         * @return this builder
         **/
        public Builder qualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            this.__explicitlySet__.add("qualityScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
        private BoundingPolygon boundingPolygon;

        public Builder boundingPolygon(BoundingPolygon boundingPolygon) {
            this.boundingPolygon = boundingPolygon;
            this.__explicitlySet__.add("boundingPolygon");
            return this;
        }
        /**
         * Face landmarks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("landmarks")
        private java.util.List<Landmark> landmarks;

        /**
         * Face landmarks.
         * @param landmarks the value to set
         * @return this builder
         **/
        public Builder landmarks(java.util.List<Landmark> landmarks) {
            this.landmarks = landmarks;
            this.__explicitlySet__.add("landmarks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoFaceFrame build() {
            VideoFaceFrame model =
                    new VideoFaceFrame(
                            this.timeOffsetMs,
                            this.confidence,
                            this.qualityScore,
                            this.boundingPolygon,
                            this.landmarks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoFaceFrame model) {
            if (model.wasPropertyExplicitlySet("timeOffsetMs")) {
                this.timeOffsetMs(model.getTimeOffsetMs());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("qualityScore")) {
                this.qualityScore(model.getQualityScore());
            }
            if (model.wasPropertyExplicitlySet("boundingPolygon")) {
                this.boundingPolygon(model.getBoundingPolygon());
            }
            if (model.wasPropertyExplicitlySet("landmarks")) {
                this.landmarks(model.getLandmarks());
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
     * Time offset(Milliseconds) in the video.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOffsetMs")
    private final Integer timeOffsetMs;

    /**
     * Time offset(Milliseconds) in the video.
     * @return the value
     **/
    public Integer getTimeOffsetMs() {
        return timeOffsetMs;
    }

    /**
     * The confidence score, between 0 and 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * The confidence score, between 0 and 1.
     * @return the value
     **/
    public Float getConfidence() {
        return confidence;
    }

    /**
     * The quality score of the face detected, between 0 and 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("qualityScore")
    private final Float qualityScore;

    /**
     * The quality score of the face detected, between 0 and 1.
     * @return the value
     **/
    public Float getQualityScore() {
        return qualityScore;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
    private final BoundingPolygon boundingPolygon;

    public BoundingPolygon getBoundingPolygon() {
        return boundingPolygon;
    }

    /**
     * Face landmarks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("landmarks")
    private final java.util.List<Landmark> landmarks;

    /**
     * Face landmarks.
     * @return the value
     **/
    public java.util.List<Landmark> getLandmarks() {
        return landmarks;
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
        sb.append("VideoFaceFrame(");
        sb.append("super=").append(super.toString());
        sb.append("timeOffsetMs=").append(String.valueOf(this.timeOffsetMs));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", qualityScore=").append(String.valueOf(this.qualityScore));
        sb.append(", boundingPolygon=").append(String.valueOf(this.boundingPolygon));
        sb.append(", landmarks=").append(String.valueOf(this.landmarks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoFaceFrame)) {
            return false;
        }

        VideoFaceFrame other = (VideoFaceFrame) o;
        return java.util.Objects.equals(this.timeOffsetMs, other.timeOffsetMs)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.qualityScore, other.qualityScore)
                && java.util.Objects.equals(this.boundingPolygon, other.boundingPolygon)
                && java.util.Objects.equals(this.landmarks, other.landmarks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeOffsetMs == null ? 43 : this.timeOffsetMs.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result = (result * PRIME) + (this.qualityScore == null ? 43 : this.qualityScore.hashCode());
        result =
                (result * PRIME)
                        + (this.boundingPolygon == null ? 43 : this.boundingPolygon.hashCode());
        result = (result * PRIME) + (this.landmarks == null ? 43 : this.landmarks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
