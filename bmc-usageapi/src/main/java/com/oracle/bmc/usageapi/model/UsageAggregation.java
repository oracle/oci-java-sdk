/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The account (tenant) usage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsageAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UsageAggregation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"groupBy", "items"})
    public UsageAggregation(java.util.List<String> groupBy, java.util.List<UsageSummary> items) {
        super();
        this.groupBy = groupBy;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Aggregate the result by.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private java.util.List<String> groupBy;

        /**
         * Aggregate the result by.
         * @param groupBy the value to set
         * @return this builder
         **/
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }
        /**
         * A list of usage items.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<UsageSummary> items;

        /**
         * A list of usage items.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<UsageSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageAggregation build() {
            UsageAggregation model = new UsageAggregation(this.groupBy, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageAggregation model) {
            if (model.wasPropertyExplicitlySet("groupBy")) {
                this.groupBy(model.getGroupBy());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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
     * Aggregate the result by.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    private final java.util.List<String> groupBy;

    /**
     * Aggregate the result by.
     * @return the value
     **/
    public java.util.List<String> getGroupBy() {
        return groupBy;
    }

    /**
     * A list of usage items.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<UsageSummary> items;

    /**
     * A list of usage items.
     * @return the value
     **/
    public java.util.List<UsageSummary> getItems() {
        return items;
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
        sb.append("UsageAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("groupBy=").append(String.valueOf(this.groupBy));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageAggregation)) {
            return false;
        }

        UsageAggregation other = (UsageAggregation) o;
        return java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
