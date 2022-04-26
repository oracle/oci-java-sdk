/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * External service target that internal virtual services direct traffic to.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalServiceAccessPolicyTarget.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExternalServiceAccessPolicyTarget extends AccessPolicyTarget {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
        private java.util.List<String> hostnames;

        public Builder hostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            this.__explicitlySet__.add("hostnames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
        private java.util.List<String> ipAddresses;

        public Builder ipAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            this.__explicitlySet__.add("ipAddresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ports")
        private java.util.List<Integer> ports;

        public Builder ports(java.util.List<Integer> ports) {
            this.ports = ports;
            this.__explicitlySet__.add("ports");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalServiceAccessPolicyTarget build() {
            ExternalServiceAccessPolicyTarget __instance__ =
                    new ExternalServiceAccessPolicyTarget(hostnames, ipAddresses, ports, protocol);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalServiceAccessPolicyTarget o) {
            Builder copiedBuilder =
                    hostnames(o.getHostnames())
                            .ipAddresses(o.getIpAddresses())
                            .ports(o.getPorts())
                            .protocol(o.getProtocol());

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

    @Deprecated
    public ExternalServiceAccessPolicyTarget(
            java.util.List<String> hostnames,
            java.util.List<String> ipAddresses,
            java.util.List<Integer> ports,
            Protocol protocol) {
        super();
        this.hostnames = hostnames;
        this.ipAddresses = ipAddresses;
        this.ports = ports;
        this.protocol = protocol;
    }

    /**
     * The hostnames of the external service. Only applicable for HTTP and HTTPS protocols.
     * Wildcard hostnames are supported in the prefix form.
     * Examples of valid hostnames are "www.example.com", "*.example.com", "*.com", "*".
     * Hostname "*" can be used to allow all hosts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
    java.util.List<String> hostnames;

    /**
     * The ipAddresses of the external service in CIDR notation. Only applicable for TCP protocol.
     * All requests matching the given CIDR notation will pass through.
     * In case a wildcard CIDR "0.0.0.0/0" is provided, the same port cannot be used for a virtual service communication.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
    java.util.List<String> ipAddresses;

    /**
     * Ports exposed by an external service. If left empty all ports will be allowed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    java.util.List<Integer> ports;
    /**
     * Protocol of the external service
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Protocol {
        Http("HTTP"),
        Https("HTTPS"),
        Tcp("TCP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Protocol of the external service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    Protocol protocol;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
