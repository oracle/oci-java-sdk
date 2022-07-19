/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * capacity results with breakdown by databases, hosts, storage servers or diskgroup.
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
    builder = SummarizeExadataInsightResourceCapacityTrendCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummarizeExadataInsightResourceCapacityTrendCollection {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exadataInsightId",
        "exadataResourceType",
        "exadataResourceMetric",
        "timeIntervalStart",
        "timeIntervalEnd",
        "usageUnit",
        "items"
    })
    public SummarizeExadataInsightResourceCapacityTrendCollection(
            String exadataInsightId,
            ExadataResourceType exadataResourceType,
            ExadataResourceMetric exadataResourceMetric,
            java.util.Date timeIntervalStart,
            java.util.Date timeIntervalEnd,
            UsageUnit usageUnit,
            java.util.List<ExadataInsightResourceCapacityTrendSummary> items) {
        super();
        this.exadataInsightId = exadataInsightId;
        this.exadataResourceType = exadataResourceType;
        this.exadataResourceMetric = exadataResourceMetric;
        this.timeIntervalStart = timeIntervalStart;
        this.timeIntervalEnd = timeIntervalEnd;
        this.usageUnit = usageUnit;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
        private String exadataInsightId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         * @param exadataInsightId the value to set
         * @return this builder
         **/
        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            this.__explicitlySet__.add("exadataInsightId");
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
         * Displays usage unit ( CORES, GB)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
        private UsageUnit usageUnit;

        /**
         * Displays usage unit ( CORES, GB)
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
         * Capacity Data with time interval
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ExadataInsightResourceCapacityTrendSummary> items;

        /**
         * Capacity Data with time interval
         *
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<ExadataInsightResourceCapacityTrendSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeExadataInsightResourceCapacityTrendCollection build() {
            SummarizeExadataInsightResourceCapacityTrendCollection __instance__ =
                    new SummarizeExadataInsightResourceCapacityTrendCollection(
                            exadataInsightId,
                            exadataResourceType,
                            exadataResourceMetric,
                            timeIntervalStart,
                            timeIntervalEnd,
                            usageUnit,
                            items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeExadataInsightResourceCapacityTrendCollection o) {
            Builder copiedBuilder =
                    exadataInsightId(o.getExadataInsightId())
                            .exadataResourceType(o.getExadataResourceType())
                            .exadataResourceMetric(o.getExadataResourceMetric())
                            .timeIntervalStart(o.getTimeIntervalStart())
                            .timeIntervalEnd(o.getTimeIntervalEnd())
                            .usageUnit(o.getUsageUnit())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
    private final String exadataInsightId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     * @return the value
     **/
    public String getExadataInsightId() {
        return exadataInsightId;
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
     * Displays usage unit ( CORES, GB)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageUnit")
    private final UsageUnit usageUnit;

    /**
     * Displays usage unit ( CORES, GB)
     *
     * @return the value
     **/
    public UsageUnit getUsageUnit() {
        return usageUnit;
    }

    /**
     * Capacity Data with time interval
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ExadataInsightResourceCapacityTrendSummary> items;

    /**
     * Capacity Data with time interval
     *
     * @return the value
     **/
    public java.util.List<ExadataInsightResourceCapacityTrendSummary> getItems() {
        return items;
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
        sb.append("SummarizeExadataInsightResourceCapacityTrendCollection(");
        sb.append("exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(", exadataResourceType=").append(String.valueOf(this.exadataResourceType));
        sb.append(", exadataResourceMetric=").append(String.valueOf(this.exadataResourceMetric));
        sb.append(", timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(", timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(", usageUnit=").append(String.valueOf(this.usageUnit));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeExadataInsightResourceCapacityTrendCollection)) {
            return false;
        }

        SummarizeExadataInsightResourceCapacityTrendCollection other =
                (SummarizeExadataInsightResourceCapacityTrendCollection) o;
        return java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(this.exadataResourceType, other.exadataResourceType)
                && java.util.Objects.equals(this.exadataResourceMetric, other.exadataResourceMetric)
                && java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.usageUnit, other.usageUnit)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataResourceType == null
                                ? 43
                                : this.exadataResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataResourceMetric == null
                                ? 43
                                : this.exadataResourceMetric.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalStart == null ? 43 : this.timeIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalEnd == null ? 43 : this.timeIntervalEnd.hashCode());
        result = (result * PRIME) + (this.usageUnit == null ? 43 : this.usageUnit.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
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
