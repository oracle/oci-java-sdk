/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystemEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DbSystemEndpoint {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("portX")
        private Integer portX;

        public Builder portX(Integer portX) {
            this.portX = portX;
            this.__explicitlySet__.add("portX");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modes")
        private java.util.List<Modes> modes;

        public Builder modes(java.util.List<Modes> modes) {
            this.modes = modes;
            this.__explicitlySet__.add("modes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
        private String statusDetails;

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

    /**
     * The network address of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * The IP address the DB System is configured to listen on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    String ipAddress;

    /**
     * The port the MySQL instance listens on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * The network port where to connect to use this endpoint using the X protocol.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portX")
    Integer portX;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Modes {
        Read("READ"),
        Write("WRITE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    java.util.List<Modes> modes;
    /**
     * The state of the endpoints, as far as it can seen from the DB System.
     * There may be some inconsistency with the actual state of the MySQL service.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    Status status;

    /**
     * Additional information about the current endpoint status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    String statusDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
