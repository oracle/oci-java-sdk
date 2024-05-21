/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/**
 * Request details for creation of ATP-Dedicated based sharded database.
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
    builder = CreateDedicatedShardedDatabase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dbDeploymentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDedicatedShardedDatabase extends CreateShardedDatabaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The character set for the new shard database being created. Use database api ListAutonomousDatabaseCharacterSets to
         * get the list of allowed character set for autonomous dedicated database. See documentation:
         * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set for the new shard database being created. Use database api ListAutonomousDatabaseCharacterSets to
         * get the list of allowed character set for autonomous dedicated database. See documentation:
         * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets
         *
         * @param characterSet the value to set
         * @return this builder
         **/
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /**
         * The national character set for the new shard database being created. Use database api ListAutonomousDatabaseCharacterSets to
         * get the list of allowed national character set for autonomous dedicated database. See documentation:
         * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character set for the new shard database being created. Use database api ListAutonomousDatabaseCharacterSets to
         * get the list of allowed national character set for autonomous dedicated database. See documentation:
         * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets
         *
         * @param ncharacterSet the value to set
         * @return this builder
         **/
        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }
        /**
         * The listener port number for sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        /**
         * The listener port number for sharded database.
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
         * Ons port local for sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
        private Integer onsPortLocal;

        /**
         * Ons port local for sharded database.
         * @param onsPortLocal the value to set
         * @return this builder
         **/
        public Builder onsPortLocal(Integer onsPortLocal) {
            this.onsPortLocal = onsPortLocal;
            this.__explicitlySet__.add("onsPortLocal");
            return this;
        }
        /**
         * Ons remote port for sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
        private Integer onsPortRemote;

        /**
         * Ons remote port for sharded database.
         * @param onsPortRemote the value to set
         * @return this builder
         **/
        public Builder onsPortRemote(Integer onsPortRemote) {
            this.onsPortRemote = onsPortRemote;
            this.__explicitlySet__.add("onsPortRemote");
            return this;
        }
        /**
         * Unique name prefix for the sharded databases. Only alpha-numeric values are allowed. First character
         * has to be a letter followed by any combination of letter and number.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * Unique name prefix for the sharded databases. Only alpha-numeric values are allowed. First character
         * has to be a letter followed by any combination of letter and number.
         *
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * Collection of ATP-Dedicated shards that needs to be created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shardDetails")
        private java.util.List<CreateDedicatedShardDetail> shardDetails;

        /**
         * Collection of ATP-Dedicated shards that needs to be created.
         * @param shardDetails the value to set
         * @return this builder
         **/
        public Builder shardDetails(java.util.List<CreateDedicatedShardDetail> shardDetails) {
            this.shardDetails = shardDetails;
            this.__explicitlySet__.add("shardDetails");
            return this;
        }
        /**
         * Collection of ATP-Dedicated catalogs that needs to be created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
        private java.util.List<CreateDedicatedCatalogDetail> catalogDetails;

        /**
         * Collection of ATP-Dedicated catalogs that needs to be created.
         * @param catalogDetails the value to set
         * @return this builder
         **/
        public Builder catalogDetails(java.util.List<CreateDedicatedCatalogDetail> catalogDetails) {
            this.catalogDetails = catalogDetails;
            this.__explicitlySet__.add("catalogDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDedicatedShardedDatabase build() {
            CreateDedicatedShardedDatabase model =
                    new CreateDedicatedShardedDatabase(
                            this.compartmentId,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.clusterCertificateCommonName,
                            this.chunks,
                            this.dbWorkload,
                            this.shardingMethod,
                            this.dbVersion,
                            this.characterSet,
                            this.ncharacterSet,
                            this.listenerPort,
                            this.listenerPortTls,
                            this.onsPortLocal,
                            this.onsPortRemote,
                            this.prefix,
                            this.shardDetails,
                            this.catalogDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDedicatedShardedDatabase model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("clusterCertificateCommonName")) {
                this.clusterCertificateCommonName(model.getClusterCertificateCommonName());
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
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
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
    public CreateDedicatedShardedDatabase(
            String compartmentId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String clusterCertificateCommonName,
            Integer chunks,
            DbWorkload dbWorkload,
            ShardingMethod shardingMethod,
            String dbVersion,
            String characterSet,
            String ncharacterSet,
            Integer listenerPort,
            Integer listenerPortTls,
            Integer onsPortLocal,
            Integer onsPortRemote,
            String prefix,
            java.util.List<CreateDedicatedShardDetail> shardDetails,
            java.util.List<CreateDedicatedCatalogDetail> catalogDetails) {
        super(compartmentId, displayName, freeformTags, definedTags);
        this.clusterCertificateCommonName = clusterCertificateCommonName;
        this.chunks = chunks;
        this.dbWorkload = dbWorkload;
        this.shardingMethod = shardingMethod;
        this.dbVersion = dbVersion;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.listenerPort = listenerPort;
        this.listenerPortTls = listenerPortTls;
        this.onsPortLocal = onsPortLocal;
        this.onsPortRemote = onsPortRemote;
        this.prefix = prefix;
        this.shardDetails = shardDetails;
        this.catalogDetails = catalogDetails;
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
        ;

        private final String value;
        private static java.util.Map<String, DbWorkload> map;

        static {
            map = new java.util.HashMap<>();
            for (DbWorkload v : DbWorkload.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DbWorkload: " + key);
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
     * The character set for the new shard database being created. Use database api ListAutonomousDatabaseCharacterSets to
     * get the list of allowed character set for autonomous dedicated database. See documentation:
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the new shard database being created. Use database api ListAutonomousDatabaseCharacterSets to
     * get the list of allowed character set for autonomous dedicated database. See documentation:
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets
     *
     * @return the value
     **/
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * The national character set for the new shard database being created. Use database api ListAutonomousDatabaseCharacterSets to
     * get the list of allowed national character set for autonomous dedicated database. See documentation:
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character set for the new shard database being created. Use database api ListAutonomousDatabaseCharacterSets to
     * get the list of allowed national character set for autonomous dedicated database. See documentation:
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets
     *
     * @return the value
     **/
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /**
     * The listener port number for sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Integer listenerPort;

    /**
     * The listener port number for sharded database.
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
     * Ons port local for sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortLocal")
    private final Integer onsPortLocal;

    /**
     * Ons port local for sharded database.
     * @return the value
     **/
    public Integer getOnsPortLocal() {
        return onsPortLocal;
    }

    /**
     * Ons remote port for sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onsPortRemote")
    private final Integer onsPortRemote;

    /**
     * Ons remote port for sharded database.
     * @return the value
     **/
    public Integer getOnsPortRemote() {
        return onsPortRemote;
    }

    /**
     * Unique name prefix for the sharded databases. Only alpha-numeric values are allowed. First character
     * has to be a letter followed by any combination of letter and number.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * Unique name prefix for the sharded databases. Only alpha-numeric values are allowed. First character
     * has to be a letter followed by any combination of letter and number.
     *
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    /**
     * Collection of ATP-Dedicated shards that needs to be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shardDetails")
    private final java.util.List<CreateDedicatedShardDetail> shardDetails;

    /**
     * Collection of ATP-Dedicated shards that needs to be created.
     * @return the value
     **/
    public java.util.List<CreateDedicatedShardDetail> getShardDetails() {
        return shardDetails;
    }

    /**
     * Collection of ATP-Dedicated catalogs that needs to be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogDetails")
    private final java.util.List<CreateDedicatedCatalogDetail> catalogDetails;

    /**
     * Collection of ATP-Dedicated catalogs that needs to be created.
     * @return the value
     **/
    public java.util.List<CreateDedicatedCatalogDetail> getCatalogDetails() {
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
        sb.append("CreateDedicatedShardedDatabase(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", clusterCertificateCommonName=")
                .append(String.valueOf(this.clusterCertificateCommonName));
        sb.append(", chunks=").append(String.valueOf(this.chunks));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", shardingMethod=").append(String.valueOf(this.shardingMethod));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", listenerPortTls=").append(String.valueOf(this.listenerPortTls));
        sb.append(", onsPortLocal=").append(String.valueOf(this.onsPortLocal));
        sb.append(", onsPortRemote=").append(String.valueOf(this.onsPortRemote));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
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
        if (!(o instanceof CreateDedicatedShardedDatabase)) {
            return false;
        }

        CreateDedicatedShardedDatabase other = (CreateDedicatedShardedDatabase) o;
        return java.util.Objects.equals(
                        this.clusterCertificateCommonName, other.clusterCertificateCommonName)
                && java.util.Objects.equals(this.chunks, other.chunks)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.shardingMethod, other.shardingMethod)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.listenerPortTls, other.listenerPortTls)
                && java.util.Objects.equals(this.onsPortLocal, other.onsPortLocal)
                && java.util.Objects.equals(this.onsPortRemote, other.onsPortRemote)
                && java.util.Objects.equals(this.prefix, other.prefix)
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
                        + (this.clusterCertificateCommonName == null
                                ? 43
                                : this.clusterCertificateCommonName.hashCode());
        result = (result * PRIME) + (this.chunks == null ? 43 : this.chunks.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result =
                (result * PRIME)
                        + (this.shardingMethod == null ? 43 : this.shardingMethod.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
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
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.shardDetails == null ? 43 : this.shardDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogDetails == null ? 43 : this.catalogDetails.hashCode());
        return result;
    }
}
