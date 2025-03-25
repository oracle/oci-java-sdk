/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Auth related information to be used when invoking external endpoint <br>
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
        property = "httpEndpointAuthConfigType",
        defaultImpl = HttpEndpointAuthConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointIdcsAuthConfig.class,
            name = "HTTP_ENDPOINT_IDCS_AUTH_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointDelegatedBearerAuthConfig.class,
            name = "HTTP_ENDPOINT_DELEGATED_BEARER_AUTH_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointNoAuthConfig.class,
            name = "HTTP_ENDPOINT_NO_AUTH_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointOciResourcePrincipalAuthConfig.class,
            name = "HTTP_ENDPOINT_OCI_RESOURCE_PRINCIPAL_AUTH_CONFIG")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class HttpEndpointAuthConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected HttpEndpointAuthConfig() {
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
        sb.append("HttpEndpointAuthConfig(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpEndpointAuthConfig)) {
            return false;
        }

        HttpEndpointAuthConfig other = (HttpEndpointAuthConfig) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of Auth config to be used when invoking an external endpoint. The allowed values
     * are: - {@code HTTP_ENDPOINT_NO_AUTH_CONFIG}: Indicates that no authentication is required for
     * invoking the endpoint. - {@code HTTP_ENDPOINT_DELEGATED_BEARER_AUTH_CONFIG}: Specifies Bearer
     * Token Authentication, where the same Bearer token received as part of the Agent Chat API
     * request is used to invoke the external endpoint. - {@code
     * HTTP_ENDPOINT_OCI_RESOURCE_PRINCIPAL_AUTH_CONFIG}: Specifies authentication using Oracle
     * Cloud Infrastructure (OCI) Resource Principal, leveraging OCI's identity-based authentication
     * mechanism. - {@code HTTP_ENDPOINT_IDCS_AUTH_CONFIG}: Specifies authentication using Oracle
     * Identity Cloud Service (IDCS), leveraging OAuth 2.0 for token-based authentication.
     */
    public enum HttpEndpointAuthConfigType implements com.oracle.bmc.http.internal.BmcEnum {
        HttpEndpointNoAuthConfig("HTTP_ENDPOINT_NO_AUTH_CONFIG"),
        HttpEndpointDelegatedBearerAuthConfig("HTTP_ENDPOINT_DELEGATED_BEARER_AUTH_CONFIG"),
        HttpEndpointOciResourcePrincipalAuthConfig(
                "HTTP_ENDPOINT_OCI_RESOURCE_PRINCIPAL_AUTH_CONFIG"),
        HttpEndpointIdcsAuthConfig("HTTP_ENDPOINT_IDCS_AUTH_CONFIG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HttpEndpointAuthConfigType.class);

        private final String value;
        private static java.util.Map<String, HttpEndpointAuthConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (HttpEndpointAuthConfigType v : HttpEndpointAuthConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HttpEndpointAuthConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HttpEndpointAuthConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HttpEndpointAuthConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
