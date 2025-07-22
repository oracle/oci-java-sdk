/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Subset of AuthScopeConfig allowed for HTTP Endpoint Tool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "httpEndpointAuthScopeConfigType",
        defaultImpl = HttpEndpointAuthScopeConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointBearerAuthScopeConfig.class,
            name = "HTTP_ENDPOINT_BEARER_AUTH_SCOPE_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointNoAuthScopeConfig.class,
            name = "HTTP_ENDPOINT_NO_AUTH_SCOPE_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointBasicAuthScopeConfig.class,
            name = "HTTP_ENDPOINT_BASIC_AUTH_SCOPE_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointOciAuthScopeConfig.class,
            name = "HTTP_ENDPOINT_OCI_AUTH_SCOPE_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointIdcsAuthScopeConfig.class,
            name = "HTTP_ENDPOINT_IDCS_AUTH_SCOPE_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointApiKeyAuthScopeConfig.class,
            name = "HTTP_ENDPOINT_API_KEY_AUTH_SCOPE_CONFIG")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class HttpEndpointAuthScopeConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected HttpEndpointAuthScopeConfig() {
        super();
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
        sb.append("HttpEndpointAuthScopeConfig(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpEndpointAuthScopeConfig)) {
            return false;
        }

        HttpEndpointAuthScopeConfig other = (HttpEndpointAuthScopeConfig) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of authentication to be applied for this HTTP Endpoint. */
    public enum HttpEndpointAuthScopeConfigType implements com.oracle.bmc.http.internal.BmcEnum {
        HttpEndpointNoAuthScopeConfig("HTTP_ENDPOINT_NO_AUTH_SCOPE_CONFIG"),
        HttpEndpointBasicAuthScopeConfig("HTTP_ENDPOINT_BASIC_AUTH_SCOPE_CONFIG"),
        HttpEndpointBearerAuthScopeConfig("HTTP_ENDPOINT_BEARER_AUTH_SCOPE_CONFIG"),
        HttpEndpointApiKeyAuthScopeConfig("HTTP_ENDPOINT_API_KEY_AUTH_SCOPE_CONFIG"),
        HttpEndpointIdcsAuthScopeConfig("HTTP_ENDPOINT_IDCS_AUTH_SCOPE_CONFIG"),
        HttpEndpointOciAuthScopeConfig("HTTP_ENDPOINT_OCI_AUTH_SCOPE_CONFIG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HttpEndpointAuthScopeConfigType.class);

        private final String value;
        private static java.util.Map<String, HttpEndpointAuthScopeConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (HttpEndpointAuthScopeConfigType v : HttpEndpointAuthScopeConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HttpEndpointAuthScopeConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HttpEndpointAuthScopeConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HttpEndpointAuthScopeConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
