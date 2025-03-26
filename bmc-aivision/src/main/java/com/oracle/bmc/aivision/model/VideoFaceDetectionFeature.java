/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Video face detection feature
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VideoFaceDetectionFeature.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "featureType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VideoFaceDetectionFeature extends VideoFeature {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum number of results per frame to return.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxResults")
        private Integer maxResults;

        /**
         * The maximum number of results per frame to return.
         * @param maxResults the value to set
         * @return this builder
         **/
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            this.__explicitlySet__.add("maxResults");
            return this;
        }
        /**
         * Whether or not return face landmarks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLandmarkRequired")
        private Boolean isLandmarkRequired;

        /**
         * Whether or not return face landmarks.
         * @param isLandmarkRequired the value to set
         * @return this builder
         **/
        public Builder isLandmarkRequired(Boolean isLandmarkRequired) {
            this.isLandmarkRequired = isLandmarkRequired;
            this.__explicitlySet__.add("isLandmarkRequired");
            return this;
        }
        /**
         * The minimum confidence score, between 0 and 1,
         * when the value is set, results with lower confidence will not be returned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minConfidence")
        private Float minConfidence;

        /**
         * The minimum confidence score, between 0 and 1,
         * when the value is set, results with lower confidence will not be returned.
         *
         * @param minConfidence the value to set
         * @return this builder
         **/
        public Builder minConfidence(Float minConfidence) {
            this.minConfidence = minConfidence;
            this.__explicitlySet__.add("minConfidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoFaceDetectionFeature build() {
            VideoFaceDetectionFeature model =
                    new VideoFaceDetectionFeature(
                            this.maxResults, this.isLandmarkRequired, this.minConfidence);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoFaceDetectionFeature model) {
            if (model.wasPropertyExplicitlySet("maxResults")) {
                this.maxResults(model.getMaxResults());
            }
            if (model.wasPropertyExplicitlySet("isLandmarkRequired")) {
                this.isLandmarkRequired(model.getIsLandmarkRequired());
            }
            if (model.wasPropertyExplicitlySet("minConfidence")) {
                this.minConfidence(model.getMinConfidence());
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

    @Deprecated
    public VideoFaceDetectionFeature(
            Integer maxResults, Boolean isLandmarkRequired, Float minConfidence) {
        super();
        this.maxResults = maxResults;
        this.isLandmarkRequired = isLandmarkRequired;
        this.minConfidence = minConfidence;
    }

    /**
     * The maximum number of results per frame to return.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxResults")
    private final Integer maxResults;

    /**
     * The maximum number of results per frame to return.
     * @return the value
     **/
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Whether or not return face landmarks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLandmarkRequired")
    private final Boolean isLandmarkRequired;

    /**
     * Whether or not return face landmarks.
     * @return the value
     **/
    public Boolean getIsLandmarkRequired() {
        return isLandmarkRequired;
    }

    /**
     * The minimum confidence score, between 0 and 1,
     * when the value is set, results with lower confidence will not be returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minConfidence")
    private final Float minConfidence;

    /**
     * The minimum confidence score, between 0 and 1,
     * when the value is set, results with lower confidence will not be returned.
     *
     * @return the value
     **/
    public Float getMinConfidence() {
        return minConfidence;
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
        sb.append("VideoFaceDetectionFeature(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", maxResults=").append(String.valueOf(this.maxResults));
        sb.append(", isLandmarkRequired=").append(String.valueOf(this.isLandmarkRequired));
        sb.append(", minConfidence=").append(String.valueOf(this.minConfidence));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoFaceDetectionFeature)) {
            return false;
        }

        VideoFaceDetectionFeature other = (VideoFaceDetectionFeature) o;
        return java.util.Objects.equals(this.maxResults, other.maxResults)
                && java.util.Objects.equals(this.isLandmarkRequired, other.isLandmarkRequired)
                && java.util.Objects.equals(this.minConfidence, other.minConfidence)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result =
                (result * PRIME)
                        + (this.isLandmarkRequired == null
                                ? 43
                                : this.isLandmarkRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.minConfidence == null ? 43 : this.minConfidence.hashCode());
        return result;
    }
}
