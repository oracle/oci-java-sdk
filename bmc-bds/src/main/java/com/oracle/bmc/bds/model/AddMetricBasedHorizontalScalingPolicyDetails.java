/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details of a metric based horizontal autoscaling policy.
 * <p>
 * In a metric-based autoscaling policy, an autoscaling action is triggered when a performance metric exceeds a threshold.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddMetricBasedHorizontalScalingPolicyDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AddMetricBasedHorizontalScalingPolicyDetails extends AddAutoScalePolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("scaleOutConfig")
        private MetricBasedHorizontalScaleOutConfig scaleOutConfig;

        public Builder scaleOutConfig(MetricBasedHorizontalScaleOutConfig scaleOutConfig) {
            this.scaleOutConfig = scaleOutConfig;
            this.__explicitlySet__.add("scaleOutConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scaleInConfig")
        private MetricBasedHorizontalScaleInConfig scaleInConfig;

        public Builder scaleInConfig(MetricBasedHorizontalScaleInConfig scaleInConfig) {
            this.scaleInConfig = scaleInConfig;
            this.__explicitlySet__.add("scaleInConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddMetricBasedHorizontalScalingPolicyDetails build() {
            AddMetricBasedHorizontalScalingPolicyDetails __instance__ =
                    new AddMetricBasedHorizontalScalingPolicyDetails(scaleOutConfig, scaleInConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddMetricBasedHorizontalScalingPolicyDetails o) {
            Builder copiedBuilder =
                    scaleOutConfig(o.getScaleOutConfig()).scaleInConfig(o.getScaleInConfig());

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

    @Deprecated
    public AddMetricBasedHorizontalScalingPolicyDetails(
            MetricBasedHorizontalScaleOutConfig scaleOutConfig,
            MetricBasedHorizontalScaleInConfig scaleInConfig) {
        super();
        this.scaleOutConfig = scaleOutConfig;
        this.scaleInConfig = scaleInConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleOutConfig")
    MetricBasedHorizontalScaleOutConfig scaleOutConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("scaleInConfig")
    MetricBasedHorizontalScaleInConfig scaleInConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
