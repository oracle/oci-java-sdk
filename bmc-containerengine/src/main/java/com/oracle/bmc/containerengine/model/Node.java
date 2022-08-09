/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a node.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Node.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Node extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "kubernetesVersion",
        "availabilityDomain",
        "subnetId",
        "nodePoolId",
        "faultDomain",
        "privateIp",
        "publicIp",
        "nodeError",
        "freeformTags",
        "definedTags",
        "systemTags",
        "lifecycleState",
        "lifecycleDetails"
    })
    public Node(
            String id,
            String name,
            String kubernetesVersion,
            String availabilityDomain,
            String subnetId,
            String nodePoolId,
            String faultDomain,
            String privateIp,
            String publicIp,
            NodeError nodeError,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            LifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.id = id;
        this.name = name;
        this.kubernetesVersion = kubernetesVersion;
        this.availabilityDomain = availabilityDomain;
        this.subnetId = subnetId;
        this.nodePoolId = nodePoolId;
        this.faultDomain = faultDomain;
        this.privateIp = privateIp;
        this.publicIp = publicIp;
        this.nodeError = nodeError;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compute instance backing this node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the compute instance backing this node.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the node.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The version of Kubernetes this node is running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        /**
         * The version of Kubernetes this node is running.
         * @param kubernetesVersion the value to set
         * @return this builder
         **/
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }
        /**
         * The name of the availability domain in which this node is placed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain in which this node is placed.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the subnet in which this node is placed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet in which this node is placed.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The OCID of the node pool to which this node belongs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodePoolId")
        private String nodePoolId;

        /**
         * The OCID of the node pool to which this node belongs.
         * @param nodePoolId the value to set
         * @return this builder
         **/
        public Builder nodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            this.__explicitlySet__.add("nodePoolId");
            return this;
        }
        /**
         * The fault domain of this node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain of this node.
         * @param faultDomain the value to set
         * @return this builder
         **/
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The private IP address of this node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * The private IP address of this node.
         * @param privateIp the value to set
         * @return this builder
         **/
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }
        /**
         * The public IP address of this node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
        private String publicIp;

        /**
         * The public IP address of this node.
         * @param publicIp the value to set
         * @return this builder
         **/
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            this.__explicitlySet__.add("publicIp");
            return this;
        }
        /**
         * An error that may be associated with the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeError")
        private NodeError nodeError;

        /**
         * An error that may be associated with the node.
         * @param nodeError the value to set
         * @return this builder
         **/
        public Builder nodeError(NodeError nodeError) {
            this.nodeError = nodeError;
            this.__explicitlySet__.add("nodeError");
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
         * The state of the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the node.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details about the state of the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the state of the node.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Node build() {
            Node model =
                    new Node(
                            this.id,
                            this.name,
                            this.kubernetesVersion,
                            this.availabilityDomain,
                            this.subnetId,
                            this.nodePoolId,
                            this.faultDomain,
                            this.privateIp,
                            this.publicIp,
                            this.nodeError,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Node model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("kubernetesVersion")) {
                this.kubernetesVersion(model.getKubernetesVersion());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nodePoolId")) {
                this.nodePoolId(model.getNodePoolId());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("publicIp")) {
                this.publicIp(model.getPublicIp());
            }
            if (model.wasPropertyExplicitlySet("nodeError")) {
                this.nodeError(model.getNodeError());
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
     * The OCID of the compute instance backing this node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the compute instance backing this node.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the node.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The version of Kubernetes this node is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    private final String kubernetesVersion;

    /**
     * The version of Kubernetes this node is running.
     * @return the value
     **/
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    /**
     * The name of the availability domain in which this node is placed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain in which this node is placed.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the subnet in which this node is placed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet in which this node is placed.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The OCID of the node pool to which this node belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodePoolId")
    private final String nodePoolId;

    /**
     * The OCID of the node pool to which this node belongs.
     * @return the value
     **/
    public String getNodePoolId() {
        return nodePoolId;
    }

    /**
     * The fault domain of this node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain of this node.
     * @return the value
     **/
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The private IP address of this node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * The private IP address of this node.
     * @return the value
     **/
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * The public IP address of this node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
    private final String publicIp;

    /**
     * The public IP address of this node.
     * @return the value
     **/
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * An error that may be associated with the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeError")
    private final NodeError nodeError;

    /**
     * An error that may be associated with the node.
     * @return the value
     **/
    public NodeError getNodeError() {
        return nodeError;
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
     * The state of the node.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failing("FAILING"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the node.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the state of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the state of the node.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("Node(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", kubernetesVersion=").append(String.valueOf(this.kubernetesVersion));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nodePoolId=").append(String.valueOf(this.nodePoolId));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", publicIp=").append(String.valueOf(this.publicIp));
        sb.append(", nodeError=").append(String.valueOf(this.nodeError));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }

        Node other = (Node) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.kubernetesVersion, other.kubernetesVersion)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nodePoolId, other.nodePoolId)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.publicIp, other.publicIp)
                && java.util.Objects.equals(this.nodeError, other.nodeError)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.kubernetesVersion == null ? 43 : this.kubernetesVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nodePoolId == null ? 43 : this.nodePoolId.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result = (result * PRIME) + (this.publicIp == null ? 43 : this.publicIp.hashCode());
        result = (result * PRIME) + (this.nodeError == null ? 43 : this.nodeError.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
