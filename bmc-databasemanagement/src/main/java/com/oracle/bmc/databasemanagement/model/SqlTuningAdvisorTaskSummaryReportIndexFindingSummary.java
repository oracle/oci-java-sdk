/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary for all the index findings in a SQL Tuning Advisor task. Includes the index's hash value, table name, schema, index name, reference count and index columns
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningAdvisorTaskSummaryReportIndexFindingSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskSummaryReportIndexFindingSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("indexHashValue")
        private Long indexHashValue;

        public Builder indexHashValue(Long indexHashValue) {
            this.indexHashValue = indexHashValue;
            this.__explicitlySet__.add("indexHashValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("indexName")
        private String indexName;

        public Builder indexName(String indexName) {
            this.indexName = indexName;
            this.__explicitlySet__.add("indexName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
        private Integer referenceCount;

        public Builder referenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            this.__explicitlySet__.add("referenceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("indexColumns")
        private java.util.List<String> indexColumns;

        public Builder indexColumns(java.util.List<String> indexColumns) {
            this.indexColumns = indexColumns;
            this.__explicitlySet__.add("indexColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReportIndexFindingSummary build() {
            SqlTuningAdvisorTaskSummaryReportIndexFindingSummary __instance__ =
                    new SqlTuningAdvisorTaskSummaryReportIndexFindingSummary(
                            indexHashValue,
                            indexName,
                            tableName,
                            schema,
                            referenceCount,
                            indexColumns);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportIndexFindingSummary o) {
            Builder copiedBuilder =
                    indexHashValue(o.getIndexHashValue())
                            .indexName(o.getIndexName())
                            .tableName(o.getTableName())
                            .schema(o.getSchema())
                            .referenceCount(o.getReferenceCount())
                            .indexColumns(o.getIndexColumns());

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
     * Numerical representation of the index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexHashValue")
    Long indexHashValue;

    /**
     * Name of the index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexName")
    String indexName;

    /**
     * Table's name related to the index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    String tableName;

    /**
     * Schema related to the index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    String schema;

    /**
     * The number of times the index is referenced within the SQL Tuning advisor task findings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
    Integer referenceCount;

    /**
     * Columns of the index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexColumns")
    java.util.List<String> indexColumns;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
