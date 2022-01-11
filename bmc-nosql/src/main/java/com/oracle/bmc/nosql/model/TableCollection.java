/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Results of ListTables.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TableCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TableCollection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<TableSummary> items;

        public Builder items(java.util.List<TableSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxAutoReclaimableTables")
        private Integer maxAutoReclaimableTables;

        public Builder maxAutoReclaimableTables(Integer maxAutoReclaimableTables) {
            this.maxAutoReclaimableTables = maxAutoReclaimableTables;
            this.__explicitlySet__.add("maxAutoReclaimableTables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoReclaimableTables")
        private Integer autoReclaimableTables;

        public Builder autoReclaimableTables(Integer autoReclaimableTables) {
            this.autoReclaimableTables = autoReclaimableTables;
            this.__explicitlySet__.add("autoReclaimableTables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableCollection build() {
            TableCollection __instance__ =
                    new TableCollection(items, maxAutoReclaimableTables, autoReclaimableTables);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableCollection o) {
            Builder copiedBuilder =
                    items(o.getItems())
                            .maxAutoReclaimableTables(o.getMaxAutoReclaimableTables())
                            .autoReclaimableTables(o.getAutoReclaimableTables());

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
     * A page of TableSummary objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<TableSummary> items;

    /**
     * The maximum number of reclaimable tables allowed in the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxAutoReclaimableTables")
    Integer maxAutoReclaimableTables;

    /**
     * The current number of reclaimable tables in the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoReclaimableTables")
    Integer autoReclaimableTables;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
