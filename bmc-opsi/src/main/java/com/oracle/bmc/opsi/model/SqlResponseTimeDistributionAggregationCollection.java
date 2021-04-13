/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL response time distribution over the selected time window.
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
    builder = SqlResponseTimeDistributionAggregationCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlResponseTimeDistributionAggregationCollection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SqlResponseTimeDistributionAggregation> items;

        public Builder items(java.util.List<SqlResponseTimeDistributionAggregation> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlResponseTimeDistributionAggregationCollection build() {
            SqlResponseTimeDistributionAggregationCollection __instance__ =
                    new SqlResponseTimeDistributionAggregationCollection(
                            sqlIdentifier,
                            id,
                            databaseId,
                            timeIntervalStart,
                            timeIntervalEnd,
                            items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlResponseTimeDistributionAggregationCollection o) {
            Builder copiedBuilder =
                    sqlIdentifier(o.getSqlIdentifier())
                            .id(o.getId())
                            .databaseId(o.getDatabaseId())
                            .timeIntervalStart(o.getTimeIntervalStart())
                            .timeIntervalEnd(o.getTimeIntervalEnd())
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

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    String sqlIdentifier;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    String databaseId;

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
     * Array of pre defined SQL response time bucket id and SQL executions count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<SqlResponseTimeDistributionAggregation> items;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
