/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestSummarizedUsagesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RequestSummarizedUsagesDetails {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestSummarizedUsagesDetails build() {
            RequestSummarizedUsagesDetails __instance__ =
                    new RequestSummarizedUsagesDetails(
                            tenantId,
                            timeUsageStarted,
                            timeUsageEnded,
                            granularity,
                            queryType,
                            groupBy,
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
                            .queryType(o.getQueryType())
                            .groupBy(o.getGroupBy())
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

    /**
     * Tenant ID
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
    Granularity granularity;
    /**
     * The query usage type.
     * Usage - Query the usage data.
     * Cost - Query the cost/billing data.
     *
     **/
    public enum QueryType {
        Usage("USAGE"),
        Cost("COST"),
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
     * The query usage type.
     * Usage - Query the usage data.
     * Cost - Query the cost/billing data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryType")
    QueryType queryType;

    /**
     * Aggregate the result by.
     * example:
     *   `[\"service\"]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    java.util.List<String> groupBy;

    /**
     * The compartment depth level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
    java.math.BigDecimal compartmentDepth;

    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    Filter filter;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
