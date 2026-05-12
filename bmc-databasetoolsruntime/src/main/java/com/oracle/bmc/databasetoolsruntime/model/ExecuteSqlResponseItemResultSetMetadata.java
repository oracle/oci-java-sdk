/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Metadata of the column <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExecuteSqlResponseItemResultSetMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecuteSqlResponseItemResultSetMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseColumnName",
        "uniqueColumnName",
        "columnTypeName",
        "precision",
        "scale",
        "isNullable"
    })
    public ExecuteSqlResponseItemResultSetMetadata(
            String databaseColumnName,
            String uniqueColumnName,
            String columnTypeName,
            Integer precision,
            Integer scale,
            Boolean isNullable) {
        super();
        this.databaseColumnName = databaseColumnName;
        this.uniqueColumnName = uniqueColumnName;
        this.columnTypeName = columnTypeName;
        this.precision = precision;
        this.scale = scale;
        this.isNullable = isNullable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the column in the Oracle Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseColumnName")
        private String databaseColumnName;

        /**
         * Name of the column in the Oracle Database.
         *
         * @param databaseColumnName the value to set
         * @return this builder
         */
        public Builder databaseColumnName(String databaseColumnName) {
            this.databaseColumnName = databaseColumnName;
            this.__explicitlySet__.add("databaseColumnName");
            return this;
        }
        /** Name of the column in the response Result Set. */
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueColumnName")
        private String uniqueColumnName;

        /**
         * Name of the column in the response Result Set.
         *
         * @param uniqueColumnName the value to set
         * @return this builder
         */
        public Builder uniqueColumnName(String uniqueColumnName) {
            this.uniqueColumnName = uniqueColumnName;
            this.__explicitlySet__.add("uniqueColumnName");
            return this;
        }
        /** Oracle Database data type of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnTypeName")
        private String columnTypeName;

        /**
         * Oracle Database data type of the column.
         *
         * @param columnTypeName the value to set
         * @return this builder
         */
        public Builder columnTypeName(String columnTypeName) {
            this.columnTypeName = columnTypeName;
            this.__explicitlySet__.add("columnTypeName");
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
        /** Specifies if the column is nullable (0 if the column is not nullable) */
        @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
        private Boolean isNullable;

        /**
         * Specifies if the column is nullable (0 if the column is not nullable)
         *
         * @param isNullable the value to set
         * @return this builder
         */
        public Builder isNullable(Boolean isNullable) {
            this.isNullable = isNullable;
            this.__explicitlySet__.add("isNullable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlResponseItemResultSetMetadata build() {
            ExecuteSqlResponseItemResultSetMetadata model =
                    new ExecuteSqlResponseItemResultSetMetadata(
                            this.databaseColumnName,
                            this.uniqueColumnName,
                            this.columnTypeName,
                            this.precision,
                            this.scale,
                            this.isNullable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlResponseItemResultSetMetadata model) {
            if (model.wasPropertyExplicitlySet("databaseColumnName")) {
                this.databaseColumnName(model.getDatabaseColumnName());
            }
            if (model.wasPropertyExplicitlySet("uniqueColumnName")) {
                this.uniqueColumnName(model.getUniqueColumnName());
            }
            if (model.wasPropertyExplicitlySet("columnTypeName")) {
                this.columnTypeName(model.getColumnTypeName());
            }
            if (model.wasPropertyExplicitlySet("precision")) {
                this.precision(model.getPrecision());
            }
            if (model.wasPropertyExplicitlySet("scale")) {
                this.scale(model.getScale());
            }
            if (model.wasPropertyExplicitlySet("isNullable")) {
                this.isNullable(model.getIsNullable());
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

    /** Name of the column in the Oracle Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseColumnName")
    private final String databaseColumnName;

    /**
     * Name of the column in the Oracle Database.
     *
     * @return the value
     */
    public String getDatabaseColumnName() {
        return databaseColumnName;
    }

    /** Name of the column in the response Result Set. */
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueColumnName")
    private final String uniqueColumnName;

    /**
     * Name of the column in the response Result Set.
     *
     * @return the value
     */
    public String getUniqueColumnName() {
        return uniqueColumnName;
    }

    /** Oracle Database data type of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnTypeName")
    private final String columnTypeName;

    /**
     * Oracle Database data type of the column.
     *
     * @return the value
     */
    public String getColumnTypeName() {
        return columnTypeName;
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

    /** Specifies if the column is nullable (0 if the column is not nullable) */
    @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
    private final Boolean isNullable;

    /**
     * Specifies if the column is nullable (0 if the column is not nullable)
     *
     * @return the value
     */
    public Boolean getIsNullable() {
        return isNullable;
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
        sb.append("ExecuteSqlResponseItemResultSetMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("databaseColumnName=").append(String.valueOf(this.databaseColumnName));
        sb.append(", uniqueColumnName=").append(String.valueOf(this.uniqueColumnName));
        sb.append(", columnTypeName=").append(String.valueOf(this.columnTypeName));
        sb.append(", precision=").append(String.valueOf(this.precision));
        sb.append(", scale=").append(String.valueOf(this.scale));
        sb.append(", isNullable=").append(String.valueOf(this.isNullable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlResponseItemResultSetMetadata)) {
            return false;
        }

        ExecuteSqlResponseItemResultSetMetadata other = (ExecuteSqlResponseItemResultSetMetadata) o;
        return java.util.Objects.equals(this.databaseColumnName, other.databaseColumnName)
                && java.util.Objects.equals(this.uniqueColumnName, other.uniqueColumnName)
                && java.util.Objects.equals(this.columnTypeName, other.columnTypeName)
                && java.util.Objects.equals(this.precision, other.precision)
                && java.util.Objects.equals(this.scale, other.scale)
                && java.util.Objects.equals(this.isNullable, other.isNullable)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseColumnName == null
                                ? 43
                                : this.databaseColumnName.hashCode());
        result =
                (result * PRIME)
                        + (this.uniqueColumnName == null ? 43 : this.uniqueColumnName.hashCode());
        result =
                (result * PRIME)
                        + (this.columnTypeName == null ? 43 : this.columnTypeName.hashCode());
        result = (result * PRIME) + (this.precision == null ? 43 : this.precision.hashCode());
        result = (result * PRIME) + (this.scale == null ? 43 : this.scale.hashCode());
        result = (result * PRIME) + (this.isNullable == null ? 43 : this.isNullable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
