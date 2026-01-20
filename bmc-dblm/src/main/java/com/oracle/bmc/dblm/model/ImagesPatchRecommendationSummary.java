/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Summary of image patches recommended to install. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImagesPatchRecommendationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImagesPatchRecommendationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalImagesCount",
        "upToDateImagesCount",
        "imagePatchRecommendationsCount"
    })
    public ImagesPatchRecommendationSummary(
            Integer totalImagesCount,
            Integer upToDateImagesCount,
            Integer imagePatchRecommendationsCount) {
        super();
        this.totalImagesCount = totalImagesCount;
        this.upToDateImagesCount = upToDateImagesCount;
        this.imagePatchRecommendationsCount = imagePatchRecommendationsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of images. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalImagesCount")
        private Integer totalImagesCount;

        /**
         * Total number of images.
         *
         * @param totalImagesCount the value to set
         * @return this builder
         */
        public Builder totalImagesCount(Integer totalImagesCount) {
            this.totalImagesCount = totalImagesCount;
            this.__explicitlySet__.add("totalImagesCount");
            return this;
        }
        /** Total number of up to date images. */
        @com.fasterxml.jackson.annotation.JsonProperty("upToDateImagesCount")
        private Integer upToDateImagesCount;

        /**
         * Total number of up to date images.
         *
         * @param upToDateImagesCount the value to set
         * @return this builder
         */
        public Builder upToDateImagesCount(Integer upToDateImagesCount) {
            this.upToDateImagesCount = upToDateImagesCount;
            this.__explicitlySet__.add("upToDateImagesCount");
            return this;
        }
        /** Total number of patch recommendations available. */
        @com.fasterxml.jackson.annotation.JsonProperty("imagePatchRecommendationsCount")
        private Integer imagePatchRecommendationsCount;

        /**
         * Total number of patch recommendations available.
         *
         * @param imagePatchRecommendationsCount the value to set
         * @return this builder
         */
        public Builder imagePatchRecommendationsCount(Integer imagePatchRecommendationsCount) {
            this.imagePatchRecommendationsCount = imagePatchRecommendationsCount;
            this.__explicitlySet__.add("imagePatchRecommendationsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImagesPatchRecommendationSummary build() {
            ImagesPatchRecommendationSummary model =
                    new ImagesPatchRecommendationSummary(
                            this.totalImagesCount,
                            this.upToDateImagesCount,
                            this.imagePatchRecommendationsCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImagesPatchRecommendationSummary model) {
            if (model.wasPropertyExplicitlySet("totalImagesCount")) {
                this.totalImagesCount(model.getTotalImagesCount());
            }
            if (model.wasPropertyExplicitlySet("upToDateImagesCount")) {
                this.upToDateImagesCount(model.getUpToDateImagesCount());
            }
            if (model.wasPropertyExplicitlySet("imagePatchRecommendationsCount")) {
                this.imagePatchRecommendationsCount(model.getImagePatchRecommendationsCount());
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

    /** Total number of images. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalImagesCount")
    private final Integer totalImagesCount;

    /**
     * Total number of images.
     *
     * @return the value
     */
    public Integer getTotalImagesCount() {
        return totalImagesCount;
    }

    /** Total number of up to date images. */
    @com.fasterxml.jackson.annotation.JsonProperty("upToDateImagesCount")
    private final Integer upToDateImagesCount;

    /**
     * Total number of up to date images.
     *
     * @return the value
     */
    public Integer getUpToDateImagesCount() {
        return upToDateImagesCount;
    }

    /** Total number of patch recommendations available. */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePatchRecommendationsCount")
    private final Integer imagePatchRecommendationsCount;

    /**
     * Total number of patch recommendations available.
     *
     * @return the value
     */
    public Integer getImagePatchRecommendationsCount() {
        return imagePatchRecommendationsCount;
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
        sb.append("ImagesPatchRecommendationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("totalImagesCount=").append(String.valueOf(this.totalImagesCount));
        sb.append(", upToDateImagesCount=").append(String.valueOf(this.upToDateImagesCount));
        sb.append(", imagePatchRecommendationsCount=")
                .append(String.valueOf(this.imagePatchRecommendationsCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImagesPatchRecommendationSummary)) {
            return false;
        }

        ImagesPatchRecommendationSummary other = (ImagesPatchRecommendationSummary) o;
        return java.util.Objects.equals(this.totalImagesCount, other.totalImagesCount)
                && java.util.Objects.equals(this.upToDateImagesCount, other.upToDateImagesCount)
                && java.util.Objects.equals(
                        this.imagePatchRecommendationsCount, other.imagePatchRecommendationsCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalImagesCount == null ? 43 : this.totalImagesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.upToDateImagesCount == null
                                ? 43
                                : this.upToDateImagesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.imagePatchRecommendationsCount == null
                                ? 43
                                : this.imagePatchRecommendationsCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
