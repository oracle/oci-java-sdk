/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIpv6Details.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateIpv6Details {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "ipAddress",
        "vnicId",
        "ipv6SubnetCidr"
    })
    public CreateIpv6Details(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String ipAddress,
            String vnicId,
            String ipv6SubnetCidr) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.ipAddress = ipAddress;
        this.vnicId = vnicId;
        this.ipv6SubnetCidr = ipv6SubnetCidr;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * An IPv6 address of your choice. Must be an available IP address within
         * the subnet's CIDR. If you don't specify a value, Oracle automatically
         * assigns an IPv6 address from the subnet. The subnet is the one that
         * contains the VNIC you specify in {@code vnicId}.
         * <p>
         * Example: {@code 2001:DB8::}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * An IPv6 address of your choice. Must be an available IP address within
         * the subnet's CIDR. If you don't specify a value, Oracle automatically
         * assigns an IPv6 address from the subnet. The subnet is the one that
         * contains the VNIC you specify in {@code vnicId}.
         * <p>
         * Example: {@code 2001:DB8::}
         *
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the IPv6 to. The
         * IPv6 will be in the VNIC's subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the IPv6 to. The
         * IPv6 will be in the VNIC's subnet.
         *
         * @param vnicId the value to set
         * @return this builder
         **/
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }
        /**
         * The IPv6 CIDR allocated to the subnet. This is required if more than one IPv6 CIDR exists on the subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6SubnetCidr")
        private String ipv6SubnetCidr;

        /**
         * The IPv6 CIDR allocated to the subnet. This is required if more than one IPv6 CIDR exists on the subnet.
         *
         * @param ipv6SubnetCidr the value to set
         * @return this builder
         **/
        public Builder ipv6SubnetCidr(String ipv6SubnetCidr) {
            this.ipv6SubnetCidr = ipv6SubnetCidr;
            this.__explicitlySet__.add("ipv6SubnetCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIpv6Details build() {
            CreateIpv6Details __instance__ =
                    new CreateIpv6Details(
                            definedTags,
                            displayName,
                            freeformTags,
                            ipAddress,
                            vnicId,
                            ipv6SubnetCidr);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIpv6Details o) {
            Builder copiedBuilder =
                    definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .ipAddress(o.getIpAddress())
                            .vnicId(o.getVnicId())
                            .ipv6SubnetCidr(o.getIpv6SubnetCidr());

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
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * An IPv6 address of your choice. Must be an available IP address within
     * the subnet's CIDR. If you don't specify a value, Oracle automatically
     * assigns an IPv6 address from the subnet. The subnet is the one that
     * contains the VNIC you specify in {@code vnicId}.
     * <p>
     * Example: {@code 2001:DB8::}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * An IPv6 address of your choice. Must be an available IP address within
     * the subnet's CIDR. If you don't specify a value, Oracle automatically
     * assigns an IPv6 address from the subnet. The subnet is the one that
     * contains the VNIC you specify in {@code vnicId}.
     * <p>
     * Example: {@code 2001:DB8::}
     *
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the IPv6 to. The
     * IPv6 will be in the VNIC's subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the IPv6 to. The
     * IPv6 will be in the VNIC's subnet.
     *
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    /**
     * The IPv6 CIDR allocated to the subnet. This is required if more than one IPv6 CIDR exists on the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6SubnetCidr")
    private final String ipv6SubnetCidr;

    /**
     * The IPv6 CIDR allocated to the subnet. This is required if more than one IPv6 CIDR exists on the subnet.
     *
     * @return the value
     **/
    public String getIpv6SubnetCidr() {
        return ipv6SubnetCidr;
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
        sb.append("CreateIpv6Details(");
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", ipv6SubnetCidr=").append(String.valueOf(this.ipv6SubnetCidr));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIpv6Details)) {
            return false;
        }

        CreateIpv6Details other = (CreateIpv6Details) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.ipv6SubnetCidr, other.ipv6SubnetCidr)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6SubnetCidr == null ? 43 : this.ipv6SubnetCidr.hashCode());
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
