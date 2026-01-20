/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/** Allowed values for stream cursor types. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public enum StreamCursorTypes implements com.oracle.bmc.http.internal.BmcEnum {
    Default("DEFAULT"),
    TrimHorizon("TRIM_HORIZON"),
    Latest("LATEST"),
    AtTime("AT_TIME"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StreamCursorTypes.class);

    private final String value;
    private static java.util.Map<String, StreamCursorTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (StreamCursorTypes v : StreamCursorTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    StreamCursorTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static StreamCursorTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'StreamCursorTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
