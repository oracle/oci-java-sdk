/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For a flexible image and shape, the amount of memory supported for instances that use this image.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImageMemoryConstraints.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ImageMemoryConstraints
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"minInGBs", "maxInGBs"})
    public ImageMemoryConstraints(Integer minInGBs, Integer maxInGBs) {
        super();
        this.minInGBs = minInGBs;
        this.maxInGBs = maxInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The minimum amount of memory, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
        private Integer minInGBs;

        /**
         * The minimum amount of memory, in gigabytes.
         *
         * @param minInGBs the value to set
         * @return this builder
         */
        public Builder minInGBs(Integer minInGBs) {
            this.minInGBs = minInGBs;
            this.__explicitlySet__.add("minInGBs");
            return this;
        }
        /** The maximum amount of memory, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
        private Integer maxInGBs;

        /**
         * The maximum amount of memory, in gigabytes.
         *
         * @param maxInGBs the value to set
         * @return this builder
         */
        public Builder maxInGBs(Integer maxInGBs) {
            this.maxInGBs = maxInGBs;
            this.__explicitlySet__.add("maxInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageMemoryConstraints build() {
            ImageMemoryConstraints model = new ImageMemoryConstraints(this.minInGBs, this.maxInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageMemoryConstraints model) {
            if (model.wasPropertyExplicitlySet("minInGBs")) {
                this.minInGBs(model.getMinInGBs());
            }
            if (model.wasPropertyExplicitlySet("maxInGBs")) {
                this.maxInGBs(model.getMaxInGBs());
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

    /** The minimum amount of memory, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
    private final Integer minInGBs;

    /**
     * The minimum amount of memory, in gigabytes.
     *
     * @return the value
     */
    public Integer getMinInGBs() {
        return minInGBs;
    }

    /** The maximum amount of memory, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
    private final Integer maxInGBs;

    /**
     * The maximum amount of memory, in gigabytes.
     *
     * @return the value
     */
    public Integer getMaxInGBs() {
        return maxInGBs;
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
        sb.append("ImageMemoryConstraints(");
        sb.append("super=").append(super.toString());
        sb.append("minInGBs=").append(String.valueOf(this.minInGBs));
        sb.append(", maxInGBs=").append(String.valueOf(this.maxInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageMemoryConstraints)) {
            return false;
        }

        ImageMemoryConstraints other = (ImageMemoryConstraints) o;
        return java.util.Objects.equals(this.minInGBs, other.minInGBs)
                && java.util.Objects.equals(this.maxInGBs, other.maxInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minInGBs == null ? 43 : this.minInGBs.hashCode());
        result = (result * PRIME) + (this.maxInGBs == null ? 43 : this.maxInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
