/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Details required for creation of the Globally distributed autonomous database. <br>
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
        builder = CreateDistributedAutonomousDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDistributedAutonomousDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "databaseVersion",
        "prefix",
        "privateEndpointIds",
        "notificationTopicIds",
        "dbWorkloadType",
        "characterSet",
        "ncharacterSet",
        "listenerPort",
        "listenerPortTls",
        "onsPortLocal",
        "onsPortRemote",
        "systemChunkCount",
        "systemRaftReplicationUnitCount",
        "compositeRaftShardSpaces",
        "compositeDataGuardShardSpaces",
        "systemRaftClusters",
        "systemDataGuardDatabases",
        "userShardSpaces",
        "catalogDetails",
        "dbBackupConfig",
        "vcnNsgIds",
        "freeformTags",
        "definedTags"
    })
    public CreateDistributedAutonomousDatabaseDetails(
            String compartmentId,
            String displayName,
            String databaseVersion,
            String prefix,
            java.util.List<String> privateEndpointIds,
            java.util.List<String> notificationTopicIds,
            DbWorkloadType dbWorkloadType,
            String characterSet,
            String ncharacterSet,
            Integer listenerPort,
            Integer listenerPortTls,
            Integer onsPortLocal,
            Integer onsPortRemote,
            Integer systemChunkCount,
            Integer systemRaftReplicationUnitCount,
            java.util.List<CreateAutonomousCompositeRaftShardSpaceDetails> compositeRaftShardSpaces,
            java.util.List<CreateAutonomousCompositeDataGuardShardSpaceDetails>
                    compositeDataGuardShardSpaces,
            java.util.List<CreateAutonomousSystemRaftClusterDetails> systemRaftClusters,
            CreateAutonomousSystemDataGuardDatabaseDetails systemDataGuardDatabases,
            java.util.List<CreateAutonomousUserShardSpaceDetails> userShardSpaces,
            java.util.List<CreateAutonomousCatalogDetails> catalogDetails,
            DistributedAutonomousDbBackupConfig dbBackupConfig,
            java.util.List<VcnNsgIdsDetails> vcnNsgIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.databaseVersion = databaseVersion;
        this.prefix = prefix;
        this.privateEndpointIds = privateEndpointIds;
        this.notificationTopicIds = notificationTopicIds;
        this.dbWorkloadType = dbWorkloadType;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.listenerPort = listenerPort;
        this.listenerPortTls = listenerPortTls;
        this.onsPortLocal = onsPortLocal;
        this.onsPortRemote = onsPortRemote;
        this.systemChunkCount = systemChunkCount;
        this.systemRaftReplicationUnitCount = systemRaftReplicationUnitCount;
        this.compositeRaftShardSpaces = compositeRaftShardSpaces;
        this.compositeDataGuardShardSpaces = compositeDataGuardShardSpaces;
        this.systemRaftClusters = systemRaftClusters;
        this.systemDataGuardDatabases = systemDataGuardDatabases;
        this.userShardSpaces = userShardSpaces;
        this.catalogDetails = catalogDetails;
        this.dbBackupConfig = dbBackupConfig;
        this.vcnNsgIds = vcnNsgIds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed autonomous database compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Globally distributed autonomous database compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the Globally distributed autonomous database. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the Globally distributed autonomous database.
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
         * Oracle Database version for the shards and catalog used in Globally distributed
         * autonomous database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * Oracle Database version for the shards and catalog used in Globally distributed
         * autonomous database.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /**
         * Unique name prefix for the Globally distributed autonomous databases. Only alpha-numeric
         * values are allowed. First character has to be a letter followed by any combination of
         * letter and number.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * Unique name prefix for the Globally distributed autonomous databases. Only alpha-numeric
         * values are allowed. First character has to be a letter followed by any combination of
         * letter and number.
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
         * notification topics associated with the globally distributed autonomous database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicIds")
        private java.util.List<String> notificationTopicIds;

        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * notification topics associated with the globally distributed autonomous database.
         *
         * @param notificationTopicIds the value to set
         * @return this builder
         */
        public Builder notificationTopicIds(java.util.List<String> notificationTopicIds) {
            this.notificationTopicIds = notificationTopicIds;
            this.__explicitlySet__.add("notificationTopicIds");
            return this;
        }
        /** Possible workload types. Currently only OLTP workload type is supported. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkloadType")
        private DbWorkloadType dbWorkloadType;

        /**
         * Possible workload types. Currently only OLTP workload type is supported.
         *
         * @param dbWorkloadType the value to set
         * @return this builder
         */
        public Builder dbWorkloadType(DbWorkloadType dbWorkloadType) {
            this.dbWorkloadType = dbWorkloadType;
            this.__explicitlySet__.add("dbWorkloadType");
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
         * The listener port number for the Globally distributed autonomous database. The listener
         * port number has to be unique for a customer tenancy across all distributed autonomous
         * databases. Same port number should not be re-used for any other distributed autonomous
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        /**
         * The listener port number for the Globally distributed autonomous database. The listener
         * port number has to be unique for a customer tenancy across all distributed autonomous
         * databases. Same port number should not be re-used for any other distributed autonomous
         * database.
         *
         * @param listenerPort the value to set
         * @return this builder
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            this.__explicitlySet__.add("listenerPort");
            return this;
        }
        /**
         * The TLS listener port number for Globally distributed autonomous database. The TLS
         * listener port number has to be unique for a customer tenancy across all distributed
         * autonomous databases. Same port number should not be re-used for any other distributed
         * autonomous database. The listenerPortTls is mandatory for dedicated infrastructure based
         * distributed autonomous databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
        private Integer listenerPortTls;

        /**
         * The TLS listener port number for Globally distributed autonomous database. The TLS
         * listener port number has to be unique for a customer tenancy across all distributed
         * autonomous databases. Same port number should not be re-used for any other distributed
         * autonomous database. The listenerPortTls is mandatory for dedicated infrastructure based
         * distributed autonomous databases.
         *
         * @param listenerPortTls the value to set
         * @return this builder
         */
        public Builder listenerPortTls(Integer listenerPortTls) {
            this.listenerPortTls = listenerPortTls;
            this.__explicitlySet__.add("listenerPortTls");
            return this;
        }
        /**
         * Ons local port number for Globally distributed autonomous database. The onsPortLocal has
         * to be unique for a customer tenancy across all distributed autonomous databases. Same
         * port number should not be re-used for any other distributed autonomous database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
        private Integer onsPortLocal;

        /**
         * Ons local port number for Globally distributed autonomous database. The onsPortLocal has
         * to be unique for a customer tenancy across all distributed autonomous databases. Same
         * port number should not be re-used for any other distributed autonomous database.
         *
         * @param onsPortLocal the value to set
         * @return this builder
         */
        public Builder onsPortLocal(Integer onsPortLocal) {
            this.onsPortLocal = onsPortLocal;
            this.__explicitlySet__.add("onsPortLocal");
            return this;
        }
        /**
         * Ons remote port number for Globally distributed autonomous database. The onsPortRemote
         * has to be unique for a customer tenancy across all distributed autonomous databases. Same
         * port number should not be re-used for any other distributed autonomous database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
        private Integer onsPortRemote;

        /**
         * Ons remote port number for Globally distributed autonomous database. The onsPortRemote
         * has to be unique for a customer tenancy across all distributed autonomous databases. Same
         * port number should not be re-used for any other distributed autonomous database.
         *
         * @param onsPortRemote the value to set
         * @return this builder
         */
        public Builder onsPortRemote(Integer onsPortRemote) {
            this.onsPortRemote = onsPortRemote;
            this.__explicitlySet__.add("onsPortRemote");
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
        private java.util.List<CreateAutonomousCompositeRaftShardSpaceDetails>
                compositeRaftShardSpaces;

        /**
         * Collection of composite raft shards.
         *
         * @param compositeRaftShardSpaces the value to set
         * @return this builder
         */
        public Builder compositeRaftShardSpaces(
                java.util.List<CreateAutonomousCompositeRaftShardSpaceDetails>
                        compositeRaftShardSpaces) {
            this.compositeRaftShardSpaces = compositeRaftShardSpaces;
            this.__explicitlySet__.add("compositeRaftShardSpaces");
            return this;
        }
        /** Collection of composite data guard shard spaces. */
        @com.fasterxml.jackson.annotation.JsonProperty("compositeDataGuardShardSpaces")
        private java.util.List<CreateAutonomousCompositeDataGuardShardSpaceDetails>
                compositeDataGuardShardSpaces;

        /**
         * Collection of composite data guard shard spaces.
         *
         * @param compositeDataGuardShardSpaces the value to set
         * @return this builder
         */
        public Builder compositeDataGuardShardSpaces(
                java.util.List<CreateAutonomousCompositeDataGuardShardSpaceDetails>
                        compositeDataGuardShardSpaces) {
            this.compositeDataGuardShardSpaces = compositeDataGuardShardSpaces;
            this.__explicitlySet__.add("compositeDataGuardShardSpaces");
            return this;
        }
        /** Collection of system raft clusters. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemRaftClusters")
        private java.util.List<CreateAutonomousSystemRaftClusterDetails> systemRaftClusters;

        /**
         * Collection of system raft clusters.
         *
         * @param systemRaftClusters the value to set
         * @return this builder
         */
        public Builder systemRaftClusters(
                java.util.List<CreateAutonomousSystemRaftClusterDetails> systemRaftClusters) {
            this.systemRaftClusters = systemRaftClusters;
            this.__explicitlySet__.add("systemRaftClusters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemDataGuardDatabases")
        private CreateAutonomousSystemDataGuardDatabaseDetails systemDataGuardDatabases;

        public Builder systemDataGuardDatabases(
                CreateAutonomousSystemDataGuardDatabaseDetails systemDataGuardDatabases) {
            this.systemDataGuardDatabases = systemDataGuardDatabases;
            this.__explicitlySet__.add("systemDataGuardDatabases");
            return this;
        }
        /** Collection of user defined shard spaces. */
        @com.fasterxml.jackson.annotation.JsonProperty("userShardSpaces")
        private java.util.List<CreateAutonomousUserShardSpaceDetails> userShardSpaces;

        /**
         * Collection of user defined shard spaces.
         *
         * @param userShardSpaces the value to set
         * @return this builder
         */
        public Builder userShardSpaces(
                java.util.List<CreateAutonomousUserShardSpaceDetails> userShardSpaces) {
            this.userShardSpaces = userShardSpaces;
            this.__explicitlySet__.add("userShardSpaces");
            return this;
        }
        /** Collection of catalog for the Globally distributed autonomous database. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
        private java.util.List<CreateAutonomousCatalogDetails> catalogDetails;

        /**
         * Collection of catalog for the Globally distributed autonomous database.
         *
         * @param catalogDetails the value to set
         * @return this builder
         */
        public Builder catalogDetails(
                java.util.List<CreateAutonomousCatalogDetails> catalogDetails) {
            this.catalogDetails = catalogDetails;
            this.__explicitlySet__.add("catalogDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
        private DistributedAutonomousDbBackupConfig dbBackupConfig;

        public Builder dbBackupConfig(DistributedAutonomousDbBackupConfig dbBackupConfig) {
            this.dbBackupConfig = dbBackupConfig;
            this.__explicitlySet__.add("dbBackupConfig");
            return this;
        }
        /**
         * The list of network security group (NSG) details to be associated with the distributed
         * autonomous database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnNsgIds")
        private java.util.List<VcnNsgIdsDetails> vcnNsgIds;

        /**
         * The list of network security group (NSG) details to be associated with the distributed
         * autonomous database.
         *
         * @param vcnNsgIds the value to set
         * @return this builder
         */
        public Builder vcnNsgIds(java.util.List<VcnNsgIdsDetails> vcnNsgIds) {
            this.vcnNsgIds = vcnNsgIds;
            this.__explicitlySet__.add("vcnNsgIds");
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

        public CreateDistributedAutonomousDatabaseDetails build() {
            CreateDistributedAutonomousDatabaseDetails model =
                    new CreateDistributedAutonomousDatabaseDetails(
                            this.compartmentId,
                            this.displayName,
                            this.databaseVersion,
                            this.prefix,
                            this.privateEndpointIds,
                            this.notificationTopicIds,
                            this.dbWorkloadType,
                            this.characterSet,
                            this.ncharacterSet,
                            this.listenerPort,
                            this.listenerPortTls,
                            this.onsPortLocal,
                            this.onsPortRemote,
                            this.systemChunkCount,
                            this.systemRaftReplicationUnitCount,
                            this.compositeRaftShardSpaces,
                            this.compositeDataGuardShardSpaces,
                            this.systemRaftClusters,
                            this.systemDataGuardDatabases,
                            this.userShardSpaces,
                            this.catalogDetails,
                            this.dbBackupConfig,
                            this.vcnNsgIds,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDistributedAutonomousDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
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
            if (model.wasPropertyExplicitlySet("dbWorkloadType")) {
                this.dbWorkloadType(model.getDbWorkloadType());
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
            if (model.wasPropertyExplicitlySet("dbBackupConfig")) {
                this.dbBackupConfig(model.getDbBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("vcnNsgIds")) {
                this.vcnNsgIds(model.getVcnNsgIds());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Globally distributed autonomous database compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Globally distributed autonomous database compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the Globally distributed autonomous database. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the Globally distributed autonomous database.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Oracle Database version for the shards and catalog used in Globally distributed autonomous
     * database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * Oracle Database version for the shards and catalog used in Globally distributed autonomous
     * database.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * Unique name prefix for the Globally distributed autonomous databases. Only alpha-numeric
     * values are allowed. First character has to be a letter followed by any combination of letter
     * and number.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * Unique name prefix for the Globally distributed autonomous databases. Only alpha-numeric
     * values are allowed. First character has to be a letter followed by any combination of letter
     * and number.
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
     * notification topics associated with the globally distributed autonomous database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicIds")
    private final java.util.List<String> notificationTopicIds;

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * notification topics associated with the globally distributed autonomous database.
     *
     * @return the value
     */
    public java.util.List<String> getNotificationTopicIds() {
        return notificationTopicIds;
    }

    /** Possible workload types. Currently only OLTP workload type is supported. */
    public enum DbWorkloadType implements com.oracle.bmc.http.internal.BmcEnum {
        Oltp("OLTP"),
        Dw("DW"),
        ;

        private final String value;
        private static java.util.Map<String, DbWorkloadType> map;

        static {
            map = new java.util.HashMap<>();
            for (DbWorkloadType v : DbWorkloadType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DbWorkloadType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbWorkloadType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DbWorkloadType: " + key);
        }
    };
    /** Possible workload types. Currently only OLTP workload type is supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkloadType")
    private final DbWorkloadType dbWorkloadType;

    /**
     * Possible workload types. Currently only OLTP workload type is supported.
     *
     * @return the value
     */
    public DbWorkloadType getDbWorkloadType() {
        return dbWorkloadType;
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

    /**
     * The listener port number for the Globally distributed autonomous database. The listener port
     * number has to be unique for a customer tenancy across all distributed autonomous databases.
     * Same port number should not be re-used for any other distributed autonomous database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Integer listenerPort;

    /**
     * The listener port number for the Globally distributed autonomous database. The listener port
     * number has to be unique for a customer tenancy across all distributed autonomous databases.
     * Same port number should not be re-used for any other distributed autonomous database.
     *
     * @return the value
     */
    public Integer getListenerPort() {
        return listenerPort;
    }

    /**
     * The TLS listener port number for Globally distributed autonomous database. The TLS listener
     * port number has to be unique for a customer tenancy across all distributed autonomous
     * databases. Same port number should not be re-used for any other distributed autonomous
     * database. The listenerPortTls is mandatory for dedicated infrastructure based distributed
     * autonomous databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
    private final Integer listenerPortTls;

    /**
     * The TLS listener port number for Globally distributed autonomous database. The TLS listener
     * port number has to be unique for a customer tenancy across all distributed autonomous
     * databases. Same port number should not be re-used for any other distributed autonomous
     * database. The listenerPortTls is mandatory for dedicated infrastructure based distributed
     * autonomous databases.
     *
     * @return the value
     */
    public Integer getListenerPortTls() {
        return listenerPortTls;
    }

    /**
     * Ons local port number for Globally distributed autonomous database. The onsPortLocal has to
     * be unique for a customer tenancy across all distributed autonomous databases. Same port
     * number should not be re-used for any other distributed autonomous database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
    private final Integer onsPortLocal;

    /**
     * Ons local port number for Globally distributed autonomous database. The onsPortLocal has to
     * be unique for a customer tenancy across all distributed autonomous databases. Same port
     * number should not be re-used for any other distributed autonomous database.
     *
     * @return the value
     */
    public Integer getOnsPortLocal() {
        return onsPortLocal;
    }

    /**
     * Ons remote port number for Globally distributed autonomous database. The onsPortRemote has to
     * be unique for a customer tenancy across all distributed autonomous databases. Same port
     * number should not be re-used for any other distributed autonomous database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
    private final Integer onsPortRemote;

    /**
     * Ons remote port number for Globally distributed autonomous database. The onsPortRemote has to
     * be unique for a customer tenancy across all distributed autonomous databases. Same port
     * number should not be re-used for any other distributed autonomous database.
     *
     * @return the value
     */
    public Integer getOnsPortRemote() {
        return onsPortRemote;
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
    private final java.util.List<CreateAutonomousCompositeRaftShardSpaceDetails>
            compositeRaftShardSpaces;

    /**
     * Collection of composite raft shards.
     *
     * @return the value
     */
    public java.util.List<CreateAutonomousCompositeRaftShardSpaceDetails>
            getCompositeRaftShardSpaces() {
        return compositeRaftShardSpaces;
    }

    /** Collection of composite data guard shard spaces. */
    @com.fasterxml.jackson.annotation.JsonProperty("compositeDataGuardShardSpaces")
    private final java.util.List<CreateAutonomousCompositeDataGuardShardSpaceDetails>
            compositeDataGuardShardSpaces;

    /**
     * Collection of composite data guard shard spaces.
     *
     * @return the value
     */
    public java.util.List<CreateAutonomousCompositeDataGuardShardSpaceDetails>
            getCompositeDataGuardShardSpaces() {
        return compositeDataGuardShardSpaces;
    }

    /** Collection of system raft clusters. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemRaftClusters")
    private final java.util.List<CreateAutonomousSystemRaftClusterDetails> systemRaftClusters;

    /**
     * Collection of system raft clusters.
     *
     * @return the value
     */
    public java.util.List<CreateAutonomousSystemRaftClusterDetails> getSystemRaftClusters() {
        return systemRaftClusters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("systemDataGuardDatabases")
    private final CreateAutonomousSystemDataGuardDatabaseDetails systemDataGuardDatabases;

    public CreateAutonomousSystemDataGuardDatabaseDetails getSystemDataGuardDatabases() {
        return systemDataGuardDatabases;
    }

    /** Collection of user defined shard spaces. */
    @com.fasterxml.jackson.annotation.JsonProperty("userShardSpaces")
    private final java.util.List<CreateAutonomousUserShardSpaceDetails> userShardSpaces;

    /**
     * Collection of user defined shard spaces.
     *
     * @return the value
     */
    public java.util.List<CreateAutonomousUserShardSpaceDetails> getUserShardSpaces() {
        return userShardSpaces;
    }

    /** Collection of catalog for the Globally distributed autonomous database. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
    private final java.util.List<CreateAutonomousCatalogDetails> catalogDetails;

    /**
     * Collection of catalog for the Globally distributed autonomous database.
     *
     * @return the value
     */
    public java.util.List<CreateAutonomousCatalogDetails> getCatalogDetails() {
        return catalogDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
    private final DistributedAutonomousDbBackupConfig dbBackupConfig;

    public DistributedAutonomousDbBackupConfig getDbBackupConfig() {
        return dbBackupConfig;
    }

    /**
     * The list of network security group (NSG) details to be associated with the distributed
     * autonomous database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnNsgIds")
    private final java.util.List<VcnNsgIdsDetails> vcnNsgIds;

    /**
     * The list of network security group (NSG) details to be associated with the distributed
     * autonomous database.
     *
     * @return the value
     */
    public java.util.List<VcnNsgIdsDetails> getVcnNsgIds() {
        return vcnNsgIds;
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
        sb.append("CreateDistributedAutonomousDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", privateEndpointIds=").append(String.valueOf(this.privateEndpointIds));
        sb.append(", notificationTopicIds=").append(String.valueOf(this.notificationTopicIds));
        sb.append(", dbWorkloadType=").append(String.valueOf(this.dbWorkloadType));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", listenerPortTls=").append(String.valueOf(this.listenerPortTls));
        sb.append(", onsPortLocal=").append(String.valueOf(this.onsPortLocal));
        sb.append(", onsPortRemote=").append(String.valueOf(this.onsPortRemote));
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
        sb.append(", dbBackupConfig=").append(String.valueOf(this.dbBackupConfig));
        sb.append(", vcnNsgIds=").append(String.valueOf(this.vcnNsgIds));
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
        if (!(o instanceof CreateDistributedAutonomousDatabaseDetails)) {
            return false;
        }

        CreateDistributedAutonomousDatabaseDetails other =
                (CreateDistributedAutonomousDatabaseDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.privateEndpointIds, other.privateEndpointIds)
                && java.util.Objects.equals(this.notificationTopicIds, other.notificationTopicIds)
                && java.util.Objects.equals(this.dbWorkloadType, other.dbWorkloadType)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.listenerPortTls, other.listenerPortTls)
                && java.util.Objects.equals(this.onsPortLocal, other.onsPortLocal)
                && java.util.Objects.equals(this.onsPortRemote, other.onsPortRemote)
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
                && java.util.Objects.equals(this.dbBackupConfig, other.dbBackupConfig)
                && java.util.Objects.equals(this.vcnNsgIds, other.vcnNsgIds)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
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
                        + (this.dbWorkloadType == null ? 43 : this.dbWorkloadType.hashCode());
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
        result =
                (result * PRIME)
                        + (this.dbBackupConfig == null ? 43 : this.dbBackupConfig.hashCode());
        result = (result * PRIME) + (this.vcnNsgIds == null ? 43 : this.vcnNsgIds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
