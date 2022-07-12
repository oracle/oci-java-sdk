/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * A Kubernetes cluster. Avoid entering confidential information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Cluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Cluster {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "compartmentId",
        "endpointConfig",
        "vcnId",
        "kubernetesVersion",
        "kmsKeyId",
        "freeformTags",
        "definedTags",
        "systemTags",
        "options",
        "metadata",
        "lifecycleState",
        "lifecycleDetails",
        "endpoints",
        "availableKubernetesUpgrades",
        "imagePolicyConfig",
        "clusterPodNetworkOptions"
    })
    public Cluster(
            String id,
            String name,
            String compartmentId,
            ClusterEndpointConfig endpointConfig,
            String vcnId,
            String kubernetesVersion,
            String kmsKeyId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            ClusterCreateOptions options,
            ClusterMetadata metadata,
            ClusterLifecycleState lifecycleState,
            String lifecycleDetails,
            ClusterEndpoints endpoints,
            java.util.List<String> availableKubernetesUpgrades,
            ImagePolicyConfig imagePolicyConfig,
            java.util.List<ClusterPodNetworkOptionDetails> clusterPodNetworkOptions) {
        super();
        this.id = id;
        this.name = name;
        this.compartmentId = compartmentId;
        this.endpointConfig = endpointConfig;
        this.vcnId = vcnId;
        this.kubernetesVersion = kubernetesVersion;
        this.kmsKeyId = kmsKeyId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.options = options;
        this.metadata = metadata;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.endpoints = endpoints;
        this.availableKubernetesUpgrades = availableKubernetesUpgrades;
        this.imagePolicyConfig = imagePolicyConfig;
        this.clusterPodNetworkOptions = clusterPodNetworkOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the cluster.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the cluster.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The OCID of the compartment in which the cluster exists.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment in which the cluster exists.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The network configuration for access to the Cluster control plane.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
        private ClusterEndpointConfig endpointConfig;

        /**
         * The network configuration for access to the Cluster control plane.
         *
         * @param endpointConfig the value to set
         * @return this builder
         **/
        public Builder endpointConfig(ClusterEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            this.__explicitlySet__.add("endpointConfig");
            return this;
        }
        /**
         * The OCID of the virtual cloud network (VCN) in which the cluster exists.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The OCID of the virtual cloud network (VCN) in which the cluster exists.
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The version of Kubernetes running on the cluster masters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        /**
         * The version of Kubernetes running on the cluster masters.
         * @param kubernetesVersion the value to set
         * @return this builder
         **/
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }
        /**
         * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption.
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
        /**
         * Optional attributes for the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private ClusterCreateOptions options;

        /**
         * Optional attributes for the cluster.
         * @param options the value to set
         * @return this builder
         **/
        public Builder options(ClusterCreateOptions options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }
        /**
         * Metadata about the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ClusterMetadata metadata;

        /**
         * Metadata about the cluster.
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(ClusterMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The state of the cluster masters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ClusterLifecycleState lifecycleState;

        /**
         * The state of the cluster masters.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ClusterLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details about the state of the cluster masters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the state of the cluster masters.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Endpoints served up by the cluster masters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private ClusterEndpoints endpoints;

        /**
         * Endpoints served up by the cluster masters.
         * @param endpoints the value to set
         * @return this builder
         **/
        public Builder endpoints(ClusterEndpoints endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
            return this;
        }
        /**
         * Available Kubernetes versions to which the clusters masters may be upgraded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableKubernetesUpgrades")
        private java.util.List<String> availableKubernetesUpgrades;

        /**
         * Available Kubernetes versions to which the clusters masters may be upgraded.
         * @param availableKubernetesUpgrades the value to set
         * @return this builder
         **/
        public Builder availableKubernetesUpgrades(
                java.util.List<String> availableKubernetesUpgrades) {
            this.availableKubernetesUpgrades = availableKubernetesUpgrades;
            this.__explicitlySet__.add("availableKubernetesUpgrades");
            return this;
        }
        /**
         * The image verification policy for signature validation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
        private ImagePolicyConfig imagePolicyConfig;

        /**
         * The image verification policy for signature validation.
         *
         * @param imagePolicyConfig the value to set
         * @return this builder
         **/
        public Builder imagePolicyConfig(ImagePolicyConfig imagePolicyConfig) {
            this.imagePolicyConfig = imagePolicyConfig;
            this.__explicitlySet__.add("imagePolicyConfig");
            return this;
        }
        /**
         * Available CNIs and network options for existing and new node pools of the cluster
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPodNetworkOptions")
        private java.util.List<ClusterPodNetworkOptionDetails> clusterPodNetworkOptions;

        /**
         * Available CNIs and network options for existing and new node pools of the cluster
         * @param clusterPodNetworkOptions the value to set
         * @return this builder
         **/
        public Builder clusterPodNetworkOptions(
                java.util.List<ClusterPodNetworkOptionDetails> clusterPodNetworkOptions) {
            this.clusterPodNetworkOptions = clusterPodNetworkOptions;
            this.__explicitlySet__.add("clusterPodNetworkOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Cluster build() {
            Cluster __instance__ =
                    new Cluster(
                            id,
                            name,
                            compartmentId,
                            endpointConfig,
                            vcnId,
                            kubernetesVersion,
                            kmsKeyId,
                            freeformTags,
                            definedTags,
                            systemTags,
                            options,
                            metadata,
                            lifecycleState,
                            lifecycleDetails,
                            endpoints,
                            availableKubernetesUpgrades,
                            imagePolicyConfig,
                            clusterPodNetworkOptions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Cluster o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .endpointConfig(o.getEndpointConfig())
                            .vcnId(o.getVcnId())
                            .kubernetesVersion(o.getKubernetesVersion())
                            .kmsKeyId(o.getKmsKeyId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .options(o.getOptions())
                            .metadata(o.getMetadata())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .endpoints(o.getEndpoints())
                            .availableKubernetesUpgrades(o.getAvailableKubernetesUpgrades())
                            .imagePolicyConfig(o.getImagePolicyConfig())
                            .clusterPodNetworkOptions(o.getClusterPodNetworkOptions());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The OCID of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the cluster.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the cluster.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The OCID of the compartment in which the cluster exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment in which the cluster exists.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The network configuration for access to the Cluster control plane.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
    private final ClusterEndpointConfig endpointConfig;

    /**
     * The network configuration for access to the Cluster control plane.
     *
     * @return the value
     **/
    public ClusterEndpointConfig getEndpointConfig() {
        return endpointConfig;
    }

    /**
     * The OCID of the virtual cloud network (VCN) in which the cluster exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The OCID of the virtual cloud network (VCN) in which the cluster exists.
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The version of Kubernetes running on the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    private final String kubernetesVersion;

    /**
     * The version of Kubernetes running on the cluster masters.
     * @return the value
     **/
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    /**
     * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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

    /**
     * Optional attributes for the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final ClusterCreateOptions options;

    /**
     * Optional attributes for the cluster.
     * @return the value
     **/
    public ClusterCreateOptions getOptions() {
        return options;
    }

    /**
     * Metadata about the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ClusterMetadata metadata;

    /**
     * Metadata about the cluster.
     * @return the value
     **/
    public ClusterMetadata getMetadata() {
        return metadata;
    }

    /**
     * The state of the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ClusterLifecycleState lifecycleState;

    /**
     * The state of the cluster masters.
     * @return the value
     **/
    public ClusterLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the state of the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the state of the cluster masters.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Endpoints served up by the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    private final ClusterEndpoints endpoints;

    /**
     * Endpoints served up by the cluster masters.
     * @return the value
     **/
    public ClusterEndpoints getEndpoints() {
        return endpoints;
    }

    /**
     * Available Kubernetes versions to which the clusters masters may be upgraded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableKubernetesUpgrades")
    private final java.util.List<String> availableKubernetesUpgrades;

    /**
     * Available Kubernetes versions to which the clusters masters may be upgraded.
     * @return the value
     **/
    public java.util.List<String> getAvailableKubernetesUpgrades() {
        return availableKubernetesUpgrades;
    }

    /**
     * The image verification policy for signature validation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
    private final ImagePolicyConfig imagePolicyConfig;

    /**
     * The image verification policy for signature validation.
     *
     * @return the value
     **/
    public ImagePolicyConfig getImagePolicyConfig() {
        return imagePolicyConfig;
    }

    /**
     * Available CNIs and network options for existing and new node pools of the cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPodNetworkOptions")
    private final java.util.List<ClusterPodNetworkOptionDetails> clusterPodNetworkOptions;

    /**
     * Available CNIs and network options for existing and new node pools of the cluster
     * @return the value
     **/
    public java.util.List<ClusterPodNetworkOptionDetails> getClusterPodNetworkOptions() {
        return clusterPodNetworkOptions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Cluster(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", endpointConfig=").append(String.valueOf(this.endpointConfig));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", kubernetesVersion=").append(String.valueOf(this.kubernetesVersion));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", endpoints=").append(String.valueOf(this.endpoints));
        sb.append(", availableKubernetesUpgrades=")
                .append(String.valueOf(this.availableKubernetesUpgrades));
        sb.append(", imagePolicyConfig=").append(String.valueOf(this.imagePolicyConfig));
        sb.append(", clusterPodNetworkOptions=")
                .append(String.valueOf(this.clusterPodNetworkOptions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cluster)) {
            return false;
        }

        Cluster other = (Cluster) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.endpointConfig, other.endpointConfig)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.kubernetesVersion, other.kubernetesVersion)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.endpoints, other.endpoints)
                && java.util.Objects.equals(
                        this.availableKubernetesUpgrades, other.availableKubernetesUpgrades)
                && java.util.Objects.equals(this.imagePolicyConfig, other.imagePolicyConfig)
                && java.util.Objects.equals(
                        this.clusterPodNetworkOptions, other.clusterPodNetworkOptions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.endpointConfig == null ? 43 : this.endpointConfig.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.kubernetesVersion == null ? 43 : this.kubernetesVersion.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.endpoints == null ? 43 : this.endpoints.hashCode());
        result =
                (result * PRIME)
                        + (this.availableKubernetesUpgrades == null
                                ? 43
                                : this.availableKubernetesUpgrades.hashCode());
        result =
                (result * PRIME)
                        + (this.imagePolicyConfig == null ? 43 : this.imagePolicyConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPodNetworkOptions == null
                                ? 43
                                : this.clusterPodNetworkOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
