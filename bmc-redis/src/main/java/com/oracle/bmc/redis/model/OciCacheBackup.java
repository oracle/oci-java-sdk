/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * OCI Cache cluster backup information <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OciCacheBackup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciCacheBackup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "backupSource",
        "lifecycleState",
        "retentionPeriodInDays",
        "backupSizeInGBs",
        "sourceClusterId",
        "clusterMode",
        "clusterMemoryInGBs",
        "shardCount",
        "softwareVersion",
        "timeCreated",
        "timeUpdated",
        "backupType",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OciCacheBackup(
            String id,
            String displayName,
            String description,
            String compartmentId,
            BackupSource backupSource,
            LifecycleState lifecycleState,
            Integer retentionPeriodInDays,
            Float backupSizeInGBs,
            String sourceClusterId,
            RedisCluster.ClusterMode clusterMode,
            Float clusterMemoryInGBs,
            Integer shardCount,
            RedisCluster.SoftwareVersion softwareVersion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            BackupType backupType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.backupSource = backupSource;
        this.lifecycleState = lifecycleState;
        this.retentionPeriodInDays = retentionPeriodInDays;
        this.backupSizeInGBs = backupSizeInGBs;
        this.sourceClusterId = sourceClusterId;
        this.clusterMode = clusterMode;
        this.clusterMemoryInGBs = clusterMemoryInGBs;
        this.shardCount = shardCount;
        this.softwareVersion = softwareVersion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.backupType = backupType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Backup display name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Backup display name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Backup description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Backup description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Backup compartment identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Backup compartment identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Specifies whether the backup was created from a replica or primary node */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSource")
        private BackupSource backupSource;

        /**
         * Specifies whether the backup was created from a replica or primary node
         *
         * @param backupSource the value to set
         * @return this builder
         */
        public Builder backupSource(BackupSource backupSource) {
            this.backupSource = backupSource;
            this.__explicitlySet__.add("backupSource");
            return this;
        }
        /** The current state of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the backup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Backup retention period in days. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
        private Integer retentionPeriodInDays;

        /**
         * Backup retention period in days.
         *
         * @param retentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            this.__explicitlySet__.add("retentionPeriodInDays");
            return this;
        }
        /** Backup size in GB. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
        private Float backupSizeInGBs;

        /**
         * Backup size in GB.
         *
         * @param backupSizeInGBs the value to set
         * @return this builder
         */
        public Builder backupSizeInGBs(Float backupSizeInGBs) {
            this.backupSizeInGBs = backupSizeInGBs;
            this.__explicitlySet__.add("backupSizeInGBs");
            return this;
        }
        /** The source OCI Cache Cluster OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceClusterId")
        private String sourceClusterId;

        /**
         * The source OCI Cache Cluster OCID.
         *
         * @param sourceClusterId the value to set
         * @return this builder
         */
        public Builder sourceClusterId(String sourceClusterId) {
            this.sourceClusterId = sourceClusterId;
            this.__explicitlySet__.add("sourceClusterId");
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
        /** The amount of memory allocated to the cluster, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterMemoryInGBs")
        private Float clusterMemoryInGBs;

        /**
         * The amount of memory allocated to the cluster, in gigabytes.
         *
         * @param clusterMemoryInGBs the value to set
         * @return this builder
         */
        public Builder clusterMemoryInGBs(Float clusterMemoryInGBs) {
            this.clusterMemoryInGBs = clusterMemoryInGBs;
            this.__explicitlySet__.add("clusterMemoryInGBs");
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
         * The date and time the backup was created. An
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the backup was created. An
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
         * The date and time the backup was updated. An
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the backup was updated. An
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
        /** Backup Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private BackupType backupType;

        /**
         * Backup Type.
         *
         * @param backupType the value to set
         * @return this builder
         */
        public Builder backupType(BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
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

        public OciCacheBackup build() {
            OciCacheBackup model =
                    new OciCacheBackup(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.backupSource,
                            this.lifecycleState,
                            this.retentionPeriodInDays,
                            this.backupSizeInGBs,
                            this.sourceClusterId,
                            this.clusterMode,
                            this.clusterMemoryInGBs,
                            this.shardCount,
                            this.softwareVersion,
                            this.timeCreated,
                            this.timeUpdated,
                            this.backupType,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciCacheBackup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("backupSource")) {
                this.backupSource(model.getBackupSource());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriodInDays")) {
                this.retentionPeriodInDays(model.getRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("backupSizeInGBs")) {
                this.backupSizeInGBs(model.getBackupSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("sourceClusterId")) {
                this.sourceClusterId(model.getSourceClusterId());
            }
            if (model.wasPropertyExplicitlySet("clusterMode")) {
                this.clusterMode(model.getClusterMode());
            }
            if (model.wasPropertyExplicitlySet("clusterMemoryInGBs")) {
                this.clusterMemoryInGBs(model.getClusterMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("shardCount")) {
                this.shardCount(model.getShardCount());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
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

    /** Unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Backup display name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Backup display name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Backup description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Backup description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Backup compartment identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Backup compartment identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Specifies whether the backup was created from a replica or primary node */
    public enum BackupSource implements com.oracle.bmc.http.internal.BmcEnum {
        Replica("REPLICA"),
        Primary("PRIMARY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupSource.class);

        private final String value;
        private static java.util.Map<String, BackupSource> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupSource v : BackupSource.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupSource(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupSource create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupSource', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies whether the backup was created from a replica or primary node */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSource")
    private final BackupSource backupSource;

    /**
     * Specifies whether the backup was created from a replica or primary node
     *
     * @return the value
     */
    public BackupSource getBackupSource() {
        return backupSource;
    }

    /** The current state of the backup. */
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
    /** The current state of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the backup.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Backup retention period in days. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Integer retentionPeriodInDays;

    /**
     * Backup retention period in days.
     *
     * @return the value
     */
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    /** Backup size in GB. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
    private final Float backupSizeInGBs;

    /**
     * Backup size in GB.
     *
     * @return the value
     */
    public Float getBackupSizeInGBs() {
        return backupSizeInGBs;
    }

    /** The source OCI Cache Cluster OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceClusterId")
    private final String sourceClusterId;

    /**
     * The source OCI Cache Cluster OCID.
     *
     * @return the value
     */
    public String getSourceClusterId() {
        return sourceClusterId;
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

    /** The amount of memory allocated to the cluster, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterMemoryInGBs")
    private final Float clusterMemoryInGBs;

    /**
     * The amount of memory allocated to the cluster, in gigabytes.
     *
     * @return the value
     */
    public Float getClusterMemoryInGBs() {
        return clusterMemoryInGBs;
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
     * The date and time the backup was created. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the backup was created. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the backup was updated. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the backup was updated. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Backup Type. */
    public enum BackupType implements com.oracle.bmc.http.internal.BmcEnum {
        Manual("MANUAL"),
        Automated("AUTOMATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupType.class);

        private final String value;
        private static java.util.Map<String, BackupType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupType v : BackupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Backup Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final BackupType backupType;

    /**
     * Backup Type.
     *
     * @return the value
     */
    public BackupType getBackupType() {
        return backupType;
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
        sb.append("OciCacheBackup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", backupSource=").append(String.valueOf(this.backupSource));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(", backupSizeInGBs=").append(String.valueOf(this.backupSizeInGBs));
        sb.append(", sourceClusterId=").append(String.valueOf(this.sourceClusterId));
        sb.append(", clusterMode=").append(String.valueOf(this.clusterMode));
        sb.append(", clusterMemoryInGBs=").append(String.valueOf(this.clusterMemoryInGBs));
        sb.append(", shardCount=").append(String.valueOf(this.shardCount));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
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
        if (!(o instanceof OciCacheBackup)) {
            return false;
        }

        OciCacheBackup other = (OciCacheBackup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.backupSource, other.backupSource)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays)
                && java.util.Objects.equals(this.backupSizeInGBs, other.backupSizeInGBs)
                && java.util.Objects.equals(this.sourceClusterId, other.sourceClusterId)
                && java.util.Objects.equals(this.clusterMode, other.clusterMode)
                && java.util.Objects.equals(this.clusterMemoryInGBs, other.clusterMemoryInGBs)
                && java.util.Objects.equals(this.shardCount, other.shardCount)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.backupType, other.backupType)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.backupSource == null ? 43 : this.backupSource.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriodInDays == null
                                ? 43
                                : this.retentionPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSizeInGBs == null ? 43 : this.backupSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceClusterId == null ? 43 : this.sourceClusterId.hashCode());
        result = (result * PRIME) + (this.clusterMode == null ? 43 : this.clusterMode.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterMemoryInGBs == null
                                ? 43
                                : this.clusterMemoryInGBs.hashCode());
        result = (result * PRIME) + (this.shardCount == null ? 43 : this.shardCount.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
