/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Indicates the direction for lineage fetch. It is one of upstream (or source objects), downstream (or target
 * objects), both.
 * Corresponding enums are:
 * UPSTREAM   - Source objects.
 * DOWNSTREAM - Target objects.
 * BOTH       - Both source and target objects.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum LineageDirection {
    Upstream("UPSTREAM"),
    Both("BOTH"),
    Downstream("DOWNSTREAM"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LineageDirection.class);

    private final String value;
    private static java.util.Map<String, LineageDirection> map;

    static {
        map = new java.util.HashMap<>();
        for (LineageDirection v : LineageDirection.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    LineageDirection(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LineageDirection create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'LineageDirection', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
