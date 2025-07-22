/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * A credential source and configuration for a specific scope to HTTP Endpoint tools. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HttpEndpointAuthSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpEndpointAuthSource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"httpEndpointAuthScope", "httpEndpointAuthScopeConfig"})
    public HttpEndpointAuthSource(
            HttpEndpointAuthScope httpEndpointAuthScope,
            HttpEndpointAuthScopeConfig httpEndpointAuthScopeConfig) {
        super();
        this.httpEndpointAuthScope = httpEndpointAuthScope;
        this.httpEndpointAuthScopeConfig = httpEndpointAuthScopeConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies the level from which credentials should be resolved. */
        @com.fasterxml.jackson.annotation.JsonProperty("httpEndpointAuthScope")
        private HttpEndpointAuthScope httpEndpointAuthScope;

        /**
         * Specifies the level from which credentials should be resolved.
         *
         * @param httpEndpointAuthScope the value to set
         * @return this builder
         */
        public Builder httpEndpointAuthScope(HttpEndpointAuthScope httpEndpointAuthScope) {
            this.httpEndpointAuthScope = httpEndpointAuthScope;
            this.__explicitlySet__.add("httpEndpointAuthScope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpEndpointAuthScopeConfig")
        private HttpEndpointAuthScopeConfig httpEndpointAuthScopeConfig;

        public Builder httpEndpointAuthScopeConfig(
                HttpEndpointAuthScopeConfig httpEndpointAuthScopeConfig) {
            this.httpEndpointAuthScopeConfig = httpEndpointAuthScopeConfig;
            this.__explicitlySet__.add("httpEndpointAuthScopeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpEndpointAuthSource build() {
            HttpEndpointAuthSource model =
                    new HttpEndpointAuthSource(
                            this.httpEndpointAuthScope, this.httpEndpointAuthScopeConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpEndpointAuthSource model) {
            if (model.wasPropertyExplicitlySet("httpEndpointAuthScope")) {
                this.httpEndpointAuthScope(model.getHttpEndpointAuthScope());
            }
            if (model.wasPropertyExplicitlySet("httpEndpointAuthScopeConfig")) {
                this.httpEndpointAuthScopeConfig(model.getHttpEndpointAuthScopeConfig());
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

    /** Specifies the level from which credentials should be resolved. */
    public enum HttpEndpointAuthScope implements com.oracle.bmc.http.internal.BmcEnum {
        Agent("AGENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HttpEndpointAuthScope.class);

        private final String value;
        private static java.util.Map<String, HttpEndpointAuthScope> map;

        static {
            map = new java.util.HashMap<>();
            for (HttpEndpointAuthScope v : HttpEndpointAuthScope.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HttpEndpointAuthScope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HttpEndpointAuthScope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HttpEndpointAuthScope', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies the level from which credentials should be resolved. */
    @com.fasterxml.jackson.annotation.JsonProperty("httpEndpointAuthScope")
    private final HttpEndpointAuthScope httpEndpointAuthScope;

    /**
     * Specifies the level from which credentials should be resolved.
     *
     * @return the value
     */
    public HttpEndpointAuthScope getHttpEndpointAuthScope() {
        return httpEndpointAuthScope;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("httpEndpointAuthScopeConfig")
    private final HttpEndpointAuthScopeConfig httpEndpointAuthScopeConfig;

    public HttpEndpointAuthScopeConfig getHttpEndpointAuthScopeConfig() {
        return httpEndpointAuthScopeConfig;
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
        sb.append("HttpEndpointAuthSource(");
        sb.append("super=").append(super.toString());
        sb.append("httpEndpointAuthScope=").append(String.valueOf(this.httpEndpointAuthScope));
        sb.append(", httpEndpointAuthScopeConfig=")
                .append(String.valueOf(this.httpEndpointAuthScopeConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpEndpointAuthSource)) {
            return false;
        }

        HttpEndpointAuthSource other = (HttpEndpointAuthSource) o;
        return java.util.Objects.equals(this.httpEndpointAuthScope, other.httpEndpointAuthScope)
                && java.util.Objects.equals(
                        this.httpEndpointAuthScopeConfig, other.httpEndpointAuthScopeConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.httpEndpointAuthScope == null
                                ? 43
                                : this.httpEndpointAuthScope.hashCode());
        result =
                (result * PRIME)
                        + (this.httpEndpointAuthScopeConfig == null
                                ? 43
                                : this.httpEndpointAuthScopeConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
