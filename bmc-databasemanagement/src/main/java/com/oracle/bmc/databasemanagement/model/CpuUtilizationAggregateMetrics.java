/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The CPU utilization metrics for Autonomous Databases.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CpuUtilizationAggregateMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CpuUtilizationAggregateMetrics
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cpuUtilization", "cpuStatistics"})
    public CpuUtilizationAggregateMetrics(
            MetricDataPoint cpuUtilization, MetricStatisticsDefinition cpuStatistics) {
        super();
        this.cpuUtilization = cpuUtilization;
        this.cpuStatistics = cpuStatistics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilization")
        private MetricDataPoint cpuUtilization;

        public Builder cpuUtilization(MetricDataPoint cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            this.__explicitlySet__.add("cpuUtilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuStatistics")
        private MetricStatisticsDefinition cpuStatistics;

        public Builder cpuStatistics(MetricStatisticsDefinition cpuStatistics) {
            this.cpuStatistics = cpuStatistics;
            this.__explicitlySet__.add("cpuStatistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CpuUtilizationAggregateMetrics build() {
            CpuUtilizationAggregateMetrics model =
                    new CpuUtilizationAggregateMetrics(this.cpuUtilization, this.cpuStatistics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CpuUtilizationAggregateMetrics model) {
            if (model.wasPropertyExplicitlySet("cpuUtilization")) {
                this.cpuUtilization(model.getCpuUtilization());
            }
            if (model.wasPropertyExplicitlySet("cpuStatistics")) {
                this.cpuStatistics(model.getCpuStatistics());
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

    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilization")
    private final MetricDataPoint cpuUtilization;

    public MetricDataPoint getCpuUtilization() {
        return cpuUtilization;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpuStatistics")
    private final MetricStatisticsDefinition cpuStatistics;

    public MetricStatisticsDefinition getCpuStatistics() {
        return cpuStatistics;
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
        sb.append("CpuUtilizationAggregateMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("cpuUtilization=").append(String.valueOf(this.cpuUtilization));
        sb.append(", cpuStatistics=").append(String.valueOf(this.cpuStatistics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CpuUtilizationAggregateMetrics)) {
            return false;
        }

        CpuUtilizationAggregateMetrics other = (CpuUtilizationAggregateMetrics) o;
        return java.util.Objects.equals(this.cpuUtilization, other.cpuUtilization)
                && java.util.Objects.equals(this.cpuStatistics, other.cpuStatistics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.cpuUtilization == null ? 43 : this.cpuUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuStatistics == null ? 43 : this.cpuStatistics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
