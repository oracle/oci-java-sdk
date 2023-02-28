/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL Insights response. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlInsightAggregationCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SqlInsightAggregationCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeIntervalStart",
        "timeIntervalEnd",
        "inventory",
        "items",
        "thresholds"
    })
    public SqlInsightAggregationCollection(
            java.util.Date timeIntervalStart,
            java.util.Date timeIntervalEnd,
            SqlInventory inventory,
            java.util.List<SqlInsightAggregation> items,
            SqlInsightThresholds thresholds) {
        super();
        this.timeIntervalStart = timeIntervalStart;
        this.timeIntervalEnd = timeIntervalEnd;
        this.inventory = inventory;
        this.items = items;
        this.thresholds = thresholds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The start timestamp that was passed into the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
        private java.util.Date timeIntervalStart;

        /**
         * The start timestamp that was passed into the request.
         *
         * @param timeIntervalStart the value to set
         * @return this builder
         */
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            this.__explicitlySet__.add("timeIntervalStart");
            return this;
        }
        /** The end timestamp that was passed into the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
        private java.util.Date timeIntervalEnd;

        /**
         * The end timestamp that was passed into the request.
         *
         * @param timeIntervalEnd the value to set
         * @return this builder
         */
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            this.__explicitlySet__.add("timeIntervalEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inventory")
        private SqlInventory inventory;

        public Builder inventory(SqlInventory inventory) {
            this.inventory = inventory;
            this.__explicitlySet__.add("inventory");
            return this;
        }
        /** List of insights. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SqlInsightAggregation> items;

        /**
         * List of insights.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<SqlInsightAggregation> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("thresholds")
        private SqlInsightThresholds thresholds;

        public Builder thresholds(SqlInsightThresholds thresholds) {
            this.thresholds = thresholds;
            this.__explicitlySet__.add("thresholds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlInsightAggregationCollection build() {
            SqlInsightAggregationCollection model =
                    new SqlInsightAggregationCollection(
                            this.timeIntervalStart,
                            this.timeIntervalEnd,
                            this.inventory,
                            this.items,
                            this.thresholds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlInsightAggregationCollection model) {
            if (model.wasPropertyExplicitlySet("timeIntervalStart")) {
                this.timeIntervalStart(model.getTimeIntervalStart());
            }
            if (model.wasPropertyExplicitlySet("timeIntervalEnd")) {
                this.timeIntervalEnd(model.getTimeIntervalEnd());
            }
            if (model.wasPropertyExplicitlySet("inventory")) {
                this.inventory(model.getInventory());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("thresholds")) {
                this.thresholds(model.getThresholds());
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

    /** The start timestamp that was passed into the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
    private final java.util.Date timeIntervalStart;

    /**
     * The start timestamp that was passed into the request.
     *
     * @return the value
     */
    public java.util.Date getTimeIntervalStart() {
        return timeIntervalStart;
    }

    /** The end timestamp that was passed into the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
    private final java.util.Date timeIntervalEnd;

    /**
     * The end timestamp that was passed into the request.
     *
     * @return the value
     */
    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inventory")
    private final SqlInventory inventory;

    public SqlInventory getInventory() {
        return inventory;
    }

    /** List of insights. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<SqlInsightAggregation> items;

    /**
     * List of insights.
     *
     * @return the value
     */
    public java.util.List<SqlInsightAggregation> getItems() {
        return items;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("thresholds")
    private final SqlInsightThresholds thresholds;

    public SqlInsightThresholds getThresholds() {
        return thresholds;
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
        sb.append("SqlInsightAggregationCollection(");
        sb.append("super=").append(super.toString());
        sb.append("timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(", timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(", inventory=").append(String.valueOf(this.inventory));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", thresholds=").append(String.valueOf(this.thresholds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlInsightAggregationCollection)) {
            return false;
        }

        SqlInsightAggregationCollection other = (SqlInsightAggregationCollection) o;
        return java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.inventory, other.inventory)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.thresholds, other.thresholds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeIntervalStart == null ? 43 : this.timeIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalEnd == null ? 43 : this.timeIntervalEnd.hashCode());
        result = (result * PRIME) + (this.inventory == null ? 43 : this.inventory.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.thresholds == null ? 43 : this.thresholds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
