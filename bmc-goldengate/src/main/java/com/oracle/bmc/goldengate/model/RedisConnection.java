/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the metadata of a Redis Database Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RedisConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RedisConnection extends Connection {
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

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
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

        @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
        private Boolean doesUseSecretIds;

        public Builder doesUseSecretIds(Boolean doesUseSecretIds) {
            this.doesUseSecretIds = doesUseSecretIds;
            this.__explicitlySet__.add("doesUseSecretIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }
        /** The Redis technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The Redis technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * Comma separated list of Redis server addresses, specified as host:port entries, where
         * :port is optional. If port is not specified, it defaults to 6379. Used for establishing
         * the initial connection to the Redis cluster. Example: {@code
         * "server1.example.com:6379,server2.example.com:6379"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("servers")
        private String servers;

        /**
         * Comma separated list of Redis server addresses, specified as host:port entries, where
         * :port is optional. If port is not specified, it defaults to 6379. Used for establishing
         * the initial connection to the Redis cluster. Example: {@code
         * "server1.example.com:6379,server2.example.com:6379"}
         *
         * @param servers the value to set
         * @return this builder
         */
        public Builder servers(String servers) {
            this.servers = servers;
            this.__explicitlySet__.add("servers");
            return this;
        }
        /** Security protocol for Redis */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private SecurityProtocol securityProtocol;

        /**
         * Security protocol for Redis
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /** Authentication type for Redis. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private AuthenticationType authenticationType;

        /**
         * Authentication type for Redis.
         *
         * @param authenticationType the value to set
         * @return this builder
         */
        public Builder authenticationType(AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given
         * technology. This username must already exist and be available by the system/application
         * to be connected to and must conform to the case sensitivty requirments defined in it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect the associated system of the given
         * technology. This username must already exist and be available by the system/application
         * to be connected to and must conform to the case sensitivty requirments defined in it.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Redis cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("redisClusterId")
        private String redisClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Redis cluster.
         *
         * @param redisClusterId the value to set
         * @return this builder
         */
        public Builder redisClusterId(String redisClusterId) {
            this.redisClusterId = redisClusterId;
            this.__explicitlySet__.add("redisClusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the password is stored. The password Oracle GoldenGate uses to connect the
         * associated system of the given technology. It must conform to the specific security
         * requirements including length, case sensitivity, and so on. If secretId is used plaintext
         * field must not be provided. Note: When provided, 'password' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the password is stored. The password Oracle GoldenGate uses to connect the
         * associated system of the given technology. It must conform to the specific security
         * requirements including length, case sensitivity, and so on. If secretId is used plaintext
         * field must not be provided. Note: When provided, 'password' field must not be provided.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         */
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the TrustStore file. Note: When provided, 'trustStore'
         * field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
        private String trustStoreSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the TrustStore file. Note: When provided, 'trustStore'
         * field must not be provided.
         *
         * @param trustStoreSecretId the value to set
         * @return this builder
         */
        public Builder trustStoreSecretId(String trustStoreSecretId) {
            this.trustStoreSecretId = trustStoreSecretId;
            this.__explicitlySet__.add("trustStoreSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the Redis TrustStore password is stored. Note: When provided,
         * 'trustStorePassword' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
        private String trustStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the Redis TrustStore password is stored. Note: When provided,
         * 'trustStorePassword' field must not be provided.
         *
         * @param trustStorePasswordSecretId the value to set
         * @return this builder
         */
        public Builder trustStorePasswordSecretId(String trustStorePasswordSecretId) {
            this.trustStorePasswordSecretId = trustStorePasswordSecretId;
            this.__explicitlySet__.add("trustStorePasswordSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the KeyStore file. Note: When provided, 'keyStore'
         * field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreSecretId")
        private String keyStoreSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the KeyStore file. Note: When provided, 'keyStore'
         * field must not be provided.
         *
         * @param keyStoreSecretId the value to set
         * @return this builder
         */
        public Builder keyStoreSecretId(String keyStoreSecretId) {
            this.keyStoreSecretId = keyStoreSecretId;
            this.__explicitlySet__.add("keyStoreSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the Redis KeyStore password is stored. Note: When provided,
         * 'keyStorePassword' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
        private String keyStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the Redis KeyStore password is stored. Note: When provided,
         * 'keyStorePassword' field must not be provided.
         *
         * @param keyStorePasswordSecretId the value to set
         * @return this builder
         */
        public Builder keyStorePasswordSecretId(String keyStorePasswordSecretId) {
            this.keyStorePasswordSecretId = keyStorePasswordSecretId;
            this.__explicitlySet__.add("keyStorePasswordSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RedisConnection build() {
            RedisConnection model =
                    new RedisConnection(
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
                            this.locks,
                            this.vaultId,
                            this.keyId,
                            this.ingressIps,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.subscriptionId,
                            this.clusterPlacementGroupId,
                            this.securityAttributes,
                            this.technologyType,
                            this.servers,
                            this.securityProtocol,
                            this.authenticationType,
                            this.username,
                            this.redisClusterId,
                            this.passwordSecretId,
                            this.trustStoreSecretId,
                            this.trustStorePasswordSecretId,
                            this.keyStoreSecretId,
                            this.keyStorePasswordSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RedisConnection model) {
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
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
            if (model.wasPropertyExplicitlySet("doesUseSecretIds")) {
                this.doesUseSecretIds(model.getDoesUseSecretIds());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("servers")) {
                this.servers(model.getServers());
            }
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("redisClusterId")) {
                this.redisClusterId(model.getRedisClusterId());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("trustStoreSecretId")) {
                this.trustStoreSecretId(model.getTrustStoreSecretId());
            }
            if (model.wasPropertyExplicitlySet("trustStorePasswordSecretId")) {
                this.trustStorePasswordSecretId(model.getTrustStorePasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("keyStoreSecretId")) {
                this.keyStoreSecretId(model.getKeyStoreSecretId());
            }
            if (model.wasPropertyExplicitlySet("keyStorePasswordSecretId")) {
                this.keyStorePasswordSecretId(model.getKeyStorePasswordSecretId());
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
    public RedisConnection(
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
            java.util.List<ResourceLock> locks,
            String vaultId,
            String keyId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            String subscriptionId,
            String clusterPlacementGroupId,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            TechnologyType technologyType,
            String servers,
            SecurityProtocol securityProtocol,
            AuthenticationType authenticationType,
            String username,
            String redisClusterId,
            String passwordSecretId,
            String trustStoreSecretId,
            String trustStorePasswordSecretId,
            String keyStoreSecretId,
            String keyStorePasswordSecretId) {
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
                locks,
                vaultId,
                keyId,
                ingressIps,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds,
                subscriptionId,
                clusterPlacementGroupId,
                securityAttributes);
        this.technologyType = technologyType;
        this.servers = servers;
        this.securityProtocol = securityProtocol;
        this.authenticationType = authenticationType;
        this.username = username;
        this.redisClusterId = redisClusterId;
        this.passwordSecretId = passwordSecretId;
        this.trustStoreSecretId = trustStoreSecretId;
        this.trustStorePasswordSecretId = trustStorePasswordSecretId;
        this.keyStoreSecretId = keyStoreSecretId;
        this.keyStorePasswordSecretId = keyStorePasswordSecretId;
    }

    /** The Redis technology type. */
    public enum TechnologyType implements com.oracle.bmc.http.internal.BmcEnum {
        Redis("REDIS"),
        OciCacheWithRedis("OCI_CACHE_WITH_REDIS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The Redis technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The Redis technology type.
     *
     * @return the value
     */
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * Comma separated list of Redis server addresses, specified as host:port entries, where :port
     * is optional. If port is not specified, it defaults to 6379. Used for establishing the initial
     * connection to the Redis cluster. Example: {@code
     * "server1.example.com:6379,server2.example.com:6379"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servers")
    private final String servers;

    /**
     * Comma separated list of Redis server addresses, specified as host:port entries, where :port
     * is optional. If port is not specified, it defaults to 6379. Used for establishing the initial
     * connection to the Redis cluster. Example: {@code
     * "server1.example.com:6379,server2.example.com:6379"}
     *
     * @return the value
     */
    public String getServers() {
        return servers;
    }

    /** Security protocol for Redis */
    public enum SecurityProtocol implements com.oracle.bmc.http.internal.BmcEnum {
        Plain("PLAIN"),
        Tls("TLS"),
        Mtls("MTLS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Security protocol for Redis */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final SecurityProtocol securityProtocol;

    /**
     * Security protocol for Redis
     *
     * @return the value
     */
    public SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /** Authentication type for Redis. */
    public enum AuthenticationType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Basic("BASIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthenticationType.class);

        private final String value;
        private static java.util.Map<String, AuthenticationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticationType v : AuthenticationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthenticationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Authentication type for Redis. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final AuthenticationType authenticationType;

    /**
     * Authentication type for Redis.
     *
     * @return the value
     */
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected
     * to and must conform to the case sensitivty requirments defined in it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect the associated system of the given technology.
     * This username must already exist and be available by the system/application to be connected
     * to and must conform to the case sensitivty requirments defined in it.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Redis cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redisClusterId")
    private final String redisClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Redis cluster.
     *
     * @return the value
     */
    public String getRedisClusterId() {
        return redisClusterId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the password is stored. The password Oracle GoldenGate uses to connect the
     * associated system of the given technology. It must conform to the specific security
     * requirements including length, case sensitivity, and so on. If secretId is used plaintext
     * field must not be provided. Note: When provided, 'password' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the password is stored. The password Oracle GoldenGate uses to connect the
     * associated system of the given technology. It must conform to the specific security
     * requirements including length, case sensitivity, and so on. If secretId is used plaintext
     * field must not be provided. Note: When provided, 'password' field must not be provided.
     *
     * @return the value
     */
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the TrustStore file. Note: When provided, 'trustStore'
     * field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
    private final String trustStoreSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the TrustStore file. Note: When provided, 'trustStore'
     * field must not be provided.
     *
     * @return the value
     */
    public String getTrustStoreSecretId() {
        return trustStoreSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the Redis TrustStore password is stored. Note: When provided,
     * 'trustStorePassword' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
    private final String trustStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the Redis TrustStore password is stored. Note: When provided,
     * 'trustStorePassword' field must not be provided.
     *
     * @return the value
     */
    public String getTrustStorePasswordSecretId() {
        return trustStorePasswordSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the KeyStore file. Note: When provided, 'keyStore' field
     * must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreSecretId")
    private final String keyStoreSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the KeyStore file. Note: When provided, 'keyStore' field
     * must not be provided.
     *
     * @return the value
     */
    public String getKeyStoreSecretId() {
        return keyStoreSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the Redis KeyStore password is stored. Note: When provided, 'keyStorePassword'
     * field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
    private final String keyStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the Redis KeyStore password is stored. Note: When provided, 'keyStorePassword'
     * field must not be provided.
     *
     * @return the value
     */
    public String getKeyStorePasswordSecretId() {
        return keyStorePasswordSecretId;
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
        sb.append("RedisConnection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", servers=").append(String.valueOf(this.servers));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", redisClusterId=").append(String.valueOf(this.redisClusterId));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", trustStoreSecretId=").append(String.valueOf(this.trustStoreSecretId));
        sb.append(", trustStorePasswordSecretId=")
                .append(String.valueOf(this.trustStorePasswordSecretId));
        sb.append(", keyStoreSecretId=").append(String.valueOf(this.keyStoreSecretId));
        sb.append(", keyStorePasswordSecretId=")
                .append(String.valueOf(this.keyStorePasswordSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RedisConnection)) {
            return false;
        }

        RedisConnection other = (RedisConnection) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.servers, other.servers)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.redisClusterId, other.redisClusterId)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.trustStoreSecretId, other.trustStoreSecretId)
                && java.util.Objects.equals(
                        this.trustStorePasswordSecretId, other.trustStorePasswordSecretId)
                && java.util.Objects.equals(this.keyStoreSecretId, other.keyStoreSecretId)
                && java.util.Objects.equals(
                        this.keyStorePasswordSecretId, other.keyStorePasswordSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.servers == null ? 43 : this.servers.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result =
                (result * PRIME)
                        + (this.redisClusterId == null ? 43 : this.redisClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStoreSecretId == null
                                ? 43
                                : this.trustStoreSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStorePasswordSecretId == null
                                ? 43
                                : this.trustStorePasswordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreSecretId == null ? 43 : this.keyStoreSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStorePasswordSecretId == null
                                ? 43
                                : this.keyStorePasswordSecretId.hashCode());
        return result;
    }
}
