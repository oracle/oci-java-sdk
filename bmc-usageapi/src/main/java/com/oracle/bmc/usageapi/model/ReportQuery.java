/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The request of the generated Cost Analysis report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReportQuery.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ReportQuery {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
        private java.util.Date timeUsageStarted;

        public Builder timeUsageStarted(java.util.Date timeUsageStarted) {
            this.timeUsageStarted = timeUsageStarted;
            this.__explicitlySet__.add("timeUsageStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
        private java.util.Date timeUsageEnded;

        public Builder timeUsageEnded(java.util.Date timeUsageEnded) {
            this.timeUsageEnded = timeUsageEnded;
            this.__explicitlySet__.add("timeUsageEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("granularity")
        private Granularity granularity;

        public Builder granularity(Granularity granularity) {
            this.granularity = granularity;
            this.__explicitlySet__.add("granularity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
        private Boolean isAggregateByTime;

        public Builder isAggregateByTime(Boolean isAggregateByTime) {
            this.isAggregateByTime = isAggregateByTime;
            this.__explicitlySet__.add("isAggregateByTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forecast")
        private Forecast forecast;

        public Builder forecast(Forecast forecast) {
            this.forecast = forecast;
            this.__explicitlySet__.add("forecast");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryType")
        private QueryType queryType;

        public Builder queryType(QueryType queryType) {
            this.queryType = queryType;
            this.__explicitlySet__.add("queryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private java.util.List<String> groupBy;

        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
        private java.util.List<Tag> groupByTag;

        public Builder groupByTag(java.util.List<Tag> groupByTag) {
            this.groupByTag = groupByTag;
            this.__explicitlySet__.add("groupByTag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
        private java.math.BigDecimal compartmentDepth;

        public Builder compartmentDepth(java.math.BigDecimal compartmentDepth) {
            this.compartmentDepth = compartmentDepth;
            this.__explicitlySet__.add("compartmentDepth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private Filter filter;

        public Builder filter(Filter filter) {
            this.filter = filter;
            this.__explicitlySet__.add("filter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dateRangeName")
        private DateRangeName dateRangeName;

        public Builder dateRangeName(DateRangeName dateRangeName) {
            this.dateRangeName = dateRangeName;
            this.__explicitlySet__.add("dateRangeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReportQuery build() {
            ReportQuery __instance__ =
                    new ReportQuery(
                            tenantId,
                            timeUsageStarted,
                            timeUsageEnded,
                            granularity,
                            isAggregateByTime,
                            forecast,
                            queryType,
                            groupBy,
                            groupByTag,
                            compartmentDepth,
                            filter,
                            dateRangeName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReportQuery o) {
            Builder copiedBuilder =
                    tenantId(o.getTenantId())
                            .timeUsageStarted(o.getTimeUsageStarted())
                            .timeUsageEnded(o.getTimeUsageEnded())
                            .granularity(o.getGranularity())
                            .isAggregateByTime(o.getIsAggregateByTime())
                            .forecast(o.getForecast())
                            .queryType(o.getQueryType())
                            .groupBy(o.getGroupBy())
                            .groupByTag(o.getGroupByTag())
                            .compartmentDepth(o.getCompartmentDepth())
                            .filter(o.getFilter())
                            .dateRangeName(o.getDateRangeName());

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
     * Tenant ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    String tenantId;

    /**
     * The usage start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    java.util.Date timeUsageStarted;

    /**
     * The usage end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    java.util.Date timeUsageEnded;
    /**
     * The usage granularity.
     * HOURLY - Hourly data aggregation.
     * DAILY - Daily data aggregation.
     * MONTHLY - Monthly data aggregation.
     * TOTAL - Not yet supported.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Granularity {
        Hourly("HOURLY"),
        Daily("DAILY"),
        Monthly("MONTHLY"),
        Total("TOTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Granularity> map;

        static {
            map = new java.util.HashMap<>();
            for (Granularity v : Granularity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Granularity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Granularity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Granularity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The usage granularity.
     * HOURLY - Hourly data aggregation.
     * DAILY - Daily data aggregation.
     * MONTHLY - Monthly data aggregation.
     * TOTAL - Not yet supported.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("granularity")
    Granularity granularity;

    /**
     * Whether aggregated by time. If isAggregateByTime is true, all usage/cost over the query time period will be added up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
    Boolean isAggregateByTime;

    @com.fasterxml.jackson.annotation.JsonProperty("forecast")
    Forecast forecast;
    /**
     * The query usage type. COST by default if it is missing.
     * Usage - Query the usage data.
     * Cost - Query the cost/billing data.
     * Credit - Query the credit adjustments data.
     * ExpiredCredit - Query the expired credits data
     * AllCredit - Query the credit adjustments and expired credit
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum QueryType {
        Usage("USAGE"),
        Cost("COST"),
        Credit("CREDIT"),
        Expiredcredit("EXPIREDCREDIT"),
        Allcredit("ALLCREDIT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, QueryType> map;

        static {
            map = new java.util.HashMap<>();
            for (QueryType v : QueryType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        QueryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static QueryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'QueryType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The query usage type. COST by default if it is missing.
     * Usage - Query the usage data.
     * Cost - Query the cost/billing data.
     * Credit - Query the credit adjustments data.
     * ExpiredCredit - Query the expired credits data
     * AllCredit - Query the credit adjustments and expired credit
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryType")
    QueryType queryType;

    /**
     * Aggregate the result by.
     * example:
     *   {@code ["tagNamespace", "tagKey", "tagValue", "service", "skuName", "skuPartNumber", "unit",
     *     "compartmentName", "compartmentPath", "compartmentId", "platform", "region", "logicalAd",
     *     "resourceId", "tenantId", "tenantName"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    java.util.List<String> groupBy;

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list.
     * For example:
     *   {@code [{"namespace":"oracle", "key":"createdBy"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
    java.util.List<Tag> groupByTag;

    /**
     * The compartment depth level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
    java.math.BigDecimal compartmentDepth;

    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    Filter filter;
    /**
     * The UI date range, for example, LAST_THREE_MONTHS. Conflicts with timeUsageStarted and timeUsageEnded.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DateRangeName {
        LastSevenDays("LAST_SEVEN_DAYS"),
        LastTenDays("LAST_TEN_DAYS"),
        Mtd("MTD"),
        LastTwoMonths("LAST_TWO_MONTHS"),
        LastThreeMonths("LAST_THREE_MONTHS"),
        All("ALL"),
        LastSixMonths("LAST_SIX_MONTHS"),
        LastOneYear("LAST_ONE_YEAR"),
        Ytd("YTD"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DateRangeName> map;

        static {
            map = new java.util.HashMap<>();
            for (DateRangeName v : DateRangeName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DateRangeName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DateRangeName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DateRangeName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The UI date range, for example, LAST_THREE_MONTHS. Conflicts with timeUsageStarted and timeUsageEnded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dateRangeName")
    DateRangeName dateRangeName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
