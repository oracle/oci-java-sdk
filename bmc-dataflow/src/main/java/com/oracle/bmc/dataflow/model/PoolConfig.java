/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * An object containing the details about the compute shapes and number of compute instances to provison.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PoolConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PoolConfig extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shape", "shapeConfig", "min", "max"})
    public PoolConfig(String shape, ShapeConfig shapeConfig, Integer min, Integer max) {
        super();
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.min = min;
        this.max = max;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The compute shape of the resources you would like to provision.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The compute shape of the resources you would like to provision.
         *
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private ShapeConfig shapeConfig;

        public Builder shapeConfig(ShapeConfig shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }
        /**
         * Minimum number of compute instances in the pool for a given compute shape.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Integer min;

        /**
         * Minimum number of compute instances in the pool for a given compute shape.
         *
         * @param min the value to set
         * @return this builder
         **/
        public Builder min(Integer min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }
        /**
         * Maximum number of compute instances in the pool for a given compute shape.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Integer max;

        /**
         * Maximum number of compute instances in the pool for a given compute shape.
         *
         * @param max the value to set
         * @return this builder
         **/
        public Builder max(Integer max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PoolConfig build() {
            PoolConfig model = new PoolConfig(this.shape, this.shapeConfig, this.min, this.max);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PoolConfig model) {
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("min")) {
                this.min(model.getMin());
            }
            if (model.wasPropertyExplicitlySet("max")) {
                this.max(model.getMax());
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
     * The compute shape of the resources you would like to provision.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The compute shape of the resources you would like to provision.
     *
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final ShapeConfig shapeConfig;

    public ShapeConfig getShapeConfig() {
        return shapeConfig;
    }

    /**
     * Minimum number of compute instances in the pool for a given compute shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Integer min;

    /**
     * Minimum number of compute instances in the pool for a given compute shape.
     *
     * @return the value
     **/
    public Integer getMin() {
        return min;
    }

    /**
     * Maximum number of compute instances in the pool for a given compute shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Integer max;

    /**
     * Maximum number of compute instances in the pool for a given compute shape.
     *
     * @return the value
     **/
    public Integer getMax() {
        return max;
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
        sb.append("PoolConfig(");
        sb.append("super=").append(super.toString());
        sb.append("shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", min=").append(String.valueOf(this.min));
        sb.append(", max=").append(String.valueOf(this.max));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PoolConfig)) {
            return false;
        }

        PoolConfig other = (PoolConfig) o;
        return java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.min, other.min)
                && java.util.Objects.equals(this.max, other.max)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result = (result * PRIME) + (this.min == null ? 43 : this.min.hashCode());
        result = (result * PRIME) + (this.max == null ? 43 : this.max.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
