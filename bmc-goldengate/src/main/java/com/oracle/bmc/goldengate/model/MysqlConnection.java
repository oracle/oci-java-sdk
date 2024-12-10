/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the metadata of a MySQL Connection.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MysqlConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MysqlConnection extends Connection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ingressIps")
        private java.util.List<IngressIpDetails> ingressIps;

        public Builder ingressIps(java.util.List<IngressIpDetails> ingressIps) {
            this.ingressIps = ingressIps;
            this.__explicitlySet__.add("ingressIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingMethod")
        private RoutingMethod routingMethod;

        public Builder routingMethod(RoutingMethod routingMethod) {
            this.routingMethod = routingMethod;
            this.__explicitlySet__.add("routingMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
        private Boolean doesUseSecretIds;

        public Builder doesUseSecretIds(Boolean doesUseSecretIds) {
            this.doesUseSecretIds = doesUseSecretIds;
            this.__explicitlySet__.add("doesUseSecretIds");
            return this;
        }
        /**
         * The MySQL technology type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The MySQL technology type.
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given technology.
         * This username must already exist and be available by the system/application to be connected to
         * and must conform to the case sensitivty requirments defined in it.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given technology.
         * This username must already exist and be available by the system/application to be connected to
         * and must conform to the case sensitivty requirments defined in it.
         *
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The name or address of a host.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The name or address of a host.
         *
         * @param host the value to set
         * @return this builder
         **/
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /**
         * The port of an endpoint usually specified for a connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port of an endpoint usually specified for a connection.
         *
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The name of the database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The name of the database.
         *
         * @param databaseName the value to set
         * @return this builder
         **/
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /**
         * Security Protocol for MySQL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private SecurityProtocol securityProtocol;

        /**
         * Security Protocol for MySQL.
         * @param securityProtocol the value to set
         * @return this builder
         **/
        public Builder securityProtocol(SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * SSL modes for MySQL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
        private SslMode sslMode;

        /**
         * SSL modes for MySQL.
         * @param sslMode the value to set
         * @return this builder
         **/
        public Builder sslMode(SslMode sslMode) {
            this.sslMode = sslMode;
            this.__explicitlySet__.add("sslMode");
            return this;
        }
        /**
         * Deprecated: this field will be removed in future versions. Either specify the private IP in the connectionString or host
         * field, or make sure the host name is resolvable in the target VCN.
         * <p>
         * The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server).
         * In case the privateIp is provided, the subnetId must also be provided.
         * In case the privateIp (and the subnetId) is not provided it is assumed the datasource is publicly accessible.
         * In case the connection is accessible only privately, the lack of privateIp will result in not being able to access the connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * Deprecated: this field will be removed in future versions. Either specify the private IP in the connectionString or host
         * field, or make sure the host name is resolvable in the target VCN.
         * <p>
         * The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server).
         * In case the privateIp is provided, the subnetId must also be provided.
         * In case the privateIp (and the subnetId) is not provided it is assumed the datasource is publicly accessible.
         * In case the connection is accessible only privately, the lack of privateIp will result in not being able to access the connection.
         *
         * @param privateIp the value to set
         * @return this builder
         **/
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }
        /**
         * An array of name-value pair attribute entries.
         * Used as additional parameters in connection string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
        private java.util.List<NameValuePair> additionalAttributes;

        /**
         * An array of name-value pair attribute entries.
         * Used as additional parameters in connection string.
         *
         * @param additionalAttributes the value to set
         * @return this builder
         **/
        public Builder additionalAttributes(java.util.List<NameValuePair> additionalAttributes) {
            this.additionalAttributes = additionalAttributes;
            this.__explicitlySet__.add("additionalAttributes");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database system being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database system being referenced.
         *
         * @param dbSystemId the value to set
         * @return this builder
         **/
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
         * The password Oracle GoldenGate uses to connect the associated system of the given technology.
         * It must conform to the specific security requirements including length, case sensitivity, and so on.
         * If secretId is used plaintext field must not be provided.
         * Note: When provided, 'password' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
         * The password Oracle GoldenGate uses to connect the associated system of the given technology.
         * It must conform to the specific security requirements including length, case sensitivity, and so on.
         * If secretId is used plaintext field must not be provided.
         * Note: When provided, 'password' field must not be provided.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         **/
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the Client Key
         * - The content of a .pem or .crt file containing the client private key (for 2-way SSL).
         * Note: When provided, 'sslKey' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeySecretId")
        private String sslKeySecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the Client Key
         * - The content of a .pem or .crt file containing the client private key (for 2-way SSL).
         * Note: When provided, 'sslKey' field must not be provided.
         *
         * @param sslKeySecretId the value to set
         * @return this builder
         **/
        public Builder sslKeySecretId(String sslKeySecretId) {
            this.sslKeySecretId = sslKeySecretId;
            this.__explicitlySet__.add("sslKeySecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MysqlConnection build() {
            MysqlConnection model =
                    new MysqlConnection(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.locks,
                            this.vaultId,
                            this.keyId,
                            this.ingressIps,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.technologyType,
                            this.username,
                            this.host,
                            this.port,
                            this.databaseName,
                            this.securityProtocol,
                            this.sslMode,
                            this.privateIp,
                            this.additionalAttributes,
                            this.dbSystemId,
                            this.passwordSecretId,
                            this.sslKeySecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MysqlConnection model) {
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("ingressIps")) {
                this.ingressIps(model.getIngressIps());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("routingMethod")) {
                this.routingMethod(model.getRoutingMethod());
            }
            if (model.wasPropertyExplicitlySet("doesUseSecretIds")) {
                this.doesUseSecretIds(model.getDoesUseSecretIds());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("sslMode")) {
                this.sslMode(model.getSslMode());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("additionalAttributes")) {
                this.additionalAttributes(model.getAdditionalAttributes());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("sslKeySecretId")) {
                this.sslKeySecretId(model.getSslKeySecretId());
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
    public MysqlConnection(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<ResourceLock> locks,
            String vaultId,
            String keyId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            TechnologyType technologyType,
            String username,
            String host,
            Integer port,
            String databaseName,
            SecurityProtocol securityProtocol,
            SslMode sslMode,
            String privateIp,
            java.util.List<NameValuePair> additionalAttributes,
            String dbSystemId,
            String passwordSecretId,
            String sslKeySecretId) {
        super(
                id,
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                systemTags,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                locks,
                vaultId,
                keyId,
                ingressIps,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds);
        this.technologyType = technologyType;
        this.username = username;
        this.host = host;
        this.port = port;
        this.databaseName = databaseName;
        this.securityProtocol = securityProtocol;
        this.sslMode = sslMode;
        this.privateIp = privateIp;
        this.additionalAttributes = additionalAttributes;
        this.dbSystemId = dbSystemId;
        this.passwordSecretId = passwordSecretId;
        this.sslKeySecretId = sslKeySecretId;
    }

    /**
     * The MySQL technology type.
     **/
    public enum TechnologyType {
        AmazonAuroraMysql("AMAZON_AURORA_MYSQL"),
        AmazonRdsMariadb("AMAZON_RDS_MARIADB"),
        AmazonRdsMysql("AMAZON_RDS_MYSQL"),
        AzureMysql("AZURE_MYSQL"),
        GoogleCloudSqlMysql("GOOGLE_CLOUD_SQL_MYSQL"),
        Mariadb("MARIADB"),
        MysqlHeatwaveOnAzure("MYSQL_HEATWAVE_ON_AZURE"),
        MysqlHeatwaveOnAws("MYSQL_HEATWAVE_ON_AWS"),
        MysqlServer("MYSQL_SERVER"),
        OciMysql("OCI_MYSQL"),
        Singlestoredb("SINGLESTOREDB"),
        SinglestoredbCloud("SINGLESTOREDB_CLOUD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TechnologyType.class);

        private final String value;
        private static java.util.Map<String, TechnologyType> map;

        static {
            map = new java.util.HashMap<>();
            for (TechnologyType v : TechnologyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TechnologyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TechnologyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TechnologyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The MySQL technology type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The MySQL technology type.
     * @return the value
     **/
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected to
     * and must conform to the case sensitivty requirments defined in it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected to
     * and must conform to the case sensitivty requirments defined in it.
     *
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The name or address of a host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The name or address of a host.
     *
     * @return the value
     **/
    public String getHost() {
        return host;
    }

    /**
     * The port of an endpoint usually specified for a connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port of an endpoint usually specified for a connection.
     *
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * The name of the database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The name of the database.
     *
     * @return the value
     **/
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Security Protocol for MySQL.
     **/
    public enum SecurityProtocol {
        Plain("PLAIN"),
        Tls("TLS"),
        Mtls("MTLS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SecurityProtocol.class);

        private final String value;
        private static java.util.Map<String, SecurityProtocol> map;

        static {
            map = new java.util.HashMap<>();
            for (SecurityProtocol v : SecurityProtocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SecurityProtocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SecurityProtocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SecurityProtocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Security Protocol for MySQL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final SecurityProtocol securityProtocol;

    /**
     * Security Protocol for MySQL.
     * @return the value
     **/
    public SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * SSL modes for MySQL.
     **/
    public enum SslMode {
        Disabled("DISABLED"),
        Preferred("PREFERRED"),
        Required("REQUIRED"),
        VerifyCa("VERIFY_CA"),
        VerifyIdentity("VERIFY_IDENTITY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SslMode.class);

        private final String value;
        private static java.util.Map<String, SslMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SslMode v : SslMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SslMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SslMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SslMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * SSL modes for MySQL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
    private final SslMode sslMode;

    /**
     * SSL modes for MySQL.
     * @return the value
     **/
    public SslMode getSslMode() {
        return sslMode;
    }

    /**
     * Deprecated: this field will be removed in future versions. Either specify the private IP in the connectionString or host
     * field, or make sure the host name is resolvable in the target VCN.
     * <p>
     * The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server).
     * In case the privateIp is provided, the subnetId must also be provided.
     * In case the privateIp (and the subnetId) is not provided it is assumed the datasource is publicly accessible.
     * In case the connection is accessible only privately, the lack of privateIp will result in not being able to access the connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * Deprecated: this field will be removed in future versions. Either specify the private IP in the connectionString or host
     * field, or make sure the host name is resolvable in the target VCN.
     * <p>
     * The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server).
     * In case the privateIp is provided, the subnetId must also be provided.
     * In case the privateIp (and the subnetId) is not provided it is assumed the datasource is publicly accessible.
     * In case the connection is accessible only privately, the lack of privateIp will result in not being able to access the connection.
     *
     * @return the value
     **/
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * An array of name-value pair attribute entries.
     * Used as additional parameters in connection string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
    private final java.util.List<NameValuePair> additionalAttributes;

    /**
     * An array of name-value pair attribute entries.
     * Used as additional parameters in connection string.
     *
     * @return the value
     **/
    public java.util.List<NameValuePair> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database system being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database system being referenced.
     *
     * @return the value
     **/
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and so on.
     * If secretId is used plaintext field must not be provided.
     * Note: When provided, 'password' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored.
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and so on.
     * If secretId is used plaintext field must not be provided.
     * Note: When provided, 'password' field must not be provided.
     *
     * @return the value
     **/
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the Client Key
     * - The content of a .pem or .crt file containing the client private key (for 2-way SSL).
     * Note: When provided, 'sslKey' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeySecretId")
    private final String sslKeySecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret that stores the Client Key
     * - The content of a .pem or .crt file containing the client private key (for 2-way SSL).
     * Note: When provided, 'sslKey' field must not be provided.
     *
     * @return the value
     **/
    public String getSslKeySecretId() {
        return sslKeySecretId;
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
        sb.append("MysqlConnection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", sslMode=").append(String.valueOf(this.sslMode));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", additionalAttributes=").append(String.valueOf(this.additionalAttributes));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", sslKeySecretId=").append(String.valueOf(this.sslKeySecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MysqlConnection)) {
            return false;
        }

        MysqlConnection other = (MysqlConnection) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.sslMode, other.sslMode)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.additionalAttributes, other.additionalAttributes)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.sslKeySecretId, other.sslKeySecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result = (result * PRIME) + (this.sslMode == null ? 43 : this.sslMode.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalAttributes == null
                                ? 43
                                : this.additionalAttributes.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.sslKeySecretId == null ? 43 : this.sslKeySecretId.hashCode());
        return result;
    }
}
