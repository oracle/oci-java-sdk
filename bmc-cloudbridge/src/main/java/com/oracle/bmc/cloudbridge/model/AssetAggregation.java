/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The result of an analytics aggregation on a set of assets.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AssetAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssetAggregation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dimensions",
        "count",
        "max",
        "mean",
        "min",
        "sum",
        "aggregatedProperty"
    })
    public AssetAggregation(
            java.util.Map<String, String> dimensions,
            Long count,
            Double max,
            Double mean,
            Double min,
            Double sum,
            String aggregatedProperty) {
        super();
        this.dimensions = dimensions;
        this.count = count;
        this.max = max;
        this.mean = mean;
        this.min = min;
        this.sum = sum;
        this.aggregatedProperty = aggregatedProperty;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The dimensions along which assets can be aggregated for analytics.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * The dimensions along which assets can be aggregated for analytics.
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * Returns the total number of observations from the group of assets.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Long count;

        /**
         * Returns the total number of observations from the group of assets.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Long count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /**
         * Returns the highest value from all the assets.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Double max;

        /**
         * Returns the highest value from all the assets.
         * @param max the value to set
         * @return this builder
         **/
        public Builder max(Double max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }
        /**
         * Returns the value of sum divided by count from the group of assets.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mean")
        private Double mean;

        /**
         * Returns the value of sum divided by count from the group of assets.
         * @param mean the value to set
         * @return this builder
         **/
        public Builder mean(Double mean) {
            this.mean = mean;
            this.__explicitlySet__.add("mean");
            return this;
        }
        /**
         * Returns the lowest value from the group of assets.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Double min;

        /**
         * Returns the lowest value from the group of assets.
         * @param min the value to set
         * @return this builder
         **/
        public Builder min(Double min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }
        /**
         * Returns all values added together from the group of assets.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sum")
        private Double sum;

        /**
         * Returns all values added together from the group of assets.
         * @param sum the value to set
         * @return this builder
         **/
        public Builder sum(Double sum) {
            this.sum = sum;
            this.__explicitlySet__.add("sum");
            return this;
        }
        /**
         * Aggregated property.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedProperty")
        private String aggregatedProperty;

        /**
         * Aggregated property.
         * @param aggregatedProperty the value to set
         * @return this builder
         **/
        public Builder aggregatedProperty(String aggregatedProperty) {
            this.aggregatedProperty = aggregatedProperty;
            this.__explicitlySet__.add("aggregatedProperty");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssetAggregation build() {
            AssetAggregation model =
                    new AssetAggregation(
                            this.dimensions,
                            this.count,
                            this.max,
                            this.mean,
                            this.min,
                            this.sum,
                            this.aggregatedProperty);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssetAggregation model) {
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("max")) {
                this.max(model.getMax());
            }
            if (model.wasPropertyExplicitlySet("mean")) {
                this.mean(model.getMean());
            }
            if (model.wasPropertyExplicitlySet("min")) {
                this.min(model.getMin());
            }
            if (model.wasPropertyExplicitlySet("sum")) {
                this.sum(model.getSum());
            }
            if (model.wasPropertyExplicitlySet("aggregatedProperty")) {
                this.aggregatedProperty(model.getAggregatedProperty());
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
     * The dimensions along which assets can be aggregated for analytics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * The dimensions along which assets can be aggregated for analytics.
     * @return the value
     **/
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * Returns the total number of observations from the group of assets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Long count;

    /**
     * Returns the total number of observations from the group of assets.
     * @return the value
     **/
    public Long getCount() {
        return count;
    }

    /**
     * Returns the highest value from all the assets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Double max;

    /**
     * Returns the highest value from all the assets.
     * @return the value
     **/
    public Double getMax() {
        return max;
    }

    /**
     * Returns the value of sum divided by count from the group of assets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mean")
    private final Double mean;

    /**
     * Returns the value of sum divided by count from the group of assets.
     * @return the value
     **/
    public Double getMean() {
        return mean;
    }

    /**
     * Returns the lowest value from the group of assets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Double min;

    /**
     * Returns the lowest value from the group of assets.
     * @return the value
     **/
    public Double getMin() {
        return min;
    }

    /**
     * Returns all values added together from the group of assets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sum")
    private final Double sum;

    /**
     * Returns all values added together from the group of assets.
     * @return the value
     **/
    public Double getSum() {
        return sum;
    }

    /**
     * Aggregated property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedProperty")
    private final String aggregatedProperty;

    /**
     * Aggregated property.
     * @return the value
     **/
    public String getAggregatedProperty() {
        return aggregatedProperty;
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
        sb.append("AssetAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(", max=").append(String.valueOf(this.max));
        sb.append(", mean=").append(String.valueOf(this.mean));
        sb.append(", min=").append(String.valueOf(this.min));
        sb.append(", sum=").append(String.valueOf(this.sum));
        sb.append(", aggregatedProperty=").append(String.valueOf(this.aggregatedProperty));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssetAggregation)) {
            return false;
        }

        AssetAggregation other = (AssetAggregation) o;
        return java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.max, other.max)
                && java.util.Objects.equals(this.mean, other.mean)
                && java.util.Objects.equals(this.min, other.min)
                && java.util.Objects.equals(this.sum, other.sum)
                && java.util.Objects.equals(this.aggregatedProperty, other.aggregatedProperty)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.max == null ? 43 : this.max.hashCode());
        result = (result * PRIME) + (this.mean == null ? 43 : this.mean.hashCode());
        result = (result * PRIME) + (this.min == null ? 43 : this.min.hashCode());
        result = (result * PRIME) + (this.sum == null ? 43 : this.sum.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatedProperty == null
                                ? 43
                                : this.aggregatedProperty.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
