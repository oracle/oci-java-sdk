/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to create a virtual node pool. <br>
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
        builder = CreateVirtualNodePoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVirtualNodePoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "clusterId",
        "displayName",
        "initialVirtualNodeLabels",
        "taints",
        "size",
        "placementConfigurations",
        "nsgIds",
        "podConfiguration",
        "freeformTags",
        "definedTags",
        "virtualNodeTags"
    })
    public CreateVirtualNodePoolDetails(
            String compartmentId,
            String clusterId,
            String displayName,
            java.util.List<InitialVirtualNodeLabel> initialVirtualNodeLabels,
            java.util.List<Taint> taints,
            Integer size,
            java.util.List<PlacementConfiguration> placementConfigurations,
            java.util.List<String> nsgIds,
            PodConfiguration podConfiguration,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            VirtualNodeTags virtualNodeTags) {
        super();
        this.compartmentId = compartmentId;
        this.clusterId = clusterId;
        this.displayName = displayName;
        this.initialVirtualNodeLabels = initialVirtualNodeLabels;
        this.taints = taints;
        this.size = size;
        this.placementConfigurations = placementConfigurations;
        this.nsgIds = nsgIds;
        this.podConfiguration = podConfiguration;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.virtualNodeTags = virtualNodeTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compartment of the virtual node pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment of the virtual node pool.
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
         * The cluster the virtual node pool is associated with. A virtual node pool can only be
         * associated with one cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The cluster the virtual node pool is associated with. A virtual node pool can only be
         * associated with one cluster.
         *
         * @param clusterId the value to set
         * @return this builder
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /** Display name of the virtual node pool. This is a non-unique value. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the virtual node pool. This is a non-unique value.
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
         * Initial labels that will be added to the Kubernetes Virtual Node object when it
         * registers.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("initialVirtualNodeLabels")
        private java.util.List<InitialVirtualNodeLabel> initialVirtualNodeLabels;

        /**
         * Initial labels that will be added to the Kubernetes Virtual Node object when it
         * registers.
         *
         * @param initialVirtualNodeLabels the value to set
         * @return this builder
         */
        public Builder initialVirtualNodeLabels(
                java.util.List<InitialVirtualNodeLabel> initialVirtualNodeLabels) {
            this.initialVirtualNodeLabels = initialVirtualNodeLabels;
            this.__explicitlySet__.add("initialVirtualNodeLabels");
            return this;
        }
        /**
         * A taint is a collection of <key, value, effect>. These taints will be applied to the
         * Virtual Nodes of this Virtual Node Pool for Kubernetes scheduling.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("taints")
        private java.util.List<Taint> taints;

        /**
         * A taint is a collection of <key, value, effect>. These taints will be applied to the
         * Virtual Nodes of this Virtual Node Pool for Kubernetes scheduling.
         *
         * @param taints the value to set
         * @return this builder
         */
        public Builder taints(java.util.List<Taint> taints) {
            this.taints = taints;
            this.__explicitlySet__.add("taints");
            return this;
        }
        /**
         * The number of Virtual Nodes that should be in the Virtual Node Pool. The placement
         * configurations determine where these virtual nodes are placed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Integer size;

        /**
         * The number of Virtual Nodes that should be in the Virtual Node Pool. The placement
         * configurations determine where these virtual nodes are placed.
         *
         * @param size the value to set
         * @return this builder
         */
        public Builder size(Integer size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }
        /**
         * The list of placement configurations which determines where Virtual Nodes will be
         * provisioned across as it relates to the subnet and availability domains. The size
         * attribute determines how many we evenly spread across these placement configurations
         */
        @com.fasterxml.jackson.annotation.JsonProperty("placementConfigurations")
        private java.util.List<PlacementConfiguration> placementConfigurations;

        /**
         * The list of placement configurations which determines where Virtual Nodes will be
         * provisioned across as it relates to the subnet and availability domains. The size
         * attribute determines how many we evenly spread across these placement configurations
         *
         * @param placementConfigurations the value to set
         * @return this builder
         */
        public Builder placementConfigurations(
                java.util.List<PlacementConfiguration> placementConfigurations) {
            this.placementConfigurations = placementConfigurations;
            this.__explicitlySet__.add("placementConfigurations");
            return this;
        }
        /** List of network security group id's applied to the Virtual Node VNIC. */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * List of network security group id's applied to the Virtual Node VNIC.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /** The pod configuration for pods run on virtual nodes of this virtual node pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("podConfiguration")
        private PodConfiguration podConfiguration;

        /**
         * The pod configuration for pods run on virtual nodes of this virtual node pool.
         *
         * @param podConfiguration the value to set
         * @return this builder
         */
        public Builder podConfiguration(PodConfiguration podConfiguration) {
            this.podConfiguration = podConfiguration;
            this.__explicitlySet__.add("podConfiguration");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
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
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
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

        @com.fasterxml.jackson.annotation.JsonProperty("virtualNodeTags")
        private VirtualNodeTags virtualNodeTags;

        public Builder virtualNodeTags(VirtualNodeTags virtualNodeTags) {
            this.virtualNodeTags = virtualNodeTags;
            this.__explicitlySet__.add("virtualNodeTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVirtualNodePoolDetails build() {
            CreateVirtualNodePoolDetails model =
                    new CreateVirtualNodePoolDetails(
                            this.compartmentId,
                            this.clusterId,
                            this.displayName,
                            this.initialVirtualNodeLabels,
                            this.taints,
                            this.size,
                            this.placementConfigurations,
                            this.nsgIds,
                            this.podConfiguration,
                            this.freeformTags,
                            this.definedTags,
                            this.virtualNodeTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVirtualNodePoolDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("initialVirtualNodeLabels")) {
                this.initialVirtualNodeLabels(model.getInitialVirtualNodeLabels());
            }
            if (model.wasPropertyExplicitlySet("taints")) {
                this.taints(model.getTaints());
            }
            if (model.wasPropertyExplicitlySet("size")) {
                this.size(model.getSize());
            }
            if (model.wasPropertyExplicitlySet("placementConfigurations")) {
                this.placementConfigurations(model.getPlacementConfigurations());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("podConfiguration")) {
                this.podConfiguration(model.getPodConfiguration());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("virtualNodeTags")) {
                this.virtualNodeTags(model.getVirtualNodeTags());
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

    /** Compartment of the virtual node pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment of the virtual node pool.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The cluster the virtual node pool is associated with. A virtual node pool can only be
     * associated with one cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The cluster the virtual node pool is associated with. A virtual node pool can only be
     * associated with one cluster.
     *
     * @return the value
     */
    public String getClusterId() {
        return clusterId;
    }

    /** Display name of the virtual node pool. This is a non-unique value. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the virtual node pool. This is a non-unique value.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Initial labels that will be added to the Kubernetes Virtual Node object when it registers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialVirtualNodeLabels")
    private final java.util.List<InitialVirtualNodeLabel> initialVirtualNodeLabels;

    /**
     * Initial labels that will be added to the Kubernetes Virtual Node object when it registers.
     *
     * @return the value
     */
    public java.util.List<InitialVirtualNodeLabel> getInitialVirtualNodeLabels() {
        return initialVirtualNodeLabels;
    }

    /**
     * A taint is a collection of <key, value, effect>. These taints will be applied to the Virtual
     * Nodes of this Virtual Node Pool for Kubernetes scheduling.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("taints")
    private final java.util.List<Taint> taints;

    /**
     * A taint is a collection of <key, value, effect>. These taints will be applied to the Virtual
     * Nodes of this Virtual Node Pool for Kubernetes scheduling.
     *
     * @return the value
     */
    public java.util.List<Taint> getTaints() {
        return taints;
    }

    /**
     * The number of Virtual Nodes that should be in the Virtual Node Pool. The placement
     * configurations determine where these virtual nodes are placed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Integer size;

    /**
     * The number of Virtual Nodes that should be in the Virtual Node Pool. The placement
     * configurations determine where these virtual nodes are placed.
     *
     * @return the value
     */
    public Integer getSize() {
        return size;
    }

    /**
     * The list of placement configurations which determines where Virtual Nodes will be provisioned
     * across as it relates to the subnet and availability domains. The size attribute determines
     * how many we evenly spread across these placement configurations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("placementConfigurations")
    private final java.util.List<PlacementConfiguration> placementConfigurations;

    /**
     * The list of placement configurations which determines where Virtual Nodes will be provisioned
     * across as it relates to the subnet and availability domains. The size attribute determines
     * how many we evenly spread across these placement configurations
     *
     * @return the value
     */
    public java.util.List<PlacementConfiguration> getPlacementConfigurations() {
        return placementConfigurations;
    }

    /** List of network security group id's applied to the Virtual Node VNIC. */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * List of network security group id's applied to the Virtual Node VNIC.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /** The pod configuration for pods run on virtual nodes of this virtual node pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("podConfiguration")
    private final PodConfiguration podConfiguration;

    /**
     * The pod configuration for pods run on virtual nodes of this virtual node pool.
     *
     * @return the value
     */
    public PodConfiguration getPodConfiguration() {
        return podConfiguration;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
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
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("virtualNodeTags")
    private final VirtualNodeTags virtualNodeTags;

    public VirtualNodeTags getVirtualNodeTags() {
        return virtualNodeTags;
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
        sb.append("CreateVirtualNodePoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", initialVirtualNodeLabels=")
                .append(String.valueOf(this.initialVirtualNodeLabels));
        sb.append(", taints=").append(String.valueOf(this.taints));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", placementConfigurations=")
                .append(String.valueOf(this.placementConfigurations));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", podConfiguration=").append(String.valueOf(this.podConfiguration));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", virtualNodeTags=").append(String.valueOf(this.virtualNodeTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVirtualNodePoolDetails)) {
            return false;
        }

        CreateVirtualNodePoolDetails other = (CreateVirtualNodePoolDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.initialVirtualNodeLabels, other.initialVirtualNodeLabels)
                && java.util.Objects.equals(this.taints, other.taints)
                && java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(
                        this.placementConfigurations, other.placementConfigurations)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.podConfiguration, other.podConfiguration)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.virtualNodeTags, other.virtualNodeTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.initialVirtualNodeLabels == null
                                ? 43
                                : this.initialVirtualNodeLabels.hashCode());
        result = (result * PRIME) + (this.taints == null ? 43 : this.taints.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result =
                (result * PRIME)
                        + (this.placementConfigurations == null
                                ? 43
                                : this.placementConfigurations.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.podConfiguration == null ? 43 : this.podConfiguration.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualNodeTags == null ? 43 : this.virtualNodeTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
