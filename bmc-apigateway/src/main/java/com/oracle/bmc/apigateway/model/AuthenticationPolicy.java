/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Information on how to authenticate incoming requests. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = AuthenticationPolicy.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TokenAuthenticationPolicy.class,
            name = "TOKEN_AUTHENTICATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = JwtAuthenticationPolicy.class,
            name = "JWT_AUTHENTICATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CustomAuthenticationPolicy.class,
            name = "CUSTOM_AUTHENTICATION")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class AuthenticationPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isAnonymousAccessAllowed"})
    protected AuthenticationPolicy(Boolean isAnonymousAccessAllowed) {
        super();
        this.isAnonymousAccessAllowed = isAnonymousAccessAllowed;
    }

    /**
     * Whether an unauthenticated user may access the API. Must be "true" to enable ANONYMOUS route
     * authorization.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAnonymousAccessAllowed")
    private final Boolean isAnonymousAccessAllowed;

    /**
     * Whether an unauthenticated user may access the API. Must be "true" to enable ANONYMOUS route
     * authorization.
     *
     * @return the value
     */
    public Boolean getIsAnonymousAccessAllowed() {
        return isAnonymousAccessAllowed;
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
        sb.append("AuthenticationPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("isAnonymousAccessAllowed=")
                .append(String.valueOf(this.isAnonymousAccessAllowed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationPolicy)) {
            return false;
        }

        AuthenticationPolicy other = (AuthenticationPolicy) o;
        return java.util.Objects.equals(
                        this.isAnonymousAccessAllowed, other.isAnonymousAccessAllowed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isAnonymousAccessAllowed == null
                                ? 43
                                : this.isAnonymousAccessAllowed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of the authentication policy to use. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        CustomAuthentication("CUSTOM_AUTHENTICATION"),
        JwtAuthentication("JWT_AUTHENTICATION"),
        TokenAuthentication("TOKEN_AUTHENTICATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
