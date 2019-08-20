/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.model;

/**
 * The start message of the stream archiver.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.extern.slf4j.Slf4j
public enum ArchiverStartPosition {
    Latest("LATEST"),
    TrimHorizon("TRIM_HORIZON"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, ArchiverStartPosition> map;

    static {
        map = new java.util.HashMap<>();
        for (ArchiverStartPosition v : ArchiverStartPosition.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ArchiverStartPosition(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ArchiverStartPosition create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ArchiverStartPosition', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
