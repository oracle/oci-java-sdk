/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A *private IP* is a conceptual term that refers to an IPv4 private IP address and related
 * properties. The {@code privateIp} object is the API representation of a private IP.
 *
 * <p>*Note:** For information about IPv6 addresses, see {@link Ipv6}.
 *
 * <p>Each instance has a *primary private IP* that is automatically created and assigned to the
 * primary VNIC during instance launch. If you add a secondary VNIC to the instance, it also
 * automatically gets a primary private IP. You can't remove a primary private IP from its VNIC. The
 * primary private IP is automatically deleted when the VNIC is terminated.
 *
 * <p>You can add *secondary private IPs* to a VNIC after it's created. For more information, see
 * the {@code privateIp} operations and also [IP
 * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingIPaddresses.htm).
 *
 * <p>*Note:** Only {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
 * #getPrivateIp(GetPrivateIpRequest) getPrivateIp} work with *primary* private IPs. To create and
 * update primary private IPs, you instead work with instance and VNIC operations. For example, a
 * primary private IP's properties come from the values you specify in {@link CreateVnicDetails}
 * when calling either {@link #launchInstance(LaunchInstanceRequest) launchInstance} or {@link
 * #attachVnic(AttachVnicRequest) attachVnic}. To update the hostname for a primary private IP, you
 * use {@link #updateVnic(UpdateVnicRequest) updateVnic}.
 *
 * <p>{@code PrivateIp} objects that are created for use with the Oracle Cloud VMware Solution are
 * assigned to a VLAN and not a VNIC in a subnet. See the descriptions of the relevant attributes in
 * the {@code PrivateIp} object. Also see {@link Vlan}.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm). <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PrivateIp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivateIp extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "hostnameLabel",
        "id",
        "ipAddress",
        "isPrimary",
        "vlanId",
        "subnetId",
        "timeCreated",
        "vnicId",
        "ipState",
        "lifetime",
        "routeTableId"
    })
    public PrivateIp(
            String availabilityDomain,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String hostnameLabel,
            String id,
            String ipAddress,
            Boolean isPrimary,
            String vlanId,
            String subnetId,
            java.util.Date timeCreated,
            String vnicId,
            IpState ipState,
            Lifetime lifetime,
            String routeTableId) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.hostnameLabel = hostnameLabel;
        this.id = id;
        this.ipAddress = ipAddress;
        this.isPrimary = isPrimary;
        this.vlanId = vlanId;
        this.subnetId = subnetId;
        this.timeCreated = timeCreated;
        this.vnicId = vnicId;
        this.ipState = ipState;
        this.lifetime = lifetime;
        this.routeTableId = routeTableId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The private IP's availability domain. This attribute will be null if this is a
         * *secondary* private IP assigned to a VNIC that is in a *regional* subnet.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The private IP's availability domain. This attribute will be null if this is a
         * *secondary* private IP assigned to a VNIC that is in a *regional* subnet.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the private IP.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the private IP.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The hostname for the private IP. Used for DNS. The value is the hostname portion of the
         * private IP's fully qualified domain name (FQDN) (for example, {@code bminstance1} in FQDN
         * {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across all VNICs in the
         * subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123).
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code bminstance1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * The hostname for the private IP. Used for DNS. The value is the hostname portion of the
         * private IP's fully qualified domain name (FQDN) (for example, {@code bminstance1} in FQDN
         * {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across all VNICs in the
         * subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123).
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code bminstance1}
         *
         * @param hostnameLabel the value to set
         * @return this builder
         */
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }
        /**
         * The private IP's Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The private IP's Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The private IP address of the {@code privateIp} object. The address is within the CIDR of
         * the VNIC's subnet.
         *
         * <p>However, if the {@code PrivateIp} object is being used with a VLAN as part of the
         * Oracle Cloud VMware Solution, the address is from the range specified by the {@code
         * cidrBlock} attribute for the VLAN. See {@link Vlan}.
         *
         * <p>Example: {@code 10.0.3.3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The private IP address of the {@code privateIp} object. The address is within the CIDR of
         * the VNIC's subnet.
         *
         * <p>However, if the {@code PrivateIp} object is being used with a VLAN as part of the
         * Oracle Cloud VMware Solution, the address is from the range specified by the {@code
         * cidrBlock} attribute for the VLAN. See {@link Vlan}.
         *
         * <p>Example: {@code 10.0.3.3}
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * Whether this private IP is the primary one on the VNIC. Primary private IPs are
         * unassigned and deleted automatically when the VNIC is terminated.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        /**
         * Whether this private IP is the primary one on the VNIC. Primary private IPs are
         * unassigned and deleted automatically when the VNIC is terminated.
         *
         * <p>Example: {@code true}
         *
         * @param isPrimary the value to set
         * @return this builder
         */
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            this.__explicitlySet__.add("isPrimary");
            return this;
        }
        /**
         * Applicable only if the {@code PrivateIp} object is being used with a VLAN as part of the
         * Oracle Cloud VMware Solution. The {@code vlanId} is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN. See {@link Vlan}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * Applicable only if the {@code PrivateIp} object is being used with a VLAN as part of the
         * Oracle Cloud VMware Solution. The {@code vlanId} is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN. See {@link Vlan}.
         *
         * @param vlanId the value to set
         * @return this builder
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the VNIC is in.
         *
         * <p>However, if the {@code PrivateIp} object is being used with a VLAN as part of the
         * Oracle Cloud VMware Solution, the {@code subnetId} is null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the VNIC is in.
         *
         * <p>However, if the {@code PrivateIp} object is being used with a VLAN as part of the
         * Oracle Cloud VMware Solution, the {@code subnetId} is null.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The date and time the private IP was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the private IP was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VNIC the private IP is assigned to. The VNIC and private IP must be in the same subnet.
         * However, if the {@code PrivateIp} object is being used with a VLAN as part of the Oracle
         * Cloud VMware Solution, the {@code vnicId} is null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VNIC the private IP is assigned to. The VNIC and private IP must be in the same subnet.
         * However, if the {@code PrivateIp} object is being used with a VLAN as part of the Oracle
         * Cloud VMware Solution, the {@code vnicId} is null.
         *
         * @param vnicId the value to set
         * @return this builder
         */
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }
        /**
         * State of the IP address. If an IP address is assigned to a VNIC it is ASSIGNED, otherwise
         * it is AVAILABLE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipState")
        private IpState ipState;

        /**
         * State of the IP address. If an IP address is assigned to a VNIC it is ASSIGNED, otherwise
         * it is AVAILABLE.
         *
         * @param ipState the value to set
         * @return this builder
         */
        public Builder ipState(IpState ipState) {
            this.ipState = ipState;
            this.__explicitlySet__.add("ipState");
            return this;
        }
        /** Lifetime of the IP address. There are two types of IPv6 IPs: - Ephemeral - Reserved */
        @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
        private Lifetime lifetime;

        /**
         * Lifetime of the IP address. There are two types of IPv6 IPs: - Ephemeral - Reserved
         *
         * @param lifetime the value to set
         * @return this builder
         */
        public Builder lifetime(Lifetime lifetime) {
            this.lifetime = lifetime;
            this.__explicitlySet__.add("lifetime");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the IP address or VNIC will use. For more information, see [Source Based
         * Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the IP address or VNIC will use. For more information, see [Source Based
         * Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
         *
         * @param routeTableId the value to set
         * @return this builder
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivateIp build() {
            PrivateIp model =
                    new PrivateIp(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.hostnameLabel,
                            this.id,
                            this.ipAddress,
                            this.isPrimary,
                            this.vlanId,
                            this.subnetId,
                            this.timeCreated,
                            this.vnicId,
                            this.ipState,
                            this.lifetime,
                            this.routeTableId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateIp model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
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
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("isPrimary")) {
                this.isPrimary(model.getIsPrimary());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("ipState")) {
                this.ipState(model.getIpState());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The private IP's availability domain. This attribute will be null if this is a *secondary*
     * private IP assigned to a VNIC that is in a *regional* subnet.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The private IP's availability domain. This attribute will be null if this is a *secondary*
     * private IP assigned to a VNIC that is in a *regional* subnet.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the private IP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the private IP.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The hostname for the private IP. Used for DNS. The value is the hostname portion of the
     * private IP's fully qualified domain name (FQDN) (for example, {@code bminstance1} in FQDN
     * {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across all VNICs in the
     * subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and [RFC
     * 1123](https://tools.ietf.org/html/rfc1123).
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code bminstance1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * The hostname for the private IP. Used for DNS. The value is the hostname portion of the
     * private IP's fully qualified domain name (FQDN) (for example, {@code bminstance1} in FQDN
     * {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across all VNICs in the
     * subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and [RFC
     * 1123](https://tools.ietf.org/html/rfc1123).
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code bminstance1}
     *
     * @return the value
     */
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * The private IP's Oracle ID
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The private IP's Oracle ID
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The private IP address of the {@code privateIp} object. The address is within the CIDR of the
     * VNIC's subnet.
     *
     * <p>However, if the {@code PrivateIp} object is being used with a VLAN as part of the Oracle
     * Cloud VMware Solution, the address is from the range specified by the {@code cidrBlock}
     * attribute for the VLAN. See {@link Vlan}.
     *
     * <p>Example: {@code 10.0.3.3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The private IP address of the {@code privateIp} object. The address is within the CIDR of the
     * VNIC's subnet.
     *
     * <p>However, if the {@code PrivateIp} object is being used with a VLAN as part of the Oracle
     * Cloud VMware Solution, the address is from the range specified by the {@code cidrBlock}
     * attribute for the VLAN. See {@link Vlan}.
     *
     * <p>Example: {@code 10.0.3.3}
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Whether this private IP is the primary one on the VNIC. Primary private IPs are unassigned
     * and deleted automatically when the VNIC is terminated.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    private final Boolean isPrimary;

    /**
     * Whether this private IP is the primary one on the VNIC. Primary private IPs are unassigned
     * and deleted automatically when the VNIC is terminated.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * Applicable only if the {@code PrivateIp} object is being used with a VLAN as part of the
     * Oracle Cloud VMware Solution. The {@code vlanId} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN.
     * See {@link Vlan}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * Applicable only if the {@code PrivateIp} object is being used with a VLAN as part of the
     * Oracle Cloud VMware Solution. The {@code vlanId} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN.
     * See {@link Vlan}.
     *
     * @return the value
     */
    public String getVlanId() {
        return vlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the VNIC is in.
     *
     * <p>However, if the {@code PrivateIp} object is being used with a VLAN as part of the Oracle
     * Cloud VMware Solution, the {@code subnetId} is null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the VNIC is in.
     *
     * <p>However, if the {@code PrivateIp} object is being used with a VLAN as part of the Oracle
     * Cloud VMware Solution, the {@code subnetId} is null.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The date and time the private IP was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the private IP was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC
     * the private IP is assigned to. The VNIC and private IP must be in the same subnet. However,
     * if the {@code PrivateIp} object is being used with a VLAN as part of the Oracle Cloud VMware
     * Solution, the {@code vnicId} is null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC
     * the private IP is assigned to. The VNIC and private IP must be in the same subnet. However,
     * if the {@code PrivateIp} object is being used with a VLAN as part of the Oracle Cloud VMware
     * Solution, the {@code vnicId} is null.
     *
     * @return the value
     */
    public String getVnicId() {
        return vnicId;
    }

    /**
     * State of the IP address. If an IP address is assigned to a VNIC it is ASSIGNED, otherwise it
     * is AVAILABLE.
     */
    public enum IpState implements com.oracle.bmc.http.internal.BmcEnum {
        Assigned("ASSIGNED"),
        Available("AVAILABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IpState.class);

        private final String value;
        private static java.util.Map<String, IpState> map;

        static {
            map = new java.util.HashMap<>();
            for (IpState v : IpState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IpState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IpState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IpState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * State of the IP address. If an IP address is assigned to a VNIC it is ASSIGNED, otherwise it
     * is AVAILABLE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipState")
    private final IpState ipState;

    /**
     * State of the IP address. If an IP address is assigned to a VNIC it is ASSIGNED, otherwise it
     * is AVAILABLE.
     *
     * @return the value
     */
    public IpState getIpState() {
        return ipState;
    }

    /** Lifetime of the IP address. There are two types of IPv6 IPs: - Ephemeral - Reserved */
    public enum Lifetime implements com.oracle.bmc.http.internal.BmcEnum {
        Ephemeral("EPHEMERAL"),
        Reserved("RESERVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Lifetime.class);

        private final String value;
        private static java.util.Map<String, Lifetime> map;

        static {
            map = new java.util.HashMap<>();
            for (Lifetime v : Lifetime.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Lifetime', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Lifetime of the IP address. There are two types of IPv6 IPs: - Ephemeral - Reserved */
    @com.fasterxml.jackson.annotation.JsonProperty("lifetime")
    private final Lifetime lifetime;

    /**
     * Lifetime of the IP address. There are two types of IPv6 IPs: - Ephemeral - Reserved
     *
     * @return the value
     */
    public Lifetime getLifetime() {
        return lifetime;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the IP address or VNIC will use. For more information, see [Source Based
     * Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the IP address or VNIC will use. For more information, see [Source Based
     * Routing](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#Overview_of_Routing_for_Your_VCN__source_routing).
     *
     * @return the value
     */
    public String getRouteTableId() {
        return routeTableId;
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
        sb.append("PrivateIp(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", isPrimary=").append(String.valueOf(this.isPrimary));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", ipState=").append(String.valueOf(this.ipState));
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
        if (!(o instanceof PrivateIp)) {
            return false;
        }

        PrivateIp other = (PrivateIp) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.isPrimary, other.isPrimary)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.ipState, other.ipState)
                && java.util.Objects.equals(this.lifetime, other.lifetime)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.isPrimary == null ? 43 : this.isPrimary.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + (this.ipState == null ? 43 : this.ipState.hashCode());
        result = (result * PRIME) + (this.lifetime == null ? 43 : this.lifetime.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
