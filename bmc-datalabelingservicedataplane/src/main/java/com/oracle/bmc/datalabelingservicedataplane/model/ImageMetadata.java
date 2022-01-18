/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImageMetadata.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "recordType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ImageMetadata extends RecordMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("height")
        private Integer height;

        public Builder height(Integer height) {
            this.height = height;
            this.__explicitlySet__.add("height");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("width")
        private Integer width;

        public Builder width(Integer width) {
            this.width = width;
            this.__explicitlySet__.add("width");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("depth")
        private Integer depth;

        public Builder depth(Integer depth) {
            this.depth = depth;
            this.__explicitlySet__.add("depth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageMetadata build() {
            ImageMetadata __instance__ = new ImageMetadata(height, width, depth);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageMetadata o) {
            Builder copiedBuilder = height(o.getHeight()).width(o.getWidth()).depth(o.getDepth());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
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
    Integer height;

    /**
     * Width of the image record.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("width")
    Integer width;

    /**
     * Depth of the image record.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("depth")
    Integer depth;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
