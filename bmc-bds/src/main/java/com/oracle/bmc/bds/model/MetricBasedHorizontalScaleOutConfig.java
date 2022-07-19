/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Configration for a metric based horizontal scale-out policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MetricBasedHorizontalScaleOutConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MetricBasedHorizontalScaleOutConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"metric", "maxNodeCount", "stepSize"})
    public MetricBasedHorizontalScaleOutConfig(
            AutoScalePolicyMetricRule metric, Integer maxNodeCount, Integer stepSize) {
        super();
        this.metric = metric;
        this.maxNodeCount = maxNodeCount;
        this.stepSize = stepSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("metric")
        private AutoScalePolicyMetricRule metric;

        public Builder metric(AutoScalePolicyMetricRule metric) {
            this.metric = metric;
            this.__explicitlySet__.add("metric");
            return this;
        }
        /**
         * This value is the maximum number of nodes the cluster can be scaled-out to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxNodeCount")
        private Integer maxNodeCount;

        /**
         * This value is the maximum number of nodes the cluster can be scaled-out to.
         * @param maxNodeCount the value to set
         * @return this builder
         **/
        public Builder maxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = maxNodeCount;
            this.__explicitlySet__.add("maxNodeCount");
            return this;
        }
        /**
         * This value is the number of nodes to add during a scale-out event.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stepSize")
        private Integer stepSize;

        /**
         * This value is the number of nodes to add during a scale-out event.
         * @param stepSize the value to set
         * @return this builder
         **/
        public Builder stepSize(Integer stepSize) {
            this.stepSize = stepSize;
            this.__explicitlySet__.add("stepSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricBasedHorizontalScaleOutConfig build() {
            MetricBasedHorizontalScaleOutConfig __instance__ =
                    new MetricBasedHorizontalScaleOutConfig(metric, maxNodeCount, stepSize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricBasedHorizontalScaleOutConfig o) {
            Builder copiedBuilder =
                    metric(o.getMetric())
                            .maxNodeCount(o.getMaxNodeCount())
                            .stepSize(o.getStepSize());

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

    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    private final AutoScalePolicyMetricRule metric;

    public AutoScalePolicyMetricRule getMetric() {
        return metric;
    }

    /**
     * This value is the maximum number of nodes the cluster can be scaled-out to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxNodeCount")
    private final Integer maxNodeCount;

    /**
     * This value is the maximum number of nodes the cluster can be scaled-out to.
     * @return the value
     **/
    public Integer getMaxNodeCount() {
        return maxNodeCount;
    }

    /**
     * This value is the number of nodes to add during a scale-out event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepSize")
    private final Integer stepSize;

    /**
     * This value is the number of nodes to add during a scale-out event.
     * @return the value
     **/
    public Integer getStepSize() {
        return stepSize;
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
        sb.append("MetricBasedHorizontalScaleOutConfig(");
        sb.append("metric=").append(String.valueOf(this.metric));
        sb.append(", maxNodeCount=").append(String.valueOf(this.maxNodeCount));
        sb.append(", stepSize=").append(String.valueOf(this.stepSize));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricBasedHorizontalScaleOutConfig)) {
            return false;
        }

        MetricBasedHorizontalScaleOutConfig other = (MetricBasedHorizontalScaleOutConfig) o;
        return java.util.Objects.equals(this.metric, other.metric)
                && java.util.Objects.equals(this.maxNodeCount, other.maxNodeCount)
                && java.util.Objects.equals(this.stepSize, other.stepSize)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metric == null ? 43 : this.metric.hashCode());
        result = (result * PRIME) + (this.maxNodeCount == null ? 43 : this.maxNodeCount.hashCode());
        result = (result * PRIME) + (this.stepSize == null ? 43 : this.stepSize.hashCode());
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
