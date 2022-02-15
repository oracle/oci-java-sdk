/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Sorting the data at the column level.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ColumnSorting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ColumnSorting {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAscending")
        private Boolean isAscending;

        public Builder isAscending(Boolean isAscending) {
            this.isAscending = isAscending;
            this.__explicitlySet__.add("isAscending");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortingOrder")
        private Integer sortingOrder;

        public Builder sortingOrder(Integer sortingOrder) {
            this.sortingOrder = sortingOrder;
            this.__explicitlySet__.add("sortingOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ColumnSorting build() {
            ColumnSorting __instance__ = new ColumnSorting(fieldName, isAscending, sortingOrder);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ColumnSorting o) {
            Builder copiedBuilder =
                    fieldName(o.getFieldName())
                            .isAscending(o.getIsAscending())
                            .sortingOrder(o.getSortingOrder());

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
     * Name of the column that must be sorted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    String fieldName;

    /**
     * Indicates if the column must be sorted in ascending order. Values can either be 'true' or 'false'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAscending")
    Boolean isAscending;

    /**
     * Indicates the order at which column must be sorted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortingOrder")
    Integer sortingOrder;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
