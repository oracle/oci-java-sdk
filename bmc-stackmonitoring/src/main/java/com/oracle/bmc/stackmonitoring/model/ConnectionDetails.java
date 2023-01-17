/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Connection details to connect to the database. HostName, protocol, and port should be specified.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "protocol",
        "port",
        "connectorId",
        "serviceName",
        "dbUniqueName",
        "dbId",
        "sslSecretId"
    })
    public ConnectionDetails(
            Protocol protocol,
            Integer port,
            String connectorId,
            String serviceName,
            String dbUniqueName,
            String dbId,
            String sslSecretId) {
        super();
        this.protocol = protocol;
        this.port = port;
        this.connectorId = connectorId;
        this.serviceName = serviceName;
        this.dbUniqueName = dbUniqueName;
        this.dbId = dbId;
        this.sslSecretId = sslSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Protocol used in DB connection string when connecting to external database service. */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * Protocol used in DB connection string when connecting to external database service.
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** Listener Port number used for connection requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Listener Port number used for connection requests.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** Database connector Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        /**
         * Database connector Identifier
         *
         * @param connectorId the value to set
         * @return this builder
         */
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
            return this;
        }
        /** Service name used for connection requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Service name used for connection requests.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** UniqueName used for database connection requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * UniqueName used for database connection requests.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         */
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }
        /** dbId of the database */
        @com.fasterxml.jackson.annotation.JsonProperty("dbId")
        private String dbId;

        /**
         * dbId of the database
         *
         * @param dbId the value to set
         * @return this builder
         */
        public Builder dbId(String dbId) {
            this.dbId = dbId;
            this.__explicitlySet__.add("dbId");
            return this;
        }
        /**
         * SSL Secret Identifier for TCPS connector in OCI
         * Vault[OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
        private String sslSecretId;

        /**
         * SSL Secret Identifier for TCPS connector in OCI
         * Vault[OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         *
         * @param sslSecretId the value to set
         * @return this builder
         */
        public Builder sslSecretId(String sslSecretId) {
            this.sslSecretId = sslSecretId;
            this.__explicitlySet__.add("sslSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionDetails build() {
            ConnectionDetails model =
                    new ConnectionDetails(
                            this.protocol,
                            this.port,
                            this.connectorId,
                            this.serviceName,
                            this.dbUniqueName,
                            this.dbId,
                            this.sslSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("dbId")) {
                this.dbId(model.getDbId());
            }
            if (model.wasPropertyExplicitlySet("sslSecretId")) {
                this.sslSecretId(model.getSslSecretId());
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

    /** Protocol used in DB connection string when connecting to external database service. */
    public enum Protocol implements com.oracle.bmc.http.internal.BmcEnum {
        Tcp("TCP"),
        Tcps("TCPS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Protocol.class);

        private final String value;
        private static java.util.Map<String, Protocol> map;

        static {
            map = new java.util.HashMap<>();
            for (Protocol v : Protocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Protocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Protocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Protocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Protocol used in DB connection string when connecting to external database service. */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * Protocol used in DB connection string when connecting to external database service.
     *
     * @return the value
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /** Listener Port number used for connection requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Listener Port number used for connection requests.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** Database connector Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
    private final String connectorId;

    /**
     * Database connector Identifier
     *
     * @return the value
     */
    public String getConnectorId() {
        return connectorId;
    }

    /** Service name used for connection requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Service name used for connection requests.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** UniqueName used for database connection requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * UniqueName used for database connection requests.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /** dbId of the database */
    @com.fasterxml.jackson.annotation.JsonProperty("dbId")
    private final String dbId;

    /**
     * dbId of the database
     *
     * @return the value
     */
    public String getDbId() {
        return dbId;
    }

    /**
     * SSL Secret Identifier for TCPS connector in OCI
     * Vault[OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
    private final String sslSecretId;

    /**
     * SSL Secret Identifier for TCPS connector in OCI
     * Vault[OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     *
     * @return the value
     */
    public String getSslSecretId() {
        return sslSecretId;
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
        sb.append("ConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("protocol=").append(String.valueOf(this.protocol));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", connectorId=").append(String.valueOf(this.connectorId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbId=").append(String.valueOf(this.dbId));
        sb.append(", sslSecretId=").append(String.valueOf(this.sslSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionDetails)) {
            return false;
        }

        ConnectionDetails other = (ConnectionDetails) o;
        return java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.connectorId, other.connectorId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbId, other.dbId)
                && java.util.Objects.equals(this.sslSecretId, other.sslSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.connectorId == null ? 43 : this.connectorId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbId == null ? 43 : this.dbId.hashCode());
        result = (result * PRIME) + (this.sslSecretId == null ? 43 : this.sslSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
