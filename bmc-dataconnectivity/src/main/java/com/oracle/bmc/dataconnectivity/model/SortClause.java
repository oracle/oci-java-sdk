/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The information about the sort object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SortClause.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SortClause {
    @Deprecated
    @java.beans.ConstructorProperties({"field", "order"})
    public SortClause(ShapeField field, Order order) {
        super();
        this.field = field;
        this.order = order;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("field")
        private ShapeField field;

        public Builder field(ShapeField field) {
            this.field = field;
            this.__explicitlySet__.add("field");
            return this;
        }
        /**
         * The sort order.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Order order;

        /**
         * The sort order.
         * @param order the value to set
         * @return this builder
         **/
        public Builder order(Order order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SortClause build() {
            SortClause __instance__ = new SortClause(field, order);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SortClause o) {
            Builder copiedBuilder = field(o.getField()).order(o.getOrder());

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

    @com.fasterxml.jackson.annotation.JsonProperty("field")
    private final ShapeField field;

    public ShapeField getField() {
        return field;
    }

    /**
     * The sort order.
     **/
    public enum Order {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, Order> map;

        static {
            map = new java.util.HashMap<>();
            for (Order v : Order.values()) {
                map.put(v.getValue(), v);
            }
        }

        Order(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Order create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Order: " + key);
        }
    };
    /**
     * The sort order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    private final Order order;

    /**
     * The sort order.
     * @return the value
     **/
    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SortClause(");
        sb.append("field=").append(String.valueOf(this.field));
        sb.append(", order=").append(String.valueOf(this.order));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SortClause)) {
            return false;
        }

        SortClause other = (SortClause) o;
        return java.util.Objects.equals(this.field, other.field)
                && java.util.Objects.equals(this.order, other.order)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result = (result * PRIME) + (this.order == null ? 43 : this.order.hashCode());
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
