/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The secondary VNIC object for the placement configuration for an instance pool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstancePoolPlacementSecondaryVnicSubnet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolPlacementSecondaryVnicSubnet
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isAssignIpv6Ip",
        "ipv6AddressIpv6SubnetCidrPairDetails",
        "subnetId"
    })
    public InstancePoolPlacementSecondaryVnicSubnet(
            String displayName,
            Boolean isAssignIpv6Ip,
            java.util.List<InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails>
                    ipv6AddressIpv6SubnetCidrPairDetails,
            String subnetId) {
        super();
        this.displayName = displayName;
        this.isAssignIpv6Ip = isAssignIpv6Ip;
        this.ipv6AddressIpv6SubnetCidrPairDetails = ipv6AddressIpv6SubnetCidrPairDetails;
        this.subnetId = subnetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name of the VNIC. This is also used to match against the instance
         * configuration defined secondary VNIC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the VNIC. This is also used to match against the instance
         * configuration defined secondary VNIC.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
         * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
         * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code
         * ipv6SubnetCidr} is not provided then an IPv6 prefix is chosen for you.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAssignIpv6Ip")
        private Boolean isAssignIpv6Ip;

        /**
         * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
         * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
         * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code
         * ipv6SubnetCidr} is not provided then an IPv6 prefix is chosen for you.
         *
         * @param isAssignIpv6Ip the value to set
         * @return this builder
         */
        public Builder isAssignIpv6Ip(Boolean isAssignIpv6Ip) {
            this.isAssignIpv6Ip = isAssignIpv6Ip;
            this.__explicitlySet__.add("isAssignIpv6Ip");
            return this;
        }
        /**
         * A list of IPv6 prefix ranges from which the VNIC should be assigned an IPv6 address. You
         * can provide only the prefix ranges and OCI will select an available address from the
         * range. You can optionally choose to leave the prefix range empty and instead provide the
         * specific IPv6 address that should be used from within that range.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6AddressIpv6SubnetCidrPairDetails")
        private java.util.List<InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails>
                ipv6AddressIpv6SubnetCidrPairDetails;

        /**
         * A list of IPv6 prefix ranges from which the VNIC should be assigned an IPv6 address. You
         * can provide only the prefix ranges and OCI will select an available address from the
         * range. You can optionally choose to leave the prefix range empty and instead provide the
         * specific IPv6 address that should be used from within that range.
         *
         * @param ipv6AddressIpv6SubnetCidrPairDetails the value to set
         * @return this builder
         */
        public Builder ipv6AddressIpv6SubnetCidrPairDetails(
                java.util.List<InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails>
                        ipv6AddressIpv6SubnetCidrPairDetails) {
            this.ipv6AddressIpv6SubnetCidrPairDetails = ipv6AddressIpv6SubnetCidrPairDetails;
            this.__explicitlySet__.add("ipv6AddressIpv6SubnetCidrPairDetails");
            return this;
        }
        /**
         * The subnet [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the secondary VNIC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The subnet [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the secondary VNIC.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolPlacementSecondaryVnicSubnet build() {
            InstancePoolPlacementSecondaryVnicSubnet model =
                    new InstancePoolPlacementSecondaryVnicSubnet(
                            this.displayName,
                            this.isAssignIpv6Ip,
                            this.ipv6AddressIpv6SubnetCidrPairDetails,
                            this.subnetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolPlacementSecondaryVnicSubnet model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isAssignIpv6Ip")) {
                this.isAssignIpv6Ip(model.getIsAssignIpv6Ip());
            }
            if (model.wasPropertyExplicitlySet("ipv6AddressIpv6SubnetCidrPairDetails")) {
                this.ipv6AddressIpv6SubnetCidrPairDetails(
                        model.getIpv6AddressIpv6SubnetCidrPairDetails());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
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
     * The display name of the VNIC. This is also used to match against the instance configuration
     * defined secondary VNIC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the VNIC. This is also used to match against the instance configuration
     * defined secondary VNIC.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
     * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
     * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code ipv6SubnetCidr} is
     * not provided then an IPv6 prefix is chosen for you.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAssignIpv6Ip")
    private final Boolean isAssignIpv6Ip;

    /**
     * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
     * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
     * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code ipv6SubnetCidr} is
     * not provided then an IPv6 prefix is chosen for you.
     *
     * @return the value
     */
    public Boolean getIsAssignIpv6Ip() {
        return isAssignIpv6Ip;
    }

    /**
     * A list of IPv6 prefix ranges from which the VNIC should be assigned an IPv6 address. You can
     * provide only the prefix ranges and OCI will select an available address from the range. You
     * can optionally choose to leave the prefix range empty and instead provide the specific IPv6
     * address that should be used from within that range.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6AddressIpv6SubnetCidrPairDetails")
    private final java.util.List<InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails>
            ipv6AddressIpv6SubnetCidrPairDetails;

    /**
     * A list of IPv6 prefix ranges from which the VNIC should be assigned an IPv6 address. You can
     * provide only the prefix ranges and OCI will select an available address from the range. You
     * can optionally choose to leave the prefix range empty and instead provide the specific IPv6
     * address that should be used from within that range.
     *
     * @return the value
     */
    public java.util.List<InstancePoolPlacementIpv6AddressIpv6SubnetCidrDetails>
            getIpv6AddressIpv6SubnetCidrPairDetails() {
        return ipv6AddressIpv6SubnetCidrPairDetails;
    }

    /**
     * The subnet [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the secondary VNIC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The subnet [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the secondary VNIC.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
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
        sb.append("InstancePoolPlacementSecondaryVnicSubnet(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isAssignIpv6Ip=").append(String.valueOf(this.isAssignIpv6Ip));
        sb.append(", ipv6AddressIpv6SubnetCidrPairDetails=")
                .append(String.valueOf(this.ipv6AddressIpv6SubnetCidrPairDetails));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolPlacementSecondaryVnicSubnet)) {
            return false;
        }

        InstancePoolPlacementSecondaryVnicSubnet other =
                (InstancePoolPlacementSecondaryVnicSubnet) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isAssignIpv6Ip, other.isAssignIpv6Ip)
                && java.util.Objects.equals(
                        this.ipv6AddressIpv6SubnetCidrPairDetails,
                        other.ipv6AddressIpv6SubnetCidrPairDetails)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isAssignIpv6Ip == null ? 43 : this.isAssignIpv6Ip.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6AddressIpv6SubnetCidrPairDetails == null
                                ? 43
                                : this.ipv6AddressIpv6SubnetCidrPairDetails.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
