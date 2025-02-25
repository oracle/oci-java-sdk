/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The details to update a OAuth connection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateConnectionFromOAuth2.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateConnectionFromOAuth2 extends UpdateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
        private java.util.List<ConnectionProperty> connectionProperties;

        public Builder connectionProperties(
                java.util.List<ConnectionProperty> connectionProperties) {
            this.connectionProperties = connectionProperties;
            this.__explicitlySet__.add("connectionProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }
        /**
         * Specifies the endpoint used to exchange authentication credentials for access tokens
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessTokenUrl")
        private String accessTokenUrl;

        /**
         * Specifies the endpoint used to exchange authentication credentials for access tokens
         * @param accessTokenUrl the value to set
         * @return this builder
         **/
        public Builder accessTokenUrl(String accessTokenUrl) {
            this.accessTokenUrl = accessTokenUrl;
            this.__explicitlySet__.add("accessTokenUrl");
            return this;
        }
        /**
         * Specifies the client ID key for specific application
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * Specifies the client ID key for specific application
         * @param clientId the value to set
         * @return this builder
         **/
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private SensitiveAttribute clientSecret;

        public Builder clientSecret(SensitiveAttribute clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }
        /**
         * Specifies the OAuth scopes that limit the permissions granted by an access token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * Specifies the OAuth scopes that limit the permissions granted by an access token.
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * Specifies the OAuth2 grant mechanism. Example CLIENT_CREDENTIALS, Implicit Flow etc.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("grantType")
        private GrantType grantType;

        /**
         * Specifies the OAuth2 grant mechanism. Example CLIENT_CREDENTIALS, Implicit Flow etc.
         * @param grantType the value to set
         * @return this builder
         **/
        public Builder grantType(GrantType grantType) {
            this.grantType = grantType;
            this.__explicitlySet__.add("grantType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConnectionFromOAuth2 build() {
            UpdateConnectionFromOAuth2 model =
                    new UpdateConnectionFromOAuth2(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.objectVersion,
                            this.identifier,
                            this.connectionProperties,
                            this.registryMetadata,
                            this.accessTokenUrl,
                            this.clientId,
                            this.clientSecret,
                            this.scope,
                            this.grantType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConnectionFromOAuth2 model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("connectionProperties")) {
                this.connectionProperties(model.getConnectionProperties());
            }
            if (model.wasPropertyExplicitlySet("registryMetadata")) {
                this.registryMetadata(model.getRegistryMetadata());
            }
            if (model.wasPropertyExplicitlySet("accessTokenUrl")) {
                this.accessTokenUrl(model.getAccessTokenUrl());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("clientSecret")) {
                this.clientSecret(model.getClientSecret());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("grantType")) {
                this.grantType(model.getGrantType());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public UpdateConnectionFromOAuth2(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            java.util.List<ConnectionProperty> connectionProperties,
            RegistryMetadata registryMetadata,
            String accessTokenUrl,
            String clientId,
            SensitiveAttribute clientSecret,
            String scope,
            GrantType grantType) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectStatus,
                objectVersion,
                identifier,
                connectionProperties,
                registryMetadata);
        this.accessTokenUrl = accessTokenUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.grantType = grantType;
    }

    /**
     * Specifies the endpoint used to exchange authentication credentials for access tokens
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessTokenUrl")
    private final String accessTokenUrl;

    /**
     * Specifies the endpoint used to exchange authentication credentials for access tokens
     * @return the value
     **/
    public String getAccessTokenUrl() {
        return accessTokenUrl;
    }

    /**
     * Specifies the client ID key for specific application
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * Specifies the client ID key for specific application
     * @return the value
     **/
    public String getClientId() {
        return clientId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final SensitiveAttribute clientSecret;

    public SensitiveAttribute getClientSecret() {
        return clientSecret;
    }

    /**
     * Specifies the OAuth scopes that limit the permissions granted by an access token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * Specifies the OAuth scopes that limit the permissions granted by an access token.
     * @return the value
     **/
    public String getScope() {
        return scope;
    }

    /**
     * Specifies the OAuth2 grant mechanism. Example CLIENT_CREDENTIALS, Implicit Flow etc.
     **/
    public enum GrantType {
        ClientCredentials("CLIENT_CREDENTIALS"),
        ;

        private final String value;
        private static java.util.Map<String, GrantType> map;

        static {
            map = new java.util.HashMap<>();
            for (GrantType v : GrantType.values()) {
                map.put(v.getValue(), v);
            }
        }

        GrantType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GrantType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid GrantType: " + key);
        }
    };
    /**
     * Specifies the OAuth2 grant mechanism. Example CLIENT_CREDENTIALS, Implicit Flow etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("grantType")
    private final GrantType grantType;

    /**
     * Specifies the OAuth2 grant mechanism. Example CLIENT_CREDENTIALS, Implicit Flow etc.
     * @return the value
     **/
    public GrantType getGrantType() {
        return grantType;
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
        sb.append("UpdateConnectionFromOAuth2(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accessTokenUrl=").append(String.valueOf(this.accessTokenUrl));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", clientSecret=").append(String.valueOf(this.clientSecret));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", grantType=").append(String.valueOf(this.grantType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConnectionFromOAuth2)) {
            return false;
        }

        UpdateConnectionFromOAuth2 other = (UpdateConnectionFromOAuth2) o;
        return java.util.Objects.equals(this.accessTokenUrl, other.accessTokenUrl)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.clientSecret, other.clientSecret)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.grantType, other.grantType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.accessTokenUrl == null ? 43 : this.accessTokenUrl.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.clientSecret == null ? 43 : this.clientSecret.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.grantType == null ? 43 : this.grantType.hashCode());
        return result;
    }
}
