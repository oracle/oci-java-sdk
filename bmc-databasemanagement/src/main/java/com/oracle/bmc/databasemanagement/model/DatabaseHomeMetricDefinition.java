/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The response containing the CPU, Storage, Wait, DB Time, and Memory metrics for a specific
 * Managed Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseHomeMetricDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseHomeMetricDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "activityTimeSeriesMetrics",
        "dbTimeAggregateMetrics",
        "ioAggregateMetrics",
        "memoryAggregateMetrics",
        "dbStorageAggregateMetrics",
        "cpuUtilizationAggregateMetrics",
        "statementsAggregateMetrics",
        "failedConnectionsAggregateMetrics"
    })
    public DatabaseHomeMetricDefinition(
            java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics,
            DatabaseTimeAggregateMetrics dbTimeAggregateMetrics,
            DatabaseIOAggregateMetrics ioAggregateMetrics,
            MemoryAggregateMetrics memoryAggregateMetrics,
            DatabaseStorageAggregateMetrics dbStorageAggregateMetrics,
            CpuUtilizationAggregateMetrics cpuUtilizationAggregateMetrics,
            StatementsAggregateMetrics statementsAggregateMetrics,
            FailedConnectionsAggregateMetrics failedConnectionsAggregateMetrics) {
        super();
        this.activityTimeSeriesMetrics = activityTimeSeriesMetrics;
        this.dbTimeAggregateMetrics = dbTimeAggregateMetrics;
        this.ioAggregateMetrics = ioAggregateMetrics;
        this.memoryAggregateMetrics = memoryAggregateMetrics;
        this.dbStorageAggregateMetrics = dbStorageAggregateMetrics;
        this.cpuUtilizationAggregateMetrics = cpuUtilizationAggregateMetrics;
        this.statementsAggregateMetrics = statementsAggregateMetrics;
        this.failedConnectionsAggregateMetrics = failedConnectionsAggregateMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of the active session metrics for CPU and Wait time for a specific Managed
         * Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("activityTimeSeriesMetrics")
        private java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics;

        /**
         * A list of the active session metrics for CPU and Wait time for a specific Managed
         * Database.
         *
         * @param activityTimeSeriesMetrics the value to set
         * @return this builder
         */
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
            DatabaseHomeMetricDefinition model =
                    new DatabaseHomeMetricDefinition(
                            this.activityTimeSeriesMetrics,
                            this.dbTimeAggregateMetrics,
                            this.ioAggregateMetrics,
                            this.memoryAggregateMetrics,
                            this.dbStorageAggregateMetrics,
                            this.cpuUtilizationAggregateMetrics,
                            this.statementsAggregateMetrics,
                            this.failedConnectionsAggregateMetrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseHomeMetricDefinition model) {
            if (model.wasPropertyExplicitlySet("activityTimeSeriesMetrics")) {
                this.activityTimeSeriesMetrics(model.getActivityTimeSeriesMetrics());
            }
            if (model.wasPropertyExplicitlySet("dbTimeAggregateMetrics")) {
                this.dbTimeAggregateMetrics(model.getDbTimeAggregateMetrics());
            }
            if (model.wasPropertyExplicitlySet("ioAggregateMetrics")) {
                this.ioAggregateMetrics(model.getIoAggregateMetrics());
            }
            if (model.wasPropertyExplicitlySet("memoryAggregateMetrics")) {
                this.memoryAggregateMetrics(model.getMemoryAggregateMetrics());
            }
            if (model.wasPropertyExplicitlySet("dbStorageAggregateMetrics")) {
                this.dbStorageAggregateMetrics(model.getDbStorageAggregateMetrics());
            }
            if (model.wasPropertyExplicitlySet("cpuUtilizationAggregateMetrics")) {
                this.cpuUtilizationAggregateMetrics(model.getCpuUtilizationAggregateMetrics());
            }
            if (model.wasPropertyExplicitlySet("statementsAggregateMetrics")) {
                this.statementsAggregateMetrics(model.getStatementsAggregateMetrics());
            }
            if (model.wasPropertyExplicitlySet("failedConnectionsAggregateMetrics")) {
                this.failedConnectionsAggregateMetrics(
                        model.getFailedConnectionsAggregateMetrics());
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
     * A list of the active session metrics for CPU and Wait time for a specific Managed Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activityTimeSeriesMetrics")
    private final java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics;

    /**
     * A list of the active session metrics for CPU and Wait time for a specific Managed Database.
     *
     * @return the value
     */
    public java.util.List<ActivityTimeSeriesMetrics> getActivityTimeSeriesMetrics() {
        return activityTimeSeriesMetrics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbTimeAggregateMetrics")
    private final DatabaseTimeAggregateMetrics dbTimeAggregateMetrics;

    public DatabaseTimeAggregateMetrics getDbTimeAggregateMetrics() {
        return dbTimeAggregateMetrics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ioAggregateMetrics")
    private final DatabaseIOAggregateMetrics ioAggregateMetrics;

    public DatabaseIOAggregateMetrics getIoAggregateMetrics() {
        return ioAggregateMetrics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memoryAggregateMetrics")
    private final MemoryAggregateMetrics memoryAggregateMetrics;

    public MemoryAggregateMetrics getMemoryAggregateMetrics() {
        return memoryAggregateMetrics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbStorageAggregateMetrics")
    private final DatabaseStorageAggregateMetrics dbStorageAggregateMetrics;

    public DatabaseStorageAggregateMetrics getDbStorageAggregateMetrics() {
        return dbStorageAggregateMetrics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationAggregateMetrics")
    private final CpuUtilizationAggregateMetrics cpuUtilizationAggregateMetrics;

    public CpuUtilizationAggregateMetrics getCpuUtilizationAggregateMetrics() {
        return cpuUtilizationAggregateMetrics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("statementsAggregateMetrics")
    private final StatementsAggregateMetrics statementsAggregateMetrics;

    public StatementsAggregateMetrics getStatementsAggregateMetrics() {
        return statementsAggregateMetrics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("failedConnectionsAggregateMetrics")
    private final FailedConnectionsAggregateMetrics failedConnectionsAggregateMetrics;

    public FailedConnectionsAggregateMetrics getFailedConnectionsAggregateMetrics() {
        return failedConnectionsAggregateMetrics;
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
        sb.append("DatabaseHomeMetricDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("activityTimeSeriesMetrics=")
                .append(String.valueOf(this.activityTimeSeriesMetrics));
        sb.append(", dbTimeAggregateMetrics=").append(String.valueOf(this.dbTimeAggregateMetrics));
        sb.append(", ioAggregateMetrics=").append(String.valueOf(this.ioAggregateMetrics));
        sb.append(", memoryAggregateMetrics=").append(String.valueOf(this.memoryAggregateMetrics));
        sb.append(", dbStorageAggregateMetrics=")
                .append(String.valueOf(this.dbStorageAggregateMetrics));
        sb.append(", cpuUtilizationAggregateMetrics=")
                .append(String.valueOf(this.cpuUtilizationAggregateMetrics));
        sb.append(", statementsAggregateMetrics=")
                .append(String.valueOf(this.statementsAggregateMetrics));
        sb.append(", failedConnectionsAggregateMetrics=")
                .append(String.valueOf(this.failedConnectionsAggregateMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseHomeMetricDefinition)) {
            return false;
        }

        DatabaseHomeMetricDefinition other = (DatabaseHomeMetricDefinition) o;
        return java.util.Objects.equals(
                        this.activityTimeSeriesMetrics, other.activityTimeSeriesMetrics)
                && java.util.Objects.equals(
                        this.dbTimeAggregateMetrics, other.dbTimeAggregateMetrics)
                && java.util.Objects.equals(this.ioAggregateMetrics, other.ioAggregateMetrics)
                && java.util.Objects.equals(
                        this.memoryAggregateMetrics, other.memoryAggregateMetrics)
                && java.util.Objects.equals(
                        this.dbStorageAggregateMetrics, other.dbStorageAggregateMetrics)
                && java.util.Objects.equals(
                        this.cpuUtilizationAggregateMetrics, other.cpuUtilizationAggregateMetrics)
                && java.util.Objects.equals(
                        this.statementsAggregateMetrics, other.statementsAggregateMetrics)
                && java.util.Objects.equals(
                        this.failedConnectionsAggregateMetrics,
                        other.failedConnectionsAggregateMetrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.activityTimeSeriesMetrics == null
                                ? 43
                                : this.activityTimeSeriesMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.dbTimeAggregateMetrics == null
                                ? 43
                                : this.dbTimeAggregateMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.ioAggregateMetrics == null
                                ? 43
                                : this.ioAggregateMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryAggregateMetrics == null
                                ? 43
                                : this.memoryAggregateMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.dbStorageAggregateMetrics == null
                                ? 43
                                : this.dbStorageAggregateMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuUtilizationAggregateMetrics == null
                                ? 43
                                : this.cpuUtilizationAggregateMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.statementsAggregateMetrics == null
                                ? 43
                                : this.statementsAggregateMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.failedConnectionsAggregateMetrics == null
                                ? 43
                                : this.failedConnectionsAggregateMetrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
