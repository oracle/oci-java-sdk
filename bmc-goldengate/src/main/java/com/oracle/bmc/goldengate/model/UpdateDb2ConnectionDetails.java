/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update a DB2 Connection. <br>
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
        builder = UpdateDb2ConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDb2ConnectionDetails extends UpdateConnectionDetails {
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
         * The username Oracle GoldenGate uses to connect to the DB2 database. This username must
         * already exist and be available by the DB2 to be connected to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect to the DB2 database. This username must
         * already exist and be available by the DB2 to be connected to.
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
         * The password Oracle GoldenGate uses to connect the associated DB2 database. Deprecated:
         * This field is deprecated and replaced by "passwordSecretId". This field will be removed
         * after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password Oracle GoldenGate uses to connect the associated DB2 database. Deprecated:
         * This field is deprecated and replaced by "passwordSecretId". This field will be removed
         * after February 15 2026.
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
         * Secret where the password is stored, that Oracle GoldenGate uses to connect the
         * associated DB2 database. Note: When provided, 'password' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the password is stored, that Oracle GoldenGate uses to connect the
         * associated DB2 database. Note: When provided, 'password' field must not be provided.
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
        /** Security protocol for the DB2 database. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private Db2Connection.SecurityProtocol securityProtocol;

        /**
         * Security protocol for the DB2 database.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(Db2Connection.SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /**
         * The base64 encoded keystore file created at the client containing the server certificate
         * / CA root certificate. This property is not supported for IBM Db2 for i, as client TLS
         * mode is not available.
         *
         * <p>Deprecated: This field is deprecated and replaced by "sslClientKeystoredbSecretId".
         * This field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslClientKeystoredb")
        private String sslClientKeystoredb;

        /**
         * The base64 encoded keystore file created at the client containing the server certificate
         * / CA root certificate. This property is not supported for IBM Db2 for i, as client TLS
         * mode is not available.
         *
         * <p>Deprecated: This field is deprecated and replaced by "sslClientKeystoredbSecretId".
         * This field will be removed after February 15 2026.
         *
         * @param sslClientKeystoredb the value to set
         * @return this builder
         */
        public Builder sslClientKeystoredb(String sslClientKeystoredb) {
            this.sslClientKeystoredb = sslClientKeystoredb;
            this.__explicitlySet__.add("sslClientKeystoredb");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the keystore file stored, which created at the client containing the server
         * certificate / CA root certificate. This property is not supported for IBM Db2 for i, as
         * client TLS mode is not available.
         *
         * <p>Note: When provided, 'sslClientKeystoredb' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslClientKeystoredbSecretId")
        private String sslClientKeystoredbSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the keystore file stored, which created at the client containing the server
         * certificate / CA root certificate. This property is not supported for IBM Db2 for i, as
         * client TLS mode is not available.
         *
         * <p>Note: When provided, 'sslClientKeystoredb' field must not be provided.
         *
         * @param sslClientKeystoredbSecretId the value to set
         * @return this builder
         */
        public Builder sslClientKeystoredbSecretId(String sslClientKeystoredbSecretId) {
            this.sslClientKeystoredbSecretId = sslClientKeystoredbSecretId;
            this.__explicitlySet__.add("sslClientKeystoredbSecretId");
            return this;
        }
        /**
         * The base64 encoded keystash file which contains the encrypted password to the key
         * database file. This property is not supported for IBM Db2 for i, as client TLS mode is
         * not available.
         *
         * <p>Deprecated: This field is deprecated and replaced by "sslClientKeystashSecretId". This
         * field will be removed after February 15 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslClientKeystash")
        private String sslClientKeystash;

        /**
         * The base64 encoded keystash file which contains the encrypted password to the key
         * database file. This property is not supported for IBM Db2 for i, as client TLS mode is
         * not available.
         *
         * <p>Deprecated: This field is deprecated and replaced by "sslClientKeystashSecretId". This
         * field will be removed after February 15 2026.
         *
         * @param sslClientKeystash the value to set
         * @return this builder
         */
        public Builder sslClientKeystash(String sslClientKeystash) {
            this.sslClientKeystash = sslClientKeystash;
            this.__explicitlySet__.add("sslClientKeystash");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the keystash file is stored, which contains the encrypted password to the
         * key database file. This property is not supported for IBM Db2 for i, as client TLS mode
         * is not available.
         *
         * <p>Note: When provided, 'sslClientKeystash' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslClientKeystashSecretId")
        private String sslClientKeystashSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the keystash file is stored, which contains the encrypted password to the
         * key database file. This property is not supported for IBM Db2 for i, as client TLS mode
         * is not available.
         *
         * <p>Note: When provided, 'sslClientKeystash' field must not be provided.
         *
         * @param sslClientKeystashSecretId the value to set
         * @return this builder
         */
        public Builder sslClientKeystashSecretId(String sslClientKeystashSecretId) {
            this.sslClientKeystashSecretId = sslClientKeystashSecretId;
            this.__explicitlySet__.add("sslClientKeystashSecretId");
            return this;
        }
        /**
         * The base64 encoded file which contains the self-signed server certificate / Certificate
         * Authority (CA) certificate. It is not included in GET responses if the {@code
         * view=COMPACT} query parameter is specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslServerCertificate")
        private String sslServerCertificate;

        /**
         * The base64 encoded file which contains the self-signed server certificate / Certificate
         * Authority (CA) certificate. It is not included in GET responses if the {@code
         * view=COMPACT} query parameter is specified.
         *
         * @param sslServerCertificate the value to set
         * @return this builder
         */
        public Builder sslServerCertificate(String sslServerCertificate) {
            this.sslServerCertificate = sslServerCertificate;
            this.__explicitlySet__.add("sslServerCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDb2ConnectionDetails build() {
            UpdateDb2ConnectionDetails model =
                    new UpdateDb2ConnectionDetails(
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
                            this.databaseName,
                            this.host,
                            this.port,
                            this.username,
                            this.password,
                            this.passwordSecretId,
                            this.additionalAttributes,
                            this.securityProtocol,
                            this.sslClientKeystoredb,
                            this.sslClientKeystoredbSecretId,
                            this.sslClientKeystash,
                            this.sslClientKeystashSecretId,
                            this.sslServerCertificate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDb2ConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("sslClientKeystoredb")) {
                this.sslClientKeystoredb(model.getSslClientKeystoredb());
            }
            if (model.wasPropertyExplicitlySet("sslClientKeystoredbSecretId")) {
                this.sslClientKeystoredbSecretId(model.getSslClientKeystoredbSecretId());
            }
            if (model.wasPropertyExplicitlySet("sslClientKeystash")) {
                this.sslClientKeystash(model.getSslClientKeystash());
            }
            if (model.wasPropertyExplicitlySet("sslClientKeystashSecretId")) {
                this.sslClientKeystashSecretId(model.getSslClientKeystashSecretId());
            }
            if (model.wasPropertyExplicitlySet("sslServerCertificate")) {
                this.sslServerCertificate(model.getSslServerCertificate());
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
    public UpdateDb2ConnectionDetails(
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
            String databaseName,
            String host,
            Integer port,
            String username,
            String password,
            String passwordSecretId,
            java.util.List<NameValuePair> additionalAttributes,
            Db2Connection.SecurityProtocol securityProtocol,
            String sslClientKeystoredb,
            String sslClientKeystoredbSecretId,
            String sslClientKeystash,
            String sslClientKeystashSecretId,
            String sslServerCertificate) {
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
        this.databaseName = databaseName;
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.passwordSecretId = passwordSecretId;
        this.additionalAttributes = additionalAttributes;
        this.securityProtocol = securityProtocol;
        this.sslClientKeystoredb = sslClientKeystoredb;
        this.sslClientKeystoredbSecretId = sslClientKeystoredbSecretId;
        this.sslClientKeystash = sslClientKeystash;
        this.sslClientKeystashSecretId = sslClientKeystashSecretId;
        this.sslServerCertificate = sslServerCertificate;
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
     * The username Oracle GoldenGate uses to connect to the DB2 database. This username must
     * already exist and be available by the DB2 to be connected to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect to the DB2 database. This username must
     * already exist and be available by the DB2 to be connected to.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /**
     * The password Oracle GoldenGate uses to connect the associated DB2 database. Deprecated: This
     * field is deprecated and replaced by "passwordSecretId". This field will be removed after
     * February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password Oracle GoldenGate uses to connect the associated DB2 database. Deprecated: This
     * field is deprecated and replaced by "passwordSecretId". This field will be removed after
     * February 15 2026.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the password is stored, that Oracle GoldenGate uses to connect the associated
     * DB2 database. Note: When provided, 'password' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the password is stored, that Oracle GoldenGate uses to connect the associated
     * DB2 database. Note: When provided, 'password' field must not be provided.
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

    /** Security protocol for the DB2 database. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final Db2Connection.SecurityProtocol securityProtocol;

    /**
     * Security protocol for the DB2 database.
     *
     * @return the value
     */
    public Db2Connection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * The base64 encoded keystore file created at the client containing the server certificate / CA
     * root certificate. This property is not supported for IBM Db2 for i, as client TLS mode is not
     * available.
     *
     * <p>Deprecated: This field is deprecated and replaced by "sslClientKeystoredbSecretId". This
     * field will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslClientKeystoredb")
    private final String sslClientKeystoredb;

    /**
     * The base64 encoded keystore file created at the client containing the server certificate / CA
     * root certificate. This property is not supported for IBM Db2 for i, as client TLS mode is not
     * available.
     *
     * <p>Deprecated: This field is deprecated and replaced by "sslClientKeystoredbSecretId". This
     * field will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getSslClientKeystoredb() {
        return sslClientKeystoredb;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the keystore file stored, which created at the client containing the server
     * certificate / CA root certificate. This property is not supported for IBM Db2 for i, as
     * client TLS mode is not available.
     *
     * <p>Note: When provided, 'sslClientKeystoredb' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslClientKeystoredbSecretId")
    private final String sslClientKeystoredbSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the keystore file stored, which created at the client containing the server
     * certificate / CA root certificate. This property is not supported for IBM Db2 for i, as
     * client TLS mode is not available.
     *
     * <p>Note: When provided, 'sslClientKeystoredb' field must not be provided.
     *
     * @return the value
     */
    public String getSslClientKeystoredbSecretId() {
        return sslClientKeystoredbSecretId;
    }

    /**
     * The base64 encoded keystash file which contains the encrypted password to the key database
     * file. This property is not supported for IBM Db2 for i, as client TLS mode is not available.
     *
     * <p>Deprecated: This field is deprecated and replaced by "sslClientKeystashSecretId". This
     * field will be removed after February 15 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslClientKeystash")
    private final String sslClientKeystash;

    /**
     * The base64 encoded keystash file which contains the encrypted password to the key database
     * file. This property is not supported for IBM Db2 for i, as client TLS mode is not available.
     *
     * <p>Deprecated: This field is deprecated and replaced by "sslClientKeystashSecretId". This
     * field will be removed after February 15 2026.
     *
     * @return the value
     */
    public String getSslClientKeystash() {
        return sslClientKeystash;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the keystash file is stored, which contains the encrypted password to the key
     * database file. This property is not supported for IBM Db2 for i, as client TLS mode is not
     * available.
     *
     * <p>Note: When provided, 'sslClientKeystash' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslClientKeystashSecretId")
    private final String sslClientKeystashSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the keystash file is stored, which contains the encrypted password to the key
     * database file. This property is not supported for IBM Db2 for i, as client TLS mode is not
     * available.
     *
     * <p>Note: When provided, 'sslClientKeystash' field must not be provided.
     *
     * @return the value
     */
    public String getSslClientKeystashSecretId() {
        return sslClientKeystashSecretId;
    }

    /**
     * The base64 encoded file which contains the self-signed server certificate / Certificate
     * Authority (CA) certificate. It is not included in GET responses if the {@code view=COMPACT}
     * query parameter is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslServerCertificate")
    private final String sslServerCertificate;

    /**
     * The base64 encoded file which contains the self-signed server certificate / Certificate
     * Authority (CA) certificate. It is not included in GET responses if the {@code view=COMPACT}
     * query parameter is specified.
     *
     * @return the value
     */
    public String getSslServerCertificate() {
        return sslServerCertificate;
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
        sb.append("UpdateDb2ConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", additionalAttributes=").append(String.valueOf(this.additionalAttributes));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", sslClientKeystoredb=").append(String.valueOf(this.sslClientKeystoredb));
        sb.append(", sslClientKeystoredbSecretId=")
                .append(String.valueOf(this.sslClientKeystoredbSecretId));
        sb.append(", sslClientKeystash=").append(String.valueOf(this.sslClientKeystash));
        sb.append(", sslClientKeystashSecretId=")
                .append(String.valueOf(this.sslClientKeystashSecretId));
        sb.append(", sslServerCertificate=").append(String.valueOf(this.sslServerCertificate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDb2ConnectionDetails)) {
            return false;
        }

        UpdateDb2ConnectionDetails other = (UpdateDb2ConnectionDetails) o;
        return java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.additionalAttributes, other.additionalAttributes)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.sslClientKeystoredb, other.sslClientKeystoredb)
                && java.util.Objects.equals(
                        this.sslClientKeystoredbSecretId, other.sslClientKeystoredbSecretId)
                && java.util.Objects.equals(this.sslClientKeystash, other.sslClientKeystash)
                && java.util.Objects.equals(
                        this.sslClientKeystashSecretId, other.sslClientKeystashSecretId)
                && java.util.Objects.equals(this.sslServerCertificate, other.sslServerCertificate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
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
        result =
                (result * PRIME)
                        + (this.sslClientKeystoredb == null
                                ? 43
                                : this.sslClientKeystoredb.hashCode());
        result =
                (result * PRIME)
                        + (this.sslClientKeystoredbSecretId == null
                                ? 43
                                : this.sslClientKeystoredbSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.sslClientKeystash == null ? 43 : this.sslClientKeystash.hashCode());
        result =
                (result * PRIME)
                        + (this.sslClientKeystashSecretId == null
                                ? 43
                                : this.sslClientKeystashSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.sslServerCertificate == null
                                ? 43
                                : this.sslServerCertificate.hashCode());
        return result;
    }
}
