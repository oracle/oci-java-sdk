/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the MongoDB Connection.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MongoDbConnectionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MongoDbConnectionSummary extends ConnectionSummary {
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
        private Connection.LifecycleState lifecycleState;

        public Builder lifecycleState(Connection.LifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
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
         * The MongoDB technology type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private MongoDbConnection.TechnologyType technologyType;

        /**
         * The MongoDB technology type.
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(MongoDbConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * MongoDB connection string.
         * e.g.: 'mongodb://mongodb0.example.com:27017/recordsrecords'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * MongoDB connection string.
         * e.g.: 'mongodb://mongodb0.example.com:27017/recordsrecords'
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
         * The username Oracle GoldenGate uses to connect to the database.
         * This username must already exist and be available by the database to be connected to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect to the database.
         * This username must already exist and be available by the database to be connected to.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Autonomous Json Database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Autonomous Json Database.
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
         * Security Type for MongoDB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private MongoDbConnection.SecurityProtocol securityProtocol;

        /**
         * Security Type for MongoDB.
         * @param securityProtocol the value to set
         * @return this builder
         **/
        public Builder securityProtocol(MongoDbConnection.SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the password Oracle GoldenGate uses to connect the associated database.
         * Note: When provided, 'password' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the password Oracle GoldenGate uses to connect the associated database.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the certificate key file of the mtls connection.
         * - The content of a .pem file containing the client private key (for 2-way SSL).
         * Note: When provided, 'tlsCertificateKeyFile' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tlsCertificateKeyFileSecretId")
        private String tlsCertificateKeyFileSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the certificate key file of the mtls connection.
         * - The content of a .pem file containing the client private key (for 2-way SSL).
         * Note: When provided, 'tlsCertificateKeyFile' field must not be provided.
         *
         * @param tlsCertificateKeyFileSecretId the value to set
         * @return this builder
         **/
        public Builder tlsCertificateKeyFileSecretId(String tlsCertificateKeyFileSecretId) {
            this.tlsCertificateKeyFileSecretId = tlsCertificateKeyFileSecretId;
            this.__explicitlySet__.add("tlsCertificateKeyFileSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the password of the tls certificate key file.
         * Note: When provided, 'tlsCertificateKeyFilePassword' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tlsCertificateKeyFilePasswordSecretId")
        private String tlsCertificateKeyFilePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the password of the tls certificate key file.
         * Note: When provided, 'tlsCertificateKeyFilePassword' field must not be provided.
         *
         * @param tlsCertificateKeyFilePasswordSecretId the value to set
         * @return this builder
         **/
        public Builder tlsCertificateKeyFilePasswordSecretId(
                String tlsCertificateKeyFilePasswordSecretId) {
            this.tlsCertificateKeyFilePasswordSecretId = tlsCertificateKeyFilePasswordSecretId;
            this.__explicitlySet__.add("tlsCertificateKeyFilePasswordSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MongoDbConnectionSummary build() {
            MongoDbConnectionSummary model =
                    new MongoDbConnectionSummary(
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
                            this.ingressIps,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.locks,
                            this.doesUseSecretIds,
                            this.technologyType,
                            this.connectionString,
                            this.username,
                            this.databaseId,
                            this.securityProtocol,
                            this.passwordSecretId,
                            this.tlsCertificateKeyFileSecretId,
                            this.tlsCertificateKeyFilePasswordSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MongoDbConnectionSummary model) {
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
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("doesUseSecretIds")) {
                this.doesUseSecretIds(model.getDoesUseSecretIds());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("tlsCertificateKeyFileSecretId")) {
                this.tlsCertificateKeyFileSecretId(model.getTlsCertificateKeyFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("tlsCertificateKeyFilePasswordSecretId")) {
                this.tlsCertificateKeyFilePasswordSecretId(
                        model.getTlsCertificateKeyFilePasswordSecretId());
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
    public MongoDbConnectionSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Connection.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String vaultId,
            String keyId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            java.util.List<ResourceLock> locks,
            Boolean doesUseSecretIds,
            MongoDbConnection.TechnologyType technologyType,
            String connectionString,
            String username,
            String databaseId,
            MongoDbConnection.SecurityProtocol securityProtocol,
            String passwordSecretId,
            String tlsCertificateKeyFileSecretId,
            String tlsCertificateKeyFilePasswordSecretId) {
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
                ingressIps,
                nsgIds,
                subnetId,
                routingMethod,
                locks,
                doesUseSecretIds);
        this.technologyType = technologyType;
        this.connectionString = connectionString;
        this.username = username;
        this.databaseId = databaseId;
        this.securityProtocol = securityProtocol;
        this.passwordSecretId = passwordSecretId;
        this.tlsCertificateKeyFileSecretId = tlsCertificateKeyFileSecretId;
        this.tlsCertificateKeyFilePasswordSecretId = tlsCertificateKeyFilePasswordSecretId;
    }

    /**
     * The MongoDB technology type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final MongoDbConnection.TechnologyType technologyType;

    /**
     * The MongoDB technology type.
     * @return the value
     **/
    public MongoDbConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * MongoDB connection string.
     * e.g.: 'mongodb://mongodb0.example.com:27017/recordsrecords'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * MongoDB connection string.
     * e.g.: 'mongodb://mongodb0.example.com:27017/recordsrecords'
     *
     * @return the value
     **/
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * The username Oracle GoldenGate uses to connect to the database.
     * This username must already exist and be available by the database to be connected to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect to the database.
     * This username must already exist and be available by the database to be connected to.
     *
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Autonomous Json Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Autonomous Json Database.
     *
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * Security Type for MongoDB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final MongoDbConnection.SecurityProtocol securityProtocol;

    /**
     * Security Type for MongoDB.
     * @return the value
     **/
    public MongoDbConnection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the password Oracle GoldenGate uses to connect the associated database.
     * Note: When provided, 'password' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the password Oracle GoldenGate uses to connect the associated database.
     * Note: When provided, 'password' field must not be provided.
     *
     * @return the value
     **/
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the certificate key file of the mtls connection.
     * - The content of a .pem file containing the client private key (for 2-way SSL).
     * Note: When provided, 'tlsCertificateKeyFile' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsCertificateKeyFileSecretId")
    private final String tlsCertificateKeyFileSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the certificate key file of the mtls connection.
     * - The content of a .pem file containing the client private key (for 2-way SSL).
     * Note: When provided, 'tlsCertificateKeyFile' field must not be provided.
     *
     * @return the value
     **/
    public String getTlsCertificateKeyFileSecretId() {
        return tlsCertificateKeyFileSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the password of the tls certificate key file.
     * Note: When provided, 'tlsCertificateKeyFilePassword' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsCertificateKeyFilePasswordSecretId")
    private final String tlsCertificateKeyFilePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret that stores the password of the tls certificate key file.
     * Note: When provided, 'tlsCertificateKeyFilePassword' field must not be provided.
     *
     * @return the value
     **/
    public String getTlsCertificateKeyFilePasswordSecretId() {
        return tlsCertificateKeyFilePasswordSecretId;
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
        sb.append("MongoDbConnectionSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", tlsCertificateKeyFileSecretId=")
                .append(String.valueOf(this.tlsCertificateKeyFileSecretId));
        sb.append(", tlsCertificateKeyFilePasswordSecretId=")
                .append(String.valueOf(this.tlsCertificateKeyFilePasswordSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MongoDbConnectionSummary)) {
            return false;
        }

        MongoDbConnectionSummary other = (MongoDbConnectionSummary) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(
                        this.tlsCertificateKeyFileSecretId, other.tlsCertificateKeyFileSecretId)
                && java.util.Objects.equals(
                        this.tlsCertificateKeyFilePasswordSecretId,
                        other.tlsCertificateKeyFilePasswordSecretId)
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
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.tlsCertificateKeyFileSecretId == null
                                ? 43
                                : this.tlsCertificateKeyFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.tlsCertificateKeyFilePasswordSecretId == null
                                ? 43
                                : this.tlsCertificateKeyFilePasswordSecretId.hashCode());
        return result;
    }
}
