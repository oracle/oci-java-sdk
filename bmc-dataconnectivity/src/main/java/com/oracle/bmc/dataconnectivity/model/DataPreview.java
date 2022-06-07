/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The data preview response.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataPreview.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataPreview {
    @Deprecated
    @java.beans.ConstructorProperties({"entityName", "sampleRowsCount", "columns", "rows"})
    public DataPreview(
            String entityName,
            Integer sampleRowsCount,
            java.util.List<Column> columns,
            java.util.List<Row> rows) {
        super();
        this.entityName = entityName;
        this.sampleRowsCount = sampleRowsCount;
        this.columns = columns;
        this.rows = rows;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sampleRowsCount")
        private Integer sampleRowsCount;

        public Builder sampleRowsCount(Integer sampleRowsCount) {
            this.sampleRowsCount = sampleRowsCount;
            this.__explicitlySet__.add("sampleRowsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<Column> columns;

        public Builder columns(java.util.List<Column> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rows")
        private java.util.List<Row> rows;

        public Builder rows(java.util.List<Row> rows) {
            this.rows = rows;
            this.__explicitlySet__.add("rows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataPreview build() {
            DataPreview __instance__ = new DataPreview(entityName, sampleRowsCount, columns, rows);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataPreview o) {
            Builder copiedBuilder =
                    entityName(o.getEntityName())
                            .sampleRowsCount(o.getSampleRowsCount())
                            .columns(o.getColumns())
                            .rows(o.getRows());

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
     * Name of the entity for which data preview was requested
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    public String getEntityName() {
        return entityName;
    }

    /**
     * Total number of rows taken for sampling
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleRowsCount")
    private final Integer sampleRowsCount;

    public Integer getSampleRowsCount() {
        return sampleRowsCount;
    }

    /**
     * Array of column definition for the preview result
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<Column> columns;

    public java.util.List<Column> getColumns() {
        return columns;
    }

    /**
     * Array of rows values for the preview result
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rows")
    private final java.util.List<Row> rows;

    public java.util.List<Row> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataPreview(");
        sb.append("entityName=").append(String.valueOf(this.entityName));
        sb.append(", sampleRowsCount=").append(String.valueOf(this.sampleRowsCount));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", rows=").append(String.valueOf(this.rows));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataPreview)) {
            return false;
        }

        DataPreview other = (DataPreview) o;
        return java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.sampleRowsCount, other.sampleRowsCount)
                && java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.rows, other.rows)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result =
                (result * PRIME)
                        + (this.sampleRowsCount == null ? 43 : this.sampleRowsCount.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.rows == null ? 43 : this.rows.hashCode());
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
