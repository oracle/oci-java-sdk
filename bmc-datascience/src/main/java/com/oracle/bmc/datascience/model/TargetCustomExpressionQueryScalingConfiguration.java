/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The scaling configuration for the custom expression query for the workload. <br>
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
        builder = TargetCustomExpressionQueryScalingConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "targetScalingConfigurationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TargetCustomExpressionQueryScalingConfiguration
        extends TargetScalingConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms
         * feature of the Monitoring service interprets results for each returned time series as
         * Boolean values, where zero represents false and a non-zero value represents true. A true
         * value means that the trigger rule condition has been met. The query must specify a
         * metric, statistic, interval, and trigger rule (threshold or absence). Supported values
         * for interval: 1m-60m (also 1h). You can optionally specify dimensions and grouping
         * functions. Supported grouping functions: grouping(), groupBy(). Example of threshold
         * alarm: {@code CPUUtilization[1m]{resourceId = "Model_Deployment_OCID"}.grouping().mean()
         * < 25 CPUUtilization[1m]{resourceId = "Model_Deployment_OCID"}.grouping().mean() > 75 }
         */
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms
         * feature of the Monitoring service interprets results for each returned time series as
         * Boolean values, where zero represents false and a non-zero value represents true. A true
         * value means that the trigger rule condition has been met. The query must specify a
         * metric, statistic, interval, and trigger rule (threshold or absence). Supported values
         * for interval: 1m-60m (also 1h). You can optionally specify dimensions and grouping
         * functions. Supported grouping functions: grouping(), groupBy(). Example of threshold
         * alarm: {@code CPUUtilization[1m]{resourceId = "Model_Deployment_OCID"}.grouping().mean()
         * < 25 CPUUtilization[1m]{resourceId = "Model_Deployment_OCID"}.grouping().mean() > 75 }
         *
         * @param query the value to set
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /** A metric value at which the scaling operation will be triggered. */
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private Float threshold;

        /**
         * A metric value at which the scaling operation will be triggered.
         *
         * @param threshold the value to set
         * @return this builder
         */
        public Builder threshold(Float threshold) {
            this.threshold = threshold;
            this.__explicitlySet__.add("threshold");
            return this;
        }
        /** Namespace to read the metrics from. Default value will be service metric namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricNamespace")
        private String metricNamespace;

        /**
         * Namespace to read the metrics from. Default value will be service metric namespace.
         *
         * @param metricNamespace the value to set
         * @return this builder
         */
        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = metricNamespace;
            this.__explicitlySet__.add("metricNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetCustomExpressionQueryScalingConfiguration build() {
            TargetCustomExpressionQueryScalingConfiguration model =
                    new TargetCustomExpressionQueryScalingConfiguration(
                            this.query, this.threshold, this.metricNamespace);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetCustomExpressionQueryScalingConfiguration model) {
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("threshold")) {
                this.threshold(model.getThreshold());
            }
            if (model.wasPropertyExplicitlySet("metricNamespace")) {
                this.metricNamespace(model.getMetricNamespace());
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
    public TargetCustomExpressionQueryScalingConfiguration(
            String query, Float threshold, String metricNamespace) {
        super();
        this.query = query;
        this.threshold = threshold;
        this.metricNamespace = metricNamespace;
    }

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature
     * of the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the
     * trigger rule condition has been met. The query must specify a metric, statistic, interval,
     * and trigger rule (threshold or absence). Supported values for interval: 1m-60m (also 1h). You
     * can optionally specify dimensions and grouping functions. Supported grouping functions:
     * grouping(), groupBy(). Example of threshold alarm: {@code CPUUtilization[1m]{resourceId =
     * "Model_Deployment_OCID"}.grouping().mean() < 25 CPUUtilization[1m]{resourceId =
     * "Model_Deployment_OCID"}.grouping().mean() > 75 }
     */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature
     * of the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the
     * trigger rule condition has been met. The query must specify a metric, statistic, interval,
     * and trigger rule (threshold or absence). Supported values for interval: 1m-60m (also 1h). You
     * can optionally specify dimensions and grouping functions. Supported grouping functions:
     * grouping(), groupBy(). Example of threshold alarm: {@code CPUUtilization[1m]{resourceId =
     * "Model_Deployment_OCID"}.grouping().mean() < 25 CPUUtilization[1m]{resourceId =
     * "Model_Deployment_OCID"}.grouping().mean() > 75 }
     *
     * @return the value
     */
    public String getQuery() {
        return query;
    }

    /** A metric value at which the scaling operation will be triggered. */
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final Float threshold;

    /**
     * A metric value at which the scaling operation will be triggered.
     *
     * @return the value
     */
    public Float getThreshold() {
        return threshold;
    }

    /** Namespace to read the metrics from. Default value will be service metric namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricNamespace")
    private final String metricNamespace;

    /**
     * Namespace to read the metrics from. Default value will be service metric namespace.
     *
     * @return the value
     */
    public String getMetricNamespace() {
        return metricNamespace;
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
        sb.append("TargetCustomExpressionQueryScalingConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(", metricNamespace=").append(String.valueOf(this.metricNamespace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetCustomExpressionQueryScalingConfiguration)) {
            return false;
        }

        TargetCustomExpressionQueryScalingConfiguration other =
                (TargetCustomExpressionQueryScalingConfiguration) o;
        return java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.threshold, other.threshold)
                && java.util.Objects.equals(this.metricNamespace, other.metricNamespace)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        result =
                (result * PRIME)
                        + (this.metricNamespace == null ? 43 : this.metricNamespace.hashCode());
        return result;
    }
}
