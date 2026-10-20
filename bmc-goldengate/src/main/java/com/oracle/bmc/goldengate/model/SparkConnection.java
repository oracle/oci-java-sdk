/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the metadata of a Spark Connection. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SparkConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SparkConnection extends Connection {
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
        /** The Spark technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The Spark technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /** Submission channel used to connect to Spark. */
        @com.fasterxml.jackson.annotation.JsonProperty("submitMode")
        private SubmitMode submitMode;

        /**
         * Submission channel used to connect to Spark.
         *
         * @param submitMode the value to set
         * @return this builder
         */
        public Builder submitMode(SubmitMode submitMode) {
            this.submitMode = submitMode;
            this.__explicitlySet__.add("submitMode");
            return this;
        }
        /** Authentication type for Spark. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private AuthenticationType authenticationType;

        /**
         * Authentication type for Spark.
         *
         * @param authenticationType the value to set
         * @return this builder
         */
        public Builder authenticationType(AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /** Security protocol for Spark submission traffic. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private SecurityProtocol securityProtocol;

        /**
         * Security protocol for Spark submission traffic.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * Spark master URL used for job submission. Required for both submitMode SUBMIT and REST.
         * e.g.: 'spark://spark-master.example.com:7077' High availability can be configured with a
         * comma-separated list, for example: 'spark://h1.example.com:7077,h2.example.com:7077'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterEndpoint")
        private String clusterEndpoint;

        /**
         * Spark master URL used for job submission. Required for both submitMode SUBMIT and REST.
         * e.g.: 'spark://spark-master.example.com:7077' High availability can be configured with a
         * comma-separated list, for example: 'spark://h1.example.com:7077,h2.example.com:7077'
         *
         * @param clusterEndpoint the value to set
         * @return this builder
         */
        public Builder clusterEndpoint(String clusterEndpoint) {
            this.clusterEndpoint = clusterEndpoint;
            this.__explicitlySet__.add("clusterEndpoint");
            return this;
        }
        /**
         * Spark standalone REST submission base URL. e.g.: 'https://spark-master.example.com:6066'
         * Applicable only and required when submitMode is REST.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("restEndpoint")
        private String restEndpoint;

        /**
         * Spark standalone REST submission base URL. e.g.: 'https://spark-master.example.com:6066'
         * Applicable only and required when submitMode is REST.
         *
         * @param restEndpoint the value to set
         * @return this builder
         */
        public Builder restEndpoint(String restEndpoint) {
            this.restEndpoint = restEndpoint;
            this.__explicitlySet__.add("restEndpoint");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the Spark authentication shared secret. Applicable when
         * authenticationType is SHARED_SECRET. Note: When provided, 'authSecret' field must not be
         * provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authSecretSecretId")
        private String authSecretSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the Spark authentication shared secret. Applicable when
         * authenticationType is SHARED_SECRET. Note: When provided, 'authSecret' field must not be
         * provided.
         *
         * @param authSecretSecretId the value to set
         * @return this builder
         */
        public Builder authSecretSecretId(String authSecretSecretId) {
            this.authSecretSecretId = authSecretSecretId;
            this.__explicitlySet__.add("authSecretSecretId");
            return this;
        }
        /**
         * Cipher transform used for Spark RPC encryption. Applicable when securityProtocol is
         * AES_RPC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rpcCipher")
        private RpcCipher rpcCipher;

        /**
         * Cipher transform used for Spark RPC encryption. Applicable when securityProtocol is
         * AES_RPC.
         *
         * @param rpcCipher the value to set
         * @return this builder
         */
        public Builder rpcCipher(RpcCipher rpcCipher) {
            this.rpcCipher = rpcCipher;
            this.__explicitlySet__.add("rpcCipher");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the REST submission signing key. Applicable only when submitMode is
         * REST and the cluster enforces REST request signing. This setting is independent of
         * authenticationType. Note: When provided, 'restAuthSecretKey' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("restAuthSecretKeySecretId")
        private String restAuthSecretKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the REST submission signing key. Applicable only when submitMode is
         * REST and the cluster enforces REST request signing. This setting is independent of
         * authenticationType. Note: When provided, 'restAuthSecretKey' field must not be provided.
         *
         * @param restAuthSecretKeySecretId the value to set
         * @return this builder
         */
        public Builder restAuthSecretKeySecretId(String restAuthSecretKeySecretId) {
            this.restAuthSecretKeySecretId = restAuthSecretKeySecretId;
            this.__explicitlySet__.add("restAuthSecretKeySecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the trust store content. Applicable when securityProtocol is TLS.
         * Provide this when the server certificate is not already trusted by the JVM. Note: When
         * provided, 'trustStore' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
        private String trustStoreSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the trust store content. Applicable when securityProtocol is TLS.
         * Provide this when the server certificate is not already trusted by the JVM. Note: When
         * provided, 'trustStore' field must not be provided.
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
         * Secret that stores the trust store password. Applicable when securityProtocol is TLS and
         * a trust store is provided. Required when 'trustStoreSecretId' is provided. Note: When
         * provided, 'trustStorePassword' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
        private String trustStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the trust store password. Applicable when securityProtocol is TLS and
         * a trust store is provided. Required when 'trustStoreSecretId' is provided. Note: When
         * provided, 'trustStorePassword' field must not be provided.
         *
         * @param trustStorePasswordSecretId the value to set
         * @return this builder
         */
        public Builder trustStorePasswordSecretId(String trustStorePasswordSecretId) {
            this.trustStorePasswordSecretId = trustStorePasswordSecretId;
            this.__explicitlySet__.add("trustStorePasswordSecretId");
            return this;
        }
        /** Trust store format used by the Spark client. */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreType")
        private TrustStoreType trustStoreType;

        /**
         * Trust store format used by the Spark client.
         *
         * @param trustStoreType the value to set
         * @return this builder
         */
        public Builder trustStoreType(TrustStoreType trustStoreType) {
            this.trustStoreType = trustStoreType;
            this.__explicitlySet__.add("trustStoreType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the client key store content. Applicable when securityProtocol is TLS.
         * Note: When provided, 'keyStore' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreSecretId")
        private String keyStoreSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the client key store content. Applicable when securityProtocol is TLS.
         * Note: When provided, 'keyStore' field must not be provided.
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
         * Secret that stores the client key store password. Applicable when securityProtocol is TLS
         * and a client key store is provided. Required when 'keyStoreSecretId' is provided. Note:
         * When provided, 'keyStorePassword' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
        private String keyStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the client key store password. Applicable when securityProtocol is TLS
         * and a client key store is provided. Required when 'keyStoreSecretId' is provided. Note:
         * When provided, 'keyStorePassword' field must not be provided.
         *
         * @param keyStorePasswordSecretId the value to set
         * @return this builder
         */
        public Builder keyStorePasswordSecretId(String keyStorePasswordSecretId) {
            this.keyStorePasswordSecretId = keyStorePasswordSecretId;
            this.__explicitlySet__.add("keyStorePasswordSecretId");
            return this;
        }
        /** Client key store format used for mutual TLS. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreType")
        private KeyStoreType keyStoreType;

        /**
         * Client key store format used for mutual TLS.
         *
         * @param keyStoreType the value to set
         * @return this builder
         */
        public Builder keyStoreType(KeyStoreType keyStoreType) {
            this.keyStoreType = keyStoreType;
            this.__explicitlySet__.add("keyStoreType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the private key password. Applicable when securityProtocol is TLS and
         * a client key store is provided. Note: When provided, 'sslKeyPassword' field must not be
         * provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPasswordSecretId")
        private String sslKeyPasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the private key password. Applicable when securityProtocol is TLS and
         * a client key store is provided. Note: When provided, 'sslKeyPassword' field must not be
         * provided.
         *
         * @param sslKeyPasswordSecretId the value to set
         * @return this builder
         */
        public Builder sslKeyPasswordSecretId(String sslKeyPasswordSecretId) {
            this.sslKeyPasswordSecretId = sslKeyPasswordSecretId;
            this.__explicitlySet__.add("sslKeyPasswordSecretId");
            return this;
        }
        /** TLS protocol negotiated by the Spark client. */
        @com.fasterxml.jackson.annotation.JsonProperty("tlsProtocol")
        private TlsProtocol tlsProtocol;

        /**
         * TLS protocol negotiated by the Spark client.
         *
         * @param tlsProtocol the value to set
         * @return this builder
         */
        public Builder tlsProtocol(TlsProtocol tlsProtocol) {
            this.tlsProtocol = tlsProtocol;
            this.__explicitlySet__.add("tlsProtocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("artifactLocation")
        private SparkArtifactLocation artifactLocation;

        public Builder artifactLocation(SparkArtifactLocation artifactLocation) {
            this.artifactLocation = artifactLocation;
            this.__explicitlySet__.add("artifactLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SparkConnection build() {
            SparkConnection model =
                    new SparkConnection(
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
                            this.submitMode,
                            this.authenticationType,
                            this.securityProtocol,
                            this.clusterEndpoint,
                            this.restEndpoint,
                            this.authSecretSecretId,
                            this.rpcCipher,
                            this.restAuthSecretKeySecretId,
                            this.trustStoreSecretId,
                            this.trustStorePasswordSecretId,
                            this.trustStoreType,
                            this.keyStoreSecretId,
                            this.keyStorePasswordSecretId,
                            this.keyStoreType,
                            this.sslKeyPasswordSecretId,
                            this.tlsProtocol,
                            this.artifactLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SparkConnection model) {
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
            if (model.wasPropertyExplicitlySet("submitMode")) {
                this.submitMode(model.getSubmitMode());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
            }
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("clusterEndpoint")) {
                this.clusterEndpoint(model.getClusterEndpoint());
            }
            if (model.wasPropertyExplicitlySet("restEndpoint")) {
                this.restEndpoint(model.getRestEndpoint());
            }
            if (model.wasPropertyExplicitlySet("authSecretSecretId")) {
                this.authSecretSecretId(model.getAuthSecretSecretId());
            }
            if (model.wasPropertyExplicitlySet("rpcCipher")) {
                this.rpcCipher(model.getRpcCipher());
            }
            if (model.wasPropertyExplicitlySet("restAuthSecretKeySecretId")) {
                this.restAuthSecretKeySecretId(model.getRestAuthSecretKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("trustStoreSecretId")) {
                this.trustStoreSecretId(model.getTrustStoreSecretId());
            }
            if (model.wasPropertyExplicitlySet("trustStorePasswordSecretId")) {
                this.trustStorePasswordSecretId(model.getTrustStorePasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("trustStoreType")) {
                this.trustStoreType(model.getTrustStoreType());
            }
            if (model.wasPropertyExplicitlySet("keyStoreSecretId")) {
                this.keyStoreSecretId(model.getKeyStoreSecretId());
            }
            if (model.wasPropertyExplicitlySet("keyStorePasswordSecretId")) {
                this.keyStorePasswordSecretId(model.getKeyStorePasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("keyStoreType")) {
                this.keyStoreType(model.getKeyStoreType());
            }
            if (model.wasPropertyExplicitlySet("sslKeyPasswordSecretId")) {
                this.sslKeyPasswordSecretId(model.getSslKeyPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("tlsProtocol")) {
                this.tlsProtocol(model.getTlsProtocol());
            }
            if (model.wasPropertyExplicitlySet("artifactLocation")) {
                this.artifactLocation(model.getArtifactLocation());
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
    public SparkConnection(
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
            SubmitMode submitMode,
            AuthenticationType authenticationType,
            SecurityProtocol securityProtocol,
            String clusterEndpoint,
            String restEndpoint,
            String authSecretSecretId,
            RpcCipher rpcCipher,
            String restAuthSecretKeySecretId,
            String trustStoreSecretId,
            String trustStorePasswordSecretId,
            TrustStoreType trustStoreType,
            String keyStoreSecretId,
            String keyStorePasswordSecretId,
            KeyStoreType keyStoreType,
            String sslKeyPasswordSecretId,
            TlsProtocol tlsProtocol,
            SparkArtifactLocation artifactLocation) {
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
        this.submitMode = submitMode;
        this.authenticationType = authenticationType;
        this.securityProtocol = securityProtocol;
        this.clusterEndpoint = clusterEndpoint;
        this.restEndpoint = restEndpoint;
        this.authSecretSecretId = authSecretSecretId;
        this.rpcCipher = rpcCipher;
        this.restAuthSecretKeySecretId = restAuthSecretKeySecretId;
        this.trustStoreSecretId = trustStoreSecretId;
        this.trustStorePasswordSecretId = trustStorePasswordSecretId;
        this.trustStoreType = trustStoreType;
        this.keyStoreSecretId = keyStoreSecretId;
        this.keyStorePasswordSecretId = keyStorePasswordSecretId;
        this.keyStoreType = keyStoreType;
        this.sslKeyPasswordSecretId = sslKeyPasswordSecretId;
        this.tlsProtocol = tlsProtocol;
        this.artifactLocation = artifactLocation;
    }

    /** The Spark technology type. */
    public enum TechnologyType implements com.oracle.bmc.http.internal.BmcEnum {
        ApacheSpark("APACHE_SPARK"),

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
    /** The Spark technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The Spark technology type.
     *
     * @return the value
     */
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /** Submission channel used to connect to Spark. */
    public enum SubmitMode implements com.oracle.bmc.http.internal.BmcEnum {
        Submit("SUBMIT"),
        Rest("REST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SubmitMode.class);

        private final String value;
        private static java.util.Map<String, SubmitMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SubmitMode v : SubmitMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SubmitMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SubmitMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SubmitMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Submission channel used to connect to Spark. */
    @com.fasterxml.jackson.annotation.JsonProperty("submitMode")
    private final SubmitMode submitMode;

    /**
     * Submission channel used to connect to Spark.
     *
     * @return the value
     */
    public SubmitMode getSubmitMode() {
        return submitMode;
    }

    /** Authentication type for Spark. */
    public enum AuthenticationType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        SharedSecret("SHARED_SECRET"),

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
    /** Authentication type for Spark. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final AuthenticationType authenticationType;

    /**
     * Authentication type for Spark.
     *
     * @return the value
     */
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /** Security protocol for Spark submission traffic. */
    public enum SecurityProtocol implements com.oracle.bmc.http.internal.BmcEnum {
        Plaintext("PLAINTEXT"),
        Tls("TLS"),
        AesRpc("AES_RPC"),
        SaslEncrypted("SASL_ENCRYPTED"),

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
    /** Security protocol for Spark submission traffic. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final SecurityProtocol securityProtocol;

    /**
     * Security protocol for Spark submission traffic.
     *
     * @return the value
     */
    public SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * Spark master URL used for job submission. Required for both submitMode SUBMIT and REST. e.g.:
     * 'spark://spark-master.example.com:7077' High availability can be configured with a
     * comma-separated list, for example: 'spark://h1.example.com:7077,h2.example.com:7077'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterEndpoint")
    private final String clusterEndpoint;

    /**
     * Spark master URL used for job submission. Required for both submitMode SUBMIT and REST. e.g.:
     * 'spark://spark-master.example.com:7077' High availability can be configured with a
     * comma-separated list, for example: 'spark://h1.example.com:7077,h2.example.com:7077'
     *
     * @return the value
     */
    public String getClusterEndpoint() {
        return clusterEndpoint;
    }

    /**
     * Spark standalone REST submission base URL. e.g.: 'https://spark-master.example.com:6066'
     * Applicable only and required when submitMode is REST.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restEndpoint")
    private final String restEndpoint;

    /**
     * Spark standalone REST submission base URL. e.g.: 'https://spark-master.example.com:6066'
     * Applicable only and required when submitMode is REST.
     *
     * @return the value
     */
    public String getRestEndpoint() {
        return restEndpoint;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the Spark authentication shared secret. Applicable when authenticationType
     * is SHARED_SECRET. Note: When provided, 'authSecret' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecretSecretId")
    private final String authSecretSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the Spark authentication shared secret. Applicable when authenticationType
     * is SHARED_SECRET. Note: When provided, 'authSecret' field must not be provided.
     *
     * @return the value
     */
    public String getAuthSecretSecretId() {
        return authSecretSecretId;
    }

    /**
     * Cipher transform used for Spark RPC encryption. Applicable when securityProtocol is AES_RPC.
     */
    public enum RpcCipher implements com.oracle.bmc.http.internal.BmcEnum {
        AesCtrNopadding("AES_CTR_NOPADDING"),
        AesGcmNopadding("AES_GCM_NOPADDING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RpcCipher.class);

        private final String value;
        private static java.util.Map<String, RpcCipher> map;

        static {
            map = new java.util.HashMap<>();
            for (RpcCipher v : RpcCipher.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RpcCipher(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RpcCipher create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RpcCipher', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Cipher transform used for Spark RPC encryption. Applicable when securityProtocol is AES_RPC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rpcCipher")
    private final RpcCipher rpcCipher;

    /**
     * Cipher transform used for Spark RPC encryption. Applicable when securityProtocol is AES_RPC.
     *
     * @return the value
     */
    public RpcCipher getRpcCipher() {
        return rpcCipher;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the REST submission signing key. Applicable only when submitMode is REST
     * and the cluster enforces REST request signing. This setting is independent of
     * authenticationType. Note: When provided, 'restAuthSecretKey' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restAuthSecretKeySecretId")
    private final String restAuthSecretKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the REST submission signing key. Applicable only when submitMode is REST
     * and the cluster enforces REST request signing. This setting is independent of
     * authenticationType. Note: When provided, 'restAuthSecretKey' field must not be provided.
     *
     * @return the value
     */
    public String getRestAuthSecretKeySecretId() {
        return restAuthSecretKeySecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the trust store content. Applicable when securityProtocol is TLS. Provide
     * this when the server certificate is not already trusted by the JVM. Note: When provided,
     * 'trustStore' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
    private final String trustStoreSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the trust store content. Applicable when securityProtocol is TLS. Provide
     * this when the server certificate is not already trusted by the JVM. Note: When provided,
     * 'trustStore' field must not be provided.
     *
     * @return the value
     */
    public String getTrustStoreSecretId() {
        return trustStoreSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the trust store password. Applicable when securityProtocol is TLS and a
     * trust store is provided. Required when 'trustStoreSecretId' is provided. Note: When provided,
     * 'trustStorePassword' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
    private final String trustStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the trust store password. Applicable when securityProtocol is TLS and a
     * trust store is provided. Required when 'trustStoreSecretId' is provided. Note: When provided,
     * 'trustStorePassword' field must not be provided.
     *
     * @return the value
     */
    public String getTrustStorePasswordSecretId() {
        return trustStorePasswordSecretId;
    }

    /** Trust store format used by the Spark client. */
    public enum TrustStoreType implements com.oracle.bmc.http.internal.BmcEnum {
        Jks("JKS"),
        Pkcs12("PKCS12"),
        Jceks("JCEKS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TrustStoreType.class);

        private final String value;
        private static java.util.Map<String, TrustStoreType> map;

        static {
            map = new java.util.HashMap<>();
            for (TrustStoreType v : TrustStoreType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TrustStoreType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TrustStoreType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TrustStoreType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Trust store format used by the Spark client. */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreType")
    private final TrustStoreType trustStoreType;

    /**
     * Trust store format used by the Spark client.
     *
     * @return the value
     */
    public TrustStoreType getTrustStoreType() {
        return trustStoreType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the client key store content. Applicable when securityProtocol is TLS.
     * Note: When provided, 'keyStore' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreSecretId")
    private final String keyStoreSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the client key store content. Applicable when securityProtocol is TLS.
     * Note: When provided, 'keyStore' field must not be provided.
     *
     * @return the value
     */
    public String getKeyStoreSecretId() {
        return keyStoreSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the client key store password. Applicable when securityProtocol is TLS and
     * a client key store is provided. Required when 'keyStoreSecretId' is provided. Note: When
     * provided, 'keyStorePassword' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
    private final String keyStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the client key store password. Applicable when securityProtocol is TLS and
     * a client key store is provided. Required when 'keyStoreSecretId' is provided. Note: When
     * provided, 'keyStorePassword' field must not be provided.
     *
     * @return the value
     */
    public String getKeyStorePasswordSecretId() {
        return keyStorePasswordSecretId;
    }

    /** Client key store format used for mutual TLS. */
    public enum KeyStoreType implements com.oracle.bmc.http.internal.BmcEnum {
        Jks("JKS"),
        Pkcs12("PKCS12"),
        Jceks("JCEKS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(KeyStoreType.class);

        private final String value;
        private static java.util.Map<String, KeyStoreType> map;

        static {
            map = new java.util.HashMap<>();
            for (KeyStoreType v : KeyStoreType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        KeyStoreType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static KeyStoreType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'KeyStoreType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Client key store format used for mutual TLS. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreType")
    private final KeyStoreType keyStoreType;

    /**
     * Client key store format used for mutual TLS.
     *
     * @return the value
     */
    public KeyStoreType getKeyStoreType() {
        return keyStoreType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the private key password. Applicable when securityProtocol is TLS and a
     * client key store is provided. Note: When provided, 'sslKeyPassword' field must not be
     * provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPasswordSecretId")
    private final String sslKeyPasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the private key password. Applicable when securityProtocol is TLS and a
     * client key store is provided. Note: When provided, 'sslKeyPassword' field must not be
     * provided.
     *
     * @return the value
     */
    public String getSslKeyPasswordSecretId() {
        return sslKeyPasswordSecretId;
    }

    /** TLS protocol negotiated by the Spark client. */
    public enum TlsProtocol implements com.oracle.bmc.http.internal.BmcEnum {
        TlsV12("TLS_V1_2"),
        TlsV13("TLS_V1_3"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TlsProtocol.class);

        private final String value;
        private static java.util.Map<String, TlsProtocol> map;

        static {
            map = new java.util.HashMap<>();
            for (TlsProtocol v : TlsProtocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TlsProtocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TlsProtocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TlsProtocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** TLS protocol negotiated by the Spark client. */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsProtocol")
    private final TlsProtocol tlsProtocol;

    /**
     * TLS protocol negotiated by the Spark client.
     *
     * @return the value
     */
    public TlsProtocol getTlsProtocol() {
        return tlsProtocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("artifactLocation")
    private final SparkArtifactLocation artifactLocation;

    public SparkArtifactLocation getArtifactLocation() {
        return artifactLocation;
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
        sb.append("SparkConnection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", submitMode=").append(String.valueOf(this.submitMode));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", clusterEndpoint=").append(String.valueOf(this.clusterEndpoint));
        sb.append(", restEndpoint=").append(String.valueOf(this.restEndpoint));
        sb.append(", authSecretSecretId=").append(String.valueOf(this.authSecretSecretId));
        sb.append(", rpcCipher=").append(String.valueOf(this.rpcCipher));
        sb.append(", restAuthSecretKeySecretId=")
                .append(String.valueOf(this.restAuthSecretKeySecretId));
        sb.append(", trustStoreSecretId=").append(String.valueOf(this.trustStoreSecretId));
        sb.append(", trustStorePasswordSecretId=")
                .append(String.valueOf(this.trustStorePasswordSecretId));
        sb.append(", trustStoreType=").append(String.valueOf(this.trustStoreType));
        sb.append(", keyStoreSecretId=").append(String.valueOf(this.keyStoreSecretId));
        sb.append(", keyStorePasswordSecretId=")
                .append(String.valueOf(this.keyStorePasswordSecretId));
        sb.append(", keyStoreType=").append(String.valueOf(this.keyStoreType));
        sb.append(", sslKeyPasswordSecretId=").append(String.valueOf(this.sslKeyPasswordSecretId));
        sb.append(", tlsProtocol=").append(String.valueOf(this.tlsProtocol));
        sb.append(", artifactLocation=").append(String.valueOf(this.artifactLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SparkConnection)) {
            return false;
        }

        SparkConnection other = (SparkConnection) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.submitMode, other.submitMode)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.clusterEndpoint, other.clusterEndpoint)
                && java.util.Objects.equals(this.restEndpoint, other.restEndpoint)
                && java.util.Objects.equals(this.authSecretSecretId, other.authSecretSecretId)
                && java.util.Objects.equals(this.rpcCipher, other.rpcCipher)
                && java.util.Objects.equals(
                        this.restAuthSecretKeySecretId, other.restAuthSecretKeySecretId)
                && java.util.Objects.equals(this.trustStoreSecretId, other.trustStoreSecretId)
                && java.util.Objects.equals(
                        this.trustStorePasswordSecretId, other.trustStorePasswordSecretId)
                && java.util.Objects.equals(this.trustStoreType, other.trustStoreType)
                && java.util.Objects.equals(this.keyStoreSecretId, other.keyStoreSecretId)
                && java.util.Objects.equals(
                        this.keyStorePasswordSecretId, other.keyStorePasswordSecretId)
                && java.util.Objects.equals(this.keyStoreType, other.keyStoreType)
                && java.util.Objects.equals(
                        this.sslKeyPasswordSecretId, other.sslKeyPasswordSecretId)
                && java.util.Objects.equals(this.tlsProtocol, other.tlsProtocol)
                && java.util.Objects.equals(this.artifactLocation, other.artifactLocation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.submitMode == null ? 43 : this.submitMode.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterEndpoint == null ? 43 : this.clusterEndpoint.hashCode());
        result = (result * PRIME) + (this.restEndpoint == null ? 43 : this.restEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.authSecretSecretId == null
                                ? 43
                                : this.authSecretSecretId.hashCode());
        result = (result * PRIME) + (this.rpcCipher == null ? 43 : this.rpcCipher.hashCode());
        result =
                (result * PRIME)
                        + (this.restAuthSecretKeySecretId == null
                                ? 43
                                : this.restAuthSecretKeySecretId.hashCode());
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
                        + (this.trustStoreType == null ? 43 : this.trustStoreType.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreSecretId == null ? 43 : this.keyStoreSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStorePasswordSecretId == null
                                ? 43
                                : this.keyStorePasswordSecretId.hashCode());
        result = (result * PRIME) + (this.keyStoreType == null ? 43 : this.keyStoreType.hashCode());
        result =
                (result * PRIME)
                        + (this.sslKeyPasswordSecretId == null
                                ? 43
                                : this.sslKeyPasswordSecretId.hashCode());
        result = (result * PRIME) + (this.tlsProtocol == null ? 43 : this.tlsProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactLocation == null ? 43 : this.artifactLocation.hashCode());
        return result;
    }
}
