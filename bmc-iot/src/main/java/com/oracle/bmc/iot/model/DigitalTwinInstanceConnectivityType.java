/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * Connectivity type of the digital twin instance. Possible values are:
 *   DIRECT - The instance connects directly to the cloud.
 *   INDIRECT - The instance connects to the cloud through a gateway.
 *   GATEWAY - The instance acts as a gateway and relays data from other instances.
 *   NONE - The instance is not expected to have any connectivity.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public enum DigitalTwinInstanceConnectivityType {
    Direct("DIRECT"),
    Indirect("INDIRECT"),
    Gateway("GATEWAY"),
    None("NONE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DigitalTwinInstanceConnectivityType.class);

    private final String value;
    private static java.util.Map<String, DigitalTwinInstanceConnectivityType> map;

    static {
        map = new java.util.HashMap<>();
        for (DigitalTwinInstanceConnectivityType v : DigitalTwinInstanceConnectivityType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DigitalTwinInstanceConnectivityType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DigitalTwinInstanceConnectivityType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DigitalTwinInstanceConnectivityType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
