/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of a column in a table fetched from the database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ColumnSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ColumnSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Long length;

        public Builder length(Long length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("precision")
        private Integer precision;

        public Builder precision(Integer precision) {
            this.precision = precision;
            this.__explicitlySet__.add("precision");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scale")
        private Integer scale;

        public Builder scale(Integer scale) {
            this.scale = scale;
            this.__explicitlySet__.add("scale");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("characterLength")
        private Integer characterLength;

        public Builder characterLength(Integer characterLength) {
            this.characterLength = characterLength;
            this.__explicitlySet__.add("characterLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ColumnSummary build() {
            ColumnSummary __instance__ =
                    new ColumnSummary(
                            columnName,
                            dataType,
                            length,
                            precision,
                            scale,
                            characterLength,
                            tableName,
                            schemaName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ColumnSummary o) {
            Builder copiedBuilder =
                    columnName(o.getColumnName())
                            .dataType(o.getDataType())
                            .length(o.getLength())
                            .precision(o.getPrecision())
                            .scale(o.getScale())
                            .characterLength(o.getCharacterLength())
                            .tableName(o.getTableName())
                            .schemaName(o.getSchemaName());

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
     * Name of the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    String columnName;

    /**
     * Data type of the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    String dataType;

    /**
     * Length of the data represented by the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    Long length;

    /**
     * Precision of the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    Integer precision;

    /**
     * Scale of the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scale")
    Integer scale;

    /**
     * Character length.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("characterLength")
    Integer characterLength;

    /**
     * Name of the table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    String tableName;

    /**
     * Name of the schema.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    String schemaName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
