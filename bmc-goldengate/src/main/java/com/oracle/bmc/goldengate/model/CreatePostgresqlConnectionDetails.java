/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new PostgreSQL Connection. <br>
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
        builder = CreatePostgresqlConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePostgresqlConnectionDetails extends CreateConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<AddResourceLockDetails> locks;

        public Builder locks(java.util.List<AddResourceLockDetails> locks) {
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
        /** The PostgreSQL technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private PostgresqlConnection.TechnologyType technologyType;

        /**
         * The PostgreSQL technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(PostgresqlConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /** The name of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The name of the database.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** The name or address of a host. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The name or address of a host.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The port of an endpoint usually specified for a connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port of an endpoint usually specified for a connection.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
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
         * An array of name-value pair attribute entries. Used as additional parameters in
         * connection string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
        private java.util.List<NameValuePair> additionalAttributes;

        /**
         * An array of name-value pair attribute entries. Used as additional parameters in
         * connection string.
         *
         * @param additionalAttributes the value to set
         * @return this builder
         */
        public Builder additionalAttributes(java.util.List<NameValuePair> additionalAttributes) {
            this.additionalAttributes = additionalAttributes;
            this.__explicitlySet__.add("additionalAttributes");
            return this;
        }
        /** Security protocol for PostgreSQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private PostgresqlConnection.SecurityProtocol securityProtocol;

        /**
         * Security protocol for PostgreSQL.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(PostgresqlConnection.SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /** SSL modes for PostgreSQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
        private PostgresqlConnection.SslMode sslMode;

        /**
         * SSL modes for PostgreSQL.
         *
         * @param sslMode the value to set
         * @return this builder
         */
        public Builder sslMode(PostgresqlConnection.SslMode sslMode) {
            this.sslMode = sslMode;
            this.__explicitlySet__.add("sslMode");
            return this;
        }
        /**
         * The base64 encoded certificate of the trusted certificate authorities (Trusted CA) for
         * PostgreSQL. The supported file formats are .pem and .crt. It is not included in GET
         * responses if the {@code view=COMPACT} query parameter is specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslCa")
        private String sslCa;

        /**
         * The base64 encoded certificate of the trusted certificate authorities (Trusted CA) for
         * PostgreSQL. The supported file formats are .pem and .crt. It is not included in GET
         * responses if the {@code view=COMPACT} query parameter is specified.
         *
         * @param sslCa the value to set
         * @return this builder
         */
        public Builder sslCa(String sslCa) {
            this.sslCa = sslCa;
            this.__explicitlySet__.add("sslCa");
            return this;
        }
        /**
         * The base64 encoded list of certificates revoked by the trusted certificate authorities
         * (Trusted CA). It is not included in GET responses if the {@code view=COMPACT} query
         * parameter is specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslCrl")
        private String sslCrl;

        /**
         * The base64 encoded list of certificates revoked by the trusted certificate authorities
         * (Trusted CA). It is not included in GET responses if the {@code view=COMPACT} query
         * parameter is specified.
         *
         * @param sslCrl the value to set
         * @return this builder
         */
        public Builder sslCrl(String sslCrl) {
            this.sslCrl = sslCrl;
            this.__explicitlySet__.add("sslCrl");
            return this;
        }
        /**
         * The base64 encoded certificate of the PostgreSQL server. The supported file formats are
         * .pem and .crt. It is not included in GET responses if the {@code view=COMPACT} query
         * parameter is specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslCert")
        private String sslCert;

        /**
         * The base64 encoded certificate of the PostgreSQL server. The supported file formats are
         * .pem and .crt. It is not included in GET responses if the {@code view=COMPACT} query
         * parameter is specified.
         *
         * @param sslCert the value to set
         * @return this builder
         */
        public Builder sslCert(String sslCert) {
            this.sslCert = sslCert;
            this.__explicitlySet__.add("sslCert");
            return this;
        }
        /**
         * The base64 encoded private key of the PostgreSQL server. The supported file formats are
         * .pem and .crt. Deprecated: This field is deprecated and replaced by "sslKeySecretId".
         * This field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKey")
        private String sslKey;

        /**
         * The base64 encoded private key of the PostgreSQL server. The supported file formats are
         * .pem and .crt. Deprecated: This field is deprecated and replaced by "sslKeySecretId".
         * This field will be removed after February 15 2026.
         *
         * @param sslKey the value to set
         * @return this builder
         */
        public Builder sslKey(String sslKey) {
            this.sslKey = sslKey;
            this.__explicitlySet__.add("sslKey");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the private key of the PostgreSQL server. The supported file formats
         * are .pem and .crt. Note: When provided, 'sslKey' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKeySecretId")
        private String sslKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the private key of the PostgreSQL server. The supported file formats
         * are .pem and .crt. Note: When provided, 'sslKey' field must not be provided.
         *
         * @param sslKeySecretId the value to set
         * @return this builder
         */
        public Builder sslKeySecretId(String sslKeySecretId) {
            this.sslKeySecretId = sslKeySecretId;
            this.__explicitlySet__.add("sslKeySecretId");
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
         * database system being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database system being referenced.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePostgresqlConnectionDetails build() {
            CreatePostgresqlConnectionDetails model =
                    new CreatePostgresqlConnectionDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.locks,
                            this.vaultId,
                            this.keyId,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.subscriptionId,
                            this.clusterPlacementGroupId,
                            this.securityAttributes,
                            this.technologyType,
                            this.databaseName,
                            this.host,
                            this.port,
                            this.username,
                            this.password,
                            this.passwordSecretId,
                            this.additionalAttributes,
                            this.securityProtocol,
                            this.sslMode,
                            this.sslCa,
                            this.sslCrl,
                            this.sslCert,
                            this.sslKey,
                            this.sslKeySecretId,
                            this.privateIp,
                            this.dbSystemId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePostgresqlConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
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
            if (model.wasPropertyExplicitlySet("additionalAttributes")) {
                this.additionalAttributes(model.getAdditionalAttributes());
            }
            if (model.wasPropertyExplicitlySet("securityProtocol")) {
                this.securityProtocol(model.getSecurityProtocol());
            }
            if (model.wasPropertyExplicitlySet("sslMode")) {
                this.sslMode(model.getSslMode());
            }
            if (model.wasPropertyExplicitlySet("sslCa")) {
                this.sslCa(model.getSslCa());
            }
            if (model.wasPropertyExplicitlySet("sslCrl")) {
                this.sslCrl(model.getSslCrl());
            }
            if (model.wasPropertyExplicitlySet("sslCert")) {
                this.sslCert(model.getSslCert());
            }
            if (model.wasPropertyExplicitlySet("sslKey")) {
                this.sslKey(model.getSslKey());
            }
            if (model.wasPropertyExplicitlySet("sslKeySecretId")) {
                this.sslKeySecretId(model.getSslKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
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
    public CreatePostgresqlConnectionDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<AddResourceLockDetails> locks,
            String vaultId,
            String keyId,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            String subscriptionId,
            String clusterPlacementGroupId,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            PostgresqlConnection.TechnologyType technologyType,
            String databaseName,
            String host,
            Integer port,
            String username,
            String password,
            String passwordSecretId,
            java.util.List<NameValuePair> additionalAttributes,
            PostgresqlConnection.SecurityProtocol securityProtocol,
            PostgresqlConnection.SslMode sslMode,
            String sslCa,
            String sslCrl,
            String sslCert,
            String sslKey,
            String sslKeySecretId,
            String privateIp,
            String dbSystemId) {
        super(
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                locks,
                vaultId,
                keyId,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds,
                subscriptionId,
                clusterPlacementGroupId,
                securityAttributes);
        this.technologyType = technologyType;
        this.databaseName = databaseName;
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.passwordSecretId = passwordSecretId;
        this.additionalAttributes = additionalAttributes;
        this.securityProtocol = securityProtocol;
        this.sslMode = sslMode;
        this.sslCa = sslCa;
        this.sslCrl = sslCrl;
        this.sslCert = sslCert;
        this.sslKey = sslKey;
        this.sslKeySecretId = sslKeySecretId;
        this.privateIp = privateIp;
        this.dbSystemId = dbSystemId;
    }

    /** The PostgreSQL technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final PostgresqlConnection.TechnologyType technologyType;

    /**
     * The PostgreSQL technology type.
     *
     * @return the value
     */
    public PostgresqlConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /** The name of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The name of the database.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** The name or address of a host. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The name or address of a host.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The port of an endpoint usually specified for a connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port of an endpoint usually specified for a connection.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
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
     * An array of name-value pair attribute entries. Used as additional parameters in connection
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
    private final java.util.List<NameValuePair> additionalAttributes;

    /**
     * An array of name-value pair attribute entries. Used as additional parameters in connection
     * string.
     *
     * @return the value
     */
    public java.util.List<NameValuePair> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /** Security protocol for PostgreSQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final PostgresqlConnection.SecurityProtocol securityProtocol;

    /**
     * Security protocol for PostgreSQL.
     *
     * @return the value
     */
    public PostgresqlConnection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /** SSL modes for PostgreSQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
    private final PostgresqlConnection.SslMode sslMode;

    /**
     * SSL modes for PostgreSQL.
     *
     * @return the value
     */
    public PostgresqlConnection.SslMode getSslMode() {
        return sslMode;
    }

    /**
     * The base64 encoded certificate of the trusted certificate authorities (Trusted CA) for
     * PostgreSQL. The supported file formats are .pem and .crt. It is not included in GET responses
     * if the {@code view=COMPACT} query parameter is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslCa")
    private final String sslCa;

    /**
     * The base64 encoded certificate of the trusted certificate authorities (Trusted CA) for
     * PostgreSQL. The supported file formats are .pem and .crt. It is not included in GET responses
     * if the {@code view=COMPACT} query parameter is specified.
     *
     * @return the value
     */
    public String getSslCa() {
        return sslCa;
    }

    /**
     * The base64 encoded list of certificates revoked by the trusted certificate authorities
     * (Trusted CA). It is not included in GET responses if the {@code view=COMPACT} query parameter
     * is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslCrl")
    private final String sslCrl;

    /**
     * The base64 encoded list of certificates revoked by the trusted certificate authorities
     * (Trusted CA). It is not included in GET responses if the {@code view=COMPACT} query parameter
     * is specified.
     *
     * @return the value
     */
    public String getSslCrl() {
        return sslCrl;
    }

    /**
     * The base64 encoded certificate of the PostgreSQL server. The supported file formats are .pem
     * and .crt. It is not included in GET responses if the {@code view=COMPACT} query parameter is
     * specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslCert")
    private final String sslCert;

    /**
     * The base64 encoded certificate of the PostgreSQL server. The supported file formats are .pem
     * and .crt. It is not included in GET responses if the {@code view=COMPACT} query parameter is
     * specified.
     *
     * @return the value
     */
    public String getSslCert() {
        return sslCert;
    }

    /**
     * The base64 encoded private key of the PostgreSQL server. The supported file formats are .pem
     * and .crt. Deprecated: This field is deprecated and replaced by "sslKeySecretId". This field
     * will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKey")
    private final String sslKey;

    /**
     * The base64 encoded private key of the PostgreSQL server. The supported file formats are .pem
     * and .crt. Deprecated: This field is deprecated and replaced by "sslKeySecretId". This field
     * will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getSslKey() {
        return sslKey;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the private key of the PostgreSQL server. The supported file formats are
     * .pem and .crt. Note: When provided, 'sslKey' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKeySecretId")
    private final String sslKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the private key of the PostgreSQL server. The supported file formats are
     * .pem and .crt. Note: When provided, 'sslKey' field must not be provided.
     *
     * @return the value
     */
    public String getSslKeySecretId() {
        return sslKeySecretId;
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
     * database system being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database system being referenced.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
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
        sb.append("CreatePostgresqlConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", additionalAttributes=").append(String.valueOf(this.additionalAttributes));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", sslMode=").append(String.valueOf(this.sslMode));
        sb.append(", sslCa=").append(String.valueOf(this.sslCa));
        sb.append(", sslCrl=").append(String.valueOf(this.sslCrl));
        sb.append(", sslCert=").append(String.valueOf(this.sslCert));
        sb.append(", sslKey=").append(String.valueOf(this.sslKey));
        sb.append(", sslKeySecretId=").append(String.valueOf(this.sslKeySecretId));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePostgresqlConnectionDetails)) {
            return false;
        }

        CreatePostgresqlConnectionDetails other = (CreatePostgresqlConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.additionalAttributes, other.additionalAttributes)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.sslMode, other.sslMode)
                && java.util.Objects.equals(this.sslCa, other.sslCa)
                && java.util.Objects.equals(this.sslCrl, other.sslCrl)
                && java.util.Objects.equals(this.sslCert, other.sslCert)
                && java.util.Objects.equals(this.sslKey, other.sslKey)
                && java.util.Objects.equals(this.sslKeySecretId, other.sslKeySecretId)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalAttributes == null
                                ? 43
                                : this.additionalAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.securityProtocol == null ? 43 : this.securityProtocol.hashCode());
        result = (result * PRIME) + (this.sslMode == null ? 43 : this.sslMode.hashCode());
        result = (result * PRIME) + (this.sslCa == null ? 43 : this.sslCa.hashCode());
        result = (result * PRIME) + (this.sslCrl == null ? 43 : this.sslCrl.hashCode());
        result = (result * PRIME) + (this.sslCert == null ? 43 : this.sslCert.hashCode());
        result = (result * PRIME) + (this.sslKey == null ? 43 : this.sslKey.hashCode());
        result =
                (result * PRIME)
                        + (this.sslKeySecretId == null ? 43 : this.sslKeySecretId.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        return result;
    }
}
