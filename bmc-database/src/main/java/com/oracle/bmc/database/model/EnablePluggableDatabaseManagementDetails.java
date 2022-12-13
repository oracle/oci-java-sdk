/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Data to enable the Database Management service for the pluggable database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EnablePluggableDatabaseManagementDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class EnablePluggableDatabaseManagementDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "privateEndPointId",
        "serviceName",
        "protocol",
        "port",
        "sslSecretId",
        "role"
    })
    public EnablePluggableDatabaseManagementDetails(
            DatabaseCredentialDetails credentialDetails,
            String privateEndPointId,
            String serviceName,
            Protocol protocol,
            Integer port,
            String sslSecretId,
            Role role) {
        super();
        this.credentialDetails = credentialDetails;
        this.privateEndPointId = privateEndPointId;
        this.serviceName = serviceName;
        this.protocol = protocol;
        this.port = port;
        this.sslSecretId = sslSecretId;
        this.role = role;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private DatabaseCredentialDetails credentialDetails;

        public Builder credentialDetails(DatabaseCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointId")
        private String privateEndPointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * private endpoint.
         *
         * @param privateEndPointId the value to set
         * @return this builder
         */
        public Builder privateEndPointId(String privateEndPointId) {
            this.privateEndPointId = privateEndPointId;
            this.__explicitlySet__.add("privateEndPointId");
            return this;
        }
        /** The name of the Oracle Database service that will be used to connect to the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The name of the Oracle Database service that will be used to connect to the database.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** Protocol used by the database connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * Protocol used by the database connection.
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** The port used to connect to the pluggable database. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port used to connect to the pluggable database.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
        private String sslSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         *
         * @param sslSecretId the value to set
         * @return this builder
         */
        public Builder sslSecretId(String sslSecretId) {
            this.sslSecretId = sslSecretId;
            this.__explicitlySet__.add("sslSecretId");
            return this;
        }
        /** The role of the user that will be connecting to the pluggable database. */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The role of the user that will be connecting to the pluggable database.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnablePluggableDatabaseManagementDetails build() {
            EnablePluggableDatabaseManagementDetails model =
                    new EnablePluggableDatabaseManagementDetails(
                            this.credentialDetails,
                            this.privateEndPointId,
                            this.serviceName,
                            this.protocol,
                            this.port,
                            this.sslSecretId,
                            this.role);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnablePluggableDatabaseManagementDetails model) {
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("privateEndPointId")) {
                this.privateEndPointId(model.getPrivateEndPointId());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("sslSecretId")) {
                this.sslSecretId(model.getSslSecretId());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
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

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final DatabaseCredentialDetails credentialDetails;

    public DatabaseCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * private endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointId")
    private final String privateEndPointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * private endpoint.
     *
     * @return the value
     */
    public String getPrivateEndPointId() {
        return privateEndPointId;
    }

    /** The name of the Oracle Database service that will be used to connect to the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The name of the Oracle Database service that will be used to connect to the database.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** Protocol used by the database connection. */
    public enum Protocol implements com.oracle.bmc.http.internal.BmcEnum {
        Tcp("TCP"),
        Tcps("TCPS"),
        ;

        private final String value;
        private static java.util.Map<String, Protocol> map;

        static {
            map = new java.util.HashMap<>();
            for (Protocol v : Protocol.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Protocol: " + key);
        }
    };
    /** Protocol used by the database connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final Protocol protocol;

    /**
     * Protocol used by the database connection.
     *
     * @return the value
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /** The port used to connect to the pluggable database. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port used to connect to the pluggable database.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslSecretId")
    private final String sslSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [secret](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     *
     * @return the value
     */
    public String getSslSecretId() {
        return sslSecretId;
    }

    /** The role of the user that will be connecting to the pluggable database. */
    public enum Role implements com.oracle.bmc.http.internal.BmcEnum {
        Sysdba("SYSDBA"),
        Normal("NORMAL"),
        ;

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                map.put(v.getValue(), v);
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Role: " + key);
        }
    };
    /** The role of the user that will be connecting to the pluggable database. */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The role of the user that will be connecting to the pluggable database.
     *
     * @return the value
     */
    public Role getRole() {
        return role;
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
        sb.append("EnablePluggableDatabaseManagementDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", privateEndPointId=").append(String.valueOf(this.privateEndPointId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", sslSecretId=").append(String.valueOf(this.sslSecretId));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnablePluggableDatabaseManagementDetails)) {
            return false;
        }

        EnablePluggableDatabaseManagementDetails other =
                (EnablePluggableDatabaseManagementDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.privateEndPointId, other.privateEndPointId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.sslSecretId, other.sslSecretId)
                && java.util.Objects.equals(this.role, other.role)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndPointId == null ? 43 : this.privateEndPointId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.sslSecretId == null ? 43 : this.sslSecretId.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
