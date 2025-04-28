/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Types of Action on the Traffic flow.
 *
 * <p>ALLOW - Allows the traffic. * DROP - Silently drops the traffic, e.g. without sending a TCP
 * reset. * REJECT - Rejects the traffic, sending a TCP reset to client and/or server as applicable.
 * * INSPECT - Inspects traffic for vulnerability as specified in {@code inspection}, which may
 * result in rejection.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public enum TrafficActionType implements com.oracle.bmc.http.internal.BmcEnum {
    Allow("ALLOW"),
    Drop("DROP"),
    Reject("REJECT"),
    Inspect("INSPECT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TrafficActionType.class);

    private final String value;
    private static java.util.Map<String, TrafficActionType> map;

    static {
        map = new java.util.HashMap<>();
        for (TrafficActionType v : TrafficActionType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    TrafficActionType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TrafficActionType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'TrafficActionType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
