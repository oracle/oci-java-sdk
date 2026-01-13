/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ShapeMemoryOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShapeMemoryOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "defaultPerOcpuInGBs",
        "minInGBs",
        "minPerOcpuInGBs",
        "maxInGBs",
        "maxPerOcpuInGBs"
    })
    public ShapeMemoryOptions(
            Integer defaultPerOcpuInGBs,
            Integer minInGBs,
            Integer minPerOcpuInGBs,
            Integer maxInGBs,
            Integer maxPerOcpuInGBs) {
        super();
        this.defaultPerOcpuInGBs = defaultPerOcpuInGBs;
        this.minInGBs = minInGBs;
        this.minPerOcpuInGBs = minPerOcpuInGBs;
        this.maxInGBs = maxInGBs;
        this.maxPerOcpuInGBs = maxPerOcpuInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Default per OCPU configuration in GBs */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGBs")
        private Integer defaultPerOcpuInGBs;

        /**
         * Default per OCPU configuration in GBs
         *
         * @param defaultPerOcpuInGBs the value to set
         * @return this builder
         */
        public Builder defaultPerOcpuInGBs(Integer defaultPerOcpuInGBs) {
            this.defaultPerOcpuInGBs = defaultPerOcpuInGBs;
            this.__explicitlySet__.add("defaultPerOcpuInGBs");
            return this;
        }
        /** Minimum Memory configuration in GBs */
        @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
        private Integer minInGBs;

        /**
         * Minimum Memory configuration in GBs
         *
         * @param minInGBs the value to set
         * @return this builder
         */
        public Builder minInGBs(Integer minInGBs) {
            this.minInGBs = minInGBs;
            this.__explicitlySet__.add("minInGBs");
            return this;
        }
        /** Minimum Memory configuration per OCPU in GBs */
        @com.fasterxml.jackson.annotation.JsonProperty("minPerOcpuInGBs")
        private Integer minPerOcpuInGBs;

        /**
         * Minimum Memory configuration per OCPU in GBs
         *
         * @param minPerOcpuInGBs the value to set
         * @return this builder
         */
        public Builder minPerOcpuInGBs(Integer minPerOcpuInGBs) {
            this.minPerOcpuInGBs = minPerOcpuInGBs;
            this.__explicitlySet__.add("minPerOcpuInGBs");
            return this;
        }
        /** Maximum Memory configuration in GBs */
        @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
        private Integer maxInGBs;

        /**
         * Maximum Memory configuration in GBs
         *
         * @param maxInGBs the value to set
         * @return this builder
         */
        public Builder maxInGBs(Integer maxInGBs) {
            this.maxInGBs = maxInGBs;
            this.__explicitlySet__.add("maxInGBs");
            return this;
        }
        /** Maximum Memory configuration per OCPU in GBs */
        @com.fasterxml.jackson.annotation.JsonProperty("maxPerOcpuInGBs")
        private Integer maxPerOcpuInGBs;

        /**
         * Maximum Memory configuration per OCPU in GBs
         *
         * @param maxPerOcpuInGBs the value to set
         * @return this builder
         */
        public Builder maxPerOcpuInGBs(Integer maxPerOcpuInGBs) {
            this.maxPerOcpuInGBs = maxPerOcpuInGBs;
            this.__explicitlySet__.add("maxPerOcpuInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeMemoryOptions build() {
            ShapeMemoryOptions model =
                    new ShapeMemoryOptions(
                            this.defaultPerOcpuInGBs,
                            this.minInGBs,
                            this.minPerOcpuInGBs,
                            this.maxInGBs,
                            this.maxPerOcpuInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeMemoryOptions model) {
            if (model.wasPropertyExplicitlySet("defaultPerOcpuInGBs")) {
                this.defaultPerOcpuInGBs(model.getDefaultPerOcpuInGBs());
            }
            if (model.wasPropertyExplicitlySet("minInGBs")) {
                this.minInGBs(model.getMinInGBs());
            }
            if (model.wasPropertyExplicitlySet("minPerOcpuInGBs")) {
                this.minPerOcpuInGBs(model.getMinPerOcpuInGBs());
            }
            if (model.wasPropertyExplicitlySet("maxInGBs")) {
                this.maxInGBs(model.getMaxInGBs());
            }
            if (model.wasPropertyExplicitlySet("maxPerOcpuInGBs")) {
                this.maxPerOcpuInGBs(model.getMaxPerOcpuInGBs());
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

    /** Default per OCPU configuration in GBs */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGBs")
    private final Integer defaultPerOcpuInGBs;

    /**
     * Default per OCPU configuration in GBs
     *
     * @return the value
     */
    public Integer getDefaultPerOcpuInGBs() {
        return defaultPerOcpuInGBs;
    }

    /** Minimum Memory configuration in GBs */
    @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
    private final Integer minInGBs;

    /**
     * Minimum Memory configuration in GBs
     *
     * @return the value
     */
    public Integer getMinInGBs() {
        return minInGBs;
    }

    /** Minimum Memory configuration per OCPU in GBs */
    @com.fasterxml.jackson.annotation.JsonProperty("minPerOcpuInGBs")
    private final Integer minPerOcpuInGBs;

    /**
     * Minimum Memory configuration per OCPU in GBs
     *
     * @return the value
     */
    public Integer getMinPerOcpuInGBs() {
        return minPerOcpuInGBs;
    }

    /** Maximum Memory configuration in GBs */
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
    private final Integer maxInGBs;

    /**
     * Maximum Memory configuration in GBs
     *
     * @return the value
     */
    public Integer getMaxInGBs() {
        return maxInGBs;
    }

    /** Maximum Memory configuration per OCPU in GBs */
    @com.fasterxml.jackson.annotation.JsonProperty("maxPerOcpuInGBs")
    private final Integer maxPerOcpuInGBs;

    /**
     * Maximum Memory configuration per OCPU in GBs
     *
     * @return the value
     */
    public Integer getMaxPerOcpuInGBs() {
        return maxPerOcpuInGBs;
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
        sb.append("defaultPerOcpuInGBs=").append(String.valueOf(this.defaultPerOcpuInGBs));
        sb.append(", minInGBs=").append(String.valueOf(this.minInGBs));
        sb.append(", minPerOcpuInGBs=").append(String.valueOf(this.minPerOcpuInGBs));
        sb.append(", maxInGBs=").append(String.valueOf(this.maxInGBs));
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
        return java.util.Objects.equals(this.defaultPerOcpuInGBs, other.defaultPerOcpuInGBs)
                && java.util.Objects.equals(this.minInGBs, other.minInGBs)
                && java.util.Objects.equals(this.minPerOcpuInGBs, other.minPerOcpuInGBs)
                && java.util.Objects.equals(this.maxInGBs, other.maxInGBs)
                && java.util.Objects.equals(this.maxPerOcpuInGBs, other.maxPerOcpuInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultPerOcpuInGBs == null
                                ? 43
                                : this.defaultPerOcpuInGBs.hashCode());
        result = (result * PRIME) + (this.minInGBs == null ? 43 : this.minInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.minPerOcpuInGBs == null ? 43 : this.minPerOcpuInGBs.hashCode());
        result = (result * PRIME) + (this.maxInGBs == null ? 43 : this.maxInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxPerOcpuInGBs == null ? 43 : this.maxPerOcpuInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
