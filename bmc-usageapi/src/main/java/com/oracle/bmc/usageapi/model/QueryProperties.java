/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The query properties.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class QueryProperties {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private Filter filter;

        public Builder filter(Filter filter) {
            this.filter = filter;
            this.__explicitlySet__.add("filter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
        private java.math.BigDecimal compartmentDepth;

        public Builder compartmentDepth(java.math.BigDecimal compartmentDepth) {
            this.compartmentDepth = compartmentDepth;
            this.__explicitlySet__.add("compartmentDepth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("granularity")
        private Granularity granularity;

        public Builder granularity(Granularity granularity) {
            this.granularity = granularity;
            this.__explicitlySet__.add("granularity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryType")
        private QueryType queryType;

        public Builder queryType(QueryType queryType) {
            this.queryType = queryType;
            this.__explicitlySet__.add("queryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
        private Boolean isAggregateByTime;

        public Builder isAggregateByTime(Boolean isAggregateByTime) {
            this.isAggregateByTime = isAggregateByTime;
            this.__explicitlySet__.add("isAggregateByTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dateRange")
        private DateRange dateRange;

        public Builder dateRange(DateRange dateRange) {
            this.dateRange = dateRange;
            this.__explicitlySet__.add("dateRange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryProperties build() {
            QueryProperties __instance__ =
                    new QueryProperties(
                            groupBy,
                            groupByTag,
                            filter,
                            compartmentDepth,
                            granularity,
                            queryType,
                            isAggregateByTime,
                            dateRange);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryProperties o) {
            Builder copiedBuilder =
                    groupBy(o.getGroupBy())
                            .groupByTag(o.getGroupByTag())
                            .filter(o.getFilter())
                            .compartmentDepth(o.getCompartmentDepth())
                            .granularity(o.getGranularity())
                            .queryType(o.getQueryType())
                            .isAggregateByTime(o.getIsAggregateByTime())
                            .dateRange(o.getDateRange());

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
     * Aggregate the result by. For example: [ "tagNamespace", "tagKey", "tagValue", "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath", "compartmentId", "platform", "region", "logicalAd", "resourceId", "tenantId", "tenantName" ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    java.util.List<String> groupBy;

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list. For example: [ { "namespace": "oracle", "key": "createdBy" ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
    java.util.List<Tag> groupByTag;

    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    Filter filter;

    /**
     * The depth level of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
    java.math.BigDecimal compartmentDepth;
    /**
     * The usage granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data aggregation.
     * Allowed values are:
     *   DAILY
     *   MONTHLY
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Granularity {
        Daily("DAILY"),
        Monthly("MONTHLY"),

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
     * The usage granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data aggregation.
     * Allowed values are:
     *   DAILY
     *   MONTHLY
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("granularity")
    Granularity granularity;
    /**
     * The query usage type. COST by default if it is missing. Usage - Query the usage data. Cost - Query the cost/billing data.
     * Allowed values are:
     *   USAGE
     *   COST
     *   USAGE_AND_COST
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum QueryType {
        Usage("USAGE"),
        Cost("COST"),
        UsageAndCost("USAGE_AND_COST"),

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
     * The query usage type. COST by default if it is missing. Usage - Query the usage data. Cost - Query the cost/billing data.
     * Allowed values are:
     *   USAGE
     *   COST
     *   USAGE_AND_COST
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryType")
    QueryType queryType;

    /**
     * Specifies whether aggregated by time. If isAggregateByTime is true, all usage/cost over the query time period will be added up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
    Boolean isAggregateByTime;

    @com.fasterxml.jackson.annotation.JsonProperty("dateRange")
    DateRange dateRange;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
