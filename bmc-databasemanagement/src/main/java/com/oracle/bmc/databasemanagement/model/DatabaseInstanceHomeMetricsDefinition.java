/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The response containing the CPU, Wait, DB Time, and Memory metrics for a specific Oracle Real
 * Application Clusters (Oracle RAC) database instance. <br>
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
        builder = DatabaseInstanceHomeMetricsDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseInstanceHomeMetricsDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceName",
        "instanceNumber",
        "activityTimeSeriesMetrics",
        "dbTimeAggregateMetrics",
        "ioAggregateMetrics",
        "memoryAggregateMetrics",
        "cpuUtilizationAggregateMetrics"
    })
    public DatabaseInstanceHomeMetricsDefinition(
            String instanceName,
            Integer instanceNumber,
            java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics,
            DatabaseTimeAggregateMetrics dbTimeAggregateMetrics,
            DatabaseIOAggregateMetrics ioAggregateMetrics,
            MemoryAggregateMetrics memoryAggregateMetrics,
            CpuUtilizationAggregateMetrics cpuUtilizationAggregateMetrics) {
        super();
        this.instanceName = instanceName;
        this.instanceNumber = instanceNumber;
        this.activityTimeSeriesMetrics = activityTimeSeriesMetrics;
        this.dbTimeAggregateMetrics = dbTimeAggregateMetrics;
        this.ioAggregateMetrics = ioAggregateMetrics;
        this.memoryAggregateMetrics = memoryAggregateMetrics;
        this.cpuUtilizationAggregateMetrics = cpuUtilizationAggregateMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the Oracle Real Application Clusters (Oracle RAC) database instance to which
         * the corresponding metrics belong.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        /**
         * The name of the Oracle Real Application Clusters (Oracle RAC) database instance to which
         * the corresponding metrics belong.
         *
         * @param instanceName the value to set
         * @return this builder
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }
        /**
         * The number of Oracle Real Application Clusters (Oracle RAC) database instance to which
         * the corresponding metrics belong.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        /**
         * The number of Oracle Real Application Clusters (Oracle RAC) database instance to which
         * the corresponding metrics belong.
         *
         * @param instanceNumber the value to set
         * @return this builder
         */
        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }
        /**
         * A list of the active session metrics for CPU and Wait time for a specific Oracle Real
         * Application Clusters (Oracle RAC) database instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("activityTimeSeriesMetrics")
        private java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics;

        /**
         * A list of the active session metrics for CPU and Wait time for a specific Oracle Real
         * Application Clusters (Oracle RAC) database instance.
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
            DatabaseInstanceHomeMetricsDefinition model =
                    new DatabaseInstanceHomeMetricsDefinition(
                            this.instanceName,
                            this.instanceNumber,
                            this.activityTimeSeriesMetrics,
                            this.dbTimeAggregateMetrics,
                            this.ioAggregateMetrics,
                            this.memoryAggregateMetrics,
                            this.cpuUtilizationAggregateMetrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseInstanceHomeMetricsDefinition model) {
            if (model.wasPropertyExplicitlySet("instanceName")) {
                this.instanceName(model.getInstanceName());
            }
            if (model.wasPropertyExplicitlySet("instanceNumber")) {
                this.instanceNumber(model.getInstanceNumber());
            }
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
            if (model.wasPropertyExplicitlySet("cpuUtilizationAggregateMetrics")) {
                this.cpuUtilizationAggregateMetrics(model.getCpuUtilizationAggregateMetrics());
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
     * The name of the Oracle Real Application Clusters (Oracle RAC) database instance to which the
     * corresponding metrics belong.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    private final String instanceName;

    /**
     * The name of the Oracle Real Application Clusters (Oracle RAC) database instance to which the
     * corresponding metrics belong.
     *
     * @return the value
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * The number of Oracle Real Application Clusters (Oracle RAC) database instance to which the
     * corresponding metrics belong.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    private final Integer instanceNumber;

    /**
     * The number of Oracle Real Application Clusters (Oracle RAC) database instance to which the
     * corresponding metrics belong.
     *
     * @return the value
     */
    public Integer getInstanceNumber() {
        return instanceNumber;
    }

    /**
     * A list of the active session metrics for CPU and Wait time for a specific Oracle Real
     * Application Clusters (Oracle RAC) database instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activityTimeSeriesMetrics")
    private final java.util.List<ActivityTimeSeriesMetrics> activityTimeSeriesMetrics;

    /**
     * A list of the active session metrics for CPU and Wait time for a specific Oracle Real
     * Application Clusters (Oracle RAC) database instance.
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

    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationAggregateMetrics")
    private final CpuUtilizationAggregateMetrics cpuUtilizationAggregateMetrics;

    public CpuUtilizationAggregateMetrics getCpuUtilizationAggregateMetrics() {
        return cpuUtilizationAggregateMetrics;
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
        sb.append("DatabaseInstanceHomeMetricsDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("instanceName=").append(String.valueOf(this.instanceName));
        sb.append(", instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(", activityTimeSeriesMetrics=")
                .append(String.valueOf(this.activityTimeSeriesMetrics));
        sb.append(", dbTimeAggregateMetrics=").append(String.valueOf(this.dbTimeAggregateMetrics));
        sb.append(", ioAggregateMetrics=").append(String.valueOf(this.ioAggregateMetrics));
        sb.append(", memoryAggregateMetrics=").append(String.valueOf(this.memoryAggregateMetrics));
        sb.append(", cpuUtilizationAggregateMetrics=")
                .append(String.valueOf(this.cpuUtilizationAggregateMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseInstanceHomeMetricsDefinition)) {
            return false;
        }

        DatabaseInstanceHomeMetricsDefinition other = (DatabaseInstanceHomeMetricsDefinition) o;
        return java.util.Objects.equals(this.instanceName, other.instanceName)
                && java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(
                        this.activityTimeSeriesMetrics, other.activityTimeSeriesMetrics)
                && java.util.Objects.equals(
                        this.dbTimeAggregateMetrics, other.dbTimeAggregateMetrics)
                && java.util.Objects.equals(this.ioAggregateMetrics, other.ioAggregateMetrics)
                && java.util.Objects.equals(
                        this.memoryAggregateMetrics, other.memoryAggregateMetrics)
                && java.util.Objects.equals(
                        this.cpuUtilizationAggregateMetrics, other.cpuUtilizationAggregateMetrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceName == null ? 43 : this.instanceName.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceNumber == null ? 43 : this.instanceNumber.hashCode());
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
                        + (this.cpuUtilizationAggregateMetrics == null
                                ? 43
                                : this.cpuUtilizationAggregateMetrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
