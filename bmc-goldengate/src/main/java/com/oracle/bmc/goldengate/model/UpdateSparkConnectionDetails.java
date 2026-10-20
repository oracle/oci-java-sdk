/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update a Spark Connection. <br>
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
        builder = UpdateSparkConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSparkConnectionDetails extends UpdateConnectionDetails {
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
         * Selects the submission channel. SUBMIT uses the Spark master RPC endpoint. REST uses the
         * Spark standalone REST submission gateway.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("submitMode")
        private SparkConnection.SubmitMode submitMode;

        /**
         * Selects the submission channel. SUBMIT uses the Spark master RPC endpoint. REST uses the
         * Spark standalone REST submission gateway.
         *
         * @param submitMode the value to set
         * @return this builder
         */
        public Builder submitMode(SparkConnection.SubmitMode submitMode) {
            this.submitMode = submitMode;
            this.__explicitlySet__.add("submitMode");
            return this;
        }
        /**
         * Authentication type for Spark. AES_RPC and SASL_ENCRYPTED securityProtocol values require
         * authenticationType to be SHARED_SECRET. Use SHARED_SECRET only when the target cluster is
         * configured with spark.authenticate=true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private SparkConnection.AuthenticationType authenticationType;

        /**
         * Authentication type for Spark. AES_RPC and SASL_ENCRYPTED securityProtocol values require
         * authenticationType to be SHARED_SECRET. Use SHARED_SECRET only when the target cluster is
         * configured with spark.authenticate=true.
         *
         * @param authenticationType the value to set
         * @return this builder
         */
        public Builder authenticationType(SparkConnection.AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * Security protocol for Spark submission traffic. PLAINTEXT uses an unencrypted channel,
         * TLS uses TLS for the selected submission endpoint, AES_RPC uses Spark RPC AES encryption,
         * and SASL_ENCRYPTED uses legacy SASL encryption. AES_RPC and SASL_ENCRYPTED require
         * authenticationType to be SHARED_SECRET.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private SparkConnection.SecurityProtocol securityProtocol;

        /**
         * Security protocol for Spark submission traffic. PLAINTEXT uses an unencrypted channel,
         * TLS uses TLS for the selected submission endpoint, AES_RPC uses Spark RPC AES encryption,
         * and SASL_ENCRYPTED uses legacy SASL encryption. AES_RPC and SASL_ENCRYPTED require
         * authenticationType to be SHARED_SECRET.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(SparkConnection.SecurityProtocol securityProtocol) {
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
         * The shared secret used for Spark authentication. Applicable when authenticationType is
         * SHARED_SECRET.
         *
         * <p>Deprecated: This field is deprecated and replaced by "authSecretSecretId". This change
         * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authSecret")
        private char[] authSecret;

        /**
         * The shared secret used for Spark authentication. Applicable when authenticationType is
         * SHARED_SECRET.
         *
         * <p>Deprecated: This field is deprecated and replaced by "authSecretSecretId". This change
         * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param authSecret the value to set
         * @return this builder
         */
        public Builder authSecret(char[] authSecret) {
            this.authSecret = authSecret;
            this.__explicitlySet__.add("authSecret");
            return this;
        }

        public Builder authSecret(String authSecret) {
            this.authSecret = authSecret != null ? authSecret.toCharArray() : null;
            this.__explicitlySet__.add("authSecret");
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
         * AES_RPC. Defaults to AES_CTR_NOPADDING when not provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rpcCipher")
        private SparkConnection.RpcCipher rpcCipher;

        /**
         * Cipher transform used for Spark RPC encryption. Applicable when securityProtocol is
         * AES_RPC. Defaults to AES_CTR_NOPADDING when not provided.
         *
         * @param rpcCipher the value to set
         * @return this builder
         */
        public Builder rpcCipher(SparkConnection.RpcCipher rpcCipher) {
            this.rpcCipher = rpcCipher;
            this.__explicitlySet__.add("rpcCipher");
            return this;
        }
        /**
         * The BASE64URL-encoded HMAC secret key used to sign REST submission requests when the
         * Spark master's REST endpoint is protected by the JWS filter. Applicable only when
         * submitMode is REST and the cluster enforces REST request signing. This setting is
         * independent of authenticationType.
         *
         * <p>Deprecated: This field is deprecated and replaced by "restAuthSecretKeySecretId". This
         * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("restAuthSecretKey")
        private char[] restAuthSecretKey;

        /**
         * The BASE64URL-encoded HMAC secret key used to sign REST submission requests when the
         * Spark master's REST endpoint is protected by the JWS filter. Applicable only when
         * submitMode is REST and the cluster enforces REST request signing. This setting is
         * independent of authenticationType.
         *
         * <p>Deprecated: This field is deprecated and replaced by "restAuthSecretKeySecretId". This
         * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param restAuthSecretKey the value to set
         * @return this builder
         */
        public Builder restAuthSecretKey(char[] restAuthSecretKey) {
            this.restAuthSecretKey = restAuthSecretKey;
            this.__explicitlySet__.add("restAuthSecretKey");
            return this;
        }

        public Builder restAuthSecretKey(String restAuthSecretKey) {
            this.restAuthSecretKey =
                    restAuthSecretKey != null ? restAuthSecretKey.toCharArray() : null;
            this.__explicitlySet__.add("restAuthSecretKey");
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
         * The base64 encoded content of the trust store used to validate the Spark server
         * certificate. Applicable when securityProtocol is TLS. Provide this when the server
         * certificate is not already trusted by the JVM.
         *
         * <p>Deprecated: This field is deprecated and replaced by "trustStoreSecretId". This change
         * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
        private char[] trustStore;

        /**
         * The base64 encoded content of the trust store used to validate the Spark server
         * certificate. Applicable when securityProtocol is TLS. Provide this when the server
         * certificate is not already trusted by the JVM.
         *
         * <p>Deprecated: This field is deprecated and replaced by "trustStoreSecretId". This change
         * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param trustStore the value to set
         * @return this builder
         */
        public Builder trustStore(char[] trustStore) {
            this.trustStore = trustStore;
            this.__explicitlySet__.add("trustStore");
            return this;
        }

        public Builder trustStore(String trustStore) {
            this.trustStore = trustStore != null ? trustStore.toCharArray() : null;
            this.__explicitlySet__.add("trustStore");
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
         * Password for the trust store. Applicable when securityProtocol is TLS and a trust store
         * is provided. Required when 'trustStore' is provided.
         *
         * <p>Deprecated: This field is deprecated and replaced by "trustStorePasswordSecretId".
         * This change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
        private char[] trustStorePassword;

        /**
         * Password for the trust store. Applicable when securityProtocol is TLS and a trust store
         * is provided. Required when 'trustStore' is provided.
         *
         * <p>Deprecated: This field is deprecated and replaced by "trustStorePasswordSecretId".
         * This change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param trustStorePassword the value to set
         * @return this builder
         */
        public Builder trustStorePassword(char[] trustStorePassword) {
            this.trustStorePassword = trustStorePassword;
            this.__explicitlySet__.add("trustStorePassword");
            return this;
        }

        public Builder trustStorePassword(String trustStorePassword) {
            this.trustStorePassword =
                    trustStorePassword != null ? trustStorePassword.toCharArray() : null;
            this.__explicitlySet__.add("trustStorePassword");
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
        /**
         * Trust store format used by the Spark client. Applicable when securityProtocol is TLS and
         * a trust store is provided. Defaults to JKS when not provided. Provide this only when a
         * trust store is provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreType")
        private SparkConnection.TrustStoreType trustStoreType;

        /**
         * Trust store format used by the Spark client. Applicable when securityProtocol is TLS and
         * a trust store is provided. Defaults to JKS when not provided. Provide this only when a
         * trust store is provided.
         *
         * @param trustStoreType the value to set
         * @return this builder
         */
        public Builder trustStoreType(SparkConnection.TrustStoreType trustStoreType) {
            this.trustStoreType = trustStoreType;
            this.__explicitlySet__.add("trustStoreType");
            return this;
        }
        /**
         * The base64 encoded content of the client key store used for mutual TLS. Provide this only
         * when the target cluster requires client certificate authentication. Applicable when
         * securityProtocol is TLS.
         *
         * <p>Deprecated: This field is deprecated and replaced by "keyStoreSecretId". This change
         * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
        private char[] keyStore;

        /**
         * The base64 encoded content of the client key store used for mutual TLS. Provide this only
         * when the target cluster requires client certificate authentication. Applicable when
         * securityProtocol is TLS.
         *
         * <p>Deprecated: This field is deprecated and replaced by "keyStoreSecretId". This change
         * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param keyStore the value to set
         * @return this builder
         */
        public Builder keyStore(char[] keyStore) {
            this.keyStore = keyStore;
            this.__explicitlySet__.add("keyStore");
            return this;
        }

        public Builder keyStore(String keyStore) {
            this.keyStore = keyStore != null ? keyStore.toCharArray() : null;
            this.__explicitlySet__.add("keyStore");
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
         * Password for the client key store. Applicable when securityProtocol is TLS and a client
         * key store is provided. Required when 'keyStore' is provided.
         *
         * <p>Deprecated: This field is deprecated and replaced by "keyStorePasswordSecretId". This
         * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
        private char[] keyStorePassword;

        /**
         * Password for the client key store. Applicable when securityProtocol is TLS and a client
         * key store is provided. Required when 'keyStore' is provided.
         *
         * <p>Deprecated: This field is deprecated and replaced by "keyStorePasswordSecretId". This
         * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param keyStorePassword the value to set
         * @return this builder
         */
        public Builder keyStorePassword(char[] keyStorePassword) {
            this.keyStorePassword = keyStorePassword;
            this.__explicitlySet__.add("keyStorePassword");
            return this;
        }

        public Builder keyStorePassword(String keyStorePassword) {
            this.keyStorePassword =
                    keyStorePassword != null ? keyStorePassword.toCharArray() : null;
            this.__explicitlySet__.add("keyStorePassword");
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
        /**
         * Client key store format used for mutual TLS. Applicable when securityProtocol is TLS and
         * a client key store is provided. Defaults to JKS when not provided. Provide this only when
         * a client key store is provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreType")
        private SparkConnection.KeyStoreType keyStoreType;

        /**
         * Client key store format used for mutual TLS. Applicable when securityProtocol is TLS and
         * a client key store is provided. Defaults to JKS when not provided. Provide this only when
         * a client key store is provided.
         *
         * @param keyStoreType the value to set
         * @return this builder
         */
        public Builder keyStoreType(SparkConnection.KeyStoreType keyStoreType) {
            this.keyStoreType = keyStoreType;
            this.__explicitlySet__.add("keyStoreType");
            return this;
        }
        /**
         * Password for the certificate private key inside the client key store. Provide this only
         * when it differs from the key store password. Applicable when securityProtocol is TLS and
         * a client key store is provided.
         *
         * <p>Deprecated: This field is deprecated and replaced by "sslKeyPasswordSecretId". This
         * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
        private char[] sslKeyPassword;

        /**
         * Password for the certificate private key inside the client key store. Provide this only
         * when it differs from the key store password. Applicable when securityProtocol is TLS and
         * a client key store is provided.
         *
         * <p>Deprecated: This field is deprecated and replaced by "sslKeyPasswordSecretId". This
         * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param sslKeyPassword the value to set
         * @return this builder
         */
        public Builder sslKeyPassword(char[] sslKeyPassword) {
            this.sslKeyPassword = sslKeyPassword;
            this.__explicitlySet__.add("sslKeyPassword");
            return this;
        }

        public Builder sslKeyPassword(String sslKeyPassword) {
            this.sslKeyPassword = sslKeyPassword != null ? sslKeyPassword.toCharArray() : null;
            this.__explicitlySet__.add("sslKeyPassword");
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
        /**
         * TLS protocol negotiated by the Spark client. Applicable when securityProtocol is TLS.
         * Defaults to TLS_V1_3 when not provided. Must be supported by the target cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tlsProtocol")
        private SparkConnection.TlsProtocol tlsProtocol;

        /**
         * TLS protocol negotiated by the Spark client. Applicable when securityProtocol is TLS.
         * Defaults to TLS_V1_3 when not provided. Must be supported by the target cluster.
         *
         * @param tlsProtocol the value to set
         * @return this builder
         */
        public Builder tlsProtocol(SparkConnection.TlsProtocol tlsProtocol) {
            this.tlsProtocol = tlsProtocol;
            this.__explicitlySet__.add("tlsProtocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("artifactLocation")
        private UpdateSparkArtifactLocationDetails artifactLocation;

        public Builder artifactLocation(UpdateSparkArtifactLocationDetails artifactLocation) {
            this.artifactLocation = artifactLocation;
            this.__explicitlySet__.add("artifactLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSparkConnectionDetails build() {
            UpdateSparkConnectionDetails model =
                    new UpdateSparkConnectionDetails(
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
                            this.submitMode,
                            this.authenticationType,
                            this.securityProtocol,
                            this.clusterEndpoint,
                            this.restEndpoint,
                            this.authSecret,
                            this.authSecretSecretId,
                            this.rpcCipher,
                            this.restAuthSecretKey,
                            this.restAuthSecretKeySecretId,
                            this.trustStore,
                            this.trustStoreSecretId,
                            this.trustStorePassword,
                            this.trustStorePasswordSecretId,
                            this.trustStoreType,
                            this.keyStore,
                            this.keyStoreSecretId,
                            this.keyStorePassword,
                            this.keyStorePasswordSecretId,
                            this.keyStoreType,
                            this.sslKeyPassword,
                            this.sslKeyPasswordSecretId,
                            this.tlsProtocol,
                            this.artifactLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSparkConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("authSecret")) {
                this.authSecret(model.getAuthSecret());
            }
            if (model.wasPropertyExplicitlySet("authSecretSecretId")) {
                this.authSecretSecretId(model.getAuthSecretSecretId());
            }
            if (model.wasPropertyExplicitlySet("rpcCipher")) {
                this.rpcCipher(model.getRpcCipher());
            }
            if (model.wasPropertyExplicitlySet("restAuthSecretKey")) {
                this.restAuthSecretKey(model.getRestAuthSecretKey());
            }
            if (model.wasPropertyExplicitlySet("restAuthSecretKeySecretId")) {
                this.restAuthSecretKeySecretId(model.getRestAuthSecretKeySecretId());
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
            if (model.wasPropertyExplicitlySet("trustStoreType")) {
                this.trustStoreType(model.getTrustStoreType());
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
            if (model.wasPropertyExplicitlySet("keyStoreType")) {
                this.keyStoreType(model.getKeyStoreType());
            }
            if (model.wasPropertyExplicitlySet("sslKeyPassword")) {
                this.sslKeyPassword(model.getSslKeyPassword());
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
    public UpdateSparkConnectionDetails(
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
            SparkConnection.SubmitMode submitMode,
            SparkConnection.AuthenticationType authenticationType,
            SparkConnection.SecurityProtocol securityProtocol,
            String clusterEndpoint,
            String restEndpoint,
            String authSecret,
            String authSecretSecretId,
            SparkConnection.RpcCipher rpcCipher,
            String restAuthSecretKey,
            String restAuthSecretKeySecretId,
            String trustStore,
            String trustStoreSecretId,
            String trustStorePassword,
            String trustStorePasswordSecretId,
            SparkConnection.TrustStoreType trustStoreType,
            String keyStore,
            String keyStoreSecretId,
            String keyStorePassword,
            String keyStorePasswordSecretId,
            SparkConnection.KeyStoreType keyStoreType,
            String sslKeyPassword,
            String sslKeyPasswordSecretId,
            SparkConnection.TlsProtocol tlsProtocol,
            UpdateSparkArtifactLocationDetails artifactLocation) {
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
        this.submitMode = submitMode;
        this.authenticationType = authenticationType;
        this.securityProtocol = securityProtocol;
        this.clusterEndpoint = clusterEndpoint;
        this.restEndpoint = restEndpoint;
        this.authSecret = authSecret != null ? authSecret.toCharArray() : null;
        this.authSecretSecretId = authSecretSecretId;
        this.rpcCipher = rpcCipher;
        this.restAuthSecretKey = restAuthSecretKey != null ? restAuthSecretKey.toCharArray() : null;
        this.restAuthSecretKeySecretId = restAuthSecretKeySecretId;
        this.trustStore = trustStore != null ? trustStore.toCharArray() : null;
        this.trustStoreSecretId = trustStoreSecretId;
        this.trustStorePassword =
                trustStorePassword != null ? trustStorePassword.toCharArray() : null;
        this.trustStorePasswordSecretId = trustStorePasswordSecretId;
        this.trustStoreType = trustStoreType;
        this.keyStore = keyStore != null ? keyStore.toCharArray() : null;
        this.keyStoreSecretId = keyStoreSecretId;
        this.keyStorePassword = keyStorePassword != null ? keyStorePassword.toCharArray() : null;
        this.keyStorePasswordSecretId = keyStorePasswordSecretId;
        this.keyStoreType = keyStoreType;
        this.sslKeyPassword = sslKeyPassword != null ? sslKeyPassword.toCharArray() : null;
        this.sslKeyPasswordSecretId = sslKeyPasswordSecretId;
        this.tlsProtocol = tlsProtocol;
        this.artifactLocation = artifactLocation;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public UpdateSparkConnectionDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("displayName") String displayName,
            @com.fasterxml.jackson.annotation.JsonProperty("description") String description,
            @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
                    java.util.Map<String, String> freeformTags,
            @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
                    java.util.Map<String, java.util.Map<String, Object>> definedTags,
            @com.fasterxml.jackson.annotation.JsonProperty("vaultId") String vaultId,
            @com.fasterxml.jackson.annotation.JsonProperty("keyId") String keyId,
            @com.fasterxml.jackson.annotation.JsonProperty("nsgIds") java.util.List<String> nsgIds,
            @com.fasterxml.jackson.annotation.JsonProperty("subnetId") String subnetId,
            @com.fasterxml.jackson.annotation.JsonProperty("routingMethod")
                    RoutingMethod routingMethod,
            @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
                    Boolean doesUseSecretIds,
            @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
                    java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            @com.fasterxml.jackson.annotation.JsonProperty("submitMode")
                    SparkConnection.SubmitMode submitMode,
            @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
                    SparkConnection.AuthenticationType authenticationType,
            @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
                    SparkConnection.SecurityProtocol securityProtocol,
            @com.fasterxml.jackson.annotation.JsonProperty("clusterEndpoint")
                    String clusterEndpoint,
            @com.fasterxml.jackson.annotation.JsonProperty("restEndpoint") String restEndpoint,
            @com.fasterxml.jackson.annotation.JsonProperty("authSecret") char[] authSecret,
            @com.fasterxml.jackson.annotation.JsonProperty("authSecretSecretId")
                    String authSecretSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("rpcCipher")
                    SparkConnection.RpcCipher rpcCipher,
            @com.fasterxml.jackson.annotation.JsonProperty("restAuthSecretKey")
                    char[] restAuthSecretKey,
            @com.fasterxml.jackson.annotation.JsonProperty("restAuthSecretKeySecretId")
                    String restAuthSecretKeySecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("trustStore") char[] trustStore,
            @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
                    String trustStoreSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
                    char[] trustStorePassword,
            @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
                    String trustStorePasswordSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("trustStoreType")
                    SparkConnection.TrustStoreType trustStoreType,
            @com.fasterxml.jackson.annotation.JsonProperty("keyStore") char[] keyStore,
            @com.fasterxml.jackson.annotation.JsonProperty("keyStoreSecretId")
                    String keyStoreSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
                    char[] keyStorePassword,
            @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
                    String keyStorePasswordSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("keyStoreType")
                    SparkConnection.KeyStoreType keyStoreType,
            @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword") char[] sslKeyPassword,
            @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPasswordSecretId")
                    String sslKeyPasswordSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("tlsProtocol")
                    SparkConnection.TlsProtocol tlsProtocol,
            @com.fasterxml.jackson.annotation.JsonProperty("artifactLocation")
                    UpdateSparkArtifactLocationDetails artifactLocation) {
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
        this.submitMode = submitMode;
        this.authenticationType = authenticationType;
        this.securityProtocol = securityProtocol;
        this.clusterEndpoint = clusterEndpoint;
        this.restEndpoint = restEndpoint;
        this.authSecret = authSecret;
        this.authSecretSecretId = authSecretSecretId;
        this.rpcCipher = rpcCipher;
        this.restAuthSecretKey = restAuthSecretKey;
        this.restAuthSecretKeySecretId = restAuthSecretKeySecretId;
        this.trustStore = trustStore;
        this.trustStoreSecretId = trustStoreSecretId;
        this.trustStorePassword = trustStorePassword;
        this.trustStorePasswordSecretId = trustStorePasswordSecretId;
        this.trustStoreType = trustStoreType;
        this.keyStore = keyStore;
        this.keyStoreSecretId = keyStoreSecretId;
        this.keyStorePassword = keyStorePassword;
        this.keyStorePasswordSecretId = keyStorePasswordSecretId;
        this.keyStoreType = keyStoreType;
        this.sslKeyPassword = sslKeyPassword;
        this.sslKeyPasswordSecretId = sslKeyPasswordSecretId;
        this.tlsProtocol = tlsProtocol;
        this.artifactLocation = artifactLocation;
    }

    /**
     * Selects the submission channel. SUBMIT uses the Spark master RPC endpoint. REST uses the
     * Spark standalone REST submission gateway.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("submitMode")
    private final SparkConnection.SubmitMode submitMode;

    /**
     * Selects the submission channel. SUBMIT uses the Spark master RPC endpoint. REST uses the
     * Spark standalone REST submission gateway.
     *
     * @return the value
     */
    public SparkConnection.SubmitMode getSubmitMode() {
        return submitMode;
    }

    /**
     * Authentication type for Spark. AES_RPC and SASL_ENCRYPTED securityProtocol values require
     * authenticationType to be SHARED_SECRET. Use SHARED_SECRET only when the target cluster is
     * configured with spark.authenticate=true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final SparkConnection.AuthenticationType authenticationType;

    /**
     * Authentication type for Spark. AES_RPC and SASL_ENCRYPTED securityProtocol values require
     * authenticationType to be SHARED_SECRET. Use SHARED_SECRET only when the target cluster is
     * configured with spark.authenticate=true.
     *
     * @return the value
     */
    public SparkConnection.AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Security protocol for Spark submission traffic. PLAINTEXT uses an unencrypted channel, TLS
     * uses TLS for the selected submission endpoint, AES_RPC uses Spark RPC AES encryption, and
     * SASL_ENCRYPTED uses legacy SASL encryption. AES_RPC and SASL_ENCRYPTED require
     * authenticationType to be SHARED_SECRET.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final SparkConnection.SecurityProtocol securityProtocol;

    /**
     * Security protocol for Spark submission traffic. PLAINTEXT uses an unencrypted channel, TLS
     * uses TLS for the selected submission endpoint, AES_RPC uses Spark RPC AES encryption, and
     * SASL_ENCRYPTED uses legacy SASL encryption. AES_RPC and SASL_ENCRYPTED require
     * authenticationType to be SHARED_SECRET.
     *
     * @return the value
     */
    public SparkConnection.SecurityProtocol getSecurityProtocol() {
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
     * The shared secret used for Spark authentication. Applicable when authenticationType is
     * SHARED_SECRET.
     *
     * <p>Deprecated: This field is deprecated and replaced by "authSecretSecretId". This change
     * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecret")
    private final char[] authSecret;

    /**
     * The shared secret used for Spark authentication. Applicable when authenticationType is
     * SHARED_SECRET. &lt;p&gt; Deprecated: This field is deprecated and replaced by
     * &quot;authSecretSecretId&quot;. This change follows the GoldenGate &quot;Plain Text Fields in
     * Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getAuthSecret__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getAuthSecret() {
        return authSecret != null ? new String(authSecret) : null;
    }

    /**
     * The shared secret used for Spark authentication. Applicable when authenticationType is
     * SHARED_SECRET.
     *
     * <p>Deprecated: This field is deprecated and replaced by "authSecretSecretId". This change
     * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authSecret")
    public char[] getAuthSecret__AsCharArray() {
        return authSecret;
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
     * Defaults to AES_CTR_NOPADDING when not provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rpcCipher")
    private final SparkConnection.RpcCipher rpcCipher;

    /**
     * Cipher transform used for Spark RPC encryption. Applicable when securityProtocol is AES_RPC.
     * Defaults to AES_CTR_NOPADDING when not provided.
     *
     * @return the value
     */
    public SparkConnection.RpcCipher getRpcCipher() {
        return rpcCipher;
    }

    /**
     * The BASE64URL-encoded HMAC secret key used to sign REST submission requests when the Spark
     * master's REST endpoint is protected by the JWS filter. Applicable only when submitMode is
     * REST and the cluster enforces REST request signing. This setting is independent of
     * authenticationType.
     *
     * <p>Deprecated: This field is deprecated and replaced by "restAuthSecretKeySecretId". This
     * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restAuthSecretKey")
    private final char[] restAuthSecretKey;

    /**
     * The BASE64URL-encoded HMAC secret key used to sign REST submission requests when the Spark
     * master&#39;s REST endpoint is protected by the JWS filter. Applicable only when submitMode is
     * REST and the cluster enforces REST request signing. This setting is independent of
     * authenticationType. &lt;p&gt; Deprecated: This field is deprecated and replaced by
     * &quot;restAuthSecretKeySecretId&quot;. This change follows the GoldenGate &quot;Plain Text
     * Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getRestAuthSecretKey__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getRestAuthSecretKey() {
        return restAuthSecretKey != null ? new String(restAuthSecretKey) : null;
    }

    /**
     * The BASE64URL-encoded HMAC secret key used to sign REST submission requests when the Spark
     * master's REST endpoint is protected by the JWS filter. Applicable only when submitMode is
     * REST and the cluster enforces REST request signing. This setting is independent of
     * authenticationType.
     *
     * <p>Deprecated: This field is deprecated and replaced by "restAuthSecretKeySecretId". This
     * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restAuthSecretKey")
    public char[] getRestAuthSecretKey__AsCharArray() {
        return restAuthSecretKey;
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
     * The base64 encoded content of the trust store used to validate the Spark server certificate.
     * Applicable when securityProtocol is TLS. Provide this when the server certificate is not
     * already trusted by the JVM.
     *
     * <p>Deprecated: This field is deprecated and replaced by "trustStoreSecretId". This change
     * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
    private final char[] trustStore;

    /**
     * The base64 encoded content of the trust store used to validate the Spark server certificate.
     * Applicable when securityProtocol is TLS. Provide this when the server certificate is not
     * already trusted by the JVM. &lt;p&gt; Deprecated: This field is deprecated and replaced by
     * &quot;trustStoreSecretId&quot;. This change follows the GoldenGate &quot;Plain Text Fields in
     * Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getTrustStore__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getTrustStore() {
        return trustStore != null ? new String(trustStore) : null;
    }

    /**
     * The base64 encoded content of the trust store used to validate the Spark server certificate.
     * Applicable when securityProtocol is TLS. Provide this when the server certificate is not
     * already trusted by the JVM.
     *
     * <p>Deprecated: This field is deprecated and replaced by "trustStoreSecretId". This change
     * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
    public char[] getTrustStore__AsCharArray() {
        return trustStore;
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
     * Password for the trust store. Applicable when securityProtocol is TLS and a trust store is
     * provided. Required when 'trustStore' is provided.
     *
     * <p>Deprecated: This field is deprecated and replaced by "trustStorePasswordSecretId". This
     * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
    private final char[] trustStorePassword;

    /**
     * Password for the trust store. Applicable when securityProtocol is TLS and a trust store is
     * provided. Required when &#39;trustStore&#39; is provided. &lt;p&gt; Deprecated: This field is
     * deprecated and replaced by &quot;trustStorePasswordSecretId&quot;. This change follows the
     * GoldenGate &quot;Plain Text Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getTrustStorePassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getTrustStorePassword() {
        return trustStorePassword != null ? new String(trustStorePassword) : null;
    }

    /**
     * Password for the trust store. Applicable when securityProtocol is TLS and a trust store is
     * provided. Required when 'trustStore' is provided.
     *
     * <p>Deprecated: This field is deprecated and replaced by "trustStorePasswordSecretId". This
     * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
    public char[] getTrustStorePassword__AsCharArray() {
        return trustStorePassword;
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

    /**
     * Trust store format used by the Spark client. Applicable when securityProtocol is TLS and a
     * trust store is provided. Defaults to JKS when not provided. Provide this only when a trust
     * store is provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreType")
    private final SparkConnection.TrustStoreType trustStoreType;

    /**
     * Trust store format used by the Spark client. Applicable when securityProtocol is TLS and a
     * trust store is provided. Defaults to JKS when not provided. Provide this only when a trust
     * store is provided.
     *
     * @return the value
     */
    public SparkConnection.TrustStoreType getTrustStoreType() {
        return trustStoreType;
    }

    /**
     * The base64 encoded content of the client key store used for mutual TLS. Provide this only
     * when the target cluster requires client certificate authentication. Applicable when
     * securityProtocol is TLS.
     *
     * <p>Deprecated: This field is deprecated and replaced by "keyStoreSecretId". This change
     * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
    private final char[] keyStore;

    /**
     * The base64 encoded content of the client key store used for mutual TLS. Provide this only
     * when the target cluster requires client certificate authentication. Applicable when
     * securityProtocol is TLS. &lt;p&gt; Deprecated: This field is deprecated and replaced by
     * &quot;keyStoreSecretId&quot;. This change follows the GoldenGate &quot;Plain Text Fields in
     * Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getKeyStore__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getKeyStore() {
        return keyStore != null ? new String(keyStore) : null;
    }

    /**
     * The base64 encoded content of the client key store used for mutual TLS. Provide this only
     * when the target cluster requires client certificate authentication. Applicable when
     * securityProtocol is TLS.
     *
     * <p>Deprecated: This field is deprecated and replaced by "keyStoreSecretId". This change
     * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
    public char[] getKeyStore__AsCharArray() {
        return keyStore;
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
     * Password for the client key store. Applicable when securityProtocol is TLS and a client key
     * store is provided. Required when 'keyStore' is provided.
     *
     * <p>Deprecated: This field is deprecated and replaced by "keyStorePasswordSecretId". This
     * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
    private final char[] keyStorePassword;

    /**
     * Password for the client key store. Applicable when securityProtocol is TLS and a client key
     * store is provided. Required when &#39;keyStore&#39; is provided. &lt;p&gt; Deprecated: This
     * field is deprecated and replaced by &quot;keyStorePasswordSecretId&quot;. This change follows
     * the GoldenGate &quot;Plain Text Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getKeyStorePassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getKeyStorePassword() {
        return keyStorePassword != null ? new String(keyStorePassword) : null;
    }

    /**
     * Password for the client key store. Applicable when securityProtocol is TLS and a client key
     * store is provided. Required when 'keyStore' is provided.
     *
     * <p>Deprecated: This field is deprecated and replaced by "keyStorePasswordSecretId". This
     * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
    public char[] getKeyStorePassword__AsCharArray() {
        return keyStorePassword;
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

    /**
     * Client key store format used for mutual TLS. Applicable when securityProtocol is TLS and a
     * client key store is provided. Defaults to JKS when not provided. Provide this only when a
     * client key store is provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreType")
    private final SparkConnection.KeyStoreType keyStoreType;

    /**
     * Client key store format used for mutual TLS. Applicable when securityProtocol is TLS and a
     * client key store is provided. Defaults to JKS when not provided. Provide this only when a
     * client key store is provided.
     *
     * @return the value
     */
    public SparkConnection.KeyStoreType getKeyStoreType() {
        return keyStoreType;
    }

    /**
     * Password for the certificate private key inside the client key store. Provide this only when
     * it differs from the key store password. Applicable when securityProtocol is TLS and a client
     * key store is provided.
     *
     * <p>Deprecated: This field is deprecated and replaced by "sslKeyPasswordSecretId". This change
     * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
    private final char[] sslKeyPassword;

    /**
     * Password for the certificate private key inside the client key store. Provide this only when
     * it differs from the key store password. Applicable when securityProtocol is TLS and a client
     * key store is provided. &lt;p&gt; Deprecated: This field is deprecated and replaced by
     * &quot;sslKeyPasswordSecretId&quot;. This change follows the GoldenGate &quot;Plain Text
     * Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getSslKeyPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getSslKeyPassword() {
        return sslKeyPassword != null ? new String(sslKeyPassword) : null;
    }

    /**
     * Password for the certificate private key inside the client key store. Provide this only when
     * it differs from the key store password. Applicable when securityProtocol is TLS and a client
     * key store is provided.
     *
     * <p>Deprecated: This field is deprecated and replaced by "sslKeyPasswordSecretId". This change
     * follows the GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
    public char[] getSslKeyPassword__AsCharArray() {
        return sslKeyPassword;
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

    /**
     * TLS protocol negotiated by the Spark client. Applicable when securityProtocol is TLS.
     * Defaults to TLS_V1_3 when not provided. Must be supported by the target cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsProtocol")
    private final SparkConnection.TlsProtocol tlsProtocol;

    /**
     * TLS protocol negotiated by the Spark client. Applicable when securityProtocol is TLS.
     * Defaults to TLS_V1_3 when not provided. Must be supported by the target cluster.
     *
     * @return the value
     */
    public SparkConnection.TlsProtocol getTlsProtocol() {
        return tlsProtocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("artifactLocation")
    private final UpdateSparkArtifactLocationDetails artifactLocation;

    public UpdateSparkArtifactLocationDetails getArtifactLocation() {
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
        sb.append("UpdateSparkConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", submitMode=").append(String.valueOf(this.submitMode));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", clusterEndpoint=").append(String.valueOf(this.clusterEndpoint));
        sb.append(", restEndpoint=").append(String.valueOf(this.restEndpoint));
        sb.append(", authSecret=").append("<redacted>");
        sb.append(", authSecretSecretId=").append(String.valueOf(this.authSecretSecretId));
        sb.append(", rpcCipher=").append(String.valueOf(this.rpcCipher));
        sb.append(", restAuthSecretKey=").append("<redacted>");
        sb.append(", restAuthSecretKeySecretId=")
                .append(String.valueOf(this.restAuthSecretKeySecretId));
        sb.append(", trustStore=").append("<redacted>");
        sb.append(", trustStoreSecretId=").append(String.valueOf(this.trustStoreSecretId));
        sb.append(", trustStorePassword=").append("<redacted>");
        sb.append(", trustStorePasswordSecretId=")
                .append(String.valueOf(this.trustStorePasswordSecretId));
        sb.append(", trustStoreType=").append(String.valueOf(this.trustStoreType));
        sb.append(", keyStore=").append("<redacted>");
        sb.append(", keyStoreSecretId=").append(String.valueOf(this.keyStoreSecretId));
        sb.append(", keyStorePassword=").append("<redacted>");
        sb.append(", keyStorePasswordSecretId=")
                .append(String.valueOf(this.keyStorePasswordSecretId));
        sb.append(", keyStoreType=").append(String.valueOf(this.keyStoreType));
        sb.append(", sslKeyPassword=").append("<redacted>");
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
        if (!(o instanceof UpdateSparkConnectionDetails)) {
            return false;
        }

        UpdateSparkConnectionDetails other = (UpdateSparkConnectionDetails) o;
        return java.util.Objects.equals(this.submitMode, other.submitMode)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.clusterEndpoint, other.clusterEndpoint)
                && java.util.Objects.equals(this.restEndpoint, other.restEndpoint)
                && java.util.Objects.equals(this.authSecret, other.authSecret)
                && java.util.Objects.equals(this.authSecretSecretId, other.authSecretSecretId)
                && java.util.Objects.equals(this.rpcCipher, other.rpcCipher)
                && java.util.Objects.equals(this.restAuthSecretKey, other.restAuthSecretKey)
                && java.util.Objects.equals(
                        this.restAuthSecretKeySecretId, other.restAuthSecretKeySecretId)
                && java.util.Objects.equals(this.trustStore, other.trustStore)
                && java.util.Objects.equals(this.trustStoreSecretId, other.trustStoreSecretId)
                && java.util.Objects.equals(this.trustStorePassword, other.trustStorePassword)
                && java.util.Objects.equals(
                        this.trustStorePasswordSecretId, other.trustStorePasswordSecretId)
                && java.util.Objects.equals(this.trustStoreType, other.trustStoreType)
                && java.util.Objects.equals(this.keyStore, other.keyStore)
                && java.util.Objects.equals(this.keyStoreSecretId, other.keyStoreSecretId)
                && java.util.Objects.equals(this.keyStorePassword, other.keyStorePassword)
                && java.util.Objects.equals(
                        this.keyStorePasswordSecretId, other.keyStorePasswordSecretId)
                && java.util.Objects.equals(this.keyStoreType, other.keyStoreType)
                && java.util.Objects.equals(this.sslKeyPassword, other.sslKeyPassword)
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
        result = (result * PRIME) + (this.authSecret == null ? 43 : this.authSecret.hashCode());
        result =
                (result * PRIME)
                        + (this.authSecretSecretId == null
                                ? 43
                                : this.authSecretSecretId.hashCode());
        result = (result * PRIME) + (this.rpcCipher == null ? 43 : this.rpcCipher.hashCode());
        result =
                (result * PRIME)
                        + (this.restAuthSecretKey == null ? 43 : this.restAuthSecretKey.hashCode());
        result =
                (result * PRIME)
                        + (this.restAuthSecretKeySecretId == null
                                ? 43
                                : this.restAuthSecretKeySecretId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.trustStoreType == null ? 43 : this.trustStoreType.hashCode());
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
        result = (result * PRIME) + (this.keyStoreType == null ? 43 : this.keyStoreType.hashCode());
        result =
                (result * PRIME)
                        + (this.sslKeyPassword == null ? 43 : this.sslKeyPassword.hashCode());
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
