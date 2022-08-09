/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Update details of a metric based horizontal autoscaling policy.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateMetricBasedHorizontalScalingPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateMetricBasedHorizontalScalingPolicyDetails
        extends UpdateAutoScalePolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        public UpdateMetricBasedHorizontalScalingPolicyDetails build() {
            UpdateMetricBasedHorizontalScalingPolicyDetails model =
                    new UpdateMetricBasedHorizontalScalingPolicyDetails(
                            this.scaleOutConfig, this.scaleInConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMetricBasedHorizontalScalingPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("scaleOutConfig")) {
                this.scaleOutConfig(model.getScaleOutConfig());
            }
            if (model.wasPropertyExplicitlySet("scaleInConfig")) {
                this.scaleInConfig(model.getScaleInConfig());
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

    @Deprecated
    public UpdateMetricBasedHorizontalScalingPolicyDetails(
            MetricBasedHorizontalScaleOutConfig scaleOutConfig,
            MetricBasedHorizontalScaleInConfig scaleInConfig) {
        super();
        this.scaleOutConfig = scaleOutConfig;
        this.scaleInConfig = scaleInConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleOutConfig")
    private final MetricBasedHorizontalScaleOutConfig scaleOutConfig;

    public MetricBasedHorizontalScaleOutConfig getScaleOutConfig() {
        return scaleOutConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleInConfig")
    private final MetricBasedHorizontalScaleInConfig scaleInConfig;

    public MetricBasedHorizontalScaleInConfig getScaleInConfig() {
        return scaleInConfig;
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
        sb.append("UpdateMetricBasedHorizontalScalingPolicyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", scaleOutConfig=").append(String.valueOf(this.scaleOutConfig));
        sb.append(", scaleInConfig=").append(String.valueOf(this.scaleInConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMetricBasedHorizontalScalingPolicyDetails)) {
            return false;
        }

        UpdateMetricBasedHorizontalScalingPolicyDetails other =
                (UpdateMetricBasedHorizontalScalingPolicyDetails) o;
        return java.util.Objects.equals(this.scaleOutConfig, other.scaleOutConfig)
                && java.util.Objects.equals(this.scaleInConfig, other.scaleInConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.scaleOutConfig == null ? 43 : this.scaleOutConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.scaleInConfig == null ? 43 : this.scaleInConfig.hashCode());
        return result;
    }
}
