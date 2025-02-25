/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Details of the new Database Tools connection for a Generic JDBC database system.
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
    builder = CreateDatabaseToolsConnectionGenericJdbcDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDatabaseToolsConnectionGenericJdbcDetails
        extends CreateDatabaseToolsConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * The JDBC URL used to connect to the Generic JDBC database system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The JDBC URL used to connect to the Generic JDBC database system.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
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
         * The advanced connection properties key-value pair.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
        private java.util.Map<String, String> advancedProperties;

        /**
         * The advanced connection properties key-value pair.
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
        private java.util.List<DatabaseToolsKeyStoreGenericJdbcDetails> keyStores;

        /**
         * The CA certificate to verify the server's certificate and
         * the client private key and associated certificate required for client authentication.
         *
         * @param keyStores the value to set
         * @return this builder
         **/
        public Builder keyStores(
                java.util.List<DatabaseToolsKeyStoreGenericJdbcDetails> keyStores) {
            this.keyStores = keyStores;
            this.__explicitlySet__.add("keyStores");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseToolsConnectionGenericJdbcDetails build() {
            CreateDatabaseToolsConnectionGenericJdbcDetails model =
                    new CreateDatabaseToolsConnectionGenericJdbcDetails(
                            this.displayName,
                            this.compartmentId,
                            this.definedTags,
                            this.freeformTags,
                            this.locks,
                            this.runtimeSupport,
                            this.url,
                            this.userName,
                            this.userPassword,
                            this.advancedProperties,
                            this.keyStores);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseToolsConnectionGenericJdbcDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("runtimeSupport")) {
                this.runtimeSupport(model.getRuntimeSupport());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
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
    public CreateDatabaseToolsConnectionGenericJdbcDetails(
            String displayName,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.List<ResourceLock> locks,
            RuntimeSupport runtimeSupport,
            String url,
            String userName,
            DatabaseToolsUserPasswordDetails userPassword,
            java.util.Map<String, String> advancedProperties,
            java.util.List<DatabaseToolsKeyStoreGenericJdbcDetails> keyStores) {
        super(displayName, compartmentId, definedTags, freeformTags, locks, runtimeSupport);
        this.url = url;
        this.userName = userName;
        this.userPassword = userPassword;
        this.advancedProperties = advancedProperties;
        this.keyStores = keyStores;
    }

    /**
     * The JDBC URL used to connect to the Generic JDBC database system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The JDBC URL used to connect to the Generic JDBC database system.
     * @return the value
     **/
    public String getUrl() {
        return url;
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
     * The advanced connection properties key-value pair.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
    private final java.util.Map<String, String> advancedProperties;

    /**
     * The advanced connection properties key-value pair.
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
    private final java.util.List<DatabaseToolsKeyStoreGenericJdbcDetails> keyStores;

    /**
     * The CA certificate to verify the server's certificate and
     * the client private key and associated certificate required for client authentication.
     *
     * @return the value
     **/
    public java.util.List<DatabaseToolsKeyStoreGenericJdbcDetails> getKeyStores() {
        return keyStores;
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
        sb.append("CreateDatabaseToolsConnectionGenericJdbcDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", userPassword=").append(String.valueOf(this.userPassword));
        sb.append(", advancedProperties=").append(String.valueOf(this.advancedProperties));
        sb.append(", keyStores=").append(String.valueOf(this.keyStores));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseToolsConnectionGenericJdbcDetails)) {
            return false;
        }

        CreateDatabaseToolsConnectionGenericJdbcDetails other =
                (CreateDatabaseToolsConnectionGenericJdbcDetails) o;
        return java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.userPassword, other.userPassword)
                && java.util.Objects.equals(this.advancedProperties, other.advancedProperties)
                && java.util.Objects.equals(this.keyStores, other.keyStores)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.userPassword == null ? 43 : this.userPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.advancedProperties == null
                                ? 43
                                : this.advancedProperties.hashCode());
        result = (result * PRIME) + (this.keyStores == null ? 43 : this.keyStores.hashCode());
        return result;
    }
}
