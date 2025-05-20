/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Globally distributed autonomous database shard with dedicated autonomous infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DistributedAutonomousDatabaseShardWithDedicatedInfra.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedAutonomousDatabaseShardWithDedicatedInfra
        extends DistributedAutonomousDatabaseShard {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The compute count for the shard database. It has to be in multiples of 2. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Float computeCount;

        /**
         * The compute count for the shard database. It has to be in multiples of 2.
         *
         * @param computeCount the value to set
         * @return this builder
         */
        public Builder computeCount(Float computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /** The data disk group size to be allocated in GBs for the shard database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGbs")
        private Double dataStorageSizeInGbs;

        /**
         * The data disk group size to be allocated in GBs for the shard database.
         *
         * @param dataStorageSizeInGbs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGbs(Double dataStorageSizeInGbs) {
            this.dataStorageSizeInGbs = dataStorageSizeInGbs;
            this.__explicitlySet__.add("dataStorageSizeInGbs");
            return this;
        }
        /** Determines the auto-scaling mode for the shard database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        /**
         * Determines the auto-scaling mode for the shard database.
         *
         * @param isAutoScalingEnabled the value to set
         * @return this builder
         */
        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }
        /** The name of the shardGroup for the shard. */
        @com.fasterxml.jackson.annotation.JsonProperty("shardGroup")
        private String shardGroup;

        /**
         * The name of the shardGroup for the shard.
         *
         * @param shardGroup the value to set
         * @return this builder
         */
        public Builder shardGroup(String shardGroup) {
            this.shardGroup = shardGroup;
            this.__explicitlySet__.add("shardGroup");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloudAutonomousVmCluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
        private String cloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloudAutonomousVmCluster.
         *
         * @param cloudAutonomousVmClusterId the value to set
         * @return this builder
         */
        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            this.__explicitlySet__.add("cloudAutonomousVmClusterId");
            return this;
        }
        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
         * cloudAutonomousVmClusters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterIds")
        private java.util.List<String> peerCloudAutonomousVmClusterIds;

        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
         * cloudAutonomousVmClusters.
         *
         * @param peerCloudAutonomousVmClusterIds the value to set
         * @return this builder
         */
        public Builder peerCloudAutonomousVmClusterIds(
                java.util.List<String> peerCloudAutonomousVmClusterIds) {
            this.peerCloudAutonomousVmClusterIds = peerCloudAutonomousVmClusterIds;
            this.__explicitlySet__.add("peerCloudAutonomousVmClusterIds");
            return this;
        }
        /**
         * The shard space name for the Globally distributed autonomous database. Shard space for
         * existing shard cannot be changed, once shard is created. Shard space name shall be used
         * while creation of new shards.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shardSpace")
        private String shardSpace;

        /**
         * The shard space name for the Globally distributed autonomous database. Shard space for
         * existing shard cannot be changed, once shard is created. Shard space name shall be used
         * while creation of new shards.
         *
         * @param shardSpace the value to set
         * @return this builder
         */
        public Builder shardSpace(String shardSpace) {
            this.shardSpace = shardSpace;
            this.__explicitlySet__.add("shardSpace");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions.
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder
         */
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }
        /**
         * Status of shard with dedicated infrastructure for the Globally distributed autonomous
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of shard with dedicated infrastructure for the Globally distributed autonomous
         * database.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** the identifier of the underlying supporting resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
        private String supportingResourceId;

        /**
         * the identifier of the underlying supporting resource.
         *
         * @param supportingResourceId the value to set
         * @return this builder
         */
        public Builder supportingResourceId(String supportingResourceId) {
            this.supportingResourceId = supportingResourceId;
            this.__explicitlySet__.add("supportingResourceId");
            return this;
        }
        /** the identifier of the container database for underlying supporting resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
        private String containerDatabaseId;

        /**
         * the identifier of the container database for underlying supporting resource.
         *
         * @param containerDatabaseId the value to set
         * @return this builder
         */
        public Builder containerDatabaseId(String containerDatabaseId) {
            this.containerDatabaseId = containerDatabaseId;
            this.__explicitlySet__.add("containerDatabaseId");
            return this;
        }
        /** Peer details for the shard with dedicated infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDetails")
        private java.util.List<ShardPeerWithDedicatedInfra> peerDetails;

        /**
         * Peer details for the shard with dedicated infrastructure.
         *
         * @param peerDetails the value to set
         * @return this builder
         */
        public Builder peerDetails(java.util.List<ShardPeerWithDedicatedInfra> peerDetails) {
            this.peerDetails = peerDetails;
            this.__explicitlySet__.add("peerDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private DistributedAutonomousDbMetadata metadata;

        public Builder metadata(DistributedAutonomousDbMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedAutonomousDatabaseShardWithDedicatedInfra build() {
            DistributedAutonomousDatabaseShardWithDedicatedInfra model =
                    new DistributedAutonomousDatabaseShardWithDedicatedInfra(
                            this.name,
                            this.timeCreated,
                            this.timeUpdated,
                            this.computeCount,
                            this.dataStorageSizeInGbs,
                            this.isAutoScalingEnabled,
                            this.shardGroup,
                            this.cloudAutonomousVmClusterId,
                            this.peerCloudAutonomousVmClusterIds,
                            this.shardSpace,
                            this.vaultId,
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.status,
                            this.supportingResourceId,
                            this.containerDatabaseId,
                            this.peerDetails,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedAutonomousDatabaseShardWithDedicatedInfra model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGbs")) {
                this.dataStorageSizeInGbs(model.getDataStorageSizeInGbs());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("shardGroup")) {
                this.shardGroup(model.getShardGroup());
            }
            if (model.wasPropertyExplicitlySet("cloudAutonomousVmClusterId")) {
                this.cloudAutonomousVmClusterId(model.getCloudAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("peerCloudAutonomousVmClusterIds")) {
                this.peerCloudAutonomousVmClusterIds(model.getPeerCloudAutonomousVmClusterIds());
            }
            if (model.wasPropertyExplicitlySet("shardSpace")) {
                this.shardSpace(model.getShardSpace());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("supportingResourceId")) {
                this.supportingResourceId(model.getSupportingResourceId());
            }
            if (model.wasPropertyExplicitlySet("containerDatabaseId")) {
                this.containerDatabaseId(model.getContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("peerDetails")) {
                this.peerDetails(model.getPeerDetails());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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

    @Deprecated
    public DistributedAutonomousDatabaseShardWithDedicatedInfra(
            String name,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Float computeCount,
            Double dataStorageSizeInGbs,
            Boolean isAutoScalingEnabled,
            String shardGroup,
            String cloudAutonomousVmClusterId,
            java.util.List<String> peerCloudAutonomousVmClusterIds,
            String shardSpace,
            String vaultId,
            String kmsKeyId,
            String kmsKeyVersionId,
            Status status,
            String supportingResourceId,
            String containerDatabaseId,
            java.util.List<ShardPeerWithDedicatedInfra> peerDetails,
            DistributedAutonomousDbMetadata metadata) {
        super(name, timeCreated, timeUpdated);
        this.computeCount = computeCount;
        this.dataStorageSizeInGbs = dataStorageSizeInGbs;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.shardGroup = shardGroup;
        this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
        this.peerCloudAutonomousVmClusterIds = peerCloudAutonomousVmClusterIds;
        this.shardSpace = shardSpace;
        this.vaultId = vaultId;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.status = status;
        this.supportingResourceId = supportingResourceId;
        this.containerDatabaseId = containerDatabaseId;
        this.peerDetails = peerDetails;
        this.metadata = metadata;
    }

    /** The compute count for the shard database. It has to be in multiples of 2. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Float computeCount;

    /**
     * The compute count for the shard database. It has to be in multiples of 2.
     *
     * @return the value
     */
    public Float getComputeCount() {
        return computeCount;
    }

    /** The data disk group size to be allocated in GBs for the shard database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGbs")
    private final Double dataStorageSizeInGbs;

    /**
     * The data disk group size to be allocated in GBs for the shard database.
     *
     * @return the value
     */
    public Double getDataStorageSizeInGbs() {
        return dataStorageSizeInGbs;
    }

    /** Determines the auto-scaling mode for the shard database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Determines the auto-scaling mode for the shard database.
     *
     * @return the value
     */
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
    }

    /** The name of the shardGroup for the shard. */
    @com.fasterxml.jackson.annotation.JsonProperty("shardGroup")
    private final String shardGroup;

    /**
     * The name of the shardGroup for the shard.
     *
     * @return the value
     */
    public String getShardGroup() {
        return shardGroup;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloudAutonomousVmCluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
    private final String cloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloudAutonomousVmCluster.
     *
     * @return the value
     */
    public String getCloudAutonomousVmClusterId() {
        return cloudAutonomousVmClusterId;
    }

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
     * cloudAutonomousVmClusters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterIds")
    private final java.util.List<String> peerCloudAutonomousVmClusterIds;

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
     * cloudAutonomousVmClusters.
     *
     * @return the value
     */
    public java.util.List<String> getPeerCloudAutonomousVmClusterIds() {
        return peerCloudAutonomousVmClusterIds;
    }

    /**
     * The shard space name for the Globally distributed autonomous database. Shard space for
     * existing shard cannot be changed, once shard is created. Shard space name shall be used while
     * creation of new shards.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shardSpace")
    private final String shardSpace;

    /**
     * The shard space name for the Globally distributed autonomous database. Shard space for
     * existing shard cannot be changed, once shard is created. Shard space name shall be used while
     * creation of new shards.
     *
     * @return the value
     */
    public String getShardSpace() {
        return shardSpace;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions.
     *
     * @return the value
     */
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * Status of shard with dedicated infrastructure for the Globally distributed autonomous
     * database.
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Failed("FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Updating("UPDATING"),
        Creating("CREATING"),
        Created("CREATED"),
        ReadyForConfiguration("READY_FOR_CONFIGURATION"),
        Configured("CONFIGURED"),
        NeedsAttention("NEEDS_ATTENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of shard with dedicated infrastructure for the Globally distributed autonomous
     * database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of shard with dedicated infrastructure for the Globally distributed autonomous
     * database.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** the identifier of the underlying supporting resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
    private final String supportingResourceId;

    /**
     * the identifier of the underlying supporting resource.
     *
     * @return the value
     */
    public String getSupportingResourceId() {
        return supportingResourceId;
    }

    /** the identifier of the container database for underlying supporting resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
    private final String containerDatabaseId;

    /**
     * the identifier of the container database for underlying supporting resource.
     *
     * @return the value
     */
    public String getContainerDatabaseId() {
        return containerDatabaseId;
    }

    /** Peer details for the shard with dedicated infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDetails")
    private final java.util.List<ShardPeerWithDedicatedInfra> peerDetails;

    /**
     * Peer details for the shard with dedicated infrastructure.
     *
     * @return the value
     */
    public java.util.List<ShardPeerWithDedicatedInfra> getPeerDetails() {
        return peerDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final DistributedAutonomousDbMetadata metadata;

    public DistributedAutonomousDbMetadata getMetadata() {
        return metadata;
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
        sb.append("DistributedAutonomousDatabaseShardWithDedicatedInfra(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", dataStorageSizeInGbs=").append(String.valueOf(this.dataStorageSizeInGbs));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", shardGroup=").append(String.valueOf(this.shardGroup));
        sb.append(", cloudAutonomousVmClusterId=")
                .append(String.valueOf(this.cloudAutonomousVmClusterId));
        sb.append(", peerCloudAutonomousVmClusterIds=")
                .append(String.valueOf(this.peerCloudAutonomousVmClusterIds));
        sb.append(", shardSpace=").append(String.valueOf(this.shardSpace));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", supportingResourceId=").append(String.valueOf(this.supportingResourceId));
        sb.append(", containerDatabaseId=").append(String.valueOf(this.containerDatabaseId));
        sb.append(", peerDetails=").append(String.valueOf(this.peerDetails));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedAutonomousDatabaseShardWithDedicatedInfra)) {
            return false;
        }

        DistributedAutonomousDatabaseShardWithDedicatedInfra other =
                (DistributedAutonomousDatabaseShardWithDedicatedInfra) o;
        return java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.dataStorageSizeInGbs, other.dataStorageSizeInGbs)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.shardGroup, other.shardGroup)
                && java.util.Objects.equals(
                        this.cloudAutonomousVmClusterId, other.cloudAutonomousVmClusterId)
                && java.util.Objects.equals(
                        this.peerCloudAutonomousVmClusterIds, other.peerCloudAutonomousVmClusterIds)
                && java.util.Objects.equals(this.shardSpace, other.shardSpace)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.supportingResourceId, other.supportingResourceId)
                && java.util.Objects.equals(this.containerDatabaseId, other.containerDatabaseId)
                && java.util.Objects.equals(this.peerDetails, other.peerDetails)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGbs == null
                                ? 43
                                : this.dataStorageSizeInGbs.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result = (result * PRIME) + (this.shardGroup == null ? 43 : this.shardGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutonomousVmClusterId == null
                                ? 43
                                : this.cloudAutonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerCloudAutonomousVmClusterIds == null
                                ? 43
                                : this.peerCloudAutonomousVmClusterIds.hashCode());
        result = (result * PRIME) + (this.shardSpace == null ? 43 : this.shardSpace.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.supportingResourceId == null
                                ? 43
                                : this.supportingResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.containerDatabaseId == null
                                ? 43
                                : this.containerDatabaseId.hashCode());
        result = (result * PRIME) + (this.peerDetails == null ? 43 : this.peerDetails.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        return result;
    }
}
