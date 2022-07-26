/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The credential to connect to the database to perform tablespace administration tasks.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "tablespaceAdminCredentialType",
    defaultImpl = TablespaceAdminCredentialDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TablespaceAdminPasswordCredentialDetails.class,
        name = "PASSWORD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TablespaceAdminSecretCredentialDetails.class,
        name = "SECRET"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TablespaceAdminCredentialDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"username", "role"})
    protected TablespaceAdminCredentialDetails(String username, Role role) {
        super();
        this.username = username;
        this.role = role;
    }

    /**
     * The user to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The user to connect to the database.
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The role of the database user.
     **/
    public enum Role {
        Normal("NORMAL"),
        Sysdba("SYSDBA"),
        ;

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Role: " + key);
        }
    };
    /**
     * The role of the database user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The role of the database user.
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
        sb.append("TablespaceAdminCredentialDetails(");
        sb.append("username=").append(String.valueOf(this.username));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TablespaceAdminCredentialDetails)) {
            return false;
        }

        TablespaceAdminCredentialDetails other = (TablespaceAdminCredentialDetails) o;
        return java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.role, other.role);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        return result;
    }

    /**
     * The type of the credential for tablespace administration tasks.
     **/
    public enum TablespaceAdminCredentialType {
        Secret("SECRET"),
        Password("PASSWORD"),
        ;

        private final String value;
        private static java.util.Map<String, TablespaceAdminCredentialType> map;

        static {
            map = new java.util.HashMap<>();
            for (TablespaceAdminCredentialType v : TablespaceAdminCredentialType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TablespaceAdminCredentialType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TablespaceAdminCredentialType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TablespaceAdminCredentialType: " + key);
        }
    };
}