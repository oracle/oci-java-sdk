/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * TableUsageSummary represents a single usage record, or slice, that includes
 * information about read and write throughput consumed during that period
 * as well as the current information regarding storage capacity. In
 * addition the count of throttling exceptions for the period is reported.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TableUsageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TableUsageSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("secondsInPeriod")
        private Integer secondsInPeriod;

        public Builder secondsInPeriod(Integer secondsInPeriod) {
            this.secondsInPeriod = secondsInPeriod;
            this.__explicitlySet__.add("secondsInPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readUnits")
        private Integer readUnits;

        public Builder readUnits(Integer readUnits) {
            this.readUnits = readUnits;
            this.__explicitlySet__.add("readUnits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("writeUnits")
        private Integer writeUnits;

        public Builder writeUnits(Integer writeUnits) {
            this.writeUnits = writeUnits;
            this.__explicitlySet__.add("writeUnits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageInGBs")
        private Integer storageInGBs;

        public Builder storageInGBs(Integer storageInGBs) {
            this.storageInGBs = storageInGBs;
            this.__explicitlySet__.add("storageInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readThrottleCount")
        private Integer readThrottleCount;

        public Builder readThrottleCount(Integer readThrottleCount) {
            this.readThrottleCount = readThrottleCount;
            this.__explicitlySet__.add("readThrottleCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("writeThrottleCount")
        private Integer writeThrottleCount;

        public Builder writeThrottleCount(Integer writeThrottleCount) {
            this.writeThrottleCount = writeThrottleCount;
            this.__explicitlySet__.add("writeThrottleCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageThrottleCount")
        private Integer storageThrottleCount;

        public Builder storageThrottleCount(Integer storageThrottleCount) {
            this.storageThrottleCount = storageThrottleCount;
            this.__explicitlySet__.add("storageThrottleCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableUsageSummary build() {
            TableUsageSummary __instance__ =
                    new TableUsageSummary(
                            secondsInPeriod,
                            readUnits,
                            writeUnits,
                            storageInGBs,
                            readThrottleCount,
                            writeThrottleCount,
                            storageThrottleCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableUsageSummary o) {
            Builder copiedBuilder =
                    secondsInPeriod(o.getSecondsInPeriod())
                            .readUnits(o.getReadUnits())
                            .writeUnits(o.getWriteUnits())
                            .storageInGBs(o.getStorageInGBs())
                            .readThrottleCount(o.getReadThrottleCount())
                            .writeThrottleCount(o.getWriteThrottleCount())
                            .storageThrottleCount(o.getStorageThrottleCount());

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
     * The length of the sampling period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secondsInPeriod")
    Integer secondsInPeriod;

    /**
     * Read throughput during the sampling period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readUnits")
    Integer readUnits;

    /**
     * Write throughput during the sampling period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("writeUnits")
    Integer writeUnits;

    /**
     * The size of the table, in GB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageInGBs")
    Integer storageInGBs;

    /**
     * The number of times reads were throttled due to exceeding
     * the read throughput limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readThrottleCount")
    Integer readThrottleCount;

    /**
     * The number of times writes were throttled due to exceeding
     * the write throughput limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("writeThrottleCount")
    Integer writeThrottleCount;

    /**
     * The number of times writes were throttled because the table
     * exceeded its size limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageThrottleCount")
    Integer storageThrottleCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
