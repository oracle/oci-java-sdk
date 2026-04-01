/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about added block volumes.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddBlockStorageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddBlockStorageDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterAdminPassword",
        "secretId",
        "blockVolumeSizeInGBs",
        "nodeType",
        "nodeIds"
    })
    public AddBlockStorageDetails(
            String clusterAdminPassword,
            String secretId,
            Long blockVolumeSizeInGBs,
            NodeType nodeType,
            java.util.List<String> nodeIds) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.secretId = secretId;
        this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
        this.nodeType = nodeType;
        this.nodeIds = nodeIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         * @param clusterAdminPassword the value to set
         * @return this builder
         **/
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /**
         * The secretId for the clusterAdminPassword.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The secretId for the clusterAdminPassword.
         * @param secretId the value to set
         * @return this builder
         **/
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /**
         * The size of block volume in GB to be added. For WORKER, COMPUTE_ONLY_WORKER, and KAFKA_BROKER nodes,
         * the same size will be added to all nodes of that type. For EDGE nodes, this size can be different
         * per node when nodeId is specified. All the details needed for attaching the block volume are managed
         * by service itself.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
        private Long blockVolumeSizeInGBs;

        /**
         * The size of block volume in GB to be added. For WORKER, COMPUTE_ONLY_WORKER, and KAFKA_BROKER nodes,
         * the same size will be added to all nodes of that type. For EDGE nodes, this size can be different
         * per node when nodeId is specified. All the details needed for attaching the block volume are managed
         * by service itself.
         *
         * @param blockVolumeSizeInGBs the value to set
         * @return this builder
         **/
        public Builder blockVolumeSizeInGBs(Long blockVolumeSizeInGBs) {
            this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
            this.__explicitlySet__.add("blockVolumeSizeInGBs");
            return this;
        }
        /**
         * Worker node types.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private NodeType nodeType;

        /**
         * Worker node types.
         * @param nodeType the value to set
         * @return this builder
         **/
        public Builder nodeType(NodeType nodeType) {
            this.nodeType = nodeType;
            this.__explicitlySet__.add("nodeType");
            return this;
        }
        /**
         * Optional. List of OCIDs of specific nodes to add storage to.
         * Only supported for EDGE nodes.
         * When omitted, storage is added to all nodes of the specified type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeIds")
        private java.util.List<String> nodeIds;

        /**
         * Optional. List of OCIDs of specific nodes to add storage to.
         * Only supported for EDGE nodes.
         * When omitted, storage is added to all nodes of the specified type.
         *
         * @param nodeIds the value to set
         * @return this builder
         **/
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.nodeIds = nodeIds;
            this.__explicitlySet__.add("nodeIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddBlockStorageDetails build() {
            AddBlockStorageDetails model =
                    new AddBlockStorageDetails(
                            this.clusterAdminPassword,
                            this.secretId,
                            this.blockVolumeSizeInGBs,
                            this.nodeType,
                            this.nodeIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddBlockStorageDetails model) {
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("blockVolumeSizeInGBs")) {
                this.blockVolumeSizeInGBs(model.getBlockVolumeSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("nodeType")) {
                this.nodeType(model.getNodeType());
            }
            if (model.wasPropertyExplicitlySet("nodeIds")) {
                this.nodeIds(model.getNodeIds());
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
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     * @return the value
     **/
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /**
     * The secretId for the clusterAdminPassword.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The secretId for the clusterAdminPassword.
     * @return the value
     **/
    public String getSecretId() {
        return secretId;
    }

    /**
     * The size of block volume in GB to be added. For WORKER, COMPUTE_ONLY_WORKER, and KAFKA_BROKER nodes,
     * the same size will be added to all nodes of that type. For EDGE nodes, this size can be different
     * per node when nodeId is specified. All the details needed for attaching the block volume are managed
     * by service itself.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
    private final Long blockVolumeSizeInGBs;

    /**
     * The size of block volume in GB to be added. For WORKER, COMPUTE_ONLY_WORKER, and KAFKA_BROKER nodes,
     * the same size will be added to all nodes of that type. For EDGE nodes, this size can be different
     * per node when nodeId is specified. All the details needed for attaching the block volume are managed
     * by service itself.
     *
     * @return the value
     **/
    public Long getBlockVolumeSizeInGBs() {
        return blockVolumeSizeInGBs;
    }

    /**
     * Worker node types.
     **/
    public enum NodeType {
        Worker("WORKER"),
        ComputeOnlyWorker("COMPUTE_ONLY_WORKER"),
        KafkaBroker("KAFKA_BROKER"),
        Edge("EDGE"),
        ;

        private final String value;
        private static java.util.Map<String, NodeType> map;

        static {
            map = new java.util.HashMap<>();
            for (NodeType v : NodeType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid NodeType: " + key);
        }
    };
    /**
     * Worker node types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final NodeType nodeType;

    /**
     * Worker node types.
     * @return the value
     **/
    public NodeType getNodeType() {
        return nodeType;
    }

    /**
     * Optional. List of OCIDs of specific nodes to add storage to.
     * Only supported for EDGE nodes.
     * When omitted, storage is added to all nodes of the specified type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeIds")
    private final java.util.List<String> nodeIds;

    /**
     * Optional. List of OCIDs of specific nodes to add storage to.
     * Only supported for EDGE nodes.
     * When omitted, storage is added to all nodes of the specified type.
     *
     * @return the value
     **/
    public java.util.List<String> getNodeIds() {
        return nodeIds;
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
        sb.append("AddBlockStorageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterAdminPassword=").append("<redacted>");
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", blockVolumeSizeInGBs=").append(String.valueOf(this.blockVolumeSizeInGBs));
        sb.append(", nodeType=").append(String.valueOf(this.nodeType));
        sb.append(", nodeIds=").append(String.valueOf(this.nodeIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddBlockStorageDetails)) {
            return false;
        }

        AddBlockStorageDetails other = (AddBlockStorageDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.blockVolumeSizeInGBs, other.blockVolumeSizeInGBs)
                && java.util.Objects.equals(this.nodeType, other.nodeType)
                && java.util.Objects.equals(this.nodeIds, other.nodeIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeSizeInGBs == null
                                ? 43
                                : this.blockVolumeSizeInGBs.hashCode());
        result = (result * PRIME) + (this.nodeType == null ? 43 : this.nodeType.hashCode());
        result = (result * PRIME) + (this.nodeIds == null ? 43 : this.nodeIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
