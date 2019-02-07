/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The protocols for ping probes.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.extern.slf4j.Slf4j
public enum PingProbeProtocol {
    Icmp("ICMP"),
    Tcp("TCP"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, PingProbeProtocol> map;

    static {
        map = new java.util.HashMap<>();
        for (PingProbeProtocol v : PingProbeProtocol.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    PingProbeProtocol(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public static PingProbeProtocol create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'PingProbeProtocol', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
