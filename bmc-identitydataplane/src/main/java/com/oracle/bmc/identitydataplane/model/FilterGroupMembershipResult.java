/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FilterGroupMembershipResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FilterGroupMembershipResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("principal")
        private Principal principal;

        public Builder principal(Principal principal) {
            this.principal = principal;
            this.__explicitlySet__.add("principal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupIds")
        private java.util.List<String> groupIds;

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

    /**
     * Return passed-in resolved principal object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principal")
    Principal principal;

    /**
     * An array of group or dynamic group Ids which present the intersection between the passed-in group/dynamic-group and the actual group/dynamic-group the resovled principal belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupIds")
    java.util.List<String> groupIds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
