/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Represents the metadata of an Oracle Database Connection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OracleConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OracleConnection extends Connection {
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

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicationUsername")
        private String replicationUsername;

        public Builder replicationUsername(String replicationUsername) {
            this.replicationUsername = replicationUsername;
            this.__explicitlySet__.add("replicationUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicationPassword")
        private String replicationPassword;

        public Builder replicationPassword(String replicationPassword) {
            this.replicationPassword = replicationPassword;
            this.__explicitlySet__.add("replicationPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }
        /**
         * The Oracle technology type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The Oracle technology type.
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * Connect descriptor or Easy Connect Naming method used to connect to a database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * Connect descriptor or Easy Connect Naming method used to connect to a database.
         *
         * @param connectionString the value to set
         * @return this builder
         **/
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }
        /**
         * The OCID of the database being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The OCID of the database being referenced.
         *
         * @param databaseId the value to set
         * @return this builder
         **/
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * Name of the host the SSH key is valid for.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshHost")
        private String sshHost;

        /**
         * Name of the host the SSH key is valid for.
         *
         * @param sshHost the value to set
         * @return this builder
         **/
        public Builder sshHost(String sshHost) {
            this.sshHost = sshHost;
            this.__explicitlySet__.add("sshHost");
            return this;
        }
        /**
         * Private SSH key string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshKey")
        private String sshKey;

        /**
         * Private SSH key string.
         *
         * @param sshKey the value to set
         * @return this builder
         **/
        public Builder sshKey(String sshKey) {
            this.sshKey = sshKey;
            this.__explicitlySet__.add("sshKey");
            return this;
        }
        /**
         * The username (credential) used when creating or updating this resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshUser")
        private String sshUser;

        /**
         * The username (credential) used when creating or updating this resource.
         *
         * @param sshUser the value to set
         * @return this builder
         **/
        public Builder sshUser(String sshUser) {
            this.sshUser = sshUser;
            this.__explicitlySet__.add("sshUser");
            return this;
        }
        /**
         * Sudo location
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshSudoLocation")
        private String sshSudoLocation;

        /**
         * Sudo location
         *
         * @param sshSudoLocation the value to set
         * @return this builder
         **/
        public Builder sshSudoLocation(String sshSudoLocation) {
            this.sshSudoLocation = sshSudoLocation;
            this.__explicitlySet__.add("sshSudoLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleConnection build() {
            OracleConnection model =
                    new OracleConnection(
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
                            this.vaultId,
                            this.keyId,
                            this.subnetId,
                            this.ingressIps,
                            this.nsgIds,
                            this.username,
                            this.password,
                            this.replicationUsername,
                            this.replicationPassword,
                            this.secretId,
                            this.privateEndpointId,
                            this.technologyType,
                            this.connectionString,
                            this.databaseId,
                            this.sshHost,
                            this.sshKey,
                            this.sshUser,
                            this.sshSudoLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleConnection model) {
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
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("ingressIps")) {
                this.ingressIps(model.getIngressIps());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("replicationUsername")) {
                this.replicationUsername(model.getReplicationUsername());
            }
            if (model.wasPropertyExplicitlySet("replicationPassword")) {
                this.replicationPassword(model.getReplicationPassword());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointId")) {
                this.privateEndpointId(model.getPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("sshHost")) {
                this.sshHost(model.getSshHost());
            }
            if (model.wasPropertyExplicitlySet("sshKey")) {
                this.sshKey(model.getSshKey());
            }
            if (model.wasPropertyExplicitlySet("sshUser")) {
                this.sshUser(model.getSshUser());
            }
            if (model.wasPropertyExplicitlySet("sshSudoLocation")) {
                this.sshSudoLocation(model.getSshSudoLocation());
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
    public OracleConnection(
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
            String vaultId,
            String keyId,
            String subnetId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            String username,
            String password,
            String replicationUsername,
            String replicationPassword,
            String secretId,
            String privateEndpointId,
            TechnologyType technologyType,
            String connectionString,
            String databaseId,
            String sshHost,
            String sshKey,
            String sshUser,
            String sshSudoLocation) {
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
                vaultId,
                keyId,
                subnetId,
                ingressIps,
                nsgIds,
                username,
                password,
                replicationUsername,
                replicationPassword,
                secretId,
                privateEndpointId);
        this.technologyType = technologyType;
        this.connectionString = connectionString;
        this.databaseId = databaseId;
        this.sshHost = sshHost;
        this.sshKey = sshKey;
        this.sshUser = sshUser;
        this.sshSudoLocation = sshSudoLocation;
    }

    /**
     * The Oracle technology type.
     **/
    public enum TechnologyType {
        AmazonRdsOracle("AMAZON_RDS_ORACLE"),
        OciAutonomousDatabase("OCI_AUTONOMOUS_DATABASE"),
        OracleDatabase("ORACLE_DATABASE"),
        OracleExadata("ORACLE_EXADATA"),

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
     * The Oracle technology type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The Oracle technology type.
     * @return the value
     **/
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * Connect descriptor or Easy Connect Naming method used to connect to a database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * Connect descriptor or Easy Connect Naming method used to connect to a database.
     *
     * @return the value
     **/
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * The OCID of the database being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The OCID of the database being referenced.
     *
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * Name of the host the SSH key is valid for.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshHost")
    private final String sshHost;

    /**
     * Name of the host the SSH key is valid for.
     *
     * @return the value
     **/
    public String getSshHost() {
        return sshHost;
    }

    /**
     * Private SSH key string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshKey")
    private final String sshKey;

    /**
     * Private SSH key string.
     *
     * @return the value
     **/
    public String getSshKey() {
        return sshKey;
    }

    /**
     * The username (credential) used when creating or updating this resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshUser")
    private final String sshUser;

    /**
     * The username (credential) used when creating or updating this resource.
     *
     * @return the value
     **/
    public String getSshUser() {
        return sshUser;
    }

    /**
     * Sudo location
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshSudoLocation")
    private final String sshSudoLocation;

    /**
     * Sudo location
     *
     * @return the value
     **/
    public String getSshSudoLocation() {
        return sshSudoLocation;
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
        sb.append("OracleConnection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", sshHost=").append(String.valueOf(this.sshHost));
        sb.append(", sshKey=").append(String.valueOf(this.sshKey));
        sb.append(", sshUser=").append(String.valueOf(this.sshUser));
        sb.append(", sshSudoLocation=").append(String.valueOf(this.sshSudoLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleConnection)) {
            return false;
        }

        OracleConnection other = (OracleConnection) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.sshHost, other.sshHost)
                && java.util.Objects.equals(this.sshKey, other.sshKey)
                && java.util.Objects.equals(this.sshUser, other.sshUser)
                && java.util.Objects.equals(this.sshSudoLocation, other.sshSudoLocation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.sshHost == null ? 43 : this.sshHost.hashCode());
        result = (result * PRIME) + (this.sshKey == null ? 43 : this.sshKey.hashCode());
        result = (result * PRIME) + (this.sshUser == null ? 43 : this.sshUser.hashCode());
        result =
                (result * PRIME)
                        + (this.sshSudoLocation == null ? 43 : this.sshSudoLocation.hashCode());
        return result;
    }
}
