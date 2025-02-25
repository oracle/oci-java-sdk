/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Create Details of external database connector.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMySqlDatabaseConnectorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateMySqlDatabaseConnectorDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "macsAgentId",
        "hostName",
        "port",
        "networkProtocol",
        "externalDatabaseId",
        "credentialType",
        "sslSecretId"
    })
    public CreateMySqlDatabaseConnectorDetails(
            String displayName,
            String macsAgentId,
            String hostName,
            Integer port,
            MySqlNetworkProtocolType networkProtocol,
            String externalDatabaseId,
            MySqlCredType credentialType,
            String sslSecretId) {
        super();
        this.displayName = displayName;
        this.macsAgentId = macsAgentId;
        this.hostName = hostName;
        this.port = port;
        this.networkProtocol = networkProtocol;
        this.externalDatabaseId = externalDatabaseId;
        this.credentialType = credentialType;
        this.sslSecretId = sslSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * External MySQL Database Connector Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * External MySQL Database Connector Name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Agent Id of the MACS agent.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("macsAgentId")
        private String macsAgentId;

        /**
         * Agent Id of the MACS agent.
         * @param macsAgentId the value to set
         * @return this builder
         **/
        public Builder macsAgentId(String macsAgentId) {
            this.macsAgentId = macsAgentId;
            this.__explicitlySet__.add("macsAgentId");
            return this;
        }
        /**
         * Host name for Connector.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name for Connector.
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * Port number to connect to External MySQL Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port number to connect to External MySQL Database.
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * Protocol to be used to connect to External MySQL Database; TCP, TCP with SSL or Socket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkProtocol")
        private MySqlNetworkProtocolType networkProtocol;

        /**
         * Protocol to be used to connect to External MySQL Database; TCP, TCP with SSL or Socket.
         * @param networkProtocol the value to set
         * @return this builder
         **/
        public Builder networkProtocol(MySqlNetworkProtocolType networkProtocol) {
            this.networkProtocol = networkProtocol;
            this.__explicitlySet__.add("networkProtocol");
            return this;
        }
        /**
         * OCID of MySQL Database resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseId")
        private String externalDatabaseId;

        /**
         * OCID of MySQL Database resource.
         * @param externalDatabaseId the value to set
         * @return this builder
         **/
        public Builder externalDatabaseId(String externalDatabaseId) {
            this.externalDatabaseId = externalDatabaseId;
            this.__explicitlySet__.add("externalDatabaseId");
            return this;
        }
        /**
         * Type of the credential.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("credentialType")
        private MySqlCredType credentialType;

        /**
         * Type of the credential.
         * @param credentialType the value to set
         * @return this builder
         **/
        public Builder credentialType(MySqlCredType credentialType) {
            this.credentialType = credentialType;
            this.__explicitlySet__.add("credentialType");
            return this;
        }
        /**
         * If using existing SSL secret to connect, OCID for the secret resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
        private String sslSecretId;

        /**
         * If using existing SSL secret to connect, OCID for the secret resource.
         * @param sslSecretId the value to set
         * @return this builder
         **/
        public Builder sslSecretId(String sslSecretId) {
            this.sslSecretId = sslSecretId;
            this.__explicitlySet__.add("sslSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMySqlDatabaseConnectorDetails build() {
            CreateMySqlDatabaseConnectorDetails model =
                    new CreateMySqlDatabaseConnectorDetails(
                            this.displayName,
                            this.macsAgentId,
                            this.hostName,
                            this.port,
                            this.networkProtocol,
                            this.externalDatabaseId,
                            this.credentialType,
                            this.sslSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMySqlDatabaseConnectorDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("macsAgentId")) {
                this.macsAgentId(model.getMacsAgentId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("networkProtocol")) {
                this.networkProtocol(model.getNetworkProtocol());
            }
            if (model.wasPropertyExplicitlySet("externalDatabaseId")) {
                this.externalDatabaseId(model.getExternalDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("credentialType")) {
                this.credentialType(model.getCredentialType());
            }
            if (model.wasPropertyExplicitlySet("sslSecretId")) {
                this.sslSecretId(model.getSslSecretId());
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

    /**
     * External MySQL Database Connector Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * External MySQL Database Connector Name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Agent Id of the MACS agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("macsAgentId")
    private final String macsAgentId;

    /**
     * Agent Id of the MACS agent.
     * @return the value
     **/
    public String getMacsAgentId() {
        return macsAgentId;
    }

    /**
     * Host name for Connector.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name for Connector.
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * Port number to connect to External MySQL Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port number to connect to External MySQL Database.
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * Protocol to be used to connect to External MySQL Database; TCP, TCP with SSL or Socket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkProtocol")
    private final MySqlNetworkProtocolType networkProtocol;

    /**
     * Protocol to be used to connect to External MySQL Database; TCP, TCP with SSL or Socket.
     * @return the value
     **/
    public MySqlNetworkProtocolType getNetworkProtocol() {
        return networkProtocol;
    }

    /**
     * OCID of MySQL Database resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseId")
    private final String externalDatabaseId;

    /**
     * OCID of MySQL Database resource.
     * @return the value
     **/
    public String getExternalDatabaseId() {
        return externalDatabaseId;
    }

    /**
     * Type of the credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialType")
    private final MySqlCredType credentialType;

    /**
     * Type of the credential.
     * @return the value
     **/
    public MySqlCredType getCredentialType() {
        return credentialType;
    }

    /**
     * If using existing SSL secret to connect, OCID for the secret resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
    private final String sslSecretId;

    /**
     * If using existing SSL secret to connect, OCID for the secret resource.
     * @return the value
     **/
    public String getSslSecretId() {
        return sslSecretId;
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
        sb.append("CreateMySqlDatabaseConnectorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", macsAgentId=").append(String.valueOf(this.macsAgentId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", networkProtocol=").append(String.valueOf(this.networkProtocol));
        sb.append(", externalDatabaseId=").append(String.valueOf(this.externalDatabaseId));
        sb.append(", credentialType=").append(String.valueOf(this.credentialType));
        sb.append(", sslSecretId=").append(String.valueOf(this.sslSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMySqlDatabaseConnectorDetails)) {
            return false;
        }

        CreateMySqlDatabaseConnectorDetails other = (CreateMySqlDatabaseConnectorDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.macsAgentId, other.macsAgentId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.networkProtocol, other.networkProtocol)
                && java.util.Objects.equals(this.externalDatabaseId, other.externalDatabaseId)
                && java.util.Objects.equals(this.credentialType, other.credentialType)
                && java.util.Objects.equals(this.sslSecretId, other.sslSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.macsAgentId == null ? 43 : this.macsAgentId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.networkProtocol == null ? 43 : this.networkProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDatabaseId == null
                                ? 43
                                : this.externalDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialType == null ? 43 : this.credentialType.hashCode());
        result = (result * PRIME) + (this.sslSecretId == null ? 43 : this.sslSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
