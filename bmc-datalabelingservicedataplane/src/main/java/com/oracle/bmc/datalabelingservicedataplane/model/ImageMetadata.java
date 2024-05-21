/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * Collection of metadata related to image record.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImageMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "recordType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImageMetadata extends RecordMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Height of the image record.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("height")
        private Integer height;

        /**
         * Height of the image record.
         * @param height the value to set
         * @return this builder
         **/
        public Builder height(Integer height) {
            this.height = height;
            this.__explicitlySet__.add("height");
            return this;
        }
        /**
         * Width of the image record.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("width")
        private Integer width;

        /**
         * Width of the image record.
         * @param width the value to set
         * @return this builder
         **/
        public Builder width(Integer width) {
            this.width = width;
            this.__explicitlySet__.add("width");
            return this;
        }
        /**
         * Depth of the image record.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("depth")
        private Integer depth;

        /**
         * Depth of the image record.
         * @param depth the value to set
         * @return this builder
         **/
        public Builder depth(Integer depth) {
            this.depth = depth;
            this.__explicitlySet__.add("depth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageMetadata build() {
            ImageMetadata model = new ImageMetadata(this.height, this.width, this.depth);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageMetadata model) {
            if (model.wasPropertyExplicitlySet("height")) {
                this.height(model.getHeight());
            }
            if (model.wasPropertyExplicitlySet("width")) {
                this.width(model.getWidth());
            }
            if (model.wasPropertyExplicitlySet("depth")) {
                this.depth(model.getDepth());
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
    public ImageMetadata(Integer height, Integer width, Integer depth) {
        super();
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    /**
     * Height of the image record.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("height")
    private final Integer height;

    /**
     * Height of the image record.
     * @return the value
     **/
    public Integer getHeight() {
        return height;
    }

    /**
     * Width of the image record.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("width")
    private final Integer width;

    /**
     * Width of the image record.
     * @return the value
     **/
    public Integer getWidth() {
        return width;
    }

    /**
     * Depth of the image record.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("depth")
    private final Integer depth;

    /**
     * Depth of the image record.
     * @return the value
     **/
    public Integer getDepth() {
        return depth;
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
        sb.append("ImageMetadata(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", height=").append(String.valueOf(this.height));
        sb.append(", width=").append(String.valueOf(this.width));
        sb.append(", depth=").append(String.valueOf(this.depth));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageMetadata)) {
            return false;
        }

        ImageMetadata other = (ImageMetadata) o;
        return java.util.Objects.equals(this.height, other.height)
                && java.util.Objects.equals(this.width, other.width)
                && java.util.Objects.equals(this.depth, other.depth)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.height == null ? 43 : this.height.hashCode());
        result = (result * PRIME) + (this.width == null ? 43 : this.width.hashCode());
        result = (result * PRIME) + (this.depth == null ? 43 : this.depth.hashCode());
        return result;
    }
}
