/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The scaling configuration for the custom metric expression rule.
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
    builder = CustomExpressionQueryScalingConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "scalingConfigurationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomExpressionQueryScalingConfiguration extends ScalingConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
        private String pendingDuration;

        public Builder pendingDuration(String pendingDuration) {
            this.pendingDuration = pendingDuration;
            this.__explicitlySet__.add("pendingDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceCountAdjustment")
        private Integer instanceCountAdjustment;

        public Builder instanceCountAdjustment(Integer instanceCountAdjustment) {
            this.instanceCountAdjustment = instanceCountAdjustment;
            this.__explicitlySet__.add("instanceCountAdjustment");
            return this;
        }
        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
         * the Monitoring service interprets results for each returned time series as Boolean values,
         * where zero represents false and a non-zero value represents true. A true value means that the trigger
         * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
         * rule (threshold or absence). Supported values for interval: {@code 1m}-{@code 60m} (also {@code 1h}). You can optionally
         * specify dimensions and grouping functions. Supported grouping functions: {@code grouping()}, {@code groupBy()}.
         * <p>
         * Example of threshold alarm:
         * <p>
         * -----
         * <p>
         * CPUUtilization[1m]{resourceId = "MODEL_DEPLOYMENT_OCID"}.grouping().mean() < 25
         *     CPUUtilization[1m]{resourceId = "MODEL_DEPLOYMENT_OCID"}.grouping().mean() > 75
         * <p>
         * -----
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
         * the Monitoring service interprets results for each returned time series as Boolean values,
         * where zero represents false and a non-zero value represents true. A true value means that the trigger
         * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
         * rule (threshold or absence). Supported values for interval: {@code 1m}-{@code 60m} (also {@code 1h}). You can optionally
         * specify dimensions and grouping functions. Supported grouping functions: {@code grouping()}, {@code groupBy()}.
         * <p>
         * Example of threshold alarm:
         * <p>
         * -----
         * <p>
         * CPUUtilization[1m]{resourceId = "MODEL_DEPLOYMENT_OCID"}.grouping().mean() < 25
         *     CPUUtilization[1m]{resourceId = "MODEL_DEPLOYMENT_OCID"}.grouping().mean() > 75
         * <p>
         * -----
         *
         * @param query the value to set
         * @return this builder
         **/
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomExpressionQueryScalingConfiguration build() {
            CustomExpressionQueryScalingConfiguration model =
                    new CustomExpressionQueryScalingConfiguration(
                            this.pendingDuration, this.instanceCountAdjustment, this.query);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomExpressionQueryScalingConfiguration model) {
            if (model.wasPropertyExplicitlySet("pendingDuration")) {
                this.pendingDuration(model.getPendingDuration());
            }
            if (model.wasPropertyExplicitlySet("instanceCountAdjustment")) {
                this.instanceCountAdjustment(model.getInstanceCountAdjustment());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
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
    public CustomExpressionQueryScalingConfiguration(
            String pendingDuration, Integer instanceCountAdjustment, String query) {
        super(pendingDuration, instanceCountAdjustment);
        this.query = query;
    }

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
     * the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the trigger
     * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
     * rule (threshold or absence). Supported values for interval: {@code 1m}-{@code 60m} (also {@code 1h}). You can optionally
     * specify dimensions and grouping functions. Supported grouping functions: {@code grouping()}, {@code groupBy()}.
     * <p>
     * Example of threshold alarm:
     * <p>
     * -----
     * <p>
     * CPUUtilization[1m]{resourceId = "MODEL_DEPLOYMENT_OCID"}.grouping().mean() < 25
     *     CPUUtilization[1m]{resourceId = "MODEL_DEPLOYMENT_OCID"}.grouping().mean() > 75
     * <p>
     * -----
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
     * the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the trigger
     * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
     * rule (threshold or absence). Supported values for interval: {@code 1m}-{@code 60m} (also {@code 1h}). You can optionally
     * specify dimensions and grouping functions. Supported grouping functions: {@code grouping()}, {@code groupBy()}.
     * <p>
     * Example of threshold alarm:
     * <p>
     * -----
     * <p>
     * CPUUtilization[1m]{resourceId = "MODEL_DEPLOYMENT_OCID"}.grouping().mean() < 25
     *     CPUUtilization[1m]{resourceId = "MODEL_DEPLOYMENT_OCID"}.grouping().mean() > 75
     * <p>
     * -----
     *
     * @return the value
     **/
    public String getQuery() {
        return query;
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
        sb.append("CustomExpressionQueryScalingConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomExpressionQueryScalingConfiguration)) {
            return false;
        }

        CustomExpressionQueryScalingConfiguration other =
                (CustomExpressionQueryScalingConfiguration) o;
        return java.util.Objects.equals(this.query, other.query) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        return result;
    }
}
