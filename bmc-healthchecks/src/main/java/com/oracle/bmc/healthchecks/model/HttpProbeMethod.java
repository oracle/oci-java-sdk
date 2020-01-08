/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The supported HTTP methods available for probes.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.extern.slf4j.Slf4j
public enum HttpProbeMethod {
    Get("GET"),
    Head("HEAD"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, HttpProbeMethod> map;

    static {
        map = new java.util.HashMap<>();
        for (HttpProbeMethod v : HttpProbeMethod.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    HttpProbeMethod(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static HttpProbeMethod create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'HttpProbeMethod', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
