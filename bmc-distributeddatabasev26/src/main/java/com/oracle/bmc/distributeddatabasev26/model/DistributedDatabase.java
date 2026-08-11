/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Globally distributed database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DistributedDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedDatabase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "databaseVersion",
        "lifecycleState",
        "shardingMethod",
        "replicationMethod",
        "dbDeploymentType",
        "lifecycleDetails",
        "connectionStrings",
        "prefix",
        "privateEndpointIds",
        "notificationTopicIds",
        "latestGsmImageDetails",
        "characterSet",
        "ncharacterSet",
        "listenerPort",
        "listenerPortTls",
        "onsPortLocal",
        "onsPortRemote",
        "scanListenerPort",
        "systemChunkCount",
        "systemRaftReplicationUnitCount",
        "compositeRaftShardSpaces",
        "compositeDataGuardShardSpaces",
        "systemRaftClusters",
        "systemDataGuardDatabases",
        "userShardSpaces",
        "catalogDetails",
        "gsmDetails",
        "gdsControlNodeDetails",
        "dbBackupConfig",
        "autoResourceManagementConfig",
        "gsmSshPublicKey",
        "vcnNsgIds",
        "metadata",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DistributedDatabase(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String databaseVersion,
            LifecycleState lifecycleState,
            ShardingMethod shardingMethod,
            ReplicationMethod replicationMethod,
            DbDeploymentType dbDeploymentType,
            String lifecycleDetails,
            DistributedDbConnectionString connectionStrings,
            String prefix,
            java.util.List<String> privateEndpointIds,
            java.util.List<String> notificationTopicIds,
            DistributedDbGsmImage latestGsmImageDetails,
            String characterSet,
            String ncharacterSet,
            Integer listenerPort,
            Integer listenerPortTls,
            Integer onsPortLocal,
            Integer onsPortRemote,
            Integer scanListenerPort,
            Integer systemChunkCount,
            Integer systemRaftReplicationUnitCount,
            java.util.List<CompositeRaftShardSpace> compositeRaftShardSpaces,
            java.util.List<CompositeDataGuardShardSpace> compositeDataGuardShardSpaces,
            java.util.List<SystemRaftCluster> systemRaftClusters,
            SystemDataGuardDatabase systemDataGuardDatabases,
            java.util.List<UserShardSpace> userShardSpaces,
            java.util.List<DistributedDatabaseCatalog> catalogDetails,
            java.util.List<DistributedDatabaseGsm> gsmDetails,
            java.util.List<DistributedDatabaseGdsControlNode> gdsControlNodeDetails,
            DistributedDbBackupConfig dbBackupConfig,
            AutoResourceManagementConfigurationDetails autoResourceManagementConfig,
            String gsmSshPublicKey,
            java.util.List<VcnNsgIdsDetails> vcnNsgIds,
            DistributedDbMetadata metadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.databaseVersion = databaseVersion;
        this.lifecycleState = lifecycleState;
        this.shardingMethod = shardingMethod;
        this.replicationMethod = replicationMethod;
        this.dbDeploymentType = dbDeploymentType;
        this.lifecycleDetails = lifecycleDetails;
        this.connectionStrings = connectionStrings;
        this.prefix = prefix;
        this.privateEndpointIds = privateEndpointIds;
        this.notificationTopicIds = notificationTopicIds;
        this.latestGsmImageDetails = latestGsmImageDetails;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.listenerPort = listenerPort;
        this.listenerPortTls = listenerPortTls;
        this.onsPortLocal = onsPortLocal;
        this.onsPortRemote = onsPortRemote;
        this.scanListenerPort = scanListenerPort;
        this.systemChunkCount = systemChunkCount;
        this.systemRaftReplicationUnitCount = systemRaftReplicationUnitCount;
        this.compositeRaftShardSpaces = compositeRaftShardSpaces;
        this.compositeDataGuardShardSpaces = compositeDataGuardShardSpaces;
        this.systemRaftClusters = systemRaftClusters;
        this.systemDataGuardDatabases = systemDataGuardDatabases;
        this.userShardSpaces = userShardSpaces;
        this.catalogDetails = catalogDetails;
        this.gsmDetails = gsmDetails;
        this.gdsControlNodeDetails = gdsControlNodeDetails;
        this.dbBackupConfig = dbBackupConfig;
        this.autoResourceManagementConfig = autoResourceManagementConfig;
        this.gsmSshPublicKey = gsmSshPublicKey;
        this.vcnNsgIds = vcnNsgIds;
        this.metadata = metadata;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed database.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed database compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed database compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the Globally distributed database.
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
         * The time the Globally distributed database was created. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Globally distributed database was created. An RFC3339 formatted datetime
         * string.
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
         * The time the Globally distributed database was last updated. An RFC3339 formatted
         * datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Globally distributed database was last updated. An RFC3339 formatted
         * datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Oracle Database version for the shards and catalog used in Globally distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * Oracle Database version for the shards and catalog used in Globally distributed database.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /** Lifecycle states for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle states for the Globally distributed database.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Sharding methods for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("shardingMethod")
        private ShardingMethod shardingMethod;

        /**
         * Sharding methods for the Globally distributed database.
         *
         * @param shardingMethod the value to set
         * @return this builder
         */
        public Builder shardingMethod(ShardingMethod shardingMethod) {
            this.shardingMethod = shardingMethod;
            this.__explicitlySet__.add("shardingMethod");
            return this;
        }
        /**
         * The Replication method for Globally distributed database. Use RAFT for Raft based
         * replication. With RAFT replication, shards cannot have peers details set on them. In case
         * shards need to have peers, please do not set RAFT replicationMethod. For all non RAFT
         * replication cases (with or without peers), please set replicationMethod as DG or do not
         * set any value for replicationMethod.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationMethod")
        private ReplicationMethod replicationMethod;

        /**
         * The Replication method for Globally distributed database. Use RAFT for Raft based
         * replication. With RAFT replication, shards cannot have peers details set on them. In case
         * shards need to have peers, please do not set RAFT replicationMethod. For all non RAFT
         * replication cases (with or without peers), please set replicationMethod as DG or do not
         * set any value for replicationMethod.
         *
         * @param replicationMethod the value to set
         * @return this builder
         */
        public Builder replicationMethod(ReplicationMethod replicationMethod) {
            this.replicationMethod = replicationMethod;
            this.__explicitlySet__.add("replicationMethod");
            return this;
        }
        /** The distributed database deployment type. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbDeploymentType")
        private DbDeploymentType dbDeploymentType;

        /**
         * The distributed database deployment type.
         *
         * @param dbDeploymentType the value to set
         * @return this builder
         */
        public Builder dbDeploymentType(DbDeploymentType dbDeploymentType) {
            this.dbDeploymentType = dbDeploymentType;
            this.__explicitlySet__.add("dbDeploymentType");
            return this;
        }
        /** The lifecycleDetails for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * The lifecycleDetails for the Globally distributed database.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
        private DistributedDbConnectionString connectionStrings;

        public Builder connectionStrings(DistributedDbConnectionString connectionStrings) {
            this.connectionStrings = connectionStrings;
            this.__explicitlySet__.add("connectionStrings");
            return this;
        }
        /**
         * Unique name prefix for the Globally distributed databases. Only alpha-numeric values are
         * allowed. First character has to be a letter followed by any combination of letter and
         * number.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * Unique name prefix for the Globally distributed databases. Only alpha-numeric values are
         * allowed. First character has to be a letter followed by any combination of letter and
         * number.
         *
         * @param prefix the value to set
         * @return this builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private endpoint associated with Globally distributed autonomous database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIds")
        private java.util.List<String> privateEndpointIds;

        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private endpoint associated with Globally distributed autonomous database.
         *
         * @param privateEndpointIds the value to set
         * @return this builder
         */
        public Builder privateEndpointIds(java.util.List<String> privateEndpointIds) {
            this.privateEndpointIds = privateEndpointIds;
            this.__explicitlySet__.add("privateEndpointIds");
            return this;
        }
        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * notification topics associated with the globally distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicIds")
        private java.util.List<String> notificationTopicIds;

        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * notification topics associated with the globally distributed database.
         *
         * @param notificationTopicIds the value to set
         * @return this builder
         */
        public Builder notificationTopicIds(java.util.List<String> notificationTopicIds) {
            this.notificationTopicIds = notificationTopicIds;
            this.__explicitlySet__.add("notificationTopicIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latestGsmImageDetails")
        private DistributedDbGsmImage latestGsmImageDetails;

        public Builder latestGsmImageDetails(DistributedDbGsmImage latestGsmImageDetails) {
            this.latestGsmImageDetails = latestGsmImageDetails;
            this.__explicitlySet__.add("latestGsmImageDetails");
            return this;
        }
        /** The character set for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set for the database.
         *
         * @param characterSet the value to set
         * @return this builder
         */
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /** The national character set for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character set for the database.
         *
         * @param ncharacterSet the value to set
         * @return this builder
         */
        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }
        /**
         * The Global service manager listener port number for the Globally distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        /**
         * The Global service manager listener port number for the Globally distributed database.
         *
         * @param listenerPort the value to set
         * @return this builder
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            this.__explicitlySet__.add("listenerPort");
            return this;
        }
        /** The TLS listener port number for Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
        private Integer listenerPortTls;

        /**
         * The TLS listener port number for Globally distributed database.
         *
         * @param listenerPortTls the value to set
         * @return this builder
         */
        public Builder listenerPortTls(Integer listenerPortTls) {
            this.listenerPortTls = listenerPortTls;
            this.__explicitlySet__.add("listenerPortTls");
            return this;
        }
        /** Ons local port number. */
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
        private Integer onsPortLocal;

        /**
         * Ons local port number.
         *
         * @param onsPortLocal the value to set
         * @return this builder
         */
        public Builder onsPortLocal(Integer onsPortLocal) {
            this.onsPortLocal = onsPortLocal;
            this.__explicitlySet__.add("onsPortLocal");
            return this;
        }
        /** Ons remote port number. */
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
        private Integer onsPortRemote;

        /**
         * Ons remote port number.
         *
         * @param onsPortRemote the value to set
         * @return this builder
         */
        public Builder onsPortRemote(Integer onsPortRemote) {
            this.onsPortRemote = onsPortRemote;
            this.__explicitlySet__.add("onsPortRemote");
            return this;
        }
        /**
         * The TCP SCAN listener port for database clusters with source type
         * XS_NEW_VAULT_AND_CLUSTER or XS_NEW_CLUSTER.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPort")
        private Integer scanListenerPort;

        /**
         * The TCP SCAN listener port for database clusters with source type
         * XS_NEW_VAULT_AND_CLUSTER or XS_NEW_CLUSTER.
         *
         * @param scanListenerPort the value to set
         * @return this builder
         */
        public Builder scanListenerPort(Integer scanListenerPort) {
            this.scanListenerPort = scanListenerPort;
            this.__explicitlySet__.add("scanListenerPort");
            return this;
        }
        /** Count of chunks associated with system raft clusters or system data guard databases. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemChunkCount")
        private Integer systemChunkCount;

        /**
         * Count of chunks associated with system raft clusters or system data guard databases.
         *
         * @param systemChunkCount the value to set
         * @return this builder
         */
        public Builder systemChunkCount(Integer systemChunkCount) {
            this.systemChunkCount = systemChunkCount;
            this.__explicitlySet__.add("systemChunkCount");
            return this;
        }
        /** Number of replication units associated with system raft clusters. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemRaftReplicationUnitCount")
        private Integer systemRaftReplicationUnitCount;

        /**
         * Number of replication units associated with system raft clusters.
         *
         * @param systemRaftReplicationUnitCount the value to set
         * @return this builder
         */
        public Builder systemRaftReplicationUnitCount(Integer systemRaftReplicationUnitCount) {
            this.systemRaftReplicationUnitCount = systemRaftReplicationUnitCount;
            this.__explicitlySet__.add("systemRaftReplicationUnitCount");
            return this;
        }
        /** Collection of composite raft shards. */
        @com.fasterxml.jackson.annotation.JsonProperty("compositeRaftShardSpaces")
        private java.util.List<CompositeRaftShardSpace> compositeRaftShardSpaces;

        /**
         * Collection of composite raft shards.
         *
         * @param compositeRaftShardSpaces the value to set
         * @return this builder
         */
        public Builder compositeRaftShardSpaces(
                java.util.List<CompositeRaftShardSpace> compositeRaftShardSpaces) {
            this.compositeRaftShardSpaces = compositeRaftShardSpaces;
            this.__explicitlySet__.add("compositeRaftShardSpaces");
            return this;
        }
        /** Collection of composite data guard shard spaces. */
        @com.fasterxml.jackson.annotation.JsonProperty("compositeDataGuardShardSpaces")
        private java.util.List<CompositeDataGuardShardSpace> compositeDataGuardShardSpaces;

        /**
         * Collection of composite data guard shard spaces.
         *
         * @param compositeDataGuardShardSpaces the value to set
         * @return this builder
         */
        public Builder compositeDataGuardShardSpaces(
                java.util.List<CompositeDataGuardShardSpace> compositeDataGuardShardSpaces) {
            this.compositeDataGuardShardSpaces = compositeDataGuardShardSpaces;
            this.__explicitlySet__.add("compositeDataGuardShardSpaces");
            return this;
        }
        /** Collection of system raft clusters. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemRaftClusters")
        private java.util.List<SystemRaftCluster> systemRaftClusters;

        /**
         * Collection of system raft clusters.
         *
         * @param systemRaftClusters the value to set
         * @return this builder
         */
        public Builder systemRaftClusters(java.util.List<SystemRaftCluster> systemRaftClusters) {
            this.systemRaftClusters = systemRaftClusters;
            this.__explicitlySet__.add("systemRaftClusters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemDataGuardDatabases")
        private SystemDataGuardDatabase systemDataGuardDatabases;

        public Builder systemDataGuardDatabases(SystemDataGuardDatabase systemDataGuardDatabases) {
            this.systemDataGuardDatabases = systemDataGuardDatabases;
            this.__explicitlySet__.add("systemDataGuardDatabases");
            return this;
        }
        /** Collection of user defined shard spaces. */
        @com.fasterxml.jackson.annotation.JsonProperty("userShardSpaces")
        private java.util.List<UserShardSpace> userShardSpaces;

        /**
         * Collection of user defined shard spaces.
         *
         * @param userShardSpaces the value to set
         * @return this builder
         */
        public Builder userShardSpaces(java.util.List<UserShardSpace> userShardSpaces) {
            this.userShardSpaces = userShardSpaces;
            this.__explicitlySet__.add("userShardSpaces");
            return this;
        }
        /** Catalog details associated with the distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
        private java.util.List<DistributedDatabaseCatalog> catalogDetails;

        /**
         * Catalog details associated with the distributed database.
         *
         * @param catalogDetails the value to set
         * @return this builder
         */
        public Builder catalogDetails(java.util.List<DistributedDatabaseCatalog> catalogDetails) {
            this.catalogDetails = catalogDetails;
            this.__explicitlySet__.add("catalogDetails");
            return this;
        }
        /** Global Service Manager (GSM) instances associated with the distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("gsmDetails")
        private java.util.List<DistributedDatabaseGsm> gsmDetails;

        /**
         * Global Service Manager (GSM) instances associated with the distributed database.
         *
         * @param gsmDetails the value to set
         * @return this builder
         */
        public Builder gsmDetails(java.util.List<DistributedDatabaseGsm> gsmDetails) {
            this.gsmDetails = gsmDetails;
            this.__explicitlySet__.add("gsmDetails");
            return this;
        }
        /**
         * Global Database Services Control(GDS CTL) instances associated with the distributed
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gdsControlNodeDetails")
        private java.util.List<DistributedDatabaseGdsControlNode> gdsControlNodeDetails;

        /**
         * Global Database Services Control(GDS CTL) instances associated with the distributed
         * database.
         *
         * @param gdsControlNodeDetails the value to set
         * @return this builder
         */
        public Builder gdsControlNodeDetails(
                java.util.List<DistributedDatabaseGdsControlNode> gdsControlNodeDetails) {
            this.gdsControlNodeDetails = gdsControlNodeDetails;
            this.__explicitlySet__.add("gdsControlNodeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
        private DistributedDbBackupConfig dbBackupConfig;

        public Builder dbBackupConfig(DistributedDbBackupConfig dbBackupConfig) {
            this.dbBackupConfig = dbBackupConfig;
            this.__explicitlySet__.add("dbBackupConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoResourceManagementConfig")
        private AutoResourceManagementConfigurationDetails autoResourceManagementConfig;

        public Builder autoResourceManagementConfig(
                AutoResourceManagementConfigurationDetails autoResourceManagementConfig) {
            this.autoResourceManagementConfig = autoResourceManagementConfig;
            this.__explicitlySet__.add("autoResourceManagementConfig");
            return this;
        }
        /** The SSH public key for Global service manager instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("gsmSshPublicKey")
        private String gsmSshPublicKey;

        /**
         * The SSH public key for Global service manager instances.
         *
         * @param gsmSshPublicKey the value to set
         * @return this builder
         */
        public Builder gsmSshPublicKey(String gsmSshPublicKey) {
            this.gsmSshPublicKey = gsmSshPublicKey;
            this.__explicitlySet__.add("gsmSshPublicKey");
            return this;
        }
        /**
         * The list of network security group (NSG) details associated with the distributed
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnNsgIds")
        private java.util.List<VcnNsgIdsDetails> vcnNsgIds;

        /**
         * The list of network security group (NSG) details associated with the distributed
         * database.
         *
         * @param vcnNsgIds the value to set
         * @return this builder
         */
        public Builder vcnNsgIds(java.util.List<VcnNsgIdsDetails> vcnNsgIds) {
            this.vcnNsgIds = vcnNsgIds;
            this.__explicitlySet__.add("vcnNsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private DistributedDbMetadata metadata;

        public Builder metadata(DistributedDbMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
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

        public DistributedDatabase build() {
            DistributedDatabase model =
                    new DistributedDatabase(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.databaseVersion,
                            this.lifecycleState,
                            this.shardingMethod,
                            this.replicationMethod,
                            this.dbDeploymentType,
                            this.lifecycleDetails,
                            this.connectionStrings,
                            this.prefix,
                            this.privateEndpointIds,
                            this.notificationTopicIds,
                            this.latestGsmImageDetails,
                            this.characterSet,
                            this.ncharacterSet,
                            this.listenerPort,
                            this.listenerPortTls,
                            this.onsPortLocal,
                            this.onsPortRemote,
                            this.scanListenerPort,
                            this.systemChunkCount,
                            this.systemRaftReplicationUnitCount,
                            this.compositeRaftShardSpaces,
                            this.compositeDataGuardShardSpaces,
                            this.systemRaftClusters,
                            this.systemDataGuardDatabases,
                            this.userShardSpaces,
                            this.catalogDetails,
                            this.gsmDetails,
                            this.gdsControlNodeDetails,
                            this.dbBackupConfig,
                            this.autoResourceManagementConfig,
                            this.gsmSshPublicKey,
                            this.vcnNsgIds,
                            this.metadata,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedDatabase model) {
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
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("shardingMethod")) {
                this.shardingMethod(model.getShardingMethod());
            }
            if (model.wasPropertyExplicitlySet("replicationMethod")) {
                this.replicationMethod(model.getReplicationMethod());
            }
            if (model.wasPropertyExplicitlySet("dbDeploymentType")) {
                this.dbDeploymentType(model.getDbDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("connectionStrings")) {
                this.connectionStrings(model.getConnectionStrings());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIds")) {
                this.privateEndpointIds(model.getPrivateEndpointIds());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicIds")) {
                this.notificationTopicIds(model.getNotificationTopicIds());
            }
            if (model.wasPropertyExplicitlySet("latestGsmImageDetails")) {
                this.latestGsmImageDetails(model.getLatestGsmImageDetails());
            }
            if (model.wasPropertyExplicitlySet("characterSet")) {
                this.characterSet(model.getCharacterSet());
            }
            if (model.wasPropertyExplicitlySet("ncharacterSet")) {
                this.ncharacterSet(model.getNcharacterSet());
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
            if (model.wasPropertyExplicitlySet("scanListenerPort")) {
                this.scanListenerPort(model.getScanListenerPort());
            }
            if (model.wasPropertyExplicitlySet("systemChunkCount")) {
                this.systemChunkCount(model.getSystemChunkCount());
            }
            if (model.wasPropertyExplicitlySet("systemRaftReplicationUnitCount")) {
                this.systemRaftReplicationUnitCount(model.getSystemRaftReplicationUnitCount());
            }
            if (model.wasPropertyExplicitlySet("compositeRaftShardSpaces")) {
                this.compositeRaftShardSpaces(model.getCompositeRaftShardSpaces());
            }
            if (model.wasPropertyExplicitlySet("compositeDataGuardShardSpaces")) {
                this.compositeDataGuardShardSpaces(model.getCompositeDataGuardShardSpaces());
            }
            if (model.wasPropertyExplicitlySet("systemRaftClusters")) {
                this.systemRaftClusters(model.getSystemRaftClusters());
            }
            if (model.wasPropertyExplicitlySet("systemDataGuardDatabases")) {
                this.systemDataGuardDatabases(model.getSystemDataGuardDatabases());
            }
            if (model.wasPropertyExplicitlySet("userShardSpaces")) {
                this.userShardSpaces(model.getUserShardSpaces());
            }
            if (model.wasPropertyExplicitlySet("catalogDetails")) {
                this.catalogDetails(model.getCatalogDetails());
            }
            if (model.wasPropertyExplicitlySet("gsmDetails")) {
                this.gsmDetails(model.getGsmDetails());
            }
            if (model.wasPropertyExplicitlySet("gdsControlNodeDetails")) {
                this.gdsControlNodeDetails(model.getGdsControlNodeDetails());
            }
            if (model.wasPropertyExplicitlySet("dbBackupConfig")) {
                this.dbBackupConfig(model.getDbBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("autoResourceManagementConfig")) {
                this.autoResourceManagementConfig(model.getAutoResourceManagementConfig());
            }
            if (model.wasPropertyExplicitlySet("gsmSshPublicKey")) {
                this.gsmSshPublicKey(model.getGsmSshPublicKey());
            }
            if (model.wasPropertyExplicitlySet("vcnNsgIds")) {
                this.vcnNsgIds(model.getVcnNsgIds());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Globally distributed database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Globally distributed database.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Globally distributed database compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Globally distributed database compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the Globally distributed database.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The time the Globally distributed database was created. An RFC3339 formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Globally distributed database was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Globally distributed database was last updated. An RFC3339 formatted datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Globally distributed database was last updated. An RFC3339 formatted datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Oracle Database version for the shards and catalog used in Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * Oracle Database version for the shards and catalog used in Globally distributed database.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /** Lifecycle states for the Globally distributed database. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Failed("FAILED"),
        NeedsAttention("NEEDS_ATTENTION"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Updating("UPDATING"),
        Creating("CREATING"),

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
    /** Lifecycle states for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle states for the Globally distributed database.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Sharding methods for the Globally distributed database. */
    public enum ShardingMethod implements com.oracle.bmc.http.internal.BmcEnum {
        User("USER"),
        System("SYSTEM"),
        Composite("COMPOSITE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Sharding methods for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("shardingMethod")
    private final ShardingMethod shardingMethod;

    /**
     * Sharding methods for the Globally distributed database.
     *
     * @return the value
     */
    public ShardingMethod getShardingMethod() {
        return shardingMethod;
    }

    /**
     * The Replication method for Globally distributed database. Use RAFT for Raft based
     * replication. With RAFT replication, shards cannot have peers details set on them. In case
     * shards need to have peers, please do not set RAFT replicationMethod. For all non RAFT
     * replication cases (with or without peers), please set replicationMethod as DG or do not set
     * any value for replicationMethod.
     */
    public enum ReplicationMethod implements com.oracle.bmc.http.internal.BmcEnum {
        Raft("RAFT"),
        Dg("DG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReplicationMethod.class);

        private final String value;
        private static java.util.Map<String, ReplicationMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (ReplicationMethod v : ReplicationMethod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReplicationMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReplicationMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReplicationMethod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Replication method for Globally distributed database. Use RAFT for Raft based
     * replication. With RAFT replication, shards cannot have peers details set on them. In case
     * shards need to have peers, please do not set RAFT replicationMethod. For all non RAFT
     * replication cases (with or without peers), please set replicationMethod as DG or do not set
     * any value for replicationMethod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationMethod")
    private final ReplicationMethod replicationMethod;

    /**
     * The Replication method for Globally distributed database. Use RAFT for Raft based
     * replication. With RAFT replication, shards cannot have peers details set on them. In case
     * shards need to have peers, please do not set RAFT replicationMethod. For all non RAFT
     * replication cases (with or without peers), please set replicationMethod as DG or do not set
     * any value for replicationMethod.
     *
     * @return the value
     */
    public ReplicationMethod getReplicationMethod() {
        return replicationMethod;
    }

    /** The distributed database deployment type. */
    public enum DbDeploymentType implements com.oracle.bmc.http.internal.BmcEnum {
        Exadb("EXADB"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DbDeploymentType.class);

        private final String value;
        private static java.util.Map<String, DbDeploymentType> map;

        static {
            map = new java.util.HashMap<>();
            for (DbDeploymentType v : DbDeploymentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DbDeploymentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbDeploymentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DbDeploymentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The distributed database deployment type. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbDeploymentType")
    private final DbDeploymentType dbDeploymentType;

    /**
     * The distributed database deployment type.
     *
     * @return the value
     */
    public DbDeploymentType getDbDeploymentType() {
        return dbDeploymentType;
    }

    /** The lifecycleDetails for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * The lifecycleDetails for the Globally distributed database.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
    private final DistributedDbConnectionString connectionStrings;

    public DistributedDbConnectionString getConnectionStrings() {
        return connectionStrings;
    }

    /**
     * Unique name prefix for the Globally distributed databases. Only alpha-numeric values are
     * allowed. First character has to be a letter followed by any combination of letter and number.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * Unique name prefix for the Globally distributed databases. Only alpha-numeric values are
     * allowed. First character has to be a letter followed by any combination of letter and number.
     *
     * @return the value
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private
     * endpoint associated with Globally distributed autonomous database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIds")
    private final java.util.List<String> privateEndpointIds;

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private
     * endpoint associated with Globally distributed autonomous database.
     *
     * @return the value
     */
    public java.util.List<String> getPrivateEndpointIds() {
        return privateEndpointIds;
    }

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * notification topics associated with the globally distributed database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicIds")
    private final java.util.List<String> notificationTopicIds;

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * notification topics associated with the globally distributed database.
     *
     * @return the value
     */
    public java.util.List<String> getNotificationTopicIds() {
        return notificationTopicIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("latestGsmImageDetails")
    private final DistributedDbGsmImage latestGsmImageDetails;

    public DistributedDbGsmImage getLatestGsmImageDetails() {
        return latestGsmImageDetails;
    }

    /** The character set for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the database.
     *
     * @return the value
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /** The national character set for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character set for the database.
     *
     * @return the value
     */
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /** The Global service manager listener port number for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Integer listenerPort;

    /**
     * The Global service manager listener port number for the Globally distributed database.
     *
     * @return the value
     */
    public Integer getListenerPort() {
        return listenerPort;
    }

    /** The TLS listener port number for Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
    private final Integer listenerPortTls;

    /**
     * The TLS listener port number for Globally distributed database.
     *
     * @return the value
     */
    public Integer getListenerPortTls() {
        return listenerPortTls;
    }

    /** Ons local port number. */
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
    private final Integer onsPortLocal;

    /**
     * Ons local port number.
     *
     * @return the value
     */
    public Integer getOnsPortLocal() {
        return onsPortLocal;
    }

    /** Ons remote port number. */
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
    private final Integer onsPortRemote;

    /**
     * Ons remote port number.
     *
     * @return the value
     */
    public Integer getOnsPortRemote() {
        return onsPortRemote;
    }

    /**
     * The TCP SCAN listener port for database clusters with source type XS_NEW_VAULT_AND_CLUSTER or
     * XS_NEW_CLUSTER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPort")
    private final Integer scanListenerPort;

    /**
     * The TCP SCAN listener port for database clusters with source type XS_NEW_VAULT_AND_CLUSTER or
     * XS_NEW_CLUSTER.
     *
     * @return the value
     */
    public Integer getScanListenerPort() {
        return scanListenerPort;
    }

    /** Count of chunks associated with system raft clusters or system data guard databases. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemChunkCount")
    private final Integer systemChunkCount;

    /**
     * Count of chunks associated with system raft clusters or system data guard databases.
     *
     * @return the value
     */
    public Integer getSystemChunkCount() {
        return systemChunkCount;
    }

    /** Number of replication units associated with system raft clusters. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemRaftReplicationUnitCount")
    private final Integer systemRaftReplicationUnitCount;

    /**
     * Number of replication units associated with system raft clusters.
     *
     * @return the value
     */
    public Integer getSystemRaftReplicationUnitCount() {
        return systemRaftReplicationUnitCount;
    }

    /** Collection of composite raft shards. */
    @com.fasterxml.jackson.annotation.JsonProperty("compositeRaftShardSpaces")
    private final java.util.List<CompositeRaftShardSpace> compositeRaftShardSpaces;

    /**
     * Collection of composite raft shards.
     *
     * @return the value
     */
    public java.util.List<CompositeRaftShardSpace> getCompositeRaftShardSpaces() {
        return compositeRaftShardSpaces;
    }

    /** Collection of composite data guard shard spaces. */
    @com.fasterxml.jackson.annotation.JsonProperty("compositeDataGuardShardSpaces")
    private final java.util.List<CompositeDataGuardShardSpace> compositeDataGuardShardSpaces;

    /**
     * Collection of composite data guard shard spaces.
     *
     * @return the value
     */
    public java.util.List<CompositeDataGuardShardSpace> getCompositeDataGuardShardSpaces() {
        return compositeDataGuardShardSpaces;
    }

    /** Collection of system raft clusters. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemRaftClusters")
    private final java.util.List<SystemRaftCluster> systemRaftClusters;

    /**
     * Collection of system raft clusters.
     *
     * @return the value
     */
    public java.util.List<SystemRaftCluster> getSystemRaftClusters() {
        return systemRaftClusters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("systemDataGuardDatabases")
    private final SystemDataGuardDatabase systemDataGuardDatabases;

    public SystemDataGuardDatabase getSystemDataGuardDatabases() {
        return systemDataGuardDatabases;
    }

    /** Collection of user defined shard spaces. */
    @com.fasterxml.jackson.annotation.JsonProperty("userShardSpaces")
    private final java.util.List<UserShardSpace> userShardSpaces;

    /**
     * Collection of user defined shard spaces.
     *
     * @return the value
     */
    public java.util.List<UserShardSpace> getUserShardSpaces() {
        return userShardSpaces;
    }

    /** Catalog details associated with the distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
    private final java.util.List<DistributedDatabaseCatalog> catalogDetails;

    /**
     * Catalog details associated with the distributed database.
     *
     * @return the value
     */
    public java.util.List<DistributedDatabaseCatalog> getCatalogDetails() {
        return catalogDetails;
    }

    /** Global Service Manager (GSM) instances associated with the distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("gsmDetails")
    private final java.util.List<DistributedDatabaseGsm> gsmDetails;

    /**
     * Global Service Manager (GSM) instances associated with the distributed database.
     *
     * @return the value
     */
    public java.util.List<DistributedDatabaseGsm> getGsmDetails() {
        return gsmDetails;
    }

    /**
     * Global Database Services Control(GDS CTL) instances associated with the distributed database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gdsControlNodeDetails")
    private final java.util.List<DistributedDatabaseGdsControlNode> gdsControlNodeDetails;

    /**
     * Global Database Services Control(GDS CTL) instances associated with the distributed database.
     *
     * @return the value
     */
    public java.util.List<DistributedDatabaseGdsControlNode> getGdsControlNodeDetails() {
        return gdsControlNodeDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
    private final DistributedDbBackupConfig dbBackupConfig;

    public DistributedDbBackupConfig getDbBackupConfig() {
        return dbBackupConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("autoResourceManagementConfig")
    private final AutoResourceManagementConfigurationDetails autoResourceManagementConfig;

    public AutoResourceManagementConfigurationDetails getAutoResourceManagementConfig() {
        return autoResourceManagementConfig;
    }

    /** The SSH public key for Global service manager instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("gsmSshPublicKey")
    private final String gsmSshPublicKey;

    /**
     * The SSH public key for Global service manager instances.
     *
     * @return the value
     */
    public String getGsmSshPublicKey() {
        return gsmSshPublicKey;
    }

    /**
     * The list of network security group (NSG) details associated with the distributed database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnNsgIds")
    private final java.util.List<VcnNsgIdsDetails> vcnNsgIds;

    /**
     * The list of network security group (NSG) details associated with the distributed database.
     *
     * @return the value
     */
    public java.util.List<VcnNsgIdsDetails> getVcnNsgIds() {
        return vcnNsgIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final DistributedDbMetadata metadata;

    public DistributedDbMetadata getMetadata() {
        return metadata;
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
        sb.append("DistributedDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", shardingMethod=").append(String.valueOf(this.shardingMethod));
        sb.append(", replicationMethod=").append(String.valueOf(this.replicationMethod));
        sb.append(", dbDeploymentType=").append(String.valueOf(this.dbDeploymentType));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", connectionStrings=").append(String.valueOf(this.connectionStrings));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", privateEndpointIds=").append(String.valueOf(this.privateEndpointIds));
        sb.append(", notificationTopicIds=").append(String.valueOf(this.notificationTopicIds));
        sb.append(", latestGsmImageDetails=").append(String.valueOf(this.latestGsmImageDetails));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", listenerPortTls=").append(String.valueOf(this.listenerPortTls));
        sb.append(", onsPortLocal=").append(String.valueOf(this.onsPortLocal));
        sb.append(", onsPortRemote=").append(String.valueOf(this.onsPortRemote));
        sb.append(", scanListenerPort=").append(String.valueOf(this.scanListenerPort));
        sb.append(", systemChunkCount=").append(String.valueOf(this.systemChunkCount));
        sb.append(", systemRaftReplicationUnitCount=")
                .append(String.valueOf(this.systemRaftReplicationUnitCount));
        sb.append(", compositeRaftShardSpaces=")
                .append(String.valueOf(this.compositeRaftShardSpaces));
        sb.append(", compositeDataGuardShardSpaces=")
                .append(String.valueOf(this.compositeDataGuardShardSpaces));
        sb.append(", systemRaftClusters=").append(String.valueOf(this.systemRaftClusters));
        sb.append(", systemDataGuardDatabases=")
                .append(String.valueOf(this.systemDataGuardDatabases));
        sb.append(", userShardSpaces=").append(String.valueOf(this.userShardSpaces));
        sb.append(", catalogDetails=").append(String.valueOf(this.catalogDetails));
        sb.append(", gsmDetails=").append(String.valueOf(this.gsmDetails));
        sb.append(", gdsControlNodeDetails=").append(String.valueOf(this.gdsControlNodeDetails));
        sb.append(", dbBackupConfig=").append(String.valueOf(this.dbBackupConfig));
        sb.append(", autoResourceManagementConfig=")
                .append(String.valueOf(this.autoResourceManagementConfig));
        sb.append(", gsmSshPublicKey=").append(String.valueOf(this.gsmSshPublicKey));
        sb.append(", vcnNsgIds=").append(String.valueOf(this.vcnNsgIds));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
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
        if (!(o instanceof DistributedDatabase)) {
            return false;
        }

        DistributedDatabase other = (DistributedDatabase) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.shardingMethod, other.shardingMethod)
                && java.util.Objects.equals(this.replicationMethod, other.replicationMethod)
                && java.util.Objects.equals(this.dbDeploymentType, other.dbDeploymentType)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.connectionStrings, other.connectionStrings)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.privateEndpointIds, other.privateEndpointIds)
                && java.util.Objects.equals(this.notificationTopicIds, other.notificationTopicIds)
                && java.util.Objects.equals(this.latestGsmImageDetails, other.latestGsmImageDetails)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.listenerPortTls, other.listenerPortTls)
                && java.util.Objects.equals(this.onsPortLocal, other.onsPortLocal)
                && java.util.Objects.equals(this.onsPortRemote, other.onsPortRemote)
                && java.util.Objects.equals(this.scanListenerPort, other.scanListenerPort)
                && java.util.Objects.equals(this.systemChunkCount, other.systemChunkCount)
                && java.util.Objects.equals(
                        this.systemRaftReplicationUnitCount, other.systemRaftReplicationUnitCount)
                && java.util.Objects.equals(
                        this.compositeRaftShardSpaces, other.compositeRaftShardSpaces)
                && java.util.Objects.equals(
                        this.compositeDataGuardShardSpaces, other.compositeDataGuardShardSpaces)
                && java.util.Objects.equals(this.systemRaftClusters, other.systemRaftClusters)
                && java.util.Objects.equals(
                        this.systemDataGuardDatabases, other.systemDataGuardDatabases)
                && java.util.Objects.equals(this.userShardSpaces, other.userShardSpaces)
                && java.util.Objects.equals(this.catalogDetails, other.catalogDetails)
                && java.util.Objects.equals(this.gsmDetails, other.gsmDetails)
                && java.util.Objects.equals(this.gdsControlNodeDetails, other.gdsControlNodeDetails)
                && java.util.Objects.equals(this.dbBackupConfig, other.dbBackupConfig)
                && java.util.Objects.equals(
                        this.autoResourceManagementConfig, other.autoResourceManagementConfig)
                && java.util.Objects.equals(this.gsmSshPublicKey, other.gsmSshPublicKey)
                && java.util.Objects.equals(this.vcnNsgIds, other.vcnNsgIds)
                && java.util.Objects.equals(this.metadata, other.metadata)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.shardingMethod == null ? 43 : this.shardingMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationMethod == null ? 43 : this.replicationMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.dbDeploymentType == null ? 43 : this.dbDeploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStrings == null ? 43 : this.connectionStrings.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIds == null
                                ? 43
                                : this.privateEndpointIds.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicIds == null
                                ? 43
                                : this.notificationTopicIds.hashCode());
        result =
                (result * PRIME)
                        + (this.latestGsmImageDetails == null
                                ? 43
                                : this.latestGsmImageDetails.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.listenerPort == null ? 43 : this.listenerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.listenerPortTls == null ? 43 : this.listenerPortTls.hashCode());
        result = (result * PRIME) + (this.onsPortLocal == null ? 43 : this.onsPortLocal.hashCode());
        result =
                (result * PRIME)
                        + (this.onsPortRemote == null ? 43 : this.onsPortRemote.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPort == null ? 43 : this.scanListenerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.systemChunkCount == null ? 43 : this.systemChunkCount.hashCode());
        result =
                (result * PRIME)
                        + (this.systemRaftReplicationUnitCount == null
                                ? 43
                                : this.systemRaftReplicationUnitCount.hashCode());
        result =
                (result * PRIME)
                        + (this.compositeRaftShardSpaces == null
                                ? 43
                                : this.compositeRaftShardSpaces.hashCode());
        result =
                (result * PRIME)
                        + (this.compositeDataGuardShardSpaces == null
                                ? 43
                                : this.compositeDataGuardShardSpaces.hashCode());
        result =
                (result * PRIME)
                        + (this.systemRaftClusters == null
                                ? 43
                                : this.systemRaftClusters.hashCode());
        result =
                (result * PRIME)
                        + (this.systemDataGuardDatabases == null
                                ? 43
                                : this.systemDataGuardDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.userShardSpaces == null ? 43 : this.userShardSpaces.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogDetails == null ? 43 : this.catalogDetails.hashCode());
        result = (result * PRIME) + (this.gsmDetails == null ? 43 : this.gsmDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.gdsControlNodeDetails == null
                                ? 43
                                : this.gdsControlNodeDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.dbBackupConfig == null ? 43 : this.dbBackupConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.autoResourceManagementConfig == null
                                ? 43
                                : this.autoResourceManagementConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.gsmSshPublicKey == null ? 43 : this.gsmSshPublicKey.hashCode());
        result = (result * PRIME) + (this.vcnNsgIds == null ? 43 : this.vcnNsgIds.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
