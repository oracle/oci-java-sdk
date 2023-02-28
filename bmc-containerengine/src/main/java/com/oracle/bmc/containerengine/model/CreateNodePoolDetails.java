/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to create a node pool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateNodePoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateNodePoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "clusterId",
        "name",
        "kubernetesVersion",
        "nodeMetadata",
        "nodeImageName",
        "nodeSourceDetails",
        "nodeShape",
        "nodeShapeConfig",
        "initialNodeLabels",
        "sshPublicKey",
        "quantityPerSubnet",
        "subnetIds",
        "nodeConfigDetails",
        "freeformTags",
        "definedTags",
        "nodeEvictionNodePoolSettings"
    })
    public CreateNodePoolDetails(
            String compartmentId,
            String clusterId,
            String name,
            String kubernetesVersion,
            java.util.Map<String, String> nodeMetadata,
            String nodeImageName,
            NodeSourceDetails nodeSourceDetails,
            String nodeShape,
            CreateNodeShapeConfigDetails nodeShapeConfig,
            java.util.List<KeyValue> initialNodeLabels,
            String sshPublicKey,
            Integer quantityPerSubnet,
            java.util.List<String> subnetIds,
            CreateNodePoolNodeConfigDetails nodeConfigDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            NodeEvictionNodePoolSettings nodeEvictionNodePoolSettings) {
        super();
        this.compartmentId = compartmentId;
        this.clusterId = clusterId;
        this.name = name;
        this.kubernetesVersion = kubernetesVersion;
        this.nodeMetadata = nodeMetadata;
        this.nodeImageName = nodeImageName;
        this.nodeSourceDetails = nodeSourceDetails;
        this.nodeShape = nodeShape;
        this.nodeShapeConfig = nodeShapeConfig;
        this.initialNodeLabels = initialNodeLabels;
        this.sshPublicKey = sshPublicKey;
        this.quantityPerSubnet = quantityPerSubnet;
        this.subnetIds = subnetIds;
        this.nodeConfigDetails = nodeConfigDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.nodeEvictionNodePoolSettings = nodeEvictionNodePoolSettings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment in which the node pool exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment in which the node pool exists.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the cluster to which this node pool is attached. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The OCID of the cluster to which this node pool is attached.
         *
         * @param clusterId the value to set
         * @return this builder
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /** The name of the node pool. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the node pool. Avoid entering confidential information.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The version of Kubernetes to install on the nodes in the node pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        /**
         * The version of Kubernetes to install on the nodes in the node pool.
         *
         * @param kubernetesVersion the value to set
         * @return this builder
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }
        /**
         * A list of key/value pairs to add to each underlying OCI instance in the node pool on
         * launch.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeMetadata")
        private java.util.Map<String, String> nodeMetadata;

        /**
         * A list of key/value pairs to add to each underlying OCI instance in the node pool on
         * launch.
         *
         * @param nodeMetadata the value to set
         * @return this builder
         */
        public Builder nodeMetadata(java.util.Map<String, String> nodeMetadata) {
            this.nodeMetadata = nodeMetadata;
            this.__explicitlySet__.add("nodeMetadata");
            return this;
        }
        /**
         * Deprecated. Use {@code nodeSourceDetails} instead. If you specify values for both, this
         * value is ignored. The name of the image running on the nodes in the node pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeImageName")
        private String nodeImageName;

        /**
         * Deprecated. Use {@code nodeSourceDetails} instead. If you specify values for both, this
         * value is ignored. The name of the image running on the nodes in the node pool.
         *
         * @param nodeImageName the value to set
         * @return this builder
         */
        public Builder nodeImageName(String nodeImageName) {
            this.nodeImageName = nodeImageName;
            this.__explicitlySet__.add("nodeImageName");
            return this;
        }
        /**
         * Specify the source to use to launch nodes in the node pool. Currently, image is the only
         * supported source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeSourceDetails")
        private NodeSourceDetails nodeSourceDetails;

        /**
         * Specify the source to use to launch nodes in the node pool. Currently, image is the only
         * supported source.
         *
         * @param nodeSourceDetails the value to set
         * @return this builder
         */
        public Builder nodeSourceDetails(NodeSourceDetails nodeSourceDetails) {
            this.nodeSourceDetails = nodeSourceDetails;
            this.__explicitlySet__.add("nodeSourceDetails");
            return this;
        }
        /** The name of the node shape of the nodes in the node pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeShape")
        private String nodeShape;

        /**
         * The name of the node shape of the nodes in the node pool.
         *
         * @param nodeShape the value to set
         * @return this builder
         */
        public Builder nodeShape(String nodeShape) {
            this.nodeShape = nodeShape;
            this.__explicitlySet__.add("nodeShape");
            return this;
        }
        /** Specify the configuration of the shape to launch nodes in the node pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeShapeConfig")
        private CreateNodeShapeConfigDetails nodeShapeConfig;

        /**
         * Specify the configuration of the shape to launch nodes in the node pool.
         *
         * @param nodeShapeConfig the value to set
         * @return this builder
         */
        public Builder nodeShapeConfig(CreateNodeShapeConfigDetails nodeShapeConfig) {
            this.nodeShapeConfig = nodeShapeConfig;
            this.__explicitlySet__.add("nodeShapeConfig");
            return this;
        }
        /** A list of key/value pairs to add to nodes after they join the Kubernetes cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("initialNodeLabels")
        private java.util.List<KeyValue> initialNodeLabels;

        /**
         * A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
         *
         * @param initialNodeLabels the value to set
         * @return this builder
         */
        public Builder initialNodeLabels(java.util.List<KeyValue> initialNodeLabels) {
            this.initialNodeLabels = initialNodeLabels;
            this.__explicitlySet__.add("initialNodeLabels");
            return this;
        }
        /** The SSH public key on each node in the node pool on launch. */
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKey")
        private String sshPublicKey;

        /**
         * The SSH public key on each node in the node pool on launch.
         *
         * @param sshPublicKey the value to set
         * @return this builder
         */
        public Builder sshPublicKey(String sshPublicKey) {
            this.sshPublicKey = sshPublicKey;
            this.__explicitlySet__.add("sshPublicKey");
            return this;
        }
        /**
         * Optional, default to 1. The number of nodes to create in each subnet specified in
         * subnetIds property. When used, subnetIds is required. This property is deprecated, use
         * nodeConfigDetails instead.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("quantityPerSubnet")
        private Integer quantityPerSubnet;

        /**
         * Optional, default to 1. The number of nodes to create in each subnet specified in
         * subnetIds property. When used, subnetIds is required. This property is deprecated, use
         * nodeConfigDetails instead.
         *
         * @param quantityPerSubnet the value to set
         * @return this builder
         */
        public Builder quantityPerSubnet(Integer quantityPerSubnet) {
            this.quantityPerSubnet = quantityPerSubnet;
            this.__explicitlySet__.add("quantityPerSubnet");
            return this;
        }
        /**
         * The OCIDs of the subnets in which to place nodes for this node pool. When used,
         * quantityPerSubnet can be provided. This property is deprecated, use nodeConfigDetails.
         * Exactly one of the subnetIds or nodeConfigDetails properties must be specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        /**
         * The OCIDs of the subnets in which to place nodes for this node pool. When used,
         * quantityPerSubnet can be provided. This property is deprecated, use nodeConfigDetails.
         * Exactly one of the subnetIds or nodeConfigDetails properties must be specified.
         *
         * @param subnetIds the value to set
         * @return this builder
         */
        public Builder subnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            this.__explicitlySet__.add("subnetIds");
            return this;
        }
        /**
         * The configuration of nodes in the node pool. Exactly one of the subnetIds or
         * nodeConfigDetails properties must be specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeConfigDetails")
        private CreateNodePoolNodeConfigDetails nodeConfigDetails;

        /**
         * The configuration of nodes in the node pool. Exactly one of the subnetIds or
         * nodeConfigDetails properties must be specified.
         *
         * @param nodeConfigDetails the value to set
         * @return this builder
         */
        public Builder nodeConfigDetails(CreateNodePoolNodeConfigDetails nodeConfigDetails) {
            this.nodeConfigDetails = nodeConfigDetails;
            this.__explicitlySet__.add("nodeConfigDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("nodeEvictionNodePoolSettings")
        private NodeEvictionNodePoolSettings nodeEvictionNodePoolSettings;

        public Builder nodeEvictionNodePoolSettings(
                NodeEvictionNodePoolSettings nodeEvictionNodePoolSettings) {
            this.nodeEvictionNodePoolSettings = nodeEvictionNodePoolSettings;
            this.__explicitlySet__.add("nodeEvictionNodePoolSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNodePoolDetails build() {
            CreateNodePoolDetails model =
                    new CreateNodePoolDetails(
                            this.compartmentId,
                            this.clusterId,
                            this.name,
                            this.kubernetesVersion,
                            this.nodeMetadata,
                            this.nodeImageName,
                            this.nodeSourceDetails,
                            this.nodeShape,
                            this.nodeShapeConfig,
                            this.initialNodeLabels,
                            this.sshPublicKey,
                            this.quantityPerSubnet,
                            this.subnetIds,
                            this.nodeConfigDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.nodeEvictionNodePoolSettings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNodePoolDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("kubernetesVersion")) {
                this.kubernetesVersion(model.getKubernetesVersion());
            }
            if (model.wasPropertyExplicitlySet("nodeMetadata")) {
                this.nodeMetadata(model.getNodeMetadata());
            }
            if (model.wasPropertyExplicitlySet("nodeImageName")) {
                this.nodeImageName(model.getNodeImageName());
            }
            if (model.wasPropertyExplicitlySet("nodeSourceDetails")) {
                this.nodeSourceDetails(model.getNodeSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("nodeShape")) {
                this.nodeShape(model.getNodeShape());
            }
            if (model.wasPropertyExplicitlySet("nodeShapeConfig")) {
                this.nodeShapeConfig(model.getNodeShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("initialNodeLabels")) {
                this.initialNodeLabels(model.getInitialNodeLabels());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKey")) {
                this.sshPublicKey(model.getSshPublicKey());
            }
            if (model.wasPropertyExplicitlySet("quantityPerSubnet")) {
                this.quantityPerSubnet(model.getQuantityPerSubnet());
            }
            if (model.wasPropertyExplicitlySet("subnetIds")) {
                this.subnetIds(model.getSubnetIds());
            }
            if (model.wasPropertyExplicitlySet("nodeConfigDetails")) {
                this.nodeConfigDetails(model.getNodeConfigDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("nodeEvictionNodePoolSettings")) {
                this.nodeEvictionNodePoolSettings(model.getNodeEvictionNodePoolSettings());
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

    /** The OCID of the compartment in which the node pool exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment in which the node pool exists.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the cluster to which this node pool is attached. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The OCID of the cluster to which this node pool is attached.
     *
     * @return the value
     */
    public String getClusterId() {
        return clusterId;
    }

    /** The name of the node pool. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the node pool. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The version of Kubernetes to install on the nodes in the node pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    private final String kubernetesVersion;

    /**
     * The version of Kubernetes to install on the nodes in the node pool.
     *
     * @return the value
     */
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    /**
     * A list of key/value pairs to add to each underlying OCI instance in the node pool on launch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeMetadata")
    private final java.util.Map<String, String> nodeMetadata;

    /**
     * A list of key/value pairs to add to each underlying OCI instance in the node pool on launch.
     *
     * @return the value
     */
    public java.util.Map<String, String> getNodeMetadata() {
        return nodeMetadata;
    }

    /**
     * Deprecated. Use {@code nodeSourceDetails} instead. If you specify values for both, this value
     * is ignored. The name of the image running on the nodes in the node pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeImageName")
    private final String nodeImageName;

    /**
     * Deprecated. Use {@code nodeSourceDetails} instead. If you specify values for both, this value
     * is ignored. The name of the image running on the nodes in the node pool.
     *
     * @return the value
     */
    public String getNodeImageName() {
        return nodeImageName;
    }

    /**
     * Specify the source to use to launch nodes in the node pool. Currently, image is the only
     * supported source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSourceDetails")
    private final NodeSourceDetails nodeSourceDetails;

    /**
     * Specify the source to use to launch nodes in the node pool. Currently, image is the only
     * supported source.
     *
     * @return the value
     */
    public NodeSourceDetails getNodeSourceDetails() {
        return nodeSourceDetails;
    }

    /** The name of the node shape of the nodes in the node pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeShape")
    private final String nodeShape;

    /**
     * The name of the node shape of the nodes in the node pool.
     *
     * @return the value
     */
    public String getNodeShape() {
        return nodeShape;
    }

    /** Specify the configuration of the shape to launch nodes in the node pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeShapeConfig")
    private final CreateNodeShapeConfigDetails nodeShapeConfig;

    /**
     * Specify the configuration of the shape to launch nodes in the node pool.
     *
     * @return the value
     */
    public CreateNodeShapeConfigDetails getNodeShapeConfig() {
        return nodeShapeConfig;
    }

    /** A list of key/value pairs to add to nodes after they join the Kubernetes cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("initialNodeLabels")
    private final java.util.List<KeyValue> initialNodeLabels;

    /**
     * A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
     *
     * @return the value
     */
    public java.util.List<KeyValue> getInitialNodeLabels() {
        return initialNodeLabels;
    }

    /** The SSH public key on each node in the node pool on launch. */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKey")
    private final String sshPublicKey;

    /**
     * The SSH public key on each node in the node pool on launch.
     *
     * @return the value
     */
    public String getSshPublicKey() {
        return sshPublicKey;
    }

    /**
     * Optional, default to 1. The number of nodes to create in each subnet specified in subnetIds
     * property. When used, subnetIds is required. This property is deprecated, use
     * nodeConfigDetails instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantityPerSubnet")
    private final Integer quantityPerSubnet;

    /**
     * Optional, default to 1. The number of nodes to create in each subnet specified in subnetIds
     * property. When used, subnetIds is required. This property is deprecated, use
     * nodeConfigDetails instead.
     *
     * @return the value
     */
    public Integer getQuantityPerSubnet() {
        return quantityPerSubnet;
    }

    /**
     * The OCIDs of the subnets in which to place nodes for this node pool. When used,
     * quantityPerSubnet can be provided. This property is deprecated, use nodeConfigDetails.
     * Exactly one of the subnetIds or nodeConfigDetails properties must be specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    private final java.util.List<String> subnetIds;

    /**
     * The OCIDs of the subnets in which to place nodes for this node pool. When used,
     * quantityPerSubnet can be provided. This property is deprecated, use nodeConfigDetails.
     * Exactly one of the subnetIds or nodeConfigDetails properties must be specified.
     *
     * @return the value
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * The configuration of nodes in the node pool. Exactly one of the subnetIds or
     * nodeConfigDetails properties must be specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeConfigDetails")
    private final CreateNodePoolNodeConfigDetails nodeConfigDetails;

    /**
     * The configuration of nodes in the node pool. Exactly one of the subnetIds or
     * nodeConfigDetails properties must be specified.
     *
     * @return the value
     */
    public CreateNodePoolNodeConfigDetails getNodeConfigDetails() {
        return nodeConfigDetails;
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

    @com.fasterxml.jackson.annotation.JsonProperty("nodeEvictionNodePoolSettings")
    private final NodeEvictionNodePoolSettings nodeEvictionNodePoolSettings;

    public NodeEvictionNodePoolSettings getNodeEvictionNodePoolSettings() {
        return nodeEvictionNodePoolSettings;
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
        sb.append("CreateNodePoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", kubernetesVersion=").append(String.valueOf(this.kubernetesVersion));
        sb.append(", nodeMetadata=").append(String.valueOf(this.nodeMetadata));
        sb.append(", nodeImageName=").append(String.valueOf(this.nodeImageName));
        sb.append(", nodeSourceDetails=").append(String.valueOf(this.nodeSourceDetails));
        sb.append(", nodeShape=").append(String.valueOf(this.nodeShape));
        sb.append(", nodeShapeConfig=").append(String.valueOf(this.nodeShapeConfig));
        sb.append(", initialNodeLabels=").append(String.valueOf(this.initialNodeLabels));
        sb.append(", sshPublicKey=").append(String.valueOf(this.sshPublicKey));
        sb.append(", quantityPerSubnet=").append(String.valueOf(this.quantityPerSubnet));
        sb.append(", subnetIds=").append(String.valueOf(this.subnetIds));
        sb.append(", nodeConfigDetails=").append(String.valueOf(this.nodeConfigDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", nodeEvictionNodePoolSettings=")
                .append(String.valueOf(this.nodeEvictionNodePoolSettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNodePoolDetails)) {
            return false;
        }

        CreateNodePoolDetails other = (CreateNodePoolDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.kubernetesVersion, other.kubernetesVersion)
                && java.util.Objects.equals(this.nodeMetadata, other.nodeMetadata)
                && java.util.Objects.equals(this.nodeImageName, other.nodeImageName)
                && java.util.Objects.equals(this.nodeSourceDetails, other.nodeSourceDetails)
                && java.util.Objects.equals(this.nodeShape, other.nodeShape)
                && java.util.Objects.equals(this.nodeShapeConfig, other.nodeShapeConfig)
                && java.util.Objects.equals(this.initialNodeLabels, other.initialNodeLabels)
                && java.util.Objects.equals(this.sshPublicKey, other.sshPublicKey)
                && java.util.Objects.equals(this.quantityPerSubnet, other.quantityPerSubnet)
                && java.util.Objects.equals(this.subnetIds, other.subnetIds)
                && java.util.Objects.equals(this.nodeConfigDetails, other.nodeConfigDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.nodeEvictionNodePoolSettings, other.nodeEvictionNodePoolSettings)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.kubernetesVersion == null ? 43 : this.kubernetesVersion.hashCode());
        result = (result * PRIME) + (this.nodeMetadata == null ? 43 : this.nodeMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeImageName == null ? 43 : this.nodeImageName.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeSourceDetails == null ? 43 : this.nodeSourceDetails.hashCode());
        result = (result * PRIME) + (this.nodeShape == null ? 43 : this.nodeShape.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeShapeConfig == null ? 43 : this.nodeShapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.initialNodeLabels == null ? 43 : this.initialNodeLabels.hashCode());
        result = (result * PRIME) + (this.sshPublicKey == null ? 43 : this.sshPublicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.quantityPerSubnet == null ? 43 : this.quantityPerSubnet.hashCode());
        result = (result * PRIME) + (this.subnetIds == null ? 43 : this.subnetIds.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeConfigDetails == null ? 43 : this.nodeConfigDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeEvictionNodePoolSettings == null
                                ? 43
                                : this.nodeEvictionNodePoolSettings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
