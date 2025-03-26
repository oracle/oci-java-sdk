/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update a Java Message Service Connection.
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
    builder = UpdateJavaMessageServiceConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateJavaMessageServiceConnectionDetails extends UpdateConnectionDetails {
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
        /**
         * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldUseJndi")
        private Boolean shouldUseJndi;

        /**
         * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
         *
         * @param shouldUseJndi the value to set
         * @return this builder
         **/
        public Builder shouldUseJndi(Boolean shouldUseJndi) {
            this.shouldUseJndi = shouldUseJndi;
            this.__explicitlySet__.add("shouldUseJndi");
            return this;
        }
        /**
         * The Connection Factory can be looked up using this name.
         * e.g.: 'ConnectionFactory'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jndiConnectionFactory")
        private String jndiConnectionFactory;

        /**
         * The Connection Factory can be looked up using this name.
         * e.g.: 'ConnectionFactory'
         *
         * @param jndiConnectionFactory the value to set
         * @return this builder
         **/
        public Builder jndiConnectionFactory(String jndiConnectionFactory) {
            this.jndiConnectionFactory = jndiConnectionFactory;
            this.__explicitlySet__.add("jndiConnectionFactory");
            return this;
        }
        /**
         * The URL that Java Message Service will use to contact the JNDI provider.
         * e.g.: 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jndiProviderUrl")
        private String jndiProviderUrl;

        /**
         * The URL that Java Message Service will use to contact the JNDI provider.
         * e.g.: 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
         *
         * @param jndiProviderUrl the value to set
         * @return this builder
         **/
        public Builder jndiProviderUrl(String jndiProviderUrl) {
            this.jndiProviderUrl = jndiProviderUrl;
            this.__explicitlySet__.add("jndiProviderUrl");
            return this;
        }
        /**
         * The implementation of javax.naming.spi.InitialContextFactory interface
         * that the client uses to obtain initial naming context.
         * e.g.: 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jndiInitialContextFactory")
        private String jndiInitialContextFactory;

        /**
         * The implementation of javax.naming.spi.InitialContextFactory interface
         * that the client uses to obtain initial naming context.
         * e.g.: 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
         *
         * @param jndiInitialContextFactory the value to set
         * @return this builder
         **/
        public Builder jndiInitialContextFactory(String jndiInitialContextFactory) {
            this.jndiInitialContextFactory = jndiInitialContextFactory;
            this.__explicitlySet__.add("jndiInitialContextFactory");
            return this;
        }
        /**
         * Specifies the identity of the principal (user) to be authenticated.
         * e.g.: 'admin2'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityPrincipal")
        private String jndiSecurityPrincipal;

        /**
         * Specifies the identity of the principal (user) to be authenticated.
         * e.g.: 'admin2'
         *
         * @param jndiSecurityPrincipal the value to set
         * @return this builder
         **/
        public Builder jndiSecurityPrincipal(String jndiSecurityPrincipal) {
            this.jndiSecurityPrincipal = jndiSecurityPrincipal;
            this.__explicitlySet__.add("jndiSecurityPrincipal");
            return this;
        }
        /**
         * The password associated to the principal.
         * Deprecated: This field is deprecated and replaced by "jndiSecurityCredentialsSecretId". This field will be removed after February 15 2026.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityCredentials")
        private String jndiSecurityCredentials;

        /**
         * The password associated to the principal.
         * Deprecated: This field is deprecated and replaced by "jndiSecurityCredentialsSecretId". This field will be removed after February 15 2026.
         *
         * @param jndiSecurityCredentials the value to set
         * @return this builder
         **/
        public Builder jndiSecurityCredentials(String jndiSecurityCredentials) {
            this.jndiSecurityCredentials = jndiSecurityCredentials;
            this.__explicitlySet__.add("jndiSecurityCredentials");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the security credentials are stored associated to the principal.
         * Note: When provided, 'jndiSecurityCredentials' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityCredentialsSecretId")
        private String jndiSecurityCredentialsSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the security credentials are stored associated to the principal.
         * Note: When provided, 'jndiSecurityCredentials' field must not be provided.
         *
         * @param jndiSecurityCredentialsSecretId the value to set
         * @return this builder
         **/
        public Builder jndiSecurityCredentialsSecretId(String jndiSecurityCredentialsSecretId) {
            this.jndiSecurityCredentialsSecretId = jndiSecurityCredentialsSecretId;
            this.__explicitlySet__.add("jndiSecurityCredentialsSecretId");
            return this;
        }
        /**
         * Connectin URL of the Java Message Service, specifying the protocol, host, and port.
         * e.g.: 'mq://myjms.host.domain:7676'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
        private String connectionUrl;

        /**
         * Connectin URL of the Java Message Service, specifying the protocol, host, and port.
         * e.g.: 'mq://myjms.host.domain:7676'
         *
         * @param connectionUrl the value to set
         * @return this builder
         **/
        public Builder connectionUrl(String connectionUrl) {
            this.connectionUrl = connectionUrl;
            this.__explicitlySet__.add("connectionUrl");
            return this;
        }
        /**
         * The of Java class implementing javax.jms.ConnectionFactory interface
         * supplied by the Java Message Service provider.
         * e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionFactory")
        private String connectionFactory;

        /**
         * The of Java class implementing javax.jms.ConnectionFactory interface
         * supplied by the Java Message Service provider.
         * e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
         *
         * @param connectionFactory the value to set
         * @return this builder
         **/
        public Builder connectionFactory(String connectionFactory) {
            this.connectionFactory = connectionFactory;
            this.__explicitlySet__.add("connectionFactory");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect to the Java Message Service.
         * This username must already exist and be available by the Java Message Service to be connected to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect to the Java Message Service.
         * This username must already exist and be available by the Java Message Service to be connected to.
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
         * The password Oracle GoldenGate uses to connect the associated Java Message Service.
         * Deprecated: This field is deprecated and replaced by "passwordSecretId". This field will be removed after February 15 2026.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password Oracle GoldenGate uses to connect the associated Java Message Service.
         * Deprecated: This field is deprecated and replaced by "passwordSecretId". This field will be removed after February 15 2026.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored,
         * that Oracle GoldenGate uses to connect the associated Java Message Service.
         * Note: When provided, 'password' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored,
         * that Oracle GoldenGate uses to connect the associated Java Message Service.
         * Note: When provided, 'password' field must not be provided.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         **/
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /**
         * Security protocol for Java Message Service. If not provided, default is PLAIN.
         * Optional until 2024-06-27, in the release after it will be made required.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private JavaMessageServiceConnection.SecurityProtocol securityProtocol;

        /**
         * Security protocol for Java Message Service. If not provided, default is PLAIN.
         * Optional until 2024-06-27, in the release after it will be made required.
         *
         * @param securityProtocol the value to set
         * @return this builder
         **/
        public Builder securityProtocol(
                JavaMessageServiceConnection.SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * Authentication type for Java Message Service.  If not provided, default is NONE.
         * Optional until 2024-06-27, in the release after it will be made required.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private JavaMessageServiceConnection.AuthenticationType authenticationType;

        /**
         * Authentication type for Java Message Service.  If not provided, default is NONE.
         * Optional until 2024-06-27, in the release after it will be made required.
         *
         * @param authenticationType the value to set
         * @return this builder
         **/
        public Builder authenticationType(
                JavaMessageServiceConnection.AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * The base64 encoded content of the TrustStore file.
         * Deprecated: This field is deprecated and replaced by "trustStoreSecretId". This field will be removed after February 15 2026.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
        private String trustStore;

        /**
         * The base64 encoded content of the TrustStore file.
         * Deprecated: This field is deprecated and replaced by "trustStoreSecretId". This field will be removed after February 15 2026.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the content of the TrustStore file is stored.
         * Note: When provided, 'trustStore' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
        private String trustStoreSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the content of the TrustStore file is stored.
         * Note: When provided, 'trustStore' field must not be provided.
         *
         * @param trustStoreSecretId the value to set
         * @return this builder
         **/
        public Builder trustStoreSecretId(String trustStoreSecretId) {
            this.trustStoreSecretId = trustStoreSecretId;
            this.__explicitlySet__.add("trustStoreSecretId");
            return this;
        }
        /**
         * The TrustStore password.
         * Deprecated: This field is deprecated and replaced by "trustStorePasswordSecretId". This field will be removed after February 15 2026.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
        private String trustStorePassword;

        /**
         * The TrustStore password.
         * Deprecated: This field is deprecated and replaced by "trustStorePasswordSecretId". This field will be removed after February 15 2026.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the TrustStore password is stored.
         * Note: When provided, 'trustStorePassword' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
        private String trustStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the TrustStore password is stored.
         * Note: When provided, 'trustStorePassword' field must not be provided.
         *
         * @param trustStorePasswordSecretId the value to set
         * @return this builder
         **/
        public Builder trustStorePasswordSecretId(String trustStorePasswordSecretId) {
            this.trustStorePasswordSecretId = trustStorePasswordSecretId;
            this.__explicitlySet__.add("trustStorePasswordSecretId");
            return this;
        }
        /**
         * The base64 encoded content of the KeyStore file.
         * Deprecated: This field is deprecated and replaced by "keyStoreSecretId". This field will be removed after February 15 2026.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
        private String keyStore;

        /**
         * The base64 encoded content of the KeyStore file.
         * Deprecated: This field is deprecated and replaced by "keyStoreSecretId". This field will be removed after February 15 2026.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the content of the KeyStore file is stored.
         * Note: When provided, 'keyStore' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreSecretId")
        private String keyStoreSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the content of the KeyStore file is stored.
         * Note: When provided, 'keyStore' field must not be provided.
         *
         * @param keyStoreSecretId the value to set
         * @return this builder
         **/
        public Builder keyStoreSecretId(String keyStoreSecretId) {
            this.keyStoreSecretId = keyStoreSecretId;
            this.__explicitlySet__.add("keyStoreSecretId");
            return this;
        }
        /**
         * The KeyStore password.
         * Deprecated: This field is deprecated and replaced by "keyStorePasswordSecretId". This field will be removed after February 15 2026.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
        private String keyStorePassword;

        /**
         * The KeyStore password.
         * Deprecated: This field is deprecated and replaced by "keyStorePasswordSecretId". This field will be removed after February 15 2026.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the KeyStore password is stored.
         * Note: When provided, 'keyStorePassword' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
        private String keyStorePasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the KeyStore password is stored.
         * Note: When provided, 'keyStorePassword' field must not be provided.
         *
         * @param keyStorePasswordSecretId the value to set
         * @return this builder
         **/
        public Builder keyStorePasswordSecretId(String keyStorePasswordSecretId) {
            this.keyStorePasswordSecretId = keyStorePasswordSecretId;
            this.__explicitlySet__.add("keyStorePasswordSecretId");
            return this;
        }
        /**
         * The password for the cert inside of the KeyStore.
         * In case it differs from the KeyStore password, it should be provided.
         * Deprecated: This field is deprecated and replaced by "sslKeyPasswordSecretId". This field will be removed after February 15 2026.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
        private String sslKeyPassword;

        /**
         * The password for the cert inside of the KeyStore.
         * In case it differs from the KeyStore password, it should be provided.
         * Deprecated: This field is deprecated and replaced by "sslKeyPasswordSecretId". This field will be removed after February 15 2026.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored for the cert inside of the Keystore.
         * In case it differs from the KeyStore password, it should be provided.
         * Note: When provided, 'sslKeyPassword' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPasswordSecretId")
        private String sslKeyPasswordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored for the cert inside of the Keystore.
         * In case it differs from the KeyStore password, it should be provided.
         * Note: When provided, 'sslKeyPassword' field must not be provided.
         *
         * @param sslKeyPasswordSecretId the value to set
         * @return this builder
         **/
        public Builder sslKeyPasswordSecretId(String sslKeyPasswordSecretId) {
            this.sslKeyPasswordSecretId = sslKeyPasswordSecretId;
            this.__explicitlySet__.add("sslKeyPasswordSecretId");
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

        public UpdateJavaMessageServiceConnectionDetails build() {
            UpdateJavaMessageServiceConnectionDetails model =
                    new UpdateJavaMessageServiceConnectionDetails(
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
                            this.shouldUseJndi,
                            this.jndiConnectionFactory,
                            this.jndiProviderUrl,
                            this.jndiInitialContextFactory,
                            this.jndiSecurityPrincipal,
                            this.jndiSecurityCredentials,
                            this.jndiSecurityCredentialsSecretId,
                            this.connectionUrl,
                            this.connectionFactory,
                            this.username,
                            this.password,
                            this.passwordSecretId,
                            this.securityProtocol,
                            this.authenticationType,
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
                            this.privateIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateJavaMessageServiceConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("jndiSecurityCredentials")) {
                this.jndiSecurityCredentials(model.getJndiSecurityCredentials());
            }
            if (model.wasPropertyExplicitlySet("jndiSecurityCredentialsSecretId")) {
                this.jndiSecurityCredentialsSecretId(model.getJndiSecurityCredentialsSecretId());
            }
            if (model.wasPropertyExplicitlySet("connectionUrl")) {
                this.connectionUrl(model.getConnectionUrl());
            }
            if (model.wasPropertyExplicitlySet("connectionFactory")) {
                this.connectionFactory(model.getConnectionFactory());
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
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
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
    public UpdateJavaMessageServiceConnectionDetails(
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
            Boolean shouldUseJndi,
            String jndiConnectionFactory,
            String jndiProviderUrl,
            String jndiInitialContextFactory,
            String jndiSecurityPrincipal,
            String jndiSecurityCredentials,
            String jndiSecurityCredentialsSecretId,
            String connectionUrl,
            String connectionFactory,
            String username,
            String password,
            String passwordSecretId,
            JavaMessageServiceConnection.SecurityProtocol securityProtocol,
            JavaMessageServiceConnection.AuthenticationType authenticationType,
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
            String privateIp) {
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
                doesUseSecretIds);
        this.shouldUseJndi = shouldUseJndi;
        this.jndiConnectionFactory = jndiConnectionFactory;
        this.jndiProviderUrl = jndiProviderUrl;
        this.jndiInitialContextFactory = jndiInitialContextFactory;
        this.jndiSecurityPrincipal = jndiSecurityPrincipal;
        this.jndiSecurityCredentials = jndiSecurityCredentials;
        this.jndiSecurityCredentialsSecretId = jndiSecurityCredentialsSecretId;
        this.connectionUrl = connectionUrl;
        this.connectionFactory = connectionFactory;
        this.username = username;
        this.password = password;
        this.passwordSecretId = passwordSecretId;
        this.securityProtocol = securityProtocol;
        this.authenticationType = authenticationType;
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
        this.privateIp = privateIp;
    }

    /**
     * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseJndi")
    private final Boolean shouldUseJndi;

    /**
     * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
     *
     * @return the value
     **/
    public Boolean getShouldUseJndi() {
        return shouldUseJndi;
    }

    /**
     * The Connection Factory can be looked up using this name.
     * e.g.: 'ConnectionFactory'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jndiConnectionFactory")
    private final String jndiConnectionFactory;

    /**
     * The Connection Factory can be looked up using this name.
     * e.g.: 'ConnectionFactory'
     *
     * @return the value
     **/
    public String getJndiConnectionFactory() {
        return jndiConnectionFactory;
    }

    /**
     * The URL that Java Message Service will use to contact the JNDI provider.
     * e.g.: 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jndiProviderUrl")
    private final String jndiProviderUrl;

    /**
     * The URL that Java Message Service will use to contact the JNDI provider.
     * e.g.: 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
     *
     * @return the value
     **/
    public String getJndiProviderUrl() {
        return jndiProviderUrl;
    }

    /**
     * The implementation of javax.naming.spi.InitialContextFactory interface
     * that the client uses to obtain initial naming context.
     * e.g.: 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jndiInitialContextFactory")
    private final String jndiInitialContextFactory;

    /**
     * The implementation of javax.naming.spi.InitialContextFactory interface
     * that the client uses to obtain initial naming context.
     * e.g.: 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
     *
     * @return the value
     **/
    public String getJndiInitialContextFactory() {
        return jndiInitialContextFactory;
    }

    /**
     * Specifies the identity of the principal (user) to be authenticated.
     * e.g.: 'admin2'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityPrincipal")
    private final String jndiSecurityPrincipal;

    /**
     * Specifies the identity of the principal (user) to be authenticated.
     * e.g.: 'admin2'
     *
     * @return the value
     **/
    public String getJndiSecurityPrincipal() {
        return jndiSecurityPrincipal;
    }

    /**
     * The password associated to the principal.
     * Deprecated: This field is deprecated and replaced by "jndiSecurityCredentialsSecretId". This field will be removed after February 15 2026.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityCredentials")
    private final String jndiSecurityCredentials;

    /**
     * The password associated to the principal.
     * Deprecated: This field is deprecated and replaced by "jndiSecurityCredentialsSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     **/
    public String getJndiSecurityCredentials() {
        return jndiSecurityCredentials;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the security credentials are stored associated to the principal.
     * Note: When provided, 'jndiSecurityCredentials' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityCredentialsSecretId")
    private final String jndiSecurityCredentialsSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the security credentials are stored associated to the principal.
     * Note: When provided, 'jndiSecurityCredentials' field must not be provided.
     *
     * @return the value
     **/
    public String getJndiSecurityCredentialsSecretId() {
        return jndiSecurityCredentialsSecretId;
    }

    /**
     * Connectin URL of the Java Message Service, specifying the protocol, host, and port.
     * e.g.: 'mq://myjms.host.domain:7676'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
    private final String connectionUrl;

    /**
     * Connectin URL of the Java Message Service, specifying the protocol, host, and port.
     * e.g.: 'mq://myjms.host.domain:7676'
     *
     * @return the value
     **/
    public String getConnectionUrl() {
        return connectionUrl;
    }

    /**
     * The of Java class implementing javax.jms.ConnectionFactory interface
     * supplied by the Java Message Service provider.
     * e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionFactory")
    private final String connectionFactory;

    /**
     * The of Java class implementing javax.jms.ConnectionFactory interface
     * supplied by the Java Message Service provider.
     * e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
     *
     * @return the value
     **/
    public String getConnectionFactory() {
        return connectionFactory;
    }

    /**
     * The username Oracle GoldenGate uses to connect to the Java Message Service.
     * This username must already exist and be available by the Java Message Service to be connected to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect to the Java Message Service.
     * This username must already exist and be available by the Java Message Service to be connected to.
     *
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The password Oracle GoldenGate uses to connect the associated Java Message Service.
     * Deprecated: This field is deprecated and replaced by "passwordSecretId". This field will be removed after February 15 2026.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password Oracle GoldenGate uses to connect the associated Java Message Service.
     * Deprecated: This field is deprecated and replaced by "passwordSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored,
     * that Oracle GoldenGate uses to connect the associated Java Message Service.
     * Note: When provided, 'password' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored,
     * that Oracle GoldenGate uses to connect the associated Java Message Service.
     * Note: When provided, 'password' field must not be provided.
     *
     * @return the value
     **/
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * Security protocol for Java Message Service. If not provided, default is PLAIN.
     * Optional until 2024-06-27, in the release after it will be made required.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final JavaMessageServiceConnection.SecurityProtocol securityProtocol;

    /**
     * Security protocol for Java Message Service. If not provided, default is PLAIN.
     * Optional until 2024-06-27, in the release after it will be made required.
     *
     * @return the value
     **/
    public JavaMessageServiceConnection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * Authentication type for Java Message Service.  If not provided, default is NONE.
     * Optional until 2024-06-27, in the release after it will be made required.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final JavaMessageServiceConnection.AuthenticationType authenticationType;

    /**
     * Authentication type for Java Message Service.  If not provided, default is NONE.
     * Optional until 2024-06-27, in the release after it will be made required.
     *
     * @return the value
     **/
    public JavaMessageServiceConnection.AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * The base64 encoded content of the TrustStore file.
     * Deprecated: This field is deprecated and replaced by "trustStoreSecretId". This field will be removed after February 15 2026.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
    private final String trustStore;

    /**
     * The base64 encoded content of the TrustStore file.
     * Deprecated: This field is deprecated and replaced by "trustStoreSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     **/
    public String getTrustStore() {
        return trustStore;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the content of the TrustStore file is stored.
     * Note: When provided, 'trustStore' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
    private final String trustStoreSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the content of the TrustStore file is stored.
     * Note: When provided, 'trustStore' field must not be provided.
     *
     * @return the value
     **/
    public String getTrustStoreSecretId() {
        return trustStoreSecretId;
    }

    /**
     * The TrustStore password.
     * Deprecated: This field is deprecated and replaced by "trustStorePasswordSecretId". This field will be removed after February 15 2026.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
    private final String trustStorePassword;

    /**
     * The TrustStore password.
     * Deprecated: This field is deprecated and replaced by "trustStorePasswordSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     **/
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the TrustStore password is stored.
     * Note: When provided, 'trustStorePassword' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePasswordSecretId")
    private final String trustStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the TrustStore password is stored.
     * Note: When provided, 'trustStorePassword' field must not be provided.
     *
     * @return the value
     **/
    public String getTrustStorePasswordSecretId() {
        return trustStorePasswordSecretId;
    }

    /**
     * The base64 encoded content of the KeyStore file.
     * Deprecated: This field is deprecated and replaced by "keyStoreSecretId". This field will be removed after February 15 2026.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
    private final String keyStore;

    /**
     * The base64 encoded content of the KeyStore file.
     * Deprecated: This field is deprecated and replaced by "keyStoreSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     **/
    public String getKeyStore() {
        return keyStore;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the content of the KeyStore file is stored.
     * Note: When provided, 'keyStore' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreSecretId")
    private final String keyStoreSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the content of the KeyStore file is stored.
     * Note: When provided, 'keyStore' field must not be provided.
     *
     * @return the value
     **/
    public String getKeyStoreSecretId() {
        return keyStoreSecretId;
    }

    /**
     * The KeyStore password.
     * Deprecated: This field is deprecated and replaced by "keyStorePasswordSecretId". This field will be removed after February 15 2026.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
    private final String keyStorePassword;

    /**
     * The KeyStore password.
     * Deprecated: This field is deprecated and replaced by "keyStorePasswordSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     **/
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the KeyStore password is stored.
     * Note: When provided, 'keyStorePassword' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePasswordSecretId")
    private final String keyStorePasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the KeyStore password is stored.
     * Note: When provided, 'keyStorePassword' field must not be provided.
     *
     * @return the value
     **/
    public String getKeyStorePasswordSecretId() {
        return keyStorePasswordSecretId;
    }

    /**
     * The password for the cert inside of the KeyStore.
     * In case it differs from the KeyStore password, it should be provided.
     * Deprecated: This field is deprecated and replaced by "sslKeyPasswordSecretId". This field will be removed after February 15 2026.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
    private final String sslKeyPassword;

    /**
     * The password for the cert inside of the KeyStore.
     * In case it differs from the KeyStore password, it should be provided.
     * Deprecated: This field is deprecated and replaced by "sslKeyPasswordSecretId". This field will be removed after February 15 2026.
     *
     * @return the value
     **/
    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored for the cert inside of the Keystore.
     * In case it differs from the KeyStore password, it should be provided.
     * Note: When provided, 'sslKeyPassword' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPasswordSecretId")
    private final String sslKeyPasswordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Secret where the password is stored for the cert inside of the Keystore.
     * In case it differs from the KeyStore password, it should be provided.
     * Note: When provided, 'sslKeyPassword' field must not be provided.
     *
     * @return the value
     **/
    public String getSslKeyPasswordSecretId() {
        return sslKeyPasswordSecretId;
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
        sb.append("UpdateJavaMessageServiceConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", shouldUseJndi=").append(String.valueOf(this.shouldUseJndi));
        sb.append(", jndiConnectionFactory=").append(String.valueOf(this.jndiConnectionFactory));
        sb.append(", jndiProviderUrl=").append(String.valueOf(this.jndiProviderUrl));
        sb.append(", jndiInitialContextFactory=")
                .append(String.valueOf(this.jndiInitialContextFactory));
        sb.append(", jndiSecurityPrincipal=").append(String.valueOf(this.jndiSecurityPrincipal));
        sb.append(", jndiSecurityCredentials=").append("<redacted>");
        sb.append(", jndiSecurityCredentialsSecretId=")
                .append(String.valueOf(this.jndiSecurityCredentialsSecretId));
        sb.append(", connectionUrl=").append(String.valueOf(this.connectionUrl));
        sb.append(", connectionFactory=").append(String.valueOf(this.connectionFactory));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
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
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateJavaMessageServiceConnectionDetails)) {
            return false;
        }

        UpdateJavaMessageServiceConnectionDetails other =
                (UpdateJavaMessageServiceConnectionDetails) o;
        return java.util.Objects.equals(this.shouldUseJndi, other.shouldUseJndi)
                && java.util.Objects.equals(this.jndiConnectionFactory, other.jndiConnectionFactory)
                && java.util.Objects.equals(this.jndiProviderUrl, other.jndiProviderUrl)
                && java.util.Objects.equals(
                        this.jndiInitialContextFactory, other.jndiInitialContextFactory)
                && java.util.Objects.equals(this.jndiSecurityPrincipal, other.jndiSecurityPrincipal)
                && java.util.Objects.equals(
                        this.jndiSecurityCredentials, other.jndiSecurityCredentials)
                && java.util.Objects.equals(
                        this.jndiSecurityCredentialsSecretId, other.jndiSecurityCredentialsSecretId)
                && java.util.Objects.equals(this.connectionUrl, other.connectionUrl)
                && java.util.Objects.equals(this.connectionFactory, other.connectionFactory)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
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
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
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
                        + (this.jndiSecurityCredentials == null
                                ? 43
                                : this.jndiSecurityCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiSecurityCredentialsSecretId == null
                                ? 43
                                : this.jndiSecurityCredentialsSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionUrl == null ? 43 : this.connectionUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionFactory == null ? 43 : this.connectionFactory.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
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
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        return result;
    }
}
