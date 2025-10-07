/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * The configuration details for a new OCI Cache cluster. An OCI Cache cluster is a memory-based
 * storage solution. For more information, see [OCI
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateRedisClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateRedisClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ociCacheConfigSetId",
        "clusterMode",
        "shardCount",
        "displayName",
        "compartmentId",
        "nodeCount",
        "softwareVersion",
        "nodeMemoryInGBs",
        "subnetId",
        "nsgIds",
        "securityAttributes",
        "freeformTags",
        "definedTags"
    })
    public CreateRedisClusterDetails(
            String ociCacheConfigSetId,
            RedisCluster.ClusterMode clusterMode,
            Integer shardCount,
            String displayName,
            String compartmentId,
            Integer nodeCount,
            RedisCluster.SoftwareVersion softwareVersion,
            Float nodeMemoryInGBs,
            String subnetId,
            java.util.List<String> nsgIds,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.ociCacheConfigSetId = ociCacheConfigSetId;
        this.clusterMode = clusterMode;
        this.shardCount = shardCount;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.nodeCount = nodeCount;
        this.softwareVersion = softwareVersion;
        this.nodeMemoryInGBs = nodeMemoryInGBs;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.securityAttributes = securityAttributes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The number of shards in sharded cluster. Only applicable when clusterMode is SHARDED. */
        @com.fasterxml.jackson.annotation.JsonProperty("shardCount")
        private Integer shardCount;

        /**
         * The number of shards in sharded cluster. Only applicable when clusterMode is SHARDED.
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
         * Security attributes for redis cluster resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode":
         * "enforce"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security attributes for redis cluster resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode":
         * "enforce"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateRedisClusterDetails build() {
            CreateRedisClusterDetails model =
                    new CreateRedisClusterDetails(
                            this.ociCacheConfigSetId,
                            this.clusterMode,
                            this.shardCount,
                            this.displayName,
                            this.compartmentId,
                            this.nodeCount,
                            this.softwareVersion,
                            this.nodeMemoryInGBs,
                            this.subnetId,
                            this.nsgIds,
                            this.securityAttributes,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRedisClusterDetails model) {
            if (model.wasPropertyExplicitlySet("ociCacheConfigSetId")) {
                this.ociCacheConfigSetId(model.getOciCacheConfigSetId());
            }
            if (model.wasPropertyExplicitlySet("clusterMode")) {
                this.clusterMode(model.getClusterMode());
            }
            if (model.wasPropertyExplicitlySet("shardCount")) {
                this.shardCount(model.getShardCount());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("nodeMemoryInGBs")) {
                this.nodeMemoryInGBs(model.getNodeMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
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

    /** The number of shards in sharded cluster. Only applicable when clusterMode is SHARDED. */
    @com.fasterxml.jackson.annotation.JsonProperty("shardCount")
    private final Integer shardCount;

    /**
     * The number of shards in sharded cluster. Only applicable when clusterMode is SHARDED.
     *
     * @return the value
     */
    public Integer getShardCount() {
        return shardCount;
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
     * Security attributes for redis cluster resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security attributes for redis cluster resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
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
        sb.append("CreateRedisClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ociCacheConfigSetId=").append(String.valueOf(this.ociCacheConfigSetId));
        sb.append(", clusterMode=").append(String.valueOf(this.clusterMode));
        sb.append(", shardCount=").append(String.valueOf(this.shardCount));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", nodeMemoryInGBs=").append(String.valueOf(this.nodeMemoryInGBs));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
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
        if (!(o instanceof CreateRedisClusterDetails)) {
            return false;
        }

        CreateRedisClusterDetails other = (CreateRedisClusterDetails) o;
        return java.util.Objects.equals(this.ociCacheConfigSetId, other.ociCacheConfigSetId)
                && java.util.Objects.equals(this.clusterMode, other.clusterMode)
                && java.util.Objects.equals(this.shardCount, other.shardCount)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(this.nodeMemoryInGBs, other.nodeMemoryInGBs)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ociCacheConfigSetId == null
                                ? 43
                                : this.ociCacheConfigSetId.hashCode());
        result = (result * PRIME) + (this.clusterMode == null ? 43 : this.clusterMode.hashCode());
        result = (result * PRIME) + (this.shardCount == null ? 43 : this.shardCount.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeMemoryInGBs == null ? 43 : this.nodeMemoryInGBs.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
