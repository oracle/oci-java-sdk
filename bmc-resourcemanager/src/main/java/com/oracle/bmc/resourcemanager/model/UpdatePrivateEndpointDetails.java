/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Update details for a private endpoint. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdatePrivateEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatePrivateEndpointDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "vcnId",
        "subnetId",
        "dnsZones",
        "nsgIdList",
        "isUsedWithConfigurationSourceProvider",
        "freeformTags",
        "definedTags"
    })
    public UpdatePrivateEndpointDetails(
            String displayName,
            String description,
            String vcnId,
            String subnetId,
            java.util.List<String> dnsZones,
            java.util.List<String> nsgIdList,
            Boolean isUsedWithConfigurationSourceProvider,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.dnsZones = dnsZones;
        this.nsgIdList = nsgIdList;
        this.isUsedWithConfigurationSourceProvider = isUsedWithConfigurationSourceProvider;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The private endpoint display name. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The private endpoint display name. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the private endpoint. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the private endpoint. Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN for the private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN for the private endpoint.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the subnet within the VCN for the private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the subnet within the VCN for the private endpoint.
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
         * DNS Proxy forwards any DNS FQDN queries over into the consumer DNS resolver if the DNS
         * FQDN is included in the dns zones list otherwise it goes to service provider VCN
         * resolver.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
        private java.util.List<String> dnsZones;

        /**
         * DNS Proxy forwards any DNS FQDN queries over into the consumer DNS resolver if the DNS
         * FQDN is included in the dns zones list otherwise it goes to service provider VCN
         * resolver.
         *
         * @param dnsZones the value to set
         * @return this builder
         */
        public Builder dnsZones(java.util.List<String> dnsZones) {
            this.dnsZones = dnsZones;
            this.__explicitlySet__.add("dnsZones");
            return this;
        }
        /**
         * The [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of [network security groups
         * (NSGs)](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm)
         * for the private endpoint. Order does not matter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIdList")
        private java.util.List<String> nsgIdList;

        /**
         * The [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of [network security groups
         * (NSGs)](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm)
         * for the private endpoint. Order does not matter.
         *
         * @param nsgIdList the value to set
         * @return this builder
         */
        public Builder nsgIdList(java.util.List<String> nsgIdList) {
            this.nsgIdList = nsgIdList;
            this.__explicitlySet__.add("nsgIdList");
            return this;
        }
        /**
         * When {@code true}, allows the private endpoint to be used with a configuration source
         * provider.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isUsedWithConfigurationSourceProvider")
        private Boolean isUsedWithConfigurationSourceProvider;

        /**
         * When {@code true}, allows the private endpoint to be used with a configuration source
         * provider.
         *
         * @param isUsedWithConfigurationSourceProvider the value to set
         * @return this builder
         */
        public Builder isUsedWithConfigurationSourceProvider(
                Boolean isUsedWithConfigurationSourceProvider) {
            this.isUsedWithConfigurationSourceProvider = isUsedWithConfigurationSourceProvider;
            this.__explicitlySet__.add("isUsedWithConfigurationSourceProvider");
            return this;
        }
        /**
         * Free-form tags associated with the resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags associated with the resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePrivateEndpointDetails build() {
            UpdatePrivateEndpointDetails model =
                    new UpdatePrivateEndpointDetails(
                            this.displayName,
                            this.description,
                            this.vcnId,
                            this.subnetId,
                            this.dnsZones,
                            this.nsgIdList,
                            this.isUsedWithConfigurationSourceProvider,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePrivateEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("dnsZones")) {
                this.dnsZones(model.getDnsZones());
            }
            if (model.wasPropertyExplicitlySet("nsgIdList")) {
                this.nsgIdList(model.getNsgIdList());
            }
            if (model.wasPropertyExplicitlySet("isUsedWithConfigurationSourceProvider")) {
                this.isUsedWithConfigurationSourceProvider(
                        model.getIsUsedWithConfigurationSourceProvider());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The private endpoint display name. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The private endpoint display name. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the private endpoint. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the private endpoint. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VCN for the private endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VCN for the private endpoint.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the subnet within the VCN for the private endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the subnet within the VCN for the private endpoint.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * DNS Proxy forwards any DNS FQDN queries over into the consumer DNS resolver if the DNS FQDN
     * is included in the dns zones list otherwise it goes to service provider VCN resolver.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
    private final java.util.List<String> dnsZones;

    /**
     * DNS Proxy forwards any DNS FQDN queries over into the consumer DNS resolver if the DNS FQDN
     * is included in the dns zones list otherwise it goes to service provider VCN resolver.
     *
     * @return the value
     */
    public java.util.List<String> getDnsZones() {
        return dnsZones;
    }

    /**
     * The [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * [network security groups
     * (NSGs)](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm)
     * for the private endpoint. Order does not matter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIdList")
    private final java.util.List<String> nsgIdList;

    /**
     * The [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * [network security groups
     * (NSGs)](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm)
     * for the private endpoint. Order does not matter.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIdList() {
        return nsgIdList;
    }

    /**
     * When {@code true}, allows the private endpoint to be used with a configuration source
     * provider.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isUsedWithConfigurationSourceProvider")
    private final Boolean isUsedWithConfigurationSourceProvider;

    /**
     * When {@code true}, allows the private endpoint to be used with a configuration source
     * provider.
     *
     * @return the value
     */
    public Boolean getIsUsedWithConfigurationSourceProvider() {
        return isUsedWithConfigurationSourceProvider;
    }

    /**
     * Free-form tags associated with the resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags associated with the resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdatePrivateEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", dnsZones=").append(String.valueOf(this.dnsZones));
        sb.append(", nsgIdList=").append(String.valueOf(this.nsgIdList));
        sb.append(", isUsedWithConfigurationSourceProvider=")
                .append(String.valueOf(this.isUsedWithConfigurationSourceProvider));
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
        if (!(o instanceof UpdatePrivateEndpointDetails)) {
            return false;
        }

        UpdatePrivateEndpointDetails other = (UpdatePrivateEndpointDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.dnsZones, other.dnsZones)
                && java.util.Objects.equals(this.nsgIdList, other.nsgIdList)
                && java.util.Objects.equals(
                        this.isUsedWithConfigurationSourceProvider,
                        other.isUsedWithConfigurationSourceProvider)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.dnsZones == null ? 43 : this.dnsZones.hashCode());
        result = (result * PRIME) + (this.nsgIdList == null ? 43 : this.nsgIdList.hashCode());
        result =
                (result * PRIME)
                        + (this.isUsedWithConfigurationSourceProvider == null
                                ? 43
                                : this.isUsedWithConfigurationSourceProvider.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
