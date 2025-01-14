/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of a column in a table fetched from the database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ColumnSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ColumnSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "columnName",
        "dataType",
        "length",
        "precision",
        "scale",
        "characterLength",
        "tableName",
        "schemaName"
    })
    public ColumnSummary(
            String columnName,
            String dataType,
            Long length,
            Integer precision,
            Integer scale,
            Integer characterLength,
            String tableName,
            String schemaName) {
        super();
        this.columnName = columnName;
        this.dataType = dataType;
        this.length = length;
        this.precision = precision;
        this.scale = scale;
        this.characterLength = characterLength;
        this.tableName = tableName;
        this.schemaName = schemaName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * Name of the column.
         *
         * @param columnName the value to set
         * @return this builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /** Data type of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * Data type of the column.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** Length of the data represented by the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Long length;

        /**
         * Length of the data represented by the column.
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(Long length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /** Precision of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("precision")
        private Integer precision;

        /**
         * Precision of the column.
         *
         * @param precision the value to set
         * @return this builder
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
            this.__explicitlySet__.add("precision");
            return this;
        }
        /** Scale of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("scale")
        private Integer scale;

        /**
         * Scale of the column.
         *
         * @param scale the value to set
         * @return this builder
         */
        public Builder scale(Integer scale) {
            this.scale = scale;
            this.__explicitlySet__.add("scale");
            return this;
        }
        /** Character length. */
        @com.fasterxml.jackson.annotation.JsonProperty("characterLength")
        private Integer characterLength;

        /**
         * Character length.
         *
         * @param characterLength the value to set
         * @return this builder
         */
        public Builder characterLength(Integer characterLength) {
            this.characterLength = characterLength;
            this.__explicitlySet__.add("characterLength");
            return this;
        }
        /** Name of the table. */
        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        /**
         * Name of the table.
         *
         * @param tableName the value to set
         * @return this builder
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }
        /** Name of the schema. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * Name of the schema.
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ColumnSummary build() {
            ColumnSummary model =
                    new ColumnSummary(
                            this.columnName,
                            this.dataType,
                            this.length,
                            this.precision,
                            this.scale,
                            this.characterLength,
                            this.tableName,
                            this.schemaName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ColumnSummary model) {
            if (model.wasPropertyExplicitlySet("columnName")) {
                this.columnName(model.getColumnName());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("precision")) {
                this.precision(model.getPrecision());
            }
            if (model.wasPropertyExplicitlySet("scale")) {
                this.scale(model.getScale());
            }
            if (model.wasPropertyExplicitlySet("characterLength")) {
                this.characterLength(model.getCharacterLength());
            }
            if (model.wasPropertyExplicitlySet("tableName")) {
                this.tableName(model.getTableName());
            }
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
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

    /** Name of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * Name of the column.
     *
     * @return the value
     */
    public String getColumnName() {
        return columnName;
    }

    /** Data type of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * Data type of the column.
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    /** Length of the data represented by the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Long length;

    /**
     * Length of the data represented by the column.
     *
     * @return the value
     */
    public Long getLength() {
        return length;
    }

    /** Precision of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    private final Integer precision;

    /**
     * Precision of the column.
     *
     * @return the value
     */
    public Integer getPrecision() {
        return precision;
    }

    /** Scale of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("scale")
    private final Integer scale;

    /**
     * Scale of the column.
     *
     * @return the value
     */
    public Integer getScale() {
        return scale;
    }

    /** Character length. */
    @com.fasterxml.jackson.annotation.JsonProperty("characterLength")
    private final Integer characterLength;

    /**
     * Character length.
     *
     * @return the value
     */
    public Integer getCharacterLength() {
        return characterLength;
    }

    /** Name of the table. */
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    /**
     * Name of the table.
     *
     * @return the value
     */
    public String getTableName() {
        return tableName;
    }

    /** Name of the schema. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * Name of the schema.
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
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
        sb.append("ColumnSummary(");
        sb.append("super=").append(super.toString());
        sb.append("columnName=").append(String.valueOf(this.columnName));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", precision=").append(String.valueOf(this.precision));
        sb.append(", scale=").append(String.valueOf(this.scale));
        sb.append(", characterLength=").append(String.valueOf(this.characterLength));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColumnSummary)) {
            return false;
        }

        ColumnSummary other = (ColumnSummary) o;
        return java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.precision, other.precision)
                && java.util.Objects.equals(this.scale, other.scale)
                && java.util.Objects.equals(this.characterLength, other.characterLength)
                && java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.precision == null ? 43 : this.precision.hashCode());
        result = (result * PRIME) + (this.scale == null ? 43 : this.scale.hashCode());
        result =
                (result * PRIME)
                        + (this.characterLength == null ? 43 : this.characterLength.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
