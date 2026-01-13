/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Specifies authentication using an API key injected either as a header or query parameter.
 *
 * <p>- If {@code authScope = AGENT}: The API key is retrieved from OCI Vault using the agent\u2019s
 * identity. <br>
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
        builder = HttpEndpointApiKeyAuthScopeConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "httpEndpointAuthScopeConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpEndpointApiKeyAuthScopeConfig extends HttpEndpointAuthScopeConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the vault secret with API key. Required when {@code authScope} is AGENT. */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
        private String vaultSecretId;

        /**
         * The OCID of the vault secret with API key. Required when {@code authScope} is AGENT.
         *
         * @param vaultSecretId the value to set
         * @return this builder
         */
        public Builder vaultSecretId(String vaultSecretId) {
            this.vaultSecretId = vaultSecretId;
            this.__explicitlySet__.add("vaultSecretId");
            return this;
        }
        /** The location of the API key in the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyLocation")
        private KeyLocation keyLocation;

        /**
         * The location of the API key in the request.
         *
         * @param keyLocation the value to set
         * @return this builder
         */
        public Builder keyLocation(KeyLocation keyLocation) {
            this.keyLocation = keyLocation;
            this.__explicitlySet__.add("keyLocation");
            return this;
        }
        /** The name of the key parameter in the location. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyName")
        private String keyName;

        /**
         * The name of the key parameter in the location.
         *
         * @param keyName the value to set
         * @return this builder
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            this.__explicitlySet__.add("keyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpEndpointApiKeyAuthScopeConfig build() {
            HttpEndpointApiKeyAuthScopeConfig model =
                    new HttpEndpointApiKeyAuthScopeConfig(
                            this.vaultSecretId, this.keyLocation, this.keyName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpEndpointApiKeyAuthScopeConfig model) {
            if (model.wasPropertyExplicitlySet("vaultSecretId")) {
                this.vaultSecretId(model.getVaultSecretId());
            }
            if (model.wasPropertyExplicitlySet("keyLocation")) {
                this.keyLocation(model.getKeyLocation());
            }
            if (model.wasPropertyExplicitlySet("keyName")) {
                this.keyName(model.getKeyName());
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

    @Deprecated
    public HttpEndpointApiKeyAuthScopeConfig(
            String vaultSecretId, KeyLocation keyLocation, String keyName) {
        super();
        this.vaultSecretId = vaultSecretId;
        this.keyLocation = keyLocation;
        this.keyName = keyName;
    }

    /** The OCID of the vault secret with API key. Required when {@code authScope} is AGENT. */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
    private final String vaultSecretId;

    /**
     * The OCID of the vault secret with API key. Required when {@code authScope} is AGENT.
     *
     * @return the value
     */
    public String getVaultSecretId() {
        return vaultSecretId;
    }

    /** The location of the API key in the request. */
    public enum KeyLocation implements com.oracle.bmc.http.internal.BmcEnum {
        Header("HEADER"),
        QueryParameter("QUERY_PARAMETER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(KeyLocation.class);

        private final String value;
        private static java.util.Map<String, KeyLocation> map;

        static {
            map = new java.util.HashMap<>();
            for (KeyLocation v : KeyLocation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        KeyLocation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static KeyLocation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'KeyLocation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The location of the API key in the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyLocation")
    private final KeyLocation keyLocation;

    /**
     * The location of the API key in the request.
     *
     * @return the value
     */
    public KeyLocation getKeyLocation() {
        return keyLocation;
    }

    /** The name of the key parameter in the location. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyName")
    private final String keyName;

    /**
     * The name of the key parameter in the location.
     *
     * @return the value
     */
    public String getKeyName() {
        return keyName;
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
        sb.append("HttpEndpointApiKeyAuthScopeConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vaultSecretId=").append(String.valueOf(this.vaultSecretId));
        sb.append(", keyLocation=").append(String.valueOf(this.keyLocation));
        sb.append(", keyName=").append(String.valueOf(this.keyName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpEndpointApiKeyAuthScopeConfig)) {
            return false;
        }

        HttpEndpointApiKeyAuthScopeConfig other = (HttpEndpointApiKeyAuthScopeConfig) o;
        return java.util.Objects.equals(this.vaultSecretId, other.vaultSecretId)
                && java.util.Objects.equals(this.keyLocation, other.keyLocation)
                && java.util.Objects.equals(this.keyName, other.keyName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.vaultSecretId == null ? 43 : this.vaultSecretId.hashCode());
        result = (result * PRIME) + (this.keyLocation == null ? 43 : this.keyLocation.hashCode());
        result = (result * PRIME) + (this.keyName == null ? 43 : this.keyName.hashCode());
        return result;
    }
}
