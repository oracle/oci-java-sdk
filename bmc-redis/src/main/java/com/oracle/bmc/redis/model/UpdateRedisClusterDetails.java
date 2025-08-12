/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * The configuration to update for an existing cluster. <br>
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
        builder = UpdateRedisClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateRedisClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ociCacheConfigSetId",
        "shardCount",
        "displayName",
        "nodeCount",
        "nodeMemoryInGBs",
        "softwareVersion",
        "nsgIds",
        "freeformTags",
        "definedTags"
    })
    public UpdateRedisClusterDetails(
            String ociCacheConfigSetId,
            Integer shardCount,
            String displayName,
            Integer nodeCount,
            Float nodeMemoryInGBs,
            RedisCluster.SoftwareVersion softwareVersion,
            java.util.List<String> nsgIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.ociCacheConfigSetId = ociCacheConfigSetId;
        this.shardCount = shardCount;
        this.displayName = displayName;
        this.nodeCount = nodeCount;
        this.nodeMemoryInGBs = nodeMemoryInGBs;
        this.softwareVersion = softwareVersion;
        this.nsgIds = nsgIds;
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRedisClusterDetails build() {
            UpdateRedisClusterDetails model =
                    new UpdateRedisClusterDetails(
                            this.ociCacheConfigSetId,
                            this.shardCount,
                            this.displayName,
                            this.nodeCount,
                            this.nodeMemoryInGBs,
                            this.softwareVersion,
                            this.nsgIds,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRedisClusterDetails model) {
            if (model.wasPropertyExplicitlySet("ociCacheConfigSetId")) {
                this.ociCacheConfigSetId(model.getOciCacheConfigSetId());
            }
            if (model.wasPropertyExplicitlySet("shardCount")) {
                this.shardCount(model.getShardCount());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("nodeMemoryInGBs")) {
                this.nodeMemoryInGBs(model.getNodeMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
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
        sb.append("UpdateRedisClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ociCacheConfigSetId=").append(String.valueOf(this.ociCacheConfigSetId));
        sb.append(", shardCount=").append(String.valueOf(this.shardCount));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", nodeMemoryInGBs=").append(String.valueOf(this.nodeMemoryInGBs));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
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
        if (!(o instanceof UpdateRedisClusterDetails)) {
            return false;
        }

        UpdateRedisClusterDetails other = (UpdateRedisClusterDetails) o;
        return java.util.Objects.equals(this.ociCacheConfigSetId, other.ociCacheConfigSetId)
                && java.util.Objects.equals(this.shardCount, other.shardCount)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.nodeMemoryInGBs, other.nodeMemoryInGBs)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
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
        result = (result * PRIME) + (this.shardCount == null ? 43 : this.shardCount.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeMemoryInGBs == null ? 43 : this.nodeMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
