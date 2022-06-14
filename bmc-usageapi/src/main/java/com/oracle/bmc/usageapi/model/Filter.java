/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The filter object for query usage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Filter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Filter {
    @Deprecated
    @java.beans.ConstructorProperties({"operator", "dimensions", "tags", "filters"})
    public Filter(
            Operator operator,
            java.util.List<Dimension> dimensions,
            java.util.List<Tag> tags,
            java.util.List<Filter> filters) {
        super();
        this.operator = operator;
        this.dimensions = dimensions;
        this.tags = tags;
        this.filters = filters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The filter operator. Example: 'AND', 'OR', 'NOT'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        /**
         * The filter operator. Example: 'AND', 'OR', 'NOT'.
         * @param operator the value to set
         * @return this builder
         **/
        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }
        /**
         * The dimensions to filter on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<Dimension> dimensions;

        /**
         * The dimensions to filter on.
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.List<Dimension> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * The tags to filter on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        /**
         * The tags to filter on.
         * @param tags the value to set
         * @return this builder
         **/
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }
        /**
         * The nested filter object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<Filter> filters;

        /**
         * The nested filter object.
         * @param filters the value to set
         * @return this builder
         **/
        public Builder filters(java.util.List<Filter> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Filter build() {
            Filter __instance__ = new Filter(operator, dimensions, tags, filters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Filter o) {
            Builder copiedBuilder =
                    operator(o.getOperator())
                            .dimensions(o.getDimensions())
                            .tags(o.getTags())
                            .filters(o.getFilters());

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
     * The filter operator. Example: 'AND', 'OR', 'NOT'.
     **/
    public enum Operator {
        And("AND"),
        Not("NOT"),
        Or("OR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Operator.class);

        private final String value;
        private static java.util.Map<String, Operator> map;

        static {
            map = new java.util.HashMap<>();
            for (Operator v : Operator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Operator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Operator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The filter operator. Example: 'AND', 'OR', 'NOT'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final Operator operator;

    /**
     * The filter operator. Example: 'AND', 'OR', 'NOT'.
     * @return the value
     **/
    public Operator getOperator() {
        return operator;
    }

    /**
     * The dimensions to filter on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<Dimension> dimensions;

    /**
     * The dimensions to filter on.
     * @return the value
     **/
    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * The tags to filter on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tag> tags;

    /**
     * The tags to filter on.
     * @return the value
     **/
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * The nested filter object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<Filter> filters;

    /**
     * The nested filter object.
     * @return the value
     **/
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Filter(");
        sb.append("operator=").append(String.valueOf(this.operator));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Filter)) {
            return false;
        }

        Filter other = (Filter) o;
        return java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.filters, other.filters)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
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
