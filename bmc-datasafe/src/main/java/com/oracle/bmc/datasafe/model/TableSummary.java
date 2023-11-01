/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of a table fetched from the database. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TableSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TableSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tableName", "schemaName"})
    public TableSummary(String tableName, String schemaName) {
        super();
        this.tableName = tableName;
        this.schemaName = schemaName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        public TableSummary build() {
            TableSummary model = new TableSummary(this.tableName, this.schemaName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableSummary model) {
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
        sb.append("TableSummary(");
        sb.append("super=").append(super.toString());
        sb.append("tableName=").append(String.valueOf(this.tableName));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableSummary)) {
            return false;
        }

        TableSummary other = (TableSummary) o;
        return java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
