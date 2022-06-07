/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * List container image results.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerImageCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ContainerImageCollection {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "remainingItemsCount"})
    public ContainerImageCollection(
            java.util.List<ContainerImageSummary> items, Integer remainingItemsCount) {
        super();
        this.items = items;
        this.remainingItemsCount = remainingItemsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ContainerImageSummary> items;

        public Builder items(java.util.List<ContainerImageSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remainingItemsCount")
        private Integer remainingItemsCount;

        public Builder remainingItemsCount(Integer remainingItemsCount) {
            this.remainingItemsCount = remainingItemsCount;
            this.__explicitlySet__.add("remainingItemsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerImageCollection build() {
            ContainerImageCollection __instance__ =
                    new ContainerImageCollection(items, remainingItemsCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerImageCollection o) {
            Builder copiedBuilder =
                    items(o.getItems()).remainingItemsCount(o.getRemainingItemsCount());

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
     * Page of matching container images.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ContainerImageSummary> items;

    public java.util.List<ContainerImageSummary> getItems() {
        return items;
    }

    /**
     * Estimated number of remaining results.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingItemsCount")
    private final Integer remainingItemsCount;

    public Integer getRemainingItemsCount() {
        return remainingItemsCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ContainerImageCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", remainingItemsCount=").append(String.valueOf(this.remainingItemsCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerImageCollection)) {
            return false;
        }

        ContainerImageCollection other = (ContainerImageCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.remainingItemsCount, other.remainingItemsCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingItemsCount == null
                                ? 43
                                : this.remainingItemsCount.hashCode());
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
