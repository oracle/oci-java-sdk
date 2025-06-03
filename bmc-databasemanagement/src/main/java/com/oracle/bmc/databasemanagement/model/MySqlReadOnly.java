/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * If the value is ON, the instance is configured as read_only. If the value is SUPER, the instance
 * is configured as super_read_only. If the value is OFF, the instance is neither read_only nor
 * super_read_only.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum MySqlReadOnly implements com.oracle.bmc.http.internal.BmcEnum {
    On("ON"),
    Super("SUPER"),
    Off("OFF"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MySqlReadOnly.class);

    private final String value;
    private static java.util.Map<String, MySqlReadOnly> map;

    static {
        map = new java.util.HashMap<>();
        for (MySqlReadOnly v : MySqlReadOnly.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MySqlReadOnly(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MySqlReadOnly create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MySqlReadOnly', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
