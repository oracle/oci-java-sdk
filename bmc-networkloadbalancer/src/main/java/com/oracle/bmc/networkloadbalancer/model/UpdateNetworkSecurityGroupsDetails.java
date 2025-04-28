/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * An object representing an updated list of network security groups that overwrites the existing
 * list of network security groups. * If the network load balancer has no configured network
 * security groups, then the network load balancer uses the network security groups in this list. *
 * If the network load balancer has a list of configured network security groups, then this list
 * replaces the existing list. * If the network load balancer has a list of configured network
 * security groups and this list is empty, then the operation removes all of the network security
 * groups associated with the network load balancer. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateNetworkSecurityGroupsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateNetworkSecurityGroupsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"networkSecurityGroupIds"})
    public UpdateNetworkSecurityGroupsDetails(java.util.List<String> networkSecurityGroupIds) {
        super();
        this.networkSecurityGroupIds = networkSecurityGroupIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of network security group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with the network load balancer.
         *
         * <p>During the creation of the network load balancer, the service adds the new network
         * load balancer to the specified network security groups.
         *
         * <p>The benefits of associating the network load balancer with network security groups
         * include:
         *
         * <p>Network security groups define network security rules to govern ingress and egress
         * traffic for the network load balancer.
         *
         * <p>The network security rules of other resources can reference the network security
         * groups associated with the network load balancer to ensure access.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * An array of network security group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with the network load balancer.
         *
         * <p>During the creation of the network load balancer, the service adds the new network
         * load balancer to the specified network security groups.
         *
         * <p>The benefits of associating the network load balancer with network security groups
         * include:
         *
         * <p>Network security groups define network security rules to govern ingress and egress
         * traffic for the network load balancer.
         *
         * <p>The network security rules of other resources can reference the network security
         * groups associated with the network load balancer to ensure access.
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         */
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNetworkSecurityGroupsDetails build() {
            UpdateNetworkSecurityGroupsDetails model =
                    new UpdateNetworkSecurityGroupsDetails(this.networkSecurityGroupIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNetworkSecurityGroupsDetails model) {
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
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

    /**
     * An array of network security group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with the network load balancer.
     *
     * <p>During the creation of the network load balancer, the service adds the new network load
     * balancer to the specified network security groups.
     *
     * <p>The benefits of associating the network load balancer with network security groups
     * include:
     *
     * <p>Network security groups define network security rules to govern ingress and egress traffic
     * for the network load balancer.
     *
     * <p>The network security rules of other resources can reference the network security groups
     * associated with the network load balancer to ensure access.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * An array of network security group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with the network load balancer.
     *
     * <p>During the creation of the network load balancer, the service adds the new network load
     * balancer to the specified network security groups.
     *
     * <p>The benefits of associating the network load balancer with network security groups
     * include:
     *
     * <p>Network security groups define network security rules to govern ingress and egress traffic
     * for the network load balancer.
     *
     * <p>The network security rules of other resources can reference the network security groups
     * associated with the network load balancer to ensure access.
     *
     * @return the value
     */
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
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
        sb.append("UpdateNetworkSecurityGroupsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("networkSecurityGroupIds=").append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNetworkSecurityGroupsDetails)) {
            return false;
        }

        UpdateNetworkSecurityGroupsDetails other = (UpdateNetworkSecurityGroupsDetails) o;
        return java.util.Objects.equals(this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
