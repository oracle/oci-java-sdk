/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details of a metric based vertical autoscaling policy.
 *
 * <p>In a metric-based autoscaling policy, an autoscaling action is triggered when a performance
 * metric exceeds a threshold. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddMetricBasedVerticalScalingPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "policyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddMetricBasedVerticalScalingPolicyDetails extends AddAutoScalePolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("scaleUpConfig")
        private MetricBasedVerticalScaleUpConfig scaleUpConfig;

        public Builder scaleUpConfig(MetricBasedVerticalScaleUpConfig scaleUpConfig) {
            this.scaleUpConfig = scaleUpConfig;
            this.__explicitlySet__.add("scaleUpConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scaleDownConfig")
        private MetricBasedVerticalScaleDownConfig scaleDownConfig;

        public Builder scaleDownConfig(MetricBasedVerticalScaleDownConfig scaleDownConfig) {
            this.scaleDownConfig = scaleDownConfig;
            this.__explicitlySet__.add("scaleDownConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddMetricBasedVerticalScalingPolicyDetails build() {
            AddMetricBasedVerticalScalingPolicyDetails model =
                    new AddMetricBasedVerticalScalingPolicyDetails(
                            this.scaleUpConfig, this.scaleDownConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddMetricBasedVerticalScalingPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("scaleUpConfig")) {
                this.scaleUpConfig(model.getScaleUpConfig());
            }
            if (model.wasPropertyExplicitlySet("scaleDownConfig")) {
                this.scaleDownConfig(model.getScaleDownConfig());
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

    @Deprecated
    public AddMetricBasedVerticalScalingPolicyDetails(
            MetricBasedVerticalScaleUpConfig scaleUpConfig,
            MetricBasedVerticalScaleDownConfig scaleDownConfig) {
        super();
        this.scaleUpConfig = scaleUpConfig;
        this.scaleDownConfig = scaleDownConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleUpConfig")
    private final MetricBasedVerticalScaleUpConfig scaleUpConfig;

    public MetricBasedVerticalScaleUpConfig getScaleUpConfig() {
        return scaleUpConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleDownConfig")
    private final MetricBasedVerticalScaleDownConfig scaleDownConfig;

    public MetricBasedVerticalScaleDownConfig getScaleDownConfig() {
        return scaleDownConfig;
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
        sb.append("AddMetricBasedVerticalScalingPolicyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", scaleUpConfig=").append(String.valueOf(this.scaleUpConfig));
        sb.append(", scaleDownConfig=").append(String.valueOf(this.scaleDownConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddMetricBasedVerticalScalingPolicyDetails)) {
            return false;
        }

        AddMetricBasedVerticalScalingPolicyDetails other =
                (AddMetricBasedVerticalScalingPolicyDetails) o;
        return java.util.Objects.equals(this.scaleUpConfig, other.scaleUpConfig)
                && java.util.Objects.equals(this.scaleDownConfig, other.scaleDownConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.scaleUpConfig == null ? 43 : this.scaleUpConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.scaleDownConfig == null ? 43 : this.scaleDownConfig.hashCode());
        return result;
    }
}
