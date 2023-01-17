/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Ssl connection credential details used to connect to the database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseSslConnectionCredentials.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "credentialType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseSslConnectionCredentials extends DatabaseConnectionCredentials {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the credential information that used to connect to the database. The name should be in "x.y" format, where
         * the length of "x" has a maximum of 64 characters, and length of "y" has a maximum of 199 characters.
         * The name strings can contain letters, numbers and the underscore character only. Other characters are not valid, except for
         * the "." character that separates the "x" and "y" portions of the name.
         * *IMPORTANT* - The name must be unique within the OCI region the credential is being created in. If you specify a name
         * that duplicates the name of another credential within the same OCI region, you may overwrite or corrupt the credential that is already
         * using the name.
         * <p>
         * For example: inventorydb.abc112233445566778899
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
        private String credentialName;

        /**
         * The name of the credential information that used to connect to the database. The name should be in "x.y" format, where
         * the length of "x" has a maximum of 64 characters, and length of "y" has a maximum of 199 characters.
         * The name strings can contain letters, numbers and the underscore character only. Other characters are not valid, except for
         * the "." character that separates the "x" and "y" portions of the name.
         * *IMPORTANT* - The name must be unique within the OCI region the credential is being created in. If you specify a name
         * that duplicates the name of another credential within the same OCI region, you may overwrite or corrupt the credential that is already
         * using the name.
         * <p>
         * For example: inventorydb.abc112233445566778899
         *
         * @param credentialName the value to set
         * @return this builder
         **/
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            this.__explicitlySet__.add("credentialName");
            return this;
        }
        /**
         * The username that will be used to connect to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username that will be used to connect to the database.
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The password that will be used to connect to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password that will be used to connect to the database.
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * The role of the user that will be connecting to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The role of the user that will be connecting to the database.
         * @param role the value to set
         * @return this builder
         **/
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
        private String sslSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * @param sslSecretId the value to set
         * @return this builder
         **/
        public Builder sslSecretId(String sslSecretId) {
            this.sslSecretId = sslSecretId;
            this.__explicitlySet__.add("sslSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseSslConnectionCredentials build() {
            DatabaseSslConnectionCredentials model =
                    new DatabaseSslConnectionCredentials(
                            this.credentialName,
                            this.username,
                            this.password,
                            this.role,
                            this.sslSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseSslConnectionCredentials model) {
            if (model.wasPropertyExplicitlySet("credentialName")) {
                this.credentialName(model.getCredentialName());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("sslSecretId")) {
                this.sslSecretId(model.getSslSecretId());
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
    public DatabaseSslConnectionCredentials(
            String credentialName,
            String username,
            String password,
            Role role,
            String sslSecretId) {
        super();
        this.credentialName = credentialName;
        this.username = username;
        this.password = password;
        this.role = role;
        this.sslSecretId = sslSecretId;
    }

    /**
     * The name of the credential information that used to connect to the database. The name should be in "x.y" format, where
     * the length of "x" has a maximum of 64 characters, and length of "y" has a maximum of 199 characters.
     * The name strings can contain letters, numbers and the underscore character only. Other characters are not valid, except for
     * the "." character that separates the "x" and "y" portions of the name.
     * *IMPORTANT* - The name must be unique within the OCI region the credential is being created in. If you specify a name
     * that duplicates the name of another credential within the same OCI region, you may overwrite or corrupt the credential that is already
     * using the name.
     * <p>
     * For example: inventorydb.abc112233445566778899
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
    private final String credentialName;

    /**
     * The name of the credential information that used to connect to the database. The name should be in "x.y" format, where
     * the length of "x" has a maximum of 64 characters, and length of "y" has a maximum of 199 characters.
     * The name strings can contain letters, numbers and the underscore character only. Other characters are not valid, except for
     * the "." character that separates the "x" and "y" portions of the name.
     * *IMPORTANT* - The name must be unique within the OCI region the credential is being created in. If you specify a name
     * that duplicates the name of another credential within the same OCI region, you may overwrite or corrupt the credential that is already
     * using the name.
     * <p>
     * For example: inventorydb.abc112233445566778899
     *
     * @return the value
     **/
    public String getCredentialName() {
        return credentialName;
    }

    /**
     * The username that will be used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username that will be used to connect to the database.
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The password that will be used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password that will be used to connect to the database.
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    /**
     * The role of the user that will be connecting to the database.
     **/
    public enum Role {
        Sysdba("SYSDBA"),
        Normal("NORMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Role.class);

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Role', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The role of the user that will be connecting to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The role of the user that will be connecting to the database.
     * @return the value
     **/
    public Role getRole() {
        return role;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
    private final String sslSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * @return the value
     **/
    public String getSslSecretId() {
        return sslSecretId;
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
        sb.append("DatabaseSslConnectionCredentials(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", credentialName=").append(String.valueOf(this.credentialName));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", sslSecretId=").append(String.valueOf(this.sslSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseSslConnectionCredentials)) {
            return false;
        }

        DatabaseSslConnectionCredentials other = (DatabaseSslConnectionCredentials) o;
        return java.util.Objects.equals(this.credentialName, other.credentialName)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.sslSecretId, other.sslSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.credentialName == null ? 43 : this.credentialName.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + (this.sslSecretId == null ? 43 : this.sslSecretId.hashCode());
        return result;
    }
}
