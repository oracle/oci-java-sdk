/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a virtual node summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VirtualNodeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VirtualNodeSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "kubernetesVersion",
        "virtualNodePoolId",
        "availabilityDomain",
        "faultDomain",
        "subnetId",
        "nsgIds",
        "privateIp",
        "virtualNodeError",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public VirtualNodeSummary(
            String id,
            String displayName,
            String kubernetesVersion,
            String virtualNodePoolId,
            String availabilityDomain,
            String faultDomain,
            String subnetId,
            java.util.List<String> nsgIds,
            String privateIp,
            String virtualNodeError,
            VirtualNodeLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.kubernetesVersion = kubernetesVersion;
        this.virtualNodePoolId = virtualNodePoolId;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.privateIp = privateIp;
        this.virtualNodeError = virtualNodeError;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ocid of the virtual node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ocid of the virtual node.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the virtual node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the virtual node.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The version of Kubernetes this virtual node is running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        /**
         * The version of Kubernetes this virtual node is running.
         * @param kubernetesVersion the value to set
         * @return this builder
         **/
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }
        /**
         * The ocid of the virtual node pool this virtual node belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("virtualNodePoolId")
        private String virtualNodePoolId;

        /**
         * The ocid of the virtual node pool this virtual node belongs to.
         * @param virtualNodePoolId the value to set
         * @return this builder
         **/
        public Builder virtualNodePoolId(String virtualNodePoolId) {
            this.virtualNodePoolId = virtualNodePoolId;
            this.__explicitlySet__.add("virtualNodePoolId");
            return this;
        }
        /**
         * The name of the availability domain in which this virtual node is placed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain in which this virtual node is placed
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The fault domain of this virtual node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain of this virtual node.
         * @param faultDomain the value to set
         * @return this builder
         **/
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The OCID of the subnet in which this Virtual Node is placed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet in which this Virtual Node is placed.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * NSG Ids applied to virtual node vnic.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * NSG Ids applied to virtual node vnic.
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * The private IP address of this Virtual Node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * The private IP address of this Virtual Node.
         * @param privateIp the value to set
         * @return this builder
         **/
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }
        /**
         * An error that may be associated with the virtual node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("virtualNodeError")
        private String virtualNodeError;

        /**
         * An error that may be associated with the virtual node.
         * @param virtualNodeError the value to set
         * @return this builder
         **/
        public Builder virtualNodeError(String virtualNodeError) {
            this.virtualNodeError = virtualNodeError;
            this.__explicitlySet__.add("virtualNodeError");
            return this;
        }
        /**
         * The state of the Virtual Node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private VirtualNodeLifecycleState lifecycleState;

        /**
         * The state of the Virtual Node.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(VirtualNodeLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details about the state of the Virtual Node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the state of the Virtual Node.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The time at which the virtual node was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time at which the virtual node was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualNodeSummary build() {
            VirtualNodeSummary model =
                    new VirtualNodeSummary(
                            this.id,
                            this.displayName,
                            this.kubernetesVersion,
                            this.virtualNodePoolId,
                            this.availabilityDomain,
                            this.faultDomain,
                            this.subnetId,
                            this.nsgIds,
                            this.privateIp,
                            this.virtualNodeError,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualNodeSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("kubernetesVersion")) {
                this.kubernetesVersion(model.getKubernetesVersion());
            }
            if (model.wasPropertyExplicitlySet("virtualNodePoolId")) {
                this.virtualNodePoolId(model.getVirtualNodePoolId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("virtualNodeError")) {
                this.virtualNodeError(model.getVirtualNodeError());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The ocid of the virtual node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ocid of the virtual node.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the virtual node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the virtual node.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The version of Kubernetes this virtual node is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    private final String kubernetesVersion;

    /**
     * The version of Kubernetes this virtual node is running.
     * @return the value
     **/
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    /**
     * The ocid of the virtual node pool this virtual node belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualNodePoolId")
    private final String virtualNodePoolId;

    /**
     * The ocid of the virtual node pool this virtual node belongs to.
     * @return the value
     **/
    public String getVirtualNodePoolId() {
        return virtualNodePoolId;
    }

    /**
     * The name of the availability domain in which this virtual node is placed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain in which this virtual node is placed
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The fault domain of this virtual node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain of this virtual node.
     * @return the value
     **/
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The OCID of the subnet in which this Virtual Node is placed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet in which this Virtual Node is placed.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * NSG Ids applied to virtual node vnic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * NSG Ids applied to virtual node vnic.
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The private IP address of this Virtual Node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * The private IP address of this Virtual Node.
     * @return the value
     **/
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * An error that may be associated with the virtual node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualNodeError")
    private final String virtualNodeError;

    /**
     * An error that may be associated with the virtual node.
     * @return the value
     **/
    public String getVirtualNodeError() {
        return virtualNodeError;
    }

    /**
     * The state of the Virtual Node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final VirtualNodeLifecycleState lifecycleState;

    /**
     * The state of the Virtual Node.
     * @return the value
     **/
    public VirtualNodeLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the state of the Virtual Node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the state of the Virtual Node.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time at which the virtual node was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time at which the virtual node was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("VirtualNodeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", kubernetesVersion=").append(String.valueOf(this.kubernetesVersion));
        sb.append(", virtualNodePoolId=").append(String.valueOf(this.virtualNodePoolId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", virtualNodeError=").append(String.valueOf(this.virtualNodeError));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualNodeSummary)) {
            return false;
        }

        VirtualNodeSummary other = (VirtualNodeSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.kubernetesVersion, other.kubernetesVersion)
                && java.util.Objects.equals(this.virtualNodePoolId, other.virtualNodePoolId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.virtualNodeError, other.virtualNodeError)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.kubernetesVersion == null ? 43 : this.kubernetesVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualNodePoolId == null ? 43 : this.virtualNodePoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualNodeError == null ? 43 : this.virtualNodeError.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
