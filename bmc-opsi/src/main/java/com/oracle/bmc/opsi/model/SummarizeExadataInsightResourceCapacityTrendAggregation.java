/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Collection of resource capacity trend.
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
    builder = SummarizeExadataInsightResourceCapacityTrendAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummarizeExadataInsightResourceCapacityTrendAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeIntervalStart",
        "timeIntervalEnd",
        "exadataResourceMetric",
        "exadataResourceType",
        "usageUnit",
        "itemDurationInMs",
        "capacityData"
    })
    public SummarizeExadataInsightResourceCapacityTrendAggregation(
            java.util.Date timeIntervalStart,
            java.util.Date timeIntervalEnd,
            ExadataResourceMetric exadataResourceMetric,
            ExadataResourceType exadataResourceType,
            UsageUnit usageUnit,
            Long itemDurationInMs,
            java.util.List<ExadataInsightResourceCapacityTrendAggregation> capacityData) {
        super();
        this.timeIntervalStart = timeIntervalStart;
        this.timeIntervalEnd = timeIntervalEnd;
        this.exadataResourceMetric = exadataResourceMetric;
        this.exadataResourceType = exadataResourceType;
        this.usageUnit = usageUnit;
        this.itemDurationInMs = itemDurationInMs;
        this.capacityData = capacityData;
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
         * Defines the type of exadata resource metric (example: CPU, STORAGE)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataResourceMetric")
        private ExadataResourceMetric exadataResourceMetric;

        /**
         * Defines the type of exadata resource metric (example: CPU, STORAGE)
         *
         * @param exadataResourceMetric the value to set
         * @return this builder
         **/
        public Builder exadataResourceMetric(ExadataResourceMetric exadataResourceMetric) {
            this.exadataResourceMetric = exadataResourceMetric;
            this.__explicitlySet__.add("exadataResourceMetric");
            return this;
        }
        /**
         * Defines the resource type for an exadata  (example: DATABASE, STORAGE_SERVER, HOST, DISKGROUP)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataResourceType")
        private ExadataResourceType exadataResourceType;

        /**
         * Defines the resource type for an exadata  (example: DATABASE, STORAGE_SERVER, HOST, DISKGROUP)
         *
         * @param exadataResourceType the value to set
         * @return this builder
         **/
        public Builder exadataResourceType(ExadataResourceType exadataResourceType) {
            this.exadataResourceType = exadataResourceType;
            this.__explicitlySet__.add("exadataResourceType");
            return this;
        }
        /**
         * Displays usage unit ( CORES, GB , PERCENT, MBPS)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
        private UsageUnit usageUnit;

        /**
         * Displays usage unit ( CORES, GB , PERCENT, MBPS)
         * @param usageUnit the value to set
         * @return this builder
         **/
        public Builder usageUnit(UsageUnit usageUnit) {
            this.usageUnit = usageUnit;
            this.__explicitlySet__.add("usageUnit");
            return this;
        }
        /**
         * Time duration in milliseconds between data points (one hour or one day).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("itemDurationInMs")
        private Long itemDurationInMs;

        /**
         * Time duration in milliseconds between data points (one hour or one day).
         *
         * @param itemDurationInMs the value to set
         * @return this builder
         **/
        public Builder itemDurationInMs(Long itemDurationInMs) {
            this.itemDurationInMs = itemDurationInMs;
            this.__explicitlySet__.add("itemDurationInMs");
            return this;
        }
        /**
         * Capacity Data with time interval
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityData")
        private java.util.List<ExadataInsightResourceCapacityTrendAggregation> capacityData;

        /**
         * Capacity Data with time interval
         *
         * @param capacityData the value to set
         * @return this builder
         **/
        public Builder capacityData(
                java.util.List<ExadataInsightResourceCapacityTrendAggregation> capacityData) {
            this.capacityData = capacityData;
            this.__explicitlySet__.add("capacityData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeExadataInsightResourceCapacityTrendAggregation build() {
            SummarizeExadataInsightResourceCapacityTrendAggregation model =
                    new SummarizeExadataInsightResourceCapacityTrendAggregation(
                            this.timeIntervalStart,
                            this.timeIntervalEnd,
                            this.exadataResourceMetric,
                            this.exadataResourceType,
                            this.usageUnit,
                            this.itemDurationInMs,
                            this.capacityData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeExadataInsightResourceCapacityTrendAggregation model) {
            if (model.wasPropertyExplicitlySet("timeIntervalStart")) {
                this.timeIntervalStart(model.getTimeIntervalStart());
            }
            if (model.wasPropertyExplicitlySet("timeIntervalEnd")) {
                this.timeIntervalEnd(model.getTimeIntervalEnd());
            }
            if (model.wasPropertyExplicitlySet("exadataResourceMetric")) {
                this.exadataResourceMetric(model.getExadataResourceMetric());
            }
            if (model.wasPropertyExplicitlySet("exadataResourceType")) {
                this.exadataResourceType(model.getExadataResourceType());
            }
            if (model.wasPropertyExplicitlySet("usageUnit")) {
                this.usageUnit(model.getUsageUnit());
            }
            if (model.wasPropertyExplicitlySet("itemDurationInMs")) {
                this.itemDurationInMs(model.getItemDurationInMs());
            }
            if (model.wasPropertyExplicitlySet("capacityData")) {
                this.capacityData(model.getCapacityData());
            }
            return this;
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
     * Defines the type of exadata resource metric (example: CPU, STORAGE)
     *
     **/
    public enum ExadataResourceMetric {
        Cpu("CPU"),
        Storage("STORAGE"),
        Io("IO"),
        Memory("MEMORY"),
        Iops("IOPS"),
        Throughput("THROUGHPUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExadataResourceMetric.class);

        private final String value;
        private static java.util.Map<String, ExadataResourceMetric> map;

        static {
            map = new java.util.HashMap<>();
            for (ExadataResourceMetric v : ExadataResourceMetric.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExadataResourceMetric(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExadataResourceMetric create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExadataResourceMetric', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Defines the type of exadata resource metric (example: CPU, STORAGE)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataResourceMetric")
    private final ExadataResourceMetric exadataResourceMetric;

    /**
     * Defines the type of exadata resource metric (example: CPU, STORAGE)
     *
     * @return the value
     **/
    public ExadataResourceMetric getExadataResourceMetric() {
        return exadataResourceMetric;
    }

    /**
     * Defines the resource type for an exadata  (example: DATABASE, STORAGE_SERVER, HOST, DISKGROUP)
     *
     **/
    public enum ExadataResourceType {
        Database("DATABASE"),
        Host("HOST"),
        StorageServer("STORAGE_SERVER"),
        Diskgroup("DISKGROUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExadataResourceType.class);

        private final String value;
        private static java.util.Map<String, ExadataResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ExadataResourceType v : ExadataResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExadataResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExadataResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExadataResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Defines the resource type for an exadata  (example: DATABASE, STORAGE_SERVER, HOST, DISKGROUP)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataResourceType")
    private final ExadataResourceType exadataResourceType;

    /**
     * Defines the resource type for an exadata  (example: DATABASE, STORAGE_SERVER, HOST, DISKGROUP)
     *
     * @return the value
     **/
    public ExadataResourceType getExadataResourceType() {
        return exadataResourceType;
    }

    /**
     * Displays usage unit ( CORES, GB , PERCENT, MBPS)
     **/
    public enum UsageUnit {
        Cores("CORES"),
        Gb("GB"),
        Mbps("MBPS"),
        Iops("IOPS"),
        Percent("PERCENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UsageUnit.class);

        private final String value;
        private static java.util.Map<String, UsageUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (UsageUnit v : UsageUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UsageUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UsageUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UsageUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Displays usage unit ( CORES, GB , PERCENT, MBPS)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
    private final UsageUnit usageUnit;

    /**
     * Displays usage unit ( CORES, GB , PERCENT, MBPS)
     * @return the value
     **/
    public UsageUnit getUsageUnit() {
        return usageUnit;
    }

    /**
     * Time duration in milliseconds between data points (one hour or one day).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("itemDurationInMs")
    private final Long itemDurationInMs;

    /**
     * Time duration in milliseconds between data points (one hour or one day).
     *
     * @return the value
     **/
    public Long getItemDurationInMs() {
        return itemDurationInMs;
    }

    /**
     * Capacity Data with time interval
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityData")
    private final java.util.List<ExadataInsightResourceCapacityTrendAggregation> capacityData;

    /**
     * Capacity Data with time interval
     *
     * @return the value
     **/
    public java.util.List<ExadataInsightResourceCapacityTrendAggregation> getCapacityData() {
        return capacityData;
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
        sb.append("SummarizeExadataInsightResourceCapacityTrendAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(", timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(", exadataResourceMetric=").append(String.valueOf(this.exadataResourceMetric));
        sb.append(", exadataResourceType=").append(String.valueOf(this.exadataResourceType));
        sb.append(", usageUnit=").append(String.valueOf(this.usageUnit));
        sb.append(", itemDurationInMs=").append(String.valueOf(this.itemDurationInMs));
        sb.append(", capacityData=").append(String.valueOf(this.capacityData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeExadataInsightResourceCapacityTrendAggregation)) {
            return false;
        }

        SummarizeExadataInsightResourceCapacityTrendAggregation other =
                (SummarizeExadataInsightResourceCapacityTrendAggregation) o;
        return java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.exadataResourceMetric, other.exadataResourceMetric)
                && java.util.Objects.equals(this.exadataResourceType, other.exadataResourceType)
                && java.util.Objects.equals(this.usageUnit, other.usageUnit)
                && java.util.Objects.equals(this.itemDurationInMs, other.itemDurationInMs)
                && java.util.Objects.equals(this.capacityData, other.capacityData)
                && super.equals(other);
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
                        + (this.exadataResourceMetric == null
                                ? 43
                                : this.exadataResourceMetric.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataResourceType == null
                                ? 43
                                : this.exadataResourceType.hashCode());
        result = (result * PRIME) + (this.usageUnit == null ? 43 : this.usageUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.itemDurationInMs == null ? 43 : this.itemDurationInMs.hashCode());
        result = (result * PRIME) + (this.capacityData == null ? 43 : this.capacityData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
