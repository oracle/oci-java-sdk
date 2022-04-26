/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Configration for a metric based horizontal scale-in policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MetricBasedHorizontalScaleInConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MetricBasedHorizontalScaleInConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metric")
        private AutoScalePolicyMetricRule metric;

        public Builder metric(AutoScalePolicyMetricRule metric) {
            this.metric = metric;
            this.__explicitlySet__.add("metric");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minNodeCount")
        private Integer minNodeCount;

        public Builder minNodeCount(Integer minNodeCount) {
            this.minNodeCount = minNodeCount;
            this.__explicitlySet__.add("minNodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepSize")
        private Integer stepSize;

        public Builder stepSize(Integer stepSize) {
            this.stepSize = stepSize;
            this.__explicitlySet__.add("stepSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricBasedHorizontalScaleInConfig build() {
            MetricBasedHorizontalScaleInConfig __instance__ =
                    new MetricBasedHorizontalScaleInConfig(metric, minNodeCount, stepSize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricBasedHorizontalScaleInConfig o) {
            Builder copiedBuilder =
                    metric(o.getMetric())
                            .minNodeCount(o.getMinNodeCount())
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

    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    AutoScalePolicyMetricRule metric;

    /**
     * This value is the minimum number of nodes the cluster can be scaled-in to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minNodeCount")
    Integer minNodeCount;

    /**
     * This value is the number of nodes to remove during a scale-in event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepSize")
    Integer stepSize;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
