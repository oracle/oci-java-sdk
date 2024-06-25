/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/**
 * Details of ATP-D based sharded database.
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
    builder = DedicatedShardedDatabase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dbDeploymentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DedicatedShardedDatabase extends ShardedDatabase {
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
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
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
         * The Replication method for sharded database. Use RAFT for Raft replication, and DG for
         * DataGuard. If replicationMethod is not provided, it defaults to DG.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicationMethod")
        private ReplicationMethod replicationMethod;

        /**
         * The Replication method for sharded database. Use RAFT for Raft replication, and DG for
         * DataGuard. If replicationMethod is not provided, it defaults to DG.
         *
         * @param replicationMethod the value to set
         * @return this builder
         **/
        public Builder replicationMethod(ReplicationMethod replicationMethod) {
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
         * The character set for the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set for the database.
         * @param characterSet the value to set
         * @return this builder
         **/
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /**
         * The national character set for the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character set for the database.
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
         * Oracle Database version number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * Oracle Database version number.
         * @param dbVersion the value to set
         * @return this builder
         **/
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * The GSM listener port number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        /**
         * The GSM listener port number.
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
         * Unique prefix for the sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * Unique prefix for the sharded database.
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * The OCID of private endpoint being used by the sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
        private String privateEndpoint;

        /**
         * The OCID of private endpoint being used by the sharded database.
         * @param privateEndpoint the value to set
         * @return this builder
         **/
        public Builder privateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            this.__explicitlySet__.add("privateEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
        private ConnectionString connectionStrings;

        public Builder connectionStrings(ConnectionString connectionStrings) {
            this.connectionStrings = connectionStrings;
            this.__explicitlySet__.add("connectionStrings");
            return this;
        }
        /**
         * Timezone associated with the sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * Timezone associated with the sharded database.
         * @param timeZone the value to set
         * @return this builder
         **/
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /**
         * Details of GSM instances for the sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gsms")
        private java.util.List<GsmDetails> gsms;

        /**
         * Details of GSM instances for the sharded database.
         * @param gsms the value to set
         * @return this builder
         **/
        public Builder gsms(java.util.List<GsmDetails> gsms) {
            this.gsms = gsms;
            this.__explicitlySet__.add("gsms");
            return this;
        }
        /**
         * Details of ATP-D based shards.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shardDetails")
        private java.util.List<DedicatedShardDetails> shardDetails;

        /**
         * Details of ATP-D based shards.
         * @param shardDetails the value to set
         * @return this builder
         **/
        public Builder shardDetails(java.util.List<DedicatedShardDetails> shardDetails) {
            this.shardDetails = shardDetails;
            this.__explicitlySet__.add("shardDetails");
            return this;
        }
        /**
         * Details of ATP-D based catalogs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
        private java.util.List<DedicatedCatalogDetails> catalogDetails;

        /**
         * Details of ATP-D based catalogs.
         * @param catalogDetails the value to set
         * @return this builder
         **/
        public Builder catalogDetails(java.util.List<DedicatedCatalogDetails> catalogDetails) {
            this.catalogDetails = catalogDetails;
            this.__explicitlySet__.add("catalogDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DedicatedShardedDatabase build() {
            DedicatedShardedDatabase model =
                    new DedicatedShardedDatabase(
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
                            this.characterSet,
                            this.ncharacterSet,
                            this.chunks,
                            this.dbWorkload,
                            this.shardingMethod,
                            this.dbVersion,
                            this.listenerPort,
                            this.listenerPortTls,
                            this.onsPortLocal,
                            this.onsPortRemote,
                            this.prefix,
                            this.privateEndpoint,
                            this.connectionStrings,
                            this.timeZone,
                            this.gsms,
                            this.shardDetails,
                            this.catalogDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DedicatedShardedDatabase model) {
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
            if (model.wasPropertyExplicitlySet("characterSet")) {
                this.characterSet(model.getCharacterSet());
            }
            if (model.wasPropertyExplicitlySet("ncharacterSet")) {
                this.ncharacterSet(model.getNcharacterSet());
            }
            if (model.wasPropertyExplicitlySet("chunks")) {
                this.chunks(model.getChunks());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("shardingMethod")) {
                this.shardingMethod(model.getShardingMethod());
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
            if (model.wasPropertyExplicitlySet("privateEndpoint")) {
                this.privateEndpoint(model.getPrivateEndpoint());
            }
            if (model.wasPropertyExplicitlySet("connectionStrings")) {
                this.connectionStrings(model.getConnectionStrings());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("gsms")) {
                this.gsms(model.getGsms());
            }
            if (model.wasPropertyExplicitlySet("shardDetails")) {
                this.shardDetails(model.getShardDetails());
            }
            if (model.wasPropertyExplicitlySet("catalogDetails")) {
                this.catalogDetails(model.getCatalogDetails());
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
    public DedicatedShardedDatabase(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            ReplicationMethod replicationMethod,
            Integer replicationFactor,
            Integer replicationUnit,
            String clusterCertificateCommonName,
            String characterSet,
            String ncharacterSet,
            Integer chunks,
            DbWorkload dbWorkload,
            ShardingMethod shardingMethod,
            String dbVersion,
            Integer listenerPort,
            Integer listenerPortTls,
            Integer onsPortLocal,
            Integer onsPortRemote,
            String prefix,
            String privateEndpoint,
            ConnectionString connectionStrings,
            String timeZone,
            java.util.List<GsmDetails> gsms,
            java.util.List<DedicatedShardDetails> shardDetails,
            java.util.List<DedicatedCatalogDetails> catalogDetails) {
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
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.chunks = chunks;
        this.dbWorkload = dbWorkload;
        this.shardingMethod = shardingMethod;
        this.dbVersion = dbVersion;
        this.listenerPort = listenerPort;
        this.listenerPortTls = listenerPortTls;
        this.onsPortLocal = onsPortLocal;
        this.onsPortRemote = onsPortRemote;
        this.prefix = prefix;
        this.privateEndpoint = privateEndpoint;
        this.connectionStrings = connectionStrings;
        this.timeZone = timeZone;
        this.gsms = gsms;
        this.shardDetails = shardDetails;
        this.catalogDetails = catalogDetails;
    }

    /**
     * The Replication method for sharded database. Use RAFT for Raft replication, and DG for
     * DataGuard. If replicationMethod is not provided, it defaults to DG.
     *
     **/
    public enum ReplicationMethod {
        Raft("RAFT"),
        Dg("DG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The Replication method for sharded database. Use RAFT for Raft replication, and DG for
     * DataGuard. If replicationMethod is not provided, it defaults to DG.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationMethod")
    private final ReplicationMethod replicationMethod;

    /**
     * The Replication method for sharded database. Use RAFT for Raft replication, and DG for
     * DataGuard. If replicationMethod is not provided, it defaults to DG.
     *
     * @return the value
     **/
    public ReplicationMethod getReplicationMethod() {
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
     * The character set for the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the database.
     * @return the value
     **/
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * The national character set for the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character set for the database.
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
     * Oracle Database version number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * Oracle Database version number.
     * @return the value
     **/
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The GSM listener port number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Integer listenerPort;

    /**
     * The GSM listener port number.
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
     * Unique prefix for the sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * Unique prefix for the sharded database.
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    /**
     * The OCID of private endpoint being used by the sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    private final String privateEndpoint;

    /**
     * The OCID of private endpoint being used by the sharded database.
     * @return the value
     **/
    public String getPrivateEndpoint() {
        return privateEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
    private final ConnectionString connectionStrings;

    public ConnectionString getConnectionStrings() {
        return connectionStrings;
    }

    /**
     * Timezone associated with the sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * Timezone associated with the sharded database.
     * @return the value
     **/
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Details of GSM instances for the sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gsms")
    private final java.util.List<GsmDetails> gsms;

    /**
     * Details of GSM instances for the sharded database.
     * @return the value
     **/
    public java.util.List<GsmDetails> getGsms() {
        return gsms;
    }

    /**
     * Details of ATP-D based shards.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shardDetails")
    private final java.util.List<DedicatedShardDetails> shardDetails;

    /**
     * Details of ATP-D based shards.
     * @return the value
     **/
    public java.util.List<DedicatedShardDetails> getShardDetails() {
        return shardDetails;
    }

    /**
     * Details of ATP-D based catalogs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
    private final java.util.List<DedicatedCatalogDetails> catalogDetails;

    /**
     * Details of ATP-D based catalogs.
     * @return the value
     **/
    public java.util.List<DedicatedCatalogDetails> getCatalogDetails() {
        return catalogDetails;
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
        sb.append("DedicatedShardedDatabase(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", replicationMethod=").append(String.valueOf(this.replicationMethod));
        sb.append(", replicationFactor=").append(String.valueOf(this.replicationFactor));
        sb.append(", replicationUnit=").append(String.valueOf(this.replicationUnit));
        sb.append(", clusterCertificateCommonName=")
                .append(String.valueOf(this.clusterCertificateCommonName));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", chunks=").append(String.valueOf(this.chunks));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", shardingMethod=").append(String.valueOf(this.shardingMethod));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", listenerPortTls=").append(String.valueOf(this.listenerPortTls));
        sb.append(", onsPortLocal=").append(String.valueOf(this.onsPortLocal));
        sb.append(", onsPortRemote=").append(String.valueOf(this.onsPortRemote));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", privateEndpoint=").append(String.valueOf(this.privateEndpoint));
        sb.append(", connectionStrings=").append(String.valueOf(this.connectionStrings));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", gsms=").append(String.valueOf(this.gsms));
        sb.append(", shardDetails=").append(String.valueOf(this.shardDetails));
        sb.append(", catalogDetails=").append(String.valueOf(this.catalogDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DedicatedShardedDatabase)) {
            return false;
        }

        DedicatedShardedDatabase other = (DedicatedShardedDatabase) o;
        return java.util.Objects.equals(this.replicationMethod, other.replicationMethod)
                && java.util.Objects.equals(this.replicationFactor, other.replicationFactor)
                && java.util.Objects.equals(this.replicationUnit, other.replicationUnit)
                && java.util.Objects.equals(
                        this.clusterCertificateCommonName, other.clusterCertificateCommonName)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.chunks, other.chunks)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.shardingMethod, other.shardingMethod)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.listenerPortTls, other.listenerPortTls)
                && java.util.Objects.equals(this.onsPortLocal, other.onsPortLocal)
                && java.util.Objects.equals(this.onsPortRemote, other.onsPortRemote)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.privateEndpoint, other.privateEndpoint)
                && java.util.Objects.equals(this.connectionStrings, other.connectionStrings)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.gsms, other.gsms)
                && java.util.Objects.equals(this.shardDetails, other.shardDetails)
                && java.util.Objects.equals(this.catalogDetails, other.catalogDetails)
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
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.chunks == null ? 43 : this.chunks.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result =
                (result * PRIME)
                        + (this.shardingMethod == null ? 43 : this.shardingMethod.hashCode());
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
                        + (this.privateEndpoint == null ? 43 : this.privateEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStrings == null ? 43 : this.connectionStrings.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.gsms == null ? 43 : this.gsms.hashCode());
        result = (result * PRIME) + (this.shardDetails == null ? 43 : this.shardDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogDetails == null ? 43 : this.catalogDetails.hashCode());
        return result;
    }
}
