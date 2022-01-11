/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Inventory details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlInventory.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlInventory {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalSqls")
        private Long totalSqls;

        public Builder totalSqls(Long totalSqls) {
            this.totalSqls = totalSqls;
            this.__explicitlySet__.add("totalSqls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalDatabases")
        private Integer totalDatabases;

        public Builder totalDatabases(Integer totalDatabases) {
            this.totalDatabases = totalDatabases;
            this.__explicitlySet__.add("totalDatabases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlsAnalyzed")
        private Long sqlsAnalyzed;

        public Builder sqlsAnalyzed(Long sqlsAnalyzed) {
            this.sqlsAnalyzed = sqlsAnalyzed;
            this.__explicitlySet__.add("sqlsAnalyzed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlInventory build() {
            SqlInventory __instance__ = new SqlInventory(totalSqls, totalDatabases, sqlsAnalyzed);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlInventory o) {
            Builder copiedBuilder =
                    totalSqls(o.getTotalSqls())
                            .totalDatabases(o.getTotalDatabases())
                            .sqlsAnalyzed(o.getSqlsAnalyzed());

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
     * Total number of sqls. Example {@code 2000}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSqls")
    Long totalSqls;

    /**
     * Total number of Databases. Example {@code 400}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalDatabases")
    Integer totalDatabases;

    /**
     * Total number of sqls analyzed by the query. Example {@code 120}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlsAnalyzed")
    Long sqlsAnalyzed;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
