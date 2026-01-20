/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Details of external database connector. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalMySqlDatabaseConnector.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalMySqlDatabaseConnector
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "compartmentId",
        "associatedServices",
        "externalDatabaseId",
        "id",
        "timeUpdated",
        "timeCreated",
        "lifecycleState",
        "sourceDatabase",
        "sourceDatabaseType",
        "macsAgentId",
        "connectionStatus",
        "timeConnectionStatusUpdated",
        "hostName",
        "port",
        "connectorType",
        "networkProtocol",
        "credentialType",
        "sslSecretId",
        "sslSecretName"
    })
    public ExternalMySqlDatabaseConnector(
            String name,
            String compartmentId,
            String associatedServices,
            String externalDatabaseId,
            String id,
            java.util.Date timeUpdated,
            java.util.Date timeCreated,
            LifecycleStates lifecycleState,
            String sourceDatabase,
            MySqlType sourceDatabaseType,
            String macsAgentId,
            String connectionStatus,
            java.util.Date timeConnectionStatusUpdated,
            String hostName,
            Integer port,
            MySqlConnectorType connectorType,
            MySqlNetworkProtocolType networkProtocol,
            MySqlCredType credentialType,
            String sslSecretId,
            String sslSecretName) {
        super();
        this.name = name;
        this.compartmentId = compartmentId;
        this.associatedServices = associatedServices;
        this.externalDatabaseId = externalDatabaseId;
        this.id = id;
        this.timeUpdated = timeUpdated;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.sourceDatabase = sourceDatabase;
        this.sourceDatabaseType = sourceDatabaseType;
        this.macsAgentId = macsAgentId;
        this.connectionStatus = connectionStatus;
        this.timeConnectionStatusUpdated = timeConnectionStatusUpdated;
        this.hostName = hostName;
        this.port = port;
        this.connectorType = connectorType;
        this.networkProtocol = networkProtocol;
        this.credentialType = credentialType;
        this.sslSecretId = sslSecretId;
        this.sslSecretName = sslSecretName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** External MySQL Database Connector Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * External MySQL Database Connector Name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** OCID of compartment for the External MySQL connector. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of compartment for the External MySQL connector.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OCI Services associated with this connector. */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedServices")
        private String associatedServices;

        /**
         * OCI Services associated with this connector.
         *
         * @param associatedServices the value to set
         * @return this builder
         */
        public Builder associatedServices(String associatedServices) {
            this.associatedServices = associatedServices;
            this.__explicitlySet__.add("associatedServices");
            return this;
        }
        /** OCID of MySQL Database resource */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseId")
        private String externalDatabaseId;

        /**
         * OCID of MySQL Database resource
         *
         * @param externalDatabaseId the value to set
         * @return this builder
         */
        public Builder externalDatabaseId(String externalDatabaseId) {
            this.externalDatabaseId = externalDatabaseId;
            this.__explicitlySet__.add("externalDatabaseId");
            return this;
        }
        /** OCID of MySQL Database Connector. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of MySQL Database Connector.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Connector update time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Connector update time.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Connector creation time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Connector creation time.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Indicates lifecycle state of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * Indicates lifecycle state of the resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Name of MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabase")
        private String sourceDatabase;

        /**
         * Name of MySQL Database.
         *
         * @param sourceDatabase the value to set
         * @return this builder
         */
        public Builder sourceDatabase(String sourceDatabase) {
            this.sourceDatabase = sourceDatabase;
            this.__explicitlySet__.add("sourceDatabase");
            return this;
        }
        /** Type of MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseType")
        private MySqlType sourceDatabaseType;

        /**
         * Type of MySQL Database.
         *
         * @param sourceDatabaseType the value to set
         * @return this builder
         */
        public Builder sourceDatabaseType(MySqlType sourceDatabaseType) {
            this.sourceDatabaseType = sourceDatabaseType;
            this.__explicitlySet__.add("sourceDatabaseType");
            return this;
        }
        /** Agent Id of the MACS agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("macsAgentId")
        private String macsAgentId;

        /**
         * Agent Id of the MACS agent.
         *
         * @param macsAgentId the value to set
         * @return this builder
         */
        public Builder macsAgentId(String macsAgentId) {
            this.macsAgentId = macsAgentId;
            this.__explicitlySet__.add("macsAgentId");
            return this;
        }
        /** Connection Status */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionStatus")
        private String connectionStatus;

        /**
         * Connection Status
         *
         * @param connectionStatus the value to set
         * @return this builder
         */
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            this.__explicitlySet__.add("connectionStatus");
            return this;
        }
        /** Time when connection status was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeConnectionStatusUpdated")
        private java.util.Date timeConnectionStatusUpdated;

        /**
         * Time when connection status was last updated.
         *
         * @param timeConnectionStatusUpdated the value to set
         * @return this builder
         */
        public Builder timeConnectionStatusUpdated(java.util.Date timeConnectionStatusUpdated) {
            this.timeConnectionStatusUpdated = timeConnectionStatusUpdated;
            this.__explicitlySet__.add("timeConnectionStatusUpdated");
            return this;
        }
        /** Host name for Connector. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name for Connector.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** Connector port. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Connector port.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** Connector Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectorType")
        private MySqlConnectorType connectorType;

        /**
         * Connector Type.
         *
         * @param connectorType the value to set
         * @return this builder
         */
        public Builder connectorType(MySqlConnectorType connectorType) {
            this.connectorType = connectorType;
            this.__explicitlySet__.add("connectorType");
            return this;
        }
        /** Network Protocol. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkProtocol")
        private MySqlNetworkProtocolType networkProtocol;

        /**
         * Network Protocol.
         *
         * @param networkProtocol the value to set
         * @return this builder
         */
        public Builder networkProtocol(MySqlNetworkProtocolType networkProtocol) {
            this.networkProtocol = networkProtocol;
            this.__explicitlySet__.add("networkProtocol");
            return this;
        }
        /** Credential type used to connect to database. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialType")
        private MySqlCredType credentialType;

        /**
         * Credential type used to connect to database.
         *
         * @param credentialType the value to set
         * @return this builder
         */
        public Builder credentialType(MySqlCredType credentialType) {
            this.credentialType = credentialType;
            this.__explicitlySet__.add("credentialType");
            return this;
        }
        /** OCID of the SSL secret, if TCPS with SSL is used to connect to database. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
        private String sslSecretId;

        /**
         * OCID of the SSL secret, if TCPS with SSL is used to connect to database.
         *
         * @param sslSecretId the value to set
         * @return this builder
         */
        public Builder sslSecretId(String sslSecretId) {
            this.sslSecretId = sslSecretId;
            this.__explicitlySet__.add("sslSecretId");
            return this;
        }
        /** Name of the SSL secret, if TCPS with SSL is used to connect to database. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslSecretName")
        private String sslSecretName;

        /**
         * Name of the SSL secret, if TCPS with SSL is used to connect to database.
         *
         * @param sslSecretName the value to set
         * @return this builder
         */
        public Builder sslSecretName(String sslSecretName) {
            this.sslSecretName = sslSecretName;
            this.__explicitlySet__.add("sslSecretName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalMySqlDatabaseConnector build() {
            ExternalMySqlDatabaseConnector model =
                    new ExternalMySqlDatabaseConnector(
                            this.name,
                            this.compartmentId,
                            this.associatedServices,
                            this.externalDatabaseId,
                            this.id,
                            this.timeUpdated,
                            this.timeCreated,
                            this.lifecycleState,
                            this.sourceDatabase,
                            this.sourceDatabaseType,
                            this.macsAgentId,
                            this.connectionStatus,
                            this.timeConnectionStatusUpdated,
                            this.hostName,
                            this.port,
                            this.connectorType,
                            this.networkProtocol,
                            this.credentialType,
                            this.sslSecretId,
                            this.sslSecretName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalMySqlDatabaseConnector model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("associatedServices")) {
                this.associatedServices(model.getAssociatedServices());
            }
            if (model.wasPropertyExplicitlySet("externalDatabaseId")) {
                this.externalDatabaseId(model.getExternalDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("sourceDatabase")) {
                this.sourceDatabase(model.getSourceDatabase());
            }
            if (model.wasPropertyExplicitlySet("sourceDatabaseType")) {
                this.sourceDatabaseType(model.getSourceDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("macsAgentId")) {
                this.macsAgentId(model.getMacsAgentId());
            }
            if (model.wasPropertyExplicitlySet("connectionStatus")) {
                this.connectionStatus(model.getConnectionStatus());
            }
            if (model.wasPropertyExplicitlySet("timeConnectionStatusUpdated")) {
                this.timeConnectionStatusUpdated(model.getTimeConnectionStatusUpdated());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("connectorType")) {
                this.connectorType(model.getConnectorType());
            }
            if (model.wasPropertyExplicitlySet("networkProtocol")) {
                this.networkProtocol(model.getNetworkProtocol());
            }
            if (model.wasPropertyExplicitlySet("credentialType")) {
                this.credentialType(model.getCredentialType());
            }
            if (model.wasPropertyExplicitlySet("sslSecretId")) {
                this.sslSecretId(model.getSslSecretId());
            }
            if (model.wasPropertyExplicitlySet("sslSecretName")) {
                this.sslSecretName(model.getSslSecretName());
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

    /** External MySQL Database Connector Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * External MySQL Database Connector Name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** OCID of compartment for the External MySQL connector. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of compartment for the External MySQL connector.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OCI Services associated with this connector. */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedServices")
    private final String associatedServices;

    /**
     * OCI Services associated with this connector.
     *
     * @return the value
     */
    public String getAssociatedServices() {
        return associatedServices;
    }

    /** OCID of MySQL Database resource */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseId")
    private final String externalDatabaseId;

    /**
     * OCID of MySQL Database resource
     *
     * @return the value
     */
    public String getExternalDatabaseId() {
        return externalDatabaseId;
    }

    /** OCID of MySQL Database Connector. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of MySQL Database Connector.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Connector update time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Connector update time.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Connector creation time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Connector creation time.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Indicates lifecycle state of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * Indicates lifecycle state of the resource.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** Name of MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabase")
    private final String sourceDatabase;

    /**
     * Name of MySQL Database.
     *
     * @return the value
     */
    public String getSourceDatabase() {
        return sourceDatabase;
    }

    /** Type of MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseType")
    private final MySqlType sourceDatabaseType;

    /**
     * Type of MySQL Database.
     *
     * @return the value
     */
    public MySqlType getSourceDatabaseType() {
        return sourceDatabaseType;
    }

    /** Agent Id of the MACS agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("macsAgentId")
    private final String macsAgentId;

    /**
     * Agent Id of the MACS agent.
     *
     * @return the value
     */
    public String getMacsAgentId() {
        return macsAgentId;
    }

    /** Connection Status */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStatus")
    private final String connectionStatus;

    /**
     * Connection Status
     *
     * @return the value
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /** Time when connection status was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeConnectionStatusUpdated")
    private final java.util.Date timeConnectionStatusUpdated;

    /**
     * Time when connection status was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeConnectionStatusUpdated() {
        return timeConnectionStatusUpdated;
    }

    /** Host name for Connector. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name for Connector.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** Connector port. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Connector port.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** Connector Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorType")
    private final MySqlConnectorType connectorType;

    /**
     * Connector Type.
     *
     * @return the value
     */
    public MySqlConnectorType getConnectorType() {
        return connectorType;
    }

    /** Network Protocol. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkProtocol")
    private final MySqlNetworkProtocolType networkProtocol;

    /**
     * Network Protocol.
     *
     * @return the value
     */
    public MySqlNetworkProtocolType getNetworkProtocol() {
        return networkProtocol;
    }

    /** Credential type used to connect to database. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialType")
    private final MySqlCredType credentialType;

    /**
     * Credential type used to connect to database.
     *
     * @return the value
     */
    public MySqlCredType getCredentialType() {
        return credentialType;
    }

    /** OCID of the SSL secret, if TCPS with SSL is used to connect to database. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
    private final String sslSecretId;

    /**
     * OCID of the SSL secret, if TCPS with SSL is used to connect to database.
     *
     * @return the value
     */
    public String getSslSecretId() {
        return sslSecretId;
    }

    /** Name of the SSL secret, if TCPS with SSL is used to connect to database. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslSecretName")
    private final String sslSecretName;

    /**
     * Name of the SSL secret, if TCPS with SSL is used to connect to database.
     *
     * @return the value
     */
    public String getSslSecretName() {
        return sslSecretName;
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
        sb.append("ExternalMySqlDatabaseConnector(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", associatedServices=").append(String.valueOf(this.associatedServices));
        sb.append(", externalDatabaseId=").append(String.valueOf(this.externalDatabaseId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sourceDatabase=").append(String.valueOf(this.sourceDatabase));
        sb.append(", sourceDatabaseType=").append(String.valueOf(this.sourceDatabaseType));
        sb.append(", macsAgentId=").append(String.valueOf(this.macsAgentId));
        sb.append(", connectionStatus=").append(String.valueOf(this.connectionStatus));
        sb.append(", timeConnectionStatusUpdated=")
                .append(String.valueOf(this.timeConnectionStatusUpdated));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", connectorType=").append(String.valueOf(this.connectorType));
        sb.append(", networkProtocol=").append(String.valueOf(this.networkProtocol));
        sb.append(", credentialType=").append(String.valueOf(this.credentialType));
        sb.append(", sslSecretId=").append(String.valueOf(this.sslSecretId));
        sb.append(", sslSecretName=").append(String.valueOf(this.sslSecretName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalMySqlDatabaseConnector)) {
            return false;
        }

        ExternalMySqlDatabaseConnector other = (ExternalMySqlDatabaseConnector) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.associatedServices, other.associatedServices)
                && java.util.Objects.equals(this.externalDatabaseId, other.externalDatabaseId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sourceDatabase, other.sourceDatabase)
                && java.util.Objects.equals(this.sourceDatabaseType, other.sourceDatabaseType)
                && java.util.Objects.equals(this.macsAgentId, other.macsAgentId)
                && java.util.Objects.equals(this.connectionStatus, other.connectionStatus)
                && java.util.Objects.equals(
                        this.timeConnectionStatusUpdated, other.timeConnectionStatusUpdated)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.connectorType, other.connectorType)
                && java.util.Objects.equals(this.networkProtocol, other.networkProtocol)
                && java.util.Objects.equals(this.credentialType, other.credentialType)
                && java.util.Objects.equals(this.sslSecretId, other.sslSecretId)
                && java.util.Objects.equals(this.sslSecretName, other.sslSecretName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedServices == null
                                ? 43
                                : this.associatedServices.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDatabaseId == null
                                ? 43
                                : this.externalDatabaseId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDatabase == null ? 43 : this.sourceDatabase.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDatabaseType == null
                                ? 43
                                : this.sourceDatabaseType.hashCode());
        result = (result * PRIME) + (this.macsAgentId == null ? 43 : this.macsAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStatus == null ? 43 : this.connectionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeConnectionStatusUpdated == null
                                ? 43
                                : this.timeConnectionStatusUpdated.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.connectorType == null ? 43 : this.connectorType.hashCode());
        result =
                (result * PRIME)
                        + (this.networkProtocol == null ? 43 : this.networkProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialType == null ? 43 : this.credentialType.hashCode());
        result = (result * PRIME) + (this.sslSecretId == null ? 43 : this.sslSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.sslSecretName == null ? 43 : this.sslSecretName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
