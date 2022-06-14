/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Summary information for a compatible image and shape.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ImageShapeCompatibilitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImageShapeCompatibilitySummary {
    @Deprecated
    @java.beans.ConstructorProperties({"imageId", "shape", "memoryConstraints", "ocpuConstraints"})
    public ImageShapeCompatibilitySummary(
            String imageId,
            String shape,
            ImageMemoryConstraints memoryConstraints,
            ImageOcpuConstraints ocpuConstraints) {
        super();
        this.imageId = imageId;
        this.shape = shape;
        this.memoryConstraints = memoryConstraints;
        this.ocpuConstraints = ocpuConstraints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The image [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The image [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param imageId the value to set
         * @return this builder
         **/
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /**
         * The shape name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape name.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryConstraints")
        private ImageMemoryConstraints memoryConstraints;

        public Builder memoryConstraints(ImageMemoryConstraints memoryConstraints) {
            this.memoryConstraints = memoryConstraints;
            this.__explicitlySet__.add("memoryConstraints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuConstraints")
        private ImageOcpuConstraints ocpuConstraints;

        public Builder ocpuConstraints(ImageOcpuConstraints ocpuConstraints) {
            this.ocpuConstraints = ocpuConstraints;
            this.__explicitlySet__.add("ocpuConstraints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageShapeCompatibilitySummary build() {
            ImageShapeCompatibilitySummary __instance__ =
                    new ImageShapeCompatibilitySummary(
                            imageId, shape, memoryConstraints, ocpuConstraints);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageShapeCompatibilitySummary o) {
            Builder copiedBuilder =
                    imageId(o.getImageId())
                            .shape(o.getShape())
                            .memoryConstraints(o.getMemoryConstraints())
                            .ocpuConstraints(o.getOcpuConstraints());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The image [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The image [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getImageId() {
        return imageId;
    }

    /**
     * The shape name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape name.
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memoryConstraints")
    private final ImageMemoryConstraints memoryConstraints;

    public ImageMemoryConstraints getMemoryConstraints() {
        return memoryConstraints;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuConstraints")
    private final ImageOcpuConstraints ocpuConstraints;

    public ImageOcpuConstraints getOcpuConstraints() {
        return ocpuConstraints;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ImageShapeCompatibilitySummary(");
        sb.append("imageId=").append(String.valueOf(this.imageId));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", memoryConstraints=").append(String.valueOf(this.memoryConstraints));
        sb.append(", ocpuConstraints=").append(String.valueOf(this.ocpuConstraints));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageShapeCompatibilitySummary)) {
            return false;
        }

        ImageShapeCompatibilitySummary other = (ImageShapeCompatibilitySummary) o;
        return java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.memoryConstraints, other.memoryConstraints)
                && java.util.Objects.equals(this.ocpuConstraints, other.ocpuConstraints)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryConstraints == null ? 43 : this.memoryConstraints.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpuConstraints == null ? 43 : this.ocpuConstraints.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
