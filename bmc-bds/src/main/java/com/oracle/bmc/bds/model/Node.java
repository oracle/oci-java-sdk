/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details about a node.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Node.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Node {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "displayName",
        "lifecycleState",
        "nodeType",
        "shape",
        "attachedBlockVolumes",
        "subnetId",
        "ipAddress",
        "hostname",
        "imageId",
        "sshFingerprint",
        "availabilityDomain",
        "faultDomain",
        "timeCreated",
        "timeUpdated",
        "ocpus",
        "memoryInGBs"
    })
    public Node(
            String instanceId,
            String displayName,
            LifecycleState lifecycleState,
            NodeType nodeType,
            String shape,
            java.util.List<VolumeAttachmentDetail> attachedBlockVolumes,
            String subnetId,
            String ipAddress,
            String hostname,
            String imageId,
            String sshFingerprint,
            String availabilityDomain,
            String faultDomain,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Integer ocpus,
            Integer memoryInGBs) {
        super();
        this.instanceId = instanceId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.nodeType = nodeType;
        this.shape = shape;
        this.attachedBlockVolumes = attachedBlockVolumes;
        this.subnetId = subnetId;
        this.ipAddress = ipAddress;
        this.hostname = hostname;
        this.imageId = imageId;
        this.sshFingerprint = sshFingerprint;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the underlying Oracle Cloud Infrastructure Compute instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The OCID of the underlying Oracle Cloud Infrastructure Compute instance.
         * @param instanceId the value to set
         * @return this builder
         **/
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * The name of the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the node.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
         * Cluster node type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private NodeType nodeType;

        /**
         * Cluster node type.
         * @param nodeType the value to set
         * @return this builder
         **/
        public Builder nodeType(NodeType nodeType) {
            this.nodeType = nodeType;
            this.__explicitlySet__.add("nodeType");
            return this;
        }
        /**
         * Shape of the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Shape of the node.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The list of block volumes attached to a given node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attachedBlockVolumes")
        private java.util.List<VolumeAttachmentDetail> attachedBlockVolumes;

        /**
         * The list of block volumes attached to a given node.
         * @param attachedBlockVolumes the value to set
         * @return this builder
         **/
        public Builder attachedBlockVolumes(
                java.util.List<VolumeAttachmentDetail> attachedBlockVolumes) {
            this.attachedBlockVolumes = attachedBlockVolumes;
            this.__explicitlySet__.add("attachedBlockVolumes");
            return this;
        }
        /**
         * The OCID of the subnet in which the node is to be created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet in which the node is to be created.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * IP address of the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * IP address of the node.
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The fully-qualified hostname (FQDN) of the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The fully-qualified hostname (FQDN) of the node.
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * The OCID of the image from which the node was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The OCID of the image from which the node was created.
         * @param imageId the value to set
         * @return this builder
         **/
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /**
         * The fingerprint of the SSH key used for node access.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshFingerprint")
        private String sshFingerprint;

        /**
         * The fingerprint of the SSH key used for node access.
         * @param sshFingerprint the value to set
         * @return this builder
         **/
        public Builder sshFingerprint(String sshFingerprint) {
            this.sshFingerprint = sshFingerprint;
            this.__explicitlySet__.add("sshFingerprint");
            return this;
        }
        /**
         * The name of the availability domain in which the node is running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain in which the node is running.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The name of the fault domain in which the node is running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The name of the fault domain in which the node is running.
         * @param faultDomain the value to set
         * @return this builder
         **/
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The time the node was created, shown as an RFC 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the node was created, shown as an RFC 3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the cluster was updated, shown as an RFC 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the cluster was updated, shown as an RFC 3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The total number of OCPUs available to the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Integer ocpus;

        /**
         * The total number of OCPUs available to the node.
         * @param ocpus the value to set
         * @return this builder
         **/
        public Builder ocpus(Integer ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /**
         * The total amount of memory available to the node, in gigabytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Integer memoryInGBs;

        /**
         * The total amount of memory available to the node, in gigabytes.
         * @param memoryInGBs the value to set
         * @return this builder
         **/
        public Builder memoryInGBs(Integer memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Node build() {
            Node __instance__ =
                    new Node(
                            instanceId,
                            displayName,
                            lifecycleState,
                            nodeType,
                            shape,
                            attachedBlockVolumes,
                            subnetId,
                            ipAddress,
                            hostname,
                            imageId,
                            sshFingerprint,
                            availabilityDomain,
                            faultDomain,
                            timeCreated,
                            timeUpdated,
                            ocpus,
                            memoryInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Node o) {
            Builder copiedBuilder =
                    instanceId(o.getInstanceId())
                            .displayName(o.getDisplayName())
                            .lifecycleState(o.getLifecycleState())
                            .nodeType(o.getNodeType())
                            .shape(o.getShape())
                            .attachedBlockVolumes(o.getAttachedBlockVolumes())
                            .subnetId(o.getSubnetId())
                            .ipAddress(o.getIpAddress())
                            .hostname(o.getHostname())
                            .imageId(o.getImageId())
                            .sshFingerprint(o.getSshFingerprint())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .faultDomain(o.getFaultDomain())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .ocpus(o.getOcpus())
                            .memoryInGBs(o.getMemoryInGBs());

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
     * The OCID of the underlying Oracle Cloud Infrastructure Compute instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The OCID of the underlying Oracle Cloud Infrastructure Compute instance.
     * @return the value
     **/
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * The name of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the node.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The state of the node.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
     * Cluster node type.
     **/
    public enum NodeType {
        Master("MASTER"),
        Edge("EDGE"),
        Utility("UTILITY"),
        Worker("WORKER"),
        ComputeOnlyWorker("COMPUTE_ONLY_WORKER"),
        Bursting("BURSTING"),
        CloudSql("CLOUD_SQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NodeType.class);

        private final String value;
        private static java.util.Map<String, NodeType> map;

        static {
            map = new java.util.HashMap<>();
            for (NodeType v : NodeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NodeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NodeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NodeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Cluster node type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final NodeType nodeType;

    /**
     * Cluster node type.
     * @return the value
     **/
    public NodeType getNodeType() {
        return nodeType;
    }

    /**
     * Shape of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Shape of the node.
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * The list of block volumes attached to a given node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachedBlockVolumes")
    private final java.util.List<VolumeAttachmentDetail> attachedBlockVolumes;

    /**
     * The list of block volumes attached to a given node.
     * @return the value
     **/
    public java.util.List<VolumeAttachmentDetail> getAttachedBlockVolumes() {
        return attachedBlockVolumes;
    }

    /**
     * The OCID of the subnet in which the node is to be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet in which the node is to be created.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * IP address of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * IP address of the node.
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The fully-qualified hostname (FQDN) of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The fully-qualified hostname (FQDN) of the node.
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * The OCID of the image from which the node was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The OCID of the image from which the node was created.
     * @return the value
     **/
    public String getImageId() {
        return imageId;
    }

    /**
     * The fingerprint of the SSH key used for node access.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshFingerprint")
    private final String sshFingerprint;

    /**
     * The fingerprint of the SSH key used for node access.
     * @return the value
     **/
    public String getSshFingerprint() {
        return sshFingerprint;
    }

    /**
     * The name of the availability domain in which the node is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain in which the node is running.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The name of the fault domain in which the node is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The name of the fault domain in which the node is running.
     * @return the value
     **/
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The time the node was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the node was created, shown as an RFC 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the cluster was updated, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the cluster was updated, shown as an RFC 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The total number of OCPUs available to the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Integer ocpus;

    /**
     * The total number of OCPUs available to the node.
     * @return the value
     **/
    public Integer getOcpus() {
        return ocpus;
    }

    /**
     * The total amount of memory available to the node, in gigabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Integer memoryInGBs;

    /**
     * The total amount of memory available to the node, in gigabytes.
     * @return the value
     **/
    public Integer getMemoryInGBs() {
        return memoryInGBs;
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
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", nodeType=").append(String.valueOf(this.nodeType));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", attachedBlockVolumes=").append(String.valueOf(this.attachedBlockVolumes));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", sshFingerprint=").append(String.valueOf(this.sshFingerprint));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.nodeType, other.nodeType)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.attachedBlockVolumes, other.attachedBlockVolumes)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.sshFingerprint, other.sshFingerprint)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.nodeType == null ? 43 : this.nodeType.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.attachedBlockVolumes == null
                                ? 43
                                : this.attachedBlockVolumes.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result =
                (result * PRIME)
                        + (this.sshFingerprint == null ? 43 : this.sshFingerprint.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
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
