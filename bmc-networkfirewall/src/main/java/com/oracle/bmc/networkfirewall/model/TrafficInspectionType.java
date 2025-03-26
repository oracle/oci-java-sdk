/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Type of inspection to affect the Traffic flow. This is only applicable if action is INSPECT.
 * <p>
 * INTRUSION_DETECTION - Intrusion Detection.
 *   * INTRUSION_PREVENTION - Intrusion Detection and Prevention. Traffic classified as potentially malicious will be rejected as described in {@code type}.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public enum TrafficInspectionType {
    IntrusionDetection("INTRUSION_DETECTION"),
    IntrusionPrevention("INTRUSION_PREVENTION"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TrafficInspectionType.class);

    private final String value;
    private static java.util.Map<String, TrafficInspectionType> map;

    static {
        map = new java.util.HashMap<>();
        for (TrafficInspectionType v : TrafficInspectionType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    TrafficInspectionType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TrafficInspectionType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'TrafficInspectionType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
