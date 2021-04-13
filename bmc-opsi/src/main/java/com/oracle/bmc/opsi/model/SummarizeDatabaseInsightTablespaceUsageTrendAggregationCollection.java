/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Top level response object.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummarizeDatabaseInsightTablespaceUsageTrendAggregationCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SummarizeDatabaseInsightTablespaceUsageTrendAggregationCollection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
        private java.util.Date timeIntervalStart;

        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            this.__explicitlySet__.add("timeIntervalStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
        private java.util.Date timeIntervalEnd;

        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            this.__explicitlySet__.add("timeIntervalEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
        private UsageUnit usageUnit;

        public Builder usageUnit(UsageUnit usageUnit) {
            this.usageUnit = usageUnit;
            this.__explicitlySet__.add("usageUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("itemDurationInMs")
        private Long itemDurationInMs;

        public Builder itemDurationInMs(Long itemDurationInMs) {
            this.itemDurationInMs = itemDurationInMs;
            this.__explicitlySet__.add("itemDurationInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<TablespaceUsageTrendAggregation> items;

        public Builder items(java.util.List<TablespaceUsageTrendAggregation> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeDatabaseInsightTablespaceUsageTrendAggregationCollection build() {
            SummarizeDatabaseInsightTablespaceUsageTrendAggregationCollection __instance__ =
                    new SummarizeDatabaseInsightTablespaceUsageTrendAggregationCollection(
                            timeIntervalStart, timeIntervalEnd, usageUnit, itemDurationInMs, items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeDatabaseInsightTablespaceUsageTrendAggregationCollection o) {
            Builder copiedBuilder =
                    timeIntervalStart(o.getTimeIntervalStart())
                            .timeIntervalEnd(o.getTimeIntervalEnd())
                            .usageUnit(o.getUsageUnit())
                            .itemDurationInMs(o.getItemDurationInMs())
                            .items(o.getItems());

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
     * The start timestamp that was passed into the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
    java.util.Date timeIntervalStart;

    /**
     * The end timestamp that was passed into the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
    java.util.Date timeIntervalEnd;

    /**
     * Displays usage unit ( CORES, GB)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
    UsageUnit usageUnit;

    /**
     * Time duration in milliseconds between data points (one hour or one day).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("itemDurationInMs")
    Long itemDurationInMs;

    /**
     * Collection of Usage Data with time stamps for top five tablespace
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<TablespaceUsageTrendAggregation> items;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
