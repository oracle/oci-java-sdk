/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Information to filter the actual target resources in an operation.
 * e.g: While quering a DATABASE_INSIGHTS_DATA_OBJECT using /opsiDataObjects/{opsiDataObjectidentifier}/actions/queryData API,
 * if resourceFilters is set with valid value for definedTagEquals field, only data of the database insights
 * resources for which the specified freeform tags exist will be considered for the actual query scope.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceFilters.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceFilters {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTagEquals",
        "freeformTagEquals",
        "definedTagExists",
        "freeformTagExists",
        "compartmentIdInSubtree"
    })
    public ResourceFilters(
            java.util.List<String> definedTagEquals,
            java.util.List<String> freeformTagEquals,
            java.util.List<String> definedTagExists,
            java.util.List<String> freeformTagExists,
            Boolean compartmentIdInSubtree) {
        super();
        this.definedTagEquals = definedTagEquals;
        this.freeformTagEquals = freeformTagEquals;
        this.definedTagExists = definedTagExists;
        this.freeformTagExists = freeformTagExists;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("definedTagEquals")
        private java.util.List<String> definedTagEquals;

        public Builder definedTagEquals(java.util.List<String> definedTagEquals) {
            this.definedTagEquals = definedTagEquals;
            this.__explicitlySet__.add("definedTagEquals");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTagEquals")
        private java.util.List<String> freeformTagEquals;

        public Builder freeformTagEquals(java.util.List<String> freeformTagEquals) {
            this.freeformTagEquals = freeformTagEquals;
            this.__explicitlySet__.add("freeformTagEquals");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTagExists")
        private java.util.List<String> definedTagExists;

        public Builder definedTagExists(java.util.List<String> definedTagExists) {
            this.definedTagExists = definedTagExists;
            this.__explicitlySet__.add("definedTagExists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTagExists")
        private java.util.List<String> freeformTagExists;

        public Builder freeformTagExists(java.util.List<String> freeformTagExists) {
            this.freeformTagExists = freeformTagExists;
            this.__explicitlySet__.add("freeformTagExists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceFilters build() {
            ResourceFilters __instance__ =
                    new ResourceFilters(
                            definedTagEquals,
                            freeformTagEquals,
                            definedTagExists,
                            freeformTagExists,
                            compartmentIdInSubtree);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceFilters o) {
            Builder copiedBuilder =
                    definedTagEquals(o.getDefinedTagEquals())
                            .freeformTagEquals(o.getFreeformTagEquals())
                            .definedTagExists(o.getDefinedTagExists())
                            .freeformTagExists(o.getFreeformTagExists())
                            .compartmentIdInSubtree(o.getCompartmentIdInSubtree());

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
     * A list of tag filters to apply.  Only resources with a defined tag matching the value will be considered.
     * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTagEquals")
    private final java.util.List<String> definedTagEquals;

    public java.util.List<String> getDefinedTagEquals() {
        return definedTagEquals;
    }

    /**
     * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be considered.
     * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTagEquals")
    private final java.util.List<String> freeformTagEquals;

    public java.util.List<String> getFreeformTagEquals() {
        return freeformTagEquals;
    }

    /**
     * A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be considered.
     * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
     * or "{namespace}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTagExists")
    private final java.util.List<String> definedTagExists;

    public java.util.List<String> getDefinedTagExists() {
        return definedTagExists;
    }

    /**
     * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist will be considered.
     * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for different tag names are interpreted as "AND".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTagExists")
    private final java.util.List<String> freeformTagExists;

    public java.util.List<String> getFreeformTagExists() {
        return freeformTagExists;
    }

    /**
     * A flag to consider all resources within a given compartment and all sub-compartments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceFilters(");
        sb.append("definedTagEquals=").append(String.valueOf(this.definedTagEquals));
        sb.append(", freeformTagEquals=").append(String.valueOf(this.freeformTagEquals));
        sb.append(", definedTagExists=").append(String.valueOf(this.definedTagExists));
        sb.append(", freeformTagExists=").append(String.valueOf(this.freeformTagExists));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceFilters)) {
            return false;
        }

        ResourceFilters other = (ResourceFilters) o;
        return java.util.Objects.equals(this.definedTagEquals, other.definedTagEquals)
                && java.util.Objects.equals(this.freeformTagEquals, other.freeformTagEquals)
                && java.util.Objects.equals(this.definedTagExists, other.definedTagExists)
                && java.util.Objects.equals(this.freeformTagExists, other.freeformTagExists)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.definedTagEquals == null ? 43 : this.definedTagEquals.hashCode());
        result =
                (result * PRIME)
                        + (this.freeformTagEquals == null ? 43 : this.freeformTagEquals.hashCode());
        result =
                (result * PRIME)
                        + (this.definedTagExists == null ? 43 : this.definedTagExists.hashCode());
        result =
                (result * PRIME)
                        + (this.freeformTagExists == null ? 43 : this.freeformTagExists.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
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
