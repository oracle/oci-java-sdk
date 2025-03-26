/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * The payload for authentication.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "authenticationType",
    defaultImpl = RealtimeMessageAuthentication.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RealtimeMessageAuthenticationToken.class,
        name = "TOKEN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RealtimeMessageAuthenticationCredentials.class,
        name = "CREDENTIALS"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class RealtimeMessageAuthentication
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId"})
    protected RealtimeMessageAuthentication(String compartmentId) {
        super();
        this.compartmentId = compartmentId;
    }

    /**
     * Compartment ID to be used for authentication/authorization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment ID to be used for authentication/authorization.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("RealtimeMessageAuthentication(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RealtimeMessageAuthentication)) {
            return false;
        }

        RealtimeMessageAuthentication other = (RealtimeMessageAuthentication) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of authentication method to be used.
     **/
    public enum AuthenticationType {
        Credentials("CREDENTIALS"),
        Token("TOKEN"),
        ;

        private final String value;
        private static java.util.Map<String, AuthenticationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticationType v : AuthenticationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AuthenticationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthenticationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AuthenticationType: " + key);
        }
    };
}
