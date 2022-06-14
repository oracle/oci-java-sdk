/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * A group of filters to match announcements against.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FilterGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FilterGroup {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "filters"})
    public FilterGroup(String name, java.util.List<Filter> filters) {
        super();
        this.name = name;
        this.filters = filters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the group. The name must be unique and it cannot be changed. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the group. The name must be unique and it cannot be changed. Avoid entering confidential information.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A list of filters against which the Announcements service matches announcements. You cannot have more than one of any given filter type within a filter group. You also cannot combine the RESOURCE_ID filter with any other type of filter within a given filter group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<Filter> filters;

        /**
         * A list of filters against which the Announcements service matches announcements. You cannot have more than one of any given filter type within a filter group. You also cannot combine the RESOURCE_ID filter with any other type of filter within a given filter group.
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

        public FilterGroup build() {
            FilterGroup __instance__ = new FilterGroup(name, filters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FilterGroup o) {
            Builder copiedBuilder = name(o.getName()).filters(o.getFilters());

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
     * The name of the group. The name must be unique and it cannot be changed. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the group. The name must be unique and it cannot be changed. Avoid entering confidential information.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A list of filters against which the Announcements service matches announcements. You cannot have more than one of any given filter type within a filter group. You also cannot combine the RESOURCE_ID filter with any other type of filter within a given filter group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<Filter> filters;

    /**
     * A list of filters against which the Announcements service matches announcements. You cannot have more than one of any given filter type within a filter group. You also cannot combine the RESOURCE_ID filter with any other type of filter within a given filter group.
     * @return the value
     **/
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FilterGroup(");
        sb.append("name=").append(String.valueOf(this.name));
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
        if (!(o instanceof FilterGroup)) {
            return false;
        }

        FilterGroup other = (FilterGroup) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.filters, other.filters)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
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
