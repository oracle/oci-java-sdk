/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Options for the the shape memory <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ShapeMemoryOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShapeMemoryOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"minInGBs", "maxInGBs"})
    public ShapeMemoryOptions(Float minInGBs, Float maxInGBs) {
        super();
        this.minInGBs = minInGBs;
        this.maxInGBs = maxInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Minimum Memory configuration in GBs */
        @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
        private Float minInGBs;

        /**
         * Minimum Memory configuration in GBs
         *
         * @param minInGBs the value to set
         * @return this builder
         */
        public Builder minInGBs(Float minInGBs) {
            this.minInGBs = minInGBs;
            this.__explicitlySet__.add("minInGBs");
            return this;
        }
        /** Maximum Memory configuration in GBs */
        @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
        private Float maxInGBs;

        /**
         * Maximum Memory configuration in GBs
         *
         * @param maxInGBs the value to set
         * @return this builder
         */
        public Builder maxInGBs(Float maxInGBs) {
            this.maxInGBs = maxInGBs;
            this.__explicitlySet__.add("maxInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeMemoryOptions build() {
            ShapeMemoryOptions model = new ShapeMemoryOptions(this.minInGBs, this.maxInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeMemoryOptions model) {
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

    /** Minimum Memory configuration in GBs */
    @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
    private final Float minInGBs;

    /**
     * Minimum Memory configuration in GBs
     *
     * @return the value
     */
    public Float getMinInGBs() {
        return minInGBs;
    }

    /** Maximum Memory configuration in GBs */
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
    private final Float maxInGBs;

    /**
     * Maximum Memory configuration in GBs
     *
     * @return the value
     */
    public Float getMaxInGBs() {
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
        sb.append("ShapeMemoryOptions(");
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
        if (!(o instanceof ShapeMemoryOptions)) {
            return false;
        }

        ShapeMemoryOptions other = (ShapeMemoryOptions) o;
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
