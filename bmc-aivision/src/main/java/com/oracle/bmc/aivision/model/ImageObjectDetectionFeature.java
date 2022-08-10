/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The object detection parameters.
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
    builder = ImageObjectDetectionFeature.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "featureType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImageObjectDetectionFeature extends ImageFeature {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum number of results to return.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxResults")
        private Integer maxResults;

        /**
         * The maximum number of results to return.
         * @param maxResults the value to set
         * @return this builder
         **/
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            this.__explicitlySet__.add("maxResults");
            return this;
        }
        /**
         * The custom model ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * The custom model ID.
         * @param modelId the value to set
         * @return this builder
         **/
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageObjectDetectionFeature build() {
            ImageObjectDetectionFeature model =
                    new ImageObjectDetectionFeature(this.maxResults, this.modelId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageObjectDetectionFeature model) {
            if (model.wasPropertyExplicitlySet("maxResults")) {
                this.maxResults(model.getMaxResults());
            }
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
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
    public ImageObjectDetectionFeature(Integer maxResults, String modelId) {
        super();
        this.maxResults = maxResults;
        this.modelId = modelId;
    }

    /**
     * The maximum number of results to return.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxResults")
    private final Integer maxResults;

    /**
     * The maximum number of results to return.
     * @return the value
     **/
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * The custom model ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * The custom model ID.
     * @return the value
     **/
    public String getModelId() {
        return modelId;
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
        sb.append("ImageObjectDetectionFeature(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", maxResults=").append(String.valueOf(this.maxResults));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageObjectDetectionFeature)) {
            return false;
        }

        ImageObjectDetectionFeature other = (ImageObjectDetectionFeature) o;
        return java.util.Objects.equals(this.maxResults, other.maxResults)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        return result;
    }
}
