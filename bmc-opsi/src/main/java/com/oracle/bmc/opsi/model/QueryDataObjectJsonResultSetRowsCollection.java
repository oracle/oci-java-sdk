/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Collection of result set rows from the data object query.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QueryDataObjectJsonResultSetRowsCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "format"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryDataObjectJsonResultSetRowsCollection
        extends QueryDataObjectResultSetRowsCollection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<Object> items;

        public Builder items(java.util.List<Object> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("itemsMetadata")
        private java.util.List<QueryDataObjectResultSetColumnMetadata> itemsMetadata;

        public Builder itemsMetadata(
                java.util.List<QueryDataObjectResultSetColumnMetadata> itemsMetadata) {
            this.itemsMetadata = itemsMetadata;
            this.__explicitlySet__.add("itemsMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryDataObjectJsonResultSetRowsCollection build() {
            QueryDataObjectJsonResultSetRowsCollection __instance__ =
                    new QueryDataObjectJsonResultSetRowsCollection(items, itemsMetadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryDataObjectJsonResultSetRowsCollection o) {
            Builder copiedBuilder = items(o.getItems()).itemsMetadata(o.getItemsMetadata());

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

    @Deprecated
    public QueryDataObjectJsonResultSetRowsCollection(
            java.util.List<Object> items,
            java.util.List<QueryDataObjectResultSetColumnMetadata> itemsMetadata) {
        super();
        this.items = items;
        this.itemsMetadata = itemsMetadata;
    }

    /**
     * Array of result set rows.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<Object> items;

    public java.util.List<Object> getItems() {
        return items;
    }

    /**
     * Array of QueryDataObjectResultSetColumnMetadata objects that describe the result set columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("itemsMetadata")
    private final java.util.List<QueryDataObjectResultSetColumnMetadata> itemsMetadata;

    public java.util.List<QueryDataObjectResultSetColumnMetadata> getItemsMetadata() {
        return itemsMetadata;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryDataObjectJsonResultSetRowsCollection(");
        sb.append("super=").append(super.toString());
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", itemsMetadata=").append(String.valueOf(this.itemsMetadata));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryDataObjectJsonResultSetRowsCollection)) {
            return false;
        }

        QueryDataObjectJsonResultSetRowsCollection other =
                (QueryDataObjectJsonResultSetRowsCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.itemsMetadata, other.itemsMetadata)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.itemsMetadata == null ? 43 : this.itemsMetadata.hashCode());
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
