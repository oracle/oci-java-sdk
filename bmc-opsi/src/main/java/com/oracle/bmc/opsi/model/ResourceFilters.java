/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Information to filter the actual target resources in an operation.
 * e.g: While querying a DATABASE_INSIGHTS_DATA_OBJECT using /opsiDataObjects/actions/queryData API,
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
public final class ResourceFilters extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTagEquals",
        "freeformTagEquals",
        "definedTagExists",
        "freeformTagExists",
        "compartmentIdInSubtree",
        "resourceStatus"
    })
    public ResourceFilters(
            java.util.List<String> definedTagEquals,
            java.util.List<String> freeformTagEquals,
            java.util.List<String> definedTagExists,
            java.util.List<String> freeformTagExists,
            Boolean compartmentIdInSubtree,
            java.util.List<ResourceStatus> resourceStatus) {
        super();
        this.definedTagEquals = definedTagEquals;
        this.freeformTagEquals = freeformTagEquals;
        this.definedTagExists = definedTagExists;
        this.freeformTagExists = freeformTagExists;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.resourceStatus = resourceStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of tag filters to apply.  Only resources with a defined tag matching the value will be considered.
         * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTagEquals")
        private java.util.List<String> definedTagEquals;

        /**
         * A list of tag filters to apply.  Only resources with a defined tag matching the value will be considered.
         * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @param definedTagEquals the value to set
         * @return this builder
         **/
        public Builder definedTagEquals(java.util.List<String> definedTagEquals) {
            this.definedTagEquals = definedTagEquals;
            this.__explicitlySet__.add("definedTagEquals");
            return this;
        }
        /**
         * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be considered.
         * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTagEquals")
        private java.util.List<String> freeformTagEquals;

        /**
         * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be considered.
         * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
         *
         * @param freeformTagEquals the value to set
         * @return this builder
         **/
        public Builder freeformTagEquals(java.util.List<String> freeformTagEquals) {
            this.freeformTagEquals = freeformTagEquals;
            this.__explicitlySet__.add("freeformTagEquals");
            return this;
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
        private java.util.List<String> definedTagExists;

        /**
         * A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be considered.
         * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
         * or "{namespace}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @param definedTagExists the value to set
         * @return this builder
         **/
        public Builder definedTagExists(java.util.List<String> definedTagExists) {
            this.definedTagExists = definedTagExists;
            this.__explicitlySet__.add("definedTagExists");
            return this;
        }
        /**
         * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist will be considered.
         * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for different tag names are interpreted as "AND".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTagExists")
        private java.util.List<String> freeformTagExists;

        /**
         * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist will be considered.
         * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for different tag names are interpreted as "AND".
         *
         * @param freeformTagExists the value to set
         * @return this builder
         **/
        public Builder freeformTagExists(java.util.List<String> freeformTagExists) {
            this.freeformTagExists = freeformTagExists;
            this.__explicitlySet__.add("freeformTagExists");
            return this;
        }
        /**
         * A flag to consider all resources within a given compartment and all sub-compartments.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        /**
         * A flag to consider all resources within a given compartment and all sub-compartments.
         * @param compartmentIdInSubtree the value to set
         * @return this builder
         **/
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }
        /**
         * Filter resources by status, multiple options could be chosen to show authorized resources even if those are disabled or deleted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceStatus")
        private java.util.List<ResourceStatus> resourceStatus;

        /**
         * Filter resources by status, multiple options could be chosen to show authorized resources even if those are disabled or deleted.
         *
         * @param resourceStatus the value to set
         * @return this builder
         **/
        public Builder resourceStatus(java.util.List<ResourceStatus> resourceStatus) {
            this.resourceStatus = resourceStatus;
            this.__explicitlySet__.add("resourceStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceFilters build() {
            ResourceFilters model =
                    new ResourceFilters(
                            this.definedTagEquals,
                            this.freeformTagEquals,
                            this.definedTagExists,
                            this.freeformTagExists,
                            this.compartmentIdInSubtree,
                            this.resourceStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceFilters model) {
            if (model.wasPropertyExplicitlySet("definedTagEquals")) {
                this.definedTagEquals(model.getDefinedTagEquals());
            }
            if (model.wasPropertyExplicitlySet("freeformTagEquals")) {
                this.freeformTagEquals(model.getFreeformTagEquals());
            }
            if (model.wasPropertyExplicitlySet("definedTagExists")) {
                this.definedTagExists(model.getDefinedTagExists());
            }
            if (model.wasPropertyExplicitlySet("freeformTagExists")) {
                this.freeformTagExists(model.getFreeformTagExists());
            }
            if (model.wasPropertyExplicitlySet("compartmentIdInSubtree")) {
                this.compartmentIdInSubtree(model.getCompartmentIdInSubtree());
            }
            if (model.wasPropertyExplicitlySet("resourceStatus")) {
                this.resourceStatus(model.getResourceStatus());
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
     * A list of tag filters to apply.  Only resources with a defined tag matching the value will be considered.
     * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTagEquals")
    private final java.util.List<String> definedTagEquals;

    /**
     * A list of tag filters to apply.  Only resources with a defined tag matching the value will be considered.
     * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     * @return the value
     **/
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

    /**
     * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be considered.
     * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
     *
     * @return the value
     **/
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

    /**
     * A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be considered.
     * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
     * or "{namespace}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     * @return the value
     **/
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

    /**
     * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist will be considered.
     * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for different tag names are interpreted as "AND".
     *
     * @return the value
     **/
    public java.util.List<String> getFreeformTagExists() {
        return freeformTagExists;
    }

    /**
     * A flag to consider all resources within a given compartment and all sub-compartments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    /**
     * A flag to consider all resources within a given compartment and all sub-compartments.
     * @return the value
     **/
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    /**
     * Filter resources by status, multiple options could be chosen to show authorized resources even if those are disabled or deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceStatus")
    private final java.util.List<ResourceStatus> resourceStatus;

    /**
     * Filter resources by status, multiple options could be chosen to show authorized resources even if those are disabled or deleted.
     *
     * @return the value
     **/
    public java.util.List<ResourceStatus> getResourceStatus() {
        return resourceStatus;
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
        sb.append("ResourceFilters(");
        sb.append("super=").append(super.toString());
        sb.append("definedTagEquals=").append(String.valueOf(this.definedTagEquals));
        sb.append(", freeformTagEquals=").append(String.valueOf(this.freeformTagEquals));
        sb.append(", definedTagExists=").append(String.valueOf(this.definedTagExists));
        sb.append(", freeformTagExists=").append(String.valueOf(this.freeformTagExists));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(", resourceStatus=").append(String.valueOf(this.resourceStatus));
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
                && java.util.Objects.equals(this.resourceStatus, other.resourceStatus)
                && super.equals(other);
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
                        + (this.resourceStatus == null ? 43 : this.resourceStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
