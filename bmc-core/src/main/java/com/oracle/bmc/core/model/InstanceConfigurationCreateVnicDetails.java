/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Contains the properties of the VNIC for an instance configuration. See {@link CreateVnicDetails}
 * and [Instance
 * Configurations](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/instancemanagement.htm#config)
 * for more information. <br>
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
        builder = InstanceConfigurationCreateVnicDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceConfigurationCreateVnicDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assignIpv6Ip",
        "assignPublicIp",
        "assignPrivateDnsRecord",
        "definedTags",
        "displayName",
        "freeformTags",
        "securityAttributes",
        "ipv6AddressIpv6SubnetCidrPairDetails",
        "hostnameLabel",
        "nsgIds",
        "privateIp",
        "skipSourceDestCheck",
        "subnetId"
    })
    public InstanceConfigurationCreateVnicDetails(
            Boolean assignIpv6Ip,
            Boolean assignPublicIp,
            Boolean assignPrivateDnsRecord,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            java.util.List<InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails>
                    ipv6AddressIpv6SubnetCidrPairDetails,
            String hostnameLabel,
            java.util.List<String> nsgIds,
            String privateIp,
            Boolean skipSourceDestCheck,
            String subnetId) {
        super();
        this.assignIpv6Ip = assignIpv6Ip;
        this.assignPublicIp = assignPublicIp;
        this.assignPrivateDnsRecord = assignPrivateDnsRecord;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.securityAttributes = securityAttributes;
        this.ipv6AddressIpv6SubnetCidrPairDetails = ipv6AddressIpv6SubnetCidrPairDetails;
        this.hostnameLabel = hostnameLabel;
        this.nsgIds = nsgIds;
        this.privateIp = privateIp;
        this.skipSourceDestCheck = skipSourceDestCheck;
        this.subnetId = subnetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
         * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
         * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code
         * ipv6SubnetCidr} is not provided then an IPv6 prefix is chosen for you.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assignIpv6Ip")
        private Boolean assignIpv6Ip;

        /**
         * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
         * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
         * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code
         * ipv6SubnetCidr} is not provided then an IPv6 prefix is chosen for you.
         *
         * @param assignIpv6Ip the value to set
         * @return this builder
         */
        public Builder assignIpv6Ip(Boolean assignIpv6Ip) {
            this.assignIpv6Ip = assignIpv6Ip;
            this.__explicitlySet__.add("assignIpv6Ip");
            return this;
        }
        /**
         * Whether the VNIC should be assigned a public IP address. See the {@code assignPublicIp}
         * attribute of {@link CreateVnicDetails} for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
        private Boolean assignPublicIp;

        /**
         * Whether the VNIC should be assigned a public IP address. See the {@code assignPublicIp}
         * attribute of {@link CreateVnicDetails} for more information.
         *
         * @param assignPublicIp the value to set
         * @return this builder
         */
        public Builder assignPublicIp(Boolean assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            this.__explicitlySet__.add("assignPublicIp");
            return this;
        }
        /**
         * Whether the VNIC should be assigned a private DNS record. See the {@code
         * assignPrivateDnsRecord} attribute of {@link CreateVnicDetails} for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assignPrivateDnsRecord")
        private Boolean assignPrivateDnsRecord;

        /**
         * Whether the VNIC should be assigned a private DNS record. See the {@code
         * assignPrivateDnsRecord} attribute of {@link CreateVnicDetails} for more information.
         *
         * @param assignPrivateDnsRecord the value to set
         * @return this builder
         */
        public Builder assignPrivateDnsRecord(Boolean assignPrivateDnsRecord) {
            this.assignPrivateDnsRecord = assignPrivateDnsRecord;
            this.__explicitlySet__.add("assignPrivateDnsRecord");
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
         * Security Attributes for this resource. This is unique to ZPR, and helps identify which
         * resources are allowed to be accessed by what permission controls.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security Attributes for this resource. This is unique to ZPR, and helps identify which
         * resources are allowed to be accessed by what permission controls.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }
        /**
         * A list of IPv6 prefixes from which the VNIC should be assigned an IPv6 address. You can
         * provide only the prefix and OCI selects an available address from the range. You can
         * optionally choose to leave the prefix range empty and instead provide the specific IPv6
         * address that should be used from within that range.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6AddressIpv6SubnetCidrPairDetails")
        private java.util.List<InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails>
                ipv6AddressIpv6SubnetCidrPairDetails;

        /**
         * A list of IPv6 prefixes from which the VNIC should be assigned an IPv6 address. You can
         * provide only the prefix and OCI selects an available address from the range. You can
         * optionally choose to leave the prefix range empty and instead provide the specific IPv6
         * address that should be used from within that range.
         *
         * @param ipv6AddressIpv6SubnetCidrPairDetails the value to set
         * @return this builder
         */
        public Builder ipv6AddressIpv6SubnetCidrPairDetails(
                java.util.List<InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails>
                        ipv6AddressIpv6SubnetCidrPairDetails) {
            this.ipv6AddressIpv6SubnetCidrPairDetails = ipv6AddressIpv6SubnetCidrPairDetails;
            this.__explicitlySet__.add("ipv6AddressIpv6SubnetCidrPairDetails");
            return this;
        }
        /**
         * The hostname for the VNIC's primary private IP. See the {@code hostnameLabel} attribute
         * of {@link CreateVnicDetails} for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * The hostname for the VNIC's primary private IP. See the {@code hostnameLabel} attribute
         * of {@link CreateVnicDetails} for more information.
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
         * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more
         * information about NSGs, see {@link NetworkSecurityGroup}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more
         * information about NSGs, see {@link NetworkSecurityGroup}.
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
         * A private IP address of your choice to assign to the VNIC. See the {@code privateIp}
         * attribute of {@link CreateVnicDetails} for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * A private IP address of your choice to assign to the VNIC. See the {@code privateIp}
         * attribute of {@link CreateVnicDetails} for more information.
         *
         * @param privateIp the value to set
         * @return this builder
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }
        /**
         * Whether the source/destination check is disabled on the VNIC. See the {@code
         * skipSourceDestCheck} attribute of {@link CreateVnicDetails} for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
        private Boolean skipSourceDestCheck;

        /**
         * Whether the source/destination check is disabled on the VNIC. See the {@code
         * skipSourceDestCheck} attribute of {@link CreateVnicDetails} for more information.
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
         * The OCID of the subnet to create the VNIC in. See the {@code subnetId} attribute of
         * {@link CreateVnicDetails} for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet to create the VNIC in. See the {@code subnetId} attribute of
         * {@link CreateVnicDetails} for more information.
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

        public InstanceConfigurationCreateVnicDetails build() {
            InstanceConfigurationCreateVnicDetails model =
                    new InstanceConfigurationCreateVnicDetails(
                            this.assignIpv6Ip,
                            this.assignPublicIp,
                            this.assignPrivateDnsRecord,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.securityAttributes,
                            this.ipv6AddressIpv6SubnetCidrPairDetails,
                            this.hostnameLabel,
                            this.nsgIds,
                            this.privateIp,
                            this.skipSourceDestCheck,
                            this.subnetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationCreateVnicDetails model) {
            if (model.wasPropertyExplicitlySet("assignIpv6Ip")) {
                this.assignIpv6Ip(model.getAssignIpv6Ip());
            }
            if (model.wasPropertyExplicitlySet("assignPublicIp")) {
                this.assignPublicIp(model.getAssignPublicIp());
            }
            if (model.wasPropertyExplicitlySet("assignPrivateDnsRecord")) {
                this.assignPrivateDnsRecord(model.getAssignPrivateDnsRecord());
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
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("ipv6AddressIpv6SubnetCidrPairDetails")) {
                this.ipv6AddressIpv6SubnetCidrPairDetails(
                        model.getIpv6AddressIpv6SubnetCidrPairDetails());
            }
            if (model.wasPropertyExplicitlySet("hostnameLabel")) {
                this.hostnameLabel(model.getHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("skipSourceDestCheck")) {
                this.skipSourceDestCheck(model.getSkipSourceDestCheck());
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
     * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
     * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
     * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code ipv6SubnetCidr} is
     * not provided then an IPv6 prefix is chosen for you.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignIpv6Ip")
    private final Boolean assignIpv6Ip;

    /**
     * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
     * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
     * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code ipv6SubnetCidr} is
     * not provided then an IPv6 prefix is chosen for you.
     *
     * @return the value
     */
    public Boolean getAssignIpv6Ip() {
        return assignIpv6Ip;
    }

    /**
     * Whether the VNIC should be assigned a public IP address. See the {@code assignPublicIp}
     * attribute of {@link CreateVnicDetails} for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
    private final Boolean assignPublicIp;

    /**
     * Whether the VNIC should be assigned a public IP address. See the {@code assignPublicIp}
     * attribute of {@link CreateVnicDetails} for more information.
     *
     * @return the value
     */
    public Boolean getAssignPublicIp() {
        return assignPublicIp;
    }

    /**
     * Whether the VNIC should be assigned a private DNS record. See the {@code
     * assignPrivateDnsRecord} attribute of {@link CreateVnicDetails} for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignPrivateDnsRecord")
    private final Boolean assignPrivateDnsRecord;

    /**
     * Whether the VNIC should be assigned a private DNS record. See the {@code
     * assignPrivateDnsRecord} attribute of {@link CreateVnicDetails} for more information.
     *
     * @return the value
     */
    public Boolean getAssignPrivateDnsRecord() {
        return assignPrivateDnsRecord;
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
     * Security Attributes for this resource. This is unique to ZPR, and helps identify which
     * resources are allowed to be accessed by what permission controls.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security Attributes for this resource. This is unique to ZPR, and helps identify which
     * resources are allowed to be accessed by what permission controls.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    /**
     * A list of IPv6 prefixes from which the VNIC should be assigned an IPv6 address. You can
     * provide only the prefix and OCI selects an available address from the range. You can
     * optionally choose to leave the prefix range empty and instead provide the specific IPv6
     * address that should be used from within that range.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6AddressIpv6SubnetCidrPairDetails")
    private final java.util.List<InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails>
            ipv6AddressIpv6SubnetCidrPairDetails;

    /**
     * A list of IPv6 prefixes from which the VNIC should be assigned an IPv6 address. You can
     * provide only the prefix and OCI selects an available address from the range. You can
     * optionally choose to leave the prefix range empty and instead provide the specific IPv6
     * address that should be used from within that range.
     *
     * @return the value
     */
    public java.util.List<InstanceConfigurationIpv6AddressIpv6SubnetCidrPairDetails>
            getIpv6AddressIpv6SubnetCidrPairDetails() {
        return ipv6AddressIpv6SubnetCidrPairDetails;
    }

    /**
     * The hostname for the VNIC's primary private IP. See the {@code hostnameLabel} attribute of
     * {@link CreateVnicDetails} for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * The hostname for the VNIC's primary private IP. See the {@code hostnameLabel} attribute of
     * {@link CreateVnicDetails} for more information.
     *
     * @return the value
     */
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more
     * information about NSGs, see {@link NetworkSecurityGroup}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more
     * information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * A private IP address of your choice to assign to the VNIC. See the {@code privateIp}
     * attribute of {@link CreateVnicDetails} for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * A private IP address of your choice to assign to the VNIC. See the {@code privateIp}
     * attribute of {@link CreateVnicDetails} for more information.
     *
     * @return the value
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * Whether the source/destination check is disabled on the VNIC. See the {@code
     * skipSourceDestCheck} attribute of {@link CreateVnicDetails} for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
    private final Boolean skipSourceDestCheck;

    /**
     * Whether the source/destination check is disabled on the VNIC. See the {@code
     * skipSourceDestCheck} attribute of {@link CreateVnicDetails} for more information.
     *
     * @return the value
     */
    public Boolean getSkipSourceDestCheck() {
        return skipSourceDestCheck;
    }

    /**
     * The OCID of the subnet to create the VNIC in. See the {@code subnetId} attribute of {@link
     * CreateVnicDetails} for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet to create the VNIC in. See the {@code subnetId} attribute of {@link
     * CreateVnicDetails} for more information.
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
        sb.append("InstanceConfigurationCreateVnicDetails(");
        sb.append("super=").append(super.toString());
        sb.append("assignIpv6Ip=").append(String.valueOf(this.assignIpv6Ip));
        sb.append(", assignPublicIp=").append(String.valueOf(this.assignPublicIp));
        sb.append(", assignPrivateDnsRecord=").append(String.valueOf(this.assignPrivateDnsRecord));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", ipv6AddressIpv6SubnetCidrPairDetails=")
                .append(String.valueOf(this.ipv6AddressIpv6SubnetCidrPairDetails));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", skipSourceDestCheck=").append(String.valueOf(this.skipSourceDestCheck));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfigurationCreateVnicDetails)) {
            return false;
        }

        InstanceConfigurationCreateVnicDetails other = (InstanceConfigurationCreateVnicDetails) o;
        return java.util.Objects.equals(this.assignIpv6Ip, other.assignIpv6Ip)
                && java.util.Objects.equals(this.assignPublicIp, other.assignPublicIp)
                && java.util.Objects.equals(
                        this.assignPrivateDnsRecord, other.assignPrivateDnsRecord)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(
                        this.ipv6AddressIpv6SubnetCidrPairDetails,
                        other.ipv6AddressIpv6SubnetCidrPairDetails)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.skipSourceDestCheck, other.skipSourceDestCheck)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignIpv6Ip == null ? 43 : this.assignIpv6Ip.hashCode());
        result =
                (result * PRIME)
                        + (this.assignPublicIp == null ? 43 : this.assignPublicIp.hashCode());
        result =
                (result * PRIME)
                        + (this.assignPrivateDnsRecord == null
                                ? 43
                                : this.assignPrivateDnsRecord.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6AddressIpv6SubnetCidrPairDetails == null
                                ? 43
                                : this.ipv6AddressIpv6SubnetCidrPairDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.skipSourceDestCheck == null
                                ? 43
                                : this.skipSourceDestCheck.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
