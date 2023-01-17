/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The database Input/Output metric details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseIOAggregateMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DatabaseIOAggregateMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "iops",
        "ioThroughput",
        "iopsStatistics",
        "ioThroughputStatistics"
    })
    public DatabaseIOAggregateMetrics(
            java.util.List<MetricDataPoint> iops,
            java.util.List<MetricDataPoint> ioThroughput,
            java.util.List<MetricStatisticsDefinition> iopsStatistics,
            java.util.List<MetricStatisticsDefinition> ioThroughputStatistics) {
        super();
        this.iops = iops;
        this.ioThroughput = ioThroughput;
        this.iopsStatistics = iopsStatistics;
        this.ioThroughputStatistics = ioThroughputStatistics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Input/Output Operations Per Second metrics grouped by IOType for a specific Managed
         * Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("iops")
        private java.util.List<MetricDataPoint> iops;

        /**
         * The Input/Output Operations Per Second metrics grouped by IOType for a specific Managed
         * Database.
         *
         * @param iops the value to set
         * @return this builder
         */
        public Builder iops(java.util.List<MetricDataPoint> iops) {
            this.iops = iops;
            this.__explicitlySet__.add("iops");
            return this;
        }
        /** The IOThroughput metrics grouped by IOType for a specific Managed Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("ioThroughput")
        private java.util.List<MetricDataPoint> ioThroughput;

        /**
         * The IOThroughput metrics grouped by IOType for a specific Managed Database.
         *
         * @param ioThroughput the value to set
         * @return this builder
         */
        public Builder ioThroughput(java.util.List<MetricDataPoint> ioThroughput) {
            this.ioThroughput = ioThroughput;
            this.__explicitlySet__.add("ioThroughput");
            return this;
        }
        /**
         * The Input/Output metric statistics such as min, max, mean, lowerQuartile, and
         * upperQuartile.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("iopsStatistics")
        private java.util.List<MetricStatisticsDefinition> iopsStatistics;

        /**
         * The Input/Output metric statistics such as min, max, mean, lowerQuartile, and
         * upperQuartile.
         *
         * @param iopsStatistics the value to set
         * @return this builder
         */
        public Builder iopsStatistics(java.util.List<MetricStatisticsDefinition> iopsStatistics) {
            this.iopsStatistics = iopsStatistics;
            this.__explicitlySet__.add("iopsStatistics");
            return this;
        }
        /**
         * The IOThroughput metric statistics such as min, max, mean, lowerQuartile, and
         * upperQuartile.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ioThroughputStatistics")
        private java.util.List<MetricStatisticsDefinition> ioThroughputStatistics;

        /**
         * The IOThroughput metric statistics such as min, max, mean, lowerQuartile, and
         * upperQuartile.
         *
         * @param ioThroughputStatistics the value to set
         * @return this builder
         */
        public Builder ioThroughputStatistics(
                java.util.List<MetricStatisticsDefinition> ioThroughputStatistics) {
            this.ioThroughputStatistics = ioThroughputStatistics;
            this.__explicitlySet__.add("ioThroughputStatistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseIOAggregateMetrics build() {
            DatabaseIOAggregateMetrics model =
                    new DatabaseIOAggregateMetrics(
                            this.iops,
                            this.ioThroughput,
                            this.iopsStatistics,
                            this.ioThroughputStatistics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseIOAggregateMetrics model) {
            if (model.wasPropertyExplicitlySet("iops")) {
                this.iops(model.getIops());
            }
            if (model.wasPropertyExplicitlySet("ioThroughput")) {
                this.ioThroughput(model.getIoThroughput());
            }
            if (model.wasPropertyExplicitlySet("iopsStatistics")) {
                this.iopsStatistics(model.getIopsStatistics());
            }
            if (model.wasPropertyExplicitlySet("ioThroughputStatistics")) {
                this.ioThroughputStatistics(model.getIoThroughputStatistics());
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

    /**
     * The Input/Output Operations Per Second metrics grouped by IOType for a specific Managed
     * Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iops")
    private final java.util.List<MetricDataPoint> iops;

    /**
     * The Input/Output Operations Per Second metrics grouped by IOType for a specific Managed
     * Database.
     *
     * @return the value
     */
    public java.util.List<MetricDataPoint> getIops() {
        return iops;
    }

    /** The IOThroughput metrics grouped by IOType for a specific Managed Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("ioThroughput")
    private final java.util.List<MetricDataPoint> ioThroughput;

    /**
     * The IOThroughput metrics grouped by IOType for a specific Managed Database.
     *
     * @return the value
     */
    public java.util.List<MetricDataPoint> getIoThroughput() {
        return ioThroughput;
    }

    /**
     * The Input/Output metric statistics such as min, max, mean, lowerQuartile, and upperQuartile.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iopsStatistics")
    private final java.util.List<MetricStatisticsDefinition> iopsStatistics;

    /**
     * The Input/Output metric statistics such as min, max, mean, lowerQuartile, and upperQuartile.
     *
     * @return the value
     */
    public java.util.List<MetricStatisticsDefinition> getIopsStatistics() {
        return iopsStatistics;
    }

    /**
     * The IOThroughput metric statistics such as min, max, mean, lowerQuartile, and upperQuartile.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ioThroughputStatistics")
    private final java.util.List<MetricStatisticsDefinition> ioThroughputStatistics;

    /**
     * The IOThroughput metric statistics such as min, max, mean, lowerQuartile, and upperQuartile.
     *
     * @return the value
     */
    public java.util.List<MetricStatisticsDefinition> getIoThroughputStatistics() {
        return ioThroughputStatistics;
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
        sb.append("DatabaseIOAggregateMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("iops=").append(String.valueOf(this.iops));
        sb.append(", ioThroughput=").append(String.valueOf(this.ioThroughput));
        sb.append(", iopsStatistics=").append(String.valueOf(this.iopsStatistics));
        sb.append(", ioThroughputStatistics=").append(String.valueOf(this.ioThroughputStatistics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseIOAggregateMetrics)) {
            return false;
        }

        DatabaseIOAggregateMetrics other = (DatabaseIOAggregateMetrics) o;
        return java.util.Objects.equals(this.iops, other.iops)
                && java.util.Objects.equals(this.ioThroughput, other.ioThroughput)
                && java.util.Objects.equals(this.iopsStatistics, other.iopsStatistics)
                && java.util.Objects.equals(
                        this.ioThroughputStatistics, other.ioThroughputStatistics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.iops == null ? 43 : this.iops.hashCode());
        result = (result * PRIME) + (this.ioThroughput == null ? 43 : this.ioThroughput.hashCode());
        result =
                (result * PRIME)
                        + (this.iopsStatistics == null ? 43 : this.iopsStatistics.hashCode());
        result =
                (result * PRIME)
                        + (this.ioThroughputStatistics == null
                                ? 43
                                : this.ioThroughputStatistics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
