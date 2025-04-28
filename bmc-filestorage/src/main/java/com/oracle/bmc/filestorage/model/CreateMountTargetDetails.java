/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for creating the mount target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMountTargetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMountTargetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "displayName",
        "hostnameLabel",
        "ipAddress",
        "subnetId",
        "idmapType",
        "ldapIdmap",
        "nsgIds",
        "kerberos",
        "freeformTags",
        "definedTags",
        "locks",
        "requestedThroughput"
    })
    public CreateMountTargetDetails(
            String availabilityDomain,
            String compartmentId,
            String displayName,
            String hostnameLabel,
            String ipAddress,
            String subnetId,
            MountTarget.IdmapType idmapType,
            CreateLdapIdmapDetails ldapIdmap,
            java.util.List<String> nsgIds,
            CreateKerberosDetails kerberos,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<ResourceLock> locks,
            Long requestedThroughput) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.hostnameLabel = hostnameLabel;
        this.ipAddress = ipAddress;
        this.subnetId = subnetId;
        this.idmapType = idmapType;
        this.ldapIdmap = ldapIdmap;
        this.nsgIds = nsgIds;
        this.kerberos = kerberos;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.locks = locks;
        this.requestedThroughput = requestedThroughput;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain in which to create the mount target.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain in which to create the mount target.
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
         * compartment in which to create the mount target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to create the mount target.
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
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My mount target}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My mount target}
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
         * The hostname for the mount target's IP address, used for DNS resolution. The value is the
         * hostname portion of the private IP address's fully qualified domain name (FQDN). For
         * example, {@code files-1} in the FQDN {@code files-1.subnet123.vcn1.oraclevcn.com}. Must
         * be unique across all VNICs in the subnet and comply with [RFC
         * 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123).
         *
         * <p>Note: This attribute value is stored in the
         * [PrivateIp](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/PrivateIp/)
         * resource, not in the {@code mountTarget} resource. To update the {@code hostnameLabel},
         * use {@code GetMountTarget} to obtain the
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * mount target's private IPs ({@code privateIpIds}). Then, you can use
         * [UpdatePrivateIp](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/PrivateIp/UpdatePrivateIp)
         * to update the {@code hostnameLabel} value.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code files-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * The hostname for the mount target's IP address, used for DNS resolution. The value is the
         * hostname portion of the private IP address's fully qualified domain name (FQDN). For
         * example, {@code files-1} in the FQDN {@code files-1.subnet123.vcn1.oraclevcn.com}. Must
         * be unique across all VNICs in the subnet and comply with [RFC
         * 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123).
         *
         * <p>Note: This attribute value is stored in the
         * [PrivateIp](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/PrivateIp/)
         * resource, not in the {@code mountTarget} resource. To update the {@code hostnameLabel},
         * use {@code GetMountTarget} to obtain the
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * mount target's private IPs ({@code privateIpIds}). Then, you can use
         * [UpdatePrivateIp](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/PrivateIp/UpdatePrivateIp)
         * to update the {@code hostnameLabel} value.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code files-1}
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
         * A private IP address of your choice. Must be an available IP address within the subnet's
         * CIDR. If you don't specify a value, Oracle automatically assigns a private IP address
         * from the subnet.
         *
         * <p>Example: {@code 10.0.3.3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * A private IP address of your choice. Must be an available IP address within the subnet's
         * CIDR. If you don't specify a value, Oracle automatically assigns a private IP address
         * from the subnet.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet in which to create the mount target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet in which to create the mount target.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** The method used to map a Unix UID to secondary groups, if any. */
        @com.fasterxml.jackson.annotation.JsonProperty("idmapType")
        private MountTarget.IdmapType idmapType;

        /**
         * The method used to map a Unix UID to secondary groups, if any.
         *
         * @param idmapType the value to set
         * @return this builder
         */
        public Builder idmapType(MountTarget.IdmapType idmapType) {
            this.idmapType = idmapType;
            this.__explicitlySet__.add("idmapType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ldapIdmap")
        private CreateLdapIdmapDetails ldapIdmap;

        public Builder ldapIdmap(CreateLdapIdmapDetails ldapIdmap) {
            this.ldapIdmap = ldapIdmap;
            this.__explicitlySet__.add("ldapIdmap");
            return this;
        }
        /**
         * A list of Network Security Group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this mount target. A maximum of 5 is allowed. Setting this to an empty array after
         * the list is created removes the mount target from all NSGs. For more information about
         * NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of Network Security Group
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this mount target. A maximum of 5 is allowed. Setting this to an empty array after
         * the list is created removes the mount target from all NSGs. For more information about
         * NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kerberos")
        private CreateKerberosDetails kerberos;

        public Builder kerberos(CreateKerberosDetails kerberos) {
            this.kerberos = kerberos;
            this.__explicitlySet__.add("kerberos");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /**
         * Throughput for mount target in Gbps. Currently only 1 Gbps of requestedThroughput is
         * supported during create MountTarget. Available shapes and corresponding throughput are
         * listed at [Mount Target
         * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestedThroughput")
        private Long requestedThroughput;

        /**
         * Throughput for mount target in Gbps. Currently only 1 Gbps of requestedThroughput is
         * supported during create MountTarget. Available shapes and corresponding throughput are
         * listed at [Mount Target
         * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
         *
         * @param requestedThroughput the value to set
         * @return this builder
         */
        public Builder requestedThroughput(Long requestedThroughput) {
            this.requestedThroughput = requestedThroughput;
            this.__explicitlySet__.add("requestedThroughput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMountTargetDetails build() {
            CreateMountTargetDetails model =
                    new CreateMountTargetDetails(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.displayName,
                            this.hostnameLabel,
                            this.ipAddress,
                            this.subnetId,
                            this.idmapType,
                            this.ldapIdmap,
                            this.nsgIds,
                            this.kerberos,
                            this.freeformTags,
                            this.definedTags,
                            this.locks,
                            this.requestedThroughput);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMountTargetDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("hostnameLabel")) {
                this.hostnameLabel(model.getHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("idmapType")) {
                this.idmapType(model.getIdmapType());
            }
            if (model.wasPropertyExplicitlySet("ldapIdmap")) {
                this.ldapIdmap(model.getLdapIdmap());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("kerberos")) {
                this.kerberos(model.getKerberos());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("requestedThroughput")) {
                this.requestedThroughput(model.getRequestedThroughput());
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
     * The availability domain in which to create the mount target.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain in which to create the mount target.
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
     * compartment in which to create the mount target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to create the mount target.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My mount target}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My mount target}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The hostname for the mount target's IP address, used for DNS resolution. The value is the
     * hostname portion of the private IP address's fully qualified domain name (FQDN). For example,
     * {@code files-1} in the FQDN {@code files-1.subnet123.vcn1.oraclevcn.com}. Must be unique
     * across all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952)
     * and [RFC 1123](https://tools.ietf.org/html/rfc1123).
     *
     * <p>Note: This attribute value is stored in the
     * [PrivateIp](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/PrivateIp/)
     * resource, not in the {@code mountTarget} resource. To update the {@code hostnameLabel}, use
     * {@code GetMountTarget} to obtain the
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the mount
     * target's private IPs ({@code privateIpIds}). Then, you can use
     * [UpdatePrivateIp](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/PrivateIp/UpdatePrivateIp)
     * to update the {@code hostnameLabel} value.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code files-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * The hostname for the mount target's IP address, used for DNS resolution. The value is the
     * hostname portion of the private IP address's fully qualified domain name (FQDN). For example,
     * {@code files-1} in the FQDN {@code files-1.subnet123.vcn1.oraclevcn.com}. Must be unique
     * across all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952)
     * and [RFC 1123](https://tools.ietf.org/html/rfc1123).
     *
     * <p>Note: This attribute value is stored in the
     * [PrivateIp](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/PrivateIp/)
     * resource, not in the {@code mountTarget} resource. To update the {@code hostnameLabel}, use
     * {@code GetMountTarget} to obtain the
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the mount
     * target's private IPs ({@code privateIpIds}). Then, you can use
     * [UpdatePrivateIp](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/PrivateIp/UpdatePrivateIp)
     * to update the {@code hostnameLabel} value.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code files-1}
     *
     * @return the value
     */
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * A private IP address of your choice. Must be an available IP address within the subnet's
     * CIDR. If you don't specify a value, Oracle automatically assigns a private IP address from
     * the subnet.
     *
     * <p>Example: {@code 10.0.3.3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * A private IP address of your choice. Must be an available IP address within the subnet's
     * CIDR. If you don't specify a value, Oracle automatically assigns a private IP address from
     * the subnet.
     *
     * <p>Example: {@code 10.0.3.3}
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet in which to create the mount target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet in which to create the mount target.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** The method used to map a Unix UID to secondary groups, if any. */
    @com.fasterxml.jackson.annotation.JsonProperty("idmapType")
    private final MountTarget.IdmapType idmapType;

    /**
     * The method used to map a Unix UID to secondary groups, if any.
     *
     * @return the value
     */
    public MountTarget.IdmapType getIdmapType() {
        return idmapType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ldapIdmap")
    private final CreateLdapIdmapDetails ldapIdmap;

    public CreateLdapIdmapDetails getLdapIdmap() {
        return ldapIdmap;
    }

    /**
     * A list of Network Security Group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this mount target. A maximum of 5 is allowed. Setting this to an empty array after the
     * list is created removes the mount target from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of Network Security Group
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this mount target. A maximum of 5 is allowed. Setting this to an empty array after the
     * list is created removes the mount target from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("kerberos")
    private final CreateKerberosDetails kerberos;

    public CreateKerberosDetails getKerberos() {
        return kerberos;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
    }

    /**
     * Throughput for mount target in Gbps. Currently only 1 Gbps of requestedThroughput is
     * supported during create MountTarget. Available shapes and corresponding throughput are listed
     * at [Mount Target
     * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedThroughput")
    private final Long requestedThroughput;

    /**
     * Throughput for mount target in Gbps. Currently only 1 Gbps of requestedThroughput is
     * supported during create MountTarget. Available shapes and corresponding throughput are listed
     * at [Mount Target
     * Performance](https://docs.oracle.com/iaas/Content/File/Tasks/managingmounttargets.htm#performance).
     *
     * @return the value
     */
    public Long getRequestedThroughput() {
        return requestedThroughput;
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
        sb.append("CreateMountTargetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", idmapType=").append(String.valueOf(this.idmapType));
        sb.append(", ldapIdmap=").append(String.valueOf(this.ldapIdmap));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", kerberos=").append(String.valueOf(this.kerberos));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(", requestedThroughput=").append(String.valueOf(this.requestedThroughput));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMountTargetDetails)) {
            return false;
        }

        CreateMountTargetDetails other = (CreateMountTargetDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.idmapType, other.idmapType)
                && java.util.Objects.equals(this.ldapIdmap, other.ldapIdmap)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.kerberos, other.kerberos)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.locks, other.locks)
                && java.util.Objects.equals(this.requestedThroughput, other.requestedThroughput)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.idmapType == null ? 43 : this.idmapType.hashCode());
        result = (result * PRIME) + (this.ldapIdmap == null ? 43 : this.ldapIdmap.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.kerberos == null ? 43 : this.kerberos.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result =
                (result * PRIME)
                        + (this.requestedThroughput == null
                                ? 43
                                : this.requestedThroughput.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
