/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The BYOL allocations used for VMware Cluster provisioning.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClusterByolAllocationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterByolAllocationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vsanByolAllocationId", "firewallByolAllocationId"})
    public ClusterByolAllocationDetails(
            String vsanByolAllocationId, String firewallByolAllocationId) {
        super();
        this.vsanByolAllocationId = vsanByolAllocationId;
        this.firewallByolAllocationId = firewallByolAllocationId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware vSAN.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vsanByolAllocationId")
        private String vsanByolAllocationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware vSAN.
         *
         * @param vsanByolAllocationId the value to set
         * @return this builder
         **/
        public Builder vsanByolAllocationId(String vsanByolAllocationId) {
            this.vsanByolAllocationId = vsanByolAllocationId;
            this.__explicitlySet__.add("vsanByolAllocationId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware vDefend Firewall.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firewallByolAllocationId")
        private String firewallByolAllocationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware vDefend Firewall.
         *
         * @param firewallByolAllocationId the value to set
         * @return this builder
         **/
        public Builder firewallByolAllocationId(String firewallByolAllocationId) {
            this.firewallByolAllocationId = firewallByolAllocationId;
            this.__explicitlySet__.add("firewallByolAllocationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterByolAllocationDetails build() {
            ClusterByolAllocationDetails model =
                    new ClusterByolAllocationDetails(
                            this.vsanByolAllocationId, this.firewallByolAllocationId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterByolAllocationDetails model) {
            if (model.wasPropertyExplicitlySet("vsanByolAllocationId")) {
                this.vsanByolAllocationId(model.getVsanByolAllocationId());
            }
            if (model.wasPropertyExplicitlySet("firewallByolAllocationId")) {
                this.firewallByolAllocationId(model.getFirewallByolAllocationId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware vSAN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsanByolAllocationId")
    private final String vsanByolAllocationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware vSAN.
     *
     * @return the value
     **/
    public String getVsanByolAllocationId() {
        return vsanByolAllocationId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware vDefend Firewall.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firewallByolAllocationId")
    private final String firewallByolAllocationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware vDefend Firewall.
     *
     * @return the value
     **/
    public String getFirewallByolAllocationId() {
        return firewallByolAllocationId;
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
        sb.append("ClusterByolAllocationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vsanByolAllocationId=").append(String.valueOf(this.vsanByolAllocationId));
        sb.append(", firewallByolAllocationId=")
                .append(String.valueOf(this.firewallByolAllocationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterByolAllocationDetails)) {
            return false;
        }

        ClusterByolAllocationDetails other = (ClusterByolAllocationDetails) o;
        return java.util.Objects.equals(this.vsanByolAllocationId, other.vsanByolAllocationId)
                && java.util.Objects.equals(
                        this.firewallByolAllocationId, other.firewallByolAllocationId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.vsanByolAllocationId == null
                                ? 43
                                : this.vsanByolAllocationId.hashCode());
        result =
                (result * PRIME)
                        + (this.firewallByolAllocationId == null
                                ? 43
                                : this.firewallByolAllocationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
