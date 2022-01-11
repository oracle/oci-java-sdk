/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The response containing the CPU, Storage, Wait, DB Time, and Memory metrics for a specific database.
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
    builder = DatabaseHomeMetricDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseHomeMetricDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("dbStorageAggregateMetrics")
        private DatabaseStorageAggregateMetrics dbStorageAggregateMetrics;

        public Builder dbStorageAggregateMetrics(
                DatabaseStorageAggregateMetrics dbStorageAggregateMetrics) {
            this.dbStorageAggregateMetrics = dbStorageAggregateMetrics;
            this.__explicitlySet__.add("dbStorageAggregateMetrics");
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

        @com.fasterxml.jackson.annotation.JsonProperty("statementsAggregateMetrics")
        private StatementsAggregateMetrics statementsAggregateMetrics;

        public Builder statementsAggregateMetrics(
                StatementsAggregateMetrics statementsAggregateMetrics) {
            this.statementsAggregateMetrics = statementsAggregateMetrics;
            this.__explicitlySet__.add("statementsAggregateMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failedConnectionsAggregateMetrics")
        private FailedConnectionsAggregateMetrics failedConnectionsAggregateMetrics;

        public Builder failedConnectionsAggregateMetrics(
                FailedConnectionsAggregateMetrics failedConnectionsAggregateMetrics) {
            this.failedConnectionsAggregateMetrics = failedConnectionsAggregateMetrics;
            this.__explicitlySet__.add("failedConnectionsAggregateMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseHomeMetricDefinition build() {
            DatabaseHomeMetricDefinition __instance__ =
                    new DatabaseHomeMetricDefinition(
                            activityTimeSeriesMetrics,
                            dbTimeAggregateMetrics,
                            ioAggregateMetrics,
                            memoryAggregateMetrics,
                            dbStorageAggregateMetrics,
                            cpuUtilizationAggregateMetrics,
                            statementsAggregateMetrics,
                            failedConnectionsAggregateMetrics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseHomeMetricDefinition o) {
            Builder copiedBuilder =
                    activityTimeSeriesMetrics(o.getActivityTimeSeriesMetrics())
                            .dbTimeAggregateMetrics(o.getDbTimeAggregateMetrics())
                            .ioAggregateMetrics(o.getIoAggregateMetrics())
                            .memoryAggregateMetrics(o.getMemoryAggregateMetrics())
                            .dbStorageAggregateMetrics(o.getDbStorageAggregateMetrics())
                            .cpuUtilizationAggregateMetrics(o.getCpuUtilizationAggregateMetrics())
                            .statementsAggregateMetrics(o.getStatementsAggregateMetrics())
                            .failedConnectionsAggregateMetrics(
                                    o.getFailedConnectionsAggregateMetrics());

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
     * A list of the active session metrics for CPU and Wait time for a specific database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activityTimeSeriesMetrics")
    java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("dbTimeAggregateMetrics")
    DatabaseTimeAggregateMetrics dbTimeAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("ioAggregateMetrics")
    DatabaseIOAggregateMetrics ioAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("memoryAggregateMetrics")
    MemoryAggregateMetrics memoryAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("dbStorageAggregateMetrics")
    DatabaseStorageAggregateMetrics dbStorageAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationAggregateMetrics")
    CpuUtilizationAggregateMetrics cpuUtilizationAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("statementsAggregateMetrics")
    StatementsAggregateMetrics statementsAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonProperty("failedConnectionsAggregateMetrics")
    FailedConnectionsAggregateMetrics failedConnectionsAggregateMetrics;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
