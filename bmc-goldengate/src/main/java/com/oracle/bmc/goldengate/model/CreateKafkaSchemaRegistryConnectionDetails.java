/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Kafka (e.g. Confluent) Schema Registry Connection.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateKafkaSchemaRegistryConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateKafkaSchemaRegistryConnectionDetails extends CreateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingMethod")
        private RoutingMethod routingMethod;

        public Builder routingMethod(RoutingMethod routingMethod) {
            this.routingMethod = routingMethod;
            this.__explicitlySet__.add("routingMethod");
            return this;
        }
        /**
         * The Kafka (e.g. Confluent) Schema Registry technology type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private KafkaSchemaRegistryConnection.TechnologyType technologyType;

        /**
         * The Kafka (e.g. Confluent) Schema Registry technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(KafkaSchemaRegistryConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * Kafka Schema Registry URL.
         * e.g.: 'https://server1.us.oracle.com:8081'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Kafka Schema Registry URL.
         * e.g.: 'https://server1.us.oracle.com:8081'
         *
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * Used authentication mechanism to access Schema Registry.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private KafkaSchemaRegistryConnection.AuthenticationType authenticationType;

        /**
         * Used authentication mechanism to access Schema Registry.
         *
         * @param authenticationType the value to set
         * @return this builder
         **/
        public Builder authenticationType(
                KafkaSchemaRegistryConnection.AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * The username to access Schema Registry using basic authentation.
         * This value is injected into 'schema.registry.basic.auth.user.info=user:password' configuration property.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username to access Schema Registry using basic authentation.
         * This value is injected into 'schema.registry.basic.auth.user.info=user:password' configuration property.
         *
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The password to access Schema Registry using basic authentation.
         * This value is injected into 'schema.registry.basic.auth.user.info=user:password' configuration property.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password to access Schema Registry using basic authentation.
         * This value is injected into 'schema.registry.basic.auth.user.info=user:password' configuration property.
         *
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * The base64 encoded content of the TrustStore file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
        private String trustStore;

        /**
         * The base64 encoded content of the TrustStore file.
         *
         * @param trustStore the value to set
         * @return this builder
         **/
        public Builder trustStore(String trustStore) {
            this.trustStore = trustStore;
            this.__explicitlySet__.add("trustStore");
            return this;
        }
        /**
         * The TrustStore password.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
        private String trustStorePassword;

        /**
         * The TrustStore password.
         *
         * @param trustStorePassword the value to set
         * @return this builder
         **/
        public Builder trustStorePassword(String trustStorePassword) {
            this.trustStorePassword = trustStorePassword;
            this.__explicitlySet__.add("trustStorePassword");
            return this;
        }
        /**
         * The base64 encoded content of the KeyStore file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
        private String keyStore;

        /**
         * The base64 encoded content of the KeyStore file.
         *
         * @param keyStore the value to set
         * @return this builder
         **/
        public Builder keyStore(String keyStore) {
            this.keyStore = keyStore;
            this.__explicitlySet__.add("keyStore");
            return this;
        }
        /**
         * The KeyStore password.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
        private String keyStorePassword;

        /**
         * The KeyStore password.
         *
         * @param keyStorePassword the value to set
         * @return this builder
         **/
        public Builder keyStorePassword(String keyStorePassword) {
            this.keyStorePassword = keyStorePassword;
            this.__explicitlySet__.add("keyStorePassword");
            return this;
        }
        /**
         * The password for the cert inside the KeyStore.
         * In case it differs from the KeyStore password, it should be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
        private String sslKeyPassword;

        /**
         * The password for the cert inside the KeyStore.
         * In case it differs from the KeyStore password, it should be provided.
         *
         * @param sslKeyPassword the value to set
         * @return this builder
         **/
        public Builder sslKeyPassword(String sslKeyPassword) {
            this.sslKeyPassword = sslKeyPassword;
            this.__explicitlySet__.add("sslKeyPassword");
            return this;
        }
        /**
         * Deprecated: this field will be removed in future versions. Either specify the private IP in the connectionString or host
         * field, or make sure the host name is resolvable in the target VCN.
         * <p>
         * The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server).
         * In case the privateIp is provided, the subnetId must also be provided.
         * In case the privateIp (and the subnetId) is not provided it is assumed the datasource is publicly accessible.
         * In case the connection is accessible only privately, the lack of privateIp will result in not being able to access the connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * Deprecated: this field will be removed in future versions. Either specify the private IP in the connectionString or host
         * field, or make sure the host name is resolvable in the target VCN.
         * <p>
         * The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server).
         * In case the privateIp is provided, the subnetId must also be provided.
         * In case the privateIp (and the subnetId) is not provided it is assumed the datasource is publicly accessible.
         * In case the connection is accessible only privately, the lack of privateIp will result in not being able to access the connection.
         *
         * @param privateIp the value to set
         * @return this builder
         **/
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateKafkaSchemaRegistryConnectionDetails build() {
            CreateKafkaSchemaRegistryConnectionDetails model =
                    new CreateKafkaSchemaRegistryConnectionDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.vaultId,
                            this.keyId,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.technologyType,
                            this.url,
                            this.authenticationType,
                            this.username,
                            this.password,
                            this.trustStore,
                            this.trustStorePassword,
                            this.keyStore,
                            this.keyStorePassword,
                            this.sslKeyPassword,
                            this.privateIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateKafkaSchemaRegistryConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("routingMethod")) {
                this.routingMethod(model.getRoutingMethod());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("trustStore")) {
                this.trustStore(model.getTrustStore());
            }
            if (model.wasPropertyExplicitlySet("trustStorePassword")) {
                this.trustStorePassword(model.getTrustStorePassword());
            }
            if (model.wasPropertyExplicitlySet("keyStore")) {
                this.keyStore(model.getKeyStore());
            }
            if (model.wasPropertyExplicitlySet("keyStorePassword")) {
                this.keyStorePassword(model.getKeyStorePassword());
            }
            if (model.wasPropertyExplicitlySet("sslKeyPassword")) {
                this.sslKeyPassword(model.getSslKeyPassword());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
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
    public CreateKafkaSchemaRegistryConnectionDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String vaultId,
            String keyId,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            KafkaSchemaRegistryConnection.TechnologyType technologyType,
            String url,
            KafkaSchemaRegistryConnection.AuthenticationType authenticationType,
            String username,
            String password,
            String trustStore,
            String trustStorePassword,
            String keyStore,
            String keyStorePassword,
            String sslKeyPassword,
            String privateIp) {
        super(
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                vaultId,
                keyId,
                nsgIds,
                subnetId,
                routingMethod);
        this.technologyType = technologyType;
        this.url = url;
        this.authenticationType = authenticationType;
        this.username = username;
        this.password = password;
        this.trustStore = trustStore;
        this.trustStorePassword = trustStorePassword;
        this.keyStore = keyStore;
        this.keyStorePassword = keyStorePassword;
        this.sslKeyPassword = sslKeyPassword;
        this.privateIp = privateIp;
    }

    /**
     * The Kafka (e.g. Confluent) Schema Registry technology type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final KafkaSchemaRegistryConnection.TechnologyType technologyType;

    /**
     * The Kafka (e.g. Confluent) Schema Registry technology type.
     *
     * @return the value
     **/
    public KafkaSchemaRegistryConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * Kafka Schema Registry URL.
     * e.g.: 'https://server1.us.oracle.com:8081'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Kafka Schema Registry URL.
     * e.g.: 'https://server1.us.oracle.com:8081'
     *
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * Used authentication mechanism to access Schema Registry.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final KafkaSchemaRegistryConnection.AuthenticationType authenticationType;

    /**
     * Used authentication mechanism to access Schema Registry.
     *
     * @return the value
     **/
    public KafkaSchemaRegistryConnection.AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * The username to access Schema Registry using basic authentation.
     * This value is injected into 'schema.registry.basic.auth.user.info=user:password' configuration property.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username to access Schema Registry using basic authentation.
     * This value is injected into 'schema.registry.basic.auth.user.info=user:password' configuration property.
     *
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The password to access Schema Registry using basic authentation.
     * This value is injected into 'schema.registry.basic.auth.user.info=user:password' configuration property.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password to access Schema Registry using basic authentation.
     * This value is injected into 'schema.registry.basic.auth.user.info=user:password' configuration property.
     *
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    /**
     * The base64 encoded content of the TrustStore file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
    private final String trustStore;

    /**
     * The base64 encoded content of the TrustStore file.
     *
     * @return the value
     **/
    public String getTrustStore() {
        return trustStore;
    }

    /**
     * The TrustStore password.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
    private final String trustStorePassword;

    /**
     * The TrustStore password.
     *
     * @return the value
     **/
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    /**
     * The base64 encoded content of the KeyStore file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
    private final String keyStore;

    /**
     * The base64 encoded content of the KeyStore file.
     *
     * @return the value
     **/
    public String getKeyStore() {
        return keyStore;
    }

    /**
     * The KeyStore password.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
    private final String keyStorePassword;

    /**
     * The KeyStore password.
     *
     * @return the value
     **/
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * The password for the cert inside the KeyStore.
     * In case it differs from the KeyStore password, it should be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
    private final String sslKeyPassword;

    /**
     * The password for the cert inside the KeyStore.
     * In case it differs from the KeyStore password, it should be provided.
     *
     * @return the value
     **/
    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    /**
     * Deprecated: this field will be removed in future versions. Either specify the private IP in the connectionString or host
     * field, or make sure the host name is resolvable in the target VCN.
     * <p>
     * The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server).
     * In case the privateIp is provided, the subnetId must also be provided.
     * In case the privateIp (and the subnetId) is not provided it is assumed the datasource is publicly accessible.
     * In case the connection is accessible only privately, the lack of privateIp will result in not being able to access the connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * Deprecated: this field will be removed in future versions. Either specify the private IP in the connectionString or host
     * field, or make sure the host name is resolvable in the target VCN.
     * <p>
     * The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server).
     * In case the privateIp is provided, the subnetId must also be provided.
     * In case the privateIp (and the subnetId) is not provided it is assumed the datasource is publicly accessible.
     * In case the connection is accessible only privately, the lack of privateIp will result in not being able to access the connection.
     *
     * @return the value
     **/
    public String getPrivateIp() {
        return privateIp;
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
        sb.append("CreateKafkaSchemaRegistryConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", trustStore=").append(String.valueOf(this.trustStore));
        sb.append(", trustStorePassword=").append("<redacted>");
        sb.append(", keyStore=").append(String.valueOf(this.keyStore));
        sb.append(", keyStorePassword=").append("<redacted>");
        sb.append(", sslKeyPassword=").append("<redacted>");
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateKafkaSchemaRegistryConnectionDetails)) {
            return false;
        }

        CreateKafkaSchemaRegistryConnectionDetails other =
                (CreateKafkaSchemaRegistryConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.trustStore, other.trustStore)
                && java.util.Objects.equals(this.trustStorePassword, other.trustStorePassword)
                && java.util.Objects.equals(this.keyStore, other.keyStore)
                && java.util.Objects.equals(this.keyStorePassword, other.keyStorePassword)
                && java.util.Objects.equals(this.sslKeyPassword, other.sslKeyPassword)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.trustStore == null ? 43 : this.trustStore.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStorePassword == null
                                ? 43
                                : this.trustStorePassword.hashCode());
        result = (result * PRIME) + (this.keyStore == null ? 43 : this.keyStore.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStorePassword == null ? 43 : this.keyStorePassword.hashCode());
        result =
                (result * PRIME)
                        + (this.sslKeyPassword == null ? 43 : this.sslKeyPassword.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        return result;
    }
}
