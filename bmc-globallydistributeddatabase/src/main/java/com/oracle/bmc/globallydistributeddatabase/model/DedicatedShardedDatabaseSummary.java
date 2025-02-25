/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/**
 * Summary of ATP-D based sharded database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DedicatedShardedDatabaseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dbDeploymentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DedicatedShardedDatabaseSummary extends ShardedDatabaseSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ShardedDatabase.LifecycleState lifecycleState;

        public Builder lifecycleState(ShardedDatabase.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The Replication method for sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicationMethod")
        private DedicatedShardedDatabase.ReplicationMethod replicationMethod;

        /**
         * The Replication method for sharded database.
         * @param replicationMethod the value to set
         * @return this builder
         **/
        public Builder replicationMethod(
                DedicatedShardedDatabase.ReplicationMethod replicationMethod) {
            this.replicationMethod = replicationMethod;
            this.__explicitlySet__.add("replicationMethod");
            return this;
        }
        /**
         * The Replication factor for RAFT replication based sharded database. Currently supported values are 3, 5 and 7.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
        private Integer replicationFactor;

        /**
         * The Replication factor for RAFT replication based sharded database. Currently supported values are 3, 5 and 7.
         *
         * @param replicationFactor the value to set
         * @return this builder
         **/
        public Builder replicationFactor(Integer replicationFactor) {
            this.replicationFactor = replicationFactor;
            this.__explicitlySet__.add("replicationFactor");
            return this;
        }
        /**
         * For RAFT replication based sharded database, the value should be atleast twice the number of shards.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicationUnit")
        private Integer replicationUnit;

        /**
         * For RAFT replication based sharded database, the value should be atleast twice the number of shards.
         * @param replicationUnit the value to set
         * @return this builder
         **/
        public Builder replicationUnit(Integer replicationUnit) {
            this.replicationUnit = replicationUnit;
            this.__explicitlySet__.add("replicationUnit");
            return this;
        }
        /**
         * The certificate common name used in all cloudAutonomousVmClusters for the sharded database topology. Eg. Production.
         * All the clusters used in one sharded database topology shall have same CABundle setup. Valid characterset for
         * clusterCertificateCommonName include uppercase or lowercase letters, numbers, hyphens, underscores, and period.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterCertificateCommonName")
        private String clusterCertificateCommonName;

        /**
         * The certificate common name used in all cloudAutonomousVmClusters for the sharded database topology. Eg. Production.
         * All the clusters used in one sharded database topology shall have same CABundle setup. Valid characterset for
         * clusterCertificateCommonName include uppercase or lowercase letters, numbers, hyphens, underscores, and period.
         *
         * @param clusterCertificateCommonName the value to set
         * @return this builder
         **/
        public Builder clusterCertificateCommonName(String clusterCertificateCommonName) {
            this.clusterCertificateCommonName = clusterCertificateCommonName;
            this.__explicitlySet__.add("clusterCertificateCommonName");
            return this;
        }
        /**
         * Possible workload types.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        /**
         * Possible workload types.
         * @param dbWorkload the value to set
         * @return this builder
         **/
        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }
        /**
         * Sharding Method.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shardingMethod")
        private ShardingMethod shardingMethod;

        /**
         * Sharding Method.
         * @param shardingMethod the value to set
         * @return this builder
         **/
        public Builder shardingMethod(ShardingMethod shardingMethod) {
            this.shardingMethod = shardingMethod;
            this.__explicitlySet__.add("shardingMethod");
            return this;
        }
        /**
         * The character set for the sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set for the sharded database.
         * @param characterSet the value to set
         * @return this builder
         **/
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /**
         * The national character set for the sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character set for the sharded database.
         * @param ncharacterSet the value to set
         * @return this builder
         **/
        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }
        /**
         * The default number of unique chunks in a shardspace. The value of chunks must be
         * greater than 2 times the size of the largest shardgroup in any shardspace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chunks")
        private Integer chunks;

        /**
         * The default number of unique chunks in a shardspace. The value of chunks must be
         * greater than 2 times the size of the largest shardgroup in any shardspace.
         *
         * @param chunks the value to set
         * @return this builder
         **/
        public Builder chunks(Integer chunks) {
            this.chunks = chunks;
            this.__explicitlySet__.add("chunks");
            return this;
        }
        /**
         * Oracle Database version of the Autonomous Container Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * Oracle Database version of the Autonomous Container Database.
         * @param dbVersion the value to set
         * @return this builder
         **/
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * The listener port number for the sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        /**
         * The listener port number for the sharded database.
         * @param listenerPort the value to set
         * @return this builder
         **/
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            this.__explicitlySet__.add("listenerPort");
            return this;
        }
        /**
         * The TLS listener port number for sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
        private Integer listenerPortTls;

        /**
         * The TLS listener port number for sharded database.
         * @param listenerPortTls the value to set
         * @return this builder
         **/
        public Builder listenerPortTls(Integer listenerPortTls) {
            this.listenerPortTls = listenerPortTls;
            this.__explicitlySet__.add("listenerPortTls");
            return this;
        }
        /**
         * Ons local port number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
        private Integer onsPortLocal;

        /**
         * Ons local port number.
         * @param onsPortLocal the value to set
         * @return this builder
         **/
        public Builder onsPortLocal(Integer onsPortLocal) {
            this.onsPortLocal = onsPortLocal;
            this.__explicitlySet__.add("onsPortLocal");
            return this;
        }
        /**
         * Ons remote port number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
        private Integer onsPortRemote;

        /**
         * Ons remote port number.
         * @param onsPortRemote the value to set
         * @return this builder
         **/
        public Builder onsPortRemote(Integer onsPortRemote) {
            this.onsPortRemote = onsPortRemote;
            this.__explicitlySet__.add("onsPortRemote");
            return this;
        }
        /**
         * Name prefix for the sharded databases.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * Name prefix for the sharded databases.
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * Total cpu count usage for shards and catalogs of the sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalCpuCount")
        private Integer totalCpuCount;

        /**
         * Total cpu count usage for shards and catalogs of the sharded database.
         * @param totalCpuCount the value to set
         * @return this builder
         **/
        public Builder totalCpuCount(Integer totalCpuCount) {
            this.totalCpuCount = totalCpuCount;
            this.__explicitlySet__.add("totalCpuCount");
            return this;
        }
        /**
         * The aggregarted value of dataStorageSizeInGbs for all shards and catalogs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalDataStorageSizeInGbs")
        private Double totalDataStorageSizeInGbs;

        /**
         * The aggregarted value of dataStorageSizeInGbs for all shards and catalogs.
         * @param totalDataStorageSizeInGbs the value to set
         * @return this builder
         **/
        public Builder totalDataStorageSizeInGbs(Double totalDataStorageSizeInGbs) {
            this.totalDataStorageSizeInGbs = totalDataStorageSizeInGbs;
            this.__explicitlySet__.add("totalDataStorageSizeInGbs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DedicatedShardedDatabaseSummary build() {
            DedicatedShardedDatabaseSummary model =
                    new DedicatedShardedDatabaseSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.replicationMethod,
                            this.replicationFactor,
                            this.replicationUnit,
                            this.clusterCertificateCommonName,
                            this.dbWorkload,
                            this.shardingMethod,
                            this.characterSet,
                            this.ncharacterSet,
                            this.chunks,
                            this.dbVersion,
                            this.listenerPort,
                            this.listenerPortTls,
                            this.onsPortLocal,
                            this.onsPortRemote,
                            this.prefix,
                            this.totalCpuCount,
                            this.totalDataStorageSizeInGbs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DedicatedShardedDatabaseSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
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
            if (model.wasPropertyExplicitlySet("replicationMethod")) {
                this.replicationMethod(model.getReplicationMethod());
            }
            if (model.wasPropertyExplicitlySet("replicationFactor")) {
                this.replicationFactor(model.getReplicationFactor());
            }
            if (model.wasPropertyExplicitlySet("replicationUnit")) {
                this.replicationUnit(model.getReplicationUnit());
            }
            if (model.wasPropertyExplicitlySet("clusterCertificateCommonName")) {
                this.clusterCertificateCommonName(model.getClusterCertificateCommonName());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("shardingMethod")) {
                this.shardingMethod(model.getShardingMethod());
            }
            if (model.wasPropertyExplicitlySet("characterSet")) {
                this.characterSet(model.getCharacterSet());
            }
            if (model.wasPropertyExplicitlySet("ncharacterSet")) {
                this.ncharacterSet(model.getNcharacterSet());
            }
            if (model.wasPropertyExplicitlySet("chunks")) {
                this.chunks(model.getChunks());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("listenerPort")) {
                this.listenerPort(model.getListenerPort());
            }
            if (model.wasPropertyExplicitlySet("listenerPortTls")) {
                this.listenerPortTls(model.getListenerPortTls());
            }
            if (model.wasPropertyExplicitlySet("onsPortLocal")) {
                this.onsPortLocal(model.getOnsPortLocal());
            }
            if (model.wasPropertyExplicitlySet("onsPortRemote")) {
                this.onsPortRemote(model.getOnsPortRemote());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("totalCpuCount")) {
                this.totalCpuCount(model.getTotalCpuCount());
            }
            if (model.wasPropertyExplicitlySet("totalDataStorageSizeInGbs")) {
                this.totalDataStorageSizeInGbs(model.getTotalDataStorageSizeInGbs());
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

    @Deprecated
    public DedicatedShardedDatabaseSummary(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ShardedDatabase.LifecycleState lifecycleState,
            String lifecycleStateDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            DedicatedShardedDatabase.ReplicationMethod replicationMethod,
            Integer replicationFactor,
            Integer replicationUnit,
            String clusterCertificateCommonName,
            DbWorkload dbWorkload,
            ShardingMethod shardingMethod,
            String characterSet,
            String ncharacterSet,
            Integer chunks,
            String dbVersion,
            Integer listenerPort,
            Integer listenerPortTls,
            Integer onsPortLocal,
            Integer onsPortRemote,
            String prefix,
            Integer totalCpuCount,
            Double totalDataStorageSizeInGbs) {
        super(
                id,
                compartmentId,
                displayName,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleStateDetails,
                freeformTags,
                definedTags,
                systemTags);
        this.replicationMethod = replicationMethod;
        this.replicationFactor = replicationFactor;
        this.replicationUnit = replicationUnit;
        this.clusterCertificateCommonName = clusterCertificateCommonName;
        this.dbWorkload = dbWorkload;
        this.shardingMethod = shardingMethod;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.chunks = chunks;
        this.dbVersion = dbVersion;
        this.listenerPort = listenerPort;
        this.listenerPortTls = listenerPortTls;
        this.onsPortLocal = onsPortLocal;
        this.onsPortRemote = onsPortRemote;
        this.prefix = prefix;
        this.totalCpuCount = totalCpuCount;
        this.totalDataStorageSizeInGbs = totalDataStorageSizeInGbs;
    }

    /**
     * The Replication method for sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationMethod")
    private final DedicatedShardedDatabase.ReplicationMethod replicationMethod;

    /**
     * The Replication method for sharded database.
     * @return the value
     **/
    public DedicatedShardedDatabase.ReplicationMethod getReplicationMethod() {
        return replicationMethod;
    }

    /**
     * The Replication factor for RAFT replication based sharded database. Currently supported values are 3, 5 and 7.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
    private final Integer replicationFactor;

    /**
     * The Replication factor for RAFT replication based sharded database. Currently supported values are 3, 5 and 7.
     *
     * @return the value
     **/
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    /**
     * For RAFT replication based sharded database, the value should be atleast twice the number of shards.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationUnit")
    private final Integer replicationUnit;

    /**
     * For RAFT replication based sharded database, the value should be atleast twice the number of shards.
     * @return the value
     **/
    public Integer getReplicationUnit() {
        return replicationUnit;
    }

    /**
     * The certificate common name used in all cloudAutonomousVmClusters for the sharded database topology. Eg. Production.
     * All the clusters used in one sharded database topology shall have same CABundle setup. Valid characterset for
     * clusterCertificateCommonName include uppercase or lowercase letters, numbers, hyphens, underscores, and period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterCertificateCommonName")
    private final String clusterCertificateCommonName;

    /**
     * The certificate common name used in all cloudAutonomousVmClusters for the sharded database topology. Eg. Production.
     * All the clusters used in one sharded database topology shall have same CABundle setup. Valid characterset for
     * clusterCertificateCommonName include uppercase or lowercase letters, numbers, hyphens, underscores, and period.
     *
     * @return the value
     **/
    public String getClusterCertificateCommonName() {
        return clusterCertificateCommonName;
    }

    /**
     * Possible workload types.
     **/
    public enum DbWorkload {
        Oltp("OLTP"),
        Dw("DW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DbWorkload.class);

        private final String value;
        private static java.util.Map<String, DbWorkload> map;

        static {
            map = new java.util.HashMap<>();
            for (DbWorkload v : DbWorkload.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DbWorkload(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbWorkload create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DbWorkload', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Possible workload types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    private final DbWorkload dbWorkload;

    /**
     * Possible workload types.
     * @return the value
     **/
    public DbWorkload getDbWorkload() {
        return dbWorkload;
    }

    /**
     * Sharding Method.
     **/
    public enum ShardingMethod {
        User("USER"),
        System("SYSTEM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ShardingMethod.class);

        private final String value;
        private static java.util.Map<String, ShardingMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (ShardingMethod v : ShardingMethod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ShardingMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShardingMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShardingMethod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Sharding Method.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shardingMethod")
    private final ShardingMethod shardingMethod;

    /**
     * Sharding Method.
     * @return the value
     **/
    public ShardingMethod getShardingMethod() {
        return shardingMethod;
    }

    /**
     * The character set for the sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the sharded database.
     * @return the value
     **/
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * The national character set for the sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character set for the sharded database.
     * @return the value
     **/
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /**
     * The default number of unique chunks in a shardspace. The value of chunks must be
     * greater than 2 times the size of the largest shardgroup in any shardspace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunks")
    private final Integer chunks;

    /**
     * The default number of unique chunks in a shardspace. The value of chunks must be
     * greater than 2 times the size of the largest shardgroup in any shardspace.
     *
     * @return the value
     **/
    public Integer getChunks() {
        return chunks;
    }

    /**
     * Oracle Database version of the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * Oracle Database version of the Autonomous Container Database.
     * @return the value
     **/
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The listener port number for the sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Integer listenerPort;

    /**
     * The listener port number for the sharded database.
     * @return the value
     **/
    public Integer getListenerPort() {
        return listenerPort;
    }

    /**
     * The TLS listener port number for sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
    private final Integer listenerPortTls;

    /**
     * The TLS listener port number for sharded database.
     * @return the value
     **/
    public Integer getListenerPortTls() {
        return listenerPortTls;
    }

    /**
     * Ons local port number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
    private final Integer onsPortLocal;

    /**
     * Ons local port number.
     * @return the value
     **/
    public Integer getOnsPortLocal() {
        return onsPortLocal;
    }

    /**
     * Ons remote port number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
    private final Integer onsPortRemote;

    /**
     * Ons remote port number.
     * @return the value
     **/
    public Integer getOnsPortRemote() {
        return onsPortRemote;
    }

    /**
     * Name prefix for the sharded databases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * Name prefix for the sharded databases.
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    /**
     * Total cpu count usage for shards and catalogs of the sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpuCount")
    private final Integer totalCpuCount;

    /**
     * Total cpu count usage for shards and catalogs of the sharded database.
     * @return the value
     **/
    public Integer getTotalCpuCount() {
        return totalCpuCount;
    }

    /**
     * The aggregarted value of dataStorageSizeInGbs for all shards and catalogs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalDataStorageSizeInGbs")
    private final Double totalDataStorageSizeInGbs;

    /**
     * The aggregarted value of dataStorageSizeInGbs for all shards and catalogs.
     * @return the value
     **/
    public Double getTotalDataStorageSizeInGbs() {
        return totalDataStorageSizeInGbs;
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
        sb.append("DedicatedShardedDatabaseSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", replicationMethod=").append(String.valueOf(this.replicationMethod));
        sb.append(", replicationFactor=").append(String.valueOf(this.replicationFactor));
        sb.append(", replicationUnit=").append(String.valueOf(this.replicationUnit));
        sb.append(", clusterCertificateCommonName=")
                .append(String.valueOf(this.clusterCertificateCommonName));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", shardingMethod=").append(String.valueOf(this.shardingMethod));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", chunks=").append(String.valueOf(this.chunks));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", listenerPortTls=").append(String.valueOf(this.listenerPortTls));
        sb.append(", onsPortLocal=").append(String.valueOf(this.onsPortLocal));
        sb.append(", onsPortRemote=").append(String.valueOf(this.onsPortRemote));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", totalCpuCount=").append(String.valueOf(this.totalCpuCount));
        sb.append(", totalDataStorageSizeInGbs=")
                .append(String.valueOf(this.totalDataStorageSizeInGbs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DedicatedShardedDatabaseSummary)) {
            return false;
        }

        DedicatedShardedDatabaseSummary other = (DedicatedShardedDatabaseSummary) o;
        return java.util.Objects.equals(this.replicationMethod, other.replicationMethod)
                && java.util.Objects.equals(this.replicationFactor, other.replicationFactor)
                && java.util.Objects.equals(this.replicationUnit, other.replicationUnit)
                && java.util.Objects.equals(
                        this.clusterCertificateCommonName, other.clusterCertificateCommonName)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.shardingMethod, other.shardingMethod)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.chunks, other.chunks)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.listenerPortTls, other.listenerPortTls)
                && java.util.Objects.equals(this.onsPortLocal, other.onsPortLocal)
                && java.util.Objects.equals(this.onsPortRemote, other.onsPortRemote)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.totalCpuCount, other.totalCpuCount)
                && java.util.Objects.equals(
                        this.totalDataStorageSizeInGbs, other.totalDataStorageSizeInGbs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.replicationMethod == null ? 43 : this.replicationMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationFactor == null ? 43 : this.replicationFactor.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationUnit == null ? 43 : this.replicationUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterCertificateCommonName == null
                                ? 43
                                : this.clusterCertificateCommonName.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result =
                (result * PRIME)
                        + (this.shardingMethod == null ? 43 : this.shardingMethod.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.chunks == null ? 43 : this.chunks.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.listenerPort == null ? 43 : this.listenerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.listenerPortTls == null ? 43 : this.listenerPortTls.hashCode());
        result = (result * PRIME) + (this.onsPortLocal == null ? 43 : this.onsPortLocal.hashCode());
        result =
                (result * PRIME)
                        + (this.onsPortRemote == null ? 43 : this.onsPortRemote.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result =
                (result * PRIME)
                        + (this.totalCpuCount == null ? 43 : this.totalCpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalDataStorageSizeInGbs == null
                                ? 43
                                : this.totalDataStorageSizeInGbs.hashCode());
        return result;
    }
}
