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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TableCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TableCollection {
    @Deprecated
    @java.beans.ConstructorProperties({
        "items",
        "maxAutoReclaimableTables",
        "autoReclaimableTables",
        "onDemandCapacityTables",
        "maxOnDemandCapacityTables"
    })
    public TableCollection(
            java.util.List<TableSummary> items,
            Integer maxAutoReclaimableTables,
            Integer autoReclaimableTables,
            Integer onDemandCapacityTables,
            Integer maxOnDemandCapacityTables) {
        super();
        this.items = items;
        this.maxAutoReclaimableTables = maxAutoReclaimableTables;
        this.autoReclaimableTables = autoReclaimableTables;
        this.onDemandCapacityTables = onDemandCapacityTables;
        this.maxOnDemandCapacityTables = maxOnDemandCapacityTables;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("onDemandCapacityTables")
        private Integer onDemandCapacityTables;

        public Builder onDemandCapacityTables(Integer onDemandCapacityTables) {
            this.onDemandCapacityTables = onDemandCapacityTables;
            this.__explicitlySet__.add("onDemandCapacityTables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxOnDemandCapacityTables")
        private Integer maxOnDemandCapacityTables;

        public Builder maxOnDemandCapacityTables(Integer maxOnDemandCapacityTables) {
            this.maxOnDemandCapacityTables = maxOnDemandCapacityTables;
            this.__explicitlySet__.add("maxOnDemandCapacityTables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableCollection build() {
            TableCollection __instance__ =
                    new TableCollection(
                            items,
                            maxAutoReclaimableTables,
                            autoReclaimableTables,
                            onDemandCapacityTables,
                            maxOnDemandCapacityTables);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableCollection o) {
            Builder copiedBuilder =
                    items(o.getItems())
                            .maxAutoReclaimableTables(o.getMaxAutoReclaimableTables())
                            .autoReclaimableTables(o.getAutoReclaimableTables())
                            .onDemandCapacityTables(o.getOnDemandCapacityTables())
                            .maxOnDemandCapacityTables(o.getMaxOnDemandCapacityTables());

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
     * A page of TableSummary objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<TableSummary> items;

    public java.util.List<TableSummary> getItems() {
        return items;
    }

    /**
     * The maximum number of reclaimable tables allowed in the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxAutoReclaimableTables")
    private final Integer maxAutoReclaimableTables;

    public Integer getMaxAutoReclaimableTables() {
        return maxAutoReclaimableTables;
    }

    /**
     * The current number of reclaimable tables in the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoReclaimableTables")
    private final Integer autoReclaimableTables;

    public Integer getAutoReclaimableTables() {
        return autoReclaimableTables;
    }

    /**
     * The current number of on demand capacity tables in the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onDemandCapacityTables")
    private final Integer onDemandCapacityTables;

    public Integer getOnDemandCapacityTables() {
        return onDemandCapacityTables;
    }

    /**
     * The maximum number of on demand capacity tables allowed in the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxOnDemandCapacityTables")
    private final Integer maxOnDemandCapacityTables;

    public Integer getMaxOnDemandCapacityTables() {
        return maxOnDemandCapacityTables;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TableCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", maxAutoReclaimableTables=")
                .append(String.valueOf(this.maxAutoReclaimableTables));
        sb.append(", autoReclaimableTables=").append(String.valueOf(this.autoReclaimableTables));
        sb.append(", onDemandCapacityTables=").append(String.valueOf(this.onDemandCapacityTables));
        sb.append(", maxOnDemandCapacityTables=")
                .append(String.valueOf(this.maxOnDemandCapacityTables));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableCollection)) {
            return false;
        }

        TableCollection other = (TableCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(
                        this.maxAutoReclaimableTables, other.maxAutoReclaimableTables)
                && java.util.Objects.equals(this.autoReclaimableTables, other.autoReclaimableTables)
                && java.util.Objects.equals(
                        this.onDemandCapacityTables, other.onDemandCapacityTables)
                && java.util.Objects.equals(
                        this.maxOnDemandCapacityTables, other.maxOnDemandCapacityTables)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.maxAutoReclaimableTables == null
                                ? 43
                                : this.maxAutoReclaimableTables.hashCode());
        result =
                (result * PRIME)
                        + (this.autoReclaimableTables == null
                                ? 43
                                : this.autoReclaimableTables.hashCode());
        result =
                (result * PRIME)
                        + (this.onDemandCapacityTables == null
                                ? 43
                                : this.onDemandCapacityTables.hashCode());
        result =
                (result * PRIME)
                        + (this.maxOnDemandCapacityTables == null
                                ? 43
                                : this.maxOnDemandCapacityTables.hashCode());
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
