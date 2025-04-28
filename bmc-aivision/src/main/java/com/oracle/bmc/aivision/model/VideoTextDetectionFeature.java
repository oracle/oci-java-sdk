/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Video text detection feature <br>
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
        builder = VideoTextDetectionFeature.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "featureType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VideoTextDetectionFeature extends VideoFeature {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The minimum confidence score, between 0 and 1, when the value is set, results with lower
         * confidence will not be returned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minConfidence")
        private Float minConfidence;

        /**
         * The minimum confidence score, between 0 and 1, when the value is set, results with lower
         * confidence will not be returned.
         *
         * @param minConfidence the value to set
         * @return this builder
         */
        public Builder minConfidence(Float minConfidence) {
            this.minConfidence = minConfidence;
            this.__explicitlySet__.add("minConfidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoTextDetectionFeature build() {
            VideoTextDetectionFeature model = new VideoTextDetectionFeature(this.minConfidence);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoTextDetectionFeature model) {
            if (model.wasPropertyExplicitlySet("minConfidence")) {
                this.minConfidence(model.getMinConfidence());
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

    @Deprecated
    public VideoTextDetectionFeature(Float minConfidence) {
        super();
        this.minConfidence = minConfidence;
    }

    /**
     * The minimum confidence score, between 0 and 1, when the value is set, results with lower
     * confidence will not be returned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minConfidence")
    private final Float minConfidence;

    /**
     * The minimum confidence score, between 0 and 1, when the value is set, results with lower
     * confidence will not be returned.
     *
     * @return the value
     */
    public Float getMinConfidence() {
        return minConfidence;
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
        sb.append("VideoTextDetectionFeature(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", minConfidence=").append(String.valueOf(this.minConfidence));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoTextDetectionFeature)) {
            return false;
        }

        VideoTextDetectionFeature other = (VideoTextDetectionFeature) o;
        return java.util.Objects.equals(this.minConfidence, other.minConfidence)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.minConfidence == null ? 43 : this.minConfidence.hashCode());
        return result;
    }
}
