/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Resource usage summation for the current time period.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummarizeHostInsightResourceUsageAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummarizeHostInsightResourceUsageAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeIntervalStart",
        "timeIntervalEnd",
        "resourceMetric",
        "usageUnit",
        "usage",
        "capacity",
        "usageChangePercent"
    })
    public SummarizeHostInsightResourceUsageAggregation(
            java.util.Date timeIntervalStart,
            java.util.Date timeIntervalEnd,
            ResourceMetric resourceMetric,
            UsageUnit usageUnit,
            Double usage,
            Double capacity,
            Double usageChangePercent) {
        super();
        this.timeIntervalStart = timeIntervalStart;
        this.timeIntervalEnd = timeIntervalEnd;
        this.resourceMetric = resourceMetric;
        this.usageUnit = usageUnit;
        this.usage = usage;
        this.capacity = capacity;
        this.usageChangePercent = usageChangePercent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The start timestamp that was passed into the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
        private java.util.Date timeIntervalStart;

        /**
         * The start timestamp that was passed into the request.
         * @param timeIntervalStart the value to set
         * @return this builder
         **/
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            this.__explicitlySet__.add("timeIntervalStart");
            return this;
        }
        /**
         * The end timestamp that was passed into the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
        private java.util.Date timeIntervalEnd;

        /**
         * The end timestamp that was passed into the request.
         * @param timeIntervalEnd the value to set
         * @return this builder
         **/
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            this.__explicitlySet__.add("timeIntervalEnd");
            return this;
        }
        /**
         * Defines the type of resource metric (CPU, Physical Memory, Logical Memory)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceMetric")
        private ResourceMetric resourceMetric;

        /**
         * Defines the type of resource metric (CPU, Physical Memory, Logical Memory)
         *
         * @param resourceMetric the value to set
         * @return this builder
         **/
        public Builder resourceMetric(ResourceMetric resourceMetric) {
            this.resourceMetric = resourceMetric;
            this.__explicitlySet__.add("resourceMetric");
            return this;
        }
        /**
         * Displays usage unit (CORES, GB)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
        private UsageUnit usageUnit;

        /**
         * Displays usage unit (CORES, GB)
         *
         * @param usageUnit the value to set
         * @return this builder
         **/
        public Builder usageUnit(UsageUnit usageUnit) {
            this.usageUnit = usageUnit;
            this.__explicitlySet__.add("usageUnit");
            return this;
        }
        /**
         * Total amount used of the resource metric type (CPU, STORAGE).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Double usage;

        /**
         * Total amount used of the resource metric type (CPU, STORAGE).
         *
         * @param usage the value to set
         * @return this builder
         **/
        public Builder usage(Double usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }
        /**
         * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Double capacity;

        /**
         * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
         *
         * @param capacity the value to set
         * @return this builder
         **/
        public Builder capacity(Double capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }
        /**
         * Percentage change in resource usage during the current period calculated using linear regression functions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
        private Double usageChangePercent;

        /**
         * Percentage change in resource usage during the current period calculated using linear regression functions
         * @param usageChangePercent the value to set
         * @return this builder
         **/
        public Builder usageChangePercent(Double usageChangePercent) {
            this.usageChangePercent = usageChangePercent;
            this.__explicitlySet__.add("usageChangePercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeHostInsightResourceUsageAggregation build() {
            SummarizeHostInsightResourceUsageAggregation __instance__ =
                    new SummarizeHostInsightResourceUsageAggregation(
                            timeIntervalStart,
                            timeIntervalEnd,
                            resourceMetric,
                            usageUnit,
                            usage,
                            capacity,
                            usageChangePercent);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeHostInsightResourceUsageAggregation o) {
            Builder copiedBuilder =
                    timeIntervalStart(o.getTimeIntervalStart())
                            .timeIntervalEnd(o.getTimeIntervalEnd())
                            .resourceMetric(o.getResourceMetric())
                            .usageUnit(o.getUsageUnit())
                            .usage(o.getUsage())
                            .capacity(o.getCapacity())
                            .usageChangePercent(o.getUsageChangePercent());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The start timestamp that was passed into the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
    private final java.util.Date timeIntervalStart;

    /**
     * The start timestamp that was passed into the request.
     * @return the value
     **/
    public java.util.Date getTimeIntervalStart() {
        return timeIntervalStart;
    }

    /**
     * The end timestamp that was passed into the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
    private final java.util.Date timeIntervalEnd;

    /**
     * The end timestamp that was passed into the request.
     * @return the value
     **/
    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }

    /**
     * Defines the type of resource metric (CPU, Physical Memory, Logical Memory)
     *
     **/
    public enum ResourceMetric {
        Cpu("CPU"),
        Memory("MEMORY"),
        LogicalMemory("LOGICAL_MEMORY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceMetric.class);

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
     * Defines the type of resource metric (CPU, Physical Memory, Logical Memory)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceMetric")
    private final ResourceMetric resourceMetric;

    /**
     * Defines the type of resource metric (CPU, Physical Memory, Logical Memory)
     *
     * @return the value
     **/
    public ResourceMetric getResourceMetric() {
        return resourceMetric;
    }

    /**
     * Displays usage unit (CORES, GB)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
    private final UsageUnit usageUnit;

    /**
     * Displays usage unit (CORES, GB)
     *
     * @return the value
     **/
    public UsageUnit getUsageUnit() {
        return usageUnit;
    }

    /**
     * Total amount used of the resource metric type (CPU, STORAGE).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final Double usage;

    /**
     * Total amount used of the resource metric type (CPU, STORAGE).
     *
     * @return the value
     **/
    public Double getUsage() {
        return usage;
    }

    /**
     * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final Double capacity;

    /**
     * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
     *
     * @return the value
     **/
    public Double getCapacity() {
        return capacity;
    }

    /**
     * Percentage change in resource usage during the current period calculated using linear regression functions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
    private final Double usageChangePercent;

    /**
     * Percentage change in resource usage during the current period calculated using linear regression functions
     * @return the value
     **/
    public Double getUsageChangePercent() {
        return usageChangePercent;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SummarizeHostInsightResourceUsageAggregation(");
        sb.append("timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(", timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(", resourceMetric=").append(String.valueOf(this.resourceMetric));
        sb.append(", usageUnit=").append(String.valueOf(this.usageUnit));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(", usageChangePercent=").append(String.valueOf(this.usageChangePercent));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeHostInsightResourceUsageAggregation)) {
            return false;
        }

        SummarizeHostInsightResourceUsageAggregation other =
                (SummarizeHostInsightResourceUsageAggregation) o;
        return java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.resourceMetric, other.resourceMetric)
                && java.util.Objects.equals(this.usageUnit, other.usageUnit)
                && java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && java.util.Objects.equals(this.usageChangePercent, other.usageChangePercent)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeIntervalStart == null ? 43 : this.timeIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalEnd == null ? 43 : this.timeIntervalEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceMetric == null ? 43 : this.resourceMetric.hashCode());
        result = (result * PRIME) + (this.usageUnit == null ? 43 : this.usageUnit.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result =
                (result * PRIME)
                        + (this.usageChangePercent == null
                                ? 43
                                : this.usageChangePercent.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
