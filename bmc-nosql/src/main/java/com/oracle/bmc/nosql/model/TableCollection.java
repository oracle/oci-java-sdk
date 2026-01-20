/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Results of ListTables. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TableCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TableCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "items",
        "maxAutoReclaimableTables",
        "autoReclaimableTables",
        "onDemandCapacityTables",
        "maxOnDemandCapacityTables",
        "availableReplicationRegions"
    })
    public TableCollection(
            java.util.List<TableSummary> items,
            Integer maxAutoReclaimableTables,
            Integer autoReclaimableTables,
            Integer onDemandCapacityTables,
            Integer maxOnDemandCapacityTables,
            java.util.List<String> availableReplicationRegions) {
        super();
        this.items = items;
        this.maxAutoReclaimableTables = maxAutoReclaimableTables;
        this.autoReclaimableTables = autoReclaimableTables;
        this.onDemandCapacityTables = onDemandCapacityTables;
        this.maxOnDemandCapacityTables = maxOnDemandCapacityTables;
        this.availableReplicationRegions = availableReplicationRegions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A page of TableSummary objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<TableSummary> items;

        /**
         * A page of TableSummary objects.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<TableSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /** The maximum number of reclaimable tables allowed in the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAutoReclaimableTables")
        private Integer maxAutoReclaimableTables;

        /**
         * The maximum number of reclaimable tables allowed in the tenancy.
         *
         * @param maxAutoReclaimableTables the value to set
         * @return this builder
         */
        public Builder maxAutoReclaimableTables(Integer maxAutoReclaimableTables) {
            this.maxAutoReclaimableTables = maxAutoReclaimableTables;
            this.__explicitlySet__.add("maxAutoReclaimableTables");
            return this;
        }
        /** The current number of reclaimable tables in the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("autoReclaimableTables")
        private Integer autoReclaimableTables;

        /**
         * The current number of reclaimable tables in the tenancy.
         *
         * @param autoReclaimableTables the value to set
         * @return this builder
         */
        public Builder autoReclaimableTables(Integer autoReclaimableTables) {
            this.autoReclaimableTables = autoReclaimableTables;
            this.__explicitlySet__.add("autoReclaimableTables");
            return this;
        }
        /** The current number of on demand capacity tables in the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("onDemandCapacityTables")
        private Integer onDemandCapacityTables;

        /**
         * The current number of on demand capacity tables in the tenancy.
         *
         * @param onDemandCapacityTables the value to set
         * @return this builder
         */
        public Builder onDemandCapacityTables(Integer onDemandCapacityTables) {
            this.onDemandCapacityTables = onDemandCapacityTables;
            this.__explicitlySet__.add("onDemandCapacityTables");
            return this;
        }
        /** The maximum number of on demand capacity tables allowed in the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxOnDemandCapacityTables")
        private Integer maxOnDemandCapacityTables;

        /**
         * The maximum number of on demand capacity tables allowed in the tenancy.
         *
         * @param maxOnDemandCapacityTables the value to set
         * @return this builder
         */
        public Builder maxOnDemandCapacityTables(Integer maxOnDemandCapacityTables) {
            this.maxOnDemandCapacityTables = maxOnDemandCapacityTables;
            this.__explicitlySet__.add("maxOnDemandCapacityTables");
            return this;
        }
        /** An array of regions that are available for replication. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableReplicationRegions")
        private java.util.List<String> availableReplicationRegions;

        /**
         * An array of regions that are available for replication.
         *
         * @param availableReplicationRegions the value to set
         * @return this builder
         */
        public Builder availableReplicationRegions(
                java.util.List<String> availableReplicationRegions) {
            this.availableReplicationRegions = availableReplicationRegions;
            this.__explicitlySet__.add("availableReplicationRegions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableCollection build() {
            TableCollection model =
                    new TableCollection(
                            this.items,
                            this.maxAutoReclaimableTables,
                            this.autoReclaimableTables,
                            this.onDemandCapacityTables,
                            this.maxOnDemandCapacityTables,
                            this.availableReplicationRegions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableCollection model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("maxAutoReclaimableTables")) {
                this.maxAutoReclaimableTables(model.getMaxAutoReclaimableTables());
            }
            if (model.wasPropertyExplicitlySet("autoReclaimableTables")) {
                this.autoReclaimableTables(model.getAutoReclaimableTables());
            }
            if (model.wasPropertyExplicitlySet("onDemandCapacityTables")) {
                this.onDemandCapacityTables(model.getOnDemandCapacityTables());
            }
            if (model.wasPropertyExplicitlySet("maxOnDemandCapacityTables")) {
                this.maxOnDemandCapacityTables(model.getMaxOnDemandCapacityTables());
            }
            if (model.wasPropertyExplicitlySet("availableReplicationRegions")) {
                this.availableReplicationRegions(model.getAvailableReplicationRegions());
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

    /** A page of TableSummary objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<TableSummary> items;

    /**
     * A page of TableSummary objects.
     *
     * @return the value
     */
    public java.util.List<TableSummary> getItems() {
        return items;
    }

    /** The maximum number of reclaimable tables allowed in the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAutoReclaimableTables")
    private final Integer maxAutoReclaimableTables;

    /**
     * The maximum number of reclaimable tables allowed in the tenancy.
     *
     * @return the value
     */
    public Integer getMaxAutoReclaimableTables() {
        return maxAutoReclaimableTables;
    }

    /** The current number of reclaimable tables in the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("autoReclaimableTables")
    private final Integer autoReclaimableTables;

    /**
     * The current number of reclaimable tables in the tenancy.
     *
     * @return the value
     */
    public Integer getAutoReclaimableTables() {
        return autoReclaimableTables;
    }

    /** The current number of on demand capacity tables in the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("onDemandCapacityTables")
    private final Integer onDemandCapacityTables;

    /**
     * The current number of on demand capacity tables in the tenancy.
     *
     * @return the value
     */
    public Integer getOnDemandCapacityTables() {
        return onDemandCapacityTables;
    }

    /** The maximum number of on demand capacity tables allowed in the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxOnDemandCapacityTables")
    private final Integer maxOnDemandCapacityTables;

    /**
     * The maximum number of on demand capacity tables allowed in the tenancy.
     *
     * @return the value
     */
    public Integer getMaxOnDemandCapacityTables() {
        return maxOnDemandCapacityTables;
    }

    /** An array of regions that are available for replication. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableReplicationRegions")
    private final java.util.List<String> availableReplicationRegions;

    /**
     * An array of regions that are available for replication.
     *
     * @return the value
     */
    public java.util.List<String> getAvailableReplicationRegions() {
        return availableReplicationRegions;
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
        sb.append("TableCollection(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", maxAutoReclaimableTables=")
                .append(String.valueOf(this.maxAutoReclaimableTables));
        sb.append(", autoReclaimableTables=").append(String.valueOf(this.autoReclaimableTables));
        sb.append(", onDemandCapacityTables=").append(String.valueOf(this.onDemandCapacityTables));
        sb.append(", maxOnDemandCapacityTables=")
                .append(String.valueOf(this.maxOnDemandCapacityTables));
        sb.append(", availableReplicationRegions=")
                .append(String.valueOf(this.availableReplicationRegions));
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
                && java.util.Objects.equals(
                        this.availableReplicationRegions, other.availableReplicationRegions)
                && super.equals(other);
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
                        + (this.availableReplicationRegions == null
                                ? 43
                                : this.availableReplicationRegions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
