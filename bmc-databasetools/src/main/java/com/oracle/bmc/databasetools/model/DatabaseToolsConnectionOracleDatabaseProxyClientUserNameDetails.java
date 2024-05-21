/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Proxy client information for user name based proxy authentication.
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
    builder = DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "proxyAuthenticationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails
        extends DatabaseToolsConnectionOracleDatabaseProxyClientDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * A list of database roles for the client. These roles are enabled if the proxy is authorized to use the roles on behalf of the client.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("roles")
        private java.util.List<String> roles;

        /**
         * A list of database roles for the client. These roles are enabled if the proxy is authorized to use the roles on behalf of the client.
         * @param roles the value to set
         * @return this builder
         **/
        public Builder roles(java.util.List<String> roles) {
            this.roles = roles;
            this.__explicitlySet__.add("roles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails build() {
            DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails model =
                    new DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails(
                            this.userName, this.userPassword, this.roles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails model) {
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("userPassword")) {
                this.userPassword(model.getUserPassword());
            }
            if (model.wasPropertyExplicitlySet("roles")) {
                this.roles(model.getRoles());
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
    public DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails(
            String userName,
            DatabaseToolsUserPasswordDetails userPassword,
            java.util.List<String> roles) {
        super();
        this.userName = userName;
        this.userPassword = userPassword;
        this.roles = roles;
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
     * A list of database roles for the client. These roles are enabled if the proxy is authorized to use the roles on behalf of the client.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("roles")
    private final java.util.List<String> roles;

    /**
     * A list of database roles for the client. These roles are enabled if the proxy is authorized to use the roles on behalf of the client.
     * @return the value
     **/
    public java.util.List<String> getRoles() {
        return roles;
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
        sb.append("DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", userPassword=").append(String.valueOf(this.userPassword));
        sb.append(", roles=").append(String.valueOf(this.roles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails)) {
            return false;
        }

        DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails other =
                (DatabaseToolsConnectionOracleDatabaseProxyClientUserNameDetails) o;
        return java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.userPassword, other.userPassword)
                && java.util.Objects.equals(this.roles, other.roles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.userPassword == null ? 43 : this.userPassword.hashCode());
        result = (result * PRIME) + (this.roles == null ? 43 : this.roles.hashCode());
        return result;
    }
}
