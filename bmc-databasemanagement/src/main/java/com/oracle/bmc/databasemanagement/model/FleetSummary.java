/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of the inventory count grouped by database type and subtype, and the metrics that
 * describe the aggregated usage of CPU, storage, and so on of all the databases in the fleet.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FleetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FleetSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"aggregatedMetrics", "inventory"})
    public FleetSummary(
            java.util.List<FleetMetricSummaryDefinition> aggregatedMetrics,
            java.util.List<FleetStatusByCategory> inventory) {
        super();
        this.aggregatedMetrics = aggregatedMetrics;
        this.inventory = inventory;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of databases present in the fleet and their usage metrics.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedMetrics")
        private java.util.List<FleetMetricSummaryDefinition> aggregatedMetrics;

        /**
         * A list of databases present in the fleet and their usage metrics.
         * @param aggregatedMetrics the value to set
         * @return this builder
         **/
        public Builder aggregatedMetrics(
                java.util.List<FleetMetricSummaryDefinition> aggregatedMetrics) {
            this.aggregatedMetrics = aggregatedMetrics;
            this.__explicitlySet__.add("aggregatedMetrics");
            return this;
        }
        /**
         * A list of the databases in the fleet, grouped by database type and subtype.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inventory")
        private java.util.List<FleetStatusByCategory> inventory;

        /**
         * A list of the databases in the fleet, grouped by database type and subtype.
         * @param inventory the value to set
         * @return this builder
         **/
        public Builder inventory(java.util.List<FleetStatusByCategory> inventory) {
            this.inventory = inventory;
            this.__explicitlySet__.add("inventory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetSummary build() {
            FleetSummary model = new FleetSummary(this.aggregatedMetrics, this.inventory);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetSummary model) {
            if (model.wasPropertyExplicitlySet("aggregatedMetrics")) {
                this.aggregatedMetrics(model.getAggregatedMetrics());
            }
            if (model.wasPropertyExplicitlySet("inventory")) {
                this.inventory(model.getInventory());
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
     * A list of databases present in the fleet and their usage metrics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedMetrics")
    private final java.util.List<FleetMetricSummaryDefinition> aggregatedMetrics;

    /**
     * A list of databases present in the fleet and their usage metrics.
     * @return the value
     **/
    public java.util.List<FleetMetricSummaryDefinition> getAggregatedMetrics() {
        return aggregatedMetrics;
    }

    /**
     * A list of the databases in the fleet, grouped by database type and subtype.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inventory")
    private final java.util.List<FleetStatusByCategory> inventory;

    /**
     * A list of the databases in the fleet, grouped by database type and subtype.
     * @return the value
     **/
    public java.util.List<FleetStatusByCategory> getInventory() {
        return inventory;
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
        sb.append("FleetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("aggregatedMetrics=").append(String.valueOf(this.aggregatedMetrics));
        sb.append(", inventory=").append(String.valueOf(this.inventory));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetSummary)) {
            return false;
        }

        FleetSummary other = (FleetSummary) o;
        return java.util.Objects.equals(this.aggregatedMetrics, other.aggregatedMetrics)
                && java.util.Objects.equals(this.inventory, other.inventory)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.aggregatedMetrics == null ? 43 : this.aggregatedMetrics.hashCode());
        result = (result * PRIME) + (this.inventory == null ? 43 : this.inventory.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
