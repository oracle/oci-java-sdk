/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * The update details for a Database Tools MySQL Server connection.
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
    builder = UpdateDatabaseToolsConnectionMySqlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDatabaseToolsConnectionMySqlDetails
        extends UpdateDatabaseToolsConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("relatedResource")
        private UpdateDatabaseToolsRelatedResourceMySqlDetails relatedResource;

        public Builder relatedResource(
                UpdateDatabaseToolsRelatedResourceMySqlDetails relatedResource) {
            this.relatedResource = relatedResource;
            this.__explicitlySet__.add("relatedResource");
            return this;
        }
        /**
         * The connection string used to connect to the MySQL Server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * The connection string used to connect to the MySQL Server.
         * @param connectionString the value to set
         * @return this builder
         **/
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }
        /**
         * The user name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The user name.
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userPassword")
        private DatabaseToolsUserPasswordDetails userPassword;

        public Builder userPassword(DatabaseToolsUserPasswordDetails userPassword) {
            this.userPassword = userPassword;
            this.__explicitlySet__.add("userPassword");
            return this;
        }
        /**
         * The advanced connection properties key-value pair (e.g., {@code sslMode}).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
        private java.util.Map<String, String> advancedProperties;

        /**
         * The advanced connection properties key-value pair (e.g., {@code sslMode}).
         * @param advancedProperties the value to set
         * @return this builder
         **/
        public Builder advancedProperties(java.util.Map<String, String> advancedProperties) {
            this.advancedProperties = advancedProperties;
            this.__explicitlySet__.add("advancedProperties");
            return this;
        }
        /**
         * The CA certificate to verify the server's certificate and
         * the client private key and associated certificate required for client authentication.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStores")
        private java.util.List<DatabaseToolsKeyStoreMySqlDetails> keyStores;

        /**
         * The CA certificate to verify the server's certificate and
         * the client private key and associated certificate required for client authentication.
         *
         * @param keyStores the value to set
         * @return this builder
         **/
        public Builder keyStores(java.util.List<DatabaseToolsKeyStoreMySqlDetails> keyStores) {
            this.keyStores = keyStores;
            this.__explicitlySet__.add("keyStores");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DatabaseToolsPrivateEndpoint used to access the database in the Customer VCN.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DatabaseToolsPrivateEndpoint used to access the database in the Customer VCN.
         * @param privateEndpointId the value to set
         * @return this builder
         **/
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDatabaseToolsConnectionMySqlDetails build() {
            UpdateDatabaseToolsConnectionMySqlDetails model =
                    new UpdateDatabaseToolsConnectionMySqlDetails(
                            this.displayName,
                            this.definedTags,
                            this.freeformTags,
                            this.relatedResource,
                            this.connectionString,
                            this.userName,
                            this.userPassword,
                            this.advancedProperties,
                            this.keyStores,
                            this.privateEndpointId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDatabaseToolsConnectionMySqlDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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
    public UpdateDatabaseToolsConnectionMySqlDetails(
            String displayName,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            UpdateDatabaseToolsRelatedResourceMySqlDetails relatedResource,
            String connectionString,
            String userName,
            DatabaseToolsUserPasswordDetails userPassword,
            java.util.Map<String, String> advancedProperties,
            java.util.List<DatabaseToolsKeyStoreMySqlDetails> keyStores,
            String privateEndpointId) {
        super(displayName, definedTags, freeformTags);
        this.relatedResource = relatedResource;
        this.connectionString = connectionString;
        this.userName = userName;
        this.userPassword = userPassword;
        this.advancedProperties = advancedProperties;
        this.keyStores = keyStores;
        this.privateEndpointId = privateEndpointId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("relatedResource")
    private final UpdateDatabaseToolsRelatedResourceMySqlDetails relatedResource;

    public UpdateDatabaseToolsRelatedResourceMySqlDetails getRelatedResource() {
        return relatedResource;
    }

    /**
     * The connection string used to connect to the MySQL Server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * The connection string used to connect to the MySQL Server.
     * @return the value
     **/
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * The user name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The user name.
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userPassword")
    private final DatabaseToolsUserPasswordDetails userPassword;

    public DatabaseToolsUserPasswordDetails getUserPassword() {
        return userPassword;
    }

    /**
     * The advanced connection properties key-value pair (e.g., {@code sslMode}).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
    private final java.util.Map<String, String> advancedProperties;

    /**
     * The advanced connection properties key-value pair (e.g., {@code sslMode}).
     * @return the value
     **/
    public java.util.Map<String, String> getAdvancedProperties() {
        return advancedProperties;
    }

    /**
     * The CA certificate to verify the server's certificate and
     * the client private key and associated certificate required for client authentication.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStores")
    private final java.util.List<DatabaseToolsKeyStoreMySqlDetails> keyStores;

    /**
     * The CA certificate to verify the server's certificate and
     * the client private key and associated certificate required for client authentication.
     *
     * @return the value
     **/
    public java.util.List<DatabaseToolsKeyStoreMySqlDetails> getKeyStores() {
        return keyStores;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DatabaseToolsPrivateEndpoint used to access the database in the Customer VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DatabaseToolsPrivateEndpoint used to access the database in the Customer VCN.
     * @return the value
     **/
    public String getPrivateEndpointId() {
        return privateEndpointId;
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
        sb.append("UpdateDatabaseToolsConnectionMySqlDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", relatedResource=").append(String.valueOf(this.relatedResource));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", userPassword=").append(String.valueOf(this.userPassword));
        sb.append(", advancedProperties=").append(String.valueOf(this.advancedProperties));
        sb.append(", keyStores=").append(String.valueOf(this.keyStores));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDatabaseToolsConnectionMySqlDetails)) {
            return false;
        }

        UpdateDatabaseToolsConnectionMySqlDetails other =
                (UpdateDatabaseToolsConnectionMySqlDetails) o;
        return java.util.Objects.equals(this.relatedResource, other.relatedResource)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.userPassword, other.userPassword)
                && java.util.Objects.equals(this.advancedProperties, other.advancedProperties)
                && java.util.Objects.equals(this.keyStores, other.keyStores)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
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
        return result;
    }
}
