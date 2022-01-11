/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The database Input/Output metric details.
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
    builder = DatabaseIOAggregateMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseIOAggregateMetrics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("iops")
        private java.util.List<MetricDataPoint> iops;

        public Builder iops(java.util.List<MetricDataPoint> iops) {
            this.iops = iops;
            this.__explicitlySet__.add("iops");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioThroughput")
        private java.util.List<MetricDataPoint> ioThroughput;

        public Builder ioThroughput(java.util.List<MetricDataPoint> ioThroughput) {
            this.ioThroughput = ioThroughput;
            this.__explicitlySet__.add("ioThroughput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseIOAggregateMetrics build() {
            DatabaseIOAggregateMetrics __instance__ =
                    new DatabaseIOAggregateMetrics(iops, ioThroughput);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseIOAggregateMetrics o) {
            Builder copiedBuilder = iops(o.getIops()).ioThroughput(o.getIoThroughput());

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
     * A list of the Input/Output Operations Per Second metrics grouped by IOType for a specific database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iops")
    java.util.List<MetricDataPoint> iops;

    /**
     * A list of the IOThroughput metrics grouped for a specific database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioThroughput")
    java.util.List<MetricDataPoint> ioThroughput;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
