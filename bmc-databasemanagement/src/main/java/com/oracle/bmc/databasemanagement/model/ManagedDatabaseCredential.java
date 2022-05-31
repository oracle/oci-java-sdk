/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The credential to connect to the managed database in order to get optimizer statistics gathering & advisor task details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "credentialType",
    defaultImpl = ManagedDatabaseCredential.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ManagedDatabasePasswordCredential.class,
        name = "PASSWORD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ManagedDatabaseSecretCredential.class,
        name = "SECRET"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ManagedDatabaseCredential {

    /**
     * The user to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    String username;
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
    Role role;

    /**
     * The type of the credential has access to retrieve optimizer statistics gathering & advisor task details.
     **/
    public enum CredentialType {
        Secret("SECRET"),
        Password("PASSWORD"),
        ;

        private final String value;
        private static java.util.Map<String, CredentialType> map;

        static {
            map = new java.util.HashMap<>();
            for (CredentialType v : CredentialType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CredentialType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CredentialType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CredentialType: " + key);
        }
    };
}
