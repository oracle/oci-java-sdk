/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The table schema information as a JSON object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Schema.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Schema extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"columns", "primaryKey", "shardKey", "ttl"})
    public Schema(
            java.util.List<Column> columns,
            java.util.List<String> primaryKey,
            java.util.List<String> shardKey,
            Integer ttl) {
        super();
        this.columns = columns;
        this.primaryKey = primaryKey;
        this.shardKey = shardKey;
        this.ttl = ttl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The columns of a table.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<Column> columns;

        /**
         * The columns of a table.
         * @param columns the value to set
         * @return this builder
         **/
        public Builder columns(java.util.List<Column> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }
        /**
         * A list of column names that make up a key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
        private java.util.List<String> primaryKey;

        /**
         * A list of column names that make up a key.
         * @param primaryKey the value to set
         * @return this builder
         **/
        public Builder primaryKey(java.util.List<String> primaryKey) {
            this.primaryKey = primaryKey;
            this.__explicitlySet__.add("primaryKey");
            return this;
        }
        /**
         * A list of column names that make up a key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shardKey")
        private java.util.List<String> shardKey;

        /**
         * A list of column names that make up a key.
         * @param shardKey the value to set
         * @return this builder
         **/
        public Builder shardKey(java.util.List<String> shardKey) {
            this.shardKey = shardKey;
            this.__explicitlySet__.add("shardKey");
            return this;
        }
        /**
         * The default Time-to-Live for the table, in days.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        /**
         * The default Time-to-Live for the table, in days.
         * @param ttl the value to set
         * @return this builder
         **/
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Schema build() {
            Schema model = new Schema(this.columns, this.primaryKey, this.shardKey, this.ttl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Schema model) {
            if (model.wasPropertyExplicitlySet("columns")) {
                this.columns(model.getColumns());
            }
            if (model.wasPropertyExplicitlySet("primaryKey")) {
                this.primaryKey(model.getPrimaryKey());
            }
            if (model.wasPropertyExplicitlySet("shardKey")) {
                this.shardKey(model.getShardKey());
            }
            if (model.wasPropertyExplicitlySet("ttl")) {
                this.ttl(model.getTtl());
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
     * The columns of a table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<Column> columns;

    /**
     * The columns of a table.
     * @return the value
     **/
    public java.util.List<Column> getColumns() {
        return columns;
    }

    /**
     * A list of column names that make up a key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
    private final java.util.List<String> primaryKey;

    /**
     * A list of column names that make up a key.
     * @return the value
     **/
    public java.util.List<String> getPrimaryKey() {
        return primaryKey;
    }

    /**
     * A list of column names that make up a key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shardKey")
    private final java.util.List<String> shardKey;

    /**
     * A list of column names that make up a key.
     * @return the value
     **/
    public java.util.List<String> getShardKey() {
        return shardKey;
    }

    /**
     * The default Time-to-Live for the table, in days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    private final Integer ttl;

    /**
     * The default Time-to-Live for the table, in days.
     * @return the value
     **/
    public Integer getTtl() {
        return ttl;
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
        sb.append("Schema(");
        sb.append("super=").append(super.toString());
        sb.append("columns=").append(String.valueOf(this.columns));
        sb.append(", primaryKey=").append(String.valueOf(this.primaryKey));
        sb.append(", shardKey=").append(String.valueOf(this.shardKey));
        sb.append(", ttl=").append(String.valueOf(this.ttl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Schema)) {
            return false;
        }

        Schema other = (Schema) o;
        return java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.primaryKey, other.primaryKey)
                && java.util.Objects.equals(this.shardKey, other.shardKey)
                && java.util.Objects.equals(this.ttl, other.ttl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.primaryKey == null ? 43 : this.primaryKey.hashCode());
        result = (result * PRIME) + (this.shardKey == null ? 43 : this.shardKey.hashCode());
        result = (result * PRIME) + (this.ttl == null ? 43 : this.ttl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
