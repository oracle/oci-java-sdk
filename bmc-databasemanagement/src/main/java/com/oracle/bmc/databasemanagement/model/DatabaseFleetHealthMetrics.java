/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the fleet health metrics.
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
    builder = DatabaseFleetHealthMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseFleetHealthMetrics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compareBaselineTime")
        private String compareBaselineTime;

        public Builder compareBaselineTime(String compareBaselineTime) {
            this.compareBaselineTime = compareBaselineTime;
            this.__explicitlySet__.add("compareBaselineTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compareTargetTime")
        private String compareTargetTime;

        public Builder compareTargetTime(String compareTargetTime) {
            this.compareTargetTime = compareTargetTime;
            this.__explicitlySet__.add("compareTargetTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compareType")
        private CompareType compareType;

        public Builder compareType(CompareType compareType) {
            this.compareType = compareType;
            this.__explicitlySet__.add("compareType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fleetSummary")
        private FleetSummary fleetSummary;

        public Builder fleetSummary(FleetSummary fleetSummary) {
            this.fleetSummary = fleetSummary;
            this.__explicitlySet__.add("fleetSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fleetDatabases")
        private java.util.List<DatabaseUsageMetrics> fleetDatabases;

        public Builder fleetDatabases(java.util.List<DatabaseUsageMetrics> fleetDatabases) {
            this.fleetDatabases = fleetDatabases;
            this.__explicitlySet__.add("fleetDatabases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseFleetHealthMetrics build() {
            DatabaseFleetHealthMetrics __instance__ =
                    new DatabaseFleetHealthMetrics(
                            compareBaselineTime,
                            compareTargetTime,
                            compareType,
                            fleetSummary,
                            fleetDatabases);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseFleetHealthMetrics o) {
            Builder copiedBuilder =
                    compareBaselineTime(o.getCompareBaselineTime())
                            .compareTargetTime(o.getCompareTargetTime())
                            .compareType(o.getCompareType())
                            .fleetSummary(o.getFleetSummary())
                            .fleetDatabases(o.getFleetDatabases());

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
     * The baseline date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     * This is the date and time against which percentage change is calculated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compareBaselineTime")
    String compareBaselineTime;

    /**
     * The target date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     * All the metrics are returned for the target date and time and the percentage change
     * is calculated against the baseline date and time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compareTargetTime")
    String compareTargetTime;

    /**
     * The time window used for metrics comparison.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compareType")
    CompareType compareType;

    @com.fasterxml.jackson.annotation.JsonProperty("fleetSummary")
    FleetSummary fleetSummary;

    /**
     * A list of the databases present in the fleet and their usage metrics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fleetDatabases")
    java.util.List<DatabaseUsageMetrics> fleetDatabases;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
