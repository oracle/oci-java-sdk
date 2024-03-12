/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * A custom Monitoring Query Language (MQL) expression for triggering an autoscaling action on the
 * model deployment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CustomMetricExpressionRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricExpressionRuleType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomMetricExpressionRule extends MetricExpressionRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("scaleInConfiguration")
        private CustomExpressionQueryScalingConfiguration scaleInConfiguration;

        public Builder scaleInConfiguration(
                CustomExpressionQueryScalingConfiguration scaleInConfiguration) {
            this.scaleInConfiguration = scaleInConfiguration;
            this.__explicitlySet__.add("scaleInConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scaleOutConfiguration")
        private CustomExpressionQueryScalingConfiguration scaleOutConfiguration;

        public Builder scaleOutConfiguration(
                CustomExpressionQueryScalingConfiguration scaleOutConfiguration) {
            this.scaleOutConfiguration = scaleOutConfiguration;
            this.__explicitlySet__.add("scaleOutConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomMetricExpressionRule build() {
            CustomMetricExpressionRule model =
                    new CustomMetricExpressionRule(
                            this.scaleInConfiguration, this.scaleOutConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomMetricExpressionRule model) {
            if (model.wasPropertyExplicitlySet("scaleInConfiguration")) {
                this.scaleInConfiguration(model.getScaleInConfiguration());
            }
            if (model.wasPropertyExplicitlySet("scaleOutConfiguration")) {
                this.scaleOutConfiguration(model.getScaleOutConfiguration());
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
    public CustomMetricExpressionRule(
            CustomExpressionQueryScalingConfiguration scaleInConfiguration,
            CustomExpressionQueryScalingConfiguration scaleOutConfiguration) {
        super();
        this.scaleInConfiguration = scaleInConfiguration;
        this.scaleOutConfiguration = scaleOutConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleInConfiguration")
    private final CustomExpressionQueryScalingConfiguration scaleInConfiguration;

    public CustomExpressionQueryScalingConfiguration getScaleInConfiguration() {
        return scaleInConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleOutConfiguration")
    private final CustomExpressionQueryScalingConfiguration scaleOutConfiguration;

    public CustomExpressionQueryScalingConfiguration getScaleOutConfiguration() {
        return scaleOutConfiguration;
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
        sb.append("CustomMetricExpressionRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", scaleInConfiguration=").append(String.valueOf(this.scaleInConfiguration));
        sb.append(", scaleOutConfiguration=").append(String.valueOf(this.scaleOutConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomMetricExpressionRule)) {
            return false;
        }

        CustomMetricExpressionRule other = (CustomMetricExpressionRule) o;
        return java.util.Objects.equals(this.scaleInConfiguration, other.scaleInConfiguration)
                && java.util.Objects.equals(this.scaleOutConfiguration, other.scaleOutConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.scaleInConfiguration == null
                                ? 43
                                : this.scaleInConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.scaleOutConfiguration == null
                                ? 43
                                : this.scaleOutConfiguration.hashCode());
        return result;
    }
}
