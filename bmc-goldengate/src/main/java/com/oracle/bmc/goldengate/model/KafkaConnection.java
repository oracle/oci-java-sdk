/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the metadata of a Kafka Connection.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KafkaConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KafkaConnection extends Connection {
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
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
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
         * The Kafka technology type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The Kafka technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the stream pool being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
        private String streamPoolId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the stream pool being referenced.
         *
         * @param streamPoolId the value to set
         * @return this builder
         **/
        public Builder streamPoolId(String streamPoolId) {
            this.streamPoolId = streamPoolId;
            this.__explicitlySet__.add("streamPoolId");
            return this;
        }
        /**
         * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka:
         * list of KafkaBootstrapServer objects specified by host/port.
         * Used for establishing the initial connection to the Kafka cluster.
         * Example: {@code "server1.example.com:9092,server2.example.com:9092"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
        private java.util.List<KafkaBootstrapServer> bootstrapServers;

        /**
         * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka:
         * list of KafkaBootstrapServer objects specified by host/port.
         * Used for establishing the initial connection to the Kafka cluster.
         * Example: {@code "server1.example.com:9092,server2.example.com:9092"}
         *
         * @param bootstrapServers the value to set
         * @return this builder
         **/
        public Builder bootstrapServers(java.util.List<KafkaBootstrapServer> bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            this.__explicitlySet__.add("bootstrapServers");
            return this;
        }
        /**
         * Kafka security protocol.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private SecurityProtocol securityProtocol;

        /**
         * Kafka security protocol.
         *
         * @param securityProtocol the value to set
         * @return this builder
         **/
        public Builder securityProtocol(SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given technology.
         * This username must already exist and be available by the system/application to be connected to
         * and must conform to the case sensitivty requirments defined in it.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given technology.
         * This username must already exist and be available by the system/application to be connected to
         * and must conform to the case sensitivty requirments defined in it.
         *
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KafkaConnection build() {
            KafkaConnection model =
                    new KafkaConnection(
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
                            this.ingressIps,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.technologyType,
                            this.streamPoolId,
                            this.bootstrapServers,
                            this.securityProtocol,
                            this.username);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KafkaConnection model) {
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
            if (model.wasPropertyExplicitlySet("ingressIps")) {
                this.ingressIps(model.getIngressIps());
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
            if (model.wasPropertyExplicitlySet("streamPoolId")) {
                this.streamPoolId(model.getStreamPoolId());
            }
            if (model.wasPropertyExplicitlySet("bootstrapServers")) {
                this.bootstrapServers(model.getBootstrapServers());
            }
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
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
    public KafkaConnection(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String vaultId,
            String keyId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            TechnologyType technologyType,
            String streamPoolId,
            java.util.List<KafkaBootstrapServer> bootstrapServers,
            SecurityProtocol securityProtocol,
            String username) {
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
                ingressIps,
                nsgIds,
                subnetId,
                routingMethod);
        this.technologyType = technologyType;
        this.streamPoolId = streamPoolId;
        this.bootstrapServers = bootstrapServers;
        this.securityProtocol = securityProtocol;
        this.username = username;
    }

    /**
     * The Kafka technology type.
     *
     **/
    public enum TechnologyType {
        ApacheKafka("APACHE_KAFKA"),
        AzureEventHubs("AZURE_EVENT_HUBS"),
        ConfluentKafka("CONFLUENT_KAFKA"),
        OciStreaming("OCI_STREAMING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TechnologyType.class);

        private final String value;
        private static java.util.Map<String, TechnologyType> map;

        static {
            map = new java.util.HashMap<>();
            for (TechnologyType v : TechnologyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TechnologyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TechnologyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TechnologyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Kafka technology type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The Kafka technology type.
     *
     * @return the value
     **/
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the stream pool being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
    private final String streamPoolId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the stream pool being referenced.
     *
     * @return the value
     **/
    public String getStreamPoolId() {
        return streamPoolId;
    }

    /**
     * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka:
     * list of KafkaBootstrapServer objects specified by host/port.
     * Used for establishing the initial connection to the Kafka cluster.
     * Example: {@code "server1.example.com:9092,server2.example.com:9092"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    private final java.util.List<KafkaBootstrapServer> bootstrapServers;

    /**
     * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka:
     * list of KafkaBootstrapServer objects specified by host/port.
     * Used for establishing the initial connection to the Kafka cluster.
     * Example: {@code "server1.example.com:9092,server2.example.com:9092"}
     *
     * @return the value
     **/
    public java.util.List<KafkaBootstrapServer> getBootstrapServers() {
        return bootstrapServers;
    }

    /**
     * Kafka security protocol.
     *
     **/
    public enum SecurityProtocol {
        Ssl("SSL"),
        SaslSsl("SASL_SSL"),
        Plaintext("PLAINTEXT"),
        SaslPlaintext("SASL_PLAINTEXT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SecurityProtocol.class);

        private final String value;
        private static java.util.Map<String, SecurityProtocol> map;

        static {
            map = new java.util.HashMap<>();
            for (SecurityProtocol v : SecurityProtocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SecurityProtocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SecurityProtocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SecurityProtocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Kafka security protocol.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final SecurityProtocol securityProtocol;

    /**
     * Kafka security protocol.
     *
     * @return the value
     **/
    public SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected to
     * and must conform to the case sensitivty requirments defined in it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected to
     * and must conform to the case sensitivty requirments defined in it.
     *
     * @return the value
     **/
    public String getUsername() {
        return username;
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
        sb.append("KafkaConnection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", streamPoolId=").append(String.valueOf(this.streamPoolId));
        sb.append(", bootstrapServers=").append(String.valueOf(this.bootstrapServers));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KafkaConnection)) {
            return false;
        }

        KafkaConnection other = (KafkaConnection) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.streamPoolId, other.streamPoolId)
                && java.util.Objects.equals(this.bootstrapServers, other.bootstrapServers)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.username, other.username)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.streamPoolId == null ? 43 : this.streamPoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.bootstrapServers == null ? 43 : this.bootstrapServers.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        return result;
    }
}
