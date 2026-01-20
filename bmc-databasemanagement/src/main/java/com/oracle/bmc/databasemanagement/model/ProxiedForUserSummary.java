/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of users on whose behalf the current user acts as proxy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProxiedForUserSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProxiedForUserSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "authentication", "flags"})
    public ProxiedForUserSummary(String name, Authentication authentication, Flags flags) {
        super();
        this.name = name;
        this.authentication = authentication;
        this.flags = flags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of a proxy user or the name of the client user. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of a proxy user or the name of the client user.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Indicates whether the proxy is required to supply the client credentials (YES) or not
         * (NO).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authentication")
        private Authentication authentication;

        /**
         * Indicates whether the proxy is required to supply the client credentials (YES) or not
         * (NO).
         *
         * @param authentication the value to set
         * @return this builder
         */
        public Builder authentication(Authentication authentication) {
            this.authentication = authentication;
            this.__explicitlySet__.add("authentication");
            return this;
        }
        /** The flags associated with the proxy/client pair. */
        @com.fasterxml.jackson.annotation.JsonProperty("flags")
        private Flags flags;

        /**
         * The flags associated with the proxy/client pair.
         *
         * @param flags the value to set
         * @return this builder
         */
        public Builder flags(Flags flags) {
            this.flags = flags;
            this.__explicitlySet__.add("flags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProxiedForUserSummary build() {
            ProxiedForUserSummary model =
                    new ProxiedForUserSummary(this.name, this.authentication, this.flags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProxiedForUserSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("authentication")) {
                this.authentication(model.getAuthentication());
            }
            if (model.wasPropertyExplicitlySet("flags")) {
                this.flags(model.getFlags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The name of a proxy user or the name of the client user. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of a proxy user or the name of the client user.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
     */
    public enum Authentication implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Authentication.class);

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
     * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    private final Authentication authentication;

    /**
     * Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
     *
     * @return the value
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /** The flags associated with the proxy/client pair. */
    public enum Flags implements com.oracle.bmc.http.internal.BmcEnum {
        ProxyMayActivateAllClientRoles("PROXY_MAY_ACTIVATE_ALL_CLIENT_ROLES"),
        NoClientRolesMayBeActivated("NO_CLIENT_ROLES_MAY_BE_ACTIVATED"),
        ProxyMayActivateRole("PROXY_MAY_ACTIVATE_ROLE"),
        ProxyMayNotActivateRole("PROXY_MAY_NOT_ACTIVATE_ROLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Flags.class);

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
    /** The flags associated with the proxy/client pair. */
    @com.fasterxml.jackson.annotation.JsonProperty("flags")
    private final Flags flags;

    /**
     * The flags associated with the proxy/client pair.
     *
     * @return the value
     */
    public Flags getFlags() {
        return flags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProxiedForUserSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", authentication=").append(String.valueOf(this.authentication));
        sb.append(", flags=").append(String.valueOf(this.flags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProxiedForUserSummary)) {
            return false;
        }

        ProxiedForUserSummary other = (ProxiedForUserSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.authentication, other.authentication)
                && java.util.Objects.equals(this.flags, other.flags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.authentication == null ? 43 : this.authentication.hashCode());
        result = (result * PRIME) + (this.flags == null ? 43 : this.flags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
