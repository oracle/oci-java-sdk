/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * The information about a new MySQL Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMysqlConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMysqlConnectionDetails extends CreateConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicationUsername")
        private String replicationUsername;

        public Builder replicationUsername(String replicationUsername) {
            this.replicationUsername = replicationUsername;
            this.__explicitlySet__.add("replicationUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicationPassword")
        private String replicationPassword;

        public Builder replicationPassword(String replicationPassword) {
            this.replicationPassword = replicationPassword;
            this.__explicitlySet__.add("replicationPassword");
            return this;
        }
        /**
         * The type of MySQL source or target connection. Example: OCI_MYSQL represents OCI MySQL
         * HeatWave Database Service
         */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private MysqlConnection.TechnologyType technologyType;

        /**
         * The type of MySQL source or target connection. Example: OCI_MYSQL represents OCI MySQL
         * HeatWave Database Service
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(MysqlConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /** The IP Address of the host. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The IP Address of the host.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The port to be used for the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port to be used for the connection.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** The name of the database being referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The name of the database being referenced.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** Security Type for MySQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
        private MysqlConnection.SecurityProtocol securityProtocol;

        /**
         * Security Type for MySQL.
         *
         * @param securityProtocol the value to set
         * @return this builder
         */
        public Builder securityProtocol(MysqlConnection.SecurityProtocol securityProtocol) {
            this.securityProtocol = securityProtocol;
            this.__explicitlySet__.add("securityProtocol");
            return this;
        }
        /** SSL modes for MySQL. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
        private MysqlConnection.SslMode sslMode;

        /**
         * SSL modes for MySQL.
         *
         * @param sslMode the value to set
         * @return this builder
         */
        public Builder sslMode(MysqlConnection.SslMode sslMode) {
            this.sslMode = sslMode;
            this.__explicitlySet__.add("sslMode");
            return this;
        }
        /**
         * Database Certificate - The base64 encoded content of mysql.pem file containing the server
         * public key (for 1 and 2-way SSL).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslCa")
        private String sslCa;

        /**
         * Database Certificate - The base64 encoded content of mysql.pem file containing the server
         * public key (for 1 and 2-way SSL).
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
         * Certificates revoked by certificate authorities (CA). Server certificate must not be on
         * this list (for 1 and 2-way SSL). Note: This is an optional and that too only applicable
         * if TLS/MTLS option is selected.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslCrl")
        private String sslCrl;

        /**
         * Certificates revoked by certificate authorities (CA). Server certificate must not be on
         * this list (for 1 and 2-way SSL). Note: This is an optional and that too only applicable
         * if TLS/MTLS option is selected.
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
         * Client Certificate - The base64 encoded content of client-cert.pem file containing the
         * client public key (for 2-way SSL).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslCert")
        private String sslCert;

        /**
         * Client Certificate - The base64 encoded content of client-cert.pem file containing the
         * client public key (for 2-way SSL).
         *
         * @param sslCert the value to set
         * @return this builder
         */
        public Builder sslCert(String sslCert) {
            this.sslCert = sslCert;
            this.__explicitlySet__.add("sslCert");
            return this;
        }
        /** Client Key - The client-key.pem containing the client private key (for 2-way SSL). */
        @com.fasterxml.jackson.annotation.JsonProperty("sslKey")
        private String sslKey;

        /**
         * Client Key - The client-key.pem containing the client private key (for 2-way SSL).
         *
         * @param sslKey the value to set
         * @return this builder
         */
        public Builder sslKey(String sslKey) {
            this.sslKey = sslKey;
            this.__explicitlySet__.add("sslKey");
            return this;
        }
        /** An array of name-value pair attribute entries. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
        private java.util.List<NameValuePair> additionalAttributes;

        /**
         * An array of name-value pair attribute entries.
         *
         * @param additionalAttributes the value to set
         * @return this builder
         */
        public Builder additionalAttributes(java.util.List<NameValuePair> additionalAttributes) {
            this.additionalAttributes = additionalAttributes;
            this.__explicitlySet__.add("additionalAttributes");
            return this;
        }
        /** The OCID of the database system being referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the database system being referenced.
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

        public CreateMysqlConnectionDetails build() {
            CreateMysqlConnectionDetails model =
                    new CreateMysqlConnectionDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.vaultId,
                            this.keyId,
                            this.subnetId,
                            this.nsgIds,
                            this.username,
                            this.password,
                            this.replicationUsername,
                            this.replicationPassword,
                            this.technologyType,
                            this.host,
                            this.port,
                            this.databaseName,
                            this.securityProtocol,
                            this.sslMode,
                            this.sslCa,
                            this.sslCrl,
                            this.sslCert,
                            this.sslKey,
                            this.additionalAttributes,
                            this.dbSystemId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMysqlConnectionDetails model) {
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
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("replicationUsername")) {
                this.replicationUsername(model.getReplicationUsername());
            }
            if (model.wasPropertyExplicitlySet("replicationPassword")) {
                this.replicationPassword(model.getReplicationPassword());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
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
            if (model.wasPropertyExplicitlySet("additionalAttributes")) {
                this.additionalAttributes(model.getAdditionalAttributes());
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
    public CreateMysqlConnectionDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String vaultId,
            String keyId,
            String subnetId,
            java.util.List<String> nsgIds,
            String username,
            String password,
            String replicationUsername,
            String replicationPassword,
            MysqlConnection.TechnologyType technologyType,
            String host,
            Integer port,
            String databaseName,
            MysqlConnection.SecurityProtocol securityProtocol,
            MysqlConnection.SslMode sslMode,
            String sslCa,
            String sslCrl,
            String sslCert,
            String sslKey,
            java.util.List<NameValuePair> additionalAttributes,
            String dbSystemId) {
        super(
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                vaultId,
                keyId,
                subnetId,
                nsgIds,
                username,
                password,
                replicationUsername,
                replicationPassword);
        this.technologyType = technologyType;
        this.host = host;
        this.port = port;
        this.databaseName = databaseName;
        this.securityProtocol = securityProtocol;
        this.sslMode = sslMode;
        this.sslCa = sslCa;
        this.sslCrl = sslCrl;
        this.sslCert = sslCert;
        this.sslKey = sslKey;
        this.additionalAttributes = additionalAttributes;
        this.dbSystemId = dbSystemId;
    }

    /**
     * The type of MySQL source or target connection. Example: OCI_MYSQL represents OCI MySQL
     * HeatWave Database Service
     */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final MysqlConnection.TechnologyType technologyType;

    /**
     * The type of MySQL source or target connection. Example: OCI_MYSQL represents OCI MySQL
     * HeatWave Database Service
     *
     * @return the value
     */
    public MysqlConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /** The IP Address of the host. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The IP Address of the host.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The port to be used for the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port to be used for the connection.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** The name of the database being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The name of the database being referenced.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** Security Type for MySQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityProtocol")
    private final MysqlConnection.SecurityProtocol securityProtocol;

    /**
     * Security Type for MySQL.
     *
     * @return the value
     */
    public MysqlConnection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /** SSL modes for MySQL. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
    private final MysqlConnection.SslMode sslMode;

    /**
     * SSL modes for MySQL.
     *
     * @return the value
     */
    public MysqlConnection.SslMode getSslMode() {
        return sslMode;
    }

    /**
     * Database Certificate - The base64 encoded content of mysql.pem file containing the server
     * public key (for 1 and 2-way SSL).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslCa")
    private final String sslCa;

    /**
     * Database Certificate - The base64 encoded content of mysql.pem file containing the server
     * public key (for 1 and 2-way SSL).
     *
     * @return the value
     */
    public String getSslCa() {
        return sslCa;
    }

    /**
     * Certificates revoked by certificate authorities (CA). Server certificate must not be on this
     * list (for 1 and 2-way SSL). Note: This is an optional and that too only applicable if
     * TLS/MTLS option is selected.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslCrl")
    private final String sslCrl;

    /**
     * Certificates revoked by certificate authorities (CA). Server certificate must not be on this
     * list (for 1 and 2-way SSL). Note: This is an optional and that too only applicable if
     * TLS/MTLS option is selected.
     *
     * @return the value
     */
    public String getSslCrl() {
        return sslCrl;
    }

    /**
     * Client Certificate - The base64 encoded content of client-cert.pem file containing the client
     * public key (for 2-way SSL).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslCert")
    private final String sslCert;

    /**
     * Client Certificate - The base64 encoded content of client-cert.pem file containing the client
     * public key (for 2-way SSL).
     *
     * @return the value
     */
    public String getSslCert() {
        return sslCert;
    }

    /** Client Key - The client-key.pem containing the client private key (for 2-way SSL). */
    @com.fasterxml.jackson.annotation.JsonProperty("sslKey")
    private final String sslKey;

    /**
     * Client Key - The client-key.pem containing the client private key (for 2-way SSL).
     *
     * @return the value
     */
    public String getSslKey() {
        return sslKey;
    }

    /** An array of name-value pair attribute entries. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
    private final java.util.List<NameValuePair> additionalAttributes;

    /**
     * An array of name-value pair attribute entries.
     *
     * @return the value
     */
    public java.util.List<NameValuePair> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /** The OCID of the database system being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the database system being referenced.
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
        sb.append("CreateMysqlConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", securityProtocol=").append(String.valueOf(this.securityProtocol));
        sb.append(", sslMode=").append(String.valueOf(this.sslMode));
        sb.append(", sslCa=").append(String.valueOf(this.sslCa));
        sb.append(", sslCrl=").append(String.valueOf(this.sslCrl));
        sb.append(", sslCert=").append(String.valueOf(this.sslCert));
        sb.append(", sslKey=").append(String.valueOf(this.sslKey));
        sb.append(", additionalAttributes=").append(String.valueOf(this.additionalAttributes));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMysqlConnectionDetails)) {
            return false;
        }

        CreateMysqlConnectionDetails other = (CreateMysqlConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.securityProtocol, other.securityProtocol)
                && java.util.Objects.equals(this.sslMode, other.sslMode)
                && java.util.Objects.equals(this.sslCa, other.sslCa)
                && java.util.Objects.equals(this.sslCrl, other.sslCrl)
                && java.util.Objects.equals(this.sslCert, other.sslCert)
                && java.util.Objects.equals(this.sslKey, other.sslKey)
                && java.util.Objects.equals(this.additionalAttributes, other.additionalAttributes)
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
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
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
                        + (this.additionalAttributes == null
                                ? 43
                                : this.additionalAttributes.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        return result;
    }
}
