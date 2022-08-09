/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * User provides a password to be used to connect to the database.
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
    builder = ManagedDatabasePasswordCredential.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "credentialType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedDatabasePasswordCredential extends ManagedDatabaseCredential {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * The database user's password encoded using BASE64 scheme.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The database user's password encoded using BASE64 scheme.
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedDatabasePasswordCredential build() {
            ManagedDatabasePasswordCredential model =
                    new ManagedDatabasePasswordCredential(this.username, this.role, this.password);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedDatabasePasswordCredential model) {
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
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
    public ManagedDatabasePasswordCredential(String username, Role role, String password) {
        super(username, role);
        this.password = password;
    }

    /**
     * The database user's password encoded using BASE64 scheme.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The database user's password encoded using BASE64 scheme.
     * @return the value
     **/
    public String getPassword() {
        return password;
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
        sb.append("ManagedDatabasePasswordCredential(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedDatabasePasswordCredential)) {
            return false;
        }

        ManagedDatabasePasswordCredential other = (ManagedDatabasePasswordCredential) o;
        return java.util.Objects.equals(this.password, other.password) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        return result;
    }
}
