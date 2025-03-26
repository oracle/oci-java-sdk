/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
    builder = CreatePrivateIpDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreatePrivateIpDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "hostnameLabel",
        "ipAddress",
        "vnicId",
        "vlanId",
        "subnetId",
        "lifetime",
        "routeTableId"
    })
    public CreatePrivateIpDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String hostnameLabel,
            String ipAddress,
            String vnicId,
            String vlanId,
            String subnetId,
            Lifetime lifetime,
            String routeTableId) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.hostnameLabel = hostnameLabel;
        this.ipAddress = ipAddress;
        this.vnicId = vnicId;
        this.vlanId = vlanId;
        this.subnetId = subnetId;
        this.lifetime = lifetime;
        this.routeTableId = routeTableId;
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the private IP to. The VNIC and private IP
         * must be in the same subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the private IP to. The VNIC and private IP
         * must be in the same subnet.
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
         * Use this attribute only with the Oracle Cloud VMware Solution.
         * <p>
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IP is to be drawn. The IP address,
         * *if supplied*, must be valid for the given VLAN. See {@link Vlan}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * Use this attribute only with the Oracle Cloud VMware Solution.
         * <p>
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IP is to be drawn. The IP address,
         * *if supplied*, must be valid for the given VLAN. See {@link Vlan}.
         *
         * @param vlanId the value to set
         * @return this builder
         **/
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IP is to be drawn. The IP address,
         * *if supplied*, must be valid for the given subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IP is to be drawn. The IP address,
         * *if supplied*, must be valid for the given subnet.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * Lifetime of the IP address.
         * There are two types of IPv6 IPs:
         *  - Ephemeral
         *  - Reserved
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
        private Lifetime lifetime;

        /**
         * Lifetime of the IP address.
         * There are two types of IPv6 IPs:
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
         * [Source Based Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
         * [Source Based Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
         *
         * @param routeTableId the value to set
         * @return this builder
         **/
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePrivateIpDetails build() {
            CreatePrivateIpDetails model =
                    new CreatePrivateIpDetails(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.hostnameLabel,
                            this.ipAddress,
                            this.vnicId,
                            this.vlanId,
                            this.subnetId,
                            this.lifetime,
                            this.routeTableId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePrivateIpDetails model) {
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
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("lifetime")) {
                this.lifetime(model.getLifetime());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the private IP to. The VNIC and private IP
     * must be in the same subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the private IP to. The VNIC and private IP
     * must be in the same subnet.
     *
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    /**
     * Use this attribute only with the Oracle Cloud VMware Solution.
     * <p>
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IP is to be drawn. The IP address,
     * *if supplied*, must be valid for the given VLAN. See {@link Vlan}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * Use this attribute only with the Oracle Cloud VMware Solution.
     * <p>
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IP is to be drawn. The IP address,
     * *if supplied*, must be valid for the given VLAN. See {@link Vlan}.
     *
     * @return the value
     **/
    public String getVlanId() {
        return vlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IP is to be drawn. The IP address,
     * *if supplied*, must be valid for the given subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IP is to be drawn. The IP address,
     * *if supplied*, must be valid for the given subnet.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Lifetime of the IP address.
     * There are two types of IPv6 IPs:
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
     * There are two types of IPv6 IPs:
     *  - Ephemeral
     *  - Reserved
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
    private final Lifetime lifetime;

    /**
     * Lifetime of the IP address.
     * There are two types of IPv6 IPs:
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
     * [Source Based Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the IP address or VNIC will use. For more information, see
     * [Source Based Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
     *
     * @return the value
     **/
    public String getRouteTableId() {
        return routeTableId;
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
        sb.append("CreatePrivateIpDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", lifetime=").append(String.valueOf(this.lifetime));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePrivateIpDetails)) {
            return false;
        }

        CreatePrivateIpDetails other = (CreatePrivateIpDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.lifetime, other.lifetime)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
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
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.lifetime == null ? 43 : this.lifetime.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
