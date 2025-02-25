/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * Configuration details to update a network load balancer.
 * <p>
 **Caution:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateNetworkLoadBalancerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateNetworkLoadBalancerDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isPreserveSourceDestination",
        "isSymmetricHashEnabled",
        "nlbIpVersion",
        "subnetIpv6Cidr",
        "assignedIpv6",
        "freeformTags",
        "definedTags",
        "securityAttributes"
    })
    public UpdateNetworkLoadBalancerDetails(
            String displayName,
            Boolean isPreserveSourceDestination,
            Boolean isSymmetricHashEnabled,
            NlbIpVersion nlbIpVersion,
            String subnetIpv6Cidr,
            String assignedIpv6,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
        super();
        this.displayName = displayName;
        this.isPreserveSourceDestination = isPreserveSourceDestination;
        this.isSymmetricHashEnabled = isSymmetricHashEnabled;
        this.nlbIpVersion = nlbIpVersion;
        this.subnetIpv6Cidr = subnetIpv6Cidr;
        this.assignedIpv6 = assignedIpv6;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user-friendly display name for the network load balancer, which does not have to be unique and can be changed.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code example_network_load_balancer}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly display name for the network load balancer, which does not have to be unique and can be changed.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code example_network_load_balancer}
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
         * This parameter can be enabled only if backends are compute OCIDs. When enabled, the skipSourceDestinationCheck parameter is automatically
         * enabled on the load balancer VNIC, and packets are sent to the backend with the entire IP header intact.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
        private Boolean isPreserveSourceDestination;

        /**
         * This parameter can be enabled only if backends are compute OCIDs. When enabled, the skipSourceDestinationCheck parameter is automatically
         * enabled on the load balancer VNIC, and packets are sent to the backend with the entire IP header intact.
         *
         * @param isPreserveSourceDestination the value to set
         * @return this builder
         **/
        public Builder isPreserveSourceDestination(Boolean isPreserveSourceDestination) {
            this.isPreserveSourceDestination = isPreserveSourceDestination;
            this.__explicitlySet__.add("isPreserveSourceDestination");
            return this;
        }
        /**
         * This can only be enabled when NLB is working in transparent mode with source destination header preservation enabled.
         * This removes the additional dependency from NLB backends(like Firewalls) to perform SNAT.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricHashEnabled")
        private Boolean isSymmetricHashEnabled;

        /**
         * This can only be enabled when NLB is working in transparent mode with source destination header preservation enabled.
         * This removes the additional dependency from NLB backends(like Firewalls) to perform SNAT.
         *
         * @param isSymmetricHashEnabled the value to set
         * @return this builder
         **/
        public Builder isSymmetricHashEnabled(Boolean isSymmetricHashEnabled) {
            this.isSymmetricHashEnabled = isSymmetricHashEnabled;
            this.__explicitlySet__.add("isSymmetricHashEnabled");
            return this;
        }
        /**
         * IP version associated with the NLB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nlbIpVersion")
        private NlbIpVersion nlbIpVersion;

        /**
         * IP version associated with the NLB.
         * @param nlbIpVersion the value to set
         * @return this builder
         **/
        public Builder nlbIpVersion(NlbIpVersion nlbIpVersion) {
            this.nlbIpVersion = nlbIpVersion;
            this.__explicitlySet__.add("nlbIpVersion");
            return this;
        }
        /**
         * IPv6 subnet prefix selection. If Ipv6 subnet prefix is passed, Nlb Ipv6 Address would be assign within the cidr block. NLB has to be dual or single stack ipv6 to support this.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetIpv6Cidr")
        private String subnetIpv6Cidr;

        /**
         * IPv6 subnet prefix selection. If Ipv6 subnet prefix is passed, Nlb Ipv6 Address would be assign within the cidr block. NLB has to be dual or single stack ipv6 to support this.
         * @param subnetIpv6Cidr the value to set
         * @return this builder
         **/
        public Builder subnetIpv6Cidr(String subnetIpv6Cidr) {
            this.subnetIpv6Cidr = subnetIpv6Cidr;
            this.__explicitlySet__.add("subnetIpv6Cidr");
            return this;
        }
        /**
         * IPv6 address to be assigned to the network load balancer being created.
         * This IP address has to be part of one of the prefixes supported by the subnet.
         * Example: "2607:9b80:9a0a:9a7e:abcd:ef01:2345:6789"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assignedIpv6")
        private String assignedIpv6;

        /**
         * IPv6 address to be assigned to the network load balancer being created.
         * This IP address has to be part of one of the prefixes supported by the subnet.
         * Example: "2607:9b80:9a0a:9a7e:abcd:ef01:2345:6789"
         *
         * @param assignedIpv6 the value to set
         * @return this builder
         **/
        public Builder assignedIpv6(String assignedIpv6) {
            this.assignedIpv6 = assignedIpv6;
            this.__explicitlySet__.add("assignedIpv6");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * ZPR tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * ZPR tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         **/
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNetworkLoadBalancerDetails build() {
            UpdateNetworkLoadBalancerDetails model =
                    new UpdateNetworkLoadBalancerDetails(
                            this.displayName,
                            this.isPreserveSourceDestination,
                            this.isSymmetricHashEnabled,
                            this.nlbIpVersion,
                            this.subnetIpv6Cidr,
                            this.assignedIpv6,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNetworkLoadBalancerDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isPreserveSourceDestination")) {
                this.isPreserveSourceDestination(model.getIsPreserveSourceDestination());
            }
            if (model.wasPropertyExplicitlySet("isSymmetricHashEnabled")) {
                this.isSymmetricHashEnabled(model.getIsSymmetricHashEnabled());
            }
            if (model.wasPropertyExplicitlySet("nlbIpVersion")) {
                this.nlbIpVersion(model.getNlbIpVersion());
            }
            if (model.wasPropertyExplicitlySet("subnetIpv6Cidr")) {
                this.subnetIpv6Cidr(model.getSubnetIpv6Cidr());
            }
            if (model.wasPropertyExplicitlySet("assignedIpv6")) {
                this.assignedIpv6(model.getAssignedIpv6());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
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
     * The user-friendly display name for the network load balancer, which does not have to be unique and can be changed.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code example_network_load_balancer}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly display name for the network load balancer, which does not have to be unique and can be changed.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code example_network_load_balancer}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This parameter can be enabled only if backends are compute OCIDs. When enabled, the skipSourceDestinationCheck parameter is automatically
     * enabled on the load balancer VNIC, and packets are sent to the backend with the entire IP header intact.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
    private final Boolean isPreserveSourceDestination;

    /**
     * This parameter can be enabled only if backends are compute OCIDs. When enabled, the skipSourceDestinationCheck parameter is automatically
     * enabled on the load balancer VNIC, and packets are sent to the backend with the entire IP header intact.
     *
     * @return the value
     **/
    public Boolean getIsPreserveSourceDestination() {
        return isPreserveSourceDestination;
    }

    /**
     * This can only be enabled when NLB is working in transparent mode with source destination header preservation enabled.
     * This removes the additional dependency from NLB backends(like Firewalls) to perform SNAT.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricHashEnabled")
    private final Boolean isSymmetricHashEnabled;

    /**
     * This can only be enabled when NLB is working in transparent mode with source destination header preservation enabled.
     * This removes the additional dependency from NLB backends(like Firewalls) to perform SNAT.
     *
     * @return the value
     **/
    public Boolean getIsSymmetricHashEnabled() {
        return isSymmetricHashEnabled;
    }

    /**
     * IP version associated with the NLB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nlbIpVersion")
    private final NlbIpVersion nlbIpVersion;

    /**
     * IP version associated with the NLB.
     * @return the value
     **/
    public NlbIpVersion getNlbIpVersion() {
        return nlbIpVersion;
    }

    /**
     * IPv6 subnet prefix selection. If Ipv6 subnet prefix is passed, Nlb Ipv6 Address would be assign within the cidr block. NLB has to be dual or single stack ipv6 to support this.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIpv6Cidr")
    private final String subnetIpv6Cidr;

    /**
     * IPv6 subnet prefix selection. If Ipv6 subnet prefix is passed, Nlb Ipv6 Address would be assign within the cidr block. NLB has to be dual or single stack ipv6 to support this.
     * @return the value
     **/
    public String getSubnetIpv6Cidr() {
        return subnetIpv6Cidr;
    }

    /**
     * IPv6 address to be assigned to the network load balancer being created.
     * This IP address has to be part of one of the prefixes supported by the subnet.
     * Example: "2607:9b80:9a0a:9a7e:abcd:ef01:2345:6789"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignedIpv6")
    private final String assignedIpv6;

    /**
     * IPv6 address to be assigned to the network load balancer being created.
     * This IP address has to be part of one of the prefixes supported by the subnet.
     * Example: "2607:9b80:9a0a:9a7e:abcd:ef01:2345:6789"
     *
     * @return the value
     **/
    public String getAssignedIpv6() {
        return assignedIpv6;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * ZPR tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * ZPR tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
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
        sb.append("UpdateNetworkLoadBalancerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isPreserveSourceDestination=")
                .append(String.valueOf(this.isPreserveSourceDestination));
        sb.append(", isSymmetricHashEnabled=").append(String.valueOf(this.isSymmetricHashEnabled));
        sb.append(", nlbIpVersion=").append(String.valueOf(this.nlbIpVersion));
        sb.append(", subnetIpv6Cidr=").append(String.valueOf(this.subnetIpv6Cidr));
        sb.append(", assignedIpv6=").append(String.valueOf(this.assignedIpv6));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNetworkLoadBalancerDetails)) {
            return false;
        }

        UpdateNetworkLoadBalancerDetails other = (UpdateNetworkLoadBalancerDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.isPreserveSourceDestination, other.isPreserveSourceDestination)
                && java.util.Objects.equals(
                        this.isSymmetricHashEnabled, other.isSymmetricHashEnabled)
                && java.util.Objects.equals(this.nlbIpVersion, other.nlbIpVersion)
                && java.util.Objects.equals(this.subnetIpv6Cidr, other.subnetIpv6Cidr)
                && java.util.Objects.equals(this.assignedIpv6, other.assignedIpv6)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreserveSourceDestination == null
                                ? 43
                                : this.isPreserveSourceDestination.hashCode());
        result =
                (result * PRIME)
                        + (this.isSymmetricHashEnabled == null
                                ? 43
                                : this.isSymmetricHashEnabled.hashCode());
        result = (result * PRIME) + (this.nlbIpVersion == null ? 43 : this.nlbIpVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.subnetIpv6Cidr == null ? 43 : this.subnetIpv6Cidr.hashCode());
        result = (result * PRIME) + (this.assignedIpv6 == null ? 43 : this.assignedIpv6.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
