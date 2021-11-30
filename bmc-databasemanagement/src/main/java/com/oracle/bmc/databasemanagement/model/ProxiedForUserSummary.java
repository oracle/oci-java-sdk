/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A collection of Users for which the current user acts as proxy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProxiedForUserSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProxiedForUserSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authentication")
        private Authentication authentication;

        public Builder authentication(Authentication authentication) {
            this.authentication = authentication;
            this.__explicitlySet__.add("authentication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flags")
        private Flags flags;

        public Builder flags(Flags flags) {
            this.flags = flags;
            this.__explicitlySet__.add("flags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProxiedForUserSummary build() {
            ProxiedForUserSummary __instance__ =
                    new ProxiedForUserSummary(name, authentication, flags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProxiedForUserSummary o) {
            Builder copiedBuilder =
                    name(o.getName()).authentication(o.getAuthentication()).flags(o.getFlags());

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

    /**
     * The name of a proxy user or name of the user who the proxy user can act as
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO)
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Authentication {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Authentication> map;

        static {
            map = new java.util.HashMap<>();
            for (Authentication v : Authentication.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Authentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Authentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Authentication', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    Authentication authentication;
    /**
     * Flags associated with the proxy/client pair
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Flags {
        ProxyMayActivateAllClientRoles("PROXY_MAY_ACTIVATE_ALL_CLIENT_ROLES"),
        NoClientRolesMayBeActivated("NO_CLIENT_ROLES_MAY_BE_ACTIVATED"),
        ProxyMayActivateRole("PROXY_MAY_ACTIVATE_ROLE"),
        ProxyMayNotActivateRole("PROXY_MAY_NOT_ACTIVATE_ROLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Flags> map;

        static {
            map = new java.util.HashMap<>();
            for (Flags v : Flags.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Flags(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Flags create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Flags', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Flags associated with the proxy/client pair
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flags")
    Flags flags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
