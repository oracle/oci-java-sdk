/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary for all the index findings in a SQL Tuning Advisor task. Includes the index's hash
 * value, table name, schema, index name, reference count and index columns <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlTuningAdvisorTaskSummaryReportIndexFindingSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlTuningAdvisorTaskSummaryReportIndexFindingSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "indexHashValue",
        "indexName",
        "tableName",
        "schema",
        "referenceCount",
        "indexColumns"
    })
    public SqlTuningAdvisorTaskSummaryReportIndexFindingSummary(
            Long indexHashValue,
            String indexName,
            String tableName,
            String schema,
            Integer referenceCount,
            java.util.List<String> indexColumns) {
        super();
        this.indexHashValue = indexHashValue;
        this.indexName = indexName;
        this.tableName = tableName;
        this.schema = schema;
        this.referenceCount = referenceCount;
        this.indexColumns = indexColumns;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Numerical representation of the index. */
        @com.fasterxml.jackson.annotation.JsonProperty("indexHashValue")
        private Long indexHashValue;

        /**
         * Numerical representation of the index.
         *
         * @param indexHashValue the value to set
         * @return this builder
         */
        public Builder indexHashValue(Long indexHashValue) {
            this.indexHashValue = indexHashValue;
            this.__explicitlySet__.add("indexHashValue");
            return this;
        }
        /** Name of the index. */
        @com.fasterxml.jackson.annotation.JsonProperty("indexName")
        private String indexName;

        /**
         * Name of the index.
         *
         * @param indexName the value to set
         * @return this builder
         */
        public Builder indexName(String indexName) {
            this.indexName = indexName;
            this.__explicitlySet__.add("indexName");
            return this;
        }
        /** Table's name related to the index. */
        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        /**
         * Table's name related to the index.
         *
         * @param tableName the value to set
         * @return this builder
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }
        /** Schema related to the index. */
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        /**
         * Schema related to the index.
         *
         * @param schema the value to set
         * @return this builder
         */
        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /**
         * The number of times the index is referenced within the SQL Tuning advisor task findings.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
        private Integer referenceCount;

        /**
         * The number of times the index is referenced within the SQL Tuning advisor task findings.
         *
         * @param referenceCount the value to set
         * @return this builder
         */
        public Builder referenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            this.__explicitlySet__.add("referenceCount");
            return this;
        }
        /** Columns of the index. */
        @com.fasterxml.jackson.annotation.JsonProperty("indexColumns")
        private java.util.List<String> indexColumns;

        /**
         * Columns of the index.
         *
         * @param indexColumns the value to set
         * @return this builder
         */
        public Builder indexColumns(java.util.List<String> indexColumns) {
            this.indexColumns = indexColumns;
            this.__explicitlySet__.add("indexColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReportIndexFindingSummary build() {
            SqlTuningAdvisorTaskSummaryReportIndexFindingSummary model =
                    new SqlTuningAdvisorTaskSummaryReportIndexFindingSummary(
                            this.indexHashValue,
                            this.indexName,
                            this.tableName,
                            this.schema,
                            this.referenceCount,
                            this.indexColumns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportIndexFindingSummary model) {
            if (model.wasPropertyExplicitlySet("indexHashValue")) {
                this.indexHashValue(model.getIndexHashValue());
            }
            if (model.wasPropertyExplicitlySet("indexName")) {
                this.indexName(model.getIndexName());
            }
            if (model.wasPropertyExplicitlySet("tableName")) {
                this.tableName(model.getTableName());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("referenceCount")) {
                this.referenceCount(model.getReferenceCount());
            }
            if (model.wasPropertyExplicitlySet("indexColumns")) {
                this.indexColumns(model.getIndexColumns());
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

    /** Numerical representation of the index. */
    @com.fasterxml.jackson.annotation.JsonProperty("indexHashValue")
    private final Long indexHashValue;

    /**
     * Numerical representation of the index.
     *
     * @return the value
     */
    public Long getIndexHashValue() {
        return indexHashValue;
    }

    /** Name of the index. */
    @com.fasterxml.jackson.annotation.JsonProperty("indexName")
    private final String indexName;

    /**
     * Name of the index.
     *
     * @return the value
     */
    public String getIndexName() {
        return indexName;
    }

    /** Table's name related to the index. */
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    /**
     * Table's name related to the index.
     *
     * @return the value
     */
    public String getTableName() {
        return tableName;
    }

    /** Schema related to the index. */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * Schema related to the index.
     *
     * @return the value
     */
    public String getSchema() {
        return schema;
    }

    /** The number of times the index is referenced within the SQL Tuning advisor task findings. */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
    private final Integer referenceCount;

    /**
     * The number of times the index is referenced within the SQL Tuning advisor task findings.
     *
     * @return the value
     */
    public Integer getReferenceCount() {
        return referenceCount;
    }

    /** Columns of the index. */
    @com.fasterxml.jackson.annotation.JsonProperty("indexColumns")
    private final java.util.List<String> indexColumns;

    /**
     * Columns of the index.
     *
     * @return the value
     */
    public java.util.List<String> getIndexColumns() {
        return indexColumns;
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
        sb.append("SqlTuningAdvisorTaskSummaryReportIndexFindingSummary(");
        sb.append("super=").append(super.toString());
        sb.append("indexHashValue=").append(String.valueOf(this.indexHashValue));
        sb.append(", indexName=").append(String.valueOf(this.indexName));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", referenceCount=").append(String.valueOf(this.referenceCount));
        sb.append(", indexColumns=").append(String.valueOf(this.indexColumns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskSummaryReportIndexFindingSummary)) {
            return false;
        }

        SqlTuningAdvisorTaskSummaryReportIndexFindingSummary other =
                (SqlTuningAdvisorTaskSummaryReportIndexFindingSummary) o;
        return java.util.Objects.equals(this.indexHashValue, other.indexHashValue)
                && java.util.Objects.equals(this.indexName, other.indexName)
                && java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.referenceCount, other.referenceCount)
                && java.util.Objects.equals(this.indexColumns, other.indexColumns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.indexHashValue == null ? 43 : this.indexHashValue.hashCode());
        result = (result * PRIME) + (this.indexName == null ? 43 : this.indexName.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceCount == null ? 43 : this.referenceCount.hashCode());
        result = (result * PRIME) + (this.indexColumns == null ? 43 : this.indexColumns.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
