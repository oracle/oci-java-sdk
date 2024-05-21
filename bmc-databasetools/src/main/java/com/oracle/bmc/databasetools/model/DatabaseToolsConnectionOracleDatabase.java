/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Database Tools connection of an Oracle Database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseToolsConnectionOracleDatabase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsConnectionOracleDatabase extends DatabaseToolsConnection {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("runtimeSupport")
        private RuntimeSupport runtimeSupport;

        public Builder runtimeSupport(RuntimeSupport runtimeSupport) {
            this.runtimeSupport = runtimeSupport;
            this.__explicitlySet__.add("runtimeSupport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedResource")
        private DatabaseToolsRelatedResource relatedResource;

        public Builder relatedResource(DatabaseToolsRelatedResource relatedResource) {
            this.relatedResource = relatedResource;
            this.__explicitlySet__.add("relatedResource");
            return this;
        }
        /**
         * The connect descriptor or Easy Connect Naming method used to connect to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * The connect descriptor or Easy Connect Naming method used to connect to the database.
         * @param connectionString the value to set
         * @return this builder
         **/
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }
        /**
         * The database user name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The database user name.
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userPassword")
        private DatabaseToolsUserPassword userPassword;

        public Builder userPassword(DatabaseToolsUserPassword userPassword) {
            this.userPassword = userPassword;
            this.__explicitlySet__.add("userPassword");
            return this;
        }
        /**
         * The advanced connection properties key-value pair (for example, {@code oracle.net.ssl_server_dn_match}).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
        private java.util.Map<String, String> advancedProperties;

        /**
         * The advanced connection properties key-value pair (for example, {@code oracle.net.ssl_server_dn_match}).
         * @param advancedProperties the value to set
         * @return this builder
         **/
        public Builder advancedProperties(java.util.Map<String, String> advancedProperties) {
            this.advancedProperties = advancedProperties;
            this.__explicitlySet__.add("advancedProperties");
            return this;
        }
        /**
         * The Oracle wallet or Java Keystores containing trusted certificates for authenticating the server's public certificate and
         * the client private key and associated certificates required for client authentication.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStores")
        private java.util.List<DatabaseToolsKeyStore> keyStores;

        /**
         * The Oracle wallet or Java Keystores containing trusted certificates for authenticating the server's public certificate and
         * the client private key and associated certificates required for client authentication.
         *
         * @param keyStores the value to set
         * @return this builder
         **/
        public Builder keyStores(java.util.List<DatabaseToolsKeyStore> keyStores) {
            this.keyStores = keyStores;
            this.__explicitlySet__.add("keyStores");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Tools private endpoint used to access the database in the customer VCN.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Tools private endpoint used to access the database in the customer VCN.
         * @param privateEndpointId the value to set
         * @return this builder
         **/
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("proxyClient")
        private DatabaseToolsConnectionOracleDatabaseProxyClient proxyClient;

        public Builder proxyClient(DatabaseToolsConnectionOracleDatabaseProxyClient proxyClient) {
            this.proxyClient = proxyClient;
            this.__explicitlySet__.add("proxyClient");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsConnectionOracleDatabase build() {
            DatabaseToolsConnectionOracleDatabase model =
                    new DatabaseToolsConnectionOracleDatabase(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags,
                            this.locks,
                            this.runtimeSupport,
                            this.relatedResource,
                            this.connectionString,
                            this.userName,
                            this.userPassword,
                            this.advancedProperties,
                            this.keyStores,
                            this.privateEndpointId,
                            this.proxyClient);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsConnectionOracleDatabase model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("runtimeSupport")) {
                this.runtimeSupport(model.getRuntimeSupport());
            }
            if (model.wasPropertyExplicitlySet("relatedResource")) {
                this.relatedResource(model.getRelatedResource());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("userPassword")) {
                this.userPassword(model.getUserPassword());
            }
            if (model.wasPropertyExplicitlySet("advancedProperties")) {
                this.advancedProperties(model.getAdvancedProperties());
            }
            if (model.wasPropertyExplicitlySet("keyStores")) {
                this.keyStores(model.getKeyStores());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointId")) {
                this.privateEndpointId(model.getPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("proxyClient")) {
                this.proxyClient(model.getProxyClient());
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
    public DatabaseToolsConnectionOracleDatabase(
            String id,
            String displayName,
            String compartmentId,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<ResourceLock> locks,
            RuntimeSupport runtimeSupport,
            DatabaseToolsRelatedResource relatedResource,
            String connectionString,
            String userName,
            DatabaseToolsUserPassword userPassword,
            java.util.Map<String, String> advancedProperties,
            java.util.List<DatabaseToolsKeyStore> keyStores,
            String privateEndpointId,
            DatabaseToolsConnectionOracleDatabaseProxyClient proxyClient) {
        super(
                id,
                displayName,
                compartmentId,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                definedTags,
                freeformTags,
                systemTags,
                locks,
                runtimeSupport);
        this.relatedResource = relatedResource;
        this.connectionString = connectionString;
        this.userName = userName;
        this.userPassword = userPassword;
        this.advancedProperties = advancedProperties;
        this.keyStores = keyStores;
        this.privateEndpointId = privateEndpointId;
        this.proxyClient = proxyClient;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("relatedResource")
    private final DatabaseToolsRelatedResource relatedResource;

    public DatabaseToolsRelatedResource getRelatedResource() {
        return relatedResource;
    }

    /**
     * The connect descriptor or Easy Connect Naming method used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * The connect descriptor or Easy Connect Naming method used to connect to the database.
     * @return the value
     **/
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * The database user name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The database user name.
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userPassword")
    private final DatabaseToolsUserPassword userPassword;

    public DatabaseToolsUserPassword getUserPassword() {
        return userPassword;
    }

    /**
     * The advanced connection properties key-value pair (for example, {@code oracle.net.ssl_server_dn_match}).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
    private final java.util.Map<String, String> advancedProperties;

    /**
     * The advanced connection properties key-value pair (for example, {@code oracle.net.ssl_server_dn_match}).
     * @return the value
     **/
    public java.util.Map<String, String> getAdvancedProperties() {
        return advancedProperties;
    }

    /**
     * The Oracle wallet or Java Keystores containing trusted certificates for authenticating the server's public certificate and
     * the client private key and associated certificates required for client authentication.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStores")
    private final java.util.List<DatabaseToolsKeyStore> keyStores;

    /**
     * The Oracle wallet or Java Keystores containing trusted certificates for authenticating the server's public certificate and
     * the client private key and associated certificates required for client authentication.
     *
     * @return the value
     **/
    public java.util.List<DatabaseToolsKeyStore> getKeyStores() {
        return keyStores;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Tools private endpoint used to access the database in the customer VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Tools private endpoint used to access the database in the customer VCN.
     * @return the value
     **/
    public String getPrivateEndpointId() {
        return privateEndpointId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("proxyClient")
    private final DatabaseToolsConnectionOracleDatabaseProxyClient proxyClient;

    public DatabaseToolsConnectionOracleDatabaseProxyClient getProxyClient() {
        return proxyClient;
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
        sb.append("DatabaseToolsConnectionOracleDatabase(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", relatedResource=").append(String.valueOf(this.relatedResource));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", userPassword=").append(String.valueOf(this.userPassword));
        sb.append(", advancedProperties=").append(String.valueOf(this.advancedProperties));
        sb.append(", keyStores=").append(String.valueOf(this.keyStores));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(", proxyClient=").append(String.valueOf(this.proxyClient));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsConnectionOracleDatabase)) {
            return false;
        }

        DatabaseToolsConnectionOracleDatabase other = (DatabaseToolsConnectionOracleDatabase) o;
        return java.util.Objects.equals(this.relatedResource, other.relatedResource)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.userPassword, other.userPassword)
                && java.util.Objects.equals(this.advancedProperties, other.advancedProperties)
                && java.util.Objects.equals(this.keyStores, other.keyStores)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && java.util.Objects.equals(this.proxyClient, other.proxyClient)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.relatedResource == null ? 43 : this.relatedResource.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.userPassword == null ? 43 : this.userPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.advancedProperties == null
                                ? 43
                                : this.advancedProperties.hashCode());
        result = (result * PRIME) + (this.keyStores == null ? 43 : this.keyStores.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result = (result * PRIME) + (this.proxyClient == null ? 43 : this.proxyClient.hashCode());
        return result;
    }
}
