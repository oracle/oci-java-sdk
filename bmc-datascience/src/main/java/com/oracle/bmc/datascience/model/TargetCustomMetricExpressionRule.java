/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * A custom Monitoring Query Language (MQL) expression for triggering an autoscaling action on the workload.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TargetCustomMetricExpressionRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricExpressionRuleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TargetCustomMetricExpressionRule
        extends ManagedComputeClusterWorkloadMetricExpressionRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("scaleConfiguration")
        private TargetCustomExpressionQueryScalingConfiguration scaleConfiguration;

        public Builder scaleConfiguration(
                TargetCustomExpressionQueryScalingConfiguration scaleConfiguration) {
            this.scaleConfiguration = scaleConfiguration;
            this.__explicitlySet__.add("scaleConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetCustomMetricExpressionRule build() {
            TargetCustomMetricExpressionRule model =
                    new TargetCustomMetricExpressionRule(this.scaleConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetCustomMetricExpressionRule model) {
            if (model.wasPropertyExplicitlySet("scaleConfiguration")) {
                this.scaleConfiguration(model.getScaleConfiguration());
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
    public TargetCustomMetricExpressionRule(
            TargetCustomExpressionQueryScalingConfiguration scaleConfiguration) {
        super();
        this.scaleConfiguration = scaleConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleConfiguration")
    private final TargetCustomExpressionQueryScalingConfiguration scaleConfiguration;

    public TargetCustomExpressionQueryScalingConfiguration getScaleConfiguration() {
        return scaleConfiguration;
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
        sb.append("TargetCustomMetricExpressionRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", scaleConfiguration=").append(String.valueOf(this.scaleConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetCustomMetricExpressionRule)) {
            return false;
        }

        TargetCustomMetricExpressionRule other = (TargetCustomMetricExpressionRule) o;
        return java.util.Objects.equals(this.scaleConfiguration, other.scaleConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.scaleConfiguration == null
                                ? 43
                                : this.scaleConfiguration.hashCode());
        return result;
    }
}
