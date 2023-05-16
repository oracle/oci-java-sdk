/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A virtual network interface card. Each VNIC resides in a subnet in a VCN. An instance attaches to
 * a VNIC to obtain a network connection into the VCN through that subnet. Each instance has a
 * *primary VNIC* that is automatically created and attached during launch. You can add *secondary
 * VNICs* to an instance after it's launched. For more information, see [Virtual Network Interface
 * Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
 *
 * <p>Each VNIC has a *primary private IP* that is automatically assigned during launch. You can add
 * *secondary private IPs* to a VNIC after it's created. For more information, see {@link
 * #createPrivateIp(CreatePrivateIpRequest) createPrivateIp} and [IP
 * Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingIPaddresses.htm).
 *
 * <p>If you are an Oracle Cloud VMware Solution customer, you will have secondary VNICs that reside
 * in a VLAN instead of a subnet. These VNICs have other differences, which are called out in the
 * descriptions of the relevant attributes in the {@code Vnic} object. Also see {@link Vlan}.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Vnic.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Vnic extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "hostnameLabel",
        "id",
        "isPrimary",
        "lifecycleState",
        "macAddress",
        "nsgIds",
        "vlanId",
        "privateIp",
        "publicIp",
        "skipSourceDestCheck",
        "subnetId",
        "timeCreated"
    })
    public Vnic(
            String availabilityDomain,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String hostnameLabel,
            String id,
            Boolean isPrimary,
            LifecycleState lifecycleState,
            String macAddress,
            java.util.List<String> nsgIds,
            String vlanId,
            String privateIp,
            String publicIp,
            Boolean skipSourceDestCheck,
            String subnetId,
            java.util.Date timeCreated) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.hostnameLabel = hostnameLabel;
        this.id = id;
        this.isPrimary = isPrimary;
        this.lifecycleState = lifecycleState;
        this.macAddress = macAddress;
        this.nsgIds = nsgIds;
        this.vlanId = vlanId;
        this.privateIp = privateIp;
        this.publicIp = publicIp;
        this.skipSourceDestCheck = skipSourceDestCheck;
        this.subnetId = subnetId;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The VNIC's availability domain.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The VNIC's availability domain.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the VNIC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the VNIC.
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
         * portion of the primary private IP's fully qualified domain name (FQDN) (for example,
         * {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be
         * unique across all VNICs in the subnet and comply with [RFC
         * 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123).
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code bminstance1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
         * portion of the primary private IP's fully qualified domain name (FQDN) (for example,
         * {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be
         * unique across all VNICs in the subnet and comply with [RFC
         * 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123).
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VNIC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VNIC.
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
         * Whether the VNIC is the primary VNIC (the VNIC that is automatically created and attached
         * during instance launch).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        /**
         * Whether the VNIC is the primary VNIC (the VNIC that is automatically created and attached
         * during instance launch).
         *
         * @param isPrimary the value to set
         * @return this builder
         */
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            this.__explicitlySet__.add("isPrimary");
            return this;
        }
        /** The current state of the VNIC. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the VNIC.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The MAC address of the VNIC.
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution, the MAC
         * address is learned. If the VNIC belongs to a subnet, the MAC address is a static,
         * Oracle-provided value.
         *
         * <p>Example: {@code 00:00:00:00:00:01}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
        private String macAddress;

        /**
         * The MAC address of the VNIC.
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution, the MAC
         * address is learned. If the VNIC belongs to a subnet, the MAC address is a static,
         * Oracle-provided value.
         *
         * <p>Example: {@code 00:00:00:00:00:01}
         *
         * @param macAddress the value to set
         * @return this builder
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            this.__explicitlySet__.add("macAddress");
            return this;
        }
        /**
         * A list of the OCIDs of the network security groups that the VNIC belongs to.
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the value of the {@code nsgIds} attribute is ignored. Instead,
         * the VNIC belongs to the NSGs that are associated with the VLAN itself. See {@link Vlan}.
         *
         * <p>For more information about NSGs, see {@link NetworkSecurityGroup}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups that the VNIC belongs to.
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the value of the {@code nsgIds} attribute is ignored. Instead,
         * the VNIC belongs to the NSGs that are associated with the VLAN itself. See {@link Vlan}.
         *
         * <p>For more information about NSGs, see {@link NetworkSecurityGroup}.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the {@code vlanId} is the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the VLAN the VNIC is in. See {@link Vlan}. If the VNIC is instead in a subnet, {@code
         * subnetId} has a value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the {@code vlanId} is the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the VLAN the VNIC is in. See {@link Vlan}. If the VNIC is instead in a subnet, {@code
         * subnetId} has a value.
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
         * The private IP address of the primary {@code privateIp} object on the VNIC. The address
         * is within the CIDR of the VNIC's subnet.
         *
         * <p>Example: {@code 10.0.3.3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * The private IP address of the primary {@code privateIp} object on the VNIC. The address
         * is within the CIDR of the VNIC's subnet.
         *
         * <p>Example: {@code 10.0.3.3}
         *
         * @param privateIp the value to set
         * @return this builder
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }
        /** The public IP address of the VNIC, if one is assigned. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
        private String publicIp;

        /**
         * The public IP address of the VNIC, if one is assigned.
         *
         * @param publicIp the value to set
         * @return this builder
         */
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            this.__explicitlySet__.add("publicIp");
            return this;
        }
        /**
         * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
         * which means the check is performed. For information about why you would skip the
         * source/destination check, see [Using a Private IP as a Route
         * Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the {@code skipSourceDestCheck} attribute is {@code true}. This
         * is because the source/destination check is always disabled for VNICs in a VLAN.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
        private Boolean skipSourceDestCheck;

        /**
         * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
         * which means the check is performed. For information about why you would skip the
         * source/destination check, see [Using a Private IP as a Route
         * Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the {@code skipSourceDestCheck} attribute is {@code true}. This
         * is because the source/destination check is always disabled for VNICs in a VLAN.
         *
         * <p>Example: {@code true}
         *
         * @param skipSourceDestCheck the value to set
         * @return this builder
         */
        public Builder skipSourceDestCheck(Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = skipSourceDestCheck;
            this.__explicitlySet__.add("skipSourceDestCheck");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the subnet the VNIC is in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the subnet the VNIC is in.
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
         * The date and time the VNIC was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the VNIC was created, in the format defined by
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Vnic build() {
            Vnic model =
                    new Vnic(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.hostnameLabel,
                            this.id,
                            this.isPrimary,
                            this.lifecycleState,
                            this.macAddress,
                            this.nsgIds,
                            this.vlanId,
                            this.privateIp,
                            this.publicIp,
                            this.skipSourceDestCheck,
                            this.subnetId,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Vnic model) {
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
            if (model.wasPropertyExplicitlySet("isPrimary")) {
                this.isPrimary(model.getIsPrimary());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("macAddress")) {
                this.macAddress(model.getMacAddress());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("publicIp")) {
                this.publicIp(model.getPublicIp());
            }
            if (model.wasPropertyExplicitlySet("skipSourceDestCheck")) {
                this.skipSourceDestCheck(model.getSkipSourceDestCheck());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The VNIC's availability domain.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The VNIC's availability domain.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the VNIC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the VNIC.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
     * portion of the primary private IP's fully qualified domain name (FQDN) (for example, {@code
     * bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across
     * all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123).
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code bminstance1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
     * portion of the primary private IP's fully qualified domain name (FQDN) (for example, {@code
     * bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across
     * all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123).
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code bminstance1}
     *
     * @return the value
     */
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VNIC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VNIC.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Whether the VNIC is the primary VNIC (the VNIC that is automatically created and attached
     * during instance launch).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    private final Boolean isPrimary;

    /**
     * Whether the VNIC is the primary VNIC (the VNIC that is automatically created and attached
     * during instance launch).
     *
     * @return the value
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /** The current state of the VNIC. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the VNIC. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the VNIC.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The MAC address of the VNIC.
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution, the MAC address
     * is learned. If the VNIC belongs to a subnet, the MAC address is a static, Oracle-provided
     * value.
     *
     * <p>Example: {@code 00:00:00:00:00:01}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
    private final String macAddress;

    /**
     * The MAC address of the VNIC.
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution, the MAC address
     * is learned. If the VNIC belongs to a subnet, the MAC address is a static, Oracle-provided
     * value.
     *
     * <p>Example: {@code 00:00:00:00:00:01}
     *
     * @return the value
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * A list of the OCIDs of the network security groups that the VNIC belongs to.
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the value of the {@code nsgIds} attribute is ignored. Instead, the
     * VNIC belongs to the NSGs that are associated with the VLAN itself. See {@link Vlan}.
     *
     * <p>For more information about NSGs, see {@link NetworkSecurityGroup}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups that the VNIC belongs to.
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the value of the {@code nsgIds} attribute is ignored. Instead, the
     * VNIC belongs to the NSGs that are associated with the VLAN itself. See {@link Vlan}.
     *
     * <p>For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the {@code vlanId} is the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VLAN the VNIC is in. See {@link Vlan}. If the VNIC is instead in a subnet, {@code subnetId}
     * has a value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the {@code vlanId} is the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VLAN the VNIC is in. See {@link Vlan}. If the VNIC is instead in a subnet, {@code subnetId}
     * has a value.
     *
     * @return the value
     */
    public String getVlanId() {
        return vlanId;
    }

    /**
     * The private IP address of the primary {@code privateIp} object on the VNIC. The address is
     * within the CIDR of the VNIC's subnet.
     *
     * <p>Example: {@code 10.0.3.3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * The private IP address of the primary {@code privateIp} object on the VNIC. The address is
     * within the CIDR of the VNIC's subnet.
     *
     * <p>Example: {@code 10.0.3.3}
     *
     * @return the value
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /** The public IP address of the VNIC, if one is assigned. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
    private final String publicIp;

    /**
     * The public IP address of the VNIC, if one is assigned.
     *
     * @return the value
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
     * which means the check is performed. For information about why you would skip the
     * source/destination check, see [Using a Private IP as a Route
     * Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the {@code skipSourceDestCheck} attribute is {@code true}. This is
     * because the source/destination check is always disabled for VNICs in a VLAN.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
    private final Boolean skipSourceDestCheck;

    /**
     * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
     * which means the check is performed. For information about why you would skip the
     * source/destination check, see [Using a Private IP as a Route
     * Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the {@code skipSourceDestCheck} attribute is {@code true}. This is
     * because the source/destination check is always disabled for VNICs in a VLAN.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getSkipSourceDestCheck() {
        return skipSourceDestCheck;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the subnet the VNIC is in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the subnet the VNIC is in.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The date and time the VNIC was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the VNIC was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("Vnic(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", isPrimary=").append(String.valueOf(this.isPrimary));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", macAddress=").append(String.valueOf(this.macAddress));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", publicIp=").append(String.valueOf(this.publicIp));
        sb.append(", skipSourceDestCheck=").append(String.valueOf(this.skipSourceDestCheck));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vnic)) {
            return false;
        }

        Vnic other = (Vnic) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isPrimary, other.isPrimary)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.macAddress, other.macAddress)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.publicIp, other.publicIp)
                && java.util.Objects.equals(this.skipSourceDestCheck, other.skipSourceDestCheck)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
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
        result = (result * PRIME) + (this.isPrimary == null ? 43 : this.isPrimary.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.macAddress == null ? 43 : this.macAddress.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result = (result * PRIME) + (this.publicIp == null ? 43 : this.publicIp.hashCode());
        result =
                (result * PRIME)
                        + (this.skipSourceDestCheck == null
                                ? 43
                                : this.skipSourceDestCheck.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
