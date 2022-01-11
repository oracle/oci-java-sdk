/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The response containing the CPU, Wait, DB Time, and Memory metrics
 * for a specific Oracle Real Application Clusters (Oracle RAC) database
 * instance.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseInstanceHomeMetricsDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseInstanceHomeMetricsDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("activityTimeSeriesMetrics")
        private java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics;

        public Builder activityTimeSeriesMetrics(
                java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics) {
            this.activityTimeSeriesMetrics = activityTimeSeriesMetrics;
            this.__explicitlySet__.add("activityTimeSeriesMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbTimeAggregateMetrics")
        private DatabaseTimeAggregateMetrics dbTimeAggregateMetrics;

        public Builder dbTimeAggregateMetrics(DatabaseTimeAggregateMetrics dbTimeAggregateMetrics) {
            this.dbTimeAggregateMetrics = dbTimeAggregateMetrics;
            this.__explicitlySet__.add("dbTimeAggregateMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioAggregateMetrics")
        private DatabaseIOAggregateMetrics ioAggregateMetrics;

        public Builder ioAggregateMetrics(DatabaseIOAggregateMetrics ioAggregateMetrics) {
            this.ioAggregateMetrics = ioAggregateMetrics;
            this.__explicitlySet__.add("ioAggregateMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryAggregateMetrics")
        private MemoryAggregateMetrics memoryAggregateMetrics;

        public Builder memoryAggregateMetrics(MemoryAggregateMetrics memoryAggregateMetrics) {
            this.memoryAggregateMetrics = memoryAggregateMetrics;
            this.__explicitlySet__.add("memoryAggregateMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationAggregateMetrics")
        private CpuUtilizationAggregateMetrics cpuUtilizationAggregateMetrics;

        public Builder cpuUtilizationAggregateMetrics(
                CpuUtilizationAggregateMetrics cpuUtilizationAggregateMetrics) {
            this.cpuUtilizationAggregateMetrics = cpuUtilizationAggregateMetrics;
            this.__explicitlySet__.add("cpuUtilizationAggregateMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseInstanceHomeMetricsDefinition build() {
            DatabaseInstanceHomeMetricsDefinition __instance__ =
                    new DatabaseInstanceHomeMetricsDefinition(
                            instanceName,
                            instanceNumber,
                            activityTimeSeriesMetrics,
                            dbTimeAggregateMetrics,
                            ioAggregateMetrics,
                            memoryAggregateMetrics,
                            cpuUtilizationAggregateMetrics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseInstanceHomeMetricsDefinition o) {
            Builder copiedBuilder =
                    instanceName(o.getInstanceName())
                            .instanceNumber(o.getInstanceNumber())
                            .activityTimeSeriesMetrics(o.getActivityTimeSeriesMetrics())
                            .dbTimeAggregateMetrics(o.getDbTimeAggregateMetrics())
                            .ioAggregateMetrics(o.getIoAggregateMetrics())
                            .memoryAggregateMetrics(o.getMemoryAggregateMetrics())
                            .cpuUtilizationAggregateMetrics(o.getCpuUtilizationAggregateMetrics());

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

    /**
     * The name of the Oracle Real Application Clusters (Oracle RAC)
     * database instance to which the corresponding metrics belong.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    String instanceName;

    /**
     * The number of Oracle Real Application Clusters (Oracle RAC)
     * database instance to which the corresponding metrics belong.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    Integer instanceNumber;

    /**
     * A list of the active session metrics for CPU and Wait time for
     * a specific Oracle Real Application Clusters (Oracle RAC)
     * database instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activityTimeSeriesMetrics")
    java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("dbTimeAggregateMetrics")
    DatabaseTimeAggregateMetrics dbTimeAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("ioAggregateMetrics")
    DatabaseIOAggregateMetrics ioAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("memoryAggregateMetrics")
    MemoryAggregateMetrics memoryAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationAggregateMetrics")
    CpuUtilizationAggregateMetrics cpuUtilizationAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
