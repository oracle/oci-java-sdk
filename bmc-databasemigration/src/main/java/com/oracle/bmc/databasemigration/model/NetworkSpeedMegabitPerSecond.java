/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Possible network speed values.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum NetworkSpeedMegabitPerSecond {
    Mbps10("MBPS_10"),
    Mbps100("MBPS_100"),
    Mbps1000("MBPS_1000"),
    Mbps2500("MBPS_2500"),
    Mbps5000("MBPS_5000"),
    Mbps10000("MBPS_10000"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NetworkSpeedMegabitPerSecond.class);

    private final String value;
    private static java.util.Map<String, NetworkSpeedMegabitPerSecond> map;

    static {
        map = new java.util.HashMap<>();
        for (NetworkSpeedMegabitPerSecond v : NetworkSpeedMegabitPerSecond.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    NetworkSpeedMegabitPerSecond(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static NetworkSpeedMegabitPerSecond create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'NetworkSpeedMegabitPerSecond', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
