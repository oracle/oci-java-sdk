/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary of the datatype, unit and related metadata of an individual row element of a query result row that is returned.
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
    builder = QueryResultRowTypeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class QueryResultRowTypeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowTypeSummaries")
        private java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries;

        public Builder queryResultRowTypeSummaries(
                java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries) {
            this.queryResultRowTypeSummaries = queryResultRowTypeSummaries;
            this.__explicitlySet__.add("queryResultRowTypeSummaries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultRowTypeSummary build() {
            QueryResultRowTypeSummary __instance__ =
                    new QueryResultRowTypeSummary(
                            dataType, unit, displayName, expression, queryResultRowTypeSummaries);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultRowTypeSummary o) {
            Builder copiedBuilder =
                    dataType(o.getDataType())
                            .unit(o.getUnit())
                            .displayName(o.getDisplayName())
                            .expression(o.getExpression())
                            .queryResultRowTypeSummaries(o.getQueryResultRowTypeSummaries());

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
     * Datatype of the query result row element.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    String dataType;

    /**
     * Granular unit in which the query result row element's data is represented.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    String unit;

    /**
     * Alias name if an alias is used for the query result row element or an assigned display name from the query language
     * in some default cases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Actual show expression in the user typed query that produced this column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    String expression;

    /**
     * A query result row type summary object that represents a nested table structure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowTypeSummaries")
    java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
