/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Schema.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Schema {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<Column> columns;

        public Builder columns(java.util.List<Column> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
        private java.util.List<String> primaryKey;

        public Builder primaryKey(java.util.List<String> primaryKey) {
            this.primaryKey = primaryKey;
            this.__explicitlySet__.add("primaryKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shardKey")
        private java.util.List<String> shardKey;

        public Builder shardKey(java.util.List<String> shardKey) {
            this.shardKey = shardKey;
            this.__explicitlySet__.add("shardKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Schema build() {
            Schema __instance__ = new Schema(columns, primaryKey, shardKey, ttl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Schema o) {
            Builder copiedBuilder =
                    columns(o.getColumns())
                            .primaryKey(o.getPrimaryKey())
                            .shardKey(o.getShardKey())
                            .ttl(o.getTtl());

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
     * The columns of a table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    java.util.List<Column> columns;

    /**
     * A list of column names that make up a key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
    java.util.List<String> primaryKey;

    /**
     * A list of column names that make up a key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shardKey")
    java.util.List<String> shardKey;

    /**
     * The default Time-to-Live for the table, in days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    Integer ttl;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
