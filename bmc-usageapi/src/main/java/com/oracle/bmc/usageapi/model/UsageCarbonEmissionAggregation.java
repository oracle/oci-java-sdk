/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The account (tenant) carbon emissions usage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UsageCarbonEmissionAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UsageCarbonEmissionAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"groupBy", "items"})
    public UsageCarbonEmissionAggregation(
            java.util.List<String> groupBy, java.util.List<UsageCarbonEmissionSummary> items) {
        super();
        this.groupBy = groupBy;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies what to aggregate the result by. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private java.util.List<String> groupBy;

        /**
         * Specifies what to aggregate the result by.
         *
         * @param groupBy the value to set
         * @return this builder
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }
        /** A list of carbon emission usage items. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<UsageCarbonEmissionSummary> items;

        /**
         * A list of carbon emission usage items.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<UsageCarbonEmissionSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageCarbonEmissionAggregation build() {
            UsageCarbonEmissionAggregation model =
                    new UsageCarbonEmissionAggregation(this.groupBy, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageCarbonEmissionAggregation model) {
            if (model.wasPropertyExplicitlySet("groupBy")) {
                this.groupBy(model.getGroupBy());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    /** Specifies what to aggregate the result by. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    private final java.util.List<String> groupBy;

    /**
     * Specifies what to aggregate the result by.
     *
     * @return the value
     */
    public java.util.List<String> getGroupBy() {
        return groupBy;
    }

    /** A list of carbon emission usage items. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<UsageCarbonEmissionSummary> items;

    /**
     * A list of carbon emission usage items.
     *
     * @return the value
     */
    public java.util.List<UsageCarbonEmissionSummary> getItems() {
        return items;
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
        sb.append("UsageCarbonEmissionAggregation(");
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
        if (!(o instanceof UsageCarbonEmissionAggregation)) {
            return false;
        }

        UsageCarbonEmissionAggregation other = (UsageCarbonEmissionAggregation) o;
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
