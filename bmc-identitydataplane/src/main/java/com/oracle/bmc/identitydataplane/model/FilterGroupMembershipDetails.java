/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FilterGroupMembershipDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FilterGroupMembershipDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"principal", "groupIds"})
    public FilterGroupMembershipDetails(Principal principal, java.util.List<String> groupIds) {
        super();
        this.principal = principal;
        this.groupIds = groupIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A resolved principal object */
        @com.fasterxml.jackson.annotation.JsonProperty("principal")
        private Principal principal;

        /**
         * A resolved principal object
         *
         * @param principal the value to set
         * @return this builder
         */
        public Builder principal(Principal principal) {
            this.principal = principal;
            this.__explicitlySet__.add("principal");
            return this;
        }
        /** An array of group or dynamic group Ids the resolved principal potentially belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupIds")
        private java.util.List<String> groupIds;

        /**
         * An array of group or dynamic group Ids the resolved principal potentially belongs to.
         *
         * @param groupIds the value to set
         * @return this builder
         */
        public Builder groupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            this.__explicitlySet__.add("groupIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FilterGroupMembershipDetails build() {
            FilterGroupMembershipDetails model =
                    new FilterGroupMembershipDetails(this.principal, this.groupIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FilterGroupMembershipDetails model) {
            if (model.wasPropertyExplicitlySet("principal")) {
                this.principal(model.getPrincipal());
            }
            if (model.wasPropertyExplicitlySet("groupIds")) {
                this.groupIds(model.getGroupIds());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** A resolved principal object */
    @com.fasterxml.jackson.annotation.JsonProperty("principal")
    private final Principal principal;

    /**
     * A resolved principal object
     *
     * @return the value
     */
    public Principal getPrincipal() {
        return principal;
    }

    /** An array of group or dynamic group Ids the resolved principal potentially belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupIds")
    private final java.util.List<String> groupIds;

    /**
     * An array of group or dynamic group Ids the resolved principal potentially belongs to.
     *
     * @return the value
     */
    public java.util.List<String> getGroupIds() {
        return groupIds;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FilterGroupMembershipDetails(");
        sb.append("super=").append(super.toString());
        sb.append("principal=").append(String.valueOf(this.principal));
        sb.append(", groupIds=").append(String.valueOf(this.groupIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FilterGroupMembershipDetails)) {
            return false;
        }

        FilterGroupMembershipDetails other = (FilterGroupMembershipDetails) o;
        return java.util.Objects.equals(this.principal, other.principal)
                && java.util.Objects.equals(this.groupIds, other.groupIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.principal == null ? 43 : this.principal.hashCode());
        result = (result * PRIME) + (this.groupIds == null ? 43 : this.groupIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
