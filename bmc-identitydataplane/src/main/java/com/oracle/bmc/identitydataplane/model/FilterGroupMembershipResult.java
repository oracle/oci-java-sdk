/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FilterGroupMembershipResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FilterGroupMembershipResult {
    @Deprecated
    @java.beans.ConstructorProperties({"principal", "groupIds"})
    public FilterGroupMembershipResult(Principal principal, java.util.List<String> groupIds) {
        super();
        this.principal = principal;
        this.groupIds = groupIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Return passed-in resolved principal object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principal")
        private Principal principal;

        /**
         * Return passed-in resolved principal object
         * @param principal the value to set
         * @return this builder
         **/
        public Builder principal(Principal principal) {
            this.principal = principal;
            this.__explicitlySet__.add("principal");
            return this;
        }
        /**
         * An array of group or dynamic group Ids which present the intersection between the passed-in group/dynamic-group and the actual group/dynamic-group the resovled principal belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupIds")
        private java.util.List<String> groupIds;

        /**
         * An array of group or dynamic group Ids which present the intersection between the passed-in group/dynamic-group and the actual group/dynamic-group the resovled principal belongs to.
         * @param groupIds the value to set
         * @return this builder
         **/
        public Builder groupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            this.__explicitlySet__.add("groupIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FilterGroupMembershipResult build() {
            FilterGroupMembershipResult __instance__ =
                    new FilterGroupMembershipResult(principal, groupIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FilterGroupMembershipResult o) {
            Builder copiedBuilder = principal(o.getPrincipal()).groupIds(o.getGroupIds());

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
     * Return passed-in resolved principal object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principal")
    private final Principal principal;

    /**
     * Return passed-in resolved principal object
     * @return the value
     **/
    public Principal getPrincipal() {
        return principal;
    }

    /**
     * An array of group or dynamic group Ids which present the intersection between the passed-in group/dynamic-group and the actual group/dynamic-group the resovled principal belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupIds")
    private final java.util.List<String> groupIds;

    /**
     * An array of group or dynamic group Ids which present the intersection between the passed-in group/dynamic-group and the actual group/dynamic-group the resovled principal belongs to.
     * @return the value
     **/
    public java.util.List<String> getGroupIds() {
        return groupIds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FilterGroupMembershipResult(");
        sb.append("principal=").append(String.valueOf(this.principal));
        sb.append(", groupIds=").append(String.valueOf(this.groupIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FilterGroupMembershipResult)) {
            return false;
        }

        FilterGroupMembershipResult other = (FilterGroupMembershipResult) o;
        return java.util.Objects.equals(this.principal, other.principal)
                && java.util.Objects.equals(this.groupIds, other.groupIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.principal == null ? 43 : this.principal.hashCode());
        result = (result * PRIME) + (this.groupIds == null ? 43 : this.groupIds.hashCode());
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
