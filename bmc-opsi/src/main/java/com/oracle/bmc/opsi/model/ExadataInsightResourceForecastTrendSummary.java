/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * List of resource id, name , capacity insight value, pattern, historical usage and projected data.
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
    builder = ExadataInsightResourceForecastTrendSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataInsightResourceForecastTrendSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "daysToReachCapacity",
        "pattern",
        "historicalData",
        "projectedData"
    })
    public ExadataInsightResourceForecastTrendSummary(
            String id,
            String name,
            Integer daysToReachCapacity,
            Pattern pattern,
            java.util.List<HistoricalDataItem> historicalData,
            java.util.List<ProjectedDataItem> projectedData) {
        super();
        this.id = id;
        this.name = name;
        this.daysToReachCapacity = daysToReachCapacity;
        this.pattern = pattern;
        this.historicalData = historicalData;
        this.projectedData = projectedData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the resource.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Days to reach capacity for a storage server
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("daysToReachCapacity")
        private Integer daysToReachCapacity;

        /**
         * Days to reach capacity for a storage server
         * @param daysToReachCapacity the value to set
         * @return this builder
         **/
        public Builder daysToReachCapacity(Integer daysToReachCapacity) {
            this.daysToReachCapacity = daysToReachCapacity;
            this.__explicitlySet__.add("daysToReachCapacity");
            return this;
        }
        /**
         * Time series patterns used in the forecasting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private Pattern pattern;

        /**
         * Time series patterns used in the forecasting.
         * @param pattern the value to set
         * @return this builder
         **/
        public Builder pattern(Pattern pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }
        /**
         * Time series data used for the forecast analysis.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("historicalData")
        private java.util.List<HistoricalDataItem> historicalData;

        /**
         * Time series data used for the forecast analysis.
         * @param historicalData the value to set
         * @return this builder
         **/
        public Builder historicalData(java.util.List<HistoricalDataItem> historicalData) {
            this.historicalData = historicalData;
            this.__explicitlySet__.add("historicalData");
            return this;
        }
        /**
         * Time series data result of the forecasting analysis.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectedData")
        private java.util.List<ProjectedDataItem> projectedData;

        /**
         * Time series data result of the forecasting analysis.
         * @param projectedData the value to set
         * @return this builder
         **/
        public Builder projectedData(java.util.List<ProjectedDataItem> projectedData) {
            this.projectedData = projectedData;
            this.__explicitlySet__.add("projectedData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInsightResourceForecastTrendSummary build() {
            ExadataInsightResourceForecastTrendSummary __instance__ =
                    new ExadataInsightResourceForecastTrendSummary(
                            id, name, daysToReachCapacity, pattern, historicalData, projectedData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInsightResourceForecastTrendSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .daysToReachCapacity(o.getDaysToReachCapacity())
                            .pattern(o.getPattern())
                            .historicalData(o.getHistoricalData())
                            .projectedData(o.getProjectedData());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the resource.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Days to reach capacity for a storage server
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("daysToReachCapacity")
    private final Integer daysToReachCapacity;

    /**
     * Days to reach capacity for a storage server
     * @return the value
     **/
    public Integer getDaysToReachCapacity() {
        return daysToReachCapacity;
    }

    /**
     * Time series patterns used in the forecasting.
     **/
    public enum Pattern {
        Linear("LINEAR"),
        MonthlySeasons("MONTHLY_SEASONS"),
        MonthlyAndYearlySeasons("MONTHLY_AND_YEARLY_SEASONS"),
        WeeklySeasons("WEEKLY_SEASONS"),
        WeeklyAndMonthlySeasons("WEEKLY_AND_MONTHLY_SEASONS"),
        WeeklyMonthlyAndYearlySeasons("WEEKLY_MONTHLY_AND_YEARLY_SEASONS"),
        WeeklyAndYearlySeasons("WEEKLY_AND_YEARLY_SEASONS"),
        YearlySeasons("YEARLY_SEASONS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Pattern.class);

        private final String value;
        private static java.util.Map<String, Pattern> map;

        static {
            map = new java.util.HashMap<>();
            for (Pattern v : Pattern.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Pattern(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Pattern create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Pattern', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Time series patterns used in the forecasting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final Pattern pattern;

    /**
     * Time series patterns used in the forecasting.
     * @return the value
     **/
    public Pattern getPattern() {
        return pattern;
    }

    /**
     * Time series data used for the forecast analysis.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("historicalData")
    private final java.util.List<HistoricalDataItem> historicalData;

    /**
     * Time series data used for the forecast analysis.
     * @return the value
     **/
    public java.util.List<HistoricalDataItem> getHistoricalData() {
        return historicalData;
    }

    /**
     * Time series data result of the forecasting analysis.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectedData")
    private final java.util.List<ProjectedDataItem> projectedData;

    /**
     * Time series data result of the forecasting analysis.
     * @return the value
     **/
    public java.util.List<ProjectedDataItem> getProjectedData() {
        return projectedData;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExadataInsightResourceForecastTrendSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", daysToReachCapacity=").append(String.valueOf(this.daysToReachCapacity));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(", historicalData=").append(String.valueOf(this.historicalData));
        sb.append(", projectedData=").append(String.valueOf(this.projectedData));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInsightResourceForecastTrendSummary)) {
            return false;
        }

        ExadataInsightResourceForecastTrendSummary other =
                (ExadataInsightResourceForecastTrendSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.daysToReachCapacity, other.daysToReachCapacity)
                && java.util.Objects.equals(this.pattern, other.pattern)
                && java.util.Objects.equals(this.historicalData, other.historicalData)
                && java.util.Objects.equals(this.projectedData, other.projectedData)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.daysToReachCapacity == null
                                ? 43
                                : this.daysToReachCapacity.hashCode());
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result =
                (result * PRIME)
                        + (this.historicalData == null ? 43 : this.historicalData.hashCode());
        result =
                (result * PRIME)
                        + (this.projectedData == null ? 43 : this.projectedData.hashCode());
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
