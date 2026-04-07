/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties of the secondary vnics <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateVnicDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVnicDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "assignIpv6Ip",
        "assignPublicIp",
        "definedTags",
        "freeformTags",
        "ipCount",
        "applicationResources",
        "ipv6AddressIpv6SubnetCidrPairDetails",
        "nsgIds",
        "skipSourceDestCheck",
        "subnetId"
    })
    public CreateVnicDetails(
            String displayName,
            Boolean assignIpv6Ip,
            Boolean assignPublicIp,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            Integer ipCount,
            java.util.List<String> applicationResources,
            java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
                    ipv6AddressIpv6SubnetCidrPairDetails,
            java.util.List<String> nsgIds,
            Boolean skipSourceDestCheck,
            String subnetId) {
        super();
        this.displayName = displayName;
        this.assignIpv6Ip = assignIpv6Ip;
        this.assignPublicIp = assignPublicIp;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.ipCount = ipCount;
        this.applicationResources = applicationResources;
        this.ipv6AddressIpv6SubnetCidrPairDetails = ipv6AddressIpv6SubnetCidrPairDetails;
        this.nsgIds = nsgIds;
        this.skipSourceDestCheck = skipSourceDestCheck;
        this.subnetId = subnetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Display name for secondary vnic */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for secondary vnic
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
         * subnet
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assignIpv6Ip")
        private Boolean assignIpv6Ip;

        /**
         * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
         * subnet
         *
         * @param assignIpv6Ip the value to set
         * @return this builder
         */
        public Builder assignIpv6Ip(Boolean assignIpv6Ip) {
            this.assignIpv6Ip = assignIpv6Ip;
            this.__explicitlySet__.add("assignIpv6Ip");
            return this;
        }
        /** Whether the VNIC should be assigned a public IP address */
        @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
        private Boolean assignPublicIp;

        /**
         * Whether the VNIC should be assigned a public IP address
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
        /** The number of ip addresses to attach to secondary vnic */
        @com.fasterxml.jackson.annotation.JsonProperty("ipCount")
        private Integer ipCount;

        /**
         * The number of ip addresses to attach to secondary vnic
         *
         * @param ipCount the value to set
         * @return this builder
         */
        public Builder ipCount(Integer ipCount) {
            this.ipCount = ipCount;
            this.__explicitlySet__.add("ipCount");
            return this;
        }
        /**
         * The application resource that corresponds to this secondary vnic. Used to map pods to
         * this specific vnic for scheduling
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationResources")
        private java.util.List<String> applicationResources;

        /**
         * The application resource that corresponds to this secondary vnic. Used to map pods to
         * this specific vnic for scheduling
         *
         * @param applicationResources the value to set
         * @return this builder
         */
        public Builder applicationResources(java.util.List<String> applicationResources) {
            this.applicationResources = applicationResources;
            this.__explicitlySet__.add("applicationResources");
            return this;
        }
        /**
         * A list of IPv6 prefixes from which the VNIC should be assigned an IPv6 address. You can
         * provide only the prefix and OCI selects an available address from the range. You can
         * optionally choose to leave the prefix range empty and instead provide the specific IPv6
         * address that should be used from within that range.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6AddressIpv6SubnetCidrPairDetails")
        private java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
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
                java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
                        ipv6AddressIpv6SubnetCidrPairDetails) {
            this.ipv6AddressIpv6SubnetCidrPairDetails = ipv6AddressIpv6SubnetCidrPairDetails;
            this.__explicitlySet__.add("ipv6AddressIpv6SubnetCidrPairDetails");
            return this;
        }
        /** A list of the OCIDs of the network security groups (NSGs) to add the VNIC to */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /** Whether the source/destination check is disabled on the VNIC */
        @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
        private Boolean skipSourceDestCheck;

        /**
         * Whether the source/destination check is disabled on the VNIC
         *
         * @param skipSourceDestCheck the value to set
         * @return this builder
         */
        public Builder skipSourceDestCheck(Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = skipSourceDestCheck;
            this.__explicitlySet__.add("skipSourceDestCheck");
            return this;
        }
        /** the ocid of the subnet to create the vnic in */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * the ocid of the subnet to create the vnic in
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

        public CreateVnicDetails build() {
            CreateVnicDetails model =
                    new CreateVnicDetails(
                            this.displayName,
                            this.assignIpv6Ip,
                            this.assignPublicIp,
                            this.definedTags,
                            this.freeformTags,
                            this.ipCount,
                            this.applicationResources,
                            this.ipv6AddressIpv6SubnetCidrPairDetails,
                            this.nsgIds,
                            this.skipSourceDestCheck,
                            this.subnetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVnicDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("assignIpv6Ip")) {
                this.assignIpv6Ip(model.getAssignIpv6Ip());
            }
            if (model.wasPropertyExplicitlySet("assignPublicIp")) {
                this.assignPublicIp(model.getAssignPublicIp());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("ipCount")) {
                this.ipCount(model.getIpCount());
            }
            if (model.wasPropertyExplicitlySet("applicationResources")) {
                this.applicationResources(model.getApplicationResources());
            }
            if (model.wasPropertyExplicitlySet("ipv6AddressIpv6SubnetCidrPairDetails")) {
                this.ipv6AddressIpv6SubnetCidrPairDetails(
                        model.getIpv6AddressIpv6SubnetCidrPairDetails());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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

    /** Display name for secondary vnic */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for secondary vnic
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled subnet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignIpv6Ip")
    private final Boolean assignIpv6Ip;

    /**
     * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled subnet
     *
     * @return the value
     */
    public Boolean getAssignIpv6Ip() {
        return assignIpv6Ip;
    }

    /** Whether the VNIC should be assigned a public IP address */
    @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
    private final Boolean assignPublicIp;

    /**
     * Whether the VNIC should be assigned a public IP address
     *
     * @return the value
     */
    public Boolean getAssignPublicIp() {
        return assignPublicIp;
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

    /** The number of ip addresses to attach to secondary vnic */
    @com.fasterxml.jackson.annotation.JsonProperty("ipCount")
    private final Integer ipCount;

    /**
     * The number of ip addresses to attach to secondary vnic
     *
     * @return the value
     */
    public Integer getIpCount() {
        return ipCount;
    }

    /**
     * The application resource that corresponds to this secondary vnic. Used to map pods to this
     * specific vnic for scheduling
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationResources")
    private final java.util.List<String> applicationResources;

    /**
     * The application resource that corresponds to this secondary vnic. Used to map pods to this
     * specific vnic for scheduling
     *
     * @return the value
     */
    public java.util.List<String> getApplicationResources() {
        return applicationResources;
    }

    /**
     * A list of IPv6 prefixes from which the VNIC should be assigned an IPv6 address. You can
     * provide only the prefix and OCI selects an available address from the range. You can
     * optionally choose to leave the prefix range empty and instead provide the specific IPv6
     * address that should be used from within that range.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6AddressIpv6SubnetCidrPairDetails")
    private final java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
            ipv6AddressIpv6SubnetCidrPairDetails;

    /**
     * A list of IPv6 prefixes from which the VNIC should be assigned an IPv6 address. You can
     * provide only the prefix and OCI selects an available address from the range. You can
     * optionally choose to leave the prefix range empty and instead provide the specific IPv6
     * address that should be used from within that range.
     *
     * @return the value
     */
    public java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
            getIpv6AddressIpv6SubnetCidrPairDetails() {
        return ipv6AddressIpv6SubnetCidrPairDetails;
    }

    /** A list of the OCIDs of the network security groups (NSGs) to add the VNIC to */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /** Whether the source/destination check is disabled on the VNIC */
    @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
    private final Boolean skipSourceDestCheck;

    /**
     * Whether the source/destination check is disabled on the VNIC
     *
     * @return the value
     */
    public Boolean getSkipSourceDestCheck() {
        return skipSourceDestCheck;
    }

    /** the ocid of the subnet to create the vnic in */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * the ocid of the subnet to create the vnic in
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
        sb.append("CreateVnicDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", assignIpv6Ip=").append(String.valueOf(this.assignIpv6Ip));
        sb.append(", assignPublicIp=").append(String.valueOf(this.assignPublicIp));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", ipCount=").append(String.valueOf(this.ipCount));
        sb.append(", applicationResources=").append(String.valueOf(this.applicationResources));
        sb.append(", ipv6AddressIpv6SubnetCidrPairDetails=")
                .append(String.valueOf(this.ipv6AddressIpv6SubnetCidrPairDetails));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
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
        if (!(o instanceof CreateVnicDetails)) {
            return false;
        }

        CreateVnicDetails other = (CreateVnicDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.assignIpv6Ip, other.assignIpv6Ip)
                && java.util.Objects.equals(this.assignPublicIp, other.assignPublicIp)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.ipCount, other.ipCount)
                && java.util.Objects.equals(this.applicationResources, other.applicationResources)
                && java.util.Objects.equals(
                        this.ipv6AddressIpv6SubnetCidrPairDetails,
                        other.ipv6AddressIpv6SubnetCidrPairDetails)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.skipSourceDestCheck, other.skipSourceDestCheck)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.assignIpv6Ip == null ? 43 : this.assignIpv6Ip.hashCode());
        result =
                (result * PRIME)
                        + (this.assignPublicIp == null ? 43 : this.assignPublicIp.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.ipCount == null ? 43 : this.ipCount.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationResources == null
                                ? 43
                                : this.applicationResources.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6AddressIpv6SubnetCidrPairDetails == null
                                ? 43
                                : this.ipv6AddressIpv6SubnetCidrPairDetails.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
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
