/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the Kafka (e.g. Confluent) Schema Registry Connection.
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
    builder = KafkaSchemaRegistryConnectionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KafkaSchemaRegistryConnectionSummary extends ConnectionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Connection.LifecycleState lifecycleState;

        public Builder lifecycleState(Connection.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ingressIps")
        private java.util.List<IngressIpDetails> ingressIps;

        public Builder ingressIps(java.util.List<IngressIpDetails> ingressIps) {
            this.ingressIps = ingressIps;
            this.__explicitlySet__.add("ingressIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
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

        public KafkaSchemaRegistryConnectionSummary build() {
            KafkaSchemaRegistryConnectionSummary model =
                    new KafkaSchemaRegistryConnectionSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.vaultId,
                            this.keyId,
                            this.subnetId,
                            this.ingressIps,
                            this.nsgIds,
                            this.technologyType,
                            this.url,
                            this.authenticationType,
                            this.username,
                            this.privateIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KafkaSchemaRegistryConnectionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("ingressIps")) {
                this.ingressIps(model.getIngressIps());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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
    public KafkaSchemaRegistryConnectionSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Connection.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String vaultId,
            String keyId,
            String subnetId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            KafkaSchemaRegistryConnection.TechnologyType technologyType,
            String url,
            KafkaSchemaRegistryConnection.AuthenticationType authenticationType,
            String username,
            String privateIp) {
        super(
                id,
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                systemTags,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                vaultId,
                keyId,
                subnetId,
                ingressIps,
                nsgIds);
        this.technologyType = technologyType;
        this.url = url;
        this.authenticationType = authenticationType;
        this.username = username;
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
        sb.append("KafkaSchemaRegistryConnectionSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KafkaSchemaRegistryConnectionSummary)) {
            return false;
        }

        KafkaSchemaRegistryConnectionSummary other = (KafkaSchemaRegistryConnectionSummary) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.username, other.username)
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
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        return result;
    }
}
