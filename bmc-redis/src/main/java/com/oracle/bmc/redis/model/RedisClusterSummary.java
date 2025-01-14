/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * Summary of information about a cluster. A cluster is a memory-based storage solution. For more
 * information, see [OCI Cache](https://docs.cloud.oracle.com/iaas/Content/ocicache/home.htm). <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RedisClusterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RedisClusterSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "softwareVersion",
        "subnetId",
        "timeCreated",
        "timeUpdated",
        "clusterMode",
        "shardCount",
        "nsgIds",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public RedisClusterSummary(
            String id,
            String displayName,
            String compartmentId,
            RedisCluster.LifecycleState lifecycleState,
            String lifecycleDetails,
            Integer nodeCount,
            Float nodeMemoryInGBs,
            String primaryFqdn,
            String primaryEndpointIpAddress,
            String replicasFqdn,
            String replicasEndpointIpAddress,
            RedisCluster.SoftwareVersion softwareVersion,
            String subnetId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            RedisCluster.ClusterMode clusterMode,
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
        this.softwareVersion = softwareVersion;
        this.subnetId = subnetId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
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
         * The
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
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
         * The
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the compartment that contains the cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
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
        private RedisCluster.LifecycleState lifecycleState;

        /**
         * The current state of the cluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(RedisCluster.LifecycleState lifecycleState) {
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
        /** The OCI Cache engine version that the cluster is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
        private RedisCluster.SoftwareVersion softwareVersion;

        /**
         * The OCI Cache engine version that the cluster is running.
         *
         * @param softwareVersion the value to set
         * @return this builder
         */
        public Builder softwareVersion(RedisCluster.SoftwareVersion softwareVersion) {
            this.softwareVersion = softwareVersion;
            this.__explicitlySet__.add("softwareVersion");
            return this;
        }
        /**
         * The
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the cluster's subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
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
        /** Specifies whether the cluster is sharded or non-sharded. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterMode")
        private RedisCluster.ClusterMode clusterMode;

        /**
         * Specifies whether the cluster is sharded or non-sharded.
         *
         * @param clusterMode the value to set
         * @return this builder
         */
        public Builder clusterMode(RedisCluster.ClusterMode clusterMode) {
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
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * associated with this cluster. For more information, see [Using an NSG for
         * Clusters](https://docs.cloud.oracle.com/iaas/Content/ocicache/connecttocluster.htm#connecttocluster__networksecuritygroup).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of Network Security Group (NSG)
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * associated with this cluster. For more information, see [Using an NSG for
         * Clusters](https://docs.cloud.oracle.com/iaas/Content/ocicache/connecttocluster.htm#connecttocluster__networksecuritygroup).
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

        public RedisClusterSummary build() {
            RedisClusterSummary model =
                    new RedisClusterSummary(
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
                            this.softwareVersion,
                            this.subnetId,
                            this.timeCreated,
                            this.timeUpdated,
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
        public Builder copy(RedisClusterSummary model) {
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
     * The
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
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
     * The
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the compartment that contains the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the compartment that contains the cluster.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The current state of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final RedisCluster.LifecycleState lifecycleState;

    /**
     * The current state of the cluster.
     *
     * @return the value
     */
    public RedisCluster.LifecycleState getLifecycleState() {
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

    /** The OCI Cache engine version that the cluster is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
    private final RedisCluster.SoftwareVersion softwareVersion;

    /**
     * The OCI Cache engine version that the cluster is running.
     *
     * @return the value
     */
    public RedisCluster.SoftwareVersion getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * The
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the cluster's subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
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

    /** Specifies whether the cluster is sharded or non-sharded. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterMode")
    private final RedisCluster.ClusterMode clusterMode;

    /**
     * Specifies whether the cluster is sharded or non-sharded.
     *
     * @return the value
     */
    public RedisCluster.ClusterMode getClusterMode() {
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
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * associated with this cluster. For more information, see [Using an NSG for
     * Clusters](https://docs.cloud.oracle.com/iaas/Content/ocicache/connecttocluster.htm#connecttocluster__networksecuritygroup).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of Network Security Group (NSG)
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * associated with this cluster. For more information, see [Using an NSG for
     * Clusters](https://docs.cloud.oracle.com/iaas/Content/ocicache/connecttocluster.htm#connecttocluster__networksecuritygroup).
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
        sb.append("RedisClusterSummary(");
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
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof RedisClusterSummary)) {
            return false;
        }

        RedisClusterSummary other = (RedisClusterSummary) o;
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
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
