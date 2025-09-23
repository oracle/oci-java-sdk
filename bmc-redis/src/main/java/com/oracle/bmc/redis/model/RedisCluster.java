/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * An OCI Cache cluster is a memory-based storage solution. For more information, see [OCI
 * Cache](https://docs.oracle.com/iaas/Content/ocicache/home.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RedisCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RedisCluster extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "lifecycleState",
        "lifecycleDetails",
        "nodeCount",
        "nodeMemoryInGBs",
        "primaryFqdn",
        "primaryEndpointIpAddress",
        "replicasFqdn",
        "replicasEndpointIpAddress",
        "discoveryFqdn",
        "discoveryEndpointIpAddress",
        "softwareVersion",
        "subnetId",
        "timeCreated",
        "timeUpdated",
        "nodeCollection",
        "ociCacheConfigSetId",
        "clusterMode",
        "shardCount",
        "nsgIds",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public RedisCluster(
            String id,
            String displayName,
            String compartmentId,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Integer nodeCount,
            Float nodeMemoryInGBs,
            String primaryFqdn,
            String primaryEndpointIpAddress,
            String replicasFqdn,
            String replicasEndpointIpAddress,
            String discoveryFqdn,
            String discoveryEndpointIpAddress,
            SoftwareVersion softwareVersion,
            String subnetId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            NodeCollection nodeCollection,
            String ociCacheConfigSetId,
            ClusterMode clusterMode,
            Integer shardCount,
            java.util.List<String> nsgIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.nodeCount = nodeCount;
        this.nodeMemoryInGBs = nodeMemoryInGBs;
        this.primaryFqdn = primaryFqdn;
        this.primaryEndpointIpAddress = primaryEndpointIpAddress;
        this.replicasFqdn = replicasFqdn;
        this.replicasEndpointIpAddress = replicasEndpointIpAddress;
        this.discoveryFqdn = discoveryFqdn;
        this.discoveryEndpointIpAddress = discoveryEndpointIpAddress;
        this.softwareVersion = softwareVersion;
        this.subnetId = subnetId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.nodeCollection = nodeCollection;
        this.ociCacheConfigSetId = ociCacheConfigSetId;
        this.clusterMode = clusterMode;
        this.shardCount = shardCount;
        this.nsgIds = nsgIds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the cluster.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the compartment that contains the cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the compartment that contains the cluster.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The current state of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the cluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, the message might
         * provide actionable information for a resource in {@code FAILED} state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, the message might
         * provide actionable information for a resource in {@code FAILED} state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The number of nodes per shard in the cluster when clusterMode is SHARDED. This is the
         * total number of nodes when clusterMode is NONSHARDED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes per shard in the cluster when clusterMode is SHARDED. This is the
         * total number of nodes when clusterMode is NONSHARDED.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** The amount of memory allocated to the cluster's nodes, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeMemoryInGBs")
        private Float nodeMemoryInGBs;

        /**
         * The amount of memory allocated to the cluster's nodes, in gigabytes.
         *
         * @param nodeMemoryInGBs the value to set
         * @return this builder
         */
        public Builder nodeMemoryInGBs(Float nodeMemoryInGBs) {
            this.nodeMemoryInGBs = nodeMemoryInGBs;
            this.__explicitlySet__.add("nodeMemoryInGBs");
            return this;
        }
        /**
         * The fully qualified domain name (FQDN) of the API endpoint for the cluster's primary
         * node.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryFqdn")
        private String primaryFqdn;

        /**
         * The fully qualified domain name (FQDN) of the API endpoint for the cluster's primary
         * node.
         *
         * @param primaryFqdn the value to set
         * @return this builder
         */
        public Builder primaryFqdn(String primaryFqdn) {
            this.primaryFqdn = primaryFqdn;
            this.__explicitlySet__.add("primaryFqdn");
            return this;
        }
        /** The private IP address of the API endpoint for the cluster's primary node. */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryEndpointIpAddress")
        private String primaryEndpointIpAddress;

        /**
         * The private IP address of the API endpoint for the cluster's primary node.
         *
         * @param primaryEndpointIpAddress the value to set
         * @return this builder
         */
        public Builder primaryEndpointIpAddress(String primaryEndpointIpAddress) {
            this.primaryEndpointIpAddress = primaryEndpointIpAddress;
            this.__explicitlySet__.add("primaryEndpointIpAddress");
            return this;
        }
        /**
         * The fully qualified domain name (FQDN) of the API endpoint for the cluster's replica
         * nodes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicasFqdn")
        private String replicasFqdn;

        /**
         * The fully qualified domain name (FQDN) of the API endpoint for the cluster's replica
         * nodes.
         *
         * @param replicasFqdn the value to set
         * @return this builder
         */
        public Builder replicasFqdn(String replicasFqdn) {
            this.replicasFqdn = replicasFqdn;
            this.__explicitlySet__.add("replicasFqdn");
            return this;
        }
        /** The private IP address of the API endpoint for the cluster's replica nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicasEndpointIpAddress")
        private String replicasEndpointIpAddress;

        /**
         * The private IP address of the API endpoint for the cluster's replica nodes.
         *
         * @param replicasEndpointIpAddress the value to set
         * @return this builder
         */
        public Builder replicasEndpointIpAddress(String replicasEndpointIpAddress) {
            this.replicasEndpointIpAddress = replicasEndpointIpAddress;
            this.__explicitlySet__.add("replicasEndpointIpAddress");
            return this;
        }
        /**
         * The fully qualified domain name (FQDN) of the API endpoint for sharded cluster discovery.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryFqdn")
        private String discoveryFqdn;

        /**
         * The fully qualified domain name (FQDN) of the API endpoint for sharded cluster discovery.
         *
         * @param discoveryFqdn the value to set
         * @return this builder
         */
        public Builder discoveryFqdn(String discoveryFqdn) {
            this.discoveryFqdn = discoveryFqdn;
            this.__explicitlySet__.add("discoveryFqdn");
            return this;
        }
        /** The private IP address of the API endpoint for sharded cluster discovery. */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryEndpointIpAddress")
        private String discoveryEndpointIpAddress;

        /**
         * The private IP address of the API endpoint for sharded cluster discovery.
         *
         * @param discoveryEndpointIpAddress the value to set
         * @return this builder
         */
        public Builder discoveryEndpointIpAddress(String discoveryEndpointIpAddress) {
            this.discoveryEndpointIpAddress = discoveryEndpointIpAddress;
            this.__explicitlySet__.add("discoveryEndpointIpAddress");
            return this;
        }
        /** The OCI Cache engine version that the cluster is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
        private SoftwareVersion softwareVersion;

        /**
         * The OCI Cache engine version that the cluster is running.
         *
         * @param softwareVersion the value to set
         * @return this builder
         */
        public Builder softwareVersion(SoftwareVersion softwareVersion) {
            this.softwareVersion = softwareVersion;
            this.__explicitlySet__.add("softwareVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the cluster's subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the cluster's subnet.
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
         * The date and time the cluster was created. An
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the cluster was created. An
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the cluster was updated. An
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the cluster was updated. An
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeCollection")
        private NodeCollection nodeCollection;

        public Builder nodeCollection(NodeCollection nodeCollection) {
            this.nodeCollection = nodeCollection;
            this.__explicitlySet__.add("nodeCollection");
            return this;
        }
        /** The ID of the corresponding OCI Cache Config Set for the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("ociCacheConfigSetId")
        private String ociCacheConfigSetId;

        /**
         * The ID of the corresponding OCI Cache Config Set for the cluster.
         *
         * @param ociCacheConfigSetId the value to set
         * @return this builder
         */
        public Builder ociCacheConfigSetId(String ociCacheConfigSetId) {
            this.ociCacheConfigSetId = ociCacheConfigSetId;
            this.__explicitlySet__.add("ociCacheConfigSetId");
            return this;
        }
        /** Specifies whether the cluster is sharded or non-sharded. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterMode")
        private ClusterMode clusterMode;

        /**
         * Specifies whether the cluster is sharded or non-sharded.
         *
         * @param clusterMode the value to set
         * @return this builder
         */
        public Builder clusterMode(ClusterMode clusterMode) {
            this.clusterMode = clusterMode;
            this.__explicitlySet__.add("clusterMode");
            return this;
        }
        /**
         * The number of shards in a sharded cluster. Only applicable when clusterMode is SHARDED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shardCount")
        private Integer shardCount;

        /**
         * The number of shards in a sharded cluster. Only applicable when clusterMode is SHARDED.
         *
         * @param shardCount the value to set
         * @return this builder
         */
        public Builder shardCount(Integer shardCount) {
            this.shardCount = shardCount;
            this.__explicitlySet__.add("shardCount");
            return this;
        }
        /**
         * A list of Network Security Group (NSG)
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this cluster. For more information, see [Using an NSG for
         * Clusters](https://docs.oracle.com/iaas/Content/ocicache/connecttocluster.htm#connecttocluster__networksecuritygroup).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of Network Security Group (NSG)
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with this cluster. For more information, see [Using an NSG for
         * Clusters](https://docs.oracle.com/iaas/Content/ocicache/connecttocluster.htm#connecttocluster__networksecuritygroup).
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RedisCluster build() {
            RedisCluster model =
                    new RedisCluster(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.nodeCount,
                            this.nodeMemoryInGBs,
                            this.primaryFqdn,
                            this.primaryEndpointIpAddress,
                            this.replicasFqdn,
                            this.replicasEndpointIpAddress,
                            this.discoveryFqdn,
                            this.discoveryEndpointIpAddress,
                            this.softwareVersion,
                            this.subnetId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.nodeCollection,
                            this.ociCacheConfigSetId,
                            this.clusterMode,
                            this.shardCount,
                            this.nsgIds,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RedisCluster model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("nodeMemoryInGBs")) {
                this.nodeMemoryInGBs(model.getNodeMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("primaryFqdn")) {
                this.primaryFqdn(model.getPrimaryFqdn());
            }
            if (model.wasPropertyExplicitlySet("primaryEndpointIpAddress")) {
                this.primaryEndpointIpAddress(model.getPrimaryEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("replicasFqdn")) {
                this.replicasFqdn(model.getReplicasFqdn());
            }
            if (model.wasPropertyExplicitlySet("replicasEndpointIpAddress")) {
                this.replicasEndpointIpAddress(model.getReplicasEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("discoveryFqdn")) {
                this.discoveryFqdn(model.getDiscoveryFqdn());
            }
            if (model.wasPropertyExplicitlySet("discoveryEndpointIpAddress")) {
                this.discoveryEndpointIpAddress(model.getDiscoveryEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("nodeCollection")) {
                this.nodeCollection(model.getNodeCollection());
            }
            if (model.wasPropertyExplicitlySet("ociCacheConfigSetId")) {
                this.ociCacheConfigSetId(model.getOciCacheConfigSetId());
            }
            if (model.wasPropertyExplicitlySet("clusterMode")) {
                this.clusterMode(model.getClusterMode());
            }
            if (model.wasPropertyExplicitlySet("shardCount")) {
                this.shardCount(model.getShardCount());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the cluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the compartment that contains the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the compartment that contains the cluster.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The current state of the cluster. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the cluster.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, the message might provide
     * actionable information for a resource in {@code FAILED} state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, the message might provide
     * actionable information for a resource in {@code FAILED} state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The number of nodes per shard in the cluster when clusterMode is SHARDED. This is the total
     * number of nodes when clusterMode is NONSHARDED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes per shard in the cluster when clusterMode is SHARDED. This is the total
     * number of nodes when clusterMode is NONSHARDED.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** The amount of memory allocated to the cluster's nodes, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeMemoryInGBs")
    private final Float nodeMemoryInGBs;

    /**
     * The amount of memory allocated to the cluster's nodes, in gigabytes.
     *
     * @return the value
     */
    public Float getNodeMemoryInGBs() {
        return nodeMemoryInGBs;
    }

    /**
     * The fully qualified domain name (FQDN) of the API endpoint for the cluster's primary node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryFqdn")
    private final String primaryFqdn;

    /**
     * The fully qualified domain name (FQDN) of the API endpoint for the cluster's primary node.
     *
     * @return the value
     */
    public String getPrimaryFqdn() {
        return primaryFqdn;
    }

    /** The private IP address of the API endpoint for the cluster's primary node. */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryEndpointIpAddress")
    private final String primaryEndpointIpAddress;

    /**
     * The private IP address of the API endpoint for the cluster's primary node.
     *
     * @return the value
     */
    public String getPrimaryEndpointIpAddress() {
        return primaryEndpointIpAddress;
    }

    /**
     * The fully qualified domain name (FQDN) of the API endpoint for the cluster's replica nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicasFqdn")
    private final String replicasFqdn;

    /**
     * The fully qualified domain name (FQDN) of the API endpoint for the cluster's replica nodes.
     *
     * @return the value
     */
    public String getReplicasFqdn() {
        return replicasFqdn;
    }

    /** The private IP address of the API endpoint for the cluster's replica nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicasEndpointIpAddress")
    private final String replicasEndpointIpAddress;

    /**
     * The private IP address of the API endpoint for the cluster's replica nodes.
     *
     * @return the value
     */
    public String getReplicasEndpointIpAddress() {
        return replicasEndpointIpAddress;
    }

    /** The fully qualified domain name (FQDN) of the API endpoint for sharded cluster discovery. */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryFqdn")
    private final String discoveryFqdn;

    /**
     * The fully qualified domain name (FQDN) of the API endpoint for sharded cluster discovery.
     *
     * @return the value
     */
    public String getDiscoveryFqdn() {
        return discoveryFqdn;
    }

    /** The private IP address of the API endpoint for sharded cluster discovery. */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryEndpointIpAddress")
    private final String discoveryEndpointIpAddress;

    /**
     * The private IP address of the API endpoint for sharded cluster discovery.
     *
     * @return the value
     */
    public String getDiscoveryEndpointIpAddress() {
        return discoveryEndpointIpAddress;
    }

    /** The OCI Cache engine version that the cluster is running. */
    public enum SoftwareVersion implements com.oracle.bmc.http.internal.BmcEnum {
        V705("V7_0_5"),
        Redis70("REDIS_7_0"),
        Valkey72("VALKEY_7_2"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SoftwareVersion.class);

        private final String value;
        private static java.util.Map<String, SoftwareVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (SoftwareVersion v : SoftwareVersion.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SoftwareVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SoftwareVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SoftwareVersion', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The OCI Cache engine version that the cluster is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
    private final SoftwareVersion softwareVersion;

    /**
     * The OCI Cache engine version that the cluster is running.
     *
     * @return the value
     */
    public SoftwareVersion getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the cluster's subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the cluster's subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The date and time the cluster was created. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the cluster was created. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the cluster was updated. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the cluster was updated. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nodeCollection")
    private final NodeCollection nodeCollection;

    public NodeCollection getNodeCollection() {
        return nodeCollection;
    }

    /** The ID of the corresponding OCI Cache Config Set for the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("ociCacheConfigSetId")
    private final String ociCacheConfigSetId;

    /**
     * The ID of the corresponding OCI Cache Config Set for the cluster.
     *
     * @return the value
     */
    public String getOciCacheConfigSetId() {
        return ociCacheConfigSetId;
    }

    /** Specifies whether the cluster is sharded or non-sharded. */
    public enum ClusterMode implements com.oracle.bmc.http.internal.BmcEnum {
        Sharded("SHARDED"),
        Nonsharded("NONSHARDED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ClusterMode.class);

        private final String value;
        private static java.util.Map<String, ClusterMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ClusterMode v : ClusterMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ClusterMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ClusterMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ClusterMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies whether the cluster is sharded or non-sharded. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterMode")
    private final ClusterMode clusterMode;

    /**
     * Specifies whether the cluster is sharded or non-sharded.
     *
     * @return the value
     */
    public ClusterMode getClusterMode() {
        return clusterMode;
    }

    /** The number of shards in a sharded cluster. Only applicable when clusterMode is SHARDED. */
    @com.fasterxml.jackson.annotation.JsonProperty("shardCount")
    private final Integer shardCount;

    /**
     * The number of shards in a sharded cluster. Only applicable when clusterMode is SHARDED.
     *
     * @return the value
     */
    public Integer getShardCount() {
        return shardCount;
    }

    /**
     * A list of Network Security Group (NSG)
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this cluster. For more information, see [Using an NSG for
     * Clusters](https://docs.oracle.com/iaas/Content/ocicache/connecttocluster.htm#connecttocluster__networksecuritygroup).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of Network Security Group (NSG)
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
     * with this cluster. For more information, see [Using an NSG for
     * Clusters](https://docs.oracle.com/iaas/Content/ocicache/connecttocluster.htm#connecttocluster__networksecuritygroup).
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("RedisCluster(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", nodeMemoryInGBs=").append(String.valueOf(this.nodeMemoryInGBs));
        sb.append(", primaryFqdn=").append(String.valueOf(this.primaryFqdn));
        sb.append(", primaryEndpointIpAddress=")
                .append(String.valueOf(this.primaryEndpointIpAddress));
        sb.append(", replicasFqdn=").append(String.valueOf(this.replicasFqdn));
        sb.append(", replicasEndpointIpAddress=")
                .append(String.valueOf(this.replicasEndpointIpAddress));
        sb.append(", discoveryFqdn=").append(String.valueOf(this.discoveryFqdn));
        sb.append(", discoveryEndpointIpAddress=")
                .append(String.valueOf(this.discoveryEndpointIpAddress));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", nodeCollection=").append(String.valueOf(this.nodeCollection));
        sb.append(", ociCacheConfigSetId=").append(String.valueOf(this.ociCacheConfigSetId));
        sb.append(", clusterMode=").append(String.valueOf(this.clusterMode));
        sb.append(", shardCount=").append(String.valueOf(this.shardCount));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
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
        if (!(o instanceof RedisCluster)) {
            return false;
        }

        RedisCluster other = (RedisCluster) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.nodeMemoryInGBs, other.nodeMemoryInGBs)
                && java.util.Objects.equals(this.primaryFqdn, other.primaryFqdn)
                && java.util.Objects.equals(
                        this.primaryEndpointIpAddress, other.primaryEndpointIpAddress)
                && java.util.Objects.equals(this.replicasFqdn, other.replicasFqdn)
                && java.util.Objects.equals(
                        this.replicasEndpointIpAddress, other.replicasEndpointIpAddress)
                && java.util.Objects.equals(this.discoveryFqdn, other.discoveryFqdn)
                && java.util.Objects.equals(
                        this.discoveryEndpointIpAddress, other.discoveryEndpointIpAddress)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.nodeCollection, other.nodeCollection)
                && java.util.Objects.equals(this.ociCacheConfigSetId, other.ociCacheConfigSetId)
                && java.util.Objects.equals(this.clusterMode, other.clusterMode)
                && java.util.Objects.equals(this.shardCount, other.shardCount)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeMemoryInGBs == null ? 43 : this.nodeMemoryInGBs.hashCode());
        result = (result * PRIME) + (this.primaryFqdn == null ? 43 : this.primaryFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryEndpointIpAddress == null
                                ? 43
                                : this.primaryEndpointIpAddress.hashCode());
        result = (result * PRIME) + (this.replicasFqdn == null ? 43 : this.replicasFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.replicasEndpointIpAddress == null
                                ? 43
                                : this.replicasEndpointIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryFqdn == null ? 43 : this.discoveryFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryEndpointIpAddress == null
                                ? 43
                                : this.discoveryEndpointIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeCollection == null ? 43 : this.nodeCollection.hashCode());
        result =
                (result * PRIME)
                        + (this.ociCacheConfigSetId == null
                                ? 43
                                : this.ociCacheConfigSetId.hashCode());
        result = (result * PRIME) + (this.clusterMode == null ? 43 : this.clusterMode.hashCode());
        result = (result * PRIME) + (this.shardCount == null ? 43 : this.shardCount.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
