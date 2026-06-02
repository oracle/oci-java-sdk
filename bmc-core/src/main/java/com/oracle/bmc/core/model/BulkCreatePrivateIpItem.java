/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * An object used to create secondary private IPv4 addresses in a bulk operation.
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
    builder = BulkCreatePrivateIpItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkCreatePrivateIpItem
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "hostnameLabel",
        "ipAddress",
        "lifetime",
        "routeTableId",
        "cidrPrefixLength",
        "ipv4SubnetCidrAtCreation"
    })
    public BulkCreatePrivateIpItem(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String hostnameLabel,
            String ipAddress,
            Lifetime lifetime,
            String routeTableId,
            Integer cidrPrefixLength,
            String ipv4SubnetCidrAtCreation) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.hostnameLabel = hostnameLabel;
        this.ipAddress = ipAddress;
        this.lifetime = lifetime;
        this.routeTableId = routeTableId;
        this.cidrPrefixLength = cidrPrefixLength;
        this.ipv4SubnetCidrAtCreation = ipv4SubnetCidrAtCreation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The hostname for the private IP. Used for DNS. The value
         * is the hostname portion of the private IP's fully qualified domain name (FQDN)
         * (for example, {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}).
         * Must be unique across all VNICs in the subnet and comply with
         * [RFC 952](https://tools.ietf.org/html/rfc952) and
         * [RFC 1123](https://tools.ietf.org/html/rfc1123).
         * <p>
         * For more information, see
         * [DNS in Your Virtual Cloud Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         * <p>
         * Example: {@code bminstance1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * The hostname for the private IP. Used for DNS. The value
         * is the hostname portion of the private IP's fully qualified domain name (FQDN)
         * (for example, {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}).
         * Must be unique across all VNICs in the subnet and comply with
         * [RFC 952](https://tools.ietf.org/html/rfc952) and
         * [RFC 1123](https://tools.ietf.org/html/rfc1123).
         * <p>
         * For more information, see
         * [DNS in Your Virtual Cloud Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         * <p>
         * Example: {@code bminstance1}
         *
         * @param hostnameLabel the value to set
         * @return this builder
         **/
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }
        /**
         * A private IP address of your choice. Must be an available IP address within
         * the subnet's CIDR. If you don't specify a value, Oracle automatically
         * assigns a private IP address from the subnet.
         * <p>
         * Example: {@code 10.0.3.3}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * A private IP address of your choice. Must be an available IP address within
         * the subnet's CIDR. If you don't specify a value, Oracle automatically
         * assigns a private IP address from the subnet.
         * <p>
         * Example: {@code 10.0.3.3}
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
         * Lifetime of the IP address.
         * There are two types of IPs:
         *  - Ephemeral
         *  - Reserved
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
        private Lifetime lifetime;

        /**
         * Lifetime of the IP address.
         * There are two types of IPs:
         *  - Ephemeral
         *  - Reserved
         *
         * @param lifetime the value to set
         * @return this builder
         **/
        public Builder lifetime(Lifetime lifetime) {
            this.lifetime = lifetime;
            this.__explicitlySet__.add("lifetime");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
         * [Per-resource Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
         * [Per-resource Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
         *
         * @param routeTableId the value to set
         * @return this builder
         **/
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * An optional field that when combined with the ipAddress field, will be used to allocate secondary IPv4 CIDRs.
         * The CIDR range created by this combination must be within the subnet's CIDR
         * and the CIDR range should not collide with any existing IPv4 address allocation.
         * The VNIC ID specified in the request object should not already been assigned more than the max IPv4 addresses.
         * If you don't specify a value, this option will be ignored.
         * <p>
         * Example: 18
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidrPrefixLength")
        private Integer cidrPrefixLength;

        /**
         * An optional field that when combined with the ipAddress field, will be used to allocate secondary IPv4 CIDRs.
         * The CIDR range created by this combination must be within the subnet's CIDR
         * and the CIDR range should not collide with any existing IPv4 address allocation.
         * The VNIC ID specified in the request object should not already been assigned more than the max IPv4 addresses.
         * If you don't specify a value, this option will be ignored.
         * <p>
         * Example: 18
         *
         * @param cidrPrefixLength the value to set
         * @return this builder
         **/
        public Builder cidrPrefixLength(Integer cidrPrefixLength) {
            this.cidrPrefixLength = cidrPrefixLength;
            this.__explicitlySet__.add("cidrPrefixLength");
            return this;
        }
        /**
         * Any one of the IPv4 CIDRs allocated to the subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4SubnetCidrAtCreation")
        private String ipv4SubnetCidrAtCreation;

        /**
         * Any one of the IPv4 CIDRs allocated to the subnet.
         *
         * @param ipv4SubnetCidrAtCreation the value to set
         * @return this builder
         **/
        public Builder ipv4SubnetCidrAtCreation(String ipv4SubnetCidrAtCreation) {
            this.ipv4SubnetCidrAtCreation = ipv4SubnetCidrAtCreation;
            this.__explicitlySet__.add("ipv4SubnetCidrAtCreation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkCreatePrivateIpItem build() {
            BulkCreatePrivateIpItem model =
                    new BulkCreatePrivateIpItem(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.hostnameLabel,
                            this.ipAddress,
                            this.lifetime,
                            this.routeTableId,
                            this.cidrPrefixLength,
                            this.ipv4SubnetCidrAtCreation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkCreatePrivateIpItem model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("hostnameLabel")) {
                this.hostnameLabel(model.getHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("lifetime")) {
                this.lifetime(model.getLifetime());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("cidrPrefixLength")) {
                this.cidrPrefixLength(model.getCidrPrefixLength());
            }
            if (model.wasPropertyExplicitlySet("ipv4SubnetCidrAtCreation")) {
                this.ipv4SubnetCidrAtCreation(model.getIpv4SubnetCidrAtCreation());
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
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The hostname for the private IP. Used for DNS. The value
     * is the hostname portion of the private IP's fully qualified domain name (FQDN)
     * (for example, {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}).
     * Must be unique across all VNICs in the subnet and comply with
     * [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123).
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: {@code bminstance1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * The hostname for the private IP. Used for DNS. The value
     * is the hostname portion of the private IP's fully qualified domain name (FQDN)
     * (for example, {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}).
     * Must be unique across all VNICs in the subnet and comply with
     * [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123).
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: {@code bminstance1}
     *
     * @return the value
     **/
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * A private IP address of your choice. Must be an available IP address within
     * the subnet's CIDR. If you don't specify a value, Oracle automatically
     * assigns a private IP address from the subnet.
     * <p>
     * Example: {@code 10.0.3.3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * A private IP address of your choice. Must be an available IP address within
     * the subnet's CIDR. If you don't specify a value, Oracle automatically
     * assigns a private IP address from the subnet.
     * <p>
     * Example: {@code 10.0.3.3}
     *
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Lifetime of the IP address.
     * There are two types of IPs:
     *  - Ephemeral
     *  - Reserved
     *
     **/
    public enum Lifetime {
        Ephemeral("EPHEMERAL"),
        Reserved("RESERVED"),
        ;

        private final String value;
        private static java.util.Map<String, Lifetime> map;

        static {
            map = new java.util.HashMap<>();
            for (Lifetime v : Lifetime.values()) {
                map.put(v.getValue(), v);
            }
        }

        Lifetime(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Lifetime create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Lifetime: " + key);
        }
    };
    /**
     * Lifetime of the IP address.
     * There are two types of IPs:
     *  - Ephemeral
     *  - Reserved
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
    private final Lifetime lifetime;

    /**
     * Lifetime of the IP address.
     * There are two types of IPs:
     *  - Ephemeral
     *  - Reserved
     *
     * @return the value
     **/
    public Lifetime getLifetime() {
        return lifetime;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
     * [Per-resource Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
     * [Per-resource Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
     *
     * @return the value
     **/
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * An optional field that when combined with the ipAddress field, will be used to allocate secondary IPv4 CIDRs.
     * The CIDR range created by this combination must be within the subnet's CIDR
     * and the CIDR range should not collide with any existing IPv4 address allocation.
     * The VNIC ID specified in the request object should not already been assigned more than the max IPv4 addresses.
     * If you don't specify a value, this option will be ignored.
     * <p>
     * Example: 18
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrPrefixLength")
    private final Integer cidrPrefixLength;

    /**
     * An optional field that when combined with the ipAddress field, will be used to allocate secondary IPv4 CIDRs.
     * The CIDR range created by this combination must be within the subnet's CIDR
     * and the CIDR range should not collide with any existing IPv4 address allocation.
     * The VNIC ID specified in the request object should not already been assigned more than the max IPv4 addresses.
     * If you don't specify a value, this option will be ignored.
     * <p>
     * Example: 18
     *
     * @return the value
     **/
    public Integer getCidrPrefixLength() {
        return cidrPrefixLength;
    }

    /**
     * Any one of the IPv4 CIDRs allocated to the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4SubnetCidrAtCreation")
    private final String ipv4SubnetCidrAtCreation;

    /**
     * Any one of the IPv4 CIDRs allocated to the subnet.
     *
     * @return the value
     **/
    public String getIpv4SubnetCidrAtCreation() {
        return ipv4SubnetCidrAtCreation;
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
        sb.append("BulkCreatePrivateIpItem(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", lifetime=").append(String.valueOf(this.lifetime));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", cidrPrefixLength=").append(String.valueOf(this.cidrPrefixLength));
        sb.append(", ipv4SubnetCidrAtCreation=")
                .append(String.valueOf(this.ipv4SubnetCidrAtCreation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkCreatePrivateIpItem)) {
            return false;
        }

        BulkCreatePrivateIpItem other = (BulkCreatePrivateIpItem) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.lifetime, other.lifetime)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.cidrPrefixLength, other.cidrPrefixLength)
                && java.util.Objects.equals(
                        this.ipv4SubnetCidrAtCreation, other.ipv4SubnetCidrAtCreation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.lifetime == null ? 43 : this.lifetime.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.cidrPrefixLength == null ? 43 : this.cidrPrefixLength.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv4SubnetCidrAtCreation == null
                                ? 43
                                : this.ipv4SubnetCidrAtCreation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
