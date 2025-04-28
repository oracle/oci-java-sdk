/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the metadata of a Java Message Service Connection. <br>
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
        builder = JavaMessageServiceConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaMessageServiceConnection extends Connection {
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
        /** The Java Message Service technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The Java Message Service technology type.
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
         * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldUseJndi")
        private Boolean shouldUseJndi;

        /**
         * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
         *
         * @param shouldUseJndi the value to set
         * @return this builder
         */
        public Builder shouldUseJndi(Boolean shouldUseJndi) {
            this.shouldUseJndi = shouldUseJndi;
            this.__explicitlySet__.add("shouldUseJndi");
            return this;
        }
        /** The Connection Factory can be looked up using this name. e.g.: 'ConnectionFactory' */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiConnectionFactory")
        private String jndiConnectionFactory;

        /**
         * The Connection Factory can be looked up using this name. e.g.: 'ConnectionFactory'
         *
         * @param jndiConnectionFactory the value to set
         * @return this builder
         */
        public Builder jndiConnectionFactory(String jndiConnectionFactory) {
            this.jndiConnectionFactory = jndiConnectionFactory;
            this.__explicitlySet__.add("jndiConnectionFactory");
            return this;
        }
        /**
         * The URL that Java Message Service will use to contact the JNDI provider. e.g.:
         * 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiProviderUrl")
        private String jndiProviderUrl;

        /**
         * The URL that Java Message Service will use to contact the JNDI provider. e.g.:
         * 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
         *
         * @param jndiProviderUrl the value to set
         * @return this builder
         */
        public Builder jndiProviderUrl(String jndiProviderUrl) {
            this.jndiProviderUrl = jndiProviderUrl;
            this.__explicitlySet__.add("jndiProviderUrl");
            return this;
        }
        /**
         * The implementation of javax.naming.spi.InitialContextFactory interface that the client
         * uses to obtain initial naming context. e.g.:
         * 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiInitialContextFactory")
        private String jndiInitialContextFactory;

        /**
         * The implementation of javax.naming.spi.InitialContextFactory interface that the client
         * uses to obtain initial naming context. e.g.:
         * 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
         *
         * @param jndiInitialContextFactory the value to set
         * @return this builder
         */
        public Builder jndiInitialContextFactory(String jndiInitialContextFactory) {
            this.jndiInitialContextFactory = jndiInitialContextFactory;
            this.__explicitlySet__.add("jndiInitialContextFactory");
            return this;
        }
        /** Specifies the identity of the principal (user) to be authenticated. e.g.: 'admin2' */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityPrincipal")
        private String jndiSecurityPrincipal;

        /**
         * Specifies the identity of the principal (user) to be authenticated. e.g.: 'admin2'
         *
         * @param jndiSecurityPrincipal the value to set
         * @return this builder
         */
        public Builder jndiSecurityPrincipal(String jndiSecurityPrincipal) {
            this.jndiSecurityPrincipal = jndiSecurityPrincipal;
            this.__explicitlySet__.add("jndiSecurityPrincipal");
            return this;
        }
        /**
         * Connectin URL of the Java Message Service, specifying the protocol, host, and port. e.g.:
         * 'mq://myjms.host.domain:7676'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
        private String connectionUrl;

        /**
         * Connectin URL of the Java Message Service, specifying the protocol, host, and port. e.g.:
         * 'mq://myjms.host.domain:7676'
         *
         * @param connectionUrl the value to set
         * @return this builder
         */
        public Builder connectionUrl(String connectionUrl) {
            this.connectionUrl = connectionUrl;
            this.__explicitlySet__.add("connectionUrl");
            return this;
        }
        /**
         * The of Java class implementing javax.jms.ConnectionFactory interface supplied by the Java
         * Message Service provider. e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionFactory")
        private String connectionFactory;

        /**
         * The of Java class implementing javax.jms.ConnectionFactory interface supplied by the Java
         * Message Service provider. e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
         *
         * @param connectionFactory the value to set
         * @return this builder
         */
        public Builder connectionFactory(String connectionFactory) {
            this.connectionFactory = connectionFactory;
            this.__explicitlySet__.add("connectionFactory");
            return this;
        }
        /**
         * Security protocol for Java Message Service. If not provided, default is PLAIN. Optional
         * until 2024-06-27, in the release after it will be made required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private SecurityProtocol securityProtocol;

        /**
         * Security protocol for Java Message Service. If not provided, default is PLAIN. Optional
         * until 2024-06-27, in the release after it will be made required.
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
         * Authentication type for Java Message Service. If not provided, default is NONE. Optional
         * until 2024-06-27, in the release after it will be made required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private AuthenticationType authenticationType;

        /**
         * Authentication type for Java Message Service. If not provided, default is NONE. Optional
         * until 2024-06-27, in the release after it will be made required.
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
         * The username Oracle GoldenGate uses to connect to the Java Message Service. This username
         * must already exist and be available by the Java Message Service to be connected to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect to the Java Message Service. This username
         * must already exist and be available by the Java Message Service to be connected to.
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
         * Deprecated: this field will be removed in future versions. Either specify the private IP
         * in the connectionString or host field, or make sure the host name is resolvable in the
         * target VCN.
         *
         * <p>The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the
         * privateIp is provided, the subnetId must also be provided. In case the privateIp (and the
         * subnetId) is not provided it is assumed the datasource is publicly accessible. In case
         * the connection is accessible only privately, the lack of privateIp will result in not
         * being able to access the connection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * Deprecated: this field will be removed in future versions. Either specify the private IP
         * in the connectionString or host field, or make sure the host name is resolvable in the
         * target VCN.
         *
         * <p>The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the
         * privateIp is provided, the subnetId must also be provided. In case the privateIp (and the
         * subnetId) is not provided it is assumed the datasource is publicly accessible. In case
         * the connection is accessible only privately, the lack of privateIp will result in not
         * being able to access the connection.
         *
         * @param privateIp the value to set
         * @return this builder
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the security credentials are stored associated to the principal. Note: When
         * provided, 'jndiSecurityCredentials' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityCredentialsSecretId")
        private String jndiSecurityCredentialsSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the security credentials are stored associated to the principal. Note: When
         * provided, 'jndiSecurityCredentials' field must not be provided.
         *
         * @param jndiSecurityCredentialsSecretId the value to set
         * @return this builder
         */
        public Builder jndiSecurityCredentialsSecretId(String jndiSecurityCredentialsSecretId) {
            this.jndiSecurityCredentialsSecretId = jndiSecurityCredentialsSecretId;
            this.__explicitlySet__.add("jndiSecurityCredentialsSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the password is stored, that Oracle GoldenGate uses to connect the
         * associated Java Message Service. Note: When provided, 'password' field must not be
         * provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the password is stored, that Oracle GoldenGate uses to connect the
         * associated Java Message Service. Note: When provided, 'password' field must not be
         * provided.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the TrustStore password is stored. Note: When provided, 'trustStorePassword'
         * field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
        private String trustStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the TrustStore password is stored. Note: When provided, 'trustStorePassword'
         * field must not be provided.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the KeyStore password is stored. Note: When provided, 'keyStorePassword'
         * field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
        private String keyStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the KeyStore password is stored. Note: When provided, 'keyStorePassword'
         * field must not be provided.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the password is stored for the cert inside of the Keystore. In case it
         * differs from the KeyStore password, it should be provided. Note: When provided,
         * 'sslKeyPassword' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPasswordSecretId")
        private String sslKeyPasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the password is stored for the cert inside of the Keystore. In case it
         * differs from the KeyStore password, it should be provided. Note: When provided,
         * 'sslKeyPassword' field must not be provided.
         *
         * @param sslKeyPasswordSecretId the value to set
         * @return this builder
         */
        public Builder sslKeyPasswordSecretId(String sslKeyPasswordSecretId) {
            this.sslKeyPasswordSecretId = sslKeyPasswordSecretId;
            this.__explicitlySet__.add("sslKeyPasswordSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaMessageServiceConnection build() {
            JavaMessageServiceConnection model =
                    new JavaMessageServiceConnection(
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
                            this.technologyType,
                            this.shouldUseJndi,
                            this.jndiConnectionFactory,
                            this.jndiProviderUrl,
                            this.jndiInitialContextFactory,
                            this.jndiSecurityPrincipal,
                            this.connectionUrl,
                            this.connectionFactory,
                            this.securityProtocol,
                            this.authenticationType,
                            this.username,
                            this.privateIp,
                            this.jndiSecurityCredentialsSecretId,
                            this.passwordSecretId,
                            this.trustStoreSecretId,
                            this.trustStorePasswordSecretId,
                            this.keyStoreSecretId,
                            this.keyStorePasswordSecretId,
                            this.sslKeyPasswordSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaMessageServiceConnection model) {
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
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("shouldUseJndi")) {
                this.shouldUseJndi(model.getShouldUseJndi());
            }
            if (model.wasPropertyExplicitlySet("jndiConnectionFactory")) {
                this.jndiConnectionFactory(model.getJndiConnectionFactory());
            }
            if (model.wasPropertyExplicitlySet("jndiProviderUrl")) {
                this.jndiProviderUrl(model.getJndiProviderUrl());
            }
            if (model.wasPropertyExplicitlySet("jndiInitialContextFactory")) {
                this.jndiInitialContextFactory(model.getJndiInitialContextFactory());
            }
            if (model.wasPropertyExplicitlySet("jndiSecurityPrincipal")) {
                this.jndiSecurityPrincipal(model.getJndiSecurityPrincipal());
            }
            if (model.wasPropertyExplicitlySet("connectionUrl")) {
                this.connectionUrl(model.getConnectionUrl());
            }
            if (model.wasPropertyExplicitlySet("connectionFactory")) {
                this.connectionFactory(model.getConnectionFactory());
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
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("jndiSecurityCredentialsSecretId")) {
                this.jndiSecurityCredentialsSecretId(model.getJndiSecurityCredentialsSecretId());
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
            if (model.wasPropertyExplicitlySet("sslKeyPasswordSecretId")) {
                this.sslKeyPasswordSecretId(model.getSslKeyPasswordSecretId());
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
    public JavaMessageServiceConnection(
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
            TechnologyType technologyType,
            Boolean shouldUseJndi,
            String jndiConnectionFactory,
            String jndiProviderUrl,
            String jndiInitialContextFactory,
            String jndiSecurityPrincipal,
            String connectionUrl,
            String connectionFactory,
            SecurityProtocol securityProtocol,
            AuthenticationType authenticationType,
            String username,
            String privateIp,
            String jndiSecurityCredentialsSecretId,
            String passwordSecretId,
            String trustStoreSecretId,
            String trustStorePasswordSecretId,
            String keyStoreSecretId,
            String keyStorePasswordSecretId,
            String sslKeyPasswordSecretId) {
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
                doesUseSecretIds);
        this.technologyType = technologyType;
        this.shouldUseJndi = shouldUseJndi;
        this.jndiConnectionFactory = jndiConnectionFactory;
        this.jndiProviderUrl = jndiProviderUrl;
        this.jndiInitialContextFactory = jndiInitialContextFactory;
        this.jndiSecurityPrincipal = jndiSecurityPrincipal;
        this.connectionUrl = connectionUrl;
        this.connectionFactory = connectionFactory;
        this.securityProtocol = securityProtocol;
        this.authenticationType = authenticationType;
        this.username = username;
        this.privateIp = privateIp;
        this.jndiSecurityCredentialsSecretId = jndiSecurityCredentialsSecretId;
        this.passwordSecretId = passwordSecretId;
        this.trustStoreSecretId = trustStoreSecretId;
        this.trustStorePasswordSecretId = trustStorePasswordSecretId;
        this.keyStoreSecretId = keyStoreSecretId;
        this.keyStorePasswordSecretId = keyStorePasswordSecretId;
        this.sslKeyPasswordSecretId = sslKeyPasswordSecretId;
    }

    /** The Java Message Service technology type. */
    public enum TechnologyType implements com.oracle.bmc.http.internal.BmcEnum {
        OracleWeblogicJms("ORACLE_WEBLOGIC_JMS"),

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
    /** The Java Message Service technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The Java Message Service technology type.
     *
     * @return the value
     */
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /** If set to true, Java Naming and Directory Interface (JNDI) properties should be provided. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseJndi")
    private final Boolean shouldUseJndi;

    /**
     * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
     *
     * @return the value
     */
    public Boolean getShouldUseJndi() {
        return shouldUseJndi;
    }

    /** The Connection Factory can be looked up using this name. e.g.: 'ConnectionFactory' */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiConnectionFactory")
    private final String jndiConnectionFactory;

    /**
     * The Connection Factory can be looked up using this name. e.g.: 'ConnectionFactory'
     *
     * @return the value
     */
    public String getJndiConnectionFactory() {
        return jndiConnectionFactory;
    }

    /**
     * The URL that Java Message Service will use to contact the JNDI provider. e.g.:
     * 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiProviderUrl")
    private final String jndiProviderUrl;

    /**
     * The URL that Java Message Service will use to contact the JNDI provider. e.g.:
     * 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
     *
     * @return the value
     */
    public String getJndiProviderUrl() {
        return jndiProviderUrl;
    }

    /**
     * The implementation of javax.naming.spi.InitialContextFactory interface that the client uses
     * to obtain initial naming context. e.g.:
     * 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiInitialContextFactory")
    private final String jndiInitialContextFactory;

    /**
     * The implementation of javax.naming.spi.InitialContextFactory interface that the client uses
     * to obtain initial naming context. e.g.:
     * 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
     *
     * @return the value
     */
    public String getJndiInitialContextFactory() {
        return jndiInitialContextFactory;
    }

    /** Specifies the identity of the principal (user) to be authenticated. e.g.: 'admin2' */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityPrincipal")
    private final String jndiSecurityPrincipal;

    /**
     * Specifies the identity of the principal (user) to be authenticated. e.g.: 'admin2'
     *
     * @return the value
     */
    public String getJndiSecurityPrincipal() {
        return jndiSecurityPrincipal;
    }

    /**
     * Connectin URL of the Java Message Service, specifying the protocol, host, and port. e.g.:
     * 'mq://myjms.host.domain:7676'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
    private final String connectionUrl;

    /**
     * Connectin URL of the Java Message Service, specifying the protocol, host, and port. e.g.:
     * 'mq://myjms.host.domain:7676'
     *
     * @return the value
     */
    public String getConnectionUrl() {
        return connectionUrl;
    }

    /**
     * The of Java class implementing javax.jms.ConnectionFactory interface supplied by the Java
     * Message Service provider. e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionFactory")
    private final String connectionFactory;

    /**
     * The of Java class implementing javax.jms.ConnectionFactory interface supplied by the Java
     * Message Service provider. e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
     *
     * @return the value
     */
    public String getConnectionFactory() {
        return connectionFactory;
    }

    /**
     * Security protocol for Java Message Service. If not provided, default is PLAIN. Optional until
     * 2024-06-27, in the release after it will be made required.
     */
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
    /**
     * Security protocol for Java Message Service. If not provided, default is PLAIN. Optional until
     * 2024-06-27, in the release after it will be made required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final SecurityProtocol securityProtocol;

    /**
     * Security protocol for Java Message Service. If not provided, default is PLAIN. Optional until
     * 2024-06-27, in the release after it will be made required.
     *
     * @return the value
     */
    public SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * Authentication type for Java Message Service. If not provided, default is NONE. Optional
     * until 2024-06-27, in the release after it will be made required.
     */
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
    /**
     * Authentication type for Java Message Service. If not provided, default is NONE. Optional
     * until 2024-06-27, in the release after it will be made required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final AuthenticationType authenticationType;

    /**
     * Authentication type for Java Message Service. If not provided, default is NONE. Optional
     * until 2024-06-27, in the release after it will be made required.
     *
     * @return the value
     */
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * The username Oracle GoldenGate uses to connect to the Java Message Service. This username
     * must already exist and be available by the Java Message Service to be connected to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect to the Java Message Service. This username
     * must already exist and be available by the Java Message Service to be connected to.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /**
     * Deprecated: this field will be removed in future versions. Either specify the private IP in
     * the connectionString or host field, or make sure the host name is resolvable in the target
     * VCN.
     *
     * <p>The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the privateIp
     * is provided, the subnetId must also be provided. In case the privateIp (and the subnetId) is
     * not provided it is assumed the datasource is publicly accessible. In case the connection is
     * accessible only privately, the lack of privateIp will result in not being able to access the
     * connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * Deprecated: this field will be removed in future versions. Either specify the private IP in
     * the connectionString or host field, or make sure the host name is resolvable in the target
     * VCN.
     *
     * <p>The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the privateIp
     * is provided, the subnetId must also be provided. In case the privateIp (and the subnetId) is
     * not provided it is assumed the datasource is publicly accessible. In case the connection is
     * accessible only privately, the lack of privateIp will result in not being able to access the
     * connection.
     *
     * @return the value
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the security credentials are stored associated to the principal. Note: When
     * provided, 'jndiSecurityCredentials' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityCredentialsSecretId")
    private final String jndiSecurityCredentialsSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the security credentials are stored associated to the principal. Note: When
     * provided, 'jndiSecurityCredentials' field must not be provided.
     *
     * @return the value
     */
    public String getJndiSecurityCredentialsSecretId() {
        return jndiSecurityCredentialsSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the password is stored, that Oracle GoldenGate uses to connect the associated
     * Java Message Service. Note: When provided, 'password' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the password is stored, that Oracle GoldenGate uses to connect the associated
     * Java Message Service. Note: When provided, 'password' field must not be provided.
     *
     * @return the value
     */
    public String getPasswordSecretId() {
        return passwordSecretId;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the TrustStore password is stored. Note: When provided, 'trustStorePassword'
     * field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
    private final String trustStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the TrustStore password is stored. Note: When provided, 'trustStorePassword'
     * field must not be provided.
     *
     * @return the value
     */
    public String getTrustStorePasswordSecretId() {
        return trustStorePasswordSecretId;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the KeyStore password is stored. Note: When provided, 'keyStorePassword' field
     * must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
    private final String keyStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the KeyStore password is stored. Note: When provided, 'keyStorePassword' field
     * must not be provided.
     *
     * @return the value
     */
    public String getKeyStorePasswordSecretId() {
        return keyStorePasswordSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the password is stored for the cert inside of the Keystore. In case it differs
     * from the KeyStore password, it should be provided. Note: When provided, 'sslKeyPassword'
     * field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPasswordSecretId")
    private final String sslKeyPasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the password is stored for the cert inside of the Keystore. In case it differs
     * from the KeyStore password, it should be provided. Note: When provided, 'sslKeyPassword'
     * field must not be provided.
     *
     * @return the value
     */
    public String getSslKeyPasswordSecretId() {
        return sslKeyPasswordSecretId;
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
        sb.append("JavaMessageServiceConnection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", shouldUseJndi=").append(String.valueOf(this.shouldUseJndi));
        sb.append(", jndiConnectionFactory=").append(String.valueOf(this.jndiConnectionFactory));
        sb.append(", jndiProviderUrl=").append(String.valueOf(this.jndiProviderUrl));
        sb.append(", jndiInitialContextFactory=")
                .append(String.valueOf(this.jndiInitialContextFactory));
        sb.append(", jndiSecurityPrincipal=").append(String.valueOf(this.jndiSecurityPrincipal));
        sb.append(", connectionUrl=").append(String.valueOf(this.connectionUrl));
        sb.append(", connectionFactory=").append(String.valueOf(this.connectionFactory));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", jndiSecurityCredentialsSecretId=")
                .append(String.valueOf(this.jndiSecurityCredentialsSecretId));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", trustStoreSecretId=").append(String.valueOf(this.trustStoreSecretId));
        sb.append(", trustStorePasswordSecretId=")
                .append(String.valueOf(this.trustStorePasswordSecretId));
        sb.append(", keyStoreSecretId=").append(String.valueOf(this.keyStoreSecretId));
        sb.append(", keyStorePasswordSecretId=")
                .append(String.valueOf(this.keyStorePasswordSecretId));
        sb.append(", sslKeyPasswordSecretId=").append(String.valueOf(this.sslKeyPasswordSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaMessageServiceConnection)) {
            return false;
        }

        JavaMessageServiceConnection other = (JavaMessageServiceConnection) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.shouldUseJndi, other.shouldUseJndi)
                && java.util.Objects.equals(this.jndiConnectionFactory, other.jndiConnectionFactory)
                && java.util.Objects.equals(this.jndiProviderUrl, other.jndiProviderUrl)
                && java.util.Objects.equals(
                        this.jndiInitialContextFactory, other.jndiInitialContextFactory)
                && java.util.Objects.equals(this.jndiSecurityPrincipal, other.jndiSecurityPrincipal)
                && java.util.Objects.equals(this.connectionUrl, other.connectionUrl)
                && java.util.Objects.equals(this.connectionFactory, other.connectionFactory)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(
                        this.jndiSecurityCredentialsSecretId, other.jndiSecurityCredentialsSecretId)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.trustStoreSecretId, other.trustStoreSecretId)
                && java.util.Objects.equals(
                        this.trustStorePasswordSecretId, other.trustStorePasswordSecretId)
                && java.util.Objects.equals(this.keyStoreSecretId, other.keyStoreSecretId)
                && java.util.Objects.equals(
                        this.keyStorePasswordSecretId, other.keyStorePasswordSecretId)
                && java.util.Objects.equals(
                        this.sslKeyPasswordSecretId, other.sslKeyPasswordSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldUseJndi == null ? 43 : this.shouldUseJndi.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiConnectionFactory == null
                                ? 43
                                : this.jndiConnectionFactory.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiProviderUrl == null ? 43 : this.jndiProviderUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiInitialContextFactory == null
                                ? 43
                                : this.jndiInitialContextFactory.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiSecurityPrincipal == null
                                ? 43
                                : this.jndiSecurityPrincipal.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionUrl == null ? 43 : this.connectionUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionFactory == null ? 43 : this.connectionFactory.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiSecurityCredentialsSecretId == null
                                ? 43
                                : this.jndiSecurityCredentialsSecretId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.sslKeyPasswordSecretId == null
                                ? 43
                                : this.sslKeyPasswordSecretId.hashCode());
        return result;
    }
}
