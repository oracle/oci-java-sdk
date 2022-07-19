/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * Details for the '/usage' query.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestSummarizedUsagesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestSummarizedUsagesDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenantId",
        "timeUsageStarted",
        "timeUsageEnded",
        "granularity",
        "isAggregateByTime",
        "forecast",
        "queryType",
        "groupBy",
        "groupByTag",
        "compartmentDepth",
        "filter"
    })
    public RequestSummarizedUsagesDetails(
            String tenantId,
            java.util.Date timeUsageStarted,
            java.util.Date timeUsageEnded,
            Granularity granularity,
            Boolean isAggregateByTime,
            Forecast forecast,
            QueryType queryType,
            java.util.List<String> groupBy,
            java.util.List<Tag> groupByTag,
            java.math.BigDecimal compartmentDepth,
            Filter filter) {
        super();
        this.tenantId = tenantId;
        this.timeUsageStarted = timeUsageStarted;
        this.timeUsageEnded = timeUsageEnded;
        this.granularity = granularity;
        this.isAggregateByTime = isAggregateByTime;
        this.forecast = forecast;
        this.queryType = queryType;
        this.groupBy = groupBy;
        this.groupByTag = groupByTag;
        this.compartmentDepth = compartmentDepth;
        this.filter = filter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Tenant ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * Tenant ID.
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * The usage start time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
        private java.util.Date timeUsageStarted;

        /**
         * The usage start time.
         * @param timeUsageStarted the value to set
         * @return this builder
         **/
        public Builder timeUsageStarted(java.util.Date timeUsageStarted) {
            this.timeUsageStarted = timeUsageStarted;
            this.__explicitlySet__.add("timeUsageStarted");
            return this;
        }
        /**
         * The usage end time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
        private java.util.Date timeUsageEnded;

        /**
         * The usage end time.
         * @param timeUsageEnded the value to set
         * @return this builder
         **/
        public Builder timeUsageEnded(java.util.Date timeUsageEnded) {
            this.timeUsageEnded = timeUsageEnded;
            this.__explicitlySet__.add("timeUsageEnded");
            return this;
        }
        /**
         * The usage granularity.
         * HOURLY - Hourly data aggregation.
         * DAILY - Daily data aggregation.
         * MONTHLY - Monthly data aggregation.
         * TOTAL - Not yet supported.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("granularity")
        private Granularity granularity;

        /**
         * The usage granularity.
         * HOURLY - Hourly data aggregation.
         * DAILY - Daily data aggregation.
         * MONTHLY - Monthly data aggregation.
         * TOTAL - Not yet supported.
         *
         * @param granularity the value to set
         * @return this builder
         **/
        public Builder granularity(Granularity granularity) {
            this.granularity = granularity;
            this.__explicitlySet__.add("granularity");
            return this;
        }
        /**
         * Whether aggregated by time. If isAggregateByTime is true, all usage/cost over the query time period will be added up.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
        private Boolean isAggregateByTime;

        /**
         * Whether aggregated by time. If isAggregateByTime is true, all usage/cost over the query time period will be added up.
         * @param isAggregateByTime the value to set
         * @return this builder
         **/
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
        /**
         * The query usage type. COST by default if it is missing.
         * Usage - Query the usage data.
         * Cost - Query the cost/billing data.
         * Credit - Query the credit adjustments data.
         * ExpiredCredit - Query the expired credits data.
         * AllCredit - Query the credit adjustments and expired credit.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryType")
        private QueryType queryType;

        /**
         * The query usage type. COST by default if it is missing.
         * Usage - Query the usage data.
         * Cost - Query the cost/billing data.
         * Credit - Query the credit adjustments data.
         * ExpiredCredit - Query the expired credits data.
         * AllCredit - Query the credit adjustments and expired credit.
         *
         * @param queryType the value to set
         * @return this builder
         **/
        public Builder queryType(QueryType queryType) {
            this.queryType = queryType;
            this.__explicitlySet__.add("queryType");
            return this;
        }
        /**
         * Aggregate the result by.
         * example:
         *   {@code ["tagNamespace", "tagKey", "tagValue", "service", "skuName", "skuPartNumber", "unit",
         *     "compartmentName", "compartmentPath", "compartmentId", "platform", "region", "logicalAd",
         *     "resourceId", "tenantId", "tenantName"]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private java.util.List<String> groupBy;

        /**
         * Aggregate the result by.
         * example:
         *   {@code ["tagNamespace", "tagKey", "tagValue", "service", "skuName", "skuPartNumber", "unit",
         *     "compartmentName", "compartmentPath", "compartmentId", "platform", "region", "logicalAd",
         *     "resourceId", "tenantId", "tenantName"]}
         *
         * @param groupBy the value to set
         * @return this builder
         **/
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }
        /**
         * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list.
         * For example:
         *   {@code [{"namespace":"oracle", "key":"createdBy"]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
        private java.util.List<Tag> groupByTag;

        /**
         * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list.
         * For example:
         *   {@code [{"namespace":"oracle", "key":"createdBy"]}
         *
         * @param groupByTag the value to set
         * @return this builder
         **/
        public Builder groupByTag(java.util.List<Tag> groupByTag) {
            this.groupByTag = groupByTag;
            this.__explicitlySet__.add("groupByTag");
            return this;
        }
        /**
         * The compartment depth level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
        private java.math.BigDecimal compartmentDepth;

        /**
         * The compartment depth level.
         * @param compartmentDepth the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestSummarizedUsagesDetails build() {
            RequestSummarizedUsagesDetails __instance__ =
                    new RequestSummarizedUsagesDetails(
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
                            filter);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestSummarizedUsagesDetails o) {
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
                            .filter(o.getFilter());

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
     * Tenant ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * Tenant ID.
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    /**
     * The usage start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    private final java.util.Date timeUsageStarted;

    /**
     * The usage start time.
     * @return the value
     **/
    public java.util.Date getTimeUsageStarted() {
        return timeUsageStarted;
    }

    /**
     * The usage end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    private final java.util.Date timeUsageEnded;

    /**
     * The usage end time.
     * @return the value
     **/
    public java.util.Date getTimeUsageEnded() {
        return timeUsageEnded;
    }

    /**
     * The usage granularity.
     * HOURLY - Hourly data aggregation.
     * DAILY - Daily data aggregation.
     * MONTHLY - Monthly data aggregation.
     * TOTAL - Not yet supported.
     *
     **/
    public enum Granularity {
        Hourly("HOURLY"),
        Daily("DAILY"),
        Monthly("MONTHLY"),
        Total("TOTAL"),
        ;

        private final String value;
        private static java.util.Map<String, Granularity> map;

        static {
            map = new java.util.HashMap<>();
            for (Granularity v : Granularity.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Granularity: " + key);
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
    private final Granularity granularity;

    /**
     * The usage granularity.
     * HOURLY - Hourly data aggregation.
     * DAILY - Daily data aggregation.
     * MONTHLY - Monthly data aggregation.
     * TOTAL - Not yet supported.
     *
     * @return the value
     **/
    public Granularity getGranularity() {
        return granularity;
    }

    /**
     * Whether aggregated by time. If isAggregateByTime is true, all usage/cost over the query time period will be added up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAggregateByTime")
    private final Boolean isAggregateByTime;

    /**
     * Whether aggregated by time. If isAggregateByTime is true, all usage/cost over the query time period will be added up.
     * @return the value
     **/
    public Boolean getIsAggregateByTime() {
        return isAggregateByTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("forecast")
    private final Forecast forecast;

    public Forecast getForecast() {
        return forecast;
    }

    /**
     * The query usage type. COST by default if it is missing.
     * Usage - Query the usage data.
     * Cost - Query the cost/billing data.
     * Credit - Query the credit adjustments data.
     * ExpiredCredit - Query the expired credits data.
     * AllCredit - Query the credit adjustments and expired credit.
     *
     **/
    public enum QueryType {
        Usage("USAGE"),
        Cost("COST"),
        Credit("CREDIT"),
        Expiredcredit("EXPIREDCREDIT"),
        Allcredit("ALLCREDIT"),
        ;

        private final String value;
        private static java.util.Map<String, QueryType> map;

        static {
            map = new java.util.HashMap<>();
            for (QueryType v : QueryType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid QueryType: " + key);
        }
    };
    /**
     * The query usage type. COST by default if it is missing.
     * Usage - Query the usage data.
     * Cost - Query the cost/billing data.
     * Credit - Query the credit adjustments data.
     * ExpiredCredit - Query the expired credits data.
     * AllCredit - Query the credit adjustments and expired credit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryType")
    private final QueryType queryType;

    /**
     * The query usage type. COST by default if it is missing.
     * Usage - Query the usage data.
     * Cost - Query the cost/billing data.
     * Credit - Query the credit adjustments data.
     * ExpiredCredit - Query the expired credits data.
     * AllCredit - Query the credit adjustments and expired credit.
     *
     * @return the value
     **/
    public QueryType getQueryType() {
        return queryType;
    }

    /**
     * Aggregate the result by.
     * example:
     *   {@code ["tagNamespace", "tagKey", "tagValue", "service", "skuName", "skuPartNumber", "unit",
     *     "compartmentName", "compartmentPath", "compartmentId", "platform", "region", "logicalAd",
     *     "resourceId", "tenantId", "tenantName"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    private final java.util.List<String> groupBy;

    /**
     * Aggregate the result by.
     * example:
     *   {@code ["tagNamespace", "tagKey", "tagValue", "service", "skuName", "skuPartNumber", "unit",
     *     "compartmentName", "compartmentPath", "compartmentId", "platform", "region", "logicalAd",
     *     "resourceId", "tenantId", "tenantName"]}
     *
     * @return the value
     **/
    public java.util.List<String> getGroupBy() {
        return groupBy;
    }

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list.
     * For example:
     *   {@code [{"namespace":"oracle", "key":"createdBy"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
    private final java.util.List<Tag> groupByTag;

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only supports one tag in the list.
     * For example:
     *   {@code [{"namespace":"oracle", "key":"createdBy"]}
     *
     * @return the value
     **/
    public java.util.List<Tag> getGroupByTag() {
        return groupByTag;
    }

    /**
     * The compartment depth level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
    private final java.math.BigDecimal compartmentDepth;

    /**
     * The compartment depth level.
     * @return the value
     **/
    public java.math.BigDecimal getCompartmentDepth() {
        return compartmentDepth;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final Filter filter;

    public Filter getFilter() {
        return filter;
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
        sb.append("RequestSummarizedUsagesDetails(");
        sb.append("tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", timeUsageStarted=").append(String.valueOf(this.timeUsageStarted));
        sb.append(", timeUsageEnded=").append(String.valueOf(this.timeUsageEnded));
        sb.append(", granularity=").append(String.valueOf(this.granularity));
        sb.append(", isAggregateByTime=").append(String.valueOf(this.isAggregateByTime));
        sb.append(", forecast=").append(String.valueOf(this.forecast));
        sb.append(", queryType=").append(String.valueOf(this.queryType));
        sb.append(", groupBy=").append(String.valueOf(this.groupBy));
        sb.append(", groupByTag=").append(String.valueOf(this.groupByTag));
        sb.append(", compartmentDepth=").append(String.valueOf(this.compartmentDepth));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedUsagesDetails)) {
            return false;
        }

        RequestSummarizedUsagesDetails other = (RequestSummarizedUsagesDetails) o;
        return java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.timeUsageStarted, other.timeUsageStarted)
                && java.util.Objects.equals(this.timeUsageEnded, other.timeUsageEnded)
                && java.util.Objects.equals(this.granularity, other.granularity)
                && java.util.Objects.equals(this.isAggregateByTime, other.isAggregateByTime)
                && java.util.Objects.equals(this.forecast, other.forecast)
                && java.util.Objects.equals(this.queryType, other.queryType)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.groupByTag, other.groupByTag)
                && java.util.Objects.equals(this.compartmentDepth, other.compartmentDepth)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageStarted == null ? 43 : this.timeUsageStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageEnded == null ? 43 : this.timeUsageEnded.hashCode());
        result = (result * PRIME) + (this.granularity == null ? 43 : this.granularity.hashCode());
        result =
                (result * PRIME)
                        + (this.isAggregateByTime == null ? 43 : this.isAggregateByTime.hashCode());
        result = (result * PRIME) + (this.forecast == null ? 43 : this.forecast.hashCode());
        result = (result * PRIME) + (this.queryType == null ? 43 : this.queryType.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.groupByTag == null ? 43 : this.groupByTag.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentDepth == null ? 43 : this.compartmentDepth.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
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
