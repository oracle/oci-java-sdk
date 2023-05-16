/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For a flexible shape, the amount of memory available for instances that use this shape.
 *
 * <p>If this field is null, then this shape has a fixed amount of memory equivalent to {@code
 * memoryInGBs}. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ShapeMemoryOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShapeMemoryOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "minInGBs",
        "maxInGBs",
        "defaultPerOcpuInGBs",
        "minPerOcpuInGBs",
        "maxPerOcpuInGBs",
        "maxPerNumaNodeInGBs"
    })
    public ShapeMemoryOptions(
            Float minInGBs,
            Float maxInGBs,
            Float defaultPerOcpuInGBs,
            Float minPerOcpuInGBs,
            Float maxPerOcpuInGBs,
            Float maxPerNumaNodeInGBs) {
        super();
        this.minInGBs = minInGBs;
        this.maxInGBs = maxInGBs;
        this.defaultPerOcpuInGBs = defaultPerOcpuInGBs;
        this.minPerOcpuInGBs = minPerOcpuInGBs;
        this.maxPerOcpuInGBs = maxPerOcpuInGBs;
        this.maxPerNumaNodeInGBs = maxPerNumaNodeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The minimum amount of memory, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
        private Float minInGBs;

        /**
         * The minimum amount of memory, in gigabytes.
         *
         * @param minInGBs the value to set
         * @return this builder
         */
        public Builder minInGBs(Float minInGBs) {
            this.minInGBs = minInGBs;
            this.__explicitlySet__.add("minInGBs");
            return this;
        }
        /** The maximum amount of memory, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
        private Float maxInGBs;

        /**
         * The maximum amount of memory, in gigabytes.
         *
         * @param maxInGBs the value to set
         * @return this builder
         */
        public Builder maxInGBs(Float maxInGBs) {
            this.maxInGBs = maxInGBs;
            this.__explicitlySet__.add("maxInGBs");
            return this;
        }
        /** The default amount of memory per OCPU available for this shape, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGBs")
        private Float defaultPerOcpuInGBs;

        /**
         * The default amount of memory per OCPU available for this shape, in gigabytes.
         *
         * @param defaultPerOcpuInGBs the value to set
         * @return this builder
         */
        public Builder defaultPerOcpuInGBs(Float defaultPerOcpuInGBs) {
            this.defaultPerOcpuInGBs = defaultPerOcpuInGBs;
            this.__explicitlySet__.add("defaultPerOcpuInGBs");
            return this;
        }
        /** The minimum amount of memory per OCPU available for this shape, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("minPerOcpuInGBs")
        private Float minPerOcpuInGBs;

        /**
         * The minimum amount of memory per OCPU available for this shape, in gigabytes.
         *
         * @param minPerOcpuInGBs the value to set
         * @return this builder
         */
        public Builder minPerOcpuInGBs(Float minPerOcpuInGBs) {
            this.minPerOcpuInGBs = minPerOcpuInGBs;
            this.__explicitlySet__.add("minPerOcpuInGBs");
            return this;
        }
        /** The maximum amount of memory per OCPU available for this shape, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxPerOcpuInGBs")
        private Float maxPerOcpuInGBs;

        /**
         * The maximum amount of memory per OCPU available for this shape, in gigabytes.
         *
         * @param maxPerOcpuInGBs the value to set
         * @return this builder
         */
        public Builder maxPerOcpuInGBs(Float maxPerOcpuInGBs) {
            this.maxPerOcpuInGBs = maxPerOcpuInGBs;
            this.__explicitlySet__.add("maxPerOcpuInGBs");
            return this;
        }
        /** The maximum amount of memory per NUMA node, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxPerNumaNodeInGBs")
        private Float maxPerNumaNodeInGBs;

        /**
         * The maximum amount of memory per NUMA node, in gigabytes.
         *
         * @param maxPerNumaNodeInGBs the value to set
         * @return this builder
         */
        public Builder maxPerNumaNodeInGBs(Float maxPerNumaNodeInGBs) {
            this.maxPerNumaNodeInGBs = maxPerNumaNodeInGBs;
            this.__explicitlySet__.add("maxPerNumaNodeInGBs");
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
                            this.maxPerOcpuInGBs,
                            this.maxPerNumaNodeInGBs);
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
            if (model.wasPropertyExplicitlySet("maxPerNumaNodeInGBs")) {
                this.maxPerNumaNodeInGBs(model.getMaxPerNumaNodeInGBs());
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
    private final Float minInGBs;

    /**
     * The minimum amount of memory, in gigabytes.
     *
     * @return the value
     */
    public Float getMinInGBs() {
        return minInGBs;
    }

    /** The maximum amount of memory, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
    private final Float maxInGBs;

    /**
     * The maximum amount of memory, in gigabytes.
     *
     * @return the value
     */
    public Float getMaxInGBs() {
        return maxInGBs;
    }

    /** The default amount of memory per OCPU available for this shape, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGBs")
    private final Float defaultPerOcpuInGBs;

    /**
     * The default amount of memory per OCPU available for this shape, in gigabytes.
     *
     * @return the value
     */
    public Float getDefaultPerOcpuInGBs() {
        return defaultPerOcpuInGBs;
    }

    /** The minimum amount of memory per OCPU available for this shape, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("minPerOcpuInGBs")
    private final Float minPerOcpuInGBs;

    /**
     * The minimum amount of memory per OCPU available for this shape, in gigabytes.
     *
     * @return the value
     */
    public Float getMinPerOcpuInGBs() {
        return minPerOcpuInGBs;
    }

    /** The maximum amount of memory per OCPU available for this shape, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxPerOcpuInGBs")
    private final Float maxPerOcpuInGBs;

    /**
     * The maximum amount of memory per OCPU available for this shape, in gigabytes.
     *
     * @return the value
     */
    public Float getMaxPerOcpuInGBs() {
        return maxPerOcpuInGBs;
    }

    /** The maximum amount of memory per NUMA node, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxPerNumaNodeInGBs")
    private final Float maxPerNumaNodeInGBs;

    /**
     * The maximum amount of memory per NUMA node, in gigabytes.
     *
     * @return the value
     */
    public Float getMaxPerNumaNodeInGBs() {
        return maxPerNumaNodeInGBs;
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
        sb.append(", defaultPerOcpuInGBs=").append(String.valueOf(this.defaultPerOcpuInGBs));
        sb.append(", minPerOcpuInGBs=").append(String.valueOf(this.minPerOcpuInGBs));
        sb.append(", maxPerOcpuInGBs=").append(String.valueOf(this.maxPerOcpuInGBs));
        sb.append(", maxPerNumaNodeInGBs=").append(String.valueOf(this.maxPerNumaNodeInGBs));
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
                && java.util.Objects.equals(this.maxPerNumaNodeInGBs, other.maxPerNumaNodeInGBs)
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
        result =
                (result * PRIME)
                        + (this.maxPerNumaNodeInGBs == null
                                ? 43
                                : this.maxPerNumaNodeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
