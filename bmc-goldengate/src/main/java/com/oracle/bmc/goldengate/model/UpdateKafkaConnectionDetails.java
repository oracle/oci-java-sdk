/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update a Kafka Connection. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateKafkaConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateKafkaConnectionDetails extends UpdateConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
        private Boolean doesUseSecretIds;

        public Builder doesUseSecretIds(Boolean doesUseSecretIds) {
            this.doesUseSecretIds = doesUseSecretIds;
            this.__explicitlySet__.add("doesUseSecretIds");
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * stream pool being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
        private String streamPoolId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * stream pool being referenced.
         *
         * @param streamPoolId the value to set
         * @return this builder
         */
        public Builder streamPoolId(String streamPoolId) {
            this.streamPoolId = streamPoolId;
            this.__explicitlySet__.add("streamPoolId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Kafka cluster being referenced from OCI Streaming with Apache Kafka.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Kafka cluster being referenced from OCI Streaming with Apache Kafka.
         *
         * @param clusterId the value to set
         * @return this builder
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /**
         * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka: list of
         * KafkaBootstrapServer objects specified by host/port. Used for establishing the initial
         * connection to the Kafka cluster. Example: {@code
         * "server1.example.com:9092,server2.example.com:9092"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
        private java.util.List<KafkaBootstrapServer> bootstrapServers;

        /**
         * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka: list of
         * KafkaBootstrapServer objects specified by host/port. Used for establishing the initial
         * connection to the Kafka cluster. Example: {@code
         * "server1.example.com:9092,server2.example.com:9092"}
         *
         * @param bootstrapServers the value to set
         * @return this builder
         */
        public Builder bootstrapServers(java.util.List<KafkaBootstrapServer> bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            this.__explicitlySet__.add("bootstrapServers");
            return this;
        }
        /** Security Type for Kafka. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private KafkaConnection.SecurityProtocol securityProtocol;

        /**
         * Security Type for Kafka.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(KafkaConnection.SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
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
         * The password Oracle GoldenGate uses to connect the associated system of the given
         * technology. It must conform to the specific security requirements including length, case
         * sensitivity, and so on. Deprecated: This field is deprecated and replaced by
         * "passwordSecretId". This field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password Oracle GoldenGate uses to connect the associated system of the given
         * technology. It must conform to the specific security requirements including length, case
         * sensitivity, and so on. Deprecated: This field is deprecated and replaced by
         * "passwordSecretId". This field will be removed after February 15 2026.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
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
         * The base64 encoded content of the TrustStore file. Deprecated: This field is deprecated
         * and replaced by "trustStoreSecretId". This field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
        private String trustStore;

        /**
         * The base64 encoded content of the TrustStore file. Deprecated: This field is deprecated
         * and replaced by "trustStoreSecretId". This field will be removed after February 15 2026.
         *
         * @param trustStore the value to set
         * @return this builder
         */
        public Builder trustStore(String trustStore) {
            this.trustStore = trustStore;
            this.__explicitlySet__.add("trustStore");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the content of the TrustStore file is stored. Note: When provided,
         * 'trustStore' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
        private String trustStoreSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the content of the TrustStore file is stored. Note: When provided,
         * 'trustStore' field must not be provided.
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
         * The TrustStore password. Deprecated: This field is deprecated and replaced by
         * "trustStorePasswordSecretId". This field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
        private String trustStorePassword;

        /**
         * The TrustStore password. Deprecated: This field is deprecated and replaced by
         * "trustStorePasswordSecretId". This field will be removed after February 15 2026.
         *
         * @param trustStorePassword the value to set
         * @return this builder
         */
        public Builder trustStorePassword(String trustStorePassword) {
            this.trustStorePassword = trustStorePassword;
            this.__explicitlySet__.add("trustStorePassword");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the kafka TrustStore password is stored. Note: When provided,
         * 'trustStorePassword' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
        private String trustStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the kafka TrustStore password is stored. Note: When provided,
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
         * The base64 encoded content of the KeyStore file. Deprecated: This field is deprecated and
         * replaced by "keyStoreSecretId". This field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
        private String keyStore;

        /**
         * The base64 encoded content of the KeyStore file. Deprecated: This field is deprecated and
         * replaced by "keyStoreSecretId". This field will be removed after February 15 2026.
         *
         * @param keyStore the value to set
         * @return this builder
         */
        public Builder keyStore(String keyStore) {
            this.keyStore = keyStore;
            this.__explicitlySet__.add("keyStore");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the content of the KeyStore file is stored. Note: When provided, 'keyStore'
         * field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreSecretId")
        private String keyStoreSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the content of the KeyStore file is stored. Note: When provided, 'keyStore'
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
         * The KeyStore password. Deprecated: This field is deprecated and replaced by
         * "keyStorePasswordSecretId". This field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
        private String keyStorePassword;

        /**
         * The KeyStore password. Deprecated: This field is deprecated and replaced by
         * "keyStorePasswordSecretId". This field will be removed after February 15 2026.
         *
         * @param keyStorePassword the value to set
         * @return this builder
         */
        public Builder keyStorePassword(String keyStorePassword) {
            this.keyStorePassword = keyStorePassword;
            this.__explicitlySet__.add("keyStorePassword");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the kafka KeyStore password is stored. Note: When provided,
         * 'keyStorePassword' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
        private String keyStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the kafka KeyStore password is stored. Note: When provided,
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
        /**
         * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
         * password, it should be provided. Deprecated: This field is deprecated and replaced by
         * "sslKeyPasswordSecretId". This field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
        private String sslKeyPassword;

        /**
         * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
         * password, it should be provided. Deprecated: This field is deprecated and replaced by
         * "sslKeyPasswordSecretId". This field will be removed after February 15 2026.
         *
         * @param sslKeyPassword the value to set
         * @return this builder
         */
        public Builder sslKeyPassword(String sslKeyPassword) {
            this.sslKeyPassword = sslKeyPassword;
            this.__explicitlySet__.add("sslKeyPassword");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the kafka Ssl Key password is stored. Note: When provided, 'sslKeyPassword'
         * field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPasswordSecretId")
        private String sslKeyPasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the kafka Ssl Key password is stored. Note: When provided, 'sslKeyPassword'
         * field must not be provided.
         *
         * @param sslKeyPasswordSecretId the value to set
         * @return this builder
         */
        public Builder sslKeyPasswordSecretId(String sslKeyPasswordSecretId) {
            this.sslKeyPasswordSecretId = sslKeyPasswordSecretId;
            this.__explicitlySet__.add("sslKeyPasswordSecretId");
            return this;
        }
        /** The base64 encoded content of the consumer.properties file. */
        @com.fasterxml.jackson.annotation.JsonProperty("consumerProperties")
        private String consumerProperties;

        /**
         * The base64 encoded content of the consumer.properties file.
         *
         * @param consumerProperties the value to set
         * @return this builder
         */
        public Builder consumerProperties(String consumerProperties) {
            this.consumerProperties = consumerProperties;
            this.__explicitlySet__.add("consumerProperties");
            return this;
        }
        /** The base64 encoded content of the producer.properties file. */
        @com.fasterxml.jackson.annotation.JsonProperty("producerProperties")
        private String producerProperties;

        /**
         * The base64 encoded content of the producer.properties file.
         *
         * @param producerProperties the value to set
         * @return this builder
         */
        public Builder producerProperties(String producerProperties) {
            this.producerProperties = producerProperties;
            this.__explicitlySet__.add("producerProperties");
            return this;
        }
        /**
         * Specifies that the user intends to authenticate to the instance using a resource
         * principal. Applicable only for OCI Streaming connections. Only available from 23.9.0.0.0
         * GoldenGate versions. Note: When specified, 'username'/'password'/'passwordSecretId'
         * fields must not be provided. Default: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldUseResourcePrincipal")
        private Boolean shouldUseResourcePrincipal;

        /**
         * Specifies that the user intends to authenticate to the instance using a resource
         * principal. Applicable only for OCI Streaming connections. Only available from 23.9.0.0.0
         * GoldenGate versions. Note: When specified, 'username'/'password'/'passwordSecretId'
         * fields must not be provided. Default: false
         *
         * @param shouldUseResourcePrincipal the value to set
         * @return this builder
         */
        public Builder shouldUseResourcePrincipal(Boolean shouldUseResourcePrincipal) {
            this.shouldUseResourcePrincipal = shouldUseResourcePrincipal;
            this.__explicitlySet__.add("shouldUseResourcePrincipal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateKafkaConnectionDetails build() {
            UpdateKafkaConnectionDetails model =
                    new UpdateKafkaConnectionDetails(
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.vaultId,
                            this.keyId,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.securityAttributes,
                            this.streamPoolId,
                            this.clusterId,
                            this.bootstrapServers,
                            this.securityProtocol,
                            this.username,
                            this.password,
                            this.passwordSecretId,
                            this.trustStore,
                            this.trustStoreSecretId,
                            this.trustStorePassword,
                            this.trustStorePasswordSecretId,
                            this.keyStore,
                            this.keyStoreSecretId,
                            this.keyStorePassword,
                            this.keyStorePasswordSecretId,
                            this.sslKeyPassword,
                            this.sslKeyPasswordSecretId,
                            this.consumerProperties,
                            this.producerProperties,
                            this.shouldUseResourcePrincipal);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateKafkaConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("doesUseSecretIds")) {
                this.doesUseSecretIds(model.getDoesUseSecretIds());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("streamPoolId")) {
                this.streamPoolId(model.getStreamPoolId());
            }
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
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
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("trustStore")) {
                this.trustStore(model.getTrustStore());
            }
            if (model.wasPropertyExplicitlySet("trustStoreSecretId")) {
                this.trustStoreSecretId(model.getTrustStoreSecretId());
            }
            if (model.wasPropertyExplicitlySet("trustStorePassword")) {
                this.trustStorePassword(model.getTrustStorePassword());
            }
            if (model.wasPropertyExplicitlySet("trustStorePasswordSecretId")) {
                this.trustStorePasswordSecretId(model.getTrustStorePasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("keyStore")) {
                this.keyStore(model.getKeyStore());
            }
            if (model.wasPropertyExplicitlySet("keyStoreSecretId")) {
                this.keyStoreSecretId(model.getKeyStoreSecretId());
            }
            if (model.wasPropertyExplicitlySet("keyStorePassword")) {
                this.keyStorePassword(model.getKeyStorePassword());
            }
            if (model.wasPropertyExplicitlySet("keyStorePasswordSecretId")) {
                this.keyStorePasswordSecretId(model.getKeyStorePasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("sslKeyPassword")) {
                this.sslKeyPassword(model.getSslKeyPassword());
            }
            if (model.wasPropertyExplicitlySet("sslKeyPasswordSecretId")) {
                this.sslKeyPasswordSecretId(model.getSslKeyPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("consumerProperties")) {
                this.consumerProperties(model.getConsumerProperties());
            }
            if (model.wasPropertyExplicitlySet("producerProperties")) {
                this.producerProperties(model.getProducerProperties());
            }
            if (model.wasPropertyExplicitlySet("shouldUseResourcePrincipal")) {
                this.shouldUseResourcePrincipal(model.getShouldUseResourcePrincipal());
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
    public UpdateKafkaConnectionDetails(
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String vaultId,
            String keyId,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            String streamPoolId,
            String clusterId,
            java.util.List<KafkaBootstrapServer> bootstrapServers,
            KafkaConnection.SecurityProtocol securityProtocol,
            String username,
            String password,
            String passwordSecretId,
            String trustStore,
            String trustStoreSecretId,
            String trustStorePassword,
            String trustStorePasswordSecretId,
            String keyStore,
            String keyStoreSecretId,
            String keyStorePassword,
            String keyStorePasswordSecretId,
            String sslKeyPassword,
            String sslKeyPasswordSecretId,
            String consumerProperties,
            String producerProperties,
            Boolean shouldUseResourcePrincipal) {
        super(
                displayName,
                description,
                freeformTags,
                definedTags,
                vaultId,
                keyId,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds,
                securityAttributes);
        this.streamPoolId = streamPoolId;
        this.clusterId = clusterId;
        this.bootstrapServers = bootstrapServers;
        this.securityProtocol = securityProtocol;
        this.username = username;
        this.password = password;
        this.passwordSecretId = passwordSecretId;
        this.trustStore = trustStore;
        this.trustStoreSecretId = trustStoreSecretId;
        this.trustStorePassword = trustStorePassword;
        this.trustStorePasswordSecretId = trustStorePasswordSecretId;
        this.keyStore = keyStore;
        this.keyStoreSecretId = keyStoreSecretId;
        this.keyStorePassword = keyStorePassword;
        this.keyStorePasswordSecretId = keyStorePasswordSecretId;
        this.sslKeyPassword = sslKeyPassword;
        this.sslKeyPasswordSecretId = sslKeyPasswordSecretId;
        this.consumerProperties = consumerProperties;
        this.producerProperties = producerProperties;
        this.shouldUseResourcePrincipal = shouldUseResourcePrincipal;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * stream pool being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("streamPoolId")
    private final String streamPoolId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * stream pool being referenced.
     *
     * @return the value
     */
    public String getStreamPoolId() {
        return streamPoolId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Kafka cluster being referenced from OCI Streaming with Apache Kafka.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Kafka cluster being referenced from OCI Streaming with Apache Kafka.
     *
     * @return the value
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka: list of
     * KafkaBootstrapServer objects specified by host/port. Used for establishing the initial
     * connection to the Kafka cluster. Example: {@code
     * "server1.example.com:9092,server2.example.com:9092"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    private final java.util.List<KafkaBootstrapServer> bootstrapServers;

    /**
     * Kafka bootstrap. Equivalent of bootstrap.servers configuration property in Kafka: list of
     * KafkaBootstrapServer objects specified by host/port. Used for establishing the initial
     * connection to the Kafka cluster. Example: {@code
     * "server1.example.com:9092,server2.example.com:9092"}
     *
     * @return the value
     */
    public java.util.List<KafkaBootstrapServer> getBootstrapServers() {
        return bootstrapServers;
    }

    /** Security Type for Kafka. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final KafkaConnection.SecurityProtocol securityProtocol;

    /**
     * Security Type for Kafka.
     *
     * @return the value
     */
    public KafkaConnection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
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
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and
     * so on. Deprecated: This field is deprecated and replaced by "passwordSecretId". This field
     * will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password Oracle GoldenGate uses to connect the associated system of the given technology.
     * It must conform to the specific security requirements including length, case sensitivity, and
     * so on. Deprecated: This field is deprecated and replaced by "passwordSecretId". This field
     * will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
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
     * The base64 encoded content of the TrustStore file. Deprecated: This field is deprecated and
     * replaced by "trustStoreSecretId". This field will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
    private final String trustStore;

    /**
     * The base64 encoded content of the TrustStore file. Deprecated: This field is deprecated and
     * replaced by "trustStoreSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getTrustStore() {
        return trustStore;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the content of the TrustStore file is stored. Note: When provided, 'trustStore'
     * field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
    private final String trustStoreSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the content of the TrustStore file is stored. Note: When provided, 'trustStore'
     * field must not be provided.
     *
     * @return the value
     */
    public String getTrustStoreSecretId() {
        return trustStoreSecretId;
    }

    /**
     * The TrustStore password. Deprecated: This field is deprecated and replaced by
     * "trustStorePasswordSecretId". This field will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
    private final String trustStorePassword;

    /**
     * The TrustStore password. Deprecated: This field is deprecated and replaced by
     * "trustStorePasswordSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the kafka TrustStore password is stored. Note: When provided,
     * 'trustStorePassword' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
    private final String trustStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the kafka TrustStore password is stored. Note: When provided,
     * 'trustStorePassword' field must not be provided.
     *
     * @return the value
     */
    public String getTrustStorePasswordSecretId() {
        return trustStorePasswordSecretId;
    }

    /**
     * The base64 encoded content of the KeyStore file. Deprecated: This field is deprecated and
     * replaced by "keyStoreSecretId". This field will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
    private final String keyStore;

    /**
     * The base64 encoded content of the KeyStore file. Deprecated: This field is deprecated and
     * replaced by "keyStoreSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getKeyStore() {
        return keyStore;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the content of the KeyStore file is stored. Note: When provided, 'keyStore'
     * field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreSecretId")
    private final String keyStoreSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the content of the KeyStore file is stored. Note: When provided, 'keyStore'
     * field must not be provided.
     *
     * @return the value
     */
    public String getKeyStoreSecretId() {
        return keyStoreSecretId;
    }

    /**
     * The KeyStore password. Deprecated: This field is deprecated and replaced by
     * "keyStorePasswordSecretId". This field will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
    private final String keyStorePassword;

    /**
     * The KeyStore password. Deprecated: This field is deprecated and replaced by
     * "keyStorePasswordSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the kafka KeyStore password is stored. Note: When provided, 'keyStorePassword'
     * field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
    private final String keyStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the kafka KeyStore password is stored. Note: When provided, 'keyStorePassword'
     * field must not be provided.
     *
     * @return the value
     */
    public String getKeyStorePasswordSecretId() {
        return keyStorePasswordSecretId;
    }

    /**
     * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
     * password, it should be provided. Deprecated: This field is deprecated and replaced by
     * "sslKeyPasswordSecretId". This field will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
    private final String sslKeyPassword;

    /**
     * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
     * password, it should be provided. Deprecated: This field is deprecated and replaced by
     * "sslKeyPasswordSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the kafka Ssl Key password is stored. Note: When provided, 'sslKeyPassword'
     * field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPasswordSecretId")
    private final String sslKeyPasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the kafka Ssl Key password is stored. Note: When provided, 'sslKeyPassword'
     * field must not be provided.
     *
     * @return the value
     */
    public String getSslKeyPasswordSecretId() {
        return sslKeyPasswordSecretId;
    }

    /** The base64 encoded content of the consumer.properties file. */
    @com.fasterxml.jackson.annotation.JsonProperty("consumerProperties")
    private final String consumerProperties;

    /**
     * The base64 encoded content of the consumer.properties file.
     *
     * @return the value
     */
    public String getConsumerProperties() {
        return consumerProperties;
    }

    /** The base64 encoded content of the producer.properties file. */
    @com.fasterxml.jackson.annotation.JsonProperty("producerProperties")
    private final String producerProperties;

    /**
     * The base64 encoded content of the producer.properties file.
     *
     * @return the value
     */
    public String getProducerProperties() {
        return producerProperties;
    }

    /**
     * Specifies that the user intends to authenticate to the instance using a resource principal.
     * Applicable only for OCI Streaming connections. Only available from 23.9.0.0.0 GoldenGate
     * versions. Note: When specified, 'username'/'password'/'passwordSecretId' fields must not be
     * provided. Default: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseResourcePrincipal")
    private final Boolean shouldUseResourcePrincipal;

    /**
     * Specifies that the user intends to authenticate to the instance using a resource principal.
     * Applicable only for OCI Streaming connections. Only available from 23.9.0.0.0 GoldenGate
     * versions. Note: When specified, 'username'/'password'/'passwordSecretId' fields must not be
     * provided. Default: false
     *
     * @return the value
     */
    public Boolean getShouldUseResourcePrincipal() {
        return shouldUseResourcePrincipal;
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
        sb.append("UpdateKafkaConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", streamPoolId=").append(String.valueOf(this.streamPoolId));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", bootstrapServers=").append(String.valueOf(this.bootstrapServers));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", trustStore=").append(String.valueOf(this.trustStore));
        sb.append(", trustStoreSecretId=").append(String.valueOf(this.trustStoreSecretId));
        sb.append(", trustStorePassword=").append("<redacted>");
        sb.append(", trustStorePasswordSecretId=")
                .append(String.valueOf(this.trustStorePasswordSecretId));
        sb.append(", keyStore=").append(String.valueOf(this.keyStore));
        sb.append(", keyStoreSecretId=").append(String.valueOf(this.keyStoreSecretId));
        sb.append(", keyStorePassword=").append("<redacted>");
        sb.append(", keyStorePasswordSecretId=")
                .append(String.valueOf(this.keyStorePasswordSecretId));
        sb.append(", sslKeyPassword=").append("<redacted>");
        sb.append(", sslKeyPasswordSecretId=").append(String.valueOf(this.sslKeyPasswordSecretId));
        sb.append(", consumerProperties=").append(String.valueOf(this.consumerProperties));
        sb.append(", producerProperties=").append(String.valueOf(this.producerProperties));
        sb.append(", shouldUseResourcePrincipal=")
                .append(String.valueOf(this.shouldUseResourcePrincipal));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateKafkaConnectionDetails)) {
            return false;
        }

        UpdateKafkaConnectionDetails other = (UpdateKafkaConnectionDetails) o;
        return java.util.Objects.equals(this.streamPoolId, other.streamPoolId)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.bootstrapServers, other.bootstrapServers)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.trustStore, other.trustStore)
                && java.util.Objects.equals(this.trustStoreSecretId, other.trustStoreSecretId)
                && java.util.Objects.equals(this.trustStorePassword, other.trustStorePassword)
                && java.util.Objects.equals(
                        this.trustStorePasswordSecretId, other.trustStorePasswordSecretId)
                && java.util.Objects.equals(this.keyStore, other.keyStore)
                && java.util.Objects.equals(this.keyStoreSecretId, other.keyStoreSecretId)
                && java.util.Objects.equals(this.keyStorePassword, other.keyStorePassword)
                && java.util.Objects.equals(
                        this.keyStorePasswordSecretId, other.keyStorePasswordSecretId)
                && java.util.Objects.equals(this.sslKeyPassword, other.sslKeyPassword)
                && java.util.Objects.equals(
                        this.sslKeyPasswordSecretId, other.sslKeyPasswordSecretId)
                && java.util.Objects.equals(this.consumerProperties, other.consumerProperties)
                && java.util.Objects.equals(this.producerProperties, other.producerProperties)
                && java.util.Objects.equals(
                        this.shouldUseResourcePrincipal, other.shouldUseResourcePrincipal)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.streamPoolId == null ? 43 : this.streamPoolId.hashCode());
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.bootstrapServers == null ? 43 : this.bootstrapServers.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result = (result * PRIME) + (this.trustStore == null ? 43 : this.trustStore.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStoreSecretId == null
                                ? 43
                                : this.trustStoreSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStorePassword == null
                                ? 43
                                : this.trustStorePassword.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStorePasswordSecretId == null
                                ? 43
                                : this.trustStorePasswordSecretId.hashCode());
        result = (result * PRIME) + (this.keyStore == null ? 43 : this.keyStore.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreSecretId == null ? 43 : this.keyStoreSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStorePassword == null ? 43 : this.keyStorePassword.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStorePasswordSecretId == null
                                ? 43
                                : this.keyStorePasswordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.sslKeyPassword == null ? 43 : this.sslKeyPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.sslKeyPasswordSecretId == null
                                ? 43
                                : this.sslKeyPasswordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.consumerProperties == null
                                ? 43
                                : this.consumerProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.producerProperties == null
                                ? 43
                                : this.producerProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldUseResourcePrincipal == null
                                ? 43
                                : this.shouldUseResourcePrincipal.hashCode());
        return result;
    }
}
