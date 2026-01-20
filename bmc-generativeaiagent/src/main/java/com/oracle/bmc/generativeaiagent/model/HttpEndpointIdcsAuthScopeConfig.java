/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Specifies authentication using Oracle Identity Cloud Service (IDCS), leveraging OAuth 2.0 Client
 * Credentials grant type.
 *
 * <p>- Only supported with {@code authScope = AGENT}. <br>
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
        builder = HttpEndpointIdcsAuthScopeConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "httpEndpointAuthScopeConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HttpEndpointIdcsAuthScopeConfig extends HttpEndpointAuthScopeConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** IDCS OpenID discovery endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsUrl")
        private String idcsUrl;

        /**
         * IDCS OpenID discovery endpoint.
         *
         * @param idcsUrl the value to set
         * @return this builder
         */
        public Builder idcsUrl(String idcsUrl) {
            this.idcsUrl = idcsUrl;
            this.__explicitlySet__.add("idcsUrl");
            return this;
        }
        /** OAuth2 scopes for token generation. */
        @com.fasterxml.jackson.annotation.JsonProperty("scopeUrl")
        private String scopeUrl;

        /**
         * OAuth2 scopes for token generation.
         *
         * @param scopeUrl the value to set
         * @return this builder
         */
        public Builder scopeUrl(String scopeUrl) {
            this.scopeUrl = scopeUrl;
            this.__explicitlySet__.add("scopeUrl");
            return this;
        }
        /** IDCS client ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * IDCS client ID.
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /** Vault secret OCID containing the client secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
        private String vaultSecretId;

        /**
         * Vault secret OCID containing the client secret.
         *
         * @param vaultSecretId the value to set
         * @return this builder
         */
        public Builder vaultSecretId(String vaultSecretId) {
            this.vaultSecretId = vaultSecretId;
            this.__explicitlySet__.add("vaultSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpEndpointIdcsAuthScopeConfig build() {
            HttpEndpointIdcsAuthScopeConfig model =
                    new HttpEndpointIdcsAuthScopeConfig(
                            this.idcsUrl, this.scopeUrl, this.clientId, this.vaultSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpEndpointIdcsAuthScopeConfig model) {
            if (model.wasPropertyExplicitlySet("idcsUrl")) {
                this.idcsUrl(model.getIdcsUrl());
            }
            if (model.wasPropertyExplicitlySet("scopeUrl")) {
                this.scopeUrl(model.getScopeUrl());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("vaultSecretId")) {
                this.vaultSecretId(model.getVaultSecretId());
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
    public HttpEndpointIdcsAuthScopeConfig(
            String idcsUrl, String scopeUrl, String clientId, String vaultSecretId) {
        super();
        this.idcsUrl = idcsUrl;
        this.scopeUrl = scopeUrl;
        this.clientId = clientId;
        this.vaultSecretId = vaultSecretId;
    }

    /** IDCS OpenID discovery endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsUrl")
    private final String idcsUrl;

    /**
     * IDCS OpenID discovery endpoint.
     *
     * @return the value
     */
    public String getIdcsUrl() {
        return idcsUrl;
    }

    /** OAuth2 scopes for token generation. */
    @com.fasterxml.jackson.annotation.JsonProperty("scopeUrl")
    private final String scopeUrl;

    /**
     * OAuth2 scopes for token generation.
     *
     * @return the value
     */
    public String getScopeUrl() {
        return scopeUrl;
    }

    /** IDCS client ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * IDCS client ID.
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /** Vault secret OCID containing the client secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultSecretId")
    private final String vaultSecretId;

    /**
     * Vault secret OCID containing the client secret.
     *
     * @return the value
     */
    public String getVaultSecretId() {
        return vaultSecretId;
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
        sb.append("HttpEndpointIdcsAuthScopeConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", idcsUrl=").append(String.valueOf(this.idcsUrl));
        sb.append(", scopeUrl=").append(String.valueOf(this.scopeUrl));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", vaultSecretId=").append(String.valueOf(this.vaultSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpEndpointIdcsAuthScopeConfig)) {
            return false;
        }

        HttpEndpointIdcsAuthScopeConfig other = (HttpEndpointIdcsAuthScopeConfig) o;
        return java.util.Objects.equals(this.idcsUrl, other.idcsUrl)
                && java.util.Objects.equals(this.scopeUrl, other.scopeUrl)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.vaultSecretId, other.vaultSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.idcsUrl == null ? 43 : this.idcsUrl.hashCode());
        result = (result * PRIME) + (this.scopeUrl == null ? 43 : this.scopeUrl.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result =
                (result * PRIME)
                        + (this.vaultSecretId == null ? 43 : this.vaultSecretId.hashCode());
        return result;
    }
}
