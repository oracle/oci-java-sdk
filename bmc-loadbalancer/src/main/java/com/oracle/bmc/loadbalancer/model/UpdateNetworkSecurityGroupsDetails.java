/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object representing an updated list of network security groups (NSGs) that overwrites the
 * existing list of NSGs. * If the load balancer has no NSGs configured, it uses the NSGs in this
 * list. * If the load balancer has a list of NSGs configured, this list replaces the existing list.
 * * If the load balancer has a list of NSGs configured and this list is empty, the operation
 * removes all of the load balancer's NSG associations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
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
         * An array of NSG
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with the load balancer.
         *
         * <p>During the load balancer's creation, the service adds the new load balancer to the
         * specified NSGs.
         *
         * <p>The benefits of associating the load balancer with NSGs include:
         *
         * <p>NSGs define network security rules to govern ingress and egress traffic for the load
         * balancer.
         *
         * <p>The network security rules of other resources can reference the NSGs associated with
         * the load balancer to ensure access.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * An array of NSG
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with the load balancer.
         *
         * <p>During the load balancer's creation, the service adds the new load balancer to the
         * specified NSGs.
         *
         * <p>The benefits of associating the load balancer with NSGs include:
         *
         * <p>NSGs define network security rules to govern ingress and egress traffic for the load
         * balancer.
         *
         * <p>The network security rules of other resources can reference the NSGs associated with
         * the load balancer to ensure access.
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
     * An array of NSG
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with the load balancer.
     *
     * <p>During the load balancer's creation, the service adds the new load balancer to the
     * specified NSGs.
     *
     * <p>The benefits of associating the load balancer with NSGs include:
     *
     * <p>NSGs define network security rules to govern ingress and egress traffic for the load
     * balancer.
     *
     * <p>The network security rules of other resources can reference the NSGs associated with the
     * load balancer to ensure access.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * An array of NSG
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with the load balancer.
     *
     * <p>During the load balancer's creation, the service adds the new load balancer to the
     * specified NSGs.
     *
     * <p>The benefits of associating the load balancer with NSGs include:
     *
     * <p>NSGs define network security rules to govern ingress and egress traffic for the load
     * balancer.
     *
     * <p>The network security rules of other resources can reference the NSGs associated with the
     * load balancer to ensure access.
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
