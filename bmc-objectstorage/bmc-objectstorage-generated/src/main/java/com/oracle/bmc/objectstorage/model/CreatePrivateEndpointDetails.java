/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Details to create a private endpoint
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
    builder = CreatePrivateEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreatePrivateEndpointDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "compartmentId",
        "subnetId",
        "prefix",
        "additionalPrefixes",
        "privateEndpointIp",
        "nsgIds",
        "accessTargets",
        "freeformTags",
        "definedTags"
    })
    public CreatePrivateEndpointDetails(
            String name,
            String compartmentId,
            String subnetId,
            String prefix,
            java.util.List<String> additionalPrefixes,
            String privateEndpointIp,
            java.util.List<String> nsgIds,
            java.util.List<AccessTargetDetails> accessTargets,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.compartmentId = compartmentId;
        this.subnetId = subnetId;
        this.prefix = prefix;
        this.additionalPrefixes = additionalPrefixes;
        this.privateEndpointIp = privateEndpointIp;
        this.nsgIds = nsgIds;
        this.accessTargets = accessTargets;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This name associated with the endpoint. Valid characters are uppercase or lowercase letters, numbers, hyphens,
         *  underscores, and periods.
         * Example: my-new-private-endpoint1
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * This name associated with the endpoint. Valid characters are uppercase or lowercase letters, numbers, hyphens,
         *  underscores, and periods.
         * Example: my-new-private-endpoint1
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The ID of the compartment in which to create the Private Endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The ID of the compartment in which to create the Private Endpoint.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the customer's subnet where the private endpoint VNIC will reside.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the customer's subnet where the private endpoint VNIC will reside.
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
         * A prefix to use for the private endpoint. The customer VCN's DNS records are
         * updated with this prefix. The prefix input from the customer will be the first sub-domain in the endpointFqdn.
         * Example: If the prefix chosen is "abc", then the endpointFqdn will be 'abc.private.objectstorage.<region>.oraclecloud.com'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * A prefix to use for the private endpoint. The customer VCN's DNS records are
         * updated with this prefix. The prefix input from the customer will be the first sub-domain in the endpointFqdn.
         * Example: If the prefix chosen is "abc", then the endpointFqdn will be 'abc.private.objectstorage.<region>.oraclecloud.com'
         *
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * A list of additional prefix that you can provide along with any other prefix. These resulting endpointFqdn's are added to the
         * customer VCN's DNS record.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalPrefixes")
        private java.util.List<String> additionalPrefixes;

        /**
         * A list of additional prefix that you can provide along with any other prefix. These resulting endpointFqdn's are added to the
         * customer VCN's DNS record.
         *
         * @param additionalPrefixes the value to set
         * @return this builder
         **/
        public Builder additionalPrefixes(java.util.List<String> additionalPrefixes) {
            this.additionalPrefixes = additionalPrefixes;
            this.__explicitlySet__.add("additionalPrefixes");
            return this;
        }
        /**
         * The private IP address to assign to this private endpoint. If you provide a value,
         * it must be an available IP address in the customer's subnet. If it's not available, an error
         * is returned.
         * <p>
         * If you do not provide a value, an available IP address in the subnet is automatically chosen.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        /**
         * The private IP address to assign to this private endpoint. If you provide a value,
         * it must be an available IP address in the customer's subnet. If it's not available, an error
         * is returned.
         * <p>
         * If you do not provide a value, an available IP address in the subnet is automatically chosen.
         *
         * @param privateEndpointIp the value to set
         * @return this builder
         **/
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }
        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the private endpoint's VNIC to.
         * For more information about NSGs, see
         * {@link NetworkSecurityGroup}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the private endpoint's VNIC to.
         * For more information about NSGs, see
         * {@link NetworkSecurityGroup}.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * A list of targets that can be accessed by the private endpoint.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessTargets")
        private java.util.List<AccessTargetDetails> accessTargets;

        /**
         * A list of targets that can be accessed by the private endpoint.
         *
         * @param accessTargets the value to set
         * @return this builder
         **/
        public Builder accessTargets(java.util.List<AccessTargetDetails> accessTargets) {
            this.accessTargets = accessTargets;
            this.__explicitlySet__.add("accessTargets");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePrivateEndpointDetails build() {
            CreatePrivateEndpointDetails model =
                    new CreatePrivateEndpointDetails(
                            this.name,
                            this.compartmentId,
                            this.subnetId,
                            this.prefix,
                            this.additionalPrefixes,
                            this.privateEndpointIp,
                            this.nsgIds,
                            this.accessTargets,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePrivateEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("additionalPrefixes")) {
                this.additionalPrefixes(model.getAdditionalPrefixes());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIp")) {
                this.privateEndpointIp(model.getPrivateEndpointIp());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("accessTargets")) {
                this.accessTargets(model.getAccessTargets());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * This name associated with the endpoint. Valid characters are uppercase or lowercase letters, numbers, hyphens,
     *  underscores, and periods.
     * Example: my-new-private-endpoint1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * This name associated with the endpoint. Valid characters are uppercase or lowercase letters, numbers, hyphens,
     *  underscores, and periods.
     * Example: my-new-private-endpoint1
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The ID of the compartment in which to create the Private Endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The ID of the compartment in which to create the Private Endpoint.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the customer's subnet where the private endpoint VNIC will reside.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the customer's subnet where the private endpoint VNIC will reside.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * A prefix to use for the private endpoint. The customer VCN's DNS records are
     * updated with this prefix. The prefix input from the customer will be the first sub-domain in the endpointFqdn.
     * Example: If the prefix chosen is "abc", then the endpointFqdn will be 'abc.private.objectstorage.<region>.oraclecloud.com'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * A prefix to use for the private endpoint. The customer VCN's DNS records are
     * updated with this prefix. The prefix input from the customer will be the first sub-domain in the endpointFqdn.
     * Example: If the prefix chosen is "abc", then the endpointFqdn will be 'abc.private.objectstorage.<region>.oraclecloud.com'
     *
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    /**
     * A list of additional prefix that you can provide along with any other prefix. These resulting endpointFqdn's are added to the
     * customer VCN's DNS record.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalPrefixes")
    private final java.util.List<String> additionalPrefixes;

    /**
     * A list of additional prefix that you can provide along with any other prefix. These resulting endpointFqdn's are added to the
     * customer VCN's DNS record.
     *
     * @return the value
     **/
    public java.util.List<String> getAdditionalPrefixes() {
        return additionalPrefixes;
    }

    /**
     * The private IP address to assign to this private endpoint. If you provide a value,
     * it must be an available IP address in the customer's subnet. If it's not available, an error
     * is returned.
     * <p>
     * If you do not provide a value, an available IP address in the subnet is automatically chosen.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    private final String privateEndpointIp;

    /**
     * The private IP address to assign to this private endpoint. If you provide a value,
     * it must be an available IP address in the customer's subnet. If it's not available, an error
     * is returned.
     * <p>
     * If you do not provide a value, an available IP address in the subnet is automatically chosen.
     *
     * @return the value
     **/
    public String getPrivateEndpointIp() {
        return privateEndpointIp;
    }

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the private endpoint's VNIC to.
     * For more information about NSGs, see
     * {@link NetworkSecurityGroup}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the private endpoint's VNIC to.
     * For more information about NSGs, see
     * {@link NetworkSecurityGroup}.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * A list of targets that can be accessed by the private endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessTargets")
    private final java.util.List<AccessTargetDetails> accessTargets;

    /**
     * A list of targets that can be accessed by the private endpoint.
     *
     * @return the value
     **/
    public java.util.List<AccessTargetDetails> getAccessTargets() {
        return accessTargets;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreatePrivateEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", additionalPrefixes=").append(String.valueOf(this.additionalPrefixes));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", accessTargets=").append(String.valueOf(this.accessTargets));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePrivateEndpointDetails)) {
            return false;
        }

        CreatePrivateEndpointDetails other = (CreatePrivateEndpointDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.additionalPrefixes, other.additionalPrefixes)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.accessTargets, other.accessTargets)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalPrefixes == null
                                ? 43
                                : this.additionalPrefixes.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.accessTargets == null ? 43 : this.accessTargets.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
