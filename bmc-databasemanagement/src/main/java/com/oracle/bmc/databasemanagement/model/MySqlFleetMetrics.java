/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the MySQL Database fleet health metrics. <br>
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
        builder = MySqlFleetMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlFleetMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"startTime", "endTime", "fleetDatabases", "fleetSummary"})
    public MySqlFleetMetrics(
            String startTime,
            String endTime,
            java.util.List<MySqlDatabaseUsageMetrics> fleetDatabases,
            java.util.List<MySqlFleetSummary> fleetSummary) {
        super();
        this.startTime = startTime;
        this.endTime = endTime;
        this.fleetDatabases = fleetDatabases;
        this.fleetSummary = fleetSummary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The beginning of the time range during which metric data is retrieved. */
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private String startTime;

        /**
         * The beginning of the time range during which metric data is retrieved.
         *
         * @param startTime the value to set
         * @return this builder
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /** The end of the time range during which metric data is retrieved. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private String endTime;

        /**
         * The end of the time range during which metric data is retrieved.
         *
         * @param endTime the value to set
         * @return this builder
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }
        /** The list of MySQL Databases in the fleet and their usage metrics. */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetDatabases")
        private java.util.List<MySqlDatabaseUsageMetrics> fleetDatabases;

        /**
         * The list of MySQL Databases in the fleet and their usage metrics.
         *
         * @param fleetDatabases the value to set
         * @return this builder
         */
        public Builder fleetDatabases(java.util.List<MySqlDatabaseUsageMetrics> fleetDatabases) {
            this.fleetDatabases = fleetDatabases;
            this.__explicitlySet__.add("fleetDatabases");
            return this;
        }
        /**
         * A summary of the inventory count and the metrics that describe the aggregated usage of
         * CPU, storage, and so on of all the MySQL Databases in the fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetSummary")
        private java.util.List<MySqlFleetSummary> fleetSummary;

        /**
         * A summary of the inventory count and the metrics that describe the aggregated usage of
         * CPU, storage, and so on of all the MySQL Databases in the fleet.
         *
         * @param fleetSummary the value to set
         * @return this builder
         */
        public Builder fleetSummary(java.util.List<MySqlFleetSummary> fleetSummary) {
            this.fleetSummary = fleetSummary;
            this.__explicitlySet__.add("fleetSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlFleetMetrics build() {
            MySqlFleetMetrics model =
                    new MySqlFleetMetrics(
                            this.startTime, this.endTime, this.fleetDatabases, this.fleetSummary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlFleetMetrics model) {
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("endTime")) {
                this.endTime(model.getEndTime());
            }
            if (model.wasPropertyExplicitlySet("fleetDatabases")) {
                this.fleetDatabases(model.getFleetDatabases());
            }
            if (model.wasPropertyExplicitlySet("fleetSummary")) {
                this.fleetSummary(model.getFleetSummary());
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

    /** The beginning of the time range during which metric data is retrieved. */
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final String startTime;

    /**
     * The beginning of the time range during which metric data is retrieved.
     *
     * @return the value
     */
    public String getStartTime() {
        return startTime;
    }

    /** The end of the time range during which metric data is retrieved. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final String endTime;

    /**
     * The end of the time range during which metric data is retrieved.
     *
     * @return the value
     */
    public String getEndTime() {
        return endTime;
    }

    /** The list of MySQL Databases in the fleet and their usage metrics. */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetDatabases")
    private final java.util.List<MySqlDatabaseUsageMetrics> fleetDatabases;

    /**
     * The list of MySQL Databases in the fleet and their usage metrics.
     *
     * @return the value
     */
    public java.util.List<MySqlDatabaseUsageMetrics> getFleetDatabases() {
        return fleetDatabases;
    }

    /**
     * A summary of the inventory count and the metrics that describe the aggregated usage of CPU,
     * storage, and so on of all the MySQL Databases in the fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetSummary")
    private final java.util.List<MySqlFleetSummary> fleetSummary;

    /**
     * A summary of the inventory count and the metrics that describe the aggregated usage of CPU,
     * storage, and so on of all the MySQL Databases in the fleet.
     *
     * @return the value
     */
    public java.util.List<MySqlFleetSummary> getFleetSummary() {
        return fleetSummary;
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
        sb.append("MySqlFleetMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", fleetDatabases=").append(String.valueOf(this.fleetDatabases));
        sb.append(", fleetSummary=").append(String.valueOf(this.fleetSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlFleetMetrics)) {
            return false;
        }

        MySqlFleetMetrics other = (MySqlFleetMetrics) o;
        return java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.fleetDatabases, other.fleetDatabases)
                && java.util.Objects.equals(this.fleetSummary, other.fleetSummary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result =
                (result * PRIME)
                        + (this.fleetDatabases == null ? 43 : this.fleetDatabases.hashCode());
        result = (result * PRIME) + (this.fleetSummary == null ? 43 : this.fleetSummary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
