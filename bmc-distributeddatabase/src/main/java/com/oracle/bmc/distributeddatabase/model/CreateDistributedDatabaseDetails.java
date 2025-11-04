/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details required for creation of the Globally distributed database. <br>
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
        builder = CreateDistributedDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDistributedDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "databaseVersion",
        "prefix",
        "privateEndpointIds",
        "shardingMethod",
        "characterSet",
        "ncharacterSet",
        "chunks",
        "listenerPort",
        "listenerPortTls",
        "onsPortLocal",
        "onsPortRemote",
        "replicationMethod",
        "replicationFactor",
        "replicationUnit",
        "dbDeploymentType",
        "shardDetails",
        "catalogDetails",
        "gsmSshPublicKey",
        "dbBackupConfig",
        "freeformTags",
        "definedTags"
    })
    public CreateDistributedDatabaseDetails(
            String compartmentId,
            String displayName,
            String databaseVersion,
            String prefix,
            java.util.List<String> privateEndpointIds,
            ShardingMethod shardingMethod,
            String characterSet,
            String ncharacterSet,
            Integer chunks,
            Integer listenerPort,
            Integer listenerPortTls,
            Integer onsPortLocal,
            Integer onsPortRemote,
            ReplicationMethod replicationMethod,
            Integer replicationFactor,
            Integer replicationUnit,
            DbDeploymentType dbDeploymentType,
            java.util.List<CreateDistributedDatabaseShardDetails> shardDetails,
            java.util.List<CreateDistributedDatabaseCatalogDetails> catalogDetails,
            String gsmSshPublicKey,
            DistributedDbBackupConfig dbBackupConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.databaseVersion = databaseVersion;
        this.prefix = prefix;
        this.privateEndpointIds = privateEndpointIds;
        this.shardingMethod = shardingMethod;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.chunks = chunks;
        this.listenerPort = listenerPort;
        this.listenerPortTls = listenerPortTls;
        this.onsPortLocal = onsPortLocal;
        this.onsPortRemote = onsPortRemote;
        this.replicationMethod = replicationMethod;
        this.replicationFactor = replicationFactor;
        this.replicationUnit = replicationUnit;
        this.dbDeploymentType = dbDeploymentType;
        this.shardDetails = shardDetails;
        this.catalogDetails = catalogDetails;
        this.gsmSshPublicKey = gsmSshPublicKey;
        this.dbBackupConfig = dbBackupConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** Sharding Methods for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("shardingMethod")
        private ShardingMethod shardingMethod;

        /**
         * Sharding Methods for the Globally distributed database.
         *
         * @param shardingMethod the value to set
         * @return this builder
         */
        public Builder shardingMethod(ShardingMethod shardingMethod) {
            this.shardingMethod = shardingMethod;
            this.__explicitlySet__.add("shardingMethod");
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
         * Number of chunks in a shardspace. The value of chunks must be greater than 2 times the
         * size of the largest shardgroup in any shardspace. Chunks is required to be provided for
         * distributed databases being created with SYSTEM shardingMethod. For USER shardingMethod,
         * chunks should not be set in create payload.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("chunks")
        private Integer chunks;

        /**
         * Number of chunks in a shardspace. The value of chunks must be greater than 2 times the
         * size of the largest shardgroup in any shardspace. Chunks is required to be provided for
         * distributed databases being created with SYSTEM shardingMethod. For USER shardingMethod,
         * chunks should not be set in create payload.
         *
         * @param chunks the value to set
         * @return this builder
         */
        public Builder chunks(Integer chunks) {
            this.chunks = chunks;
            this.__explicitlySet__.add("chunks");
            return this;
        }
        /**
         * The listener port number for the Globally distributed database. The listener port number
         * has to be unique for a customer tenancy across all distributed databases. Same port
         * number should not be re-used for any other distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        /**
         * The listener port number for the Globally distributed database. The listener port number
         * has to be unique for a customer tenancy across all distributed databases. Same port
         * number should not be re-used for any other distributed database.
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
         * The TLS listener port number for the Globally distributed database. The TLS listener port
         * number has to be unique for a customer tenancy across all distributed databases. Same
         * port number should not be re-used for any other distributed database. For BASE_DB and
         * EXADB_XS based distributed databases, tls is not supported hence the listenerPortTls is
         * not needed to be provided in create payload.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
        private Integer listenerPortTls;

        /**
         * The TLS listener port number for the Globally distributed database. The TLS listener port
         * number has to be unique for a customer tenancy across all distributed databases. Same
         * port number should not be re-used for any other distributed database. For BASE_DB and
         * EXADB_XS based distributed databases, tls is not supported hence the listenerPortTls is
         * not needed to be provided in create payload.
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
         * The ons local port number for the Globally distributed database. The onsPortLocal has to
         * be unique for a customer tenancy across all distributed databases. Same port number
         * should not be re-used for any other distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
        private Integer onsPortLocal;

        /**
         * The ons local port number for the Globally distributed database. The onsPortLocal has to
         * be unique for a customer tenancy across all distributed databases. Same port number
         * should not be re-used for any other distributed database.
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
         * The ons remote port number for the Globally distributed database. The onsPortRemote has
         * to be unique for a customer tenancy across all distributed databases. Same port number
         * should not be re-used for any other distributed database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
        private Integer onsPortRemote;

        /**
         * The ons remote port number for the Globally distributed database. The onsPortRemote has
         * to be unique for a customer tenancy across all distributed databases. Same port number
         * should not be re-used for any other distributed database.
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
        /**
         * The Replication factor for RAFT replication based Globally distributed database.
         * Currently supported values are 3, 5 and 7.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
        private Integer replicationFactor;

        /**
         * The Replication factor for RAFT replication based Globally distributed database.
         * Currently supported values are 3, 5 and 7.
         *
         * @param replicationFactor the value to set
         * @return this builder
         */
        public Builder replicationFactor(Integer replicationFactor) {
            this.replicationFactor = replicationFactor;
            this.__explicitlySet__.add("replicationFactor");
            return this;
        }
        /**
         * The replication unit count for RAFT based distributed database. For RAFT replication
         * based Globally distributed database, the value should be at least twice the number of
         * shards.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationUnit")
        private Integer replicationUnit;

        /**
         * The replication unit count for RAFT based distributed database. For RAFT replication
         * based Globally distributed database, the value should be at least twice the number of
         * shards.
         *
         * @param replicationUnit the value to set
         * @return this builder
         */
        public Builder replicationUnit(Integer replicationUnit) {
            this.replicationUnit = replicationUnit;
            this.__explicitlySet__.add("replicationUnit");
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
        /** Collection of shards for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("shardDetails")
        private java.util.List<CreateDistributedDatabaseShardDetails> shardDetails;

        /**
         * Collection of shards for the Globally distributed database.
         *
         * @param shardDetails the value to set
         * @return this builder
         */
        public Builder shardDetails(
                java.util.List<CreateDistributedDatabaseShardDetails> shardDetails) {
            this.shardDetails = shardDetails;
            this.__explicitlySet__.add("shardDetails");
            return this;
        }
        /** Collection of catalog for the Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
        private java.util.List<CreateDistributedDatabaseCatalogDetails> catalogDetails;

        /**
         * Collection of catalog for the Globally distributed database.
         *
         * @param catalogDetails the value to set
         * @return this builder
         */
        public Builder catalogDetails(
                java.util.List<CreateDistributedDatabaseCatalogDetails> catalogDetails) {
            this.catalogDetails = catalogDetails;
            this.__explicitlySet__.add("catalogDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
        private DistributedDbBackupConfig dbBackupConfig;

        public Builder dbBackupConfig(DistributedDbBackupConfig dbBackupConfig) {
            this.dbBackupConfig = dbBackupConfig;
            this.__explicitlySet__.add("dbBackupConfig");
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

        public CreateDistributedDatabaseDetails build() {
            CreateDistributedDatabaseDetails model =
                    new CreateDistributedDatabaseDetails(
                            this.compartmentId,
                            this.displayName,
                            this.databaseVersion,
                            this.prefix,
                            this.privateEndpointIds,
                            this.shardingMethod,
                            this.characterSet,
                            this.ncharacterSet,
                            this.chunks,
                            this.listenerPort,
                            this.listenerPortTls,
                            this.onsPortLocal,
                            this.onsPortRemote,
                            this.replicationMethod,
                            this.replicationFactor,
                            this.replicationUnit,
                            this.dbDeploymentType,
                            this.shardDetails,
                            this.catalogDetails,
                            this.gsmSshPublicKey,
                            this.dbBackupConfig,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDistributedDatabaseDetails model) {
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
            if (model.wasPropertyExplicitlySet("replicationMethod")) {
                this.replicationMethod(model.getReplicationMethod());
            }
            if (model.wasPropertyExplicitlySet("replicationFactor")) {
                this.replicationFactor(model.getReplicationFactor());
            }
            if (model.wasPropertyExplicitlySet("replicationUnit")) {
                this.replicationUnit(model.getReplicationUnit());
            }
            if (model.wasPropertyExplicitlySet("dbDeploymentType")) {
                this.dbDeploymentType(model.getDbDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("shardDetails")) {
                this.shardDetails(model.getShardDetails());
            }
            if (model.wasPropertyExplicitlySet("catalogDetails")) {
                this.catalogDetails(model.getCatalogDetails());
            }
            if (model.wasPropertyExplicitlySet("gsmSshPublicKey")) {
                this.gsmSshPublicKey(model.getGsmSshPublicKey());
            }
            if (model.wasPropertyExplicitlySet("dbBackupConfig")) {
                this.dbBackupConfig(model.getDbBackupConfig());
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

    /** Sharding Methods for the Globally distributed database. */
    public enum ShardingMethod implements com.oracle.bmc.http.internal.BmcEnum {
        User("USER"),
        System("SYSTEM"),
        ;

        private final String value;
        private static java.util.Map<String, ShardingMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (ShardingMethod v : ShardingMethod.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ShardingMethod: " + key);
        }
    };
    /** Sharding Methods for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("shardingMethod")
    private final ShardingMethod shardingMethod;

    /**
     * Sharding Methods for the Globally distributed database.
     *
     * @return the value
     */
    public ShardingMethod getShardingMethod() {
        return shardingMethod;
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
     * Number of chunks in a shardspace. The value of chunks must be greater than 2 times the size
     * of the largest shardgroup in any shardspace. Chunks is required to be provided for
     * distributed databases being created with SYSTEM shardingMethod. For USER shardingMethod,
     * chunks should not be set in create payload.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chunks")
    private final Integer chunks;

    /**
     * Number of chunks in a shardspace. The value of chunks must be greater than 2 times the size
     * of the largest shardgroup in any shardspace. Chunks is required to be provided for
     * distributed databases being created with SYSTEM shardingMethod. For USER shardingMethod,
     * chunks should not be set in create payload.
     *
     * @return the value
     */
    public Integer getChunks() {
        return chunks;
    }

    /**
     * The listener port number for the Globally distributed database. The listener port number has
     * to be unique for a customer tenancy across all distributed databases. Same port number should
     * not be re-used for any other distributed database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Integer listenerPort;

    /**
     * The listener port number for the Globally distributed database. The listener port number has
     * to be unique for a customer tenancy across all distributed databases. Same port number should
     * not be re-used for any other distributed database.
     *
     * @return the value
     */
    public Integer getListenerPort() {
        return listenerPort;
    }

    /**
     * The TLS listener port number for the Globally distributed database. The TLS listener port
     * number has to be unique for a customer tenancy across all distributed databases. Same port
     * number should not be re-used for any other distributed database. For BASE_DB and EXADB_XS
     * based distributed databases, tls is not supported hence the listenerPortTls is not needed to
     * be provided in create payload.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPortTls")
    private final Integer listenerPortTls;

    /**
     * The TLS listener port number for the Globally distributed database. The TLS listener port
     * number has to be unique for a customer tenancy across all distributed databases. Same port
     * number should not be re-used for any other distributed database. For BASE_DB and EXADB_XS
     * based distributed databases, tls is not supported hence the listenerPortTls is not needed to
     * be provided in create payload.
     *
     * @return the value
     */
    public Integer getListenerPortTls() {
        return listenerPortTls;
    }

    /**
     * The ons local port number for the Globally distributed database. The onsPortLocal has to be
     * unique for a customer tenancy across all distributed databases. Same port number should not
     * be re-used for any other distributed database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
    private final Integer onsPortLocal;

    /**
     * The ons local port number for the Globally distributed database. The onsPortLocal has to be
     * unique for a customer tenancy across all distributed databases. Same port number should not
     * be re-used for any other distributed database.
     *
     * @return the value
     */
    public Integer getOnsPortLocal() {
        return onsPortLocal;
    }

    /**
     * The ons remote port number for the Globally distributed database. The onsPortRemote has to be
     * unique for a customer tenancy across all distributed databases. Same port number should not
     * be re-used for any other distributed database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
    private final Integer onsPortRemote;

    /**
     * The ons remote port number for the Globally distributed database. The onsPortRemote has to be
     * unique for a customer tenancy across all distributed databases. Same port number should not
     * be re-used for any other distributed database.
     *
     * @return the value
     */
    public Integer getOnsPortRemote() {
        return onsPortRemote;
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
        ;

        private final String value;
        private static java.util.Map<String, ReplicationMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (ReplicationMethod v : ReplicationMethod.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ReplicationMethod: " + key);
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

    /**
     * The Replication factor for RAFT replication based Globally distributed database. Currently
     * supported values are 3, 5 and 7.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
    private final Integer replicationFactor;

    /**
     * The Replication factor for RAFT replication based Globally distributed database. Currently
     * supported values are 3, 5 and 7.
     *
     * @return the value
     */
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    /**
     * The replication unit count for RAFT based distributed database. For RAFT replication based
     * Globally distributed database, the value should be at least twice the number of shards.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationUnit")
    private final Integer replicationUnit;

    /**
     * The replication unit count for RAFT based distributed database. For RAFT replication based
     * Globally distributed database, the value should be at least twice the number of shards.
     *
     * @return the value
     */
    public Integer getReplicationUnit() {
        return replicationUnit;
    }

    /** The distributed database deployment type. */
    public enum DbDeploymentType implements com.oracle.bmc.http.internal.BmcEnum {
        ExadbXs("EXADB_XS"),
        ;

        private final String value;
        private static java.util.Map<String, DbDeploymentType> map;

        static {
            map = new java.util.HashMap<>();
            for (DbDeploymentType v : DbDeploymentType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DbDeploymentType: " + key);
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

    /** Collection of shards for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("shardDetails")
    private final java.util.List<CreateDistributedDatabaseShardDetails> shardDetails;

    /**
     * Collection of shards for the Globally distributed database.
     *
     * @return the value
     */
    public java.util.List<CreateDistributedDatabaseShardDetails> getShardDetails() {
        return shardDetails;
    }

    /** Collection of catalog for the Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
    private final java.util.List<CreateDistributedDatabaseCatalogDetails> catalogDetails;

    /**
     * Collection of catalog for the Globally distributed database.
     *
     * @return the value
     */
    public java.util.List<CreateDistributedDatabaseCatalogDetails> getCatalogDetails() {
        return catalogDetails;
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

    @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
    private final DistributedDbBackupConfig dbBackupConfig;

    public DistributedDbBackupConfig getDbBackupConfig() {
        return dbBackupConfig;
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
        sb.append("CreateDistributedDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", privateEndpointIds=").append(String.valueOf(this.privateEndpointIds));
        sb.append(", shardingMethod=").append(String.valueOf(this.shardingMethod));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", chunks=").append(String.valueOf(this.chunks));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", listenerPortTls=").append(String.valueOf(this.listenerPortTls));
        sb.append(", onsPortLocal=").append(String.valueOf(this.onsPortLocal));
        sb.append(", onsPortRemote=").append(String.valueOf(this.onsPortRemote));
        sb.append(", replicationMethod=").append(String.valueOf(this.replicationMethod));
        sb.append(", replicationFactor=").append(String.valueOf(this.replicationFactor));
        sb.append(", replicationUnit=").append(String.valueOf(this.replicationUnit));
        sb.append(", dbDeploymentType=").append(String.valueOf(this.dbDeploymentType));
        sb.append(", shardDetails=").append(String.valueOf(this.shardDetails));
        sb.append(", catalogDetails=").append(String.valueOf(this.catalogDetails));
        sb.append(", gsmSshPublicKey=").append(String.valueOf(this.gsmSshPublicKey));
        sb.append(", dbBackupConfig=").append(String.valueOf(this.dbBackupConfig));
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
        if (!(o instanceof CreateDistributedDatabaseDetails)) {
            return false;
        }

        CreateDistributedDatabaseDetails other = (CreateDistributedDatabaseDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.privateEndpointIds, other.privateEndpointIds)
                && java.util.Objects.equals(this.shardingMethod, other.shardingMethod)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.chunks, other.chunks)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.listenerPortTls, other.listenerPortTls)
                && java.util.Objects.equals(this.onsPortLocal, other.onsPortLocal)
                && java.util.Objects.equals(this.onsPortRemote, other.onsPortRemote)
                && java.util.Objects.equals(this.replicationMethod, other.replicationMethod)
                && java.util.Objects.equals(this.replicationFactor, other.replicationFactor)
                && java.util.Objects.equals(this.replicationUnit, other.replicationUnit)
                && java.util.Objects.equals(this.dbDeploymentType, other.dbDeploymentType)
                && java.util.Objects.equals(this.shardDetails, other.shardDetails)
                && java.util.Objects.equals(this.catalogDetails, other.catalogDetails)
                && java.util.Objects.equals(this.gsmSshPublicKey, other.gsmSshPublicKey)
                && java.util.Objects.equals(this.dbBackupConfig, other.dbBackupConfig)
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
                        + (this.shardingMethod == null ? 43 : this.shardingMethod.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.chunks == null ? 43 : this.chunks.hashCode());
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
                        + (this.replicationMethod == null ? 43 : this.replicationMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationFactor == null ? 43 : this.replicationFactor.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationUnit == null ? 43 : this.replicationUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.dbDeploymentType == null ? 43 : this.dbDeploymentType.hashCode());
        result = (result * PRIME) + (this.shardDetails == null ? 43 : this.shardDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogDetails == null ? 43 : this.catalogDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.gsmSshPublicKey == null ? 43 : this.gsmSshPublicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.dbBackupConfig == null ? 43 : this.dbBackupConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
