/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * An expression built using CPU or Memory metrics for triggering an autoscaling action on the model deployment.
 *
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
    builder = PredefinedMetricExpressionRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricExpressionRuleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PredefinedMetricExpressionRule extends MetricExpressionRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Metric type
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricType")
        private MetricType metricType;

        /**
         * Metric type
         *
         * @param metricType the value to set
         * @return this builder
         **/
        public Builder metricType(MetricType metricType) {
            this.metricType = metricType;
            this.__explicitlySet__.add("metricType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scaleInConfiguration")
        private PredefinedExpressionThresholdScalingConfiguration scaleInConfiguration;

        public Builder scaleInConfiguration(
                PredefinedExpressionThresholdScalingConfiguration scaleInConfiguration) {
            this.scaleInConfiguration = scaleInConfiguration;
            this.__explicitlySet__.add("scaleInConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scaleOutConfiguration")
        private PredefinedExpressionThresholdScalingConfiguration scaleOutConfiguration;

        public Builder scaleOutConfiguration(
                PredefinedExpressionThresholdScalingConfiguration scaleOutConfiguration) {
            this.scaleOutConfiguration = scaleOutConfiguration;
            this.__explicitlySet__.add("scaleOutConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PredefinedMetricExpressionRule build() {
            PredefinedMetricExpressionRule model =
                    new PredefinedMetricExpressionRule(
                            this.metricType, this.scaleInConfiguration, this.scaleOutConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PredefinedMetricExpressionRule model) {
            if (model.wasPropertyExplicitlySet("metricType")) {
                this.metricType(model.getMetricType());
            }
            if (model.wasPropertyExplicitlySet("scaleInConfiguration")) {
                this.scaleInConfiguration(model.getScaleInConfiguration());
            }
            if (model.wasPropertyExplicitlySet("scaleOutConfiguration")) {
                this.scaleOutConfiguration(model.getScaleOutConfiguration());
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
    public PredefinedMetricExpressionRule(
            MetricType metricType,
            PredefinedExpressionThresholdScalingConfiguration scaleInConfiguration,
            PredefinedExpressionThresholdScalingConfiguration scaleOutConfiguration) {
        super();
        this.metricType = metricType;
        this.scaleInConfiguration = scaleInConfiguration;
        this.scaleOutConfiguration = scaleOutConfiguration;
    }

    /**
     * Metric type
     *
     **/
    public enum MetricType {
        CpuUtilization("CPU_UTILIZATION"),
        MemoryUtilization("MEMORY_UTILIZATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MetricType.class);

        private final String value;
        private static java.util.Map<String, MetricType> map;

        static {
            map = new java.util.HashMap<>();
            for (MetricType v : MetricType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MetricType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MetricType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MetricType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Metric type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricType")
    private final MetricType metricType;

    /**
     * Metric type
     *
     * @return the value
     **/
    public MetricType getMetricType() {
        return metricType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleInConfiguration")
    private final PredefinedExpressionThresholdScalingConfiguration scaleInConfiguration;

    public PredefinedExpressionThresholdScalingConfiguration getScaleInConfiguration() {
        return scaleInConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleOutConfiguration")
    private final PredefinedExpressionThresholdScalingConfiguration scaleOutConfiguration;

    public PredefinedExpressionThresholdScalingConfiguration getScaleOutConfiguration() {
        return scaleOutConfiguration;
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
        sb.append("PredefinedMetricExpressionRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", metricType=").append(String.valueOf(this.metricType));
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
        if (!(o instanceof PredefinedMetricExpressionRule)) {
            return false;
        }

        PredefinedMetricExpressionRule other = (PredefinedMetricExpressionRule) o;
        return java.util.Objects.equals(this.metricType, other.metricType)
                && java.util.Objects.equals(this.scaleInConfiguration, other.scaleInConfiguration)
                && java.util.Objects.equals(this.scaleOutConfiguration, other.scaleOutConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.metricType == null ? 43 : this.metricType.hashCode());
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
