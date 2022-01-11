/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * User information to connect to the database. Required when performing the {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails} operation.
 * *IMPORTANT*: Not supported for the {@link #updateExternalDatabaseConnectorDetails(UpdateExternalDatabaseConnectorDetailsRequest) updateExternalDatabaseConnectorDetails} operation.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseConnectionCredentialsByDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "credentialType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseConnectionCredentialsByDetails extends DatabaseConnectionCredentials {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
        private String credentialName;

        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            this.__explicitlySet__.add("credentialName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseConnectionCredentialsByDetails build() {
            DatabaseConnectionCredentialsByDetails __instance__ =
                    new DatabaseConnectionCredentialsByDetails(
                            credentialName, username, password, role);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseConnectionCredentialsByDetails o) {
            Builder copiedBuilder =
                    credentialName(o.getCredentialName())
                            .username(o.getUsername())
                            .password(o.getPassword())
                            .role(o.getRole());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public DatabaseConnectionCredentialsByDetails(
            String credentialName, String username, String password, Role role) {
        super();
        this.credentialName = credentialName;
        this.username = username;
        this.password = password;
        this.role = role;
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
    String credentialName;

    /**
     * The username that will be used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    String username;

    /**
     * The password that will be used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    String password;
    /**
     * The role of the user that will be connecting to the database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Role {
        Sysdba("SYSDBA"),
        Normal("NORMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    Role role;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
