/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
public final class DataPreview extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * Name of the entity for which data preview is requested.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * Name of the entity for which data preview is requested.
         * @param entityName the value to set
         * @return this builder
         **/
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /**
         * Total number of rows taken for sampling.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sampleRowsCount")
        private Integer sampleRowsCount;

        /**
         * Total number of rows taken for sampling.
         * @param sampleRowsCount the value to set
         * @return this builder
         **/
        public Builder sampleRowsCount(Integer sampleRowsCount) {
            this.sampleRowsCount = sampleRowsCount;
            this.__explicitlySet__.add("sampleRowsCount");
            return this;
        }
        /**
         * Array of column definition for the preview result.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<Column> columns;

        /**
         * Array of column definition for the preview result.
         * @param columns the value to set
         * @return this builder
         **/
        public Builder columns(java.util.List<Column> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }
        /**
         * Array of row values for the preview result.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rows")
        private java.util.List<Row> rows;

        /**
         * Array of row values for the preview result.
         * @param rows the value to set
         * @return this builder
         **/
        public Builder rows(java.util.List<Row> rows) {
            this.rows = rows;
            this.__explicitlySet__.add("rows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataPreview build() {
            DataPreview model =
                    new DataPreview(this.entityName, this.sampleRowsCount, this.columns, this.rows);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataPreview model) {
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
            }
            if (model.wasPropertyExplicitlySet("sampleRowsCount")) {
                this.sampleRowsCount(model.getSampleRowsCount());
            }
            if (model.wasPropertyExplicitlySet("columns")) {
                this.columns(model.getColumns());
            }
            if (model.wasPropertyExplicitlySet("rows")) {
                this.rows(model.getRows());
            }
            return this;
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
     * Name of the entity for which data preview is requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * Name of the entity for which data preview is requested.
     * @return the value
     **/
    public String getEntityName() {
        return entityName;
    }

    /**
     * Total number of rows taken for sampling.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleRowsCount")
    private final Integer sampleRowsCount;

    /**
     * Total number of rows taken for sampling.
     * @return the value
     **/
    public Integer getSampleRowsCount() {
        return sampleRowsCount;
    }

    /**
     * Array of column definition for the preview result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<Column> columns;

    /**
     * Array of column definition for the preview result.
     * @return the value
     **/
    public java.util.List<Column> getColumns() {
        return columns;
    }

    /**
     * Array of row values for the preview result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rows")
    private final java.util.List<Row> rows;

    /**
     * Array of row values for the preview result.
     * @return the value
     **/
    public java.util.List<Row> getRows() {
        return rows;
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
        sb.append("DataPreview(");
        sb.append("super=").append(super.toString());
        sb.append("entityName=").append(String.valueOf(this.entityName));
        sb.append(", sampleRowsCount=").append(String.valueOf(this.sampleRowsCount));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", rows=").append(String.valueOf(this.rows));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
