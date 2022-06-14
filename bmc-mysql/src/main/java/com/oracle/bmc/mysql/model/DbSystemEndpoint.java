/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * A particular functional endpoint for access to a DB System, and the properties that apply to it.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystemEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbSystemEndpoint {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostname",
        "ipAddress",
        "port",
        "portX",
        "modes",
        "status",
        "statusDetails"
    })
    public DbSystemEndpoint(
            String hostname,
            String ipAddress,
            Integer port,
            Integer portX,
            java.util.List<Modes> modes,
            Status status,
            String statusDetails) {
        super();
        this.hostname = hostname;
        this.ipAddress = ipAddress;
        this.port = port;
        this.portX = portX;
        this.modes = modes;
        this.status = status;
        this.statusDetails = statusDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The network address of the DB System.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The network address of the DB System.
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * The IP address the DB System is configured to listen on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address the DB System is configured to listen on.
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The port the MySQL instance listens on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port the MySQL instance listens on.
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The network port where to connect to use this endpoint using the X protocol.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("portX")
        private Integer portX;

        /**
         * The network port where to connect to use this endpoint using the X protocol.
         * @param portX the value to set
         * @return this builder
         **/
        public Builder portX(Integer portX) {
            this.portX = portX;
            this.__explicitlySet__.add("portX");
            return this;
        }
        /**
         * The access modes from the client that this endpoint supports.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modes")
        private java.util.List<Modes> modes;

        /**
         * The access modes from the client that this endpoint supports.
         * @param modes the value to set
         * @return this builder
         **/
        public Builder modes(java.util.List<Modes> modes) {
            this.modes = modes;
            this.__explicitlySet__.add("modes");
            return this;
        }
        /**
         * The state of the endpoints, as far as it can seen from the DB System.
         * There may be some inconsistency with the actual state of the MySQL service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The state of the endpoints, as far as it can seen from the DB System.
         * There may be some inconsistency with the actual state of the MySQL service.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Additional information about the current endpoint status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
        private String statusDetails;

        /**
         * Additional information about the current endpoint status.
         * @param statusDetails the value to set
         * @return this builder
         **/
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = statusDetails;
            this.__explicitlySet__.add("statusDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemEndpoint build() {
            DbSystemEndpoint __instance__ =
                    new DbSystemEndpoint(
                            hostname, ipAddress, port, portX, modes, status, statusDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemEndpoint o) {
            Builder copiedBuilder =
                    hostname(o.getHostname())
                            .ipAddress(o.getIpAddress())
                            .port(o.getPort())
                            .portX(o.getPortX())
                            .modes(o.getModes())
                            .status(o.getStatus())
                            .statusDetails(o.getStatusDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The network address of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The network address of the DB System.
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * The IP address the DB System is configured to listen on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address the DB System is configured to listen on.
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The port the MySQL instance listens on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port the MySQL instance listens on.
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * The network port where to connect to use this endpoint using the X protocol.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portX")
    private final Integer portX;

    /**
     * The network port where to connect to use this endpoint using the X protocol.
     * @return the value
     **/
    public Integer getPortX() {
        return portX;
    }

    /**
     **/
    public enum Modes {
        Read("READ"),
        Write("WRITE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Modes.class);

        private final String value;
        private static java.util.Map<String, Modes> map;

        static {
            map = new java.util.HashMap<>();
            for (Modes v : Modes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Modes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Modes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Modes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The access modes from the client that this endpoint supports.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modes")
    private final java.util.List<Modes> modes;

    /**
     * The access modes from the client that this endpoint supports.
     * @return the value
     **/
    public java.util.List<Modes> getModes() {
        return modes;
    }

    /**
     * The state of the endpoints, as far as it can seen from the DB System.
     * There may be some inconsistency with the actual state of the MySQL service.
     *
     **/
    public enum Status {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the endpoints, as far as it can seen from the DB System.
     * There may be some inconsistency with the actual state of the MySQL service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The state of the endpoints, as far as it can seen from the DB System.
     * There may be some inconsistency with the actual state of the MySQL service.
     *
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Additional information about the current endpoint status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    private final String statusDetails;

    /**
     * Additional information about the current endpoint status.
     * @return the value
     **/
    public String getStatusDetails() {
        return statusDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbSystemEndpoint(");
        sb.append("hostname=").append(String.valueOf(this.hostname));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", portX=").append(String.valueOf(this.portX));
        sb.append(", modes=").append(String.valueOf(this.modes));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusDetails=").append(String.valueOf(this.statusDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemEndpoint)) {
            return false;
        }

        DbSystemEndpoint other = (DbSystemEndpoint) o;
        return java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.portX, other.portX)
                && java.util.Objects.equals(this.modes, other.modes)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDetails, other.statusDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.portX == null ? 43 : this.portX.hashCode());
        result = (result * PRIME) + (this.modes == null ? 43 : this.modes.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDetails == null ? 43 : this.statusDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
