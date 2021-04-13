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
    builder = SummarizeDatabaseInsightResourceUsageTrendAggregationCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SummarizeDatabaseInsightResourceUsageTrendAggregationCollection {
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

        @com.fasterxml.jackson.annotation.JsonProperty("resourceMetric")
        private ResourceMetric resourceMetric;

        public Builder resourceMetric(ResourceMetric resourceMetric) {
            this.resourceMetric = resourceMetric;
            this.__explicitlySet__.add("resourceMetric");
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

        @com.fasterxml.jackson.annotation.JsonProperty("usageData")
        private java.util.List<ResourceUsageTrendAggregation> usageData;

        public Builder usageData(java.util.List<ResourceUsageTrendAggregation> usageData) {
            this.usageData = usageData;
            this.__explicitlySet__.add("usageData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeDatabaseInsightResourceUsageTrendAggregationCollection build() {
            SummarizeDatabaseInsightResourceUsageTrendAggregationCollection __instance__ =
                    new SummarizeDatabaseInsightResourceUsageTrendAggregationCollection(
                            timeIntervalStart,
                            timeIntervalEnd,
                            resourceMetric,
                            usageUnit,
                            itemDurationInMs,
                            usageData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeDatabaseInsightResourceUsageTrendAggregationCollection o) {
            Builder copiedBuilder =
                    timeIntervalStart(o.getTimeIntervalStart())
                            .timeIntervalEnd(o.getTimeIntervalEnd())
                            .resourceMetric(o.getResourceMetric())
                            .usageUnit(o.getUsageUnit())
                            .itemDurationInMs(o.getItemDurationInMs())
                            .usageData(o.getUsageData());

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
     * Defines the type of resource metric (example: CPU, STORAGE)
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ResourceMetric {
        Cpu("CPU"),
        Storage("STORAGE"),
        Io("IO"),
        Memory("MEMORY"),
        MemoryPga("MEMORY_PGA"),
        MemorySga("MEMORY_SGA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ResourceMetric> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceMetric v : ResourceMetric.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceMetric(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceMetric create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceMetric', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Defines the type of resource metric (example: CPU, STORAGE)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceMetric")
    ResourceMetric resourceMetric;

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
     * Usage Data with time stamps
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageData")
    java.util.List<ResourceUsageTrendAggregation> usageData;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
