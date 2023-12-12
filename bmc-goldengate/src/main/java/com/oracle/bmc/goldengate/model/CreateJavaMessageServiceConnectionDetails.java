/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Java Message Service Connection. <br>
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
        builder = CreateJavaMessageServiceConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateJavaMessageServiceConnectionDetails extends CreateConnectionDetails {
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
        /** The Java Message Service technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private JavaMessageServiceConnection.TechnologyType technologyType;

        /**
         * The Java Message Service technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(JavaMessageServiceConnection.TechnologyType technologyType) {
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
        /** The password associated to the principal. */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityCredentials")
        private String jndiSecurityCredentials;

        /**
         * The password associated to the principal.
         *
         * @param jndiSecurityCredentials the value to set
         * @return this builder
         */
        public Builder jndiSecurityCredentials(String jndiSecurityCredentials) {
            this.jndiSecurityCredentials = jndiSecurityCredentials;
            this.__explicitlySet__.add("jndiSecurityCredentials");
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
        /** The password Oracle GoldenGate uses to connect the associated Java Message Service. */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password Oracle GoldenGate uses to connect the associated Java Message Service.
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
         * Security protocol for Java Message Service. If not provided, default is PLAIN. Optional
         * until 2024-06-27, in the release after it will be made required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private JavaMessageServiceConnection.SecurityProtocol securityProtocol;

        /**
         * Security protocol for Java Message Service. If not provided, default is PLAIN. Optional
         * until 2024-06-27, in the release after it will be made required.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(
                JavaMessageServiceConnection.SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * Authentication type for Java Message Service. If not provided, default is NONE. Optional
         * until 2024-06-27, in the release after it will be made required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private JavaMessageServiceConnection.AuthenticationType authenticationType;

        /**
         * Authentication type for Java Message Service. If not provided, default is NONE. Optional
         * until 2024-06-27, in the release after it will be made required.
         *
         * @param authenticationType the value to set
         * @return this builder
         */
        public Builder authenticationType(
                JavaMessageServiceConnection.AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /** The base64 encoded content of the TrustStore file. */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
        private String trustStore;

        /**
         * The base64 encoded content of the TrustStore file.
         *
         * @param trustStore the value to set
         * @return this builder
         */
        public Builder trustStore(String trustStore) {
            this.trustStore = trustStore;
            this.__explicitlySet__.add("trustStore");
            return this;
        }
        /** The TrustStore password. */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
        private String trustStorePassword;

        /**
         * The TrustStore password.
         *
         * @param trustStorePassword the value to set
         * @return this builder
         */
        public Builder trustStorePassword(String trustStorePassword) {
            this.trustStorePassword = trustStorePassword;
            this.__explicitlySet__.add("trustStorePassword");
            return this;
        }
        /** The base64 encoded content of the KeyStore file. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
        private String keyStore;

        /**
         * The base64 encoded content of the KeyStore file.
         *
         * @param keyStore the value to set
         * @return this builder
         */
        public Builder keyStore(String keyStore) {
            this.keyStore = keyStore;
            this.__explicitlySet__.add("keyStore");
            return this;
        }
        /** The KeyStore password. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
        private String keyStorePassword;

        /**
         * The KeyStore password.
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
         * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
         * password, it should be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
        private String sslKeyPassword;

        /**
         * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
         * password, it should be provided.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateJavaMessageServiceConnectionDetails build() {
            CreateJavaMessageServiceConnectionDetails model =
                    new CreateJavaMessageServiceConnectionDetails(
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
                            this.shouldUseJndi,
                            this.jndiConnectionFactory,
                            this.jndiProviderUrl,
                            this.jndiInitialContextFactory,
                            this.jndiSecurityPrincipal,
                            this.jndiSecurityCredentials,
                            this.connectionUrl,
                            this.connectionFactory,
                            this.username,
                            this.password,
                            this.securityProtocol,
                            this.authenticationType,
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
        public Builder copy(CreateJavaMessageServiceConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateJavaMessageServiceConnectionDetails(
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
            JavaMessageServiceConnection.TechnologyType technologyType,
            Boolean shouldUseJndi,
            String jndiConnectionFactory,
            String jndiProviderUrl,
            String jndiInitialContextFactory,
            String jndiSecurityPrincipal,
            String jndiSecurityCredentials,
            String connectionUrl,
            String connectionFactory,
            String username,
            String password,
            JavaMessageServiceConnection.SecurityProtocol securityProtocol,
            JavaMessageServiceConnection.AuthenticationType authenticationType,
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
        this.shouldUseJndi = shouldUseJndi;
        this.jndiConnectionFactory = jndiConnectionFactory;
        this.jndiProviderUrl = jndiProviderUrl;
        this.jndiInitialContextFactory = jndiInitialContextFactory;
        this.jndiSecurityPrincipal = jndiSecurityPrincipal;
        this.jndiSecurityCredentials = jndiSecurityCredentials;
        this.connectionUrl = connectionUrl;
        this.connectionFactory = connectionFactory;
        this.username = username;
        this.password = password;
        this.securityProtocol = securityProtocol;
        this.authenticationType = authenticationType;
        this.trustStore = trustStore;
        this.trustStorePassword = trustStorePassword;
        this.keyStore = keyStore;
        this.keyStorePassword = keyStorePassword;
        this.sslKeyPassword = sslKeyPassword;
        this.privateIp = privateIp;
    }

    /** The Java Message Service technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final JavaMessageServiceConnection.TechnologyType technologyType;

    /**
     * The Java Message Service technology type.
     *
     * @return the value
     */
    public JavaMessageServiceConnection.TechnologyType getTechnologyType() {
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

    /** The password associated to the principal. */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityCredentials")
    private final String jndiSecurityCredentials;

    /**
     * The password associated to the principal.
     *
     * @return the value
     */
    public String getJndiSecurityCredentials() {
        return jndiSecurityCredentials;
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

    /** The password Oracle GoldenGate uses to connect the associated Java Message Service. */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password Oracle GoldenGate uses to connect the associated Java Message Service.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /**
     * Security protocol for Java Message Service. If not provided, default is PLAIN. Optional until
     * 2024-06-27, in the release after it will be made required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final JavaMessageServiceConnection.SecurityProtocol securityProtocol;

    /**
     * Security protocol for Java Message Service. If not provided, default is PLAIN. Optional until
     * 2024-06-27, in the release after it will be made required.
     *
     * @return the value
     */
    public JavaMessageServiceConnection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * Authentication type for Java Message Service. If not provided, default is NONE. Optional
     * until 2024-06-27, in the release after it will be made required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final JavaMessageServiceConnection.AuthenticationType authenticationType;

    /**
     * Authentication type for Java Message Service. If not provided, default is NONE. Optional
     * until 2024-06-27, in the release after it will be made required.
     *
     * @return the value
     */
    public JavaMessageServiceConnection.AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /** The base64 encoded content of the TrustStore file. */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
    private final String trustStore;

    /**
     * The base64 encoded content of the TrustStore file.
     *
     * @return the value
     */
    public String getTrustStore() {
        return trustStore;
    }

    /** The TrustStore password. */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
    private final String trustStorePassword;

    /**
     * The TrustStore password.
     *
     * @return the value
     */
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    /** The base64 encoded content of the KeyStore file. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStore")
    private final String keyStore;

    /**
     * The base64 encoded content of the KeyStore file.
     *
     * @return the value
     */
    public String getKeyStore() {
        return keyStore;
    }

    /** The KeyStore password. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
    private final String keyStorePassword;

    /**
     * The KeyStore password.
     *
     * @return the value
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
     * password, it should be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeyPassword")
    private final String sslKeyPassword;

    /**
     * The password for the cert inside of the KeyStore. In case it differs from the KeyStore
     * password, it should be provided.
     *
     * @return the value
     */
    public String getSslKeyPassword() {
        return sslKeyPassword;
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
        sb.append("CreateJavaMessageServiceConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", shouldUseJndi=").append(String.valueOf(this.shouldUseJndi));
        sb.append(", jndiConnectionFactory=").append(String.valueOf(this.jndiConnectionFactory));
        sb.append(", jndiProviderUrl=").append(String.valueOf(this.jndiProviderUrl));
        sb.append(", jndiInitialContextFactory=")
                .append(String.valueOf(this.jndiInitialContextFactory));
        sb.append(", jndiSecurityPrincipal=").append(String.valueOf(this.jndiSecurityPrincipal));
        sb.append(", jndiSecurityCredentials=").append("<redacted>");
        sb.append(", connectionUrl=").append(String.valueOf(this.connectionUrl));
        sb.append(", connectionFactory=").append(String.valueOf(this.connectionFactory));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
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
        if (!(o instanceof CreateJavaMessageServiceConnectionDetails)) {
            return false;
        }

        CreateJavaMessageServiceConnectionDetails other =
                (CreateJavaMessageServiceConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.shouldUseJndi, other.shouldUseJndi)
                && java.util.Objects.equals(this.jndiConnectionFactory, other.jndiConnectionFactory)
                && java.util.Objects.equals(this.jndiProviderUrl, other.jndiProviderUrl)
                && java.util.Objects.equals(
                        this.jndiInitialContextFactory, other.jndiInitialContextFactory)
                && java.util.Objects.equals(this.jndiSecurityPrincipal, other.jndiSecurityPrincipal)
                && java.util.Objects.equals(
                        this.jndiSecurityCredentials, other.jndiSecurityCredentials)
                && java.util.Objects.equals(this.connectionUrl, other.connectionUrl)
                && java.util.Objects.equals(this.connectionFactory, other.connectionFactory)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
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
                        + (this.connectionUrl == null ? 43 : this.connectionUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionFactory == null ? 43 : this.connectionFactory.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
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
