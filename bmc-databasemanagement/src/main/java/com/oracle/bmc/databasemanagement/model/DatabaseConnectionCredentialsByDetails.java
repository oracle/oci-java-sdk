/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The credentials used to connect to the database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseConnectionCredentialsByDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "credentialType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseConnectionCredentialsByDetails extends DatabaseConnectionCredentials {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the credential information that used to connect to the DB system resource.
         * The name should be in "x.y" format, where the length of "x" has a maximum of 64 characters,
         * and length of "y" has a maximum of 199 characters. The name strings can contain letters,
         * numbers and the underscore character only. Other characters are not valid, except for
         * the "." character that separates the "x" and "y" portions of the name.
         * *IMPORTANT* - The name must be unique within the OCI region the credential is being created in.
         * If you specify a name that duplicates the name of another credential within the same OCI region,
         * you may overwrite or corrupt the credential that is already using the name.
         * <p>
         * For example: inventorydb.abc112233445566778899
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
        private String credentialName;

        /**
         * The name of the credential information that used to connect to the DB system resource.
         * The name should be in "x.y" format, where the length of "x" has a maximum of 64 characters,
         * and length of "y" has a maximum of 199 characters. The name strings can contain letters,
         * numbers and the underscore character only. Other characters are not valid, except for
         * the "." character that separates the "x" and "y" portions of the name.
         * *IMPORTANT* - The name must be unique within the OCI region the credential is being created in.
         * If you specify a name that duplicates the name of another credential within the same OCI region,
         * you may overwrite or corrupt the credential that is already using the name.
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
         * The user name used to connect to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The user name used to connect to the database.
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the secret containing the user password.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the secret containing the user password.
         * @param passwordSecretId the value to set
         * @return this builder
         **/
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /**
         * The role of the user connecting to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The role of the user connecting to the database.
         * @param role the value to set
         * @return this builder
         **/
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseConnectionCredentialsByDetails build() {
            DatabaseConnectionCredentialsByDetails model =
                    new DatabaseConnectionCredentialsByDetails(
                            this.credentialName, this.userName, this.passwordSecretId, this.role);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseConnectionCredentialsByDetails model) {
            if (model.wasPropertyExplicitlySet("credentialName")) {
                this.credentialName(model.getCredentialName());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
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
    public DatabaseConnectionCredentialsByDetails(
            String credentialName, String userName, String passwordSecretId, Role role) {
        super();
        this.credentialName = credentialName;
        this.userName = userName;
        this.passwordSecretId = passwordSecretId;
        this.role = role;
    }

    /**
     * The name of the credential information that used to connect to the DB system resource.
     * The name should be in "x.y" format, where the length of "x" has a maximum of 64 characters,
     * and length of "y" has a maximum of 199 characters. The name strings can contain letters,
     * numbers and the underscore character only. Other characters are not valid, except for
     * the "." character that separates the "x" and "y" portions of the name.
     * *IMPORTANT* - The name must be unique within the OCI region the credential is being created in.
     * If you specify a name that duplicates the name of another credential within the same OCI region,
     * you may overwrite or corrupt the credential that is already using the name.
     * <p>
     * For example: inventorydb.abc112233445566778899
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
    private final String credentialName;

    /**
     * The name of the credential information that used to connect to the DB system resource.
     * The name should be in "x.y" format, where the length of "x" has a maximum of 64 characters,
     * and length of "y" has a maximum of 199 characters. The name strings can contain letters,
     * numbers and the underscore character only. Other characters are not valid, except for
     * the "." character that separates the "x" and "y" portions of the name.
     * *IMPORTANT* - The name must be unique within the OCI region the credential is being created in.
     * If you specify a name that duplicates the name of another credential within the same OCI region,
     * you may overwrite or corrupt the credential that is already using the name.
     * <p>
     * For example: inventorydb.abc112233445566778899
     *
     * @return the value
     **/
    public String getCredentialName() {
        return credentialName;
    }

    /**
     * The user name used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The user name used to connect to the database.
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the secret containing the user password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the secret containing the user password.
     * @return the value
     **/
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * The role of the user connecting to the database.
     **/
    public enum Role {
        Sysdba("SYSDBA"),
        Normal("NORMAL"),
        Sysdg("SYSDG"),

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
     * The role of the user connecting to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The role of the user connecting to the database.
     * @return the value
     **/
    public Role getRole() {
        return role;
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
        sb.append("DatabaseConnectionCredentialsByDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", credentialName=").append(String.valueOf(this.credentialName));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseConnectionCredentialsByDetails)) {
            return false;
        }

        DatabaseConnectionCredentialsByDetails other = (DatabaseConnectionCredentialsByDetails) o;
        return java.util.Objects.equals(this.credentialName, other.credentialName)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.role, other.role)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.credentialName == null ? 43 : this.credentialName.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        return result;
    }
}
