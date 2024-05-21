/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * For a flexible shape, the amount of memory available for container instances that use this shape.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ShapeMemoryOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShapeMemoryOptions extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "minInGBs",
        "maxInGBs",
        "defaultPerOcpuInGBs",
        "minPerOcpuInGBs",
        "maxPerOcpuInGBs"
    })
    public ShapeMemoryOptions(
            Float minInGBs,
            Float maxInGBs,
            Float defaultPerOcpuInGBs,
            Float minPerOcpuInGBs,
            Float maxPerOcpuInGBs) {
        super();
        this.minInGBs = minInGBs;
        this.maxInGBs = maxInGBs;
        this.defaultPerOcpuInGBs = defaultPerOcpuInGBs;
        this.minPerOcpuInGBs = minPerOcpuInGBs;
        this.maxPerOcpuInGBs = maxPerOcpuInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The minimum amount of memory (GB).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
        private Float minInGBs;

        /**
         * The minimum amount of memory (GB).
         *
         * @param minInGBs the value to set
         * @return this builder
         **/
        public Builder minInGBs(Float minInGBs) {
            this.minInGBs = minInGBs;
            this.__explicitlySet__.add("minInGBs");
            return this;
        }
        /**
         * The maximum amount of memory (GB).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
        private Float maxInGBs;

        /**
         * The maximum amount of memory (GB).
         *
         * @param maxInGBs the value to set
         * @return this builder
         **/
        public Builder maxInGBs(Float maxInGBs) {
            this.maxInGBs = maxInGBs;
            this.__explicitlySet__.add("maxInGBs");
            return this;
        }
        /**
         * The default amount of memory per OCPU available for this shape (GB).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGBs")
        private Float defaultPerOcpuInGBs;

        /**
         * The default amount of memory per OCPU available for this shape (GB).
         *
         * @param defaultPerOcpuInGBs the value to set
         * @return this builder
         **/
        public Builder defaultPerOcpuInGBs(Float defaultPerOcpuInGBs) {
            this.defaultPerOcpuInGBs = defaultPerOcpuInGBs;
            this.__explicitlySet__.add("defaultPerOcpuInGBs");
            return this;
        }
        /**
         * The minimum amount of memory per OCPU available for this shape (GB).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minPerOcpuInGBs")
        private Float minPerOcpuInGBs;

        /**
         * The minimum amount of memory per OCPU available for this shape (GB).
         *
         * @param minPerOcpuInGBs the value to set
         * @return this builder
         **/
        public Builder minPerOcpuInGBs(Float minPerOcpuInGBs) {
            this.minPerOcpuInGBs = minPerOcpuInGBs;
            this.__explicitlySet__.add("minPerOcpuInGBs");
            return this;
        }
        /**
         * The maximum amount of memory per OCPU available for this shape (GB).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxPerOcpuInGBs")
        private Float maxPerOcpuInGBs;

        /**
         * The maximum amount of memory per OCPU available for this shape (GB).
         *
         * @param maxPerOcpuInGBs the value to set
         * @return this builder
         **/
        public Builder maxPerOcpuInGBs(Float maxPerOcpuInGBs) {
            this.maxPerOcpuInGBs = maxPerOcpuInGBs;
            this.__explicitlySet__.add("maxPerOcpuInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeMemoryOptions build() {
            ShapeMemoryOptions model =
                    new ShapeMemoryOptions(
                            this.minInGBs,
                            this.maxInGBs,
                            this.defaultPerOcpuInGBs,
                            this.minPerOcpuInGBs,
                            this.maxPerOcpuInGBs);
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
            if (model.wasPropertyExplicitlySet("defaultPerOcpuInGBs")) {
                this.defaultPerOcpuInGBs(model.getDefaultPerOcpuInGBs());
            }
            if (model.wasPropertyExplicitlySet("minPerOcpuInGBs")) {
                this.minPerOcpuInGBs(model.getMinPerOcpuInGBs());
            }
            if (model.wasPropertyExplicitlySet("maxPerOcpuInGBs")) {
                this.maxPerOcpuInGBs(model.getMaxPerOcpuInGBs());
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
     * The minimum amount of memory (GB).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
    private final Float minInGBs;

    /**
     * The minimum amount of memory (GB).
     *
     * @return the value
     **/
    public Float getMinInGBs() {
        return minInGBs;
    }

    /**
     * The maximum amount of memory (GB).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
    private final Float maxInGBs;

    /**
     * The maximum amount of memory (GB).
     *
     * @return the value
     **/
    public Float getMaxInGBs() {
        return maxInGBs;
    }

    /**
     * The default amount of memory per OCPU available for this shape (GB).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGBs")
    private final Float defaultPerOcpuInGBs;

    /**
     * The default amount of memory per OCPU available for this shape (GB).
     *
     * @return the value
     **/
    public Float getDefaultPerOcpuInGBs() {
        return defaultPerOcpuInGBs;
    }

    /**
     * The minimum amount of memory per OCPU available for this shape (GB).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minPerOcpuInGBs")
    private final Float minPerOcpuInGBs;

    /**
     * The minimum amount of memory per OCPU available for this shape (GB).
     *
     * @return the value
     **/
    public Float getMinPerOcpuInGBs() {
        return minPerOcpuInGBs;
    }

    /**
     * The maximum amount of memory per OCPU available for this shape (GB).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxPerOcpuInGBs")
    private final Float maxPerOcpuInGBs;

    /**
     * The maximum amount of memory per OCPU available for this shape (GB).
     *
     * @return the value
     **/
    public Float getMaxPerOcpuInGBs() {
        return maxPerOcpuInGBs;
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
        sb.append("ShapeMemoryOptions(");
        sb.append("super=").append(super.toString());
        sb.append("minInGBs=").append(String.valueOf(this.minInGBs));
        sb.append(", maxInGBs=").append(String.valueOf(this.maxInGBs));
        sb.append(", defaultPerOcpuInGBs=").append(String.valueOf(this.defaultPerOcpuInGBs));
        sb.append(", minPerOcpuInGBs=").append(String.valueOf(this.minPerOcpuInGBs));
        sb.append(", maxPerOcpuInGBs=").append(String.valueOf(this.maxPerOcpuInGBs));
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
                && java.util.Objects.equals(this.defaultPerOcpuInGBs, other.defaultPerOcpuInGBs)
                && java.util.Objects.equals(this.minPerOcpuInGBs, other.minPerOcpuInGBs)
                && java.util.Objects.equals(this.maxPerOcpuInGBs, other.maxPerOcpuInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minInGBs == null ? 43 : this.minInGBs.hashCode());
        result = (result * PRIME) + (this.maxInGBs == null ? 43 : this.maxInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultPerOcpuInGBs == null
                                ? 43
                                : this.defaultPerOcpuInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.minPerOcpuInGBs == null ? 43 : this.minPerOcpuInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxPerOcpuInGBs == null ? 43 : this.maxPerOcpuInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
