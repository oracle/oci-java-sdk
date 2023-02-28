/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The query properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class QueryProperties
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "groupBy",
        "groupByTag",
        "filter",
        "compartmentDepth",
        "granularity",
        "queryType",
        "isAggregateByTime",
        "dateRange"
    })
    public QueryProperties(
            java.util.List<String> groupBy,
            java.util.List<Tag> groupByTag,
            Filter filter,
            java.math.BigDecimal compartmentDepth,
            Granularity granularity,
            QueryType queryType,
            Boolean isAggregateByTime,
            DateRange dateRange) {
        super();
        this.groupBy = groupBy;
        this.groupByTag = groupByTag;
        this.filter = filter;
        this.compartmentDepth = compartmentDepth;
        this.granularity = granularity;
        this.queryType = queryType;
        this.isAggregateByTime = isAggregateByTime;
        this.dateRange = dateRange;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Aggregate the result by. For example: [ "tagNamespace", "tagKey", "tagValue", "service",
         * "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
         * "compartmentId", "platform", "region", "logicalAd", "resourceId", "tenantId",
         * "tenantName" ]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private java.util.List<String> groupBy;

        /**
         * Aggregate the result by. For example: [ "tagNamespace", "tagKey", "tagValue", "service",
         * "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
         * "compartmentId", "platform", "region", "logicalAd", "resourceId", "tenantId",
         * "tenantName" ]
         *
         * @param groupBy the value to set
         * @return this builder
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }
        /**
         * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only
         * supports one tag in the list. For example: [ { "namespace": "oracle", "key": "createdBy"
         * ]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
        private java.util.List<Tag> groupByTag;

        /**
         * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only
         * supports one tag in the list. For example: [ { "namespace": "oracle", "key": "createdBy"
         * ]
         *
         * @param groupByTag the value to set
         * @return this builder
         */
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
        /** The depth level of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
        private java.math.BigDecimal compartmentDepth;

        /**
         * The depth level of the compartment.
         *
         * @param compartmentDepth the value to set
         * @return this builder
         */
        public Builder compartmentDepth(java.math.BigDecimal compartmentDepth) {
            this.compartmentDepth = compartmentDepth;
            this.__explicitlySet__.add("compartmentDepth");
            return this;
        }
        /**
         * The usage granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data
         * aggregation. Allowed values are: DAILY MONTHLY
         */
        @com.fasterxml.jackson.annotation.JsonProperty("granularity")
        private Granularity granularity;

        /**
         * The usage granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data
         * aggregation. Allowed values are: DAILY MONTHLY
         *
         * @param granularity the value to set
         * @return this builder
         */
        public Builder granularity(Granularity granularity) {
            this.granularity = granularity;
            this.__explicitlySet__.add("granularity");
            return this;
        }
        /**
         * The query usage type. COST by default if it is missing. Usage - Query the usage data.
         * Cost - Query the cost/billing data. Allowed values are: USAGE COST USAGE_AND_COST
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryType")
        private QueryType queryType;

        /**
         * The query usage type. COST by default if it is missing. Usage - Query the usage data.
         * Cost - Query the cost/billing data. Allowed values are: USAGE COST USAGE_AND_COST
         *
         * @param queryType the value to set
         * @return this builder
         */
        public Builder queryType(QueryType queryType) {
            this.queryType = queryType;
            this.__explicitlySet__.add("queryType");
            return this;
        }
        /**
         * Specifies whether aggregated by time. If isAggregateByTime is true, all usage or cost
         * over the query time period will be added up.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
        private Boolean isAggregateByTime;

        /**
         * Specifies whether aggregated by time. If isAggregateByTime is true, all usage or cost
         * over the query time period will be added up.
         *
         * @param isAggregateByTime the value to set
         * @return this builder
         */
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
            QueryProperties model =
                    new QueryProperties(
                            this.groupBy,
                            this.groupByTag,
                            this.filter,
                            this.compartmentDepth,
                            this.granularity,
                            this.queryType,
                            this.isAggregateByTime,
                            this.dateRange);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryProperties model) {
            if (model.wasPropertyExplicitlySet("groupBy")) {
                this.groupBy(model.getGroupBy());
            }
            if (model.wasPropertyExplicitlySet("groupByTag")) {
                this.groupByTag(model.getGroupByTag());
            }
            if (model.wasPropertyExplicitlySet("filter")) {
                this.filter(model.getFilter());
            }
            if (model.wasPropertyExplicitlySet("compartmentDepth")) {
                this.compartmentDepth(model.getCompartmentDepth());
            }
            if (model.wasPropertyExplicitlySet("granularity")) {
                this.granularity(model.getGranularity());
            }
            if (model.wasPropertyExplicitlySet("queryType")) {
                this.queryType(model.getQueryType());
            }
            if (model.wasPropertyExplicitlySet("isAggregateByTime")) {
                this.isAggregateByTime(model.getIsAggregateByTime());
            }
            if (model.wasPropertyExplicitlySet("dateRange")) {
                this.dateRange(model.getDateRange());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Aggregate the result by. For example: [ "tagNamespace", "tagKey", "tagValue", "service",
     * "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath", "compartmentId",
     * "platform", "region", "logicalAd", "resourceId", "tenantId", "tenantName" ]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    private final java.util.List<String> groupBy;

    /**
     * Aggregate the result by. For example: [ "tagNamespace", "tagKey", "tagValue", "service",
     * "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath", "compartmentId",
     * "platform", "region", "logicalAd", "resourceId", "tenantId", "tenantName" ]
     *
     * @return the value
     */
    public java.util.List<String> getGroupBy() {
        return groupBy;
    }

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only
     * supports one tag in the list. For example: [ { "namespace": "oracle", "key": "createdBy" ]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
    private final java.util.List<Tag> groupByTag;

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only
     * supports one tag in the list. For example: [ { "namespace": "oracle", "key": "createdBy" ]
     *
     * @return the value
     */
    public java.util.List<Tag> getGroupByTag() {
        return groupByTag;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final Filter filter;

    public Filter getFilter() {
        return filter;
    }

    /** The depth level of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
    private final java.math.BigDecimal compartmentDepth;

    /**
     * The depth level of the compartment.
     *
     * @return the value
     */
    public java.math.BigDecimal getCompartmentDepth() {
        return compartmentDepth;
    }

    /**
     * The usage granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data aggregation.
     * Allowed values are: DAILY MONTHLY
     */
    public enum Granularity implements com.oracle.bmc.http.internal.BmcEnum {
        Daily("DAILY"),
        Monthly("MONTHLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Granularity.class);

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
     * Allowed values are: DAILY MONTHLY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("granularity")
    private final Granularity granularity;

    /**
     * The usage granularity. DAILY - Daily data aggregation. MONTHLY - Monthly data aggregation.
     * Allowed values are: DAILY MONTHLY
     *
     * @return the value
     */
    public Granularity getGranularity() {
        return granularity;
    }

    /**
     * The query usage type. COST by default if it is missing. Usage - Query the usage data. Cost -
     * Query the cost/billing data. Allowed values are: USAGE COST USAGE_AND_COST
     */
    public enum QueryType implements com.oracle.bmc.http.internal.BmcEnum {
        Usage("USAGE"),
        Cost("COST"),
        UsageAndCost("USAGE_AND_COST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(QueryType.class);

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
     * The query usage type. COST by default if it is missing. Usage - Query the usage data. Cost -
     * Query the cost/billing data. Allowed values are: USAGE COST USAGE_AND_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryType")
    private final QueryType queryType;

    /**
     * The query usage type. COST by default if it is missing. Usage - Query the usage data. Cost -
     * Query the cost/billing data. Allowed values are: USAGE COST USAGE_AND_COST
     *
     * @return the value
     */
    public QueryType getQueryType() {
        return queryType;
    }

    /**
     * Specifies whether aggregated by time. If isAggregateByTime is true, all usage or cost over
     * the query time period will be added up.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
    private final Boolean isAggregateByTime;

    /**
     * Specifies whether aggregated by time. If isAggregateByTime is true, all usage or cost over
     * the query time period will be added up.
     *
     * @return the value
     */
    public Boolean getIsAggregateByTime() {
        return isAggregateByTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dateRange")
    private final DateRange dateRange;

    public DateRange getDateRange() {
        return dateRange;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryProperties(");
        sb.append("super=").append(super.toString());
        sb.append("groupBy=").append(String.valueOf(this.groupBy));
        sb.append(", groupByTag=").append(String.valueOf(this.groupByTag));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(", compartmentDepth=").append(String.valueOf(this.compartmentDepth));
        sb.append(", granularity=").append(String.valueOf(this.granularity));
        sb.append(", queryType=").append(String.valueOf(this.queryType));
        sb.append(", isAggregateByTime=").append(String.valueOf(this.isAggregateByTime));
        sb.append(", dateRange=").append(String.valueOf(this.dateRange));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryProperties)) {
            return false;
        }

        QueryProperties other = (QueryProperties) o;
        return java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.groupByTag, other.groupByTag)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.compartmentDepth, other.compartmentDepth)
                && java.util.Objects.equals(this.granularity, other.granularity)
                && java.util.Objects.equals(this.queryType, other.queryType)
                && java.util.Objects.equals(this.isAggregateByTime, other.isAggregateByTime)
                && java.util.Objects.equals(this.dateRange, other.dateRange)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.groupByTag == null ? 43 : this.groupByTag.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentDepth == null ? 43 : this.compartmentDepth.hashCode());
        result = (result * PRIME) + (this.granularity == null ? 43 : this.granularity.hashCode());
        result = (result * PRIME) + (this.queryType == null ? 43 : this.queryType.hashCode());
        result =
                (result * PRIME)
                        + (this.isAggregateByTime == null ? 43 : this.isAggregateByTime.hashCode());
        result = (result * PRIME) + (this.dateRange == null ? 43 : this.dateRange.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
